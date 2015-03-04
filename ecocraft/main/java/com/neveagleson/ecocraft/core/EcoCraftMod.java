package com.neveagleson.ecocraft.core;

import com.neveagleson.ecocraft.core.config.Config;
import com.neveagleson.ecocraft.core.registry.ECBlocks;
import com.neveagleson.ecocraft.core.registry.ECFluids;
import com.neveagleson.ecocraft.core.registry.ECPotions;
import com.neveagleson.ecocraft.core.utility.Log;
import com.neveagleson.ecocraft.core.proxy.CommonProxy;
import com.neveagleson.ecocraft.core.registry.ECItems;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.potion.Potion;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by NevEagleson on 4/02/2015.
 */
@Mod(modid=ModConstants.MOD_ID,name=ModConstants.MOD_NAME,version=ModConstants.VERSION)
public class EcoCraftMod
{
    @Mod.Instance(ModConstants.MOD_ID)
    public static EcoCraftMod instance;

    @SidedProxy(modId=ModConstants.MOD_ID, clientSide= ModConstants.CLIENT_PROXY_CLASS, serverSide = ModConstants.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Config.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new Config());

        //Increase Potion array size
        Potion[] potionTypes = null;
        for (Field f : Potion.class.getDeclaredFields())
        {
            f.setAccessible(true);
            try
            {
                if (f.getName().equals("potionTypes") || f.getName().equals("field_76425_a"))
                {
                    Field modfield = Field.class.getDeclaredField("modifiers");
                    modfield.setAccessible(true);
                    modfield.setInt(f, f.getModifiers() & ~Modifier.FINAL);
                    potionTypes = (Potion[]) f.get(null);
                    if(potionTypes.length < 256)
                    {
                        final Potion[] newPotionTypes = new Potion[256];
                        System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
                        f.set(null, newPotionTypes);
                    }
                }
            } catch (Exception e)
            {
                System.err.println("Severe error, please report this to the mod author:");
                System.err.println(e);
            }
        }

        ECFluids.preinit();
        ECPotions.preInit();
        ECBlocks.preInit();
        ECItems.preInit();

        proxy.preInit();
        Log.info("Pre Initialization Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        ECFluids.init();
        ECPotions.init();
        ECBlocks.init();
        ECItems.init();

        proxy.init();
        Log.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        ECFluids.postInit();
        ECPotions.postInit();
        ECBlocks.postInit();
        ECItems.postInit();

        proxy.postInit();
        Log.info("Post Initialization Complete");
    }
}

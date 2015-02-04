package com.neveagleson.ecocraft.core;

import com.neveagleson.ecocraft.core.config.Config;
import com.neveagleson.ecocraft.core.utility.Log;
import com.neveagleson.ecocraft.core.proxy.CommonProxy;
import com.neveagleson.ecocraft.core.registry.ECItems;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

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

        ECItems.register();

        proxy.preInit();
        Log.info("Pre Initialization Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
        Log.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
        Log.info("Post Initialization Complete");
    }
}

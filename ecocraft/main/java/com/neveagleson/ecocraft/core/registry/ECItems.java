package com.neveagleson.ecocraft.core.registry;

import com.neveagleson.ecocraft.core.ModConstants;
import com.neveagleson.ecocraft.core.fluids.BucketHandler;
import com.neveagleson.ecocraft.core.items.BaseBucket;
import com.neveagleson.ecocraft.core.items.BaseItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;

/**
 * Created by NevEagleson on 4/02/2015
 */
@GameRegistry.ObjectHolder(ModConstants.MOD_ID)
public class ECItems
{
    public static BaseBucket blueEcoBucket;
    public static void preInit()
    {
        blueEcoBucket = new BaseBucket(ECBlocks.blueEco,"blueEcoBucket");
        GameRegistry.registerItem(blueEcoBucket,blueEcoBucket.getSimpleName(),ModConstants.MOD_ID);
    }

    public static void init()
    {
        BucketHandler.registerBucket(ECBlocks.blueEco, blueEcoBucket);

        FluidContainerRegistry.registerFluidContainer(ECFluids.blueEco, new ItemStack(blueEcoBucket), FluidContainerRegistry.EMPTY_BUCKET);

    }

    public static void postInit()
    {

    }
}

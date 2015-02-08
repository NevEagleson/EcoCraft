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
    public static BaseBucket greenEcoBucket;
    public static BaseBucket yellowEcoBucket;
    public static BaseBucket redEcoBucket;
    public static BaseBucket darkEcoBucket;
    public static BaseBucket lightEcoBucket;
    
    public static void preInit()
    {
        blueEcoBucket = new BaseBucket(ECBlocks.blueEco,"blueEcoBucket");
        GameRegistry.registerItem(blueEcoBucket,blueEcoBucket.getSimpleName(),ModConstants.MOD_ID);
        greenEcoBucket = new BaseBucket(ECBlocks.greenEco,"greenEcoBucket");
        GameRegistry.registerItem(greenEcoBucket,greenEcoBucket.getSimpleName(),ModConstants.MOD_ID);
        yellowEcoBucket = new BaseBucket(ECBlocks.yellowEco,"yellowEcoBucket");
        GameRegistry.registerItem(yellowEcoBucket,yellowEcoBucket.getSimpleName(),ModConstants.MOD_ID);
        redEcoBucket = new BaseBucket(ECBlocks.redEco,"redEcoBucket");
        GameRegistry.registerItem(redEcoBucket,redEcoBucket.getSimpleName(),ModConstants.MOD_ID);
        darkEcoBucket = new BaseBucket(ECBlocks.darkEco,"darkEcoBucket");
        GameRegistry.registerItem(darkEcoBucket,darkEcoBucket.getSimpleName(),ModConstants.MOD_ID);
        lightEcoBucket = new BaseBucket(ECBlocks.lightEco,"lightEcoBucket");
        GameRegistry.registerItem(lightEcoBucket,lightEcoBucket.getSimpleName(),ModConstants.MOD_ID);
    }

    public static void init()
    {
        BucketHandler.registerBucket(ECBlocks.blueEco, blueEcoBucket);
        FluidContainerRegistry.registerFluidContainer(ECFluids.blueEco, new ItemStack(blueEcoBucket), FluidContainerRegistry.EMPTY_BUCKET);
        BucketHandler.registerBucket(ECBlocks.greenEco, greenEcoBucket);
        FluidContainerRegistry.registerFluidContainer(ECFluids.greenEco, new ItemStack(greenEcoBucket), FluidContainerRegistry.EMPTY_BUCKET);
        BucketHandler.registerBucket(ECBlocks.yellowEco, yellowEcoBucket);
        FluidContainerRegistry.registerFluidContainer(ECFluids.yellowEco, new ItemStack(yellowEcoBucket), FluidContainerRegistry.EMPTY_BUCKET);
        BucketHandler.registerBucket(ECBlocks.redEco, redEcoBucket);
        FluidContainerRegistry.registerFluidContainer(ECFluids.redEco, new ItemStack(redEcoBucket), FluidContainerRegistry.EMPTY_BUCKET);
        BucketHandler.registerBucket(ECBlocks.darkEco, darkEcoBucket);
        FluidContainerRegistry.registerFluidContainer(ECFluids.darkEco, new ItemStack(darkEcoBucket), FluidContainerRegistry.EMPTY_BUCKET);
        BucketHandler.registerBucket(ECBlocks.lightEco, lightEcoBucket);
        FluidContainerRegistry.registerFluidContainer(ECFluids.lightEco, new ItemStack(lightEcoBucket), FluidContainerRegistry.EMPTY_BUCKET);

    }

    public static void postInit()
    {

    }
}

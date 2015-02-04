package com.neveagleson.ecocraft.core.registry;

import com.neveagleson.ecocraft.core.ModConstants;
import com.neveagleson.ecocraft.core.blocks.BaseFluidBlock;
import com.neveagleson.ecocraft.core.fluids.BaseFluid;
import com.neveagleson.ecocraft.core.items.BaseBucket;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * Created by NevEagleson on 4/02/2015
 */
@GameRegistry.ObjectHolder(ModConstants.MOD_ID)
public class ECFluids
{
    public static final BaseFluid BLUE_ECO_FLUID = new BaseFluid("blueEco");
    public static final BaseFluidBlock BLUE_ECO_FLUID_BLOCK = new BaseFluidBlock(BLUE_ECO_FLUID);
    public static final BaseBucket BLUE_ECO_BUCKET = new BaseBucket(BLUE_ECO_FLUID_BLOCK,"blueEcoBucket");

    public static void register()
    {
        FluidRegistry.registerFluid(BLUE_ECO_FLUID);
        GameRegistry.registerBlock(BLUE_ECO_FLUID_BLOCK,BLUE_ECO_FLUID_BLOCK.getSimpleName());
        GameRegistry.registerItem(BLUE_ECO_BUCKET, BLUE_ECO_BUCKET.getSimpleName(), ModConstants.MOD_ID);
        FluidContainerRegistry.registerFluidContainer(BLUE_ECO_FLUID,new ItemStack(BLUE_ECO_BUCKET),new ItemStack(Items.bucket));
    }
}

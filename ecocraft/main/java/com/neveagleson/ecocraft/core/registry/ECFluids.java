package com.neveagleson.ecocraft.core.registry;

import com.neveagleson.ecocraft.core.ModConstants;
import com.neveagleson.ecocraft.core.blocks.BaseFluidBlock;
import com.neveagleson.ecocraft.core.fluids.BaseFluid;
import com.neveagleson.ecocraft.core.fluids.BucketHandler;
import com.neveagleson.ecocraft.core.items.BaseBucket;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * Created by NevEagleson on 4/02/2015
 */
@GameRegistry.ObjectHolder(ModConstants.MOD_ID)
public class ECFluids
{
    public static BaseFluid blueEco;

    public static void preinit()
    {
        //Register Fluids
        blueEco = new BaseFluid("blueEco");
        FluidRegistry.registerFluid(blueEco);
    }

    public static void init()
    {

    }

    public static void postInit()
    {

    }
}

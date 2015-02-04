package com.neveagleson.ecocraft.core.registry;

import com.neveagleson.ecocraft.core.blocks.BaseFluidBlock;
import com.neveagleson.ecocraft.core.items.BaseBucket;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by NevEagleson on 4/02/2015
 */
public class ECBlocks
{
    public static BaseFluidBlock blueEco;

    public static void preInit()
    {
        blueEco = new BaseFluidBlock(ECFluids.blueEco);
        GameRegistry.registerBlock(blueEco, blueEco.getSimpleName());
        ItemStack blueEcoStack = new ItemStack(blueEco);
        OreDictionary.registerOre("fluidEco",blueEcoStack);
        OreDictionary.registerOre("fluidColoredEco",blueEcoStack);
    }

    public static void init()
    {

    }

    public static void postInit()
    {

    }
}

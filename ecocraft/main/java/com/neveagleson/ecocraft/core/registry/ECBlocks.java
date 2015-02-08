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
    public static BaseFluidBlock greenEco;
    public static BaseFluidBlock yellowEco;
    public static BaseFluidBlock redEco;
    public static BaseFluidBlock darkEco;
    public static BaseFluidBlock lightEco;
    
    public static String OREDICT_FLUID_ECO = "fluidEco";
    public static String OREDICT_FLUID_COLORED_ECO = "fluidColoredEco";

    public static String OREDICT_SOLID_ECO = "solidEco";
    public static String OREDICT_SOLID_COLORED_ECO = "solidColoredEco";

    public static void preInit()
    {
        blueEco = new BaseFluidBlock(ECFluids.blueEco);
        GameRegistry.registerBlock(blueEco, blueEco.getSimpleName());
        ItemStack blueEcoStack = new ItemStack(blueEco);
        OreDictionary.registerOre(OREDICT_FLUID_ECO,blueEcoStack);
        OreDictionary.registerOre(OREDICT_FLUID_COLORED_ECO,blueEcoStack);

        greenEco = new BaseFluidBlock(ECFluids.greenEco);
        GameRegistry.registerBlock(greenEco, greenEco.getSimpleName());
        ItemStack greenEcoStack = new ItemStack(greenEco);
        OreDictionary.registerOre(OREDICT_FLUID_ECO,greenEcoStack);
        OreDictionary.registerOre(OREDICT_FLUID_COLORED_ECO,greenEcoStack);

        yellowEco = new BaseFluidBlock(ECFluids.yellowEco);
        GameRegistry.registerBlock(yellowEco, yellowEco.getSimpleName());
        ItemStack yellowEcoStack = new ItemStack(yellowEco);
        OreDictionary.registerOre(OREDICT_FLUID_ECO,yellowEcoStack);
        OreDictionary.registerOre(OREDICT_FLUID_COLORED_ECO,yellowEcoStack);

        redEco = new BaseFluidBlock(ECFluids.redEco);
        GameRegistry.registerBlock(redEco, redEco.getSimpleName());
        ItemStack redEcoStack = new ItemStack(redEco);
        OreDictionary.registerOre(OREDICT_FLUID_ECO,redEcoStack);
        OreDictionary.registerOre(OREDICT_FLUID_COLORED_ECO,redEcoStack);

        darkEco = new BaseFluidBlock(ECFluids.darkEco);
        GameRegistry.registerBlock(darkEco, darkEco.getSimpleName());
        ItemStack darkEcoStack = new ItemStack(darkEco);
        OreDictionary.registerOre(OREDICT_FLUID_ECO,darkEcoStack);
        OreDictionary.registerOre(OREDICT_FLUID_COLORED_ECO,darkEcoStack);

        lightEco = new BaseFluidBlock(ECFluids.lightEco);
        GameRegistry.registerBlock(lightEco, lightEco.getSimpleName());
        ItemStack lightEcoStack = new ItemStack(lightEco);
        OreDictionary.registerOre(OREDICT_FLUID_ECO,lightEcoStack);
        OreDictionary.registerOre(OREDICT_FLUID_COLORED_ECO,lightEcoStack);
    }

    public static void init()
    {

    }

    public static void postInit()
    {

    }
}

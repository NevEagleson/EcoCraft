package com.neveagleson.ecocraft.core.registry;

import com.neveagleson.ecocraft.core.ModConstants;
import com.neveagleson.ecocraft.core.blocks.BaseFluidBlock;
import com.neveagleson.ecocraft.core.items.BaseBucket;
import com.neveagleson.ecocraft.core.utility.EntityFilter;
import com.neveagleson.ecocraft.core.utility.MobEntityFilter;
import com.neveagleson.ecocraft.core.utility.PlayerEntityFilter;
import com.neveagleson.ecocraft.core.utility.PotionEffectEntityFilter;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
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
        EntityFilter affectAll = new EntityFilter();
        EntityFilter affectMobs = new MobEntityFilter();
        EntityFilter affectFriendly = new MobEntityFilter().negate();
        EntityFilter affectPlayer = new PlayerEntityFilter();

        blueEco = new BaseFluidBlock(ECFluids.blueEco);
        blueEco.addPotionEffect(affectPlayer, new PotionEffect(ECPotions.blueEcoPotion.id, 60 * ModConstants.TICKS_PER_SEC, 1));
        blueEco.addPotionEffect(affectAll, new PotionEffect(Potion.moveSpeed.id, 60 * ModConstants.TICKS_PER_SEC, 1));
        GameRegistry.registerBlock(blueEco, blueEco.getSimpleName());
        ItemStack blueEcoStack = new ItemStack(blueEco);
        OreDictionary.registerOre(OREDICT_FLUID_ECO,blueEcoStack);
        OreDictionary.registerOre(OREDICT_FLUID_COLORED_ECO,blueEcoStack);

        greenEco = new BaseFluidBlock(ECFluids.greenEco);
        greenEco.addPotionEffect(affectPlayer, new PotionEffect(ECPotions.greenEcoPotion.id, 60 * ModConstants.TICKS_PER_SEC, 1));
        greenEco.addPotionEffect(affectFriendly, new PotionEffect(Potion.regeneration.id, 10 * ModConstants.TICKS_PER_SEC, 0));
        GameRegistry.registerBlock(greenEco, greenEco.getSimpleName());
        ItemStack greenEcoStack = new ItemStack(greenEco);
        OreDictionary.registerOre(OREDICT_FLUID_ECO,greenEcoStack);
        OreDictionary.registerOre(OREDICT_FLUID_COLORED_ECO,greenEcoStack);

        yellowEco = new BaseFluidBlock(ECFluids.yellowEco);
        yellowEco.addPotionEffect(affectPlayer, new PotionEffect(ECPotions.yellowEcoPotion.id, 60 * ModConstants.TICKS_PER_SEC, 1));
        yellowEco.addPotionEffect(affectAll, new PotionEffect(Potion.fireResistance.id, 60 * ModConstants.TICKS_PER_SEC, 1));
        GameRegistry.registerBlock(yellowEco, yellowEco.getSimpleName());
        ItemStack yellowEcoStack = new ItemStack(yellowEco);
        OreDictionary.registerOre(OREDICT_FLUID_ECO,yellowEcoStack);
        OreDictionary.registerOre(OREDICT_FLUID_COLORED_ECO,yellowEcoStack);

        redEco = new BaseFluidBlock(ECFluids.redEco);
        redEco.addPotionEffect(affectPlayer, new PotionEffect(ECPotions.redEcoPotion.id, 60 * ModConstants.TICKS_PER_SEC, 1));
        redEco.addPotionEffect(affectAll, new PotionEffect(Potion.damageBoost.id, 60 * ModConstants.TICKS_PER_SEC, 1));
        GameRegistry.registerBlock(redEco, redEco.getSimpleName());
        ItemStack redEcoStack = new ItemStack(redEco);
        OreDictionary.registerOre(OREDICT_FLUID_ECO,redEcoStack);
        OreDictionary.registerOre(OREDICT_FLUID_COLORED_ECO,redEcoStack);

        darkEco = new BaseFluidBlock(ECFluids.darkEco);
        darkEco.addPotionEffect(affectPlayer, new PotionEffect(ECPotions.darkEcoPotion.id, 10 * ModConstants.TICKS_PER_SEC, 1));
        darkEco.addPotionEffect(affectAll, new PotionEffect(Potion.wither.id, 10 * ModConstants.TICKS_PER_SEC, 1));
        darkEco.addPotionEffect(affectAll, new PotionEffect(Potion.poison.id, 10 * ModConstants.TICKS_PER_SEC, 1));
        darkEco.addPotionEffect(affectAll, new PotionEffect(Potion.hunger.id, 10 * ModConstants.TICKS_PER_SEC, 0));
        darkEco.addPotionEffect(affectAll, new PotionEffect(Potion.blindness.id, 10 * ModConstants.TICKS_PER_SEC, 0));
        GameRegistry.registerBlock(darkEco, darkEco.getSimpleName());
        ItemStack darkEcoStack = new ItemStack(darkEco);
        OreDictionary.registerOre(OREDICT_FLUID_ECO,darkEcoStack);

        lightEco = new BaseFluidBlock(ECFluids.lightEco);
        lightEco.addPotionEffect(affectPlayer, new PotionEffect(ECPotions.lightEcoPotion.id, 10 * ModConstants.TICKS_PER_SEC, 1));
        lightEco.addPotionEffect(affectFriendly, new PotionEffect(Potion.regeneration.id, 10 * ModConstants.TICKS_PER_SEC, 1));
        lightEco.addPotionEffect(affectFriendly, new PotionEffect(Potion.damageBoost.id, 10 * ModConstants.TICKS_PER_SEC, 1));
        lightEco.addPotionEffect(affectMobs, new PotionEffect(Potion.poison.id, 10 * ModConstants.TICKS_PER_SEC, 1));
        lightEco.addPotionEffect(affectMobs, new PotionEffect(Potion.weakness.id, 10 * ModConstants.TICKS_PER_SEC, 1));
        GameRegistry.registerBlock(lightEco, lightEco.getSimpleName());
        ItemStack lightEcoStack = new ItemStack(lightEco);
        OreDictionary.registerOre(OREDICT_FLUID_ECO,lightEcoStack);
    }

    public static void init()
    {

    }

    public static void postInit()
    {

    }
}

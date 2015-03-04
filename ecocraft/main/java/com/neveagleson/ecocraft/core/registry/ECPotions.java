package com.neveagleson.ecocraft.core.registry;

import com.neveagleson.ecocraft.core.config.Config;
import com.neveagleson.ecocraft.core.potion.BasePotion;
import net.minecraft.potion.Potion;

/**
 * Created by NevEagleson on 4/03/2015
 */
public class ECPotions
{
    public static BasePotion blueEcoPotion;
    public static BasePotion greenEcoPotion;
    public static BasePotion redEcoPotion;
    public static BasePotion yellowEcoPotion;
    public static BasePotion darkEcoPotion;
    public static BasePotion lightEcoPotion;

    public static void preInit()
    {
        int potion_id = Config.STARTING_POTION_ID;
        blueEcoPotion = new BasePotion(potion_id++, "blueEco", false, 0x00B2E9);
        greenEcoPotion = new BasePotion(potion_id++, "greenEco", false, 0x67DE59);
        redEcoPotion = new BasePotion(potion_id++, "redEco", false, 0xEF4023);
        yellowEcoPotion = new BasePotion(potion_id++, "yellowEco", false, 0xFEEF39);
        darkEcoPotion = new BasePotion(potion_id++, "darkEco", false, 0x6C2A80);
        lightEcoPotion = new BasePotion(potion_id++, "lightEco", false, 0xBAD8F2);
    }

    public static void init()
    {


    }

    public static void postInit()
    {


    }
}

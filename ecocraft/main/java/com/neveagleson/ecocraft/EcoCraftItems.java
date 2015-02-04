package com.neveagleson.ecocraft;

import com.neveagleson.ecocraft.items.BaseItem;
import com.neveagleson.ecocraft.items.EcoBucket;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by NevEagleson on 4/02/2015
 */
public class EcoCraftItems
{
    public static final BaseItem ECO_BUCKET = new EcoBucket();
    public static void register()
    {
        GameRegistry.registerItem(ECO_BUCKET,ECO_BUCKET.getSimpleName(),ModConstants.MOD_ID);
    }
}

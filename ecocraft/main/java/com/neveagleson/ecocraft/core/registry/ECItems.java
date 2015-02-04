package com.neveagleson.ecocraft.core.registry;

import com.neveagleson.ecocraft.core.ModConstants;
import com.neveagleson.ecocraft.core.items.BaseItem;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by NevEagleson on 4/02/2015
 */
@GameRegistry.ObjectHolder(ModConstants.MOD_ID)
public class ECItems
{
    public static final BaseItem ECO_BUCKET = new EcoBucket("ecoBucket");
    public static void register()
    {
        GameRegistry.registerItem(ECO_BUCKET,ECO_BUCKET.getSimpleName(),ModConstants.MOD_ID);
    }
}

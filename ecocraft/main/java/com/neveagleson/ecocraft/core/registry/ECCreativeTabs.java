package com.neveagleson.ecocraft.core.registry;

import com.neveagleson.ecocraft.core.ModConstants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by NevEagleson on 4/02/2015
 */
public class ECCreativeTabs
{
    public static final CreativeTabs ECO_CRAFT = new CreativeTabs(ModConstants.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ECItems.blueEcoBucket;
        }
    };
}

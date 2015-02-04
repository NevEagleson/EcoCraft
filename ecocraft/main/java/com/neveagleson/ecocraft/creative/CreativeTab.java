package com.neveagleson.ecocraft.creative;

import com.neveagleson.ecocraft.ModConstants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by NevEagleson on 4/02/2015
 */
public class CreativeTab extends CreativeTabs
{
    public static CreativeTabs instance;

    public CreativeTab()
    {
        super(ModConstants.MOD_NAME);
    }

    @Override
    public Item getTabIconItem()
    {
        return null;
    }
}

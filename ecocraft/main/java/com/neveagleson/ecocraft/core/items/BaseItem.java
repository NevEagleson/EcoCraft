package com.neveagleson.ecocraft.core.items;

import com.neveagleson.ecocraft.core.ModConstants;
import com.neveagleson.ecocraft.core.registry.ECCreativeTabs;
import com.neveagleson.ecocraft.core.utility.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
 * Created by NevEagleson on 4/02/2015
 */
public class BaseItem extends Item
{
    public static int STACKSIZE_SINGLE = 1;
    public static int STACKSIZE_SMALL = 16;
    public static int STACKSIZE_FULL = 64;

    protected String simpleName;

    public BaseItem(String name)
    {
        super();
        maxStackSize = STACKSIZE_SINGLE;
        setCreativeTab(ECCreativeTabs.ECO_CRAFT);
        setNoRepair();
        simpleName = name;
        this.setUnlocalizedName(simpleName);
    }

    public String getSimpleName()
    {
        return simpleName;
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", ModConstants.RESOURCE_PREFIX, Names.UnwrapUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(getUnlocalizedName().substring(getUnlocalizedName().indexOf(".")+1));
    }
}

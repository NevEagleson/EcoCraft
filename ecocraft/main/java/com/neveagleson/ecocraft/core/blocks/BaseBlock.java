package com.neveagleson.ecocraft.core.blocks;

import com.neveagleson.ecocraft.core.ModConstants;
import com.neveagleson.ecocraft.core.registry.ECCreativeTabs;
import com.neveagleson.ecocraft.core.utility.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by NevEagleson on 4/02/2015
 */
public class BaseBlock extends Block
{
    protected String simpleName;

    public BaseBlock(Material material, String name)
    {
        super(material);
        simpleName = name;
        setBlockName(ModConstants.NAME_PREFIX + simpleName);
        setBlockTextureName(simpleName);
        setCreativeTab(ECCreativeTabs.ECO_CRAFT);
    }

    public BaseBlock(String name)
    {
        this(Material.rock, name);
    }

    public String getSimpleName()
    {
        return simpleName;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(ModConstants.RESOURCE_PREFIX + simpleName);
    }
}

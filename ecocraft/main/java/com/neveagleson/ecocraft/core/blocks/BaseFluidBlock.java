package com.neveagleson.ecocraft.core.blocks;

import com.neveagleson.ecocraft.core.ModConstants;
import com.neveagleson.ecocraft.core.fluids.BaseFluid;
import com.neveagleson.ecocraft.core.registry.ECCreativeTabs;
import com.neveagleson.ecocraft.core.utility.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

/**
 * Created by NevEagleson on 4/02/2015
 */
public class BaseFluidBlock extends BlockFluidClassic
{
    @SideOnly(Side.CLIENT)
    protected IIcon stillIcon;
    @SideOnly(Side.CLIENT)
    protected IIcon flowingIcon;

    protected String simpleName;

    public BaseFluidBlock(BaseFluid fluid, Material material)
    {
        super(fluid, material);
        simpleName = fluid.getSimpleName();
        setBlockName(ModConstants.NAME_PREFIX + "fluid." + simpleName);
        setCreativeTab(ECCreativeTabs.ECO_CRAFT);
    }

    public BaseFluidBlock(BaseFluid fluid)
    {
        this(fluid, Material.water);
    }

    public String getSimpleName()
    {
        return simpleName;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        stillIcon = iconRegister.registerIcon(String.format("%sfluid/%s_still",ModConstants.RESOURCE_PREFIX,simpleName));
        flowingIcon = iconRegister.registerIcon(String.format("%sfluid/%s_flowing",ModConstants.RESOURCE_PREFIX,simpleName));
    }

    @Override
    public IIcon getIcon(int side, int meta)
    {
        return side <= 1 ? stillIcon : flowingIcon;
    }

    @Override
    public boolean canDisplace(IBlockAccess world, int x, int y, int z)
    {
        if(world.getBlock(x,y,z).getMaterial().isLiquid()) return false;
        return super.canDisplace(world,x,y,z);
    }

    @Override
    public boolean displaceIfPossible(World world, int x, int y, int z)
    {
        if(world.getBlock(x,y,z).getMaterial().isLiquid()) return false;
        return super.displaceIfPossible(world, x, y, z);
    }
}

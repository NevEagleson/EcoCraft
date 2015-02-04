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
        setBlockName(simpleName);
        setBlockTextureName(simpleName);
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
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", ModConstants.RESOURCE_PREFIX, Names.UnwrapUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        stillIcon = iconRegister.registerIcon(getUnlocalizedName().substring(getUnlocalizedName().indexOf(".")+1)+".still");
        flowingIcon = iconRegister.registerIcon(getUnlocalizedName().substring(getUnlocalizedName().indexOf(".")+1)+".flowing");
    }

    @Override
    public IIcon getIcon(int side, int meta)
    {
        return (side == 0 || side == 1) ? stillIcon : flowingIcon;
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

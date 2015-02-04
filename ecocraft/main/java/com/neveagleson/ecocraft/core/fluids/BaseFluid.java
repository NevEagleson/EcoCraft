package com.neveagleson.ecocraft.core.fluids;

import com.neveagleson.ecocraft.core.ModConstants;
import com.neveagleson.ecocraft.core.utility.Names;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by NevEagleson on 4/02/2015
 */
public class BaseFluid extends Fluid
{
    protected String simpleName;

    public BaseFluid(String name)
    {
        super(name);
        simpleName = fluidName;
        viscosity = 8000;
        density = 2000;
        luminosity = 7;
    }

    public String getSimpleName()
    {
        return simpleName;
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("fluid.%s%s", ModConstants.RESOURCE_PREFIX, Names.UnwrapUnlocalizedName(super.getUnlocalizedName()));
    }

}

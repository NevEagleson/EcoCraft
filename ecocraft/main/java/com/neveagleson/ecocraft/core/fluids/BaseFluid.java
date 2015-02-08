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
        super(ModConstants.NAME_PREFIX + name);
        simpleName = name;
        viscosity = 6000;
        density = 3000;
        luminosity = 7;
        temperature = 300;
    }

    public String getSimpleName()
    {
        return simpleName;
    }

}

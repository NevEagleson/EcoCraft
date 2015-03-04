package com.neveagleson.ecocraft.core.utility;

import net.minecraft.entity.EntityLivingBase;

/**
 * Created by NevEagleson on 4/03/2015
 */
public class EntityFilter
{
    public boolean negate = false;

    public boolean isEntityValid(EntityLivingBase entity)
    {
        return !negate;
    }

    public EntityFilter negate()
    {
        negate = !negate;
        return this;
    }
}

package com.neveagleson.ecocraft.core.utility;

import com.sun.org.apache.xpath.internal.operations.Neg;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;

/**
 * Created by NevEagleson on 4/03/2015
 */
public class MobEntityFilter extends EntityFilter
{
    @Override
    public boolean isEntityValid(EntityLivingBase entity)
    {
        return entity instanceof EntityMob != negate;
    }
}

package com.neveagleson.ecocraft.core.utility;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;

/**
 * Created by NevEagleson on 4/03/2015
 */
public class PotionEffectEntityFilter extends EntityFilter
{
    private int potionId;
    public PotionEffectEntityFilter(int potionId)
    {
        this.potionId = potionId;
    }

    @Override
    public boolean isEntityValid(EntityLivingBase entity)
    {
        return entity.isPotionActive(potionId) != negate;
    }
}
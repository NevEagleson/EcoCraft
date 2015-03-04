package com.neveagleson.ecocraft.core.potion;

import com.neveagleson.ecocraft.core.ModConstants;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;

import java.util.ArrayList;

/**
 * Created by NevEagleson on 4/03/2015
 */
public class BasePotion extends Potion
{
    protected String simpleName;
    private String unlocalizedName;

    public BasePotion(int id, String name, boolean isBad, int color)
    {
        super(id, isBad, color);
        simpleName = name;
        unlocalizedName = ModConstants.NAME_PREFIX + simpleName.toLowerCase();
        setPotionName(getLocalizedName());
        setIconIndex(0, 0);
    }

    public String getSimpleName()
    {
        return simpleName;
    }

    public String getUnlocalizedName()
    {
        return "potion." + unlocalizedName;
    }

    public String getLocalizedName()
    {
        String s = this.getUnlocalizedName() + ".name";
        return s == null ? "" : StatCollector.translateToLocal(s);
    }

    protected boolean isReadyAtTickRate(int duration, int level, int repeatTick)
    {
        int threshold = repeatTick >> level;
        return threshold > 0 ? duration % threshold == 0 : true;
    }
    protected void addAttributeModifier(IAttribute attribute, String key, double strength)
    {
        func_111184_a(attribute, key, strength, 2);
    }

    @Override
    public double func_111183_a(int level, AttributeModifier modifier)
    {
        return modifier.getAmount() * getAttributeMultiplier(level);
    }
    protected double getAttributeMultiplier(int level) { return (double)(level + 1); }
}

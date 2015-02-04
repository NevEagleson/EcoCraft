package com.neveagleson.ecocraft.core.utility;

/**
 * Created by NevEagleson on 4/02/2015
 */
public class Names
{
    public static String UnwrapUnlocalizedName(String name)
    {
        return name.substring(name.indexOf(".")+1);
    }
}

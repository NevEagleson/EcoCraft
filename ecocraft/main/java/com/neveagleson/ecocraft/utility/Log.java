package com.neveagleson.ecocraft.utility;

import com.neveagleson.ecocraft.ModConstants;
import com.neveagleson.ecocraft.config.Config;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

/**
 * Created by NevEagleson on 4/02/2015.
 */
public class Log
{
    public static void debug(String msg)
    {
        if(Config.DEBUG_LOG_ENABLED)
            FMLLog.log(ModConstants.MOD_NAME, Level.DEBUG, msg);
    }
    public static void debug(Object obj)
    {
        if(Config.DEBUG_LOG_ENABLED)
            FMLLog.log(ModConstants.MOD_NAME, Level.DEBUG, obj.toString());
    }
    public static void info(String msg)
    {
        FMLLog.log(ModConstants.MOD_NAME, Level.INFO, msg);
    }
    public static void info(Object obj)
    {
        FMLLog.log(ModConstants.MOD_NAME, Level.INFO, obj.toString());
    }
    public static void warning(String msg)
    {
        FMLLog.log(ModConstants.MOD_NAME, Level.WARN, msg);
    }
    public static void warning(Object obj)
    {
        FMLLog.log(ModConstants.MOD_NAME, Level.WARN, obj.toString());
    }
    public static void error(String msg)
    {
        FMLLog.log(ModConstants.MOD_NAME, Level.ERROR, msg);
    }
    public static void error(Object obj)
    {
        FMLLog.log(ModConstants.MOD_NAME, Level.ERROR, obj.toString());
    }
}

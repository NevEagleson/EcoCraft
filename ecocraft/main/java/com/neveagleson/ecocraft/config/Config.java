package com.neveagleson.ecocraft.config;

import com.neveagleson.ecocraft.ModConstants;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by NevEagleson on 4/02/2015
 */
public class Config
{
    public static boolean DEBUG_LOG_ENABLED = false;

    private static final String MOD_CATEGORY = "MOD";

    public static Configuration configuration;

    public static void init(File configFile)
    {
        if(configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfig();
        }
    }

    private static void loadConfig()
    {
        DEBUG_LOG_ENABLED = configuration.get(Configuration.CATEGORY_GENERAL,"log_debug",DEBUG_LOG_ENABLED,"Enable debug logging").getBoolean(DEBUG_LOG_ENABLED);

        if(configuration.hasChanged())
            configuration.save();
    }

    @SubscribeEvent
    public void onConfigurationChanged(ConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(ModConstants.MOD_ID))
            loadConfig();
    }
}

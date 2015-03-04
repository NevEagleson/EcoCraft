package com.neveagleson.ecocraft.core.config;

import com.neveagleson.ecocraft.core.ModConstants;
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

    public static int STARTING_POTION_ID = 82;

    private static final String MOD_CATEGORY = "MOD";
    private static final String POTION_CATEGORY = "Potions";

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

        STARTING_POTION_ID = configuration.get(POTION_CATEGORY,"starting_potion_id",STARTING_POTION_ID,"Starting Potion Id - uses a block of 6 ids").getInt(STARTING_POTION_ID);

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

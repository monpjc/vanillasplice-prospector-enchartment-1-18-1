package com.monpjc.vanillasplice_prospector_enchartment;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Vanillasplice_Prospector_Enchartment implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("VanillaSplice Prospector Enchartment");
	public static final String MOD_ID = "vanillasplice_prospector_enchartment";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("Setting Up Mod.");



		LOGGER.info("Finished Setting Up.");
	}
}

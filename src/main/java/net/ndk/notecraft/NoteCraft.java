package net.ndk.notecraft;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.client.option.KeyBinding;

public class NoteCraft implements ModInitializer {
	public static final String MOD_ID = "notecraft";
	// This logger is used to write text to the console and the log file.
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// Proceed with mild caution.
		LOGGER.info("NoteCrafted has been initialized");
	}
}
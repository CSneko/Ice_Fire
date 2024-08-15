package com.sakyrhythm.ice_fire;

import com.sakyrhythm.ice_fire.block.ICE_DIAMOND_BLOCK;
import com.sakyrhythm.ice_fire.block.ModBlocks;
import com.sakyrhythm.ice_fire.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ice_Fire implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "ice_fire";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerModItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ICE_DIAMOND_BLOCK.setRenderLayer();
	}
}
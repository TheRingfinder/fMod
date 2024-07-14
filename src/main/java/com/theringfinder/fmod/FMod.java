package com.theringfinder.fmod;

import com.theringfinder.fmod.block.ModBlocks;
import com.theringfinder.fmod.item.ModItemGroups;
import com.theringfinder.fmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FMod implements ModInitializer {
	public static final String MOD_ID = "fmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}
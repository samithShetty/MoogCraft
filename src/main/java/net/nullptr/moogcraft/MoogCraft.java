package net.nullptr.moogcraft;

import net.fabricmc.api.ModInitializer;
import net.nullptr.moogcraft.block.ModBlocks;
import net.nullptr.moogcraft.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoogCraft implements ModInitializer {
	public static final String MOD_ID = "moogcraft"; 
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItemsInGroup();
		ModBlocks.registerModBlocks();
	}
}
package net.devjavu.jinxed;

import net.devjavu.jinxed.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Jinxed implements ModInitializer {
	public static final String MOD_ID = "jinxed";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}

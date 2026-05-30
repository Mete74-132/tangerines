package de.mete74_ay.tangerines;

import net.fabricmc.api.ModInitializer;

import de.mete74_ay.tangerines.block.ModBlocks;
import de.mete74_ay.tangerines.Creativemodetab.ModCreativeModeTabs;
import de.mete74_ay.tangerines.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Important Comment
public class Tangerines implements ModInitializer {
	public static final String MOD_ID = "tangerines";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
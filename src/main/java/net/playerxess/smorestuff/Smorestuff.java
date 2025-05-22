package net.playerxess.smorestuff;

import net.playerxess.smorestuff.block.SmorestuffBlocks;
import net.playerxess.smorestuff.fluid.SmorestuffFluids;
import net.playerxess.smorestuff.item.SmorestuffItems;
import net.playerxess.smorestuff.item.SmorestuffItemGroups;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Smorestuff implements ModInitializer {
	public static final String MOD_ID = "smorestuff";
	public static final Logger LOGGER = LoggerFactory.getLogger("Smorestuff");

	@Override
	public void onInitialize() {

		Smorestuff.LOGGER.info("Hello From Smorestuff! Thank You For Downloading And Enjoy!");

		SmorestuffItemGroups.registerItemGroups();
		SmorestuffItems.registerSmorestuffItems();
		SmorestuffBlocks.registerModBlocks();
		SmorestuffFluids.registerModFluids();
	}
}

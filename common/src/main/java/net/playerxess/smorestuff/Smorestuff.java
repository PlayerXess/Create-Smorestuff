package net.playerxess.smorestuff;

import net.playerxess.smorestuff.item.SmorestuffItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Smorestuff {
    public static final String MOD_ID = "smorestuff";

    public static final Logger LOGGER = LoggerFactory.getLogger("Smorestuff");

    public static void init() {
        
        LOGGER.info("Loading S'more Stuff!");

        SmorestuffItems.registerItems();

    }
}

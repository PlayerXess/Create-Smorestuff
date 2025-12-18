package net.playerxess.smorestuff;

import net.playerxess.smorestuff.item.SmoreItems;
// import net.playerxess.smorestuff.block.SmoreBlocks;
// import net.playerxess.smorestuff.fluid.SmoreFluids;
import net.playerxess.smorestuff.item.SmoreItemGroups;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Smorestuff {
    public static final String MOD_ID = "smorestuff";

    public static final Logger LOGGER = LoggerFactory.getLogger("Smorestuff");

    public static void init() {

        LOGGER.info("Loading S'more Stuff!");

        // SmoreFluids.registerFluids();
        SmoreItems.registerItems();
        // SmoreBlocks.registerBlocks();
        SmoreItemGroups.registerItemGroups();

    }

    public static void methodNotReplacedError() { // For use in any "@ExpectPlatform"'s
        LOGGER.error(
            """
            ERROR: A Method Was Not Replaced At Runtime/Build
            If You Are Reading This, Something Has Gone Terribly Wrong
            Please Reinstall The Mod. If That Doesn't Work,
            Disable This Mod And Open A Ticket On The
            GitHub Issue Tracker
            My Apologies For The Inconvenience, this is probably my fault

            From:
                - PlayerXess

            Closing Game...
            """,
            new AssertionError()
        );
    }

}

package net.playerxess.smorestuff.block;

import net.playerxess.smorestuff.Smorestuff;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class SmorestuffBlocks {

	public static Block register(Block block, String name, boolean shouldRegisterItem) {

		Identifier id = new Identifier(Smorestuff.MOD_ID, name);

		if (shouldRegisterItem) {
			BlockItem blockItem = new BlockItem(block, new Item.Settings());
			Registry.register(Registries.ITEM, id, blockItem);
		}

		return Registry.register(Registries.BLOCK, id, block);
	}

	public static void registerModBlocks() {
        Smorestuff.LOGGER.info(("Registering Blocks For Mod Create: Smorestuff"));
    }
}

package net.playerxess.smorestuff.util;

import net.playerxess.smorestuff.Smorestuff;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class SmorestuffTags {

	public static class Blocks {

		private static TagKey<Block> createBlockTag(String name) {
			return TagKey.of(RegistryKeys.field_41254, new Identifier(Smorestuff.MOD_ID, name));
		}
	}

	public static class Items {

		private static TagKey<Item> createItemTag(String name) {
			return TagKey.of(RegistryKeys.field_41197, new Identifier(Smorestuff.MOD_ID, name));
		}

		public static final TagKey<Item> COOKED_SMORE = createItemTag("cooked_smore");

	}
}

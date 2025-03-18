package net.playerxess.smorestuff.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.playerxess.smorestuff.Smorestuff;

public class SmorestuffTags {

	public static class Blocks {



		private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.field_41254, new Identifier(Smorestuff.MOD_ID, name));
        }

	}

	public static class Items {

		private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.field_41197, new Identifier(Smorestuff.MOD_ID, name));
        }

	}
}

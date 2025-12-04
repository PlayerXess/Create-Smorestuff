package net.playerxess.smorestuff.item;

import net.playerxess.smorestuff.Smorestuff;

import net.minecraft.registry.RegistryKeys;
import net.minecraft.item.Item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;

public class SmorestuffItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Smorestuff.MOD_ID, RegistryKeys.ITEM);

    public static final RegistrySupplier<Item> MARSHMALLOW = ITEMS.register("marshmallow", () -> new Item(new Item.Settings()));

    public static void registerItems() {
        ITEMS.register();
    }

}
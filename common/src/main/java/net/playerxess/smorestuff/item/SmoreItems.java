package net.playerxess.smorestuff.item;

import net.playerxess.smorestuff.Smorestuff;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import dev.architectury.core.item.ArchitecturyBucketItem;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;

public class SmoreItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(
            Smorestuff.MOD_ID,
            RegistryKeys.ITEM
        );

    public static final RegistrySupplier<Item> MARSHMALLOW =
        ITEMS.register(
            "marshmallow",
            () -> new Item(
                new Item.Settings()
                .arch$tab(SmoreItemGroups.SMORESTUFF_TAB)
            )
        );

        public static final RegistrySupplier<BucketItem> BUCKET_OF_MARSHMALLOW =
        ITEMS.register(
            "bucket_of_marshmallow",
            () -> new ArchitecturyBucketItem(
                new Item.Settings()
                .arch$tab(SmoreItemGroups.SMORESTUFF_TAB)
            )
        );

    public static final RegistrySupplier<Item> PRESSED_DOUGH =
        ITEMS.register(
            "pressed_dough",
            () -> new Item(
                new Item.Settings()
                .arch$tab(SmoreItemGroups.SMORESTUFF_TAB)
            )
        );

    public static final RegistrySupplier<Item> CRACKER =
        ITEMS.register(
            "cracker",
            () -> new Item(
                new Item.Settings()
                .arch$tab(SmoreItemGroups.SMORESTUFF_TAB)
                .food(SmoreFoodComponents.CRACKER_FOOD)
            )
        );

    public static final RegistrySupplier<Item> GRAHAM_CRACKER =
        ITEMS.register(
            "graham_cracker",
            () -> new Item(
                new Item.Settings()
                .arch$tab(SmoreItemGroups.SMORESTUFF_TAB)
            )
        );

    public static final RegistrySupplier<Item> RAW_SMORE =
        ITEMS.register(
            "raw_smore",
            () -> new Item(
                new Item.Settings()
                .arch$tab(SmoreItemGroups.SMORESTUFF_TAB)
            )
        );

    public static final RegistrySupplier<Item> TRADITIONAL_SMORE =
        ITEMS.register(
            "traditional_smore",
            () -> new Item(
                new Item.Settings()
                .arch$tab(SmoreItemGroups.SMORESTUFF_TAB)
                .food(SmoreFoodComponents.TRADITIONAL_SMORE_FOOD)
            )
        );

    public static final RegistrySupplier<Item> CHOCOLATEY_SMORE =
        ITEMS.register(
            "chocolatey_smore",
            () -> new Item(
                new Item.Settings()
                .arch$tab(SmoreItemGroups.SMORESTUFF_TAB)
                .food(SmoreFoodComponents.CHOCOLATEY_SMORE_FOOD)
            )
        );

    public static final RegistrySupplier<Item> MARSHMALLOWEY_SMORE =
        ITEMS.register(
            "marshmallowey_smore",
            () -> new Item(
                new Item.Settings()
                .arch$tab(SmoreItemGroups.SMORESTUFF_TAB)
                .food(SmoreFoodComponents.MARSHMALLOWEY_SMORE_FOOD)
            )
        );

    public static void registerItems() {
        ITEMS.register();
    }
}

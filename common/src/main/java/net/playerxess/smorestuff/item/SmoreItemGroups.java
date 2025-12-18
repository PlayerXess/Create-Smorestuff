package net.playerxess.smorestuff.item;

import net.playerxess.smorestuff.Smorestuff;

import net.minecraft.text.Text;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;

public class SmoreItemGroups {
    public static final DeferredRegister<ItemGroup> TABS =
        DeferredRegister.create(Smorestuff.MOD_ID, RegistryKeys.ITEM_GROUP);

    public static final RegistrySupplier<ItemGroup> SMORESTUFF_TAB =
        TABS.register(
            "smorestuff_tab",
            () -> CreativeTabRegistry.create(
                Text.translatable("category.architectury_test"),
                () -> new ItemStack(SmoreItems.TRADITIONAL_SMORE.get())
            )
        );

    public static void registerItemGroups() {
        TABS.register();
    }
}

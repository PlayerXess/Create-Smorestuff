package net.playerxess.smorestuff.item;

import net.playerxess.smorestuff.item.custom.TraditionalSmoreItem;
import net.playerxess.smorestuff.Smorestuff;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class SmorestuffItems {

    public static final Item MARSHMALLOW = registerItem("marshmallow", new Item(new FabricItemSettings()));

    public static final Item PRESSED_DOUGH = registerItem("pressed_dough", new Item(new FabricItemSettings()));
    public static final Item CRACKER = registerItem("cracker", new Item(new FabricItemSettings().food(SmorestuffFoodComponents.CRACKERFOOD)));
    public static final Item GRAHAMCRACKER = registerItem("graham_cracker", new Item(new FabricItemSettings()));

    public static final Item RAWSMORE = registerItem("raw_smore", new Item(new FabricItemSettings()));
    public static final Item TRADITIONALSMORE = registerItem("traditional_smore", new TraditionalSmoreItem(new FabricItemSettings().food(SmorestuffFoodComponents.TRADITIONALSMOREFOOD)));

    public static final Item MARSHMALLOWEYSMORE = registerItem("marshmallowey_smore", new Item(new FabricItemSettings().food(SmorestuffFoodComponents.MARSHMALLOWEYSMOREFOOD)));
    public static final Item CHOCOLATEYSMORE = registerItem("chocolatey_smore", new Item(new FabricItemSettings().food(SmorestuffFoodComponents.CHOCOLATEYSMOREFOOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Smorestuff.MOD_ID, name), item);
    }

    public static void registerSmorestuffItems() {
        Smorestuff.LOGGER.info(("Registering Items For Mod Create: Smorestuff"));

    }
}

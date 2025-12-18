package net.playerxess.smorestuff.fluid;

import net.playerxess.smorestuff.Smorestuff;
import net.playerxess.smorestuff.item.SmoreItemGroups;
import net.playerxess.smorestuff.item.SmoreItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import dev.architectury.registry.registries.RegistrySupplier;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class SmoreFluids {

    public static FlowableFluid MARSHMALLOW_STILL;
    public static FlowableFluid MARSHMALLOW_FLOWING;
    public static Block FLUID_MARSHMALLOW_BLOCK;
    public static RegistrySupplier<Item> MARSHMALLOW_BUCKET;

    public static void registerModFluids() {
        MARSHMALLOW_STILL = Registry.register(Registries.FLUID,
                Identifier.of(Smorestuff.MOD_ID, "marshmallow_still"), new MarshmallowFluid.Still());

        MARSHMALLOW_FLOWING = Registry.register(Registries.FLUID,
                Identifier.of(Smorestuff.MOD_ID, "marshmallow_flow"), new MarshmallowFluid.Flowing());

        FLUID_MARSHMALLOW_BLOCK = Registry.register(Registries.BLOCK, Identifier.of(Smorestuff.MOD_ID, "fluid_marshmallow_block"),
                new FluidBlock(SmoreFluids.MARSHMALLOW_STILL, FabricBlockSettings.copyOf(Blocks.WATER)){ });

        MARSHMALLOW_BUCKET = SmoreItems.ITEMS.register(
                "bucket_of_marshmallow",
                () -> new Item(
                new Item.Settings()
                .arch$tab(SmoreItemGroups.SMORESTUFF_TAB)
            )
        );
    }
}
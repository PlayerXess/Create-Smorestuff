package net.playerxess.smorestuff.block;

import net.playerxess.smorestuff.Smorestuff;
import net.playerxess.smorestuff.fluid.LiquidMarshmallow;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.block.AbstractBlock;
import net.minecraft.registry.RegistryKeys;

import dev.architectury.core.block.ArchitecturyLiquidBlock;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;

import java.util.function.Supplier;

public class SmoreBlocks {
        private static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(
            Smorestuff.MOD_ID,
            RegistryKeys.BLOCK
        );



        public static void registerBlocks() {
            BLOCKS.register();
        }

}

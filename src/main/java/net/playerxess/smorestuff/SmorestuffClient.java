package net.playerxess.smorestuff;

import net.playerxess.smorestuff.fluid.SmorestuffFluids;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.Identifier;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;

public class SmorestuffClient implements ClientModInitializer {

    public static void setupFluidRendering(final Fluid still, final Fluid flowing, final String textureBase) {
        final Identifier stillTexture = new Identifier(textureBase, "block/marshmallow_still");
        final Identifier flowingTexture = new Identifier(textureBase, "block/marshmallow_flow");

        FluidRenderHandler handler = new SimpleFluidRenderHandler(stillTexture, flowingTexture);
        FluidRenderHandlerRegistry.INSTANCE.register(still, handler);
        FluidRenderHandlerRegistry.INSTANCE.register(flowing, handler);
    }

    @Override
    public void onInitializeClient() {
        setupFluidRendering(SmorestuffFluids.MARSHMALLOW_STILL, SmorestuffFluids.MARSHMALLOW_FLOWING, "smorestuff");
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), SmorestuffFluids.MARSHMALLOW_STILL, SmorestuffFluids.MARSHMALLOW_FLOWING);
    }
}

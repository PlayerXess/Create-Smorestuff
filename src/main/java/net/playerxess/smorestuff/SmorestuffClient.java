package net.playerxess.smorestuff;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;

import net.minecraft.fluid.Fluid;
import net.minecraft.util.Identifier;
import net.minecraft.client.render.RenderLayer;

import net.playerxess.smorestuff.Smorestuff;
import net.playerxess.smorestuff.fluid.SmorestuffFluids;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmorestuffClient implements ClientModInitializer {
    public static void setupFluidRendering(final Fluid still, final Fluid flowing, final String textureBase) {
        final Identifier stillTexture = new Identifier(textureBase, "block/marshmallow_still");
            Smorestuff.LOGGER.info("Grabbing Still Texture from: " + stillTexture.toString());
        final Identifier flowingTexture = new Identifier(textureBase, "block/marshmallow_flow");
            Smorestuff.LOGGER.info("Grabbing Flowing Texture from: " + flowingTexture.toString());

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

package net.playerxess.smorestuff;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.Identifier;
import net.playerxess.smorestuff.fluid.SmorestuffFluids;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;import org.slf4j.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmorestuffClient implements ClientModInitializer {

    public static void setupFluidRendering(final Fluid still, final Fluid flowing, final Identifier textureBase) {
        final Identifier stillTexture = new Identifier(textureBase.getNamespace(), "fluid/marshmallow_still");
        Smorestuff.LOGGER.info("Attempted To Load Marshmallow Still Texture");

        final Identifier flowingTexture = new Identifier(textureBase.getNamespace(), "texture/fluid/marshmallow_flow");
        Smorestuff.LOGGER.info("Attempted To Load Marshmallow Flowing Texture");

        FluidRenderHandler handler = new SimpleFluidRenderHandler(stillTexture, flowingTexture);
        FluidRenderHandlerRegistry.INSTANCE.register(still, handler);
        FluidRenderHandlerRegistry.INSTANCE.register(flowing, handler);
    }

    @Override
    public void onInitializeClient() {
        setupFluidRendering(SmorestuffFluids.MARSHMALLOW_STILL, SmorestuffFluids.MARSHMALLOW_FLOWING, new Identifier(Smorestuff.MOD_ID, "marshmallow"));
    }
}

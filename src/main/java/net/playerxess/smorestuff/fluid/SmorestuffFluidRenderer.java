package net.playerxess.smorestuff.fluid;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderHandlerRegistryImpl;
import net.minecraft.client.render.RenderLayer;

import net.minecraft.fluid.Fluid;
import net.minecraft.util.Identifier;

import net.playerxess.smorestuff.Smorestuff;
import net.playerxess.smorestuff.fluid.SmorestuffFluids;

public class SmorestuffFluidRenderer {
    static FluidRenderHandler MarshmallowFluidRenderHandler = new SimpleFluidRenderHandler(new Identifier("smorestuff", "fluid/marshmallow_still"), new Identifier("smorestuff", "texture/fluid/marshmallow_flow"));
    FluidRenderHandlerRegistry fluidRegistry = new FluidRenderHandlerRegistryImpl();

    public static void setupFluidRendering() {
        Smorestuff.LOGGER.info("Loading Fluid Rendering For Create: Smorestuff");

        FluidRenderHandlerRegistry.INSTANCE.register(SmorestuffFluids.MARSHMALLOW_STILL, SmorestuffFluids.MARSHMALLOW_FLOWING, MarshmallowFluidRenderHandler);

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getSolid(), SmorestuffFluids.MARSHMALLOW_STILL, SmorestuffFluids.MARSHMALLOW_FLOWING);


    }

    public static void registerFluidRenderer() {
        Smorestuff.LOGGER.info("Loading Fluid Rendering For Create: Smorestuff");
        setupFluidRendering();
    }

}

package net.playerxess.smorestuff;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.util.Identifier;
import net.playerxess.smorestuff.fluid.SmorestuffFluids;

public class SmorestuffClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
FluidRenderHandlerRegistry.INSTANCE.register(SmorestuffFluids.MARSHMALLOW_STILL, SmorestuffFluids.MARSHMALLOW_FLOWING,
                new SimpleFluidRenderHandler(
                        new Identifier("smorestuff:fluid/marshmallow_still"),
                        new Identifier("smorestuff:fluid/marshmallow_flow")
                ));
    }
}

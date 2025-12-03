package net.playerxess.smorestuff.fabric;

import net.fabricmc.api.ModInitializer;

import net.playerxess.smorestuff.Smorestuff;

public final class SmorestuffFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Smorestuff.init();
    }
}

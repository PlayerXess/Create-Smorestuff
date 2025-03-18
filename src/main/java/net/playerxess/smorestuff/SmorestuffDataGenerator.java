package net.playerxess.smorestuff;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.playerxess.smorestuff.datagen.*;

public class SmorestuffDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(SmorestuffAdvancementsProvider::new);
		pack.addProvider(SmorestuffBlockTagProvider::new);
		pack.addProvider(SmorestuffItemTagProvider::new);
		pack.addProvider(SmorestuffLootTableProvider::new);
		pack.addProvider(SmorestuffModelProvider::new);
		pack.addProvider(SmorestuffRecipeProvider::new);
	}
}

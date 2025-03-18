package net.playerxess.smorestuff.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.playerxess.smorestuff.Smorestuff;
import net.playerxess.smorestuff.fluid.SmorestuffFluids;
import net.playerxess.smorestuff.block.SmorestuffBlocks;

public class SmorestuffItemGroups {
    public static final ItemGroup SMORE_STUFF = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Smorestuff.MOD_ID, "smore"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.smore"))
                    .icon(() -> new ItemStack(SmorestuffItems.TRADITIONALSMORE)). entries((displayContext, entries) -> {
                        entries.add(SmorestuffItems.MARSHMALLOW);
						entries.add(SmorestuffItems.PRESSED_DOUGH);
						entries.add(SmorestuffItems.CRACKER);
						entries.add(SmorestuffItems.GRAHAMCRACKER);
						entries.add(SmorestuffItems.RAWSMORE);
						entries.add(SmorestuffItems.TRADITIONALSMORE);
						entries.add(SmorestuffItems.CHOCOLATEYSMORE);
						entries.add(SmorestuffItems.MARSHMALLOWEYSMORE);
						entries.add(SmorestuffFluids.MARSHMALLOW_BUCKET);

                    }).build());

    public static void registerItemGroups() {
        Smorestuff.LOGGER.info("Registering Item Groups For Mod Create: Smorestuff");
    }
}

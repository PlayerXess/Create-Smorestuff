package net.playerxess.smorestuff.item;

import net.minecraft.util.Identifier;

import net.playerxess.smorestuff.Smorestuff;

import net.playerxess.plre.rendering.TextureEngine;
import net.playerxess.plre.rendering.TextureGenerator;

import java.io.IOException;
import java.util.List;

public class SmorestuffItemRenderer {

    public static TextureEngine smoreRenderer;

    public static void registerItemRenderers() throws IOException {
        Smorestuff.LOGGER.info("Initializing Item Rendering For Create: Smorestuff Using PLRE");

        List<String> textures = List.of("src/main/resources/assets/smorestuff/textures/item/traditional_smore_top.png", "src/main/resources/assets/smorestuff/textures/item/traditional_smore_bottom.png");
        smoreRenderer = new TextureEngine(textures, Smorestuff.MOD_ID, "traditional_smore");

        Identifier textureIdentifier = TextureGenerator.generateCombinedTexture(smoreRenderer);

        if(textureIdentifier != null) {
            smoreRenderer
        }
    }
}

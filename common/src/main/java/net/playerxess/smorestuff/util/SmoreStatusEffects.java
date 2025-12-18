package net.playerxess.smorestuff.util;

import net.playerxess.smorestuff.Smorestuff;

import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.attribute.EntityAttributeModifier.Operation;

public class SmoreStatusEffects {

    private static RegistryEntry<StatusEffect> register(String id, StatusEffect statusEffect) {
        return Registry.registerReference(
            Registries.STATUS_EFFECT,
            Identifier.ofVanilla(id),
            statusEffect
        );
    }

    public static final RegistryEntry<StatusEffect> SUGAR_RUSH;
    public static final RegistryEntry<StatusEffect> SUGAR_CRASH;

    static {
        SUGAR_RUSH = register(
            "sugar_rush",
            new StatusEffectController(
                StatusEffectCategory.BENEFICIAL,
                0xFF69B4
            )
            .addAttributeModifier(
                EntityAttributes.GENERIC_MOVEMENT_SPEED,
                Identifier.ofVanilla("effect.speed"),
                0.20000000298023224,
                Operation.ADD_MULTIPLIED_TOTAL
            )
            .addAttributeModifier(
                EntityAttributes.GENERIC_ATTACK_SPEED,
                Identifier.ofVanilla("effect.attack_speed"),
                0.10000000149011612,
                Operation.ADD_MULTIPLIED_TOTAL
            )
            .addAttributeModifier(
                EntityAttributes.PLAYER_BLOCK_BREAK_SPEED,
                Identifier.ofVanilla("player.block_break_speed"),
                0.10000000149011612,
                Operation.ADD_MULTIPLIED_TOTAL
            )
            .addAttributeModifier(
                EntityAttributes.PLAYER_SUBMERGED_MINING_SPEED,
                Identifier.ofVanilla("player.submerged_mining_speed"),
                0.10000000149011612,
                Operation.ADD_MULTIPLIED_TOTAL
            )
            .addAttributeModifier(
                EntityAttributes.PLAYER_SNEAKING_SPEED,
                Identifier.ofVanilla("player.sneaking_speed"),
                0.10000000149011612,
                Operation.ADD_MULTIPLIED_TOTAL
            )
        );

        SUGAR_CRASH = register(
            "sugar_crash",
            new StatusEffectController(
                StatusEffectCategory.HARMFUL,
                0xFF69B4
                )
                .addAttributeModifier(
                EntityAttributes.GENERIC_MOVEMENT_SPEED,
                Identifier.ofVanilla("effect.speed"),
                -0.20000000298023224,
                Operation.ADD_MULTIPLIED_TOTAL
            )
            .addAttributeModifier(
                EntityAttributes.GENERIC_ATTACK_SPEED,
                Identifier.ofVanilla("effect.attack_speed"),
                -0.10000000149011612,
                Operation.ADD_MULTIPLIED_TOTAL
            )
            .addAttributeModifier(
                EntityAttributes.PLAYER_BLOCK_BREAK_SPEED,
                Identifier.ofVanilla("player.block_break_speed"),
                -0.10000000149011612,
                Operation.ADD_MULTIPLIED_TOTAL
            )
            .addAttributeModifier(
                EntityAttributes.PLAYER_SUBMERGED_MINING_SPEED,
                Identifier.ofVanilla("player.submerged_mining_speed"),
                -0.10000000149011612,
                Operation.ADD_MULTIPLIED_TOTAL
            )
            .addAttributeModifier(
                EntityAttributes.PLAYER_SNEAKING_SPEED,
                Identifier.ofVanilla("player.sneaking_speed"),
                -0.10000000149011612,
                Operation.ADD_MULTIPLIED_TOTAL
            )
        );
}

    public static void registerStatusEffects() {
        Smorestuff.LOGGER.info("Registering S'more Status Effects! (I think)");
    }

}

package net.playerxess.smorestuff.item;

import net.playerxess.smorestuff.util.SmoreStatusEffects;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;

public class SmoreFoodComponents {
    public static final FoodComponent CRACKER_FOOD =
		new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.2f)
        .build();

	public static final FoodComponent TRADITIONAL_SMORE_FOOD =
		new FoodComponent.Builder()
            .nutrition(10)
            .saturationModifier(0.5f)
            .statusEffect(
                new StatusEffectInstance(
                    StatusEffects.SATURATION,
                    600,
                    1
                ),
                1.0F
            )
        .build();

	public static final FoodComponent CHOCOLATEY_SMORE_FOOD =
		new FoodComponent.Builder()
            .nutrition(10)
            .saturationModifier(0.5f)
            .statusEffect(
                new StatusEffectInstance(
                    StatusEffects.SATURATION,
                    1200,
                    1
                ),
                1.0F
            )
            .statusEffect(
                new StatusEffectInstance(
                    SmoreStatusEffects.SUGAR_RUSH,
                    2400,
                    1
                ),
                1.0F
            )
        .build();

	public static final FoodComponent MARSHMALLOWEY_SMORE_FOOD =
		new FoodComponent.Builder()
            .nutrition(10)
            .saturationModifier(0.5f)
            .statusEffect(
                new StatusEffectInstance(
                    StatusEffects.SATURATION,
                    1200,
                    1
                ),
                1.0F
            )
            .statusEffect(
                new StatusEffectInstance(
                    StatusEffects.MINING_FATIGUE,
                    600,
                    1
                ),
                1.0F
            )
        .build();
}

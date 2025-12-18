package net.playerxess.smorestuff.util;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class StatusEffectController extends StatusEffect{

    protected StatusEffectController(StatusEffectCategory category, int color) {
        super(
            category,
            color
        );
    }
}

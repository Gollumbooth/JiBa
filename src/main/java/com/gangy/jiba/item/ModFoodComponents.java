package com.gangy.jiba.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent DJJ = new FoodComponent.Builder().hunger(5).saturationModifier(3.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3000, 10), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3000, 10), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 3000, 6), 1.0f)
            .build();

    public static final FoodComponent XJJ = new FoodComponent.Builder().hunger(3).saturationModifier(2.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3000, 5), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3000, 5), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 3000, 4), 1.0f)
            .build();
}

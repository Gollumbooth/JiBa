package com.gangy.jiba.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent DJJ = new FoodComponent.Builder().hunger(5).saturationModifier(3.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3000, 5), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3000, 5), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 3000, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3000, 4), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent XJJ = new FoodComponent.Builder().hunger(3).saturationModifier(2.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 3000, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3000, 2), 1.0f)
            .alwaysEdible()
            .build();
}

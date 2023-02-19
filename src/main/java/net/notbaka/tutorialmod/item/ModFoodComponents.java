package net.notbaka.tutorialmod.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent EATABLE_STONE = new FoodComponent.Builder().
            hunger(3).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1,
                    1), 0.6f).build();
    public static final FoodComponent COOKED_EATABLE_STONE = new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).meat().build();
}

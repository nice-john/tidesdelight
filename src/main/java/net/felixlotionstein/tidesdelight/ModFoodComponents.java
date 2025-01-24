package net.felixlotionstein.tidesdelight;

import net.felixlotionstein.tidesdelight.init.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;

public class ModFoodComponents {
    public static final FoodProperties ANGLERFISH_HOTPOT = new FoodProperties.Builder()
            .nutrition(12)          // Amount of hunger restored
            .saturationMod(.9f)    // Saturation value
            .build();
    public static final FoodProperties BARRACUDA_STEAK = new FoodProperties.Builder()
            .nutrition(6)          // Amount of hunger restored
            .saturationMod(.9f)   // Saturation value
            .meat()                // Indicates it's a meat item
            .build();
    public static final FoodProperties BARRACUDA_BURGER = new FoodProperties.Builder()
            .nutrition(10)         // Amount of hunger restored
            .saturationMod(.5f)   // Saturation value
            .build();
    public static final FoodProperties FRIED_CATFISH = new FoodProperties.Builder()
            .nutrition(6)         // Amount of hunger restored
            .saturationMod(0.5f)   // Saturation value
            .build();
    public static final FoodProperties SMOKED_EEL = new FoodProperties.Builder()
            .nutrition(4)          // Amount of hunger restored
            .saturationMod(0.7f)   // Saturation value
            .meat()                // Indicates it's a meat item
            .build();
    public static final FoodProperties POKE = new FoodProperties.Builder()
            .nutrition(14)         // Amount of hunger restored
            .saturationMod(.7f)   // Saturation value
            .build();
    public static final FoodProperties CHEESE = new FoodProperties.Builder()
            .nutrition(3)         // Amount of hunger restored
            .saturationMod(1f)   // Saturation value
            .build();
    public static final FoodProperties CAPRESE = new FoodProperties.Builder()
            .nutrition(6)         // Amount of hunger restored
            .saturationMod(.5f)   // Saturation value
            .build();
    public static final FoodProperties GROUPER_CAPRESE = new FoodProperties.Builder()
            .nutrition(9)         // Amount of hunger restored
            .saturationMod(.6f)   // Saturation value
            .build();
    public static final FoodProperties GRILLED_GROUPER = new FoodProperties.Builder()
            .nutrition(6)         // Amount of hunger restored
            .saturationMod(.9f)   // Saturation value
            .build();
    public static final FoodProperties MINCED_MIDAS_FISH = new FoodProperties.Builder()
            .nutrition(1)         // Amount of hunger restored
            .saturationMod(.9f)   // Saturation value
            .effect(() -> new MobEffectInstance(ModEffects.MIDAS_TOUCH.get(), 200), 1.0f) // Applies Midas Touch for 10 seconds
            .alwaysEat()           // Can be eaten even when full
            .build();
}


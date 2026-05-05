package net.felixlotionstein.tidesdelight;

import net.felixlotionstein.tidesdelight.init.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;

public class ModFoodComponents {
    public static final FoodProperties ANGLERFISH_HOTPOT = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(.9f)
            .effect(() -> new MobEffectInstance(vectorwing.farmersdelight.common.registry.ModEffects.NOURISHMENT, 1200), 1.0f)
            .build();
    public static final FoodProperties SEAFOOD_PAELLA = new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(.5f)
            .effect(() -> new MobEffectInstance(vectorwing.farmersdelight.common.registry.ModEffects.NOURISHMENT, 1200), 1.0f)
            .build();
    public static final FoodProperties BARRACUDA_STEAK = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(.9f)
            .build();
    public static final FoodProperties BARRACUDA_BURGER = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(.5f)
            .build();
    public static final FoodProperties FRIED_CATFISH = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.5f)
            .build();
    public static final FoodProperties SMOKED_EEL = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.7f)
            .build();
    public static final FoodProperties POKE_BOWL = new FoodProperties.Builder()
            .nutrition(14)
            .saturationModifier(.7f)
            .effect(() -> new MobEffectInstance(vectorwing.farmersdelight.common.registry.ModEffects.COMFORT, 600), 1.0f)
            .build();
    public static final FoodProperties CHEESE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(1f)
            .build();
    public static final FoodProperties CAPRESE = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(.5f)
            .build();
    public static final FoodProperties GROUPER_CAPRESE = new FoodProperties.Builder()
            .nutrition(9)
            .saturationModifier(.6f)
            .build();
    public static final FoodProperties GRILLED_GROUPER = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(.9f)
            .build();
    public static final FoodProperties TUNA_SLICE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(.9f)
            .build();
    public static final FoodProperties TUNA_ROLL = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(.6f)
            .build();
    public static final FoodProperties TUNA_ROLL_SLICE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(.6f)
            .build();
    public static final FoodProperties TUNA_STEAK = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(.9f)
            .build();
    public static final FoodProperties TUNA_SALAD = new FoodProperties.Builder()
            .nutrition(9)
            .saturationModifier(.9f)
            .build();
    public static final FoodProperties CRYSTAL_SHRIMP_SCAMPI = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(.4f)
            .build();
    public static final FoodProperties SLICED_SNATCHER_SQUID = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(.1f)
            .build();
    public static final FoodProperties CALAMARI = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(.3f)
            .build();
    public static final FoodProperties SHARK_FIN_SOUP = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(.2f)
            .effect(() -> new MobEffectInstance(vectorwing.farmersdelight.common.registry.ModEffects.NOURISHMENT, 1200), 1.0f)
            .build();
    public static final FoodProperties MINCED_MIDAS_FISH = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(.9f)
            .effect(() -> new MobEffectInstance(ModEffects.MIDAS_TOUCH, 200), 1.0f)
            .alwaysEdible()
            .build();
}

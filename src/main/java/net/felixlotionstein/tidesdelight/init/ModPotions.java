package net.felixlotionstein.tidesdelight.init;

import net.felixlotionstein.tidesdelight.Tidesdelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(Registries.POTION, Tidesdelight.MODID);

    public static final DeferredHolder<Potion, Potion> MIDAS_TOUCH = POTIONS.register("midas_touch",
            () -> new Potion(new MobEffectInstance(ModEffects.MIDAS_TOUCH, 400)));
    public static final DeferredHolder<Potion, Potion> MIDAS_TOUCH_EXTENDED = POTIONS.register("midas_touch_extended",
            () -> new Potion(new MobEffectInstance(ModEffects.MIDAS_TOUCH, 600)));
}

package net.felixlotionstein.tidesdelight.init;

import net.felixlotionstein.tidesdelight.Tidesdelight;
import net.felixlotionstein.tidesdelight.effect.MidasTouchEffect;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {
    public static final DeferredRegister<MobEffect> EFFECTS =
            DeferredRegister.create(Registries.MOB_EFFECT, Tidesdelight.MODID);

    public static final DeferredHolder<MobEffect, MobEffect> MIDAS_TOUCH =
            EFFECTS.register("midas_touch", MidasTouchEffect::new);
}

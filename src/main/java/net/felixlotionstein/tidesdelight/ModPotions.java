package net.felixlotionstein.tidesdelight;

import net.felixlotionstein.tidesdelight.init.ModEffects;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(Registries.POTION, Tidesdelight.MODID);

    public static final DeferredHolder<Potion, Potion> MIDAS_TOUCH_POTION = POTIONS.register("midas_touch",
            () -> new Potion(new MobEffectInstance(ModEffects.MIDAS_TOUCH, 400, 0)));

    public static final DeferredHolder<Potion, Potion> MIDAS_TOUCH_POTION_EXTENDED = POTIONS.register("midas_touch_extended",
            () -> new Potion(new MobEffectInstance(ModEffects.MIDAS_TOUCH, 600, 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}

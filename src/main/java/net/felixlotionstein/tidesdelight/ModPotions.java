package net.felixlotionstein.tidesdelight;

import net.felixlotionstein.tidesdelight.Tidesdelight;
import net.felixlotionstein.tidesdelight.init.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, Tidesdelight.MODID);

    public static final RegistryObject<Potion> MIDAS_TOUCH_POTION = POTIONS.register("midas_touch",
            () -> new Potion(new MobEffectInstance(ModEffects.MIDAS_TOUCH.get(), 400, 0))); // Effect lasts 30 seconds.

    public static final RegistryObject<Potion> MIDAS_TOUCH_POTION_EXTENDED = POTIONS.register("midas_touch_extended",
            () -> new Potion(new MobEffectInstance(ModEffects.MIDAS_TOUCH.get(), 600, 0))); // Effect lasts 30 seconds.

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}



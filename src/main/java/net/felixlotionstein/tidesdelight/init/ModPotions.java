package net.felixlotionstein.tidesdelight.init;

import net.felixlotionstein.tidesdelight.Tidesdelight;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, Tidesdelight.MODID);

    public static final RegistryObject<Potion> MIDAS_TOUCH = POTIONS.register("midas_touch",
            () -> new Potion(new MobEffectInstance(ModEffects.MIDAS_TOUCH.get(), 400))); // 3 minutes duration
    public static final RegistryObject<Potion> MIDAS_TOUCH_EXTENDED = POTIONS.register("midas_touch_extended",
            () -> new Potion(new MobEffectInstance(ModEffects.MIDAS_TOUCH.get(), 600))); // 30 minutes duration
}


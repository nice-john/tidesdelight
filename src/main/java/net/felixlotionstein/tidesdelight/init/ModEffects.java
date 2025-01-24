package net.felixlotionstein.tidesdelight.init;

import net.felixlotionstein.tidesdelight.Tidesdelight;
import net.felixlotionstein.tidesdelight.effect.MidasTouchEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Tidesdelight.MODID);

    public static final RegistryObject<MobEffect> MIDAS_TOUCH = EFFECTS.register("midas_touch", MidasTouchEffect::new);
}

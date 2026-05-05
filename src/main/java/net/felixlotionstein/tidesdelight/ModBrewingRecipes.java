package net.felixlotionstein.tidesdelight;

import net.felixlotionstein.tidesdelight.init.ModPotions;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;

public class ModBrewingRecipes {
    public static void register(PotionBrewing.Builder builder) {
        builder.addMix(Potions.AWKWARD, ModItems.MINCED_MIDAS_FISH.get(), ModPotions.MIDAS_TOUCH);
        builder.addMix(ModPotions.MIDAS_TOUCH, Items.REDSTONE, ModPotions.MIDAS_TOUCH_EXTENDED);
    }
}

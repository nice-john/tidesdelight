package net.felixlotionstein.tidesdelight;

import net.felixlotionstein.tidesdelight.BetterBrewingRecipe;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.felixlotionstein.tidesdelight.ModItems;
import net.felixlotionstein.tidesdelight.init.ModPotions;

public class ModBrewingRecipes {
    public static void registerBrewingRecipes() {
        // Midas Touch Potion
        BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(
                Potions.AWKWARD,
                ModItems.MINCED_MIDAS_FISH.get(),
                ModPotions.MIDAS_TOUCH.get()
        ));

        // Extended Midas Touch Potion
        BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(
                ModPotions.MIDAS_TOUCH.get(),
                Items.REDSTONE,
                ModPotions.MIDAS_TOUCH_EXTENDED.get()
        ));
    }
}

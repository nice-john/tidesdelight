package net.felixlotionstein.tidesdelight;

import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.felixlotionstein.tidesdelight.ModFoodComponents;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.item.ConsumableItem;

import static vectorwing.farmersdelight.common.registry.ModItems.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "tidesdelight");

    // Register Anglerfish Hotpot
    public static final RegistryObject<Item> ANGLERFISH_HOTPOT = ITEMS.register("anglerfish_hotpot",
            () -> new ConsumableItem(bowlFoodItem(ModFoodComponents.ANGLERFISH_HOTPOT), true));
    // Register Barracuda Steak
    public static final RegistryObject<Item> BARRACUDA_STEAK = ITEMS.register("barracuda_steak",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.BARRACUDA_STEAK)
                    .stacksTo(64))); // Allow stacking up to 64
    public static final RegistryObject<Item> BARRACUDA_BURGER = ITEMS.register("barracuda_burger",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.BARRACUDA_BURGER)
                    .stacksTo(64))); // Allow stacking up to 64
    public static final RegistryObject<Item> FRIED_CATFISH = ITEMS.register("fried_catfish",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.FRIED_CATFISH)
                    .stacksTo(64))); // Allow stacking up to 64
    public static final RegistryObject<Item> SMOKED_EEL = ITEMS.register("smoked_eel",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.SMOKED_EEL)
                    .stacksTo(64))); // Allow stacking up to 64
    public static final RegistryObject<Item> POKE_BOWL = ITEMS.register("poke_bowl",
            () -> new BowlFoodItem(new Item.Properties()
                    .food(ModFoodComponents.POKE_BOWL)
                    .stacksTo(64))); // Limit stack size to 1 for food in a bowl
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.CHEESE)
                    .stacksTo(64))); // Limit stack size to 1 for food in a bowl
    public static final RegistryObject<Item> CAPRESE = ITEMS.register("caprese",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.CAPRESE)
                    .stacksTo(64))); // Limit stack size to 1 for food in a bowl
    public static final RegistryObject<Item> GROUPER_CAPRESE = ITEMS.register("grouper_caprese",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.GROUPER_CAPRESE)
                    .stacksTo(64))); // Limit stack size to 1 for food in a bowl
    public static final RegistryObject<Item> GRILLED_GROUPER = ITEMS.register("grilled_grouper",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.GRILLED_GROUPER)
                    .stacksTo(64))); // Limit stack size to 1 for food in a bowl
    public static final RegistryObject<Item> TUNA_SLICE = ITEMS.register("tuna_slice",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.TUNA_SLICE)
                    .stacksTo(64))); // Limit stack size to 1 for food
    public static final RegistryObject<Item> TUNA_ROLL = ITEMS.register("tuna_roll",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.TUNA_ROLL)));
    public static final RegistryObject<Item> TUNA_ROLL_SLICE = ITEMS.register("tuna_roll_slice",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.TUNA_ROLL_SLICE)));
    public static final RegistryObject<Item> TUNA_STEAK = ITEMS.register("tuna_steak",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.TUNA_STEAK)));

    public static final RegistryObject<Item> MINCED_MIDAS_FISH = ITEMS.register("minced_midas_fish",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.MINCED_MIDAS_FISH)
                    .stacksTo(64))); // Limit stack size to 1 for food in a bowl

    //potions
    public static final RegistryObject<Item> MIDAS_TOUCH_POTION = ITEMS.register("midas_touch_potion",
            () -> new PotionItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));

}


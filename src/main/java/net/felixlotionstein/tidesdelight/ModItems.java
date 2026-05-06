package net.felixlotionstein.tidesdelight;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.item.ConsumableItem;

import static vectorwing.farmersdelight.common.registry.ModItems.bowlFoodItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Tidesdelight.MODID);

    public static final DeferredItem<Item> ANGLERFISH_HOTPOT = ITEMS.register("anglerfish_hotpot",
            () -> new ConsumableItem(bowlFoodItem(ModFoodComponents.ANGLERFISH_HOTPOT), true));
    public static final DeferredItem<Item> SEAFOOD_PAELLA = ITEMS.register("seafood_paella",
            () -> new ConsumableItem(bowlFoodItem(ModFoodComponents.SEAFOOD_PAELLA), true));
    public static final DeferredItem<Item> BARRACUDA_STEAK = ITEMS.register("barracuda_steak",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.BARRACUDA_STEAK)
                    .stacksTo(64)));
    public static final DeferredItem<Item> BARRACUDA_BURGER = ITEMS.register("barracuda_burger",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.BARRACUDA_BURGER)
                    .stacksTo(64)));
    public static final DeferredItem<Item> FRIED_CATFISH = ITEMS.register("fried_catfish",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.FRIED_CATFISH)
                    .stacksTo(64)));
    public static final DeferredItem<Item> SMOKED_EEL = ITEMS.register("smoked_eel",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.SMOKED_EEL)
                    .stacksTo(64)));
    public static final DeferredItem<Item> POKE_BOWL = ITEMS.register("poke_bowl",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.POKE_BOWL)
                    .craftRemainder(Items.BOWL)
                    .stacksTo(16)));
    public static final DeferredItem<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.CHEESE)
                    .stacksTo(64)));
    public static final DeferredItem<Item> CAPRESE = ITEMS.register("caprese",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.CAPRESE)
                    .stacksTo(64)));
    public static final DeferredItem<Item> GROUPER_CAPRESE = ITEMS.register("grouper_caprese",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.GROUPER_CAPRESE)
                    .stacksTo(64)));
    public static final DeferredItem<Item> GRILLED_GROUPER = ITEMS.register("grilled_grouper",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.GRILLED_GROUPER)
                    .stacksTo(64)));
    public static final DeferredItem<Item> TUNA_SLICE = ITEMS.register("tuna_slice",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.TUNA_SLICE)
                    .stacksTo(64)));
    public static final DeferredItem<Item> TUNA_ROLL = ITEMS.register("tuna_roll",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.TUNA_ROLL)));
    public static final DeferredItem<Item> TUNA_ROLL_SLICE = ITEMS.register("tuna_roll_slice",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.TUNA_ROLL_SLICE)));
    public static final DeferredItem<Item> TUNA_STEAK = ITEMS.register("tuna_steak",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.TUNA_STEAK)));
    public static final DeferredItem<Item> TUNA_SALAD = ITEMS.register("tuna_salad",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.TUNA_SALAD)));
    public static final DeferredItem<Item> CRYSTAL_SHRIMP_SCAMPI = ITEMS.register("crystal_shrimp_scampi",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.CRYSTAL_SHRIMP_SCAMPI)));
    public static final DeferredItem<Item> SLICED_SNATCHER_SQUID = ITEMS.register("sliced_snatcher_squid",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.SLICED_SNATCHER_SQUID)));
    public static final DeferredItem<Item> CALAMARI = ITEMS.register("calamari",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.CALAMARI)));

    public static final DeferredItem<Item> MINCED_MIDAS_FISH = ITEMS.register("minced_midas_fish",
            () -> new Item(new Item.Properties()
                    .food(ModFoodComponents.MINCED_MIDAS_FISH)
                    .stacksTo(64)));

    public static final DeferredItem<Item> SHARK_FIN = ITEMS.register("shark_fin",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)));
    public static final DeferredItem<Item> SHARK_FIN_SOUP = ITEMS.register("shark_fin_soup",
            () -> new ConsumableItem(bowlFoodItem(ModFoodComponents.SHARK_FIN_SOUP), true));

    //potions
    public static final DeferredItem<Item> MIDAS_TOUCH_POTION = ITEMS.register("midas_touch_potion",
            () -> new PotionItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));
}

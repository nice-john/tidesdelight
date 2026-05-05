package net.felixlotionstein.tidesdelight;

import com.mojang.logging.LogUtils;
import net.felixlotionstein.tidesdelight.init.ModEffects;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;
import vectorwing.farmersdelight.common.registry.ModCreativeTabs;

@Mod(Tidesdelight.MODID)
public class Tidesdelight {

    public static final String MODID = "tidesdelight";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(net.minecraft.core.registries.Registries.CREATIVE_MODE_TAB, MODID);

    public Tidesdelight(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);
        modEventBus.addListener(this::registerBrewing);

        ModItems.ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
        ModEffects.EFFECTS.register(modEventBus);
        ModPotions.POTIONS.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM COMMON SETUP");
        if (Config.logDirtBlock) LOGGER.info("DIRT BLOCK >> {}", net.minecraft.core.registries.BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));
        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);
        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    private void registerBrewing(final RegisterBrewingRecipesEvent event) {
        ModBrewingRecipes.register(event.getBuilder());
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == ModCreativeTabs.TAB_FARMERS_DELIGHT.getKey()) {
            event.accept(ModItems.ANGLERFISH_HOTPOT);
            event.accept(ModItems.SEAFOOD_PAELLA);
            event.accept(ModItems.FRIED_CATFISH);
            event.accept(ModItems.SMOKED_EEL);
            event.accept(ModItems.GRILLED_GROUPER);
            event.accept(ModItems.GROUPER_CAPRESE);
            event.accept(ModItems.TUNA_STEAK);
            event.accept(ModItems.BARRACUDA_STEAK);
            event.accept(ModItems.BARRACUDA_BURGER);
            event.accept(ModItems.POKE_BOWL);
            event.accept(ModItems.CHEESE);
            event.accept(ModItems.CAPRESE);
            event.accept(ModItems.MINCED_MIDAS_FISH);
            event.accept(ModItems.TUNA_SLICE);
            event.accept(ModItems.TUNA_ROLL);
            event.accept(ModItems.TUNA_ROLL_SLICE);
            event.accept(ModItems.TUNA_SALAD);
            event.accept(ModItems.CRYSTAL_SHRIMP_SCAMPI);
            event.accept(ModItems.SLICED_SNATCHER_SQUID);
            event.accept(ModItems.CALAMARI);
            event.accept(ModItems.SHARK_FIN);
            event.accept(ModItems.SHARK_FIN_SOUP);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}

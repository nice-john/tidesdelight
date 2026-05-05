package net.felixlotionstein.tidesdelight.event;

import net.felixlotionstein.tidesdelight.Tidesdelight;
import net.felixlotionstein.tidesdelight.init.ModEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.BlockEvent;

@EventBusSubscriber(modid = Tidesdelight.MODID)
public class MidasTouchHandler {
    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        BlockPos pos = event.getPos();
        Level world = (Level) event.getLevel();
        Player player = event.getPlayer();
        if (player.hasEffect(ModEffects.MIDAS_TOUCH)) {
            world.setBlock(pos, Blocks.AIR.defaultBlockState(), 3);
            event.setCanceled(true);
            ItemStack drop = new ItemStack(Items.GOLD_INGOT, 1);
            Block.popResource(world, pos, drop);
        }
    }
}

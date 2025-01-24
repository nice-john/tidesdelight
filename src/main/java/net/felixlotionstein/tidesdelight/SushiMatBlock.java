package net.felixlotionstein.tidesdelight;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.*;

public class SushiMatBlock extends Block {
    public SushiMatBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                .strength(1.5f)
                .noOcclusion());
    }
}
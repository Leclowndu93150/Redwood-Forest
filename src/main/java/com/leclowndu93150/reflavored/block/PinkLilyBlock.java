package com.leclowndu93150.reflavored.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.TallFlowerBlock;

public class PinkLilyBlock extends TallFlowerBlock {
    public static final MapCodec<TallFlowerBlock> CODEC = simpleCodec(PinkLilyBlock::new);

    @Override
    public MapCodec<TallFlowerBlock> codec() {
        return CODEC;
    }

    public PinkLilyBlock(Properties properties) {
        super(properties);
    }
}

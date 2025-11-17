package com.leclowndu93150.reflavored.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.TallFlowerBlock;

public class YellowLilyBlock extends TallFlowerBlock {
    public static final MapCodec<TallFlowerBlock> CODEC = simpleCodec(YellowLilyBlock::new);

    @Override
    public MapCodec<TallFlowerBlock> codec() {
        return CODEC;
    }

    public YellowLilyBlock(Properties properties) {
        super(properties);
    }
}

package com.leclowndu93150.reflavored.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.TallFlowerBlock;

public class OrangeLilyBlock extends TallFlowerBlock {
    public static final MapCodec<TallFlowerBlock> CODEC = simpleCodec(OrangeLilyBlock::new);

    @Override
    public MapCodec<TallFlowerBlock> codec() {
        return CODEC;
    }

    public OrangeLilyBlock(Properties properties) {
        super(properties);
    }
}

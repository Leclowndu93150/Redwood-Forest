package com.leclowndu93150.redwood_forest.init;

import com.leclowndu93150.redwood_forest.RedwoodForest;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType REDWOOD = WoodType.register(new WoodType(RedwoodForest.MODID + ":redwood", BlockSetType.OAK));
}

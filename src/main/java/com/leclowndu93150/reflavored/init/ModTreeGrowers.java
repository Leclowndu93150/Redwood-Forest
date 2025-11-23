package com.leclowndu93150.reflavored.init;

import com.leclowndu93150.reflavored.Redflavored;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower REDWOOD = new TreeGrower(
            Redflavored.MODID + ":redwood",
            0.1F,
            Optional.of(ModConfiguredFeatures.MEGA_REDWOOD),
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.REDWOOD),
            Optional.empty(),
            Optional.empty(),
            Optional.empty()
    );

    public static final TreeGrower CYPRESSE = new TreeGrower(
            Redflavored.MODID + ":lavender_tree",
            0.0F,
            Optional.empty(),
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.CYPRESSE),
            Optional.empty(),
            Optional.empty(),
            Optional.empty()
    );
}

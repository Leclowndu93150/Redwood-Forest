package com.leclowndu93150.redwood_forest.init;

import com.leclowndu93150.redwood_forest.RedwoodForest;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> MEGA_REDWOOD_CHECKED = createKey("mega_redwood_checked");
    public static final ResourceKey<PlacedFeature> MEGA_REDWOOD_TREES = createKey("mega_redwood_trees");

    public static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(RedwoodForest.MODID, name));
    }

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, MEGA_REDWOOD_CHECKED, configuredFeatures.getOrThrow(ModConfiguredFeatures.MEGA_REDWOOD),
                PlacementUtils.filteredByBlockSurvival(ModBlocks.REDWOOD_SAPLING.get()));

        register(context, MEGA_REDWOOD_TREES, configuredFeatures.getOrThrow(ModConfiguredFeatures.MEGA_REDWOOD),
                PlacementUtils.countExtra(2, 0.1f, 1));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                  Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                  Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}

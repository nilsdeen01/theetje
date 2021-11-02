package me.d3rp.theetje.World.gen;

import me.d3rp.theetje.Setup.ModBlocks;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;

public class ModConfiguredFeatures {
    public static final ConfiguredFeature<?, ?> MINT_CONFIG = Feature.FLOWER.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.MINT.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(6).build())
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(1);
}

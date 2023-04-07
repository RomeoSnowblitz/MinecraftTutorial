package net.romeosnowblitz.hmh3.world.feature;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.romeosnowblitz.hmh3.Hmh3;
import net.romeosnowblitz.hmh3.block.ModBlocks;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?,?>> DARK_KEY = registryKey("dark");

    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> context) {

        register(context, DARK_KEY, Feature.TREE,
                new TreeFeatureConfig.Builder(BlockStateProvider.of(ModBlocks.DARK_LOG),
                        new StraightTrunkPlacer(3,3,2), BlockStateProvider.of(ModBlocks.DARK_LEAVES),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                        new TwoLayersFeatureSize(1, 0, 2)).build());


    }

    public static RegistryKey<ConfiguredFeature<?,?>> registryKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Hmh3.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register
            (Registerable<ConfiguredFeature<?,?>> context, RegistryKey<ConfiguredFeature<?,?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}

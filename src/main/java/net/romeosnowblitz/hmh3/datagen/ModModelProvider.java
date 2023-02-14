package net.romeosnowblitz.hmh3.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.romeosnowblitz.hmh3.block.ModBlocks;
import net.romeosnowblitz.hmh3.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CEMENT);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SCULK_SPONGE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.XP_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BOOM_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BEATING_STICK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BAGEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_BAGEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAND_TILLER, Models.GENERATED);
    }
}

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
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BROWN_WOOL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BROWN_STAINED_GLASS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BEATING_STICK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BAGEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_BAGEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAND_TILLER, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLEEDING_HEART, Models.GENERATED);
        itemModelGenerator.register(ModItems.SANDY_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.VITAL_FLUID, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PRISMARINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRICK_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SCULK_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LIGHT_BROWN_DYE, Models.HANDHELD);
    }
}

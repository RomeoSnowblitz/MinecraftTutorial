package net.romeosnowblitz.hmh3.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.romeosnowblitz.hmh3.block.ModBlocks;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    protected ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CEMENT);
        addDrop(ModBlocks.SCULK_SPONGE);
        addDrop(ModBlocks.XP_BLOCK);
        addDrop(ModBlocks.BOOM_BLOCK);
        addDrop(ModBlocks.TOFFEE_FLOWER);
        addDrop(ModBlocks.LIGHT_BROWN_WOOL);
        addDrop(ModBlocks.LIGHT_BROWN_CARPET);
        addDrop(ModBlocks.LIGHT_BROWN_CONCRETE);
        addDrop(ModBlocks.LIGHT_BROWN_CONCRETE_POWDER);
        addDrop(ModBlocks.LIGHT_BROWN_TERRACOTTA);
        addDrop(ModBlocks.LIGHT_BROWN_GLAZED_TERRACOTTA);
        addDrop(ModBlocks.DARK_LOG);
        addDrop(ModBlocks.DARK_SAPLING);
        addDrop(ModBlocks.DARK_WOOD);
        addDrop(ModBlocks.DARK_PLANKS);
        addDrop(ModBlocks.STRIPPED_DARK_LOG);
        addDrop(ModBlocks.STRIPPED_DARK_WOOD);
        addDrop(ModBlocks.DARK_STAIRS);
        addDrop(ModBlocks.DARK_TRAPDOOR);
        addDrop(ModBlocks.DARK_BUTTON);
        addDrop(ModBlocks.DARK_PRESSURE_PLATE);
        addDrop(ModBlocks.DARK_FENCE);
        addDrop(ModBlocks.DARK_FENCE_GATE);
        addDrop(ModBlocks.CEMENT_WALL);
    }
}

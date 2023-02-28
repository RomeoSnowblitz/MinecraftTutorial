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
    }
}

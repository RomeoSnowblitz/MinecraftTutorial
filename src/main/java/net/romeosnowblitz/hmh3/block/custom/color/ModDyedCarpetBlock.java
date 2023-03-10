package net.romeosnowblitz.hmh3.block.custom.color;

import net.minecraft.block.Block;
import net.minecraft.block.CarpetBlock;

public class ModDyedCarpetBlock extends CarpetBlock {
    private final Block modDyeColor;

    public ModDyedCarpetBlock(Block modDyeColor, Settings settings) {
        super(settings);
        this.modDyeColor = modDyeColor;
    }

    public Block getModDyeColor() {
        return this.modDyeColor;
    }
}

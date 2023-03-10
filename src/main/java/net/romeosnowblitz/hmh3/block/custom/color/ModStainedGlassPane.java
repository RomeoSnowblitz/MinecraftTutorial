package net.romeosnowblitz.hmh3.block.custom.color;

import net.minecraft.block.Block;
import net.minecraft.block.PaneBlock;
import net.romeosnowblitz.hmh3.block.custom.color.ModStainable;

public class ModStainedGlassPane extends PaneBlock implements ModStainable {
    private final Block color;

    public ModStainedGlassPane(Block color, Settings settings) {
        super(settings);
        this.color = color;
        this.setDefaultState(this.stateManager.getDefaultState().with(NORTH, false)
                .with(EAST, false).with(SOUTH, false).with(WEST, false).with(WATERLOGGED, false));
    }

    public Block getColor() {
        return this.color;
    }
}

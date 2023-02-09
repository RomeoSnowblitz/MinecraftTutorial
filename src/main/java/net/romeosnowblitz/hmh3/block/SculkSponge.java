package net.romeosnowblitz.hmh3.block;

import com.google.common.collect.Lists;
import net.minecraft.block.*;
import net.minecraft.util.Pair;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.LinkedList;

public class SculkSponge extends Block {
    public static final int field_31250 = 6;
    public static final int field_31251 = 64;

    public SculkSponge(Settings settings) {
        super(settings);
    }

    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        if (!oldState.isOf(state.getBlock())) {
            this.update(world, pos);
        }
    }

    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        this.update(world, pos);
        super.neighborUpdate(state, world, pos, sourceBlock, sourcePos, notify);
    }

    protected void update(World world, BlockPos pos) {
        if (this.absorbXP(world, pos)) {
            world.setBlockState(pos, ModBlocks.XP_BLOCK.getDefaultState(), 2);
            world.syncWorldEvent(2001, pos, Block.getRawIdFromState(Blocks.WATER.getDefaultState()));
        }

    }

    private boolean absorbXP(World world, BlockPos pos) {
        LinkedList<Pair<BlockPos, Integer>> queue = Lists.newLinkedList();
        queue.add(new Pair<BlockPos, Integer>(pos, 0));
        int i = 0;
        while (!queue.isEmpty()) {
            Pair pair = (Pair)queue.poll();
            BlockPos blockPos = (BlockPos)pair.getLeft();

            int j = (Integer)pair.getRight();
            for (Direction direction : Direction.values()) {
                BlockPos blockPos2 = blockPos.offset(direction);
                BlockState blockState = world.getBlockState(blockPos2);
                if (!blockState.isOf(Blocks.SCULK)) continue;
                world.setBlockState(blockPos2, Blocks.AIR.getDefaultState(), Block.NOTIFY_ALL);
                ++i;
                if (j >= 6) continue;
                queue.add(new Pair<BlockPos, Integer>(blockPos2, j + 1));
            }
            for (Direction direction : Direction.values()) {
                BlockPos blockPos2 = blockPos.offset(direction);
                BlockState blockState = world.getBlockState(blockPos2);
                if (!blockState.isOf(Blocks.SCULK_VEIN)) continue;
                world.setBlockState(blockPos2, Blocks.AIR.getDefaultState(), Block.NOTIFY_ALL);
                ++i;
                if (j >= 6) continue;
                queue.add(new Pair<BlockPos, Integer>(blockPos2, j + 1));
            }
            for (Direction direction : Direction.values()) {
                BlockPos blockPos2 = blockPos.offset(direction);
                BlockState blockState = world.getBlockState(blockPos2);
                if (!blockState.isOf(Blocks.SCULK_SHRIEKER)) continue;
                world.setBlockState(blockPos2, Blocks.AIR.getDefaultState(), Block.NOTIFY_ALL);
                ++i;
                if (j >= 6) continue;
                queue.add(new Pair<BlockPos, Integer>(blockPos2, j + 1));
            }
            for (Direction direction : Direction.values()) {
                BlockPos blockPos2 = blockPos.offset(direction);
                BlockState blockState = world.getBlockState(blockPos2);
                if (!blockState.isOf(Blocks.SCULK_CATALYST)) continue;
                world.setBlockState(blockPos2, Blocks.AIR.getDefaultState(), Block.NOTIFY_ALL);
                ++i;
                if (j >= 6) continue;
                queue.add(new Pair<BlockPos, Integer>(blockPos2, j + 1));
            }
            for (Direction direction : Direction.values()) {
                BlockPos blockPos2 = blockPos.offset(direction);
                BlockState blockState = world.getBlockState(blockPos2);
                if (!blockState.isOf(Blocks.SCULK_SENSOR)) continue;
                world.setBlockState(blockPos2, Blocks.AIR.getDefaultState(), Block.NOTIFY_ALL);
                ++i;
                if (j >= 6) continue;
                queue.add(new Pair<BlockPos, Integer>(blockPos2, j + 1));
            }
            if (i <= 64) continue;
            break;
        }
        return i > 0;
    }
}

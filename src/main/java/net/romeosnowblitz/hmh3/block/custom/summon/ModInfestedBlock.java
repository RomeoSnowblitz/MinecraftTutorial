package net.romeosnowblitz.hmh3.block.custom.summon;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.EndermiteEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;

public class ModInfestedBlock extends Block {

    public ModInfestedBlock(Block regularBlock, Settings settings) {
        super(settings.hardness(regularBlock.getHardness() / 2.0F).resistance(0.75F));
    }

    private void spawnEndermite(ServerWorld world, BlockPos pos) {
        EndermiteEntity endermite = (EndermiteEntity) EntityType.ENDERMITE.create(world);
        if (endermite != null) {
            endermite.refreshPositionAndAngles((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, 0.0F, 0.0F);
            world.spawnEntity(endermite);
            endermite.playSpawnEffects();
        }
    }

    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack, boolean dropExperience) {
        super.onStacksDropped(state, world, pos, stack, dropExperience);
        if (world.getGameRules().getBoolean(GameRules.DO_TILE_DROPS) && EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            this.spawnEndermite(world, pos);
        }

    }



}

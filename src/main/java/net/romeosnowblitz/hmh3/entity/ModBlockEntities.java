package net.romeosnowblitz.hmh3.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh3.Hmh3;
import net.romeosnowblitz.hmh3.block.ModBlocks;
import net.romeosnowblitz.hmh3.block.custom.piston.ModPistonBlockEntity;

public class ModBlockEntities {

    public static BlockEntityType<ModPistonBlockEntity> MOD_PISTON;

    public static void registerAllBlockEntities() {
        MOD_PISTON = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Hmh3.MOD_ID, "piston"),
                FabricBlockEntityTypeBuilder.create(ModPistonBlockEntity::new, ModBlocks.MOD_MOVING_PISTON).build(null));
    }


}

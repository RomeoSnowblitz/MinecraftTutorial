package net.romeosnowblitz.hmh3.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh3.Hmh3;
import net.romeosnowblitz.hmh3.entity.entity.FluffersEntity;

public class ModEntities {

    public static final EntityType<FluffersEntity> FLUFFERS =
            Registry.register(Registries.ENTITY_TYPE, new Identifier(Hmh3.MOD_ID, "fluffers"),
                    FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FluffersEntity::new)
                            .dimensions(EntityDimensions.fixed(0.5f, 0.75f)).build());

}

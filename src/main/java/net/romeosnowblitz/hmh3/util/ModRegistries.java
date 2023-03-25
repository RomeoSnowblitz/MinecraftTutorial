package net.romeosnowblitz.hmh3.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FlattenableBlockRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.Blocks;
import net.romeosnowblitz.hmh3.block.ModBlocks;
import net.romeosnowblitz.hmh3.entity.ModEntities;
import net.romeosnowblitz.hmh3.entity.entity.FluffersEntity;

public class ModRegistries {

    public static void ModStuffs(){
        ModStrippables();
        ModFlammables();
        ModFlattenables();
        ModOxidizables();
        registerAttributes();
    }


    public static void ModStrippables() {
        StrippableBlockRegistry.register(Blocks.OCHRE_FROGLIGHT, Blocks.PEARLESCENT_FROGLIGHT);
        StrippableBlockRegistry.register(Blocks.PEARLESCENT_FROGLIGHT, Blocks.VERDANT_FROGLIGHT);
        StrippableBlockRegistry.register(Blocks.VERDANT_FROGLIGHT, Blocks.OCHRE_FROGLIGHT);

        StrippableBlockRegistry.register(ModBlocks.DARK_LOG, ModBlocks.STRIPPED_DARK_LOG);
        StrippableBlockRegistry.register(ModBlocks.DARK_WOOD, ModBlocks.STRIPPED_DARK_WOOD);
    }

    public static void ModFlammables (){
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();
        instance.add(ModBlocks.DARK_WOOD, 5, 5);
        instance.add(ModBlocks.DARK_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_DARK_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_DARK_LOG, 5, 5);
        instance.add(ModBlocks.DARK_PLANKS, 3, 10);
        instance.add(ModBlocks.DARK_LEAVES, 1, 20);
    }

    public static void ModFlattenables (){
        FlattenableBlockRegistry.register(Blocks.STONE, Blocks.COBBLESTONE.getDefaultState());
    }

    public static void ModOxidizables (){
        OxidizableBlocksRegistry.registerOxidizableBlockPair(Blocks.DIAMOND_ORE, Blocks.STONE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(Blocks.BLACK_CONCRETE_POWDER, Blocks.BLACK_CONCRETE);
    }

    private static void registerAttributes(){
        FabricDefaultAttributeRegistry.register(ModEntities.FLUFFERS, FluffersEntity.setAttributes());
    }

}

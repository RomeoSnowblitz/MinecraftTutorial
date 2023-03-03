package net.romeosnowblitz.hmh3.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.BlockView;
import net.romeosnowblitz.hmh3.Hmh3;
import net.romeosnowblitz.hmh3.fluid.ModFluids;
import net.romeosnowblitz.hmh3.item.ModItemGroup;

public class ModBlocks {

    public static final Block CEMENT = registerBlock("cement", new Block(AbstractBlock.Settings.of(Material.SOIL).requiresTool().emissiveLighting(ModBlocks::always).luminance((state)->{return 15;})), ModItemGroup.MOD_BLOCKS);
    public static final Block SCULK_SPONGE = registerBlock("sculk_sponge", new SculkSponge(AbstractBlock.Settings.of(Material.SPONGE)), ModItemGroup.MOD_BLOCKS);
    public static final Block XP_BLOCK = registerBlock("xp_block", new ExperienceDroppingBlock(AbstractBlock.Settings.of(Material.GLASS), UniformIntProvider.create(1, 1000)), ModItemGroup.MOD_BLOCKS);
    public static final Block BOOM_BLOCK = registerBlock("boom_block", new BoomBlock(AbstractBlock.Settings.of(Material.SOIL).noCollision().emissiveLighting(ModBlocks::always).luminance((state)->{return 15;})), ModItemGroup.MOD_BLOCKS);
    public static final Block BLEEDING_HEART_BUSH = registerBlock("bleeding_heart_bush", new BleedingHeartBush(AbstractBlock.Settings.of(Material.PLANT).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH)), ModItemGroup.MOD_BLOCKS);
    public static final Block SANDLAND = registerBlock("sandland", new SandLand(AbstractBlock.Settings.of(Material.SOIL).ticksRandomly()), ModItemGroup.MOD_BLOCKS);
    public static final Block SANDY_CARROT_BLOCK = registerBlock("sandy_carrot_block", new SandyCarrotBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP)), ModItemGroup.MOD_BLOCKS);
    public static final Block VITAL_FLUID_BLOCK = registerBlockWithoutBlockItem("vital_fluid_block", new ModFluidBlock(ModFluids.VITAL_FLUID_STILL, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()), ModItemGroup.MOD_BLOCKS);

    public static final Block TOFFEE_FLOWER = registerBlock("toffee_flower", new ToffeeRoseBlock(StatusEffects.SATURATION, 7, AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offsetType(AbstractBlock.OffsetType.XZ)), ModItemGroup.MOD_BLOCKS);
    public static final Block LIGHT_BROWN_WOOL = registerBlock("light_brown_wool", new Block(AbstractBlock.Settings.of(Material.WOOL)), ModItemGroup.MOD_BLOCKS);
    public static final Block LIGHT_BROWN_CARPET = registerBlock("light_brown_carpet", new ModDyedCarpetBlock(LIGHT_BROWN_WOOL, AbstractBlock.Settings.of(Material.WOOL)), ModItemGroup.MOD_BLOCKS);
    public static final Block LIGHT_BROWN_STAINED_GLASS = registerBlock("light_brown_stained_glass", new GlassBlock(AbstractBlock.Settings.copy(Blocks.GLASS)), ModItemGroup.MOD_BLOCKS);
    public static final Block LIGHT_BROWN_STAINED_GLASS_PANE = registerBlock("light_brown_stained_glass_pane", new ModStainedGlassPane(LIGHT_BROWN_WOOL, AbstractBlock.Settings.copy(Blocks.GLASS_PANE)), ModItemGroup.MOD_BLOCKS);

    private static Boolean never(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return false;
    }

    private static Boolean always(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return true;
    }

    private static boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    private static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registries.BLOCK, new Identifier(Hmh3.MOD_ID, name), block);
    }

    public static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Hmh3.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register((Registries.ITEM), new Identifier(Hmh3.MOD_ID, name),
        new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        Hmh3.LOGGER.info("Registering Mod Blocks For " + Hmh3.MOD_ID);
    }

}

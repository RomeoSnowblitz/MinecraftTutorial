package net.romeosnowblitz.hmh3.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.romeosnowblitz.hmh3.Hmh3;
import net.romeosnowblitz.hmh3.block.custom.*;
import net.romeosnowblitz.hmh3.block.custom.color.ModDyedCarpetBlock;
import net.romeosnowblitz.hmh3.block.custom.color.ModStainedGlassPane;
import net.romeosnowblitz.hmh3.block.custom.color.ToffeeRoseBlock;
import net.romeosnowblitz.hmh3.block.custom.crop.BleedingHeartBush;
import net.romeosnowblitz.hmh3.block.custom.crop.SandLand;
import net.romeosnowblitz.hmh3.block.custom.crop.SandyCarrotBlock;
import net.romeosnowblitz.hmh3.block.custom.piston.ModPistonBlock;
import net.romeosnowblitz.hmh3.block.custom.piston.ModPistonExtensionBlock;
import net.romeosnowblitz.hmh3.block.custom.piston.ModPistonHeadBlock;
import net.romeosnowblitz.hmh3.fluid.ModFluids;
import net.romeosnowblitz.hmh3.item.ModItemGroup;
import net.romeosnowblitz.hmh3.world.feature.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class ModBlocks {

    public static final Block CEMENT = registerBlock("cement", new Block(AbstractBlock.Settings.of(Material.STONE).hardness(1.0f).requiresTool().emissiveLighting(ModBlocks::always).luminance((state)->{return 15;})), ModItemGroup.MOD_BLOCKS);
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
    public static final Block LIGHT_BROWN_STAINED_GLASS_PANE = registerBlock("light_brown_stained_glass_pane", new ModStainedGlassPane(LIGHT_BROWN_STAINED_GLASS, AbstractBlock.Settings.copy(Blocks.GLASS_PANE)), ModItemGroup.MOD_BLOCKS);
    public static final Block LIGHT_BROWN_CONCRETE = registerBlock("light_brown_concrete", new Block(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)), ModItemGroup.MOD_BLOCKS);
    public static final Block LIGHT_BROWN_CONCRETE_POWDER = registerBlock("light_brown_concrete_powder", new ConcretePowderBlock(LIGHT_BROWN_CONCRETE, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE_POWDER)), ModItemGroup.MOD_BLOCKS);
    public static final Block LIGHT_BROWN_TERRACOTTA = registerBlock("light_brown_terracotta", new Block(AbstractBlock.Settings.copy(Blocks.TERRACOTTA)), ModItemGroup.MOD_BLOCKS);
    public static final Block LIGHT_BROWN_GLAZED_TERRACOTTA = registerBlock("light_brown_glazed_terracotta", new GlazedTerracottaBlock(AbstractBlock.Settings.copy(Blocks.BROWN_GLAZED_TERRACOTTA)), ModItemGroup.MOD_BLOCKS);
    public static final Block LIGHT_BROWN_CANDLE = registerBlock("light_brown_candle", new CandleBlock(AbstractBlock.Settings.copy(Blocks.CANDLE)), ModItemGroup.MOD_BLOCKS);
    public static final Block LIGHT_BROWN_CANDLE_CAKE = registerBlock("light_brown_candle_cake", new CandleCakeBlock(LIGHT_BROWN_CANDLE, AbstractBlock.Settings.copy(Blocks.CANDLE_CAKE)), ModItemGroup.MOD_BLOCKS);
    public static final Block DARK_LOG = registerBlock("dark_log", new PillarBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD)), ModItemGroup.MOD_BLOCKS);
    public static final Block DARK_LEAVES = registerBlock("dark_leaves", new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2f).sounds(BlockSoundGroup.GRASS).nonOpaque().suffocates(ModBlocks::never).blockVision(ModBlocks::never)), ModItemGroup.MOD_BLOCKS);
    public static final Block DARK_SAPLING = registerBlock("dark_sapling", new SaplingBlock(new SaplingGenerator() {@Nullable @Override protected RegistryKey<ConfiguredFeature<?, ?>>
        getTreeFeature(Random random, boolean bees) {return ModConfiguredFeatures.DARK_KEY;}}, FabricBlockSettings.copy(Blocks.OAK_SAPLING).sounds(BlockSoundGroup.GRASS)), ModItemGroup.MOD_BLOCKS);
    public static final Block DARK_WOOD = registerBlock("dark_wood", new PillarBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD)), ModItemGroup.MOD_BLOCKS);
    public static final Block DARK_PLANKS = registerBlock("dark_planks", new Block(AbstractBlock.Settings.of(Material.WOOD).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), ModItemGroup.MOD_BLOCKS);
    public static final Block STRIPPED_DARK_LOG = registerBlock("stripped_dark_log", new PillarBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD)), ModItemGroup.MOD_BLOCKS);
    public static final Block STRIPPED_DARK_WOOD = registerBlock("stripped_dark_wood", new PillarBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD)), ModItemGroup.MOD_BLOCKS);
    public static final Block DARK_SLAB = registerBlock("dark_slab", new SlabBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), ModItemGroup.MOD_BLOCKS);
    public static final Block DARK_STAIRS = registerBlock("dark_stairs", new StairsBlock(DARK_PLANKS.getDefaultState(),AbstractBlock.Settings.of(Material.WOOD).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), ModItemGroup.MOD_BLOCKS);
    public static final Block DARK_DOOR = registerBlock("dark_door", new DoorBlock(AbstractBlock.Settings.of(Material.WOOD, DARK_PLANKS.getDefaultMapColor()).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque(), SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN), ModItemGroup.MOD_BLOCKS);
    public static final Block DARK_TRAPDOOR = registerBlock("dark_trapdoor", new TrapdoorBlock(AbstractBlock.Settings.of(Material.WOOD, DARK_PLANKS.getDefaultMapColor()).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque(), SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN), ModItemGroup.MOD_BLOCKS);
    public static final Block DARK_BUTTON = registerBlock("dark_button", new ButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f).sounds(BlockSoundGroup.WOOD), 30, true, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON), ModItemGroup.MOD_BLOCKS);
    public static final Block DARK_PRESSURE_PLATE = registerBlock("dark_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.of(Material.WOOD, DARK_PLANKS.getDefaultMapColor()).noCollision().strength(0.5f).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON), ModItemGroup.MOD_BLOCKS);
    public static final Block DARK_FENCE = registerBlock("dark_fence", new FenceBlock(AbstractBlock.Settings.of(Material.WOOD, DARK_PLANKS.getDefaultMapColor()).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), ModItemGroup.MOD_BLOCKS);
    public static final Block DARK_FENCE_GATE = registerBlock("dark_fence_gate", new FenceGateBlock(AbstractBlock.Settings.of(Material.WOOD, DARK_PLANKS.getDefaultMapColor()).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN), ModItemGroup.MOD_BLOCKS);
    public static final Block CEMENT_WALL = registerBlock("cement_wall", new WallBlock(AbstractBlock.Settings.copy(CEMENT)),ModItemGroup.MOD_BLOCKS);
    public static final Block MAGMA_PISTON = registerBlock("magma_piston", ModBlocks.createPistonBlock(true), ModItemGroup.MOD_BLOCKS);
    public static final Block MOD_PISTON_HEAD = registerBlock("mod_piston_head", new ModPistonHeadBlock(AbstractBlock.Settings.of(Material.PISTON).strength(1.5f).dropsNothing()), ModItemGroup.MOD_BLOCKS);
    public static final Block MOD_MOVING_PISTON = registerBlock("mod_moving_piston", new ModPistonExtensionBlock(AbstractBlock.Settings.of(Material.PISTON).strength(-1.0f).dynamicBounds().dropsNothing().nonOpaque().solidBlock(ModBlocks::never).suffocates(ModBlocks::never).blockVision(ModBlocks::never)), ModItemGroup.MOD_BLOCKS);

    

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

    private static ModPistonBlock createPistonBlock(boolean magma) {
        AbstractBlock.ContextPredicate contextPredicate = (state, world, pos) -> !state.get(ModPistonBlock.EXTENDED);
        return new ModPistonBlock(magma, AbstractBlock.Settings.of(Material.PISTON).strength(1.5f).solidBlock(ModBlocks::never).suffocates(contextPredicate).blockVision(contextPredicate));
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

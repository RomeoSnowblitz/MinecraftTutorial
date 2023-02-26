package net.romeosnowblitz.hmh3.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh3.Hmh3;
import net.romeosnowblitz.hmh3.block.ModBlocks;
import net.romeosnowblitz.hmh3.fluid.ModFluids;

public class ModItems {

    public static final Item BEATING_STICK = registerItem("beating_stick", new Item(new FabricItemSettings()));
    public static final Item BAGEL = registerItem("bagel", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).build())));
    public static final Item GOLDEN_BAGEL = registerItem("golden_bagel", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 260, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2600, 0), 1.0f).build())));
    public static final Item SAND_TILLER = registerItem("sand_tiller", new SandTiller(new FabricItemSettings()));
    public static final Item BLEEDING_HEART = registerItem("bleeding_heart", new AliasedBlockItem(ModBlocks.BLEEDING_HEART_BUSH, new Item.Settings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 9), 0.5f).build())));
    public static final Item SANDY_CARROT = registerItem("sandy_carrot", new AliasedBlockItem(ModBlocks.SANDY_CARROT_BLOCK, (new Item.Settings()).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 100, 9), 0.5f).build())));
    public static final Item VITAL_FLUID = registerItem("vital_fluid", new MultiPurposeBucket(ModFluids.VITAL_FLUID_STILL, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item OBSIDIAN_PICKAXE = registerItem("obsidian_pickaxe", new PickaxeItem(ModToolMaterials.OBSIDIAN, 6, -0.5f, new  FabricItemSettings()));
    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword", new AmethystSword(ModToolMaterials.AMETHYST, 10, -2.5f, new  FabricItemSettings()));
    public static final Item PRISMARINE_AXE = registerItem("prismarine_axe", new AxeItem(ModToolMaterials.PRISMARINE, 8, -1.0f, new  FabricItemSettings()));
    public static final Item BRICK_SHOVEL = registerItem("brick_shovel", new BrickShovel(ModToolMaterials.BRICK, 2, 0f, new  FabricItemSettings()));
    public static final Item SCULK_HOE = registerItem("sculk_hoe", new HoeItem(ModToolMaterials.SCULK, 1, 0f, new  FabricItemSettings()));
    public static final Item BONE_BOW = registerItem("bone_bow", new BowItem(new  FabricItemSettings().maxDamage(600)));

    public static final Item NETHER_BRICK_HELMET = registerItem("nether_brick_helmet", new ArmorItem(ModArmorMaterials.NETHER_BRICK, EquipmentSlot.HEAD, new  FabricItemSettings()));
    public static final Item NETHER_BRICK_CHESTPLATE = registerItem("nether_brick_chestplate", new ArmorItem(ModArmorMaterials.NETHER_BRICK, EquipmentSlot.CHEST, new  FabricItemSettings()));
    public static final Item NETHER_BRICK_LEGGINGS = registerItem("nether_brick_leggings", new ArmorItem(ModArmorMaterials.NETHER_BRICK, EquipmentSlot.LEGS, new  FabricItemSettings()));
    public static final Item NETHER_BRICK_BOOTS = registerItem("nether_brick_boots", new ArmorItem(ModArmorMaterials.NETHER_BRICK, EquipmentSlot.FEET, new  FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Hmh3.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        addToItemGroup(ModItemGroup.MOD_ITEMS, BEATING_STICK);
        addToItemGroup(ModItemGroup.MOD_ITEMS, BAGEL);
        addToItemGroup(ModItemGroup.MOD_ITEMS, GOLDEN_BAGEL);
        addToItemGroup(ModItemGroup.MOD_ITEMS, SAND_TILLER);
        addToItemGroup(ModItemGroup.MOD_ITEMS, BLEEDING_HEART);
        addToItemGroup(ModItemGroup.MOD_ITEMS, SANDY_CARROT);
        addToItemGroup(ModItemGroup.MOD_ITEMS, VITAL_FLUID);
        addToItemGroup(ModItemGroup.MOD_ITEMS, OBSIDIAN_PICKAXE);
        addToItemGroup(ModItemGroup.MOD_ITEMS, AMETHYST_SWORD);
        addToItemGroup(ModItemGroup.MOD_ITEMS, PRISMARINE_AXE);
        addToItemGroup(ModItemGroup.MOD_ITEMS, BRICK_SHOVEL);
        addToItemGroup(ModItemGroup.MOD_ITEMS, SCULK_HOE);
        addToItemGroup(ModItemGroup.MOD_ITEMS, BONE_BOW);
        addToItemGroup(ModItemGroup.MOD_ITEMS, NETHER_BRICK_HELMET);
        addToItemGroup(ModItemGroup.MOD_ITEMS, NETHER_BRICK_CHESTPLATE);
        addToItemGroup(ModItemGroup.MOD_ITEMS, NETHER_BRICK_LEGGINGS);
        addToItemGroup(ModItemGroup.MOD_ITEMS, NETHER_BRICK_BOOTS);
    }

    public static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        Hmh3.LOGGER.info("Registering Items for " + Hmh3.MOD_ID);
        addItemsToItemGroup();
    }

}

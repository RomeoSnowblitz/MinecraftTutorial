package net.romeosnowblitz.hmh3.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh3.Hmh3;
import net.romeosnowblitz.hmh3.block.ModBlocks;

public class ModItems {

    public static final Item BEATING_STICK = registerItem("beating_stick", new Item(new FabricItemSettings()));
    public static final Item BAGEL = registerItem("bagel", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).build())));
    public static final Item GOLDEN_BAGEL = registerItem("golden_bagel", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 260, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2600, 0), 1.0f).build())));
    public static final Item SAND_TILLER = registerItem("sand_tiller", new SandTiller(new FabricItemSettings()));
    public static final Item BLEEDING_HEART = registerItem("bleeding_heart", new AliasedBlockItem(ModBlocks.BLEEDING_HEART_BUSH, new Item.Settings().food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 9), 0.5f).build())));
    public static final Item SANDY_CARROT = registerItem("sandy_carrot", new AliasedBlockItem(ModBlocks.SANDY_CARROT_BLOCK, (new Item.Settings()).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 100, 9), 0.5f).build())));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Hmh3.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        addToItemGroup(ModItemGroup.MOD_ITEMS, BEATING_STICK);
        addToItemGroup(ModItemGroup.MOD_ITEMS, BAGEL);
        addToItemGroup(ModItemGroup.MOD_ITEMS, GOLDEN_BAGEL);
        addToItemGroup(ModItemGroup.MOD_ITEMS, SAND_TILLER);
        addToItemGroup(ModItemGroup.MOD_ITEMS, BLEEDING_HEART);
    }

    public static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        Hmh3.LOGGER.info("Registering Items for " + Hmh3.MOD_ID);
        addItemsToItemGroup();
    }

}

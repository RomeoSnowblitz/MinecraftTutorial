package net.romeosnowblitz.hmh3.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh3.Hmh3;

public class ModItems {

    public static final Item BEATING_STICK = registerItem("beating_stick", new Item(new FabricItemSettings()));

    public static final Item BAGEL = registerItem("bagel", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f).build())));

    public static final Item GOLDEN_BAGEL = registerItem("golden_bagel", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.7f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 260, 0), 1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2600, 0), 1.0f).build())));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Hmh3.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        addToItemGroup(ModItemGroup.MOD_ITEMS, BEATING_STICK);
        addToItemGroup(ModItemGroup.MOD_ITEMS, BAGEL);
        addToItemGroup(ModItemGroup.MOD_ITEMS, GOLDEN_BAGEL);
    }

    public static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        Hmh3.LOGGER.info("Registering Items for " + Hmh3.MOD_ID);
        addItemsToItemGroup();
    }

}

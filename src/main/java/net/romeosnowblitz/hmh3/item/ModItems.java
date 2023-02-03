package net.romeosnowblitz.hmh3.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh3.Hmh3;

public class ModItems {

    public static final Item BEATING_STICK = registerItem("beating_stick", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Hmh3.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        addToItemGroup(ModItemGroup.MOD_ITEMS, BEATING_STICK);
    }

    public static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        Hmh3.LOGGER.info("Registering Items for " + Hmh3.MOD_ID);
        addItemsToItemGroup();
    }

}

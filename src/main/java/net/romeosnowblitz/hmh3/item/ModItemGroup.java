package net.romeosnowblitz.hmh3.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh3.Hmh3;
import net.romeosnowblitz.hmh3.block.ModBlocks;

public class ModItemGroup {

    public static ItemGroup MOD_ITEMS;
    public static ItemGroup MOD_BLOCKS;

    public static void registerModItemGroup() {
        MOD_ITEMS = FabricItemGroup.builder(new Identifier(Hmh3.MOD_ID, "items"))
                .displayName(Text.literal("Mod Items"))
                .icon(() -> new ItemStack(Items.BLUE_ORCHID)).build();

        MOD_BLOCKS = FabricItemGroup.builder(new Identifier(Hmh3.MOD_ID, "blocks"))
                .displayName(Text.literal("Mod Blocks"))
                .icon(() -> new ItemStack(ModBlocks.CEMENT)).build();
    }

}

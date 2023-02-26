package net.romeosnowblitz.hmh3.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class NetherBrickPerk extends ArmorItem {
    public NetherBrickPerk(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }


    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(!world.isClient()){
            if(entity instanceof PlayerEntity player){
                ItemStack headPiece = player.getEquippedStack(EquipmentSlot.HEAD);
                ItemStack chestPiece = player.getEquippedStack(EquipmentSlot.CHEST);
                ItemStack legPiece = player.getEquippedStack(EquipmentSlot.LEGS);
                ItemStack footPiece = player.getEquippedStack(EquipmentSlot.FEET);
                if (headPiece.isOf(ModItems.NETHER_BRICK_HELMET) ||
                        chestPiece.isOf(ModItems.NETHER_BRICK_CHESTPLATE) ||
                        legPiece.isOf(ModItems.NETHER_BRICK_LEGGINGS) ||
                        footPiece.isOf(ModItems.NETHER_BRICK_BOOTS)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 60, 0, false, false, true));
                }
                if (headPiece.isOf(ModItems.NETHER_BRICK_HELMET) && chestPiece.isOf(ModItems.NETHER_BRICK_CHESTPLATE)  ||
                        headPiece.isOf(ModItems.NETHER_BRICK_HELMET) && legPiece.isOf(ModItems.NETHER_BRICK_LEGGINGS) ||
                        headPiece.isOf(ModItems.NETHER_BRICK_HELMET) && footPiece.isOf(ModItems.NETHER_BRICK_BOOTS) ||
                        chestPiece.isOf(ModItems.NETHER_BRICK_CHESTPLATE) && legPiece.isOf(ModItems.NETHER_BRICK_LEGGINGS) ||
                        chestPiece.isOf(ModItems.NETHER_BRICK_CHESTPLATE) && footPiece.isOf(ModItems.NETHER_BRICK_BOOTS) ||
                        legPiece.isOf(ModItems.NETHER_BRICK_LEGGINGS) && footPiece.isOf(ModItems.NETHER_BRICK_BOOTS)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 60, 1, false, false, true));
                }
                if (chestPiece.isOf(ModItems.NETHER_BRICK_CHESTPLATE) && legPiece.isOf(ModItems.NETHER_BRICK_LEGGINGS) && footPiece.isOf(ModItems.NETHER_BRICK_BOOTS)  ||
                        headPiece.isOf(ModItems.NETHER_BRICK_HELMET) && legPiece.isOf(ModItems.NETHER_BRICK_LEGGINGS) && footPiece.isOf(ModItems.NETHER_BRICK_BOOTS) ||
                        headPiece.isOf(ModItems.NETHER_BRICK_HELMET) && chestPiece.isOf(ModItems.NETHER_BRICK_CHESTPLATE) && footPiece.isOf(ModItems.NETHER_BRICK_BOOTS) ||
                        headPiece.isOf(ModItems.NETHER_BRICK_HELMET) && chestPiece.isOf(ModItems.NETHER_BRICK_CHESTPLATE) && legPiece.isOf(ModItems.NETHER_BRICK_LEGGINGS)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 60, 2, false, false, true));
                }
                if (headPiece.isOf(ModItems.NETHER_BRICK_HELMET) &&
                        chestPiece.isOf(ModItems.NETHER_BRICK_CHESTPLATE) &&
                        legPiece.isOf(ModItems.NETHER_BRICK_LEGGINGS) &&
                        footPiece.isOf(ModItems.NETHER_BRICK_BOOTS)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 60, 3, false, false, true));
                }
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 209, 9, false, false, true));
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

}

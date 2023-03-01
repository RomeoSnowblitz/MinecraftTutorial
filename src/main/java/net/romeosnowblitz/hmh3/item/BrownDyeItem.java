package net.romeosnowblitz.hmh3.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Hand;

public class BrownDyeItem extends Item {
    public BrownDyeItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if(user.getWorld().isClient && hand == Hand.MAIN_HAND){
            if(entity.getType()== EntityType.SHEEP){
                SheepEntity sheep = (SheepEntity) entity;
                sheep.setColor(DyeColor.BROWN);
                if(!user.isCreative()){
                    user.getStackInHand(hand).decrement(1);
                }
            }


        }

        return super.useOnEntity(stack, user, entity, hand);
    }

}

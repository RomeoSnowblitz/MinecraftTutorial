package net.romeosnowblitz.hmh3.util;

import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh3.item.ModItems;

public class ModModelPredicateProvider {

    public static void registerModModels(){
        registerNewBow(ModItems.BONE_BOW);
    }

    private static void registerNewBow(Item bow) {
        FabricModelPredicateProviderRegistry.register(bow, new Identifier("pull"), (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0F;
            } else {
                return entity.getActiveItem() != stack ? 0.0F : (float)(stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
            }
        });
        FabricModelPredicateProviderRegistry.register(bow, new Identifier("pulling"), (stack, world, entity, seed) -> entity != null
                && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F);
    }



}

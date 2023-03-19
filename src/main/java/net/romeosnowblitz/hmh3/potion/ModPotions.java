package net.romeosnowblitz.hmh3.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh3.Hmh3;
import net.romeosnowblitz.hmh3.mixin.BrewingRecipeRegistryMixin;

public class ModPotions {
    public static Potion HASTE_POTION;
    public static Potion LONG_HASTE_POTION;
    public static Potion STRONG_HASTE_POTION;

    public static Potion registerHastePotion(String name){
        return Registry.register(Registries.POTION, new Identifier(Hmh3.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HASTE, 5120, 0)));
    }

    public static Potion registerLongHastePotion(String name){
        return Registry.register(Registries.POTION, new Identifier(Hmh3.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HASTE, 10240, 0)));
    }

    public static Potion registerStrongHastePotion(String name){
        return Registry.register(Registries.POTION, new Identifier(Hmh3.MOD_ID, name), new Potion(new StatusEffectInstance(StatusEffects.HASTE, 2560, 1)));
    }

    public static void registerPotions(){
        HASTE_POTION = registerHastePotion("haste_potion");
        LONG_HASTE_POTION = registerLongHastePotion("long_haste_potion");
        STRONG_HASTE_POTION = registerStrongHastePotion("strong_haste_potion");
        registerPotionRecipes();
    }

    private static void registerPotionRecipes(){
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.GOLD_INGOT, ModPotions.HASTE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HASTE_POTION, Items.REDSTONE, ModPotions.LONG_HASTE_POTION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HASTE_POTION, Items.GLOWSTONE_DUST, ModPotions.STRONG_HASTE_POTION);
    }


}

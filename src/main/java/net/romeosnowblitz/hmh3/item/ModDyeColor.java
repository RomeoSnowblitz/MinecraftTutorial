package net.romeosnowblitz.hmh3.item;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.block.MapColor;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.function.ValueLists;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public enum ModDyeColor implements StringIdentifiable {
    LIGHT_BROWN(1, "light_brown", 8606770, MapColor.BROWN, 5320730, 9127187);

    private static final IntFunction<ModDyeColor> BY_ID = ValueLists.createIdToValueFunction(ModDyeColor::getId, values(), ValueLists.OutOfBoundsHandling.ZERO);
    private static final Int2ObjectOpenHashMap<ModDyeColor> BY_FIREWORK_COLOR = new Int2ObjectOpenHashMap((Map) Arrays.stream(values()).collect(Collectors.toMap((color) -> {
        return color.fireworkColor;
    }, (color) -> {
        return color;
    })));
    public static final Codec<ModDyeColor> CODEC = StringIdentifiable.createCodec(ModDyeColor::values);
    private final int id;
    private final String name;
    private final MapColor mapColor;
    private final float[] colorComponents;
    private final int fireworkColor;
    private final int signColor;

    private ModDyeColor(int id, String name, int color, MapColor mapColor, int fireworkColor, int signColor) {
        this.id = id;
        this.name = name;
        this.mapColor = mapColor;
        this.signColor = signColor;
        int j = (color & 16711680) >> 16;
        int k = (color & '\uff00') >> 8;
        int l = (color & 255) >> 0;
        this.colorComponents = new float[]{(float)j / 255.0F, (float)k / 255.0F, (float)l / 255.0F};
        this.fireworkColor = fireworkColor;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public float[] getColorComponents() {
        return this.colorComponents;
    }

    public MapColor getMapColor() {
        return this.mapColor;
    }

    public int getFireworkColor() {
        return this.fireworkColor;
    }

    public int getSignColor() {
        return this.signColor;
    }

    public static ModDyeColor byId(int id) {
        return (ModDyeColor) BY_ID.apply(id);
    }

    @Nullable
    @Contract("_,!null->!null;_,null->_")
    public static ModDyeColor byName(String name, @Nullable ModDyeColor defaultColor) {
        ModDyeColor modDyeColor = (ModDyeColor) CODEC.byId(name);
        return modDyeColor != null ? modDyeColor : defaultColor;
    }

    @Nullable
    public static ModDyeColor byFireworkColor(int color) {
        return (ModDyeColor) BY_FIREWORK_COLOR.get(color);
    }

    public String toString() {
        return this.name;
    }

    public String asString() {
        return this.name;
    }
}

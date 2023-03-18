package net.romeosnowblitz.hmh3.block.custom.piston;

import net.minecraft.util.StringIdentifiable;

public enum ModPistonType implements StringIdentifiable
{
    DEFAULT("normal"),
    MAGMA("magma"),
    STICKY("sticky");

    private final String name;

    private ModPistonType(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String asString() {
        return this.name;
    }
}

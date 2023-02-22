package net.romeosnowblitz.hmh3.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.Blocks;

public class ModRegistries {

    public static void ModStrippables() {
        StrippableBlockRegistry.register(Blocks.OCHRE_FROGLIGHT, Blocks.PEARLESCENT_FROGLIGHT);
        StrippableBlockRegistry.register(Blocks.PEARLESCENT_FROGLIGHT, Blocks.VERDANT_FROGLIGHT);
        StrippableBlockRegistry.register(Blocks.VERDANT_FROGLIGHT, Blocks.OCHRE_FROGLIGHT);
    }

}

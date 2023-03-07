package net.romeosnowblitz.hmh3.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh3.Hmh3;

public class ModPaintings {

    public static final PaintingVariant LOGO = registerPainting("logo", new PaintingVariant(64, 64));
    public static final PaintingVariant ANIMATED_PAINTED = registerPainting("animated_painting", new PaintingVariant(16, 16));

    private static PaintingVariant registerPainting (String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(Hmh3.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings(){Hmh3.LOGGER.info("Registering Painting for " + Hmh3.MOD_ID);}

}

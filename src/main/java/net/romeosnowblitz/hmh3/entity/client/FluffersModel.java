package net.romeosnowblitz.hmh3.entity.client;

import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh3.Hmh3;
import net.romeosnowblitz.hmh3.entity.entity.FluffersEntity;
import software.bernie.geckolib.model.GeoModel;

public class FluffersModel extends GeoModel<FluffersEntity> {

    @Override
    public Identifier getModelResource(FluffersEntity animatable) {
        return new Identifier(Hmh3.MOD_ID, "geo/fluffers.geo.json");
    }

    @Override
    public Identifier getTextureResource(FluffersEntity animatable) {
        return new Identifier(Hmh3.MOD_ID, "textures/entity/fluffers/fluffers.png");
    }

    @Override
    public Identifier getAnimationResource(FluffersEntity animatable) {
        return new Identifier(Hmh3.MOD_ID, "animations/fluffers.animation.json");
    }
}

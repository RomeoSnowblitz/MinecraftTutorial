package net.romeosnowblitz.hmh3.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.romeosnowblitz.hmh3.Hmh3;
import net.romeosnowblitz.hmh3.entity.entity.FluffersEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class FluffersRenderer extends GeoEntityRenderer<FluffersEntity> {
    public FluffersRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new FluffersModel());
    }

    @Override
    public Identifier getTextureLocation(FluffersEntity instance){
        return new Identifier(Hmh3.MOD_ID, "textures/entity/fluffers/fluffers.png");
    }

    @Override
    public RenderLayer getRenderType(FluffersEntity animatable, Identifier texture, @Nullable VertexConsumerProvider buffersource, float partialTick){
        return super.getRenderType(animatable, texture, buffersource, partialTick);
    }

}

package net.teramod.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.teramod.entity.BeamEntity;

public class BeamRenderer extends EntityRenderer<BeamEntity> {

    private static final ResourceLocation BEAM_TEXTURE =
            new ResourceLocation(
                    "minecraft",
                    "textures/entity/end_crystal/end_crystal_beam.png");

    public BeamRenderer(
            EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public void render(
            BeamEntity entity,
            float yaw,
            float partialTicks,
            PoseStack poseStack,
            MultiBufferSource buffer,
            int packedLight) {

        System.out.println("BEAM RENDER");
    }

    @Override
    public ResourceLocation getTextureLocation(
            BeamEntity entity) {
        return BEAM_TEXTURE;
    }
}
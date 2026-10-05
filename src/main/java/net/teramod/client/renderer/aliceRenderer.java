package net.teramod.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.teramod.entity.aliceEntity;
import net.teramod.entity.model.aliceModel;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class aliceRenderer extends GeoEntityRenderer<aliceEntity> {

	public aliceRenderer(EntityRendererProvider.Context renderManager) {

		super(renderManager, new aliceModel());

		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(
			aliceEntity animatable,
			ResourceLocation texture,
			MultiBufferSource bufferSource,
			float partialTick) {

		return RenderType.entityTranslucent(
				this.getTextureLocation(animatable)
		);
	}

	@Override
	public void preRender(
			PoseStack poseStack,
			aliceEntity entity,
			BakedGeoModel model,
			MultiBufferSource bufferSource,
			VertexConsumer buffer,
			boolean isReRender,
			float partialTick,
			int packedLight,
			int packedOverlay,
			float red,
			float green,
			float blue,
			float alpha) {

		this.scaleHeight = 1f;
		this.scaleWidth = 1f;

		super.preRender(
				poseStack,
				entity,
				model,
				bufferSource,
				buffer,
				isReRender,
				partialTick,
				packedLight,
				packedOverlay,
				red,
				green,
				blue,
				alpha
		);
	}
}
package net.teramod.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.teramod.entity.aliceEntity;
import software.bernie.geckolib.model.GeoModel;

public class aliceModel extends GeoModel<aliceEntity> {

	@Override
	public ResourceLocation getAnimationResource(aliceEntity entity) {
		return new ResourceLocation(
				"teramod",
				"animations/tendoualicedaaa2.animation.json"
		);
	}

	@Override
	public ResourceLocation getModelResource(aliceEntity entity) {
		return new ResourceLocation(
				"teramod",
				"geo/tendoualicedaaa2.geo.json"
		);
	}

	@Override
	public ResourceLocation getTextureResource(aliceEntity entity) {
		return new ResourceLocation(
				"teramod",
				"textures/entities/" + entity.getTexture() + ".png"
		);
	}
}
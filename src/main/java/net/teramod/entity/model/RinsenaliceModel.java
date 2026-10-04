package net.teramod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.teramod.entity.RinsenaliceEntity;

import net.minecraft.resources.ResourceLocation;

public class RinsenaliceModel extends GeoModel<RinsenaliceEntity> {
	@Override
	public ResourceLocation getAnimationResource(RinsenaliceEntity entity) {
		return new ResourceLocation("teramod", "animations/rinsenalice.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RinsenaliceEntity entity) {
		return new ResourceLocation("teramod", "geo/rinsenalice.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RinsenaliceEntity entity) {
		return new ResourceLocation("teramod", "textures/entities/" + entity.getTexture() + ".png");
	}

}

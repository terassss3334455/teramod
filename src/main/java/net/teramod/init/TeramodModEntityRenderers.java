package net.teramod.init;

import net.teramod.client.renderer.BeamRenderer;
import net.teramod.client.renderer.RinsenaliceRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.teramod.client.renderer.aliceRenderer;

@Mod.EventBusSubscriber(
		bus = Mod.EventBusSubscriber.Bus.MOD,
		value = Dist.CLIENT
)
public class TeramodModEntityRenderers {

	@SubscribeEvent
	public static void registerEntityRenderers(
			EntityRenderersEvent.RegisterRenderers event) {

		event.registerEntityRenderer(
				TeramodModEntities.RINSENALICE.get(),
				RinsenaliceRenderer::new);

		event.registerEntityRenderer(
				TeramodModEntities.ALICE.get(),
				aliceRenderer::new);

		event.registerEntityRenderer(
				TeramodModEntities.ALICEENNKYORI_1.get(),
				ThrownItemRenderer::new);

		event.registerEntityRenderer(
				TeramodModEntities.BEAM.get(),
				BeamRenderer::new);
	}
}
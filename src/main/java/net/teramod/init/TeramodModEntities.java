
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.teramod.init;

import net.teramod.entity.BeamEntity;
import net.teramod.entity.RinsenaliceEntity;
import net.teramod.entity.Aliceennkyori1Entity;
import net.teramod.TeramodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.teramod.entity.aliceEntity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TeramodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TeramodMod.MOD_ID);
	public static final RegistryObject<EntityType<RinsenaliceEntity>> RINSENALICE = register("rinsenalice",
			EntityType.Builder.<RinsenaliceEntity>of(RinsenaliceEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(RinsenaliceEntity::new));

	public static final RegistryObject<EntityType<aliceEntity>> ALICE =
			register("alice",
					EntityType.Builder.<aliceEntity>of(
									aliceEntity::new,
									MobCategory.MONSTER
							)
							.setShouldReceiveVelocityUpdates(true)
							.setTrackingRange(100)
							.setUpdateInterval(3)
							.setCustomClientFactory(aliceEntity::new)
			);

	public static final RegistryObject<EntityType<Aliceennkyori1Entity>> ALICEENNKYORI_1 = register("aliceennkyori_1",
			EntityType.Builder.<Aliceennkyori1Entity>of(Aliceennkyori1Entity::new, MobCategory.MISC).setCustomClientFactory(Aliceennkyori1Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	public static final RegistryObject<EntityType<BeamEntity>> BEAM =
			register("beam",
					EntityType.Builder.<BeamEntity>of(
									BeamEntity::new,
									MobCategory.MISC)
							.setShouldReceiveVelocityUpdates(true)
							.setTrackingRange(64)
							.setUpdateInterval(1)
							.sized(0.1f, 0.1f));
	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}


	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RinsenaliceEntity.init();
		});
	}
	@SubscribeEvent
	public static void inis(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			aliceEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(RINSENALICE.get(), RinsenaliceEntity.createAttributes().build());

	}
	@SubscribeEvent
	public static void registerAttributes2(EntityAttributeCreationEvent event) {
		event.put(ALICE.get(), RinsenaliceEntity.createAttributes().build());

	}
}

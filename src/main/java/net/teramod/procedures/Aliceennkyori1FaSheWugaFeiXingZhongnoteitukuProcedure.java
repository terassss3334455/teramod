package net.teramod.procedures;

import net.teramod.TeramodMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

public class Aliceennkyori1FaSheWugaFeiXingZhongnoteitukuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		world.addParticle(ParticleTypes.END_ROD, x, y, z, 0, 0, 0);
		if (!immediatesourceentity.isNoGravity()) {
			if (!(immediatesourceentity == null)) {
				immediatesourceentity.setNoGravity(true);
				TeramodMod.queueServerWork(40, () -> {
					if (!immediatesourceentity.level().isClientSide())
						immediatesourceentity.discard();
				});
			}
		}
	}
}

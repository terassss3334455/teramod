
package net.teramod.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;

import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.teramod.entity.BeamEntity;
import net.teramod.init.TeramodModEntities;

import java.util.Comparator;
import java.util.List;

public class TestItem extends Item {
	public TestItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}


	@Override
	public InteractionResultHolder<ItemStack> use(
			Level level,
			Player player,
			InteractionHand hand) {

		player.startUsingItem(hand);

		return InteractionResultHolder.consume(
				player.getItemInHand(hand));
	}


	@Override
	public int getUseDuration(ItemStack stack) {
		return 72000;
	}

	@Override
	public UseAnim getUseAnimation(ItemStack stack) {
		return UseAnim.BOW;
	}
	@Override
	public void onUseTick(
			Level level,
			LivingEntity user,
			ItemStack stack,
			int remainingUseDuration) {

		if(level.isClientSide) return;

		AABB box = user.getBoundingBox().inflate(30);

		List<LivingEntity> entities =
				level.getEntitiesOfClass(
						LivingEntity.class,
						box,
						e -> e != user);

		if(entities.isEmpty()) return;

		LivingEntity nearest =
				entities.stream()
						.min(Comparator.comparingDouble(
								e -> e.distanceToSqr(user)))
						.orElse(null);

		if(nearest == null) return;

		BeamEntity beam =
				new BeamEntity(
						TeramodModEntities.BEAM.get(),
						level);

		beam.setPos(user.getX(),
				user.getEyeY(),
				user.getZ());

		beam.setTarget(nearest);

		level.addFreshEntity(beam);
	}
}

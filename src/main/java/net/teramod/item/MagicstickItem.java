package net.teramod.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;

public class MagicstickItem extends Item {

    public MagicstickItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(
            Level level,
            Player player,
            InteractionHand hand
    ) {

        player.sendSystemMessage(
                net.minecraft.network.chat.Component.literal("魔法発動！")
        );

        return InteractionResultHolder.success(
                player.getItemInHand(hand)
        );
    }
}
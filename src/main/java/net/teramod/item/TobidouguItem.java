
package net.teramod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TobidouguItem extends Item {
	public TobidouguItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.teramod.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.teramod.TeramodMod;
import net.teramod.item.MagicstickItem;
import net.teramod.item.TestItem;
import net.teramod.item.TobidouguItem;

public class TeramodModItems {
	//アイテムレジストリ登録
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TeramodMod.MOD_ID);
	//アイテム登録
	public static final RegistryObject<Item> RINSENALICE_SPAWN_EGG = ITEMS.register("rinsenalice_spawn_egg", () -> new ForgeSpawnEggItem(TeramodModEntities.RINSENALICE, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> TEST = ITEMS.register("test", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> TOBIDOUGU = ITEMS.register("tobidougu", () -> new Item (new Item.Properties()));
	public static final RegistryObject<Item> MASICSTICK = ITEMS.register("masicstick", () -> new Item(new Item.Properties()));
//イベントバス登録
	public static void registerItems(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}

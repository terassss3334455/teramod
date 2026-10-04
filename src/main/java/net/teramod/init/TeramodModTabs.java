
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.teramod.init;

import net.minecraftforge.eventbus.api.IEventBus;
import net.teramod.TeramodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.teramod.block.TeraBlocks;

public class TeramodModTabs {
	public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TeramodMod.MOD_ID);
	public static final RegistryObject<CreativeModeTab> MASICSTICK = TABS.register("masicstick",
			() -> CreativeModeTab.builder()
					.title(Component.translatable("creativetabs.teramod_tab"))
					.icon(TeramodModItems.MASICSTICK.get()::getDefaultInstance)
							.displayItems((parameters, pOutput) -> {
								pOutput.accept(TeramodModItems.MASICSTICK.get());
								pOutput.accept(TeramodModItems.RINSENALICE_SPAWN_EGG.get());
								pOutput.accept(TeramodModItems.TEST.get());
								pOutput.accept(TeraBlocks.TEST_BLOCK.get());
							})
			.build());
	public static  void register(IEventBus eventBus) {
		TABS.register(eventBus);
	}
}

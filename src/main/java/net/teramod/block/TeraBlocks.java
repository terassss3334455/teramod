package net.teramod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.teramod.TeramodMod;
import net.teramod.init.TeramodModItems;

import java.util.function.Supplier;

public class TeraBlocks {
 public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TeramodMod.MOD_ID);
 public static RegistryObject<Block> TEST_BLOCK = registerBlockItem("test_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.ANVIL)));

 private static <T extends Block> RegistryObject<T> registerBlockItem(String name,
                                                                       Supplier<T> supplier) {
  RegistryObject<T> block = BLOCKS.register(name, supplier);
  TeramodModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
  return block;
 }
 
 public static void register(IEventBus eventBus) {
  BLOCKS.register(eventBus);
 }
 }


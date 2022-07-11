package com.github.mim1q.mimicdecor.init;

import com.github.mim1q.mimicdecor.MimicDecor;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MimicBlocks {

  public static final Block TEST_BRICKS = registerBlockWithItem(
    MimicDecor.createId("test_bricks"),
    new Block(AbstractBlock.Settings.of(Material.STONE))
  );

  public static void initCommon() {
    // Load class
  }

  public static Block registerBlockWithItem(Identifier id, Block block) {
    Registry.register(Registry.BLOCK, id, block);
    Registry.register(Registry.ITEM, id, new BlockItem(block, new Item.Settings()));
    return block;
  }
}

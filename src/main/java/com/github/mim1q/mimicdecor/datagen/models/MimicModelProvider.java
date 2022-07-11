package com.github.mim1q.mimicdecor.datagen.models;

import com.github.mim1q.mimicdecor.init.MimicBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class MimicModelProvider extends FabricModelProvider {
  public MimicModelProvider(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  public void generateBlockStateModels(BlockStateModelGenerator generator) {
    generator.registerSimpleCubeAll(MimicBlocks.TEST_BRICKS);
  }

  @Override
  public void generateItemModels(ItemModelGenerator generator) {

  }
}

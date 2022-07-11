package com.github.mim1q.mimicdecor.datagen;

import com.github.mim1q.mimicdecor.datagen.models.MimicModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MimicDataGenerator implements DataGeneratorEntrypoint {
  @Override
  public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
    fabricDataGenerator.addProvider(new MimicModelProvider(fabricDataGenerator));
  }
}

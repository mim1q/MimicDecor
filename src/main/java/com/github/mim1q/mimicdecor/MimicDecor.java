package com.github.mim1q.mimicdecor;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class MimicDecor implements ModInitializer {

  public static final String MOD_ID = "mimicdecor";

  @Override
  public void onInitialize() {

  }

  public static Identifier createId(String path) {
    return new Identifier(MOD_ID, path);
  }
}

package com.github.mim1q.mimicdecor;

import com.github.mim1q.mimicdecor.init.MimicBlocks;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MimicDecor implements ModInitializer {

  public static final String MOD_ID = "mimicdecor";
  public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

  @Override
  public void onInitialize() {
    LOGGER.info("Initializing Mimic Decor!");
    MimicBlocks.initCommon();
  }

  public static Identifier createId(String path) {
    return new Identifier(MOD_ID, path);
  }
}

package com.molybdenum.alloyed.util.fabric;

import org.jetbrains.annotations.Nullable;

import net.fabricmc.loader.api.FabricLoader;

public class UtilsImpl {

    public static boolean isModLoaded(String id, @Nullable String fabricId) {
        return FabricLoader.getInstance().isModLoaded(fabricId != null ? fabricId : id);
    }

    public static boolean isDevEnv() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }
}

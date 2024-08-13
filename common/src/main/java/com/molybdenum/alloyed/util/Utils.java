package com.molybdenum.alloyed.util;

import org.jetbrains.annotations.Nullable;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class Utils {

    @ExpectPlatform
    public static boolean isModLoaded(String id, @Nullable String fabricId) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static boolean isDevEnv() {
        throw new AssertionError();
    }
}

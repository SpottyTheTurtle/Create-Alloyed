package com.molybdenum.alloyed.multiloader;

import java.util.function.Supplier;

import org.jetbrains.annotations.ApiStatus.Internal;

import dev.architectury.injectables.annotations.ExpectPlatform;

public enum Env {
    CLIENT, SERVER;

    public static final Env CURRENT = getCurrent();

    public boolean isCurrent() {
        return this == CURRENT;
    }

    public void runIfCurrent(Supplier<Runnable> run) {
        if (isCurrent()) {
            run.get().run();
        }
    }

    @Internal
    @ExpectPlatform
    public static Env getCurrent() {
        throw new AssertionError();
    }
}

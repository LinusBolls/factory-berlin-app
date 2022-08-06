package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class a0 implements Executor {
    a0() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}

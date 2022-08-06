package com.nytimes.android.external.cache;

import java.util.concurrent.Executor;

/* compiled from: DirectExecutor */
enum f implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}

package com.nytimes.android.external.cache;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: ListenableFuture */
public interface j<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}

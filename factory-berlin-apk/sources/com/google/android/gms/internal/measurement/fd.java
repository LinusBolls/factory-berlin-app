package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class fd implements ec {
    fd() {
    }

    public final <V> Callable<V> a(Callable<V> callable) {
        return callable;
    }

    public final Runnable b(Runnable runnable) {
        return runnable;
    }
}

package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public interface ec {
    <V> Callable<V> a(Callable<V> callable);

    Runnable b(Runnable runnable);
}

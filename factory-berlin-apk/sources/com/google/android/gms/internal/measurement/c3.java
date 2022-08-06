package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public abstract class c3<T> implements Serializable {
    c3() {
    }

    public static <T> c3<T> a(T t) {
        b3.b(t);
        return new e3(t);
    }

    public static <T> c3<T> d() {
        return y2.f2633g;
    }

    public abstract boolean b();

    public abstract T c();
}

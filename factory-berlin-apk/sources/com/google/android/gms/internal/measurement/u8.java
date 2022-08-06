package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class u8 {
    private static final u8 c = new u8();
    private final a9 a = new v7();
    private final ConcurrentMap<Class<?>, y8<?>> b = new ConcurrentHashMap();

    private u8() {
    }

    public static u8 a() {
        return c;
    }

    public final <T> y8<T> b(Class<T> cls) {
        b7.f(cls, "messageType");
        y8<T> y8Var = (y8) this.b.get(cls);
        if (y8Var != null) {
            return y8Var;
        }
        y8<T> a2 = this.a.a(cls);
        b7.f(cls, "messageType");
        b7.f(a2, "schema");
        y8<T> putIfAbsent = this.b.putIfAbsent(cls, a2);
        return putIfAbsent != null ? putIfAbsent : a2;
    }

    public final <T> y8<T> c(T t) {
        return b(t.getClass());
    }
}

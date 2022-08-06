package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Protobuf */
final class c1 {
    private static final c1 c = new c1();
    private final h1 a = new i0();
    private final ConcurrentMap<Class<?>, g1<?>> b = new ConcurrentHashMap();

    private c1() {
    }

    public static c1 a() {
        return c;
    }

    public <T> void b(T t, f1 f1Var, p pVar) {
        e(t).d(t, f1Var, pVar);
    }

    public g1<?> c(Class<?> cls, g1<?> g1Var) {
        a0.b(cls, "messageType");
        a0.b(g1Var, "schema");
        return this.b.putIfAbsent(cls, g1Var);
    }

    public <T> g1<T> d(Class<T> cls) {
        a0.b(cls, "messageType");
        g1<T> g1Var = (g1) this.b.get(cls);
        if (g1Var != null) {
            return g1Var;
        }
        g1<T> a2 = this.a.a(cls);
        g1<?> c2 = c(cls, a2);
        return c2 != null ? c2 : a2;
    }

    public <T> g1<T> e(T t) {
        return d(t.getClass());
    }
}

package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.j0;
import java.util.Map;

/* compiled from: MapFieldSchemaLite */
class m0 implements l0 {
    m0() {
    }

    private static <K, V> int i(int i2, Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        j0 j0Var = (j0) obj2;
        int i3 = 0;
        if (k0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : k0Var.entrySet()) {
            i3 += j0Var.a(i2, entry.getKey(), entry.getValue());
        }
        return i3;
    }

    private static <K, V> k0<K, V> j(Object obj, Object obj2) {
        k0<K, V> k0Var = (k0) obj;
        k0 k0Var2 = (k0) obj2;
        if (!k0Var2.isEmpty()) {
            if (!k0Var.p()) {
                k0Var = k0Var.t();
            }
            k0Var.s(k0Var2);
        }
        return k0Var;
    }

    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    public Object b(Object obj) {
        return k0.f().t();
    }

    public int c(int i2, Object obj, Object obj2) {
        return i(i2, obj, obj2);
    }

    public boolean d(Object obj) {
        return !((k0) obj).p();
    }

    public Object e(Object obj) {
        ((k0) obj).r();
        return obj;
    }

    public j0.a<?, ?> f(Object obj) {
        return ((j0) obj).c();
    }

    public Map<?, ?> g(Object obj) {
        return (k0) obj;
    }

    public Map<?, ?> h(Object obj) {
        return (k0) obj;
    }
}

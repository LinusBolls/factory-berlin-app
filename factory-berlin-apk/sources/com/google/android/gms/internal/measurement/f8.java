package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class f8 implements b8 {
    f8() {
    }

    public final Map<?, ?> a(Object obj) {
        return (d8) obj;
    }

    public final Object c(Object obj) {
        ((d8) obj).g();
        return obj;
    }

    public final Object d(Object obj, Object obj2) {
        d8 d8Var = (d8) obj;
        d8 d8Var2 = (d8) obj2;
        if (!d8Var2.isEmpty()) {
            if (!d8Var.h()) {
                d8Var = d8Var.f();
            }
            d8Var.e(d8Var2);
        }
        return d8Var;
    }

    public final boolean e(Object obj) {
        return !((d8) obj).h();
    }

    public final Map<?, ?> f(Object obj) {
        return (d8) obj;
    }

    public final z7<?, ?> g(Object obj) {
        a8 a8Var = (a8) obj;
        throw new NoSuchMethodError();
    }

    public final Object h(Object obj) {
        return d8.d().f();
    }

    public final int i(int i2, Object obj, Object obj2) {
        d8 d8Var = (d8) obj;
        a8 a8Var = (a8) obj2;
        if (d8Var.isEmpty()) {
            return 0;
        }
        Iterator it = d8Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}

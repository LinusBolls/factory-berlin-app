package com.apollographql.apollo.api.internal.json;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;

/* compiled from: Utils.kt */
public final class h {
    public static final void a(Object obj, f fVar) {
        k.f(fVar, "jsonWriter");
        if (obj == null) {
            fVar.F();
        } else if (obj instanceof Map) {
            fVar.b();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                fVar.D(String.valueOf(key));
                a(value, fVar);
            }
            fVar.i();
        } else if (obj instanceof List) {
            fVar.a();
            for (Object a : (Iterable) obj) {
                a(a, fVar);
            }
            fVar.h();
        } else if (obj instanceof Boolean) {
            fVar.l0((Boolean) obj);
        } else if (obj instanceof Number) {
            fVar.n0((Number) obj);
        } else {
            fVar.r0(obj.toString());
        }
    }
}

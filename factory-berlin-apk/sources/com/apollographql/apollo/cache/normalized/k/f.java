package com.apollographql.apollo.cache.normalized.k;

import com.apollographql.apollo.api.internal.json.h;
import g.a.a.h.i;
import g.a.a.h.k;
import g.a.a.h.o;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;

/* compiled from: RealCacheKeyBuilder.kt */
public final class f implements c {

    /* compiled from: RealCacheKeyBuilder.kt */
    static final class a<T> implements Comparator<String> {

        /* renamed from: g  reason: collision with root package name */
        public static final a f1831g = new a();

        a() {
        }

        /* renamed from: a */
        public final int compare(String str, String str2) {
            k.b(str2, "o2");
            return str.compareTo(str2);
        }
    }

    private final Map<String, Object> b(Map<String, ? extends Object> map, k.c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(d0.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                Map map2 = (Map) value;
                if (o.f9055g.i(map2)) {
                    value = c(map2, cVar);
                } else {
                    value = b(map2, cVar);
                }
            }
            linkedHashMap.put(key, value);
        }
        return d0.d(linkedHashMap);
    }

    private final Object c(Map<String, ? extends Object> map, k.c cVar) {
        Object obj = cVar.c().get(map.get("variableName"));
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return b((Map) obj, cVar);
        }
        if (!(obj instanceof i)) {
            return obj;
        }
        j jVar = new j(a.f1831g);
        ((i) obj).a().a(jVar);
        return b(jVar.g(), cVar);
    }

    public String a(o oVar, k.c cVar) {
        kotlin.jvm.internal.k.f(oVar, "field");
        kotlin.jvm.internal.k.f(cVar, "variables");
        if (oVar.a().isEmpty()) {
            return oVar.c();
        }
        Map<String, Object> b = b(oVar.a(), cVar);
        try {
            l.f fVar = new l.f();
            com.apollographql.apollo.api.internal.json.f a2 = com.apollographql.apollo.api.internal.json.f.f1818n.a(fVar);
            a2.Z(true);
            h.a(b, a2);
            a2.close();
            x xVar = x.a;
            String format = String.format("%s(%s)", Arrays.copyOf(new Object[]{oVar.c(), fVar.P0()}, 2));
            kotlin.jvm.internal.k.b(format, "java.lang.String.format(format, *args)");
            return format;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.f;
import com.google.gson.internal.c;
import com.google.gson.internal.e;
import com.google.gson.internal.h;
import com.google.gson.internal.k;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.s;
import com.google.gson.stream.b;
import com.google.gson.t;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public final class MapTypeAdapterFactory implements t {

    /* renamed from: g  reason: collision with root package name */
    private final c f4257g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f4258h;

    private final class a<K, V> extends s<Map<K, V>> {
        private final s<K> a;
        private final s<V> b;
        private final h<? extends Map<K, V>> c;

        public a(f fVar, Type type, s<K> sVar, Type type2, s<V> sVar2, h<? extends Map<K, V>> hVar) {
            this.a = new c(fVar, sVar, type);
            this.b = new c(fVar, sVar2, type2);
            this.c = hVar;
        }

        private String e(l lVar) {
            if (lVar.k()) {
                o e2 = lVar.e();
                if (e2.y()) {
                    return String.valueOf(e2.q());
                }
                if (e2.s()) {
                    return Boolean.toString(e2.l());
                }
                if (e2.z()) {
                    return e2.r();
                }
                throw new AssertionError();
            } else if (lVar.i()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: f */
        public Map<K, V> b(com.google.gson.stream.a aVar) {
            b Z = aVar.Z();
            if (Z == b.NULL) {
                aVar.L();
                return null;
            }
            Map<K, V> map = (Map) this.c.a();
            if (Z == b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.hasNext()) {
                    aVar.a();
                    K b2 = this.a.b(aVar);
                    if (map.put(b2, this.b.b(aVar)) == null) {
                        aVar.k();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + b2);
                    }
                }
                aVar.k();
            } else {
                aVar.b();
                while (aVar.hasNext()) {
                    e.a.a(aVar);
                    K b3 = this.a.b(aVar);
                    if (map.put(b3, this.b.b(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + b3);
                    }
                }
                aVar.l();
            }
            return map;
        }

        /* renamed from: g */
        public void d(com.google.gson.stream.c cVar, Map<K, V> map) {
            if (map == null) {
                cVar.D();
            } else if (!MapTypeAdapterFactory.this.f4258h) {
                cVar.i();
                for (Map.Entry next : map.entrySet()) {
                    cVar.y(String.valueOf(next.getKey()));
                    this.b.d(cVar, next.getValue());
                }
                cVar.l();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i2 = 0;
                boolean z = false;
                for (Map.Entry next2 : map.entrySet()) {
                    l c2 = this.a.c(next2.getKey());
                    arrayList.add(c2);
                    arrayList2.add(next2.getValue());
                    z |= c2.g() || c2.j();
                }
                if (z) {
                    cVar.h();
                    int size = arrayList.size();
                    while (i2 < size) {
                        cVar.h();
                        k.b((l) arrayList.get(i2), cVar);
                        this.b.d(cVar, arrayList2.get(i2));
                        cVar.k();
                        i2++;
                    }
                    cVar.k();
                    return;
                }
                cVar.i();
                int size2 = arrayList.size();
                while (i2 < size2) {
                    cVar.y(e((l) arrayList.get(i2)));
                    this.b.d(cVar, arrayList2.get(i2));
                    i2++;
                }
                cVar.l();
            }
        }
    }

    public MapTypeAdapterFactory(c cVar, boolean z) {
        this.f4257g = cVar;
        this.f4258h = z;
    }

    private s<?> a(f fVar, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return TypeAdapters.f4282f;
        }
        return fVar.k(com.google.gson.u.a.b(type));
    }

    public <T> s<T> c(f fVar, com.google.gson.u.a<T> aVar) {
        Type e2 = aVar.e();
        if (!Map.class.isAssignableFrom(aVar.c())) {
            return null;
        }
        Type[] j2 = com.google.gson.internal.b.j(e2, com.google.gson.internal.b.k(e2));
        return new a(fVar, j2[0], a(fVar, j2[0]), j2[1], fVar.k(com.google.gson.u.a.b(j2[1])), this.f4257g.a(aVar));
    }
}

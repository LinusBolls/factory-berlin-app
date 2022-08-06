package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

final class MapJsonAdapter<K, V> extends JsonAdapter<Map<K, V>> {
    public static final JsonAdapter.d FACTORY = new a();
    private final JsonAdapter<K> keyAdapter;
    private final JsonAdapter<V> valueAdapter;

    class a implements JsonAdapter.d {
        a() {
        }

        public JsonAdapter<?> a(Type type, Set<? extends Annotation> set, n nVar) {
            Class<?> g2;
            if (!set.isEmpty() || (g2 = p.g(type)) != Map.class) {
                return null;
            }
            Type[] i2 = p.i(type, g2);
            return new MapJsonAdapter(nVar, i2[0], i2[1]).f();
        }
    }

    MapJsonAdapter(n nVar, Type type, Type type2) {
        this.keyAdapter = nVar.d(type);
        this.valueAdapter = nVar.d(type2);
    }

    /* renamed from: i */
    public Map<K, V> b(g gVar) {
        m mVar = new m();
        gVar.b();
        while (gVar.hasNext()) {
            gVar.z();
            K b = this.keyAdapter.b(gVar);
            V b2 = this.valueAdapter.b(gVar);
            Object put = mVar.put(b, b2);
            if (put != null) {
                throw new JsonDataException("Map key '" + b + "' has multiple values at path " + gVar.getPath() + ": " + put + " and " + b2);
            }
        }
        gVar.i();
        return mVar;
    }

    /* renamed from: j */
    public void h(l lVar, Map<K, V> map) {
        lVar.b();
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                lVar.z();
                this.keyAdapter.h(lVar, next.getKey());
                this.valueAdapter.h(lVar, next.getValue());
            } else {
                throw new JsonDataException("Map key is null at " + lVar.getPath());
            }
        }
        lVar.j();
    }

    public String toString() {
        return "JsonAdapter(" + this.keyAdapter + "=" + this.valueAdapter + ")";
    }
}

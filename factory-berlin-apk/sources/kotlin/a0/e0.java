package kotlin.a0;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.j;
import kotlin.jvm.internal.k;

/* compiled from: Maps.kt */
class e0 extends d0 {
    public static <K, V> Map<K, V> e() {
        y yVar = y.f10591g;
        if (yVar != null) {
            return yVar;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    public static <K, V> Map<K, V> f(j<? extends K, ? extends V>... jVarArr) {
        k.e(jVarArr, "pairs");
        if (jVarArr.length <= 0) {
            return e();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d0.a(jVarArr.length));
        n(jVarArr, linkedHashMap);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> g(Map<K, ? extends V> map) {
        k.e(map, "$this$optimizeReadOnlyMap");
        int size = map.size();
        if (size == 0) {
            return e();
        }
        if (size != 1) {
            return map;
        }
        return d0.c(map);
    }

    public static <K, V> Map<K, V> h(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        k.e(map, "$this$plus");
        k.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final <K, V> void i(Map<? super K, ? super V> map, Iterable<? extends j<? extends K, ? extends V>> iterable) {
        k.e(map, "$this$putAll");
        k.e(iterable, "pairs");
        for (j jVar : iterable) {
            map.put(jVar.a(), jVar.b());
        }
    }

    public static final <K, V> void j(Map<? super K, ? super V> map, j<? extends K, ? extends V>[] jVarArr) {
        k.e(map, "$this$putAll");
        k.e(jVarArr, "pairs");
        for (j<? extends K, ? extends V> jVar : jVarArr) {
            map.put(jVar.a(), jVar.b());
        }
    }

    public static <K, V> Map<K, V> k(Iterable<? extends j<? extends K, ? extends V>> iterable) {
        k.e(iterable, "$this$toMap");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return e();
            }
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(d0.a(collection.size()));
                l(iterable, linkedHashMap);
                return linkedHashMap;
            }
            return d0.b((j) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        l(iterable, linkedHashMap2);
        return g(linkedHashMap2);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M l(Iterable<? extends j<? extends K, ? extends V>> iterable, M m2) {
        k.e(iterable, "$this$toMap");
        k.e(m2, "destination");
        i(m2, iterable);
        return m2;
    }

    public static <K, V> Map<K, V> m(Map<? extends K, ? extends V> map) {
        k.e(map, "$this$toMap");
        int size = map.size();
        if (size == 0) {
            return e();
        }
        if (size != 1) {
            return o(map);
        }
        return d0.c(map);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M n(j<? extends K, ? extends V>[] jVarArr, M m2) {
        k.e(jVarArr, "$this$toMap");
        k.e(m2, "destination");
        j(m2, jVarArr);
        return m2;
    }

    public static <K, V> Map<K, V> o(Map<? extends K, ? extends V> map) {
        k.e(map, "$this$toMutableMap");
        return new LinkedHashMap(map);
    }
}

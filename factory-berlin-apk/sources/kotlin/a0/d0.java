package kotlin.a0;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.j;
import kotlin.jvm.internal.k;

/* compiled from: MapsJVM.kt */
class d0 extends c0 {
    public static int a(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((((float) i2) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> b(j<? extends K, ? extends V> jVar) {
        k.e(jVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(jVar.c(), jVar.d());
        k.d(singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> c(Map<? extends K, ? extends V> map) {
        k.e(map, "$this$toSingletonMap");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        k.d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static <K extends Comparable<? super K>, V> SortedMap<K, V> d(Map<? extends K, ? extends V> map) {
        k.e(map, "$this$toSortedMap");
        return new TreeMap(map);
    }
}

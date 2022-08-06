package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: MapFieldLite */
public final class k0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: h  reason: collision with root package name */
    private static final k0 f3768h;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3769g = true;

    static {
        k0 k0Var = new k0();
        f3768h = k0Var;
        k0Var.r();
    }

    private k0() {
    }

    static <K, V> int c(Map<K, V> map) {
        int i2 = 0;
        for (Map.Entry next : map.entrySet()) {
            i2 += d(next.getValue()) ^ d(next.getKey());
        }
        return i2;
    }

    private static int d(Object obj) {
        if (obj instanceof byte[]) {
            return a0.d((byte[]) obj);
        }
        if (!(obj instanceof a0.c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private static void e(Map<?, ?> map) {
        for (Object next : map.keySet()) {
            a0.a(next);
            a0.a(map.get(next));
        }
    }

    public static <K, V> k0<K, V> f() {
        return f3768h;
    }

    private void g() {
        if (!p()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean h(Object obj, Object obj2) {
        if (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) {
            return obj.equals(obj2);
        }
        return Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> boolean m(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = h(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.k0.m(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        g();
        super.clear();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && m(this, (Map) obj);
    }

    public int hashCode() {
        return c(this);
    }

    public boolean p() {
        return this.f3769g;
    }

    public V put(K k2, V v) {
        g();
        a0.a(k2);
        a0.a(v);
        return super.put(k2, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        g();
        e(map);
        super.putAll(map);
    }

    public void r() {
        this.f3769g = false;
    }

    public V remove(Object obj) {
        g();
        return super.remove(obj);
    }

    public void s(k0<K, V> k0Var) {
        g();
        if (!k0Var.isEmpty()) {
            putAll(k0Var);
        }
    }

    public k0<K, V> t() {
        return isEmpty() ? new k0<>() : new k0<>(this);
    }

    private k0(Map<K, V> map) {
        super(map);
    }
}

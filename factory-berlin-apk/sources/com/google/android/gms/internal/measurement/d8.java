package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public final class d8<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: h  reason: collision with root package name */
    private static final d8 f2264h;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2265g = true;

    static {
        d8 d8Var = new d8();
        f2264h = d8Var;
        d8Var.f2265g = false;
    }

    private d8() {
    }

    private static int c(Object obj) {
        if (obj instanceof byte[]) {
            return b7.j((byte[]) obj);
        }
        if (!(obj instanceof e7)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static <K, V> d8<K, V> d() {
        return f2264h;
    }

    private final void m() {
        if (!this.f2265g) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        m();
        super.clear();
    }

    public final void e(d8<K, V> d8Var) {
        m();
        if (!d8Var.isEmpty()) {
            putAll(d8Var);
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = 0
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = 1
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d8.equals(java.lang.Object):boolean");
    }

    public final d8<K, V> f() {
        return isEmpty() ? new d8<>() : new d8<>(this);
    }

    public final void g() {
        this.f2265g = false;
    }

    public final boolean h() {
        return this.f2265g;
    }

    public final int hashCode() {
        int i2 = 0;
        for (Map.Entry entry : entrySet()) {
            i2 += c(entry.getValue()) ^ c(entry.getKey());
        }
        return i2;
    }

    public final V put(K k2, V v) {
        m();
        b7.d(k2);
        b7.d(v);
        return super.put(k2, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m();
        for (Object next : map.keySet()) {
            b7.d(next);
            b7.d(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m();
        return super.remove(obj);
    }

    private d8(Map<K, V> map) {
        super(map);
    }
}

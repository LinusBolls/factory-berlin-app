package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class q3<K, V> extends AbstractMap<K, V> implements Serializable {
    /* access modifiers changed from: private */
    public static final Object p = new Object();
    /* access modifiers changed from: private */
    @NullableDecl

    /* renamed from: g  reason: collision with root package name */
    public transient Object f2487g;
    @NullableDecl

    /* renamed from: h  reason: collision with root package name */
    transient int[] f2488h;
    @NullableDecl

    /* renamed from: i  reason: collision with root package name */
    transient Object[] f2489i;
    @NullableDecl

    /* renamed from: j  reason: collision with root package name */
    transient Object[] f2490j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public transient int f2491k = a5.a(3, 1, 1073741823);

    /* renamed from: l  reason: collision with root package name */
    private transient int f2492l;
    @NullableDecl

    /* renamed from: m  reason: collision with root package name */
    private transient Set<K> f2493m;
    @NullableDecl

    /* renamed from: n  reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f2494n;
    @NullableDecl
    private transient Collection<V> o;

    q3() {
        b3.f(true, "Expected size must be >= 0");
    }

    private final int b(int i2, int i3, int i4, int i5) {
        Object d2 = x3.d(i3);
        int i6 = i3 - 1;
        if (i5 != 0) {
            x3.e(d2, i4 & i6, i5 + 1);
        }
        Object obj = this.f2487g;
        int[] iArr = this.f2488h;
        for (int i7 = 0; i7 <= i2; i7++) {
            int b = x3.b(obj, i7);
            while (b != 0) {
                int i8 = b - 1;
                int i9 = iArr[i8];
                int i10 = ((~i2) & i9) | i7;
                int i11 = i10 & i6;
                int b2 = x3.b(d2, i11);
                x3.e(d2, i11, b);
                iArr[i8] = x3.a(i10, b2, i6);
                b = i9 & i2;
            }
        }
        this.f2487g = d2;
        m(i6);
        return i6;
    }

    /* access modifiers changed from: private */
    public final int d(@NullableDecl Object obj) {
        if (g()) {
            return -1;
        }
        int b = z3.b(obj);
        int v = v();
        int b2 = x3.b(this.f2487g, b & v);
        if (b2 == 0) {
            return -1;
        }
        int i2 = ~v;
        int i3 = b & i2;
        do {
            int i4 = b2 - 1;
            int i5 = this.f2488h[i4];
            if ((i5 & i2) == i3 && z2.a(obj, this.f2489i[i4])) {
                return i4;
            }
            b2 = i5 & v;
        } while (b2 != 0);
        return -1;
    }

    static int h(int i2, int i3) {
        return i2 - 1;
    }

    /* access modifiers changed from: private */
    @NullableDecl
    public final Object k(@NullableDecl Object obj) {
        if (g()) {
            return p;
        }
        int v = v();
        int c = x3.c(obj, (Object) null, v, this.f2487g, this.f2488h, this.f2489i, (Object[]) null);
        if (c == -1) {
            return p;
        }
        Object obj2 = this.f2490j[c];
        f(c, v);
        this.f2492l--;
        o();
        return obj2;
    }

    private final void m(int i2) {
        this.f2491k = x3.a(this.f2491k, 32 - Integer.numberOfLeadingZeros(i2), 31);
    }

    static /* synthetic */ int q(q3 q3Var) {
        int i2 = q3Var.f2492l;
        q3Var.f2492l = i2 - 1;
        return i2;
    }

    /* access modifiers changed from: private */
    public final int v() {
        return (1 << (this.f2491k & 31)) - 1;
    }

    /* access modifiers changed from: package-private */
    public final int a(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f2492l) {
            return i3;
        }
        return -1;
    }

    public final void clear() {
        if (!g()) {
            o();
            Map l2 = l();
            if (l2 != null) {
                this.f2491k = a5.a(size(), 3, 1073741823);
                l2.clear();
                this.f2487g = null;
                this.f2492l = 0;
                return;
            }
            Arrays.fill(this.f2489i, 0, this.f2492l, (Object) null);
            Arrays.fill(this.f2490j, 0, this.f2492l, (Object) null);
            Object obj = this.f2487g;
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(this.f2488h, 0, this.f2492l, 0);
            this.f2492l = 0;
        }
    }

    public final boolean containsKey(@NullableDecl Object obj) {
        Map l2 = l();
        if (l2 != null) {
            return l2.containsKey(obj);
        }
        return d(obj) != -1;
    }

    public final boolean containsValue(@NullableDecl Object obj) {
        Map l2 = l();
        if (l2 != null) {
            return l2.containsValue(obj);
        }
        for (int i2 = 0; i2 < this.f2492l; i2++) {
            if (z2.a(obj, this.f2490j[i2])) {
                return true;
            }
        }
        return false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f2494n;
        if (set != null) {
            return set;
        }
        u3 u3Var = new u3(this);
        this.f2494n = u3Var;
        return u3Var;
    }

    /* access modifiers changed from: package-private */
    public final void f(int i2, int i3) {
        int size = size() - 1;
        if (i2 < size) {
            Object[] objArr = this.f2489i;
            Object obj = objArr[size];
            objArr[i2] = obj;
            Object[] objArr2 = this.f2490j;
            objArr2[i2] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.f2488h;
            iArr[i2] = iArr[size];
            iArr[size] = 0;
            int b = z3.b(obj) & i3;
            int b2 = x3.b(this.f2487g, b);
            int i4 = size + 1;
            if (b2 == i4) {
                x3.e(this.f2487g, b, i2 + 1);
                return;
            }
            while (true) {
                int i5 = b2 - 1;
                int[] iArr2 = this.f2488h;
                int i6 = iArr2[i5];
                int i7 = i6 & i3;
                if (i7 == i4) {
                    iArr2[i5] = x3.a(i6, i2 + 1, i3);
                    return;
                }
                b2 = i7;
            }
        } else {
            this.f2489i[i2] = null;
            this.f2490j[i2] = null;
            this.f2488h[i2] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return this.f2487g == null;
    }

    public final V get(@NullableDecl Object obj) {
        Map l2 = l();
        if (l2 != null) {
            return l2.get(obj);
        }
        int d2 = d(obj);
        if (d2 == -1) {
            return null;
        }
        return this.f2490j[d2];
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set<K> keySet() {
        Set<K> set = this.f2493m;
        if (set != null) {
            return set;
        }
        w3 w3Var = new w3(this);
        this.f2493m = w3Var;
        return w3Var;
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public final Map<K, V> l() {
        Object obj = this.f2487g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        this.f2491k += 32;
    }

    /* access modifiers changed from: package-private */
    public final int p() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002c, code lost:
        r7 = r7 << 1;
     */
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V put(@org.checkerframework.checker.nullness.compatqual.NullableDecl K r19, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r18.g()
            r4 = 1
            if (r3 == 0) goto L_0x004e
            boolean r3 = r18.g()
            java.lang.String r5 = "Arrays already allocated"
            com.google.android.gms.internal.measurement.b3.h(r3, r5)
            int r3 = r0.f2491k
            r5 = 4
            int r6 = r3 + 1
            r7 = 2
            int r6 = java.lang.Math.max(r6, r7)
            int r7 = java.lang.Integer.highestOneBit(r6)
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = (double) r7
            double r10 = r10 * r8
            int r8 = (int) r10
            if (r6 <= r8) goto L_0x0033
            int r7 = r7 << 1
            if (r7 > 0) goto L_0x0033
            r6 = 1073741824(0x40000000, float:2.0)
            goto L_0x0034
        L_0x0033:
            r6 = r7
        L_0x0034:
            int r5 = java.lang.Math.max(r5, r6)
            java.lang.Object r6 = com.google.android.gms.internal.measurement.x3.d(r5)
            r0.f2487g = r6
            int r5 = r5 - r4
            r0.m(r5)
            int[] r5 = new int[r3]
            r0.f2488h = r5
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r0.f2489i = r5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0.f2490j = r3
        L_0x004e:
            java.util.Map r3 = r18.l()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r1 = r3.put(r1, r2)
            return r1
        L_0x0059:
            int[] r3 = r0.f2488h
            java.lang.Object[] r5 = r0.f2489i
            java.lang.Object[] r6 = r0.f2490j
            int r7 = r0.f2492l
            int r8 = r7 + 1
            int r9 = com.google.android.gms.internal.measurement.z3.b(r19)
            int r10 = r18.v()
            r11 = r9 & r10
            java.lang.Object r12 = r0.f2487g
            int r12 = com.google.android.gms.internal.measurement.x3.b(r12, r11)
            if (r12 != 0) goto L_0x0086
            if (r8 <= r10) goto L_0x0080
            int r3 = com.google.android.gms.internal.measurement.x3.f(r10)
            int r10 = r0.b(r10, r3, r9, r7)
            goto L_0x00ef
        L_0x0080:
            java.lang.Object r3 = r0.f2487g
            com.google.android.gms.internal.measurement.x3.e(r3, r11, r8)
            goto L_0x00ef
        L_0x0086:
            int r11 = ~r10
            r15 = r9 & r11
            r16 = 0
        L_0x008b:
            int r12 = r12 - r4
            r13 = r3[r12]
            r14 = r13 & r11
            if (r14 != r15) goto L_0x009f
            r14 = r5[r12]
            boolean r14 = com.google.android.gms.internal.measurement.z2.a(r1, r14)
            if (r14 == 0) goto L_0x009f
            r1 = r6[r12]
            r6[r12] = r2
            return r1
        L_0x009f:
            r14 = r13 & r10
            r17 = r5
            int r5 = r16 + 1
            if (r14 != 0) goto L_0x0135
            r6 = 9
            if (r5 < r6) goto L_0x00de
            int r3 = r18.v()
            int r3 = r3 + r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r3, r5)
            int r3 = r18.p()
        L_0x00bb:
            if (r3 < 0) goto L_0x00cd
            java.lang.Object[] r5 = r0.f2489i
            r5 = r5[r3]
            java.lang.Object[] r6 = r0.f2490j
            r6 = r6[r3]
            r4.put(r5, r6)
            int r3 = r0.a(r3)
            goto L_0x00bb
        L_0x00cd:
            r0.f2487g = r4
            r3 = 0
            r0.f2488h = r3
            r0.f2489i = r3
            r0.f2490j = r3
            r18.o()
            java.lang.Object r1 = r4.put(r1, r2)
            return r1
        L_0x00de:
            if (r8 <= r10) goto L_0x00e9
            int r3 = com.google.android.gms.internal.measurement.x3.f(r10)
            int r10 = r0.b(r10, r3, r9, r7)
            goto L_0x00ef
        L_0x00e9:
            int r5 = com.google.android.gms.internal.measurement.x3.a(r13, r8, r10)
            r3[r12] = r5
        L_0x00ef:
            int[] r3 = r0.f2488h
            int r3 = r3.length
            if (r8 <= r3) goto L_0x011d
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            int r6 = r3 >>> 1
            int r6 = java.lang.Math.max(r4, r6)
            int r6 = r6 + r3
            r4 = r4 | r6
            int r4 = java.lang.Math.min(r5, r4)
            if (r4 == r3) goto L_0x011d
            int[] r3 = r0.f2488h
            int[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.f2488h = r3
            java.lang.Object[] r3 = r0.f2489i
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.f2489i = r3
            java.lang.Object[] r3 = r0.f2490j
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.f2490j = r3
        L_0x011d:
            int[] r3 = r0.f2488h
            r12 = 0
            int r4 = com.google.android.gms.internal.measurement.x3.a(r9, r12, r10)
            r3[r7] = r4
            java.lang.Object[] r3 = r0.f2489i
            r3[r7] = r1
            java.lang.Object[] r1 = r0.f2490j
            r1[r7] = r2
            r0.f2492l = r8
            r18.o()
            r13 = 0
            return r13
        L_0x0135:
            r16 = r5
            r12 = r14
            r5 = r17
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.q3.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public final Iterator<K> r() {
        Map l2 = l();
        if (l2 != null) {
            return l2.keySet().iterator();
        }
        return new p3(this);
    }

    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        Map l2 = l();
        if (l2 != null) {
            return l2.remove(obj);
        }
        V k2 = k(obj);
        if (k2 == p) {
            return null;
        }
        return k2;
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<K, V>> s() {
        Map l2 = l();
        if (l2 != null) {
            return l2.entrySet().iterator();
        }
        return new s3(this);
    }

    public final int size() {
        Map l2 = l();
        return l2 != null ? l2.size() : this.f2492l;
    }

    /* access modifiers changed from: package-private */
    public final Iterator<V> t() {
        Map l2 = l();
        if (l2 != null) {
            return l2.values().iterator();
        }
        return new r3(this);
    }

    public final Collection<V> values() {
        Collection<V> collection = this.o;
        if (collection != null) {
            return collection;
        }
        y3 y3Var = new y3(this);
        this.o = y3Var;
        return y3Var;
    }
}

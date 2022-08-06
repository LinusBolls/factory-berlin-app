package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedTreeMap */
public final class g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: n  reason: collision with root package name */
    private static final Comparator<Comparable> f4304n = new a();

    /* renamed from: g  reason: collision with root package name */
    Comparator<? super K> f4305g;

    /* renamed from: h  reason: collision with root package name */
    e<K, V> f4306h;

    /* renamed from: i  reason: collision with root package name */
    int f4307i;

    /* renamed from: j  reason: collision with root package name */
    int f4308j;

    /* renamed from: k  reason: collision with root package name */
    final e<K, V> f4309k;

    /* renamed from: l  reason: collision with root package name */
    private g<K, V>.defpackage.b f4310l;

    /* renamed from: m  reason: collision with root package name */
    private g<K, V>.defpackage.c f4311m;

    /* compiled from: LinkedTreeMap */
    class a implements Comparator<Comparable> {
        a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap */
    class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap */
        class a extends g<K, V>.d<Map.Entry<K, V>> {
            a(b bVar) {
                super();
            }

            /* renamed from: c */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
        }

        public void clear() {
            g.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && g.this.c((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            e c;
            if (!(obj instanceof Map.Entry) || (c = g.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.f(c, true);
            return true;
        }

        public int size() {
            return g.this.f4307i;
        }
    }

    /* compiled from: LinkedTreeMap */
    final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap */
        class a extends g<K, V>.d<K> {
            a(c cVar) {
                super();
            }

            public K next() {
                return a().f4323l;
            }
        }

        c() {
        }

        public void clear() {
            g.this.clear();
        }

        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            return g.this.g(obj) != null;
        }

        public int size() {
            return g.this.f4307i;
        }
    }

    /* compiled from: LinkedTreeMap */
    private abstract class d<T> implements Iterator<T> {

        /* renamed from: g  reason: collision with root package name */
        e<K, V> f4314g;

        /* renamed from: h  reason: collision with root package name */
        e<K, V> f4315h = null;

        /* renamed from: i  reason: collision with root package name */
        int f4316i;

        d() {
            g gVar = g.this;
            this.f4314g = gVar.f4309k.f4321j;
            this.f4316i = gVar.f4308j;
        }

        /* access modifiers changed from: package-private */
        public final e<K, V> a() {
            e<K, V> eVar = this.f4314g;
            g gVar = g.this;
            if (eVar == gVar.f4309k) {
                throw new NoSuchElementException();
            } else if (gVar.f4308j == this.f4316i) {
                this.f4314g = eVar.f4321j;
                this.f4315h = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f4314g != g.this.f4309k;
        }

        public final void remove() {
            e<K, V> eVar = this.f4315h;
            if (eVar != null) {
                g.this.f(eVar, true);
                this.f4315h = null;
                this.f4316i = g.this.f4308j;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<g> cls = g.class;
    }

    public g() {
        this(f4304n);
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void e(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f4319h;
            e<K, V> eVar3 = eVar.f4320i;
            int i2 = 0;
            int i3 = eVar2 != null ? eVar2.f4325n : 0;
            int i4 = eVar3 != null ? eVar3.f4325n : 0;
            int i5 = i3 - i4;
            if (i5 == -2) {
                e<K, V> eVar4 = eVar3.f4319h;
                e<K, V> eVar5 = eVar3.f4320i;
                int i6 = eVar5 != null ? eVar5.f4325n : 0;
                if (eVar4 != null) {
                    i2 = eVar4.f4325n;
                }
                int i7 = i2 - i6;
                if (i7 == -1 || (i7 == 0 && !z)) {
                    i(eVar);
                } else {
                    j(eVar3);
                    i(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i5 == 2) {
                e<K, V> eVar6 = eVar2.f4319h;
                e<K, V> eVar7 = eVar2.f4320i;
                int i8 = eVar7 != null ? eVar7.f4325n : 0;
                if (eVar6 != null) {
                    i2 = eVar6.f4325n;
                }
                int i9 = i2 - i8;
                if (i9 == 1 || (i9 == 0 && !z)) {
                    j(eVar);
                } else {
                    i(eVar2);
                    j(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i5 == 0) {
                eVar.f4325n = i3 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f4325n = Math.max(i3, i4) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f4318g;
        }
    }

    private void h(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f4318g;
        eVar.f4318g = null;
        if (eVar2 != null) {
            eVar2.f4318g = eVar3;
        }
        if (eVar3 == null) {
            this.f4306h = eVar2;
        } else if (eVar3.f4319h == eVar) {
            eVar3.f4319h = eVar2;
        } else {
            eVar3.f4320i = eVar2;
        }
    }

    private void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f4319h;
        e<K, V> eVar3 = eVar.f4320i;
        e<K, V> eVar4 = eVar3.f4319h;
        e<K, V> eVar5 = eVar3.f4320i;
        eVar.f4320i = eVar4;
        if (eVar4 != null) {
            eVar4.f4318g = eVar;
        }
        h(eVar, eVar3);
        eVar3.f4319h = eVar;
        eVar.f4318g = eVar3;
        int i2 = 0;
        int max = Math.max(eVar2 != null ? eVar2.f4325n : 0, eVar4 != null ? eVar4.f4325n : 0) + 1;
        eVar.f4325n = max;
        if (eVar5 != null) {
            i2 = eVar5.f4325n;
        }
        eVar3.f4325n = Math.max(max, i2) + 1;
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f4319h;
        e<K, V> eVar3 = eVar.f4320i;
        e<K, V> eVar4 = eVar2.f4319h;
        e<K, V> eVar5 = eVar2.f4320i;
        eVar.f4319h = eVar5;
        if (eVar5 != null) {
            eVar5.f4318g = eVar;
        }
        h(eVar, eVar2);
        eVar2.f4320i = eVar;
        eVar.f4318g = eVar2;
        int i2 = 0;
        int max = Math.max(eVar3 != null ? eVar3.f4325n : 0, eVar5 != null ? eVar5.f4325n : 0) + 1;
        eVar.f4325n = max;
        if (eVar4 != null) {
            i2 = eVar4.f4325n;
        }
        eVar2.f4325n = Math.max(max, i2) + 1;
    }

    /* access modifiers changed from: package-private */
    public e<K, V> b(K k2, boolean z) {
        int i2;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f4305g;
        e<K, V> eVar2 = this.f4306h;
        if (eVar2 != null) {
            Comparable comparable = comparator == f4304n ? (Comparable) k2 : null;
            while (true) {
                if (comparable != null) {
                    i2 = comparable.compareTo(eVar2.f4323l);
                } else {
                    i2 = comparator.compare(k2, eVar2.f4323l);
                }
                if (i2 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i2 < 0 ? eVar2.f4319h : eVar2.f4320i;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f4309k;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f4322k);
            if (i2 < 0) {
                eVar2.f4319h = eVar;
            } else {
                eVar2.f4320i = eVar;
            }
            e(eVar2, true);
        } else if (comparator != f4304n || (k2 instanceof Comparable)) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f4322k);
            this.f4306h = eVar;
        } else {
            throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
        }
        this.f4307i++;
        this.f4308j++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> d2 = d(entry.getKey());
        if (d2 != null && a(d2.f4324m, entry.getValue())) {
            return d2;
        }
        return null;
    }

    public void clear() {
        this.f4306h = null;
        this.f4307i = 0;
        this.f4308j++;
        e<K, V> eVar = this.f4309k;
        eVar.f4322k = eVar;
        eVar.f4321j = eVar;
    }

    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* access modifiers changed from: package-private */
    public e<K, V> d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V>.defpackage.b bVar = this.f4310l;
        if (bVar != null) {
            return bVar;
        }
        g<K, V>.defpackage.b bVar2 = new b();
        this.f4310l = bVar2;
        return bVar2;
    }

    /* access modifiers changed from: package-private */
    public void f(e<K, V> eVar, boolean z) {
        int i2;
        if (z) {
            e<K, V> eVar2 = eVar.f4322k;
            eVar2.f4321j = eVar.f4321j;
            eVar.f4321j.f4322k = eVar2;
        }
        e<K, V> eVar3 = eVar.f4319h;
        e<K, V> eVar4 = eVar.f4320i;
        e<K, V> eVar5 = eVar.f4318g;
        int i3 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f4319h = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f4320i = null;
            } else {
                h(eVar, (e<K, V>) null);
            }
            e(eVar5, false);
            this.f4307i--;
            this.f4308j++;
            return;
        }
        e<K, V> b2 = eVar3.f4325n > eVar4.f4325n ? eVar3.b() : eVar4.a();
        f(b2, false);
        e<K, V> eVar6 = eVar.f4319h;
        if (eVar6 != null) {
            i2 = eVar6.f4325n;
            b2.f4319h = eVar6;
            eVar6.f4318g = b2;
            eVar.f4319h = null;
        } else {
            i2 = 0;
        }
        e<K, V> eVar7 = eVar.f4320i;
        if (eVar7 != null) {
            i3 = eVar7.f4325n;
            b2.f4320i = eVar7;
            eVar7.f4318g = b2;
            eVar.f4320i = null;
        }
        b2.f4325n = Math.max(i2, i3) + 1;
        h(eVar, b2);
    }

    /* access modifiers changed from: package-private */
    public e<K, V> g(Object obj) {
        e<K, V> d2 = d(obj);
        if (d2 != null) {
            f(d2, true);
        }
        return d2;
    }

    public V get(Object obj) {
        e d2 = d(obj);
        if (d2 != null) {
            return d2.f4324m;
        }
        return null;
    }

    public Set<K> keySet() {
        g<K, V>.defpackage.c cVar = this.f4311m;
        if (cVar != null) {
            return cVar;
        }
        g<K, V>.defpackage.c cVar2 = new c();
        this.f4311m = cVar2;
        return cVar2;
    }

    public V put(K k2, V v) {
        if (k2 != null) {
            e b2 = b(k2, true);
            V v2 = b2.f4324m;
            b2.f4324m = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        e g2 = g(obj);
        if (g2 != null) {
            return g2.f4324m;
        }
        return null;
    }

    public int size() {
        return this.f4307i;
    }

    public g(Comparator<? super K> comparator) {
        this.f4307i = 0;
        this.f4308j = 0;
        this.f4309k = new e<>();
        this.f4305g = comparator == null ? f4304n : comparator;
    }

    /* compiled from: LinkedTreeMap */
    static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: g  reason: collision with root package name */
        e<K, V> f4318g;

        /* renamed from: h  reason: collision with root package name */
        e<K, V> f4319h;

        /* renamed from: i  reason: collision with root package name */
        e<K, V> f4320i;

        /* renamed from: j  reason: collision with root package name */
        e<K, V> f4321j;

        /* renamed from: k  reason: collision with root package name */
        e<K, V> f4322k;

        /* renamed from: l  reason: collision with root package name */
        final K f4323l;

        /* renamed from: m  reason: collision with root package name */
        V f4324m;

        /* renamed from: n  reason: collision with root package name */
        int f4325n;

        e() {
            this.f4323l = null;
            this.f4322k = this;
            this.f4321j = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f4319h; eVar2 != null; eVar2 = eVar2.f4319h) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f4320i; eVar2 != null; eVar2 = eVar2.f4320i) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f4323l
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f4324m
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.g.e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f4323l;
        }

        public V getValue() {
            return this.f4324m;
        }

        public int hashCode() {
            K k2 = this.f4323l;
            int i2 = 0;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f4324m;
            if (v != null) {
                i2 = v.hashCode();
            }
            return hashCode ^ i2;
        }

        public V setValue(V v) {
            V v2 = this.f4324m;
            this.f4324m = v;
            return v2;
        }

        public String toString() {
            return this.f4323l + "=" + this.f4324m;
        }

        e(e<K, V> eVar, K k2, e<K, V> eVar2, e<K, V> eVar3) {
            this.f4318g = eVar;
            this.f4323l = k2;
            this.f4325n = 1;
            this.f4321j = eVar2;
            this.f4322k = eVar3;
            eVar3.f4321j = this;
            eVar2.f4322k = this;
        }
    }
}

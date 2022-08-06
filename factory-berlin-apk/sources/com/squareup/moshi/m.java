package com.squareup.moshi;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedHashTreeMap */
final class m<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> o = new a();

    /* renamed from: g  reason: collision with root package name */
    Comparator<? super K> f8138g;

    /* renamed from: h  reason: collision with root package name */
    g<K, V>[] f8139h;

    /* renamed from: i  reason: collision with root package name */
    final g<K, V> f8140i;

    /* renamed from: j  reason: collision with root package name */
    int f8141j;

    /* renamed from: k  reason: collision with root package name */
    int f8142k;

    /* renamed from: l  reason: collision with root package name */
    int f8143l;

    /* renamed from: m  reason: collision with root package name */
    private m<K, V>.d f8144m;

    /* renamed from: n  reason: collision with root package name */
    private m<K, V>.e f8145n;

    /* compiled from: LinkedHashTreeMap */
    class a implements Comparator<Comparable> {
        a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedHashTreeMap */
    static final class b<K, V> {
        private g<K, V> a;
        private int b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f8146d;

        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(g<K, V> gVar) {
            gVar.f8155i = null;
            gVar.f8153g = null;
            gVar.f8154h = null;
            gVar.o = 1;
            int i2 = this.b;
            if (i2 > 0) {
                int i3 = this.f8146d;
                if ((i3 & 1) == 0) {
                    this.f8146d = i3 + 1;
                    this.b = i2 - 1;
                    this.c++;
                }
            }
            gVar.f8153g = this.a;
            this.a = gVar;
            int i4 = this.f8146d + 1;
            this.f8146d = i4;
            int i5 = this.b;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.f8146d = i4 + 1;
                this.b = i5 - 1;
                this.c++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.f8146d & i7) == i7) {
                    int i8 = this.c;
                    if (i8 == 0) {
                        g<K, V> gVar2 = this.a;
                        g<K, V> gVar3 = gVar2.f8153g;
                        g<K, V> gVar4 = gVar3.f8153g;
                        gVar3.f8153g = gVar4.f8153g;
                        this.a = gVar3;
                        gVar3.f8154h = gVar4;
                        gVar3.f8155i = gVar2;
                        gVar3.o = gVar2.o + 1;
                        gVar4.f8153g = gVar3;
                        gVar2.f8153g = gVar3;
                    } else if (i8 == 1) {
                        g<K, V> gVar5 = this.a;
                        g<K, V> gVar6 = gVar5.f8153g;
                        this.a = gVar6;
                        gVar6.f8155i = gVar5;
                        gVar6.o = gVar5.o + 1;
                        gVar5.f8153g = gVar6;
                        this.c = 0;
                    } else if (i8 == 2) {
                        this.c = 0;
                    }
                    i6 *= 2;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i2) {
            this.b = ((Integer.highestOneBit(i2) * 2) - 1) - i2;
            this.f8146d = 0;
            this.c = 0;
            this.a = null;
        }

        /* access modifiers changed from: package-private */
        public g<K, V> c() {
            g<K, V> gVar = this.a;
            if (gVar.f8153g == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: LinkedHashTreeMap */
    static class c<K, V> {
        private g<K, V> a;

        c() {
        }

        public g<K, V> a() {
            g<K, V> gVar = this.a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f8153g;
            gVar.f8153g = null;
            g<K, V> gVar3 = gVar.f8155i;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                g<K, V> gVar5 = gVar4;
                if (gVar2 != null) {
                    gVar2.f8153g = gVar5;
                    gVar3 = gVar2.f8154h;
                } else {
                    this.a = gVar5;
                    return gVar;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f8153g = gVar2;
                gVar2 = gVar;
                gVar = gVar.f8154h;
            }
            this.a = gVar2;
        }
    }

    /* compiled from: LinkedHashTreeMap */
    final class d extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedHashTreeMap */
        class a extends m<K, V>.f<Map.Entry<K, V>> {
            a(d dVar) {
                super();
            }

            /* renamed from: c */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        d() {
        }

        public void clear() {
            m.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && m.this.e((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            g e2;
            if (!(obj instanceof Map.Entry) || (e2 = m.this.e((Map.Entry) obj)) == null) {
                return false;
            }
            m.this.h(e2, true);
            return true;
        }

        public int size() {
            return m.this.f8141j;
        }
    }

    /* compiled from: LinkedHashTreeMap */
    final class e extends AbstractSet<K> {

        /* compiled from: LinkedHashTreeMap */
        class a extends m<K, V>.f<K> {
            a(e eVar) {
                super();
            }

            public K next() {
                return a().f8158l;
            }
        }

        e() {
        }

        public void clear() {
            m.this.clear();
        }

        public boolean contains(Object obj) {
            return m.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            return m.this.i(obj) != null;
        }

        public int size() {
            return m.this.f8141j;
        }
    }

    /* compiled from: LinkedHashTreeMap */
    abstract class f<T> implements Iterator<T> {

        /* renamed from: g  reason: collision with root package name */
        g<K, V> f8149g;

        /* renamed from: h  reason: collision with root package name */
        g<K, V> f8150h = null;

        /* renamed from: i  reason: collision with root package name */
        int f8151i;

        f() {
            m mVar = m.this;
            this.f8149g = mVar.f8140i.f8156j;
            this.f8151i = mVar.f8142k;
        }

        /* access modifiers changed from: package-private */
        public final g<K, V> a() {
            g<K, V> gVar = this.f8149g;
            m mVar = m.this;
            if (gVar == mVar.f8140i) {
                throw new NoSuchElementException();
            } else if (mVar.f8142k == this.f8151i) {
                this.f8149g = gVar.f8156j;
                this.f8150h = gVar;
                return gVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f8149g != m.this.f8140i;
        }

        public final void remove() {
            g<K, V> gVar = this.f8150h;
            if (gVar != null) {
                m.this.h(gVar, true);
                this.f8150h = null;
                this.f8151i = m.this.f8142k;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<m> cls = m.class;
    }

    m() {
        this((Comparator) null);
    }

    private void a() {
        g<K, V>[] b2 = b(this.f8139h);
        this.f8139h = b2;
        this.f8143l = (b2.length / 2) + (b2.length / 4);
    }

    static <K, V> g<K, V>[] b(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[(length * 2)];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i2 = 0; i2 < length; i2++) {
            g<K, V> gVar = gVarArr[i2];
            if (gVar != null) {
                cVar.b(gVar);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    g a2 = cVar.a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.f8159m & length) == 0) {
                        i3++;
                    } else {
                        i4++;
                    }
                }
                bVar.b(i3);
                bVar2.b(i4);
                cVar.b(gVar);
                while (true) {
                    g a3 = cVar.a();
                    if (a3 == null) {
                        break;
                    } else if ((a3.f8159m & length) == 0) {
                        bVar.a(a3);
                    } else {
                        bVar2.a(a3);
                    }
                }
                g<K, V> gVar2 = null;
                gVarArr2[i2] = i3 > 0 ? bVar.c() : null;
                int i5 = i2 + length;
                if (i4 > 0) {
                    gVar2 = bVar2.c();
                }
                gVarArr2[i5] = gVar2;
            }
        }
        return gVarArr2;
    }

    private boolean c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void g(g<K, V> gVar, boolean z) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f8154h;
            g<K, V> gVar3 = gVar.f8155i;
            int i2 = 0;
            int i3 = gVar2 != null ? gVar2.o : 0;
            int i4 = gVar3 != null ? gVar3.o : 0;
            int i5 = i3 - i4;
            if (i5 == -2) {
                g<K, V> gVar4 = gVar3.f8154h;
                g<K, V> gVar5 = gVar3.f8155i;
                int i6 = gVar5 != null ? gVar5.o : 0;
                if (gVar4 != null) {
                    i2 = gVar4.o;
                }
                int i7 = i2 - i6;
                if (i7 == -1 || (i7 == 0 && !z)) {
                    k(gVar);
                } else {
                    l(gVar3);
                    k(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i5 == 2) {
                g<K, V> gVar6 = gVar2.f8154h;
                g<K, V> gVar7 = gVar2.f8155i;
                int i8 = gVar7 != null ? gVar7.o : 0;
                if (gVar6 != null) {
                    i2 = gVar6.o;
                }
                int i9 = i2 - i8;
                if (i9 == 1 || (i9 == 0 && !z)) {
                    l(gVar);
                } else {
                    k(gVar2);
                    l(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i5 == 0) {
                gVar.o = i3 + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.o = Math.max(i3, i4) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.f8153g;
        }
    }

    private void j(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f8153g;
        gVar.f8153g = null;
        if (gVar2 != null) {
            gVar2.f8153g = gVar3;
        }
        if (gVar3 == null) {
            int i2 = gVar.f8159m;
            g<K, V>[] gVarArr = this.f8139h;
            gVarArr[i2 & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f8154h == gVar) {
            gVar3.f8154h = gVar2;
        } else {
            gVar3.f8155i = gVar2;
        }
    }

    private void k(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f8154h;
        g<K, V> gVar3 = gVar.f8155i;
        g<K, V> gVar4 = gVar3.f8154h;
        g<K, V> gVar5 = gVar3.f8155i;
        gVar.f8155i = gVar4;
        if (gVar4 != null) {
            gVar4.f8153g = gVar;
        }
        j(gVar, gVar3);
        gVar3.f8154h = gVar;
        gVar.f8153g = gVar3;
        int i2 = 0;
        int max = Math.max(gVar2 != null ? gVar2.o : 0, gVar4 != null ? gVar4.o : 0) + 1;
        gVar.o = max;
        if (gVar5 != null) {
            i2 = gVar5.o;
        }
        gVar3.o = Math.max(max, i2) + 1;
    }

    private void l(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f8154h;
        g<K, V> gVar3 = gVar.f8155i;
        g<K, V> gVar4 = gVar2.f8154h;
        g<K, V> gVar5 = gVar2.f8155i;
        gVar.f8154h = gVar5;
        if (gVar5 != null) {
            gVar5.f8153g = gVar;
        }
        j(gVar, gVar2);
        gVar2.f8155i = gVar;
        gVar.f8153g = gVar2;
        int i2 = 0;
        int max = Math.max(gVar3 != null ? gVar3.o : 0, gVar5 != null ? gVar5.o : 0) + 1;
        gVar.o = max;
        if (gVar4 != null) {
            i2 = gVar4.o;
        }
        gVar2.o = Math.max(max, i2) + 1;
    }

    private static int m(int i2) {
        int i3 = i2 ^ ((i2 >>> 20) ^ (i2 >>> 12));
        return (i3 >>> 4) ^ ((i3 >>> 7) ^ i3);
    }

    public void clear() {
        Arrays.fill(this.f8139h, (Object) null);
        this.f8141j = 0;
        this.f8142k++;
        g<K, V> gVar = this.f8140i;
        g<K, V> gVar2 = gVar.f8156j;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f8156j;
            gVar2.f8157k = null;
            gVar2.f8156j = null;
            gVar2 = gVar3;
        }
        gVar.f8157k = gVar;
        gVar.f8156j = gVar;
    }

    public boolean containsKey(Object obj) {
        return f(obj) != null;
    }

    /* access modifiers changed from: package-private */
    public g<K, V> d(K k2, boolean z) {
        int i2;
        g<K, V> gVar;
        g<K, V> gVar2;
        int i3;
        Comparator<? super K> comparator = this.f8138g;
        g<K, V>[] gVarArr = this.f8139h;
        int m2 = m(k2.hashCode());
        int length = (gVarArr.length - 1) & m2;
        g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            Comparable comparable = comparator == o ? (Comparable) k2 : null;
            while (true) {
                if (comparable != null) {
                    i3 = comparable.compareTo(gVar3.f8158l);
                } else {
                    i3 = comparator.compare(k2, gVar3.f8158l);
                }
                if (i3 == 0) {
                    return gVar3;
                }
                g<K, V> gVar4 = i3 < 0 ? gVar3.f8154h : gVar3.f8155i;
                if (gVar4 == null) {
                    gVar = gVar3;
                    i2 = i3;
                    break;
                }
                gVar3 = gVar4;
            }
        } else {
            gVar = gVar3;
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        g<K, V> gVar5 = this.f8140i;
        if (gVar != null) {
            gVar2 = new g<>(gVar, k2, m2, gVar5, gVar5.f8157k);
            if (i2 < 0) {
                gVar.f8154h = gVar2;
            } else {
                gVar.f8155i = gVar2;
            }
            g(gVar, true);
        } else if (comparator != o || (k2 instanceof Comparable)) {
            gVar2 = new g<>(gVar, k2, m2, gVar5, gVar5.f8157k);
            gVarArr[length] = gVar2;
        } else {
            throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
        }
        int i4 = this.f8141j;
        this.f8141j = i4 + 1;
        if (i4 > this.f8143l) {
            a();
        }
        this.f8142k++;
        return gVar2;
    }

    /* access modifiers changed from: package-private */
    public g<K, V> e(Map.Entry<?, ?> entry) {
        g<K, V> f2 = f(entry.getKey());
        if (f2 != null && c(f2.f8160n, entry.getValue())) {
            return f2;
        }
        return null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        m<K, V>.d dVar = this.f8144m;
        if (dVar != null) {
            return dVar;
        }
        m<K, V>.d dVar2 = new d();
        this.f8144m = dVar2;
        return dVar2;
    }

    /* access modifiers changed from: package-private */
    public g<K, V> f(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return d(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public V get(Object obj) {
        g f2 = f(obj);
        if (f2 != null) {
            return f2.f8160n;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void h(g<K, V> gVar, boolean z) {
        int i2;
        if (z) {
            g<K, V> gVar2 = gVar.f8157k;
            gVar2.f8156j = gVar.f8156j;
            gVar.f8156j.f8157k = gVar2;
            gVar.f8157k = null;
            gVar.f8156j = null;
        }
        g<K, V> gVar3 = gVar.f8154h;
        g<K, V> gVar4 = gVar.f8155i;
        g<K, V> gVar5 = gVar.f8153g;
        int i3 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                j(gVar, gVar3);
                gVar.f8154h = null;
            } else if (gVar4 != null) {
                j(gVar, gVar4);
                gVar.f8155i = null;
            } else {
                j(gVar, (g<K, V>) null);
            }
            g(gVar5, false);
            this.f8141j--;
            this.f8142k++;
            return;
        }
        g<K, V> b2 = gVar3.o > gVar4.o ? gVar3.b() : gVar4.a();
        h(b2, false);
        g<K, V> gVar6 = gVar.f8154h;
        if (gVar6 != null) {
            i2 = gVar6.o;
            b2.f8154h = gVar6;
            gVar6.f8153g = b2;
            gVar.f8154h = null;
        } else {
            i2 = 0;
        }
        g<K, V> gVar7 = gVar.f8155i;
        if (gVar7 != null) {
            i3 = gVar7.o;
            b2.f8155i = gVar7;
            gVar7.f8153g = b2;
            gVar.f8155i = null;
        }
        b2.o = Math.max(i2, i3) + 1;
        j(gVar, b2);
    }

    /* access modifiers changed from: package-private */
    public g<K, V> i(Object obj) {
        g<K, V> f2 = f(obj);
        if (f2 != null) {
            h(f2, true);
        }
        return f2;
    }

    public Set<K> keySet() {
        m<K, V>.e eVar = this.f8145n;
        if (eVar != null) {
            return eVar;
        }
        m<K, V>.e eVar2 = new e();
        this.f8145n = eVar2;
        return eVar2;
    }

    public V put(K k2, V v) {
        if (k2 != null) {
            g d2 = d(k2, true);
            V v2 = d2.f8160n;
            d2.f8160n = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        g i2 = i(obj);
        if (i2 != null) {
            return i2.f8160n;
        }
        return null;
    }

    public int size() {
        return this.f8141j;
    }

    m(Comparator<? super K> comparator) {
        this.f8141j = 0;
        this.f8142k = 0;
        this.f8138g = comparator == null ? o : comparator;
        this.f8140i = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.f8139h = gVarArr;
        this.f8143l = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* compiled from: LinkedHashTreeMap */
    static final class g<K, V> implements Map.Entry<K, V> {

        /* renamed from: g  reason: collision with root package name */
        g<K, V> f8153g;

        /* renamed from: h  reason: collision with root package name */
        g<K, V> f8154h;

        /* renamed from: i  reason: collision with root package name */
        g<K, V> f8155i;

        /* renamed from: j  reason: collision with root package name */
        g<K, V> f8156j;

        /* renamed from: k  reason: collision with root package name */
        g<K, V> f8157k;

        /* renamed from: l  reason: collision with root package name */
        final K f8158l;

        /* renamed from: m  reason: collision with root package name */
        final int f8159m;

        /* renamed from: n  reason: collision with root package name */
        V f8160n;
        int o;

        g() {
            this.f8158l = null;
            this.f8159m = -1;
            this.f8157k = this;
            this.f8156j = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f8154h; gVar2 != null; gVar2 = gVar2.f8154h) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f8155i; gVar2 != null; gVar2 = gVar2.f8155i) {
                gVar = gVar2;
            }
            return gVar;
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
                K r0 = r3.f8158l
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f8160n
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
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.m.g.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f8158l;
        }

        public V getValue() {
            return this.f8160n;
        }

        public int hashCode() {
            K k2 = this.f8158l;
            int i2 = 0;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f8160n;
            if (v != null) {
                i2 = v.hashCode();
            }
            return hashCode ^ i2;
        }

        public V setValue(V v) {
            V v2 = this.f8160n;
            this.f8160n = v;
            return v2;
        }

        public String toString() {
            return this.f8158l + "=" + this.f8160n;
        }

        g(g<K, V> gVar, K k2, int i2, g<K, V> gVar2, g<K, V> gVar3) {
            this.f8153g = gVar;
            this.f8158l = k2;
            this.f8159m = i2;
            this.o = 1;
            this.f8156j = gVar2;
            this.f8157k = gVar3;
            gVar3.f8156j = this;
            gVar2.f8157k = this;
        }
    }
}

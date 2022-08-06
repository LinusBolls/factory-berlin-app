package com.nytimes.android.external.cache;

import com.nytimes.android.external.cache.e;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: LocalCache */
class k<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    static final Logger B = Logger.getLogger(k.class.getName());
    static final y<Object, Object> C = new a();
    static final Queue<? extends Object> D = new b();
    Set<Map.Entry<K, V>> A;

    /* renamed from: g  reason: collision with root package name */
    final int f4660g;

    /* renamed from: h  reason: collision with root package name */
    final int f4661h;

    /* renamed from: i  reason: collision with root package name */
    final p<K, V>[] f4662i;

    /* renamed from: j  reason: collision with root package name */
    final int f4663j;

    /* renamed from: k  reason: collision with root package name */
    final g<Object> f4664k;

    /* renamed from: l  reason: collision with root package name */
    final g<Object> f4665l;

    /* renamed from: m  reason: collision with root package name */
    final r f4666m;

    /* renamed from: n  reason: collision with root package name */
    final r f4667n;
    final long o;
    final x<K, V> p;
    final long q;
    final long r;
    final long s;
    final Queue<r<K, V>> t;
    final q<K, V> u;
    final u v;
    final f w;
    final CacheLoader<? super K, V> x;
    Set<K> y;
    Collection<V> z;

    /* compiled from: LocalCache */
    class a implements y<Object, Object> {
        a() {
        }

        public boolean b() {
            return false;
        }

        public boolean c() {
            return false;
        }

        public y<Object, Object> d(ReferenceQueue<Object> referenceQueue, Object obj, o<Object, Object> oVar) {
            return this;
        }

        public void e(Object obj) {
        }

        public o<Object, Object> f() {
            return null;
        }

        public int g() {
            return 0;
        }

        public Object get() {
            return null;
        }
    }

    /* compiled from: LocalCache */
    static final class a0<K, V> extends c0<K, V> {

        /* renamed from: j  reason: collision with root package name */
        volatile long f4668j = Long.MAX_VALUE;

        /* renamed from: k  reason: collision with root package name */
        o<K, V> f4669k = k.q();

        /* renamed from: l  reason: collision with root package name */
        o<K, V> f4670l = k.q();

        a0(ReferenceQueue<K> referenceQueue, K k2, int i2, o<K, V> oVar) {
            super(referenceQueue, k2, i2, oVar);
        }

        public o<K, V> f() {
            return this.f4670l;
        }

        public o<K, V> k() {
            return this.f4669k;
        }

        public void n(long j2) {
            this.f4668j = j2;
        }

        public void o(o<K, V> oVar) {
            this.f4669k = oVar;
        }

        public void t(o<K, V> oVar) {
            this.f4670l = oVar;
        }

        public long w() {
            return this.f4668j;
        }
    }

    /* compiled from: LocalCache */
    class b extends AbstractQueue<Object> {
        b() {
        }

        public Iterator<Object> iterator() {
            return new HashSet().iterator();
        }

        public boolean offer(Object obj) {
            return true;
        }

        public Object peek() {
            return null;
        }

        public Object poll() {
            return null;
        }

        public int size() {
            return 0;
        }
    }

    /* compiled from: LocalCache */
    static final class b0<K, V> extends c0<K, V> {

        /* renamed from: j  reason: collision with root package name */
        volatile long f4671j = Long.MAX_VALUE;

        /* renamed from: k  reason: collision with root package name */
        o<K, V> f4672k = k.q();

        /* renamed from: l  reason: collision with root package name */
        o<K, V> f4673l = k.q();

        /* renamed from: m  reason: collision with root package name */
        volatile long f4674m = Long.MAX_VALUE;

        /* renamed from: n  reason: collision with root package name */
        o<K, V> f4675n = k.q();
        o<K, V> o = k.q();

        b0(ReferenceQueue<K> referenceQueue, K k2, int i2, o<K, V> oVar) {
            super(referenceQueue, k2, i2, oVar);
        }

        public void a(long j2) {
            this.f4674m = j2;
        }

        public o<K, V> f() {
            return this.f4673l;
        }

        public void i(o<K, V> oVar) {
            this.o = oVar;
        }

        public o<K, V> k() {
            return this.f4672k;
        }

        public long l() {
            return this.f4674m;
        }

        public void n(long j2) {
            this.f4671j = j2;
        }

        public void o(o<K, V> oVar) {
            this.f4672k = oVar;
        }

        public o<K, V> p() {
            return this.o;
        }

        public o<K, V> q() {
            return this.f4675n;
        }

        public void t(o<K, V> oVar) {
            this.f4673l = oVar;
        }

        public long w() {
            return this.f4671j;
        }

        public void x(o<K, V> oVar) {
            this.f4675n = oVar;
        }
    }

    /* compiled from: LocalCache */
    abstract class c<T> extends AbstractSet<T> {

        /* renamed from: g  reason: collision with root package name */
        final ConcurrentMap<?, ?> f4676g;

        c(k kVar, ConcurrentMap<?, ?> concurrentMap) {
            this.f4676g = concurrentMap;
        }

        public void clear() {
            this.f4676g.clear();
        }

        public boolean isEmpty() {
            return this.f4676g.isEmpty();
        }

        public int size() {
            return this.f4676g.size();
        }

        public Object[] toArray() {
            return k.D(this).toArray();
        }

        public <E> E[] toArray(E[] eArr) {
            return k.D(this).toArray(eArr);
        }
    }

    /* compiled from: LocalCache */
    static class c0<K, V> extends WeakReference<K> implements o<K, V> {

        /* renamed from: g  reason: collision with root package name */
        final int f4677g;

        /* renamed from: h  reason: collision with root package name */
        final o<K, V> f4678h;

        /* renamed from: i  reason: collision with root package name */
        volatile y<K, V> f4679i = k.E();

        c0(ReferenceQueue<K> referenceQueue, K k2, int i2, o<K, V> oVar) {
            super(k2, referenceQueue);
            this.f4677g = i2;
            this.f4678h = oVar;
        }

        public void a(long j2) {
            throw new UnsupportedOperationException();
        }

        public o<K, V> f() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            return get();
        }

        public y<K, V> h() {
            return this.f4679i;
        }

        public void i(o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        public void j(y<K, V> yVar) {
            this.f4679i = yVar;
        }

        public o<K, V> k() {
            throw new UnsupportedOperationException();
        }

        public long l() {
            throw new UnsupportedOperationException();
        }

        public void n(long j2) {
            throw new UnsupportedOperationException();
        }

        public void o(o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        public o<K, V> p() {
            throw new UnsupportedOperationException();
        }

        public o<K, V> q() {
            throw new UnsupportedOperationException();
        }

        public void t(o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        public o<K, V> v() {
            return this.f4678h;
        }

        public long w() {
            throw new UnsupportedOperationException();
        }

        public void x(o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        public int y() {
            return this.f4677g;
        }
    }

    /* compiled from: LocalCache */
    static abstract class d<K, V> implements o<K, V> {
        d() {
        }

        public void a(long j2) {
            throw new UnsupportedOperationException();
        }

        public o<K, V> f() {
            throw new UnsupportedOperationException();
        }

        public K getKey() {
            throw new UnsupportedOperationException();
        }

        public y<K, V> h() {
            throw new UnsupportedOperationException();
        }

        public void i(o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        public void j(y<K, V> yVar) {
            throw new UnsupportedOperationException();
        }

        public o<K, V> k() {
            throw new UnsupportedOperationException();
        }

        public long l() {
            throw new UnsupportedOperationException();
        }

        public void n(long j2) {
            throw new UnsupportedOperationException();
        }

        public void o(o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        public o<K, V> p() {
            throw new UnsupportedOperationException();
        }

        public o<K, V> q() {
            throw new UnsupportedOperationException();
        }

        public void t(o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        public o<K, V> v() {
            throw new UnsupportedOperationException();
        }

        public long w() {
            throw new UnsupportedOperationException();
        }

        public void x(o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        public int y() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: LocalCache */
    static class d0<K, V> extends WeakReference<V> implements y<K, V> {

        /* renamed from: g  reason: collision with root package name */
        final o<K, V> f4680g;

        d0(ReferenceQueue<V> referenceQueue, V v, o<K, V> oVar) {
            super(v, referenceQueue);
            this.f4680g = oVar;
        }

        public boolean b() {
            return true;
        }

        public boolean c() {
            return false;
        }

        public y<K, V> d(ReferenceQueue<V> referenceQueue, V v, o<K, V> oVar) {
            return new d0(referenceQueue, v, oVar);
        }

        public void e(V v) {
        }

        public o<K, V> f() {
            return this.f4680g;
        }

        public int g() {
            return 1;
        }
    }

    /* compiled from: LocalCache */
    static final class e<K, V> extends AbstractQueue<o<K, V>> {

        /* renamed from: g  reason: collision with root package name */
        final o<K, V> f4681g = new a(this);

        /* compiled from: LocalCache */
        class a extends d<K, V> {

            /* renamed from: g  reason: collision with root package name */
            o<K, V> f4682g = this;

            /* renamed from: h  reason: collision with root package name */
            o<K, V> f4683h = this;

            a(e eVar) {
            }

            public o<K, V> f() {
                return this.f4683h;
            }

            public o<K, V> k() {
                return this.f4682g;
            }

            public void n(long j2) {
            }

            public void o(o<K, V> oVar) {
                this.f4682g = oVar;
            }

            public void t(o<K, V> oVar) {
                this.f4683h = oVar;
            }

            public long w() {
                return Long.MAX_VALUE;
            }
        }

        /* compiled from: LocalCache */
        class b extends b<o<K, V>> {
            b(o oVar) {
                super(oVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public o<K, V> a(o<K, V> oVar) {
                o<K, V> k2 = oVar.k();
                if (k2 == e.this.f4681g) {
                    return null;
                }
                return k2;
            }
        }

        e() {
        }

        /* renamed from: a */
        public boolean offer(o<K, V> oVar) {
            k.b(oVar.f(), oVar.k());
            k.b(this.f4681g.f(), oVar);
            k.b(oVar, this.f4681g);
            return true;
        }

        public void clear() {
            o<K, V> k2 = this.f4681g.k();
            while (true) {
                o<K, V> oVar = this.f4681g;
                if (k2 != oVar) {
                    o<K, V> k3 = k2.k();
                    k.r(k2);
                    k2 = k3;
                } else {
                    oVar.o(oVar);
                    o<K, V> oVar2 = this.f4681g;
                    oVar2.t(oVar2);
                    return;
                }
            }
        }

        public boolean contains(Object obj) {
            return ((o) obj).k() != n.INSTANCE;
        }

        /* renamed from: d */
        public o<K, V> peek() {
            o<K, V> k2 = this.f4681g.k();
            if (k2 == this.f4681g) {
                return null;
            }
            return k2;
        }

        /* renamed from: e */
        public o<K, V> poll() {
            o<K, V> k2 = this.f4681g.k();
            if (k2 == this.f4681g) {
                return null;
            }
            remove(k2);
            return k2;
        }

        public boolean isEmpty() {
            return this.f4681g.k() == this.f4681g;
        }

        public Iterator<o<K, V>> iterator() {
            return new b(peek());
        }

        public boolean remove(Object obj) {
            o oVar = (o) obj;
            o f2 = oVar.f();
            o k2 = oVar.k();
            k.b(f2, k2);
            k.r(oVar);
            return k2 != n.INSTANCE;
        }

        public int size() {
            int i2 = 0;
            for (o<K, V> k2 = this.f4681g.k(); k2 != this.f4681g; k2 = k2.k()) {
                i2++;
            }
            return i2;
        }
    }

    /* compiled from: LocalCache */
    static final class e0<K, V> extends c0<K, V> {

        /* renamed from: j  reason: collision with root package name */
        volatile long f4685j = Long.MAX_VALUE;

        /* renamed from: k  reason: collision with root package name */
        o<K, V> f4686k = k.q();

        /* renamed from: l  reason: collision with root package name */
        o<K, V> f4687l = k.q();

        e0(ReferenceQueue<K> referenceQueue, K k2, int i2, o<K, V> oVar) {
            super(referenceQueue, k2, i2, oVar);
        }

        public void a(long j2) {
            this.f4685j = j2;
        }

        public void i(o<K, V> oVar) {
            this.f4687l = oVar;
        }

        public long l() {
            return this.f4685j;
        }

        public o<K, V> p() {
            return this.f4687l;
        }

        public o<K, V> q() {
            return this.f4686k;
        }

        public void x(o<K, V> oVar) {
            this.f4686k = oVar;
        }
    }

    /* compiled from: LocalCache */
    enum f {
        STRONG {
            /* access modifiers changed from: package-private */
            public <K, V> o<K, V> j(p<K, V> pVar, K k2, int i2, o<K, V> oVar) {
                return new u(k2, i2, oVar);
            }
        },
        STRONG_ACCESS {
            /* access modifiers changed from: package-private */
            public <K, V> o<K, V> f(p<K, V> pVar, o<K, V> oVar, o<K, V> oVar2) {
                o<K, V> f2 = super.f(pVar, oVar, oVar2);
                a(oVar, f2);
                return f2;
            }

            /* access modifiers changed from: package-private */
            public <K, V> o<K, V> j(p<K, V> pVar, K k2, int i2, o<K, V> oVar) {
                return new s(k2, i2, oVar);
            }
        },
        STRONG_WRITE {
            /* access modifiers changed from: package-private */
            public <K, V> o<K, V> f(p<K, V> pVar, o<K, V> oVar, o<K, V> oVar2) {
                o<K, V> f2 = super.f(pVar, oVar, oVar2);
                h(oVar, f2);
                return f2;
            }

            /* access modifiers changed from: package-private */
            public <K, V> o<K, V> j(p<K, V> pVar, K k2, int i2, o<K, V> oVar) {
                return new w(k2, i2, oVar);
            }
        },
        STRONG_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            public <K, V> o<K, V> f(p<K, V> pVar, o<K, V> oVar, o<K, V> oVar2) {
                o<K, V> f2 = super.f(pVar, oVar, oVar2);
                a(oVar, f2);
                h(oVar, f2);
                return f2;
            }

            /* access modifiers changed from: package-private */
            public <K, V> o<K, V> j(p<K, V> pVar, K k2, int i2, o<K, V> oVar) {
                return new t(k2, i2, oVar);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            public <K, V> o<K, V> j(p<K, V> pVar, K k2, int i2, o<K, V> oVar) {
                return new c0(pVar.f4728n, k2, i2, oVar);
            }
        },
        WEAK_ACCESS {
            /* access modifiers changed from: package-private */
            public <K, V> o<K, V> f(p<K, V> pVar, o<K, V> oVar, o<K, V> oVar2) {
                o<K, V> f2 = super.f(pVar, oVar, oVar2);
                a(oVar, f2);
                return f2;
            }

            /* access modifiers changed from: package-private */
            public <K, V> o<K, V> j(p<K, V> pVar, K k2, int i2, o<K, V> oVar) {
                return new a0(pVar.f4728n, k2, i2, oVar);
            }
        },
        WEAK_WRITE {
            /* access modifiers changed from: package-private */
            public <K, V> o<K, V> f(p<K, V> pVar, o<K, V> oVar, o<K, V> oVar2) {
                o<K, V> f2 = super.f(pVar, oVar, oVar2);
                h(oVar, f2);
                return f2;
            }

            /* access modifiers changed from: package-private */
            public <K, V> o<K, V> j(p<K, V> pVar, K k2, int i2, o<K, V> oVar) {
                return new e0(pVar.f4728n, k2, i2, oVar);
            }
        },
        WEAK_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            public <K, V> o<K, V> f(p<K, V> pVar, o<K, V> oVar, o<K, V> oVar2) {
                o<K, V> f2 = super.f(pVar, oVar, oVar2);
                a(oVar, f2);
                h(oVar, f2);
                return f2;
            }

            /* access modifiers changed from: package-private */
            public <K, V> o<K, V> j(p<K, V> pVar, K k2, int i2, o<K, V> oVar) {
                return new b0(pVar.f4728n, k2, i2, oVar);
            }
        };
        
        static final f[] o = null;

        static {
            h hVar;
            f fVar;
            f fVar2;
            f fVar3;
            f fVar4;
            f fVar5;
            f fVar6;
            f fVar7;
            o = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, hVar};
        }

        static f i(r rVar, boolean z, boolean z2) {
            char c2 = 0;
            boolean z3 = (rVar == r.WEAK ? (char) 4 : 0) | z;
            if (z2) {
                c2 = 2;
            }
            return o[z3 | c2];
        }

        /* access modifiers changed from: package-private */
        public <K, V> void a(o<K, V> oVar, o<K, V> oVar2) {
            oVar2.n(oVar.w());
            k.b(oVar.f(), oVar2);
            k.b(oVar2, oVar.k());
            k.r(oVar);
        }

        /* access modifiers changed from: package-private */
        public <K, V> o<K, V> f(p<K, V> pVar, o<K, V> oVar, o<K, V> oVar2) {
            return j(pVar, oVar.getKey(), oVar.y(), oVar2);
        }

        /* access modifiers changed from: package-private */
        public <K, V> void h(o<K, V> oVar, o<K, V> oVar2) {
            oVar2.a(oVar.l());
            k.c(oVar.p(), oVar2);
            k.c(oVar2, oVar.q());
            k.s(oVar);
        }

        /* access modifiers changed from: package-private */
        public abstract <K, V> o<K, V> j(p<K, V> pVar, K k2, int i2, o<K, V> oVar);
    }

    /* compiled from: LocalCache */
    static final class f0<K, V> extends q<K, V> {

        /* renamed from: h  reason: collision with root package name */
        final int f4696h;

        f0(ReferenceQueue<V> referenceQueue, V v, o<K, V> oVar, int i2) {
            super(referenceQueue, v, oVar);
            this.f4696h = i2;
        }

        public y<K, V> d(ReferenceQueue<V> referenceQueue, V v, o<K, V> oVar) {
            return new f0(referenceQueue, v, oVar, this.f4696h);
        }

        public int g() {
            return this.f4696h;
        }
    }

    /* compiled from: LocalCache */
    final class g extends k<K, V>.i<Map.Entry<K, V>> {
        g(k kVar) {
            super();
        }

        /* renamed from: g */
        public Map.Entry<K, V> next() {
            return d();
        }
    }

    /* compiled from: LocalCache */
    static final class g0<K, V> extends v<K, V> {

        /* renamed from: h  reason: collision with root package name */
        final int f4697h;

        g0(V v, int i2) {
            super(v);
            this.f4697h = i2;
        }

        public int g() {
            return this.f4697h;
        }
    }

    /* compiled from: LocalCache */
    final class h extends k<K, V>.defpackage.c<Map.Entry<K, V>> {
        h(ConcurrentMap<?, ?> concurrentMap) {
            super(k.this, concurrentMap);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean contains(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x000f
                return r1
            L_0x000f:
                com.nytimes.android.external.cache.k r2 = com.nytimes.android.external.cache.k.this
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L_0x0026
                com.nytimes.android.external.cache.k r2 = com.nytimes.android.external.cache.k.this
                com.nytimes.android.external.cache.g<java.lang.Object> r2 = r2.f4665l
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.d(r4, r0)
                if (r4 == 0) goto L_0x0026
                r1 = 1
            L_0x0026:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache.k.h.contains(java.lang.Object):boolean");
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new g(k.this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean remove(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 == 0) goto L_0x001b
                com.nytimes.android.external.cache.k r2 = com.nytimes.android.external.cache.k.this
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L_0x001b
                r1 = 1
            L_0x001b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache.k.h.remove(java.lang.Object):boolean");
        }
    }

    /* compiled from: LocalCache */
    static final class h0<K, V> extends d0<K, V> {

        /* renamed from: h  reason: collision with root package name */
        final int f4699h;

        h0(ReferenceQueue<V> referenceQueue, V v, o<K, V> oVar, int i2) {
            super(referenceQueue, v, oVar);
            this.f4699h = i2;
        }

        public y<K, V> d(ReferenceQueue<V> referenceQueue, V v, o<K, V> oVar) {
            return new h0(referenceQueue, v, oVar, this.f4699h);
        }

        public int g() {
            return this.f4699h;
        }
    }

    /* compiled from: LocalCache */
    abstract class i<T> implements Iterator<T> {

        /* renamed from: g  reason: collision with root package name */
        int f4700g;

        /* renamed from: h  reason: collision with root package name */
        int f4701h = -1;

        /* renamed from: i  reason: collision with root package name */
        p<K, V> f4702i;

        /* renamed from: j  reason: collision with root package name */
        AtomicReferenceArray<o<K, V>> f4703j;

        /* renamed from: k  reason: collision with root package name */
        o<K, V> f4704k;

        /* renamed from: l  reason: collision with root package name */
        k<K, V>.j0 f4705l;

        /* renamed from: m  reason: collision with root package name */
        k<K, V>.j0 f4706m;

        i() {
            this.f4700g = k.this.f4662i.length - 1;
            a();
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f4705l = null;
            if (!e() && !f()) {
                while (true) {
                    int i2 = this.f4700g;
                    if (i2 >= 0) {
                        p<K, V>[] pVarArr = k.this.f4662i;
                        this.f4700g = i2 - 1;
                        p<K, V> pVar = pVarArr[i2];
                        this.f4702i = pVar;
                        if (pVar.f4722h != 0) {
                            AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f4702i.f4726l;
                            this.f4703j = atomicReferenceArray;
                            this.f4701h = atomicReferenceArray.length() - 1;
                            if (f()) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(o<K, V> oVar) {
            boolean z;
            try {
                long a = k.this.v.a();
                K key = oVar.getKey();
                V k2 = k.this.k(oVar, a);
                if (k2 != null) {
                    this.f4705l = new j0(k.this, key, k2);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.f4702i.C();
            }
        }

        /* access modifiers changed from: package-private */
        public k<K, V>.j0 d() {
            k<K, V>.j0 j0Var = this.f4705l;
            if (j0Var != null) {
                this.f4706m = j0Var;
                a();
                return this.f4706m;
            }
            throw new NoSuchElementException();
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            o<K, V> oVar = this.f4704k;
            if (oVar == null) {
                return false;
            }
            while (true) {
                this.f4704k = oVar.v();
                o<K, V> oVar2 = this.f4704k;
                if (oVar2 == null) {
                    return false;
                }
                if (c(oVar2)) {
                    return true;
                }
                oVar = this.f4704k;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            while (true) {
                int i2 = this.f4701h;
                if (i2 < 0) {
                    return false;
                }
                AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f4703j;
                this.f4701h = i2 - 1;
                o<K, V> oVar = atomicReferenceArray.get(i2);
                this.f4704k = oVar;
                if (oVar != null && (c(oVar) || e())) {
                    return true;
                }
            }
        }

        public boolean hasNext() {
            return this.f4705l != null;
        }

        public void remove() {
            o.c(this.f4706m != null);
            k.this.remove(this.f4706m.getKey());
            this.f4706m = null;
        }
    }

    /* compiled from: LocalCache */
    static final class i0<K, V> extends AbstractQueue<o<K, V>> {

        /* renamed from: g  reason: collision with root package name */
        final o<K, V> f4708g = new a(this);

        /* compiled from: LocalCache */
        class a extends d<K, V> {

            /* renamed from: g  reason: collision with root package name */
            o<K, V> f4709g = this;

            /* renamed from: h  reason: collision with root package name */
            o<K, V> f4710h = this;

            a(i0 i0Var) {
            }

            public void a(long j2) {
            }

            public void i(o<K, V> oVar) {
                this.f4710h = oVar;
            }

            public long l() {
                return Long.MAX_VALUE;
            }

            public o<K, V> p() {
                return this.f4710h;
            }

            public o<K, V> q() {
                return this.f4709g;
            }

            public void x(o<K, V> oVar) {
                this.f4709g = oVar;
            }
        }

        /* compiled from: LocalCache */
        class b extends b<o<K, V>> {
            b(o oVar) {
                super(oVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public o<K, V> a(o<K, V> oVar) {
                o<K, V> q = oVar.q();
                if (q == i0.this.f4708g) {
                    return null;
                }
                return q;
            }
        }

        i0() {
        }

        /* renamed from: a */
        public boolean offer(o<K, V> oVar) {
            k.c(oVar.p(), oVar.q());
            k.c(this.f4708g.p(), oVar);
            k.c(oVar, this.f4708g);
            return true;
        }

        public void clear() {
            o<K, V> q = this.f4708g.q();
            while (true) {
                o<K, V> oVar = this.f4708g;
                if (q != oVar) {
                    o<K, V> q2 = q.q();
                    k.s(q);
                    q = q2;
                } else {
                    oVar.x(oVar);
                    o<K, V> oVar2 = this.f4708g;
                    oVar2.i(oVar2);
                    return;
                }
            }
        }

        public boolean contains(Object obj) {
            return ((o) obj).q() != n.INSTANCE;
        }

        /* renamed from: d */
        public o<K, V> peek() {
            o<K, V> q = this.f4708g.q();
            if (q == this.f4708g) {
                return null;
            }
            return q;
        }

        /* renamed from: e */
        public o<K, V> poll() {
            o<K, V> q = this.f4708g.q();
            if (q == this.f4708g) {
                return null;
            }
            remove(q);
            return q;
        }

        public boolean isEmpty() {
            return this.f4708g.q() == this.f4708g;
        }

        public Iterator<o<K, V>> iterator() {
            return new b(peek());
        }

        public boolean remove(Object obj) {
            o oVar = (o) obj;
            o p = oVar.p();
            o q = oVar.q();
            k.c(p, q);
            k.s(oVar);
            return q != n.INSTANCE;
        }

        public int size() {
            int i2 = 0;
            for (o<K, V> q = this.f4708g.q(); q != this.f4708g; q = q.q()) {
                i2++;
            }
            return i2;
        }
    }

    /* compiled from: LocalCache */
    final class j extends k<K, V>.i<K> {
        j(k kVar) {
            super();
        }

        public K next() {
            return d().getKey();
        }
    }

    /* compiled from: LocalCache */
    final class j0 implements Map.Entry<K, V> {

        /* renamed from: g  reason: collision with root package name */
        final K f4712g;

        /* renamed from: h  reason: collision with root package name */
        V f4713h;

        j0(k kVar, K k2, V v) {
            this.f4712g = k2;
            this.f4713h = v;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f4712g.equals(entry.getKey()) || !this.f4713h.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f4712g;
        }

        public V getValue() {
            return this.f4713h;
        }

        public int hashCode() {
            return this.f4712g.hashCode() ^ this.f4713h.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException();
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: com.nytimes.android.external.cache.k$k  reason: collision with other inner class name */
    /* compiled from: LocalCache */
    final class C0137k extends k<K, V>.defpackage.c<K> {
        C0137k(ConcurrentMap<?, ?> concurrentMap) {
            super(k.this, concurrentMap);
        }

        public boolean contains(Object obj) {
            return this.f4676g.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new j(k.this);
        }

        public boolean remove(Object obj) {
            return this.f4676g.remove(obj) != null;
        }
    }

    /* compiled from: LocalCache */
    static class l<K, V> implements y<K, V> {

        /* renamed from: g  reason: collision with root package name */
        volatile y<K, V> f4715g;

        /* renamed from: h  reason: collision with root package name */
        final s<V> f4716h;

        /* renamed from: i  reason: collision with root package name */
        final t f4717i;

        /* compiled from: LocalCache */
        class a implements h<V, V> {
            a() {
            }

            public V a(V v) {
                l.this.j(v);
                return v;
            }
        }

        public l() {
            this(k.E());
        }

        private j<V> a(Throwable th) {
            return i.a(th);
        }

        public boolean b() {
            return this.f4715g.b();
        }

        public boolean c() {
            return true;
        }

        public y<K, V> d(ReferenceQueue<V> referenceQueue, V v, o<K, V> oVar) {
            return this;
        }

        public void e(V v) {
            if (v != null) {
                j(v);
            } else {
                this.f4715g = k.E();
            }
        }

        public o<K, V> f() {
            return null;
        }

        public int g() {
            return this.f4715g.g();
        }

        public V get() {
            return this.f4715g.get();
        }

        public y<K, V> h() {
            return this.f4715g;
        }

        public j<V> i(K k2, CacheLoader<? super K, V> cacheLoader) {
            try {
                this.f4717i.e();
                V v = this.f4715g.get();
                if (v == null) {
                    V a2 = cacheLoader.a(k2);
                    return j(a2) ? this.f4716h : i.b(a2);
                }
                j<V> b = cacheLoader.b(k2, v);
                if (b == null) {
                    return i.b(null);
                }
                return i.c(b, new a());
            } catch (Throwable th) {
                j<V> a3 = k(th) ? this.f4716h : a(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return a3;
            }
        }

        public boolean j(V v) {
            return this.f4716h.v(v);
        }

        public boolean k(Throwable th) {
            return this.f4716h.w(th);
        }

        public l(y<K, V> yVar) {
            this.f4716h = s.y();
            this.f4717i = t.c();
            this.f4715g = yVar;
        }
    }

    /* compiled from: LocalCache */
    static class m<K, V> implements d<K, V>, Serializable {

        /* renamed from: g  reason: collision with root package name */
        final k<K, V> f4718g;

        m(e<? super K, ? super V> eVar) {
            this(new k(eVar, (CacheLoader) null));
        }

        public V a(Object obj) {
            return this.f4718g.j(obj);
        }

        public void b(Iterable<?> iterable) {
            this.f4718g.m(iterable);
        }

        public ConcurrentMap<K, V> c() {
            return this.f4718g;
        }

        public void put(K k2, V v) {
            this.f4718g.put(k2, v);
        }

        private m(k<K, V> kVar) {
            this.f4718g = kVar;
        }
    }

    /* compiled from: LocalCache */
    private enum n implements o<Object, Object> {
        INSTANCE;

        public void a(long j2) {
        }

        public o<Object, Object> f() {
            return this;
        }

        public Object getKey() {
            return null;
        }

        public y<Object, Object> h() {
            return null;
        }

        public void i(o<Object, Object> oVar) {
        }

        public void j(y<Object, Object> yVar) {
        }

        public o<Object, Object> k() {
            return this;
        }

        public long l() {
            return 0;
        }

        public void n(long j2) {
        }

        public void o(o<Object, Object> oVar) {
        }

        public o<Object, Object> p() {
            return this;
        }

        public o<Object, Object> q() {
            return this;
        }

        public void t(o<Object, Object> oVar) {
        }

        public o<Object, Object> v() {
            return null;
        }

        public long w() {
            return 0;
        }

        public void x(o<Object, Object> oVar) {
        }

        public int y() {
            return 0;
        }
    }

    /* compiled from: LocalCache */
    interface o<K, V> {
        void a(long j2);

        o<K, V> f();

        K getKey();

        y<K, V> h();

        void i(o<K, V> oVar);

        void j(y<K, V> yVar);

        o<K, V> k();

        long l();

        void n(long j2);

        void o(o<K, V> oVar);

        o<K, V> p();

        o<K, V> q();

        void t(o<K, V> oVar);

        o<K, V> v();

        long w();

        void x(o<K, V> oVar);

        int y();
    }

    /* compiled from: LocalCache */
    static class p<K, V> extends ReentrantLock {

        /* renamed from: g  reason: collision with root package name */
        final k<K, V> f4721g;

        /* renamed from: h  reason: collision with root package name */
        volatile int f4722h;

        /* renamed from: i  reason: collision with root package name */
        long f4723i;

        /* renamed from: j  reason: collision with root package name */
        int f4724j;

        /* renamed from: k  reason: collision with root package name */
        int f4725k;

        /* renamed from: l  reason: collision with root package name */
        volatile AtomicReferenceArray<o<K, V>> f4726l;

        /* renamed from: m  reason: collision with root package name */
        final long f4727m;

        /* renamed from: n  reason: collision with root package name */
        final ReferenceQueue<K> f4728n;
        final ReferenceQueue<V> o;
        final Queue<o<K, V>> p;
        final AtomicInteger q = new AtomicInteger();
        final Queue<o<K, V>> r;
        final Queue<o<K, V>> s;

        /* compiled from: LocalCache */
        class a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Object f4729g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ int f4730h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ l f4731i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ j f4732j;

            a(Object obj, int i2, l lVar, j jVar) {
                this.f4729g = obj;
                this.f4730h = i2;
                this.f4731i = lVar;
                this.f4732j = jVar;
            }

            public void run() {
                try {
                    p.this.r(this.f4729g, this.f4730h, this.f4731i, this.f4732j);
                } catch (Throwable th) {
                    k.B.log(Level.WARNING, "Exception thrown during refresh", th);
                    this.f4731i.k(th);
                }
            }
        }

        p(k<K, V> kVar, int i2, long j2) {
            Queue<o<K, V>> queue;
            Queue<o<K, V>> queue2;
            Queue<o<K, V>> queue3;
            this.f4721g = kVar;
            this.f4727m = j2;
            x(B(i2));
            ReferenceQueue<V> referenceQueue = null;
            this.f4728n = kVar.H() ? new ReferenceQueue<>() : null;
            this.o = kVar.I() ? new ReferenceQueue<>() : referenceQueue;
            if (kVar.G()) {
                queue = new ConcurrentLinkedQueue<>();
            } else {
                queue = k.f();
            }
            this.p = queue;
            if (kVar.K()) {
                queue2 = new i0<>();
            } else {
                queue2 = k.f();
            }
            this.r = queue2;
            if (kVar.G()) {
                queue3 = new e<>();
            } else {
                queue3 = k.f();
            }
            this.s = queue3;
        }

        /* access modifiers changed from: package-private */
        public o<K, V> A(K k2, int i2, o<K, V> oVar) {
            f fVar = this.f4721g.w;
            o.a(k2);
            return fVar.j(this, k2, i2, oVar);
        }

        /* access modifiers changed from: package-private */
        public AtomicReferenceArray<o<K, V>> B(int i2) {
            return new AtomicReferenceArray<>(i2);
        }

        /* access modifiers changed from: package-private */
        public void C() {
            if ((this.q.incrementAndGet() & 63) == 0) {
                a();
            }
        }

        /* access modifiers changed from: package-private */
        public void D() {
            W();
        }

        /* access modifiers changed from: package-private */
        public void E(long j2) {
            V(j2);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
            r0 = r8.h();
            r7 = r0.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
            if (r7 != null) goto L_0x007f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
            r10.f4724j++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
            if (r0.b() == false) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
            m(r11, r12, r0, com.nytimes.android.external.cache.p.COLLECTED);
            Y(r8, r11, r13, r5);
            r11 = r10.f4722h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
            Y(r8, r11, r13, r5);
            r11 = r10.f4722h + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0073, code lost:
            r10.f4722h = r11;
            n(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
            if (r14 == false) goto L_0x008b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            I(r8, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
            unlock();
            D();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r10.f4724j++;
            m(r11, r12, r0, com.nytimes.android.external.cache.p.REPLACED);
            Y(r8, r11, r13, r5);
            n(r8);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V F(K r11, int r12, V r13, boolean r14) {
            /*
                r10 = this;
                r10.lock()
                com.nytimes.android.external.cache.k<K, V> r0 = r10.f4721g     // Catch:{ all -> 0x00c4 }
                com.nytimes.android.external.cache.u r0 = r0.v     // Catch:{ all -> 0x00c4 }
                long r5 = r0.a()     // Catch:{ all -> 0x00c4 }
                r10.E(r5)     // Catch:{ all -> 0x00c4 }
                int r0 = r10.f4722h     // Catch:{ all -> 0x00c4 }
                int r0 = r0 + 1
                int r1 = r10.f4725k     // Catch:{ all -> 0x00c4 }
                if (r0 <= r1) goto L_0x0019
                r10.o()     // Catch:{ all -> 0x00c4 }
            L_0x0019:
                java.util.concurrent.atomic.AtomicReferenceArray<com.nytimes.android.external.cache.k$o<K, V>> r0 = r10.f4726l     // Catch:{ all -> 0x00c4 }
                int r1 = r0.length()     // Catch:{ all -> 0x00c4 }
                int r1 = r1 + -1
                r7 = r12 & r1
                java.lang.Object r1 = r0.get(r7)     // Catch:{ all -> 0x00c4 }
                com.nytimes.android.external.cache.k$o r1 = (com.nytimes.android.external.cache.k.o) r1     // Catch:{ all -> 0x00c4 }
                r8 = r1
            L_0x002a:
                r9 = 0
                if (r8 == 0) goto L_0x00a6
                java.lang.Object r2 = r8.getKey()     // Catch:{ all -> 0x00c4 }
                int r3 = r8.y()     // Catch:{ all -> 0x00c4 }
                if (r3 != r12) goto L_0x00a1
                if (r2 == 0) goto L_0x00a1
                com.nytimes.android.external.cache.k<K, V> r3 = r10.f4721g     // Catch:{ all -> 0x00c4 }
                com.nytimes.android.external.cache.g<java.lang.Object> r3 = r3.f4664k     // Catch:{ all -> 0x00c4 }
                boolean r2 = r3.d(r11, r2)     // Catch:{ all -> 0x00c4 }
                if (r2 == 0) goto L_0x00a1
                com.nytimes.android.external.cache.k$y r0 = r8.h()     // Catch:{ all -> 0x00c4 }
                java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x00c4 }
                if (r7 != 0) goto L_0x007f
                int r14 = r10.f4724j     // Catch:{ all -> 0x00c4 }
                int r14 = r14 + 1
                r10.f4724j = r14     // Catch:{ all -> 0x00c4 }
                boolean r14 = r0.b()     // Catch:{ all -> 0x00c4 }
                if (r14 == 0) goto L_0x0068
                com.nytimes.android.external.cache.p r14 = com.nytimes.android.external.cache.p.COLLECTED     // Catch:{ all -> 0x00c4 }
                r10.m(r11, r12, r0, r14)     // Catch:{ all -> 0x00c4 }
                r1 = r10
                r2 = r8
                r3 = r11
                r4 = r13
                r1.Y(r2, r3, r4, r5)     // Catch:{ all -> 0x00c4 }
                int r11 = r10.f4722h     // Catch:{ all -> 0x00c4 }
                goto L_0x0073
            L_0x0068:
                r1 = r10
                r2 = r8
                r3 = r11
                r4 = r13
                r1.Y(r2, r3, r4, r5)     // Catch:{ all -> 0x00c4 }
                int r11 = r10.f4722h     // Catch:{ all -> 0x00c4 }
                int r11 = r11 + 1
            L_0x0073:
                r10.f4722h = r11     // Catch:{ all -> 0x00c4 }
                r10.n(r8)     // Catch:{ all -> 0x00c4 }
            L_0x0078:
                r10.unlock()
                r10.D()
                return r9
            L_0x007f:
                if (r14 == 0) goto L_0x008b
                r10.I(r8, r5)     // Catch:{ all -> 0x00c4 }
            L_0x0084:
                r10.unlock()
                r10.D()
                return r7
            L_0x008b:
                int r14 = r10.f4724j     // Catch:{ all -> 0x00c4 }
                int r14 = r14 + 1
                r10.f4724j = r14     // Catch:{ all -> 0x00c4 }
                com.nytimes.android.external.cache.p r14 = com.nytimes.android.external.cache.p.REPLACED     // Catch:{ all -> 0x00c4 }
                r10.m(r11, r12, r0, r14)     // Catch:{ all -> 0x00c4 }
                r1 = r10
                r2 = r8
                r3 = r11
                r4 = r13
                r1.Y(r2, r3, r4, r5)     // Catch:{ all -> 0x00c4 }
                r10.n(r8)     // Catch:{ all -> 0x00c4 }
                goto L_0x0084
            L_0x00a1:
                com.nytimes.android.external.cache.k$o r8 = r8.v()     // Catch:{ all -> 0x00c4 }
                goto L_0x002a
            L_0x00a6:
                int r14 = r10.f4724j     // Catch:{ all -> 0x00c4 }
                int r14 = r14 + 1
                r10.f4724j = r14     // Catch:{ all -> 0x00c4 }
                com.nytimes.android.external.cache.k$o r12 = r10.A(r11, r12, r1)     // Catch:{ all -> 0x00c4 }
                r1 = r10
                r2 = r12
                r3 = r11
                r4 = r13
                r1.Y(r2, r3, r4, r5)     // Catch:{ all -> 0x00c4 }
                r0.set(r7, r12)     // Catch:{ all -> 0x00c4 }
                int r11 = r10.f4722h     // Catch:{ all -> 0x00c4 }
                int r11 = r11 + 1
                r10.f4722h = r11     // Catch:{ all -> 0x00c4 }
                r10.n(r12)     // Catch:{ all -> 0x00c4 }
                goto L_0x0078
            L_0x00c4:
                r11 = move-exception
                r10.unlock()
                r10.D()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache.k.p.F(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        public boolean G(o<K, V> oVar, int i2) {
            lock();
            try {
                AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f4726l;
                int length = (atomicReferenceArray.length() - 1) & i2;
                o<K, V> oVar2 = atomicReferenceArray.get(length);
                for (o<K, V> oVar3 = oVar2; oVar3 != null; oVar3 = oVar3.v()) {
                    if (oVar3 == oVar) {
                        this.f4724j++;
                        atomicReferenceArray.set(length, S(oVar2, oVar3, oVar3.getKey(), i2, oVar3.h(), p.COLLECTED));
                        this.f4722h--;
                        return true;
                    }
                }
                unlock();
                D();
                return false;
            } finally {
                unlock();
                D();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean H(K k2, int i2, y<K, V> yVar) {
            lock();
            try {
                AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f4726l;
                int length = (atomicReferenceArray.length() - 1) & i2;
                o oVar = atomicReferenceArray.get(length);
                o oVar2 = oVar;
                while (oVar2 != null) {
                    Object key = oVar2.getKey();
                    if (oVar2.y() != i2 || key == null || !this.f4721g.f4664k.d(k2, key)) {
                        oVar2 = oVar2.v();
                    } else if (oVar2.h() == yVar) {
                        this.f4724j++;
                        atomicReferenceArray.set(length, S(oVar, oVar2, key, i2, yVar, p.COLLECTED));
                        this.f4722h--;
                        return true;
                    } else {
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            D();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    D();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    D();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void I(o<K, V> oVar, long j2) {
            if (this.f4721g.w()) {
                oVar.n(j2);
            }
            this.s.add(oVar);
        }

        /* access modifiers changed from: package-private */
        public void J(o<K, V> oVar, long j2) {
            if (this.f4721g.w()) {
                oVar.n(j2);
            }
            this.p.add(oVar);
        }

        /* access modifiers changed from: package-private */
        public void K(o<K, V> oVar, int i2, long j2) {
            i();
            this.f4723i += (long) i2;
            if (this.f4721g.w()) {
                oVar.n(j2);
            }
            if (this.f4721g.y()) {
                oVar.a(j2);
            }
            this.s.add(oVar);
            this.r.add(oVar);
        }

        /* access modifiers changed from: package-private */
        public V L(K k2, int i2, CacheLoader<? super K, V> cacheLoader, boolean z) {
            l y = y(k2, i2, z);
            if (y == null) {
                return null;
            }
            j<V> z2 = z(k2, i2, y, cacheLoader);
            if (z2.isDone()) {
                try {
                    return v.a(z2);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public V M(Object obj, int i2) {
            p pVar;
            lock();
            try {
                E(this.f4721g.v.a());
                AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f4726l;
                int length = (atomicReferenceArray.length() - 1) & i2;
                o oVar = atomicReferenceArray.get(length);
                o oVar2 = oVar;
                while (true) {
                    if (oVar2 == null) {
                        break;
                    }
                    Object key = oVar2.getKey();
                    if (oVar2.y() != i2 || key == null || !this.f4721g.f4664k.d(obj, key)) {
                        oVar2 = oVar2.v();
                    } else {
                        y h2 = oVar2.h();
                        V v = h2.get();
                        if (v != null) {
                            pVar = p.EXPLICIT;
                        } else if (h2.b()) {
                            pVar = p.COLLECTED;
                        }
                        p pVar2 = pVar;
                        this.f4724j++;
                        atomicReferenceArray.set(length, S(oVar, oVar2, key, i2, h2, pVar2));
                        this.f4722h--;
                        return v;
                    }
                }
                unlock();
                D();
                return null;
            } finally {
                unlock();
                D();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean N(Object obj, int i2, Object obj2) {
            p pVar;
            lock();
            try {
                E(this.f4721g.v.a());
                AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f4726l;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i2;
                o oVar = atomicReferenceArray.get(length);
                o oVar2 = oVar;
                while (true) {
                    if (oVar2 == null) {
                        break;
                    }
                    Object key = oVar2.getKey();
                    if (oVar2.y() != i2 || key == null || !this.f4721g.f4664k.d(obj, key)) {
                        oVar2 = oVar2.v();
                    } else {
                        y h2 = oVar2.h();
                        Object obj3 = h2.get();
                        if (this.f4721g.f4665l.d(obj2, obj3)) {
                            pVar = p.EXPLICIT;
                        } else if (obj3 == null && h2.b()) {
                            pVar = p.COLLECTED;
                        }
                        this.f4724j++;
                        atomicReferenceArray.set(length, S(oVar, oVar2, key, i2, h2, pVar));
                        this.f4722h--;
                        if (pVar != p.EXPLICIT) {
                            z = false;
                        }
                        return z;
                    }
                }
                unlock();
                D();
                return false;
            } finally {
                unlock();
                D();
            }
        }

        /* access modifiers changed from: package-private */
        public void O(o<K, V> oVar) {
            l(oVar, p.COLLECTED);
            this.r.remove(oVar);
            this.s.remove(oVar);
        }

        /* access modifiers changed from: package-private */
        public boolean P(o<K, V> oVar, int i2, p pVar) {
            AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f4726l;
            int length = (atomicReferenceArray.length() - 1) & i2;
            o<K, V> oVar2 = atomicReferenceArray.get(length);
            for (o<K, V> oVar3 = oVar2; oVar3 != null; oVar3 = oVar3.v()) {
                if (oVar3 == oVar) {
                    this.f4724j++;
                    atomicReferenceArray.set(length, S(oVar2, oVar3, oVar3.getKey(), i2, oVar3.h(), pVar));
                    this.f4722h--;
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public o<K, V> Q(o<K, V> oVar, o<K, V> oVar2) {
            int i2 = this.f4722h;
            o<K, V> v = oVar2.v();
            while (oVar != oVar2) {
                o<K, V> g2 = g(oVar, v);
                if (g2 != null) {
                    v = g2;
                } else {
                    O(oVar);
                    i2--;
                }
                oVar = oVar.v();
            }
            this.f4722h = i2;
            return v;
        }

        /* access modifiers changed from: package-private */
        public boolean R(K k2, int i2, l<K, V> lVar) {
            lock();
            try {
                AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f4726l;
                int length = (atomicReferenceArray.length() - 1) & i2;
                o oVar = atomicReferenceArray.get(length);
                o oVar2 = oVar;
                while (true) {
                    if (oVar2 == null) {
                        break;
                    }
                    Object key = oVar2.getKey();
                    if (oVar2.y() != i2 || key == null || !this.f4721g.f4664k.d(k2, key)) {
                        oVar2 = oVar2.v();
                    } else if (oVar2.h() == lVar) {
                        if (lVar.b()) {
                            oVar2.j(lVar.h());
                        } else {
                            atomicReferenceArray.set(length, Q(oVar, oVar2));
                        }
                        return true;
                    }
                }
                unlock();
                D();
                return false;
            } finally {
                unlock();
                D();
            }
        }

        /* access modifiers changed from: package-private */
        public o<K, V> S(o<K, V> oVar, o<K, V> oVar2, K k2, int i2, y<K, V> yVar, p pVar) {
            m(k2, i2, yVar, pVar);
            this.r.remove(oVar2);
            this.s.remove(oVar2);
            if (!yVar.c()) {
                return Q(oVar, oVar2);
            }
            yVar.e(null);
            return oVar;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
            r13 = r11.h();
            r14 = r13.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
            if (r14 != null) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
            if (r13.b() == false) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
            r8.f4724j++;
            r9.set(r10, S(r2, r11, r4, r17, r13, com.nytimes.android.external.cache.p.COLLECTED));
            r8.f4722h--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r8.f4724j++;
            m(r0, r5, r13, com.nytimes.android.external.cache.p.REPLACED);
            Y(r11, r16, r18, r6);
            n(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0087, code lost:
            unlock();
            D();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
            return r14;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V T(K r16, int r17, V r18) {
            /*
                r15 = this;
                r8 = r15
                r0 = r16
                r5 = r17
                r15.lock()
                com.nytimes.android.external.cache.k<K, V> r1 = r8.f4721g     // Catch:{ all -> 0x0093 }
                com.nytimes.android.external.cache.u r1 = r1.v     // Catch:{ all -> 0x0093 }
                long r6 = r1.a()     // Catch:{ all -> 0x0093 }
                r15.E(r6)     // Catch:{ all -> 0x0093 }
                java.util.concurrent.atomic.AtomicReferenceArray<com.nytimes.android.external.cache.k$o<K, V>> r9 = r8.f4726l     // Catch:{ all -> 0x0093 }
                int r1 = r9.length()     // Catch:{ all -> 0x0093 }
                int r1 = r1 + -1
                r10 = r5 & r1
                java.lang.Object r1 = r9.get(r10)     // Catch:{ all -> 0x0093 }
                r2 = r1
                com.nytimes.android.external.cache.k$o r2 = (com.nytimes.android.external.cache.k.o) r2     // Catch:{ all -> 0x0093 }
                r11 = r2
            L_0x0025:
                r12 = 0
                if (r11 == 0) goto L_0x0068
                java.lang.Object r4 = r11.getKey()     // Catch:{ all -> 0x0093 }
                int r1 = r11.y()     // Catch:{ all -> 0x0093 }
                if (r1 != r5) goto L_0x008e
                if (r4 == 0) goto L_0x008e
                com.nytimes.android.external.cache.k<K, V> r1 = r8.f4721g     // Catch:{ all -> 0x0093 }
                com.nytimes.android.external.cache.g<java.lang.Object> r1 = r1.f4664k     // Catch:{ all -> 0x0093 }
                boolean r1 = r1.d(r0, r4)     // Catch:{ all -> 0x0093 }
                if (r1 == 0) goto L_0x008e
                com.nytimes.android.external.cache.k$y r13 = r11.h()     // Catch:{ all -> 0x0093 }
                java.lang.Object r14 = r13.get()     // Catch:{ all -> 0x0093 }
                if (r14 != 0) goto L_0x006f
                boolean r0 = r13.b()     // Catch:{ all -> 0x0093 }
                if (r0 == 0) goto L_0x0068
                int r0 = r8.f4724j     // Catch:{ all -> 0x0093 }
                int r0 = r0 + 1
                r8.f4724j = r0     // Catch:{ all -> 0x0093 }
                com.nytimes.android.external.cache.p r7 = com.nytimes.android.external.cache.p.COLLECTED     // Catch:{ all -> 0x0093 }
                r1 = r15
                r3 = r11
                r5 = r17
                r6 = r13
                com.nytimes.android.external.cache.k$o r0 = r1.S(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0093 }
                int r1 = r8.f4722h     // Catch:{ all -> 0x0093 }
                int r1 = r1 + -1
                r9.set(r10, r0)     // Catch:{ all -> 0x0093 }
                r8.f4722h = r1     // Catch:{ all -> 0x0093 }
            L_0x0068:
                r15.unlock()
                r15.D()
                return r12
            L_0x006f:
                int r1 = r8.f4724j     // Catch:{ all -> 0x0093 }
                int r1 = r1 + 1
                r8.f4724j = r1     // Catch:{ all -> 0x0093 }
                com.nytimes.android.external.cache.p r1 = com.nytimes.android.external.cache.p.REPLACED     // Catch:{ all -> 0x0093 }
                r15.m(r0, r5, r13, r1)     // Catch:{ all -> 0x0093 }
                r1 = r15
                r2 = r11
                r3 = r16
                r4 = r18
                r5 = r6
                r1.Y(r2, r3, r4, r5)     // Catch:{ all -> 0x0093 }
                r15.n(r11)     // Catch:{ all -> 0x0093 }
                r15.unlock()
                r15.D()
                return r14
            L_0x008e:
                com.nytimes.android.external.cache.k$o r11 = r11.v()     // Catch:{ all -> 0x0093 }
                goto L_0x0025
            L_0x0093:
                r0 = move-exception
                r15.unlock()
                r15.D()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache.k.p.T(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
            r14 = r12.h();
            r1 = r14.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
            if (r1 != null) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
            if (r14.b() == false) goto L_0x0066;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
            r8.f4724j++;
            r9.set(r11, S(r2, r12, r4, r17, r14, com.nytimes.android.external.cache.p.COLLECTED));
            r8.f4722h--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0077, code lost:
            if (r8.f4721g.f4665l.d(r18, r1) == false) goto L_0x0097;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
            r8.f4724j++;
            m(r0, r5, r14, com.nytimes.android.external.cache.p.REPLACED);
            Y(r12, r16, r19, r6);
            n(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
            unlock();
            D();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0096, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            I(r12, r6);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean U(K r16, int r17, V r18, V r19) {
            /*
                r15 = this;
                r8 = r15
                r0 = r16
                r5 = r17
                r15.lock()
                com.nytimes.android.external.cache.k<K, V> r1 = r8.f4721g     // Catch:{ all -> 0x00a2 }
                com.nytimes.android.external.cache.u r1 = r1.v     // Catch:{ all -> 0x00a2 }
                long r6 = r1.a()     // Catch:{ all -> 0x00a2 }
                r15.E(r6)     // Catch:{ all -> 0x00a2 }
                java.util.concurrent.atomic.AtomicReferenceArray<com.nytimes.android.external.cache.k$o<K, V>> r9 = r8.f4726l     // Catch:{ all -> 0x00a2 }
                int r1 = r9.length()     // Catch:{ all -> 0x00a2 }
                r10 = 1
                int r1 = r1 - r10
                r11 = r5 & r1
                java.lang.Object r1 = r9.get(r11)     // Catch:{ all -> 0x00a2 }
                r2 = r1
                com.nytimes.android.external.cache.k$o r2 = (com.nytimes.android.external.cache.k.o) r2     // Catch:{ all -> 0x00a2 }
                r12 = r2
            L_0x0025:
                r13 = 0
                if (r12 == 0) goto L_0x0066
                java.lang.Object r4 = r12.getKey()     // Catch:{ all -> 0x00a2 }
                int r1 = r12.y()     // Catch:{ all -> 0x00a2 }
                if (r1 != r5) goto L_0x009b
                if (r4 == 0) goto L_0x009b
                com.nytimes.android.external.cache.k<K, V> r1 = r8.f4721g     // Catch:{ all -> 0x00a2 }
                com.nytimes.android.external.cache.g<java.lang.Object> r1 = r1.f4664k     // Catch:{ all -> 0x00a2 }
                boolean r1 = r1.d(r0, r4)     // Catch:{ all -> 0x00a2 }
                if (r1 == 0) goto L_0x009b
                com.nytimes.android.external.cache.k$y r14 = r12.h()     // Catch:{ all -> 0x00a2 }
                java.lang.Object r1 = r14.get()     // Catch:{ all -> 0x00a2 }
                if (r1 != 0) goto L_0x006d
                boolean r0 = r14.b()     // Catch:{ all -> 0x00a2 }
                if (r0 == 0) goto L_0x0066
                int r0 = r8.f4724j     // Catch:{ all -> 0x00a2 }
                int r0 = r0 + r10
                r8.f4724j = r0     // Catch:{ all -> 0x00a2 }
                com.nytimes.android.external.cache.p r7 = com.nytimes.android.external.cache.p.COLLECTED     // Catch:{ all -> 0x00a2 }
                r1 = r15
                r3 = r12
                r5 = r17
                r6 = r14
                com.nytimes.android.external.cache.k$o r0 = r1.S(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a2 }
                int r1 = r8.f4722h     // Catch:{ all -> 0x00a2 }
                int r1 = r1 - r10
                r9.set(r11, r0)     // Catch:{ all -> 0x00a2 }
                r8.f4722h = r1     // Catch:{ all -> 0x00a2 }
            L_0x0066:
                r15.unlock()
                r15.D()
                return r13
            L_0x006d:
                com.nytimes.android.external.cache.k<K, V> r2 = r8.f4721g     // Catch:{ all -> 0x00a2 }
                com.nytimes.android.external.cache.g<java.lang.Object> r2 = r2.f4665l     // Catch:{ all -> 0x00a2 }
                r3 = r18
                boolean r1 = r2.d(r3, r1)     // Catch:{ all -> 0x00a2 }
                if (r1 == 0) goto L_0x0097
                int r1 = r8.f4724j     // Catch:{ all -> 0x00a2 }
                int r1 = r1 + r10
                r8.f4724j = r1     // Catch:{ all -> 0x00a2 }
                com.nytimes.android.external.cache.p r1 = com.nytimes.android.external.cache.p.REPLACED     // Catch:{ all -> 0x00a2 }
                r15.m(r0, r5, r14, r1)     // Catch:{ all -> 0x00a2 }
                r1 = r15
                r2 = r12
                r3 = r16
                r4 = r19
                r5 = r6
                r1.Y(r2, r3, r4, r5)     // Catch:{ all -> 0x00a2 }
                r15.n(r12)     // Catch:{ all -> 0x00a2 }
                r15.unlock()
                r15.D()
                return r10
            L_0x0097:
                r15.I(r12, r6)     // Catch:{ all -> 0x00a2 }
                goto L_0x0066
            L_0x009b:
                r3 = r18
                com.nytimes.android.external.cache.k$o r12 = r12.v()     // Catch:{ all -> 0x00a2 }
                goto L_0x0025
            L_0x00a2:
                r0 = move-exception
                r15.unlock()
                r15.D()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache.k.p.U(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        /* access modifiers changed from: package-private */
        public void V(long j2) {
            if (tryLock()) {
                try {
                    j();
                    p(j2);
                    this.q.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void W() {
            if (!isHeldByCurrentThread()) {
                this.f4721g.t();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
            r4 = L(r5, r6, r10, true);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V X(com.nytimes.android.external.cache.k.o<K, V> r4, K r5, int r6, V r7, long r8, com.nytimes.android.external.cache.CacheLoader<? super K, V> r10) {
            /*
                r3 = this;
                com.nytimes.android.external.cache.k<K, V> r0 = r3.f4721g
                boolean r0 = r0.z()
                if (r0 == 0) goto L_0x0027
                long r0 = r4.l()
                long r8 = r8 - r0
                com.nytimes.android.external.cache.k<K, V> r0 = r3.f4721g
                long r0 = r0.s
                int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r2 <= 0) goto L_0x0027
                com.nytimes.android.external.cache.k$y r4 = r4.h()
                boolean r4 = r4.c()
                if (r4 != 0) goto L_0x0027
                r4 = 1
                java.lang.Object r4 = r3.L(r5, r6, r10, r4)
                if (r4 == 0) goto L_0x0027
                return r4
            L_0x0027:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache.k.p.X(com.nytimes.android.external.cache.k$o, java.lang.Object, int, java.lang.Object, long, com.nytimes.android.external.cache.CacheLoader):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        public void Y(o<K, V> oVar, K k2, V v, long j2) {
            y<K, V> h2 = oVar.h();
            int a2 = this.f4721g.p.a(k2, v);
            o.d(a2 >= 0, "Weights must be non-negative");
            oVar.j(this.f4721g.f4667n.f(this, oVar, v, a2));
            K(oVar, a2, j2);
            h2.e(v);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
            r1 = r10.h();
            r2 = r1.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
            if (r14 == r1) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
            if (r2 != null) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
            if (r1 == com.nytimes.android.external.cache.k.C) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
            m(r12, r13, new com.nytimes.android.external.cache.k.g0(r15, 0), com.nytimes.android.external.cache.p.REPLACED);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
            unlock();
            D();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r11.f4724j++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
            if (r14.b() == false) goto L_0x007e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
            if (r2 != null) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
            r1 = com.nytimes.android.external.cache.p.COLLECTED;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
            r1 = com.nytimes.android.external.cache.p.REPLACED;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
            m(r12, r13, r14, r1);
            r0 = r0 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
            Y(r10, r12, r15, r5);
            r11.f4722h = r0;
            n(r10);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean Z(K r12, int r13, com.nytimes.android.external.cache.k.l<K, V> r14, V r15) {
            /*
                r11 = this;
                r11.lock()
                com.nytimes.android.external.cache.k<K, V> r0 = r11.f4721g     // Catch:{ all -> 0x00af }
                com.nytimes.android.external.cache.u r0 = r0.v     // Catch:{ all -> 0x00af }
                long r5 = r0.a()     // Catch:{ all -> 0x00af }
                r11.E(r5)     // Catch:{ all -> 0x00af }
                int r0 = r11.f4722h     // Catch:{ all -> 0x00af }
                r7 = 1
                int r0 = r0 + r7
                int r1 = r11.f4725k     // Catch:{ all -> 0x00af }
                if (r0 <= r1) goto L_0x001c
                r11.o()     // Catch:{ all -> 0x00af }
                int r0 = r11.f4722h     // Catch:{ all -> 0x00af }
                int r0 = r0 + r7
            L_0x001c:
                java.util.concurrent.atomic.AtomicReferenceArray<com.nytimes.android.external.cache.k$o<K, V>> r8 = r11.f4726l     // Catch:{ all -> 0x00af }
                int r1 = r8.length()     // Catch:{ all -> 0x00af }
                int r1 = r1 - r7
                r9 = r13 & r1
                java.lang.Object r1 = r8.get(r9)     // Catch:{ all -> 0x00af }
                com.nytimes.android.external.cache.k$o r1 = (com.nytimes.android.external.cache.k.o) r1     // Catch:{ all -> 0x00af }
                r10 = r1
            L_0x002c:
                if (r10 == 0) goto L_0x0096
                java.lang.Object r2 = r10.getKey()     // Catch:{ all -> 0x00af }
                int r3 = r10.y()     // Catch:{ all -> 0x00af }
                if (r3 != r13) goto L_0x0091
                if (r2 == 0) goto L_0x0091
                com.nytimes.android.external.cache.k<K, V> r3 = r11.f4721g     // Catch:{ all -> 0x00af }
                com.nytimes.android.external.cache.g<java.lang.Object> r3 = r3.f4664k     // Catch:{ all -> 0x00af }
                boolean r2 = r3.d(r12, r2)     // Catch:{ all -> 0x00af }
                if (r2 == 0) goto L_0x0091
                com.nytimes.android.external.cache.k$y r1 = r10.h()     // Catch:{ all -> 0x00af }
                java.lang.Object r2 = r1.get()     // Catch:{ all -> 0x00af }
                if (r14 == r1) goto L_0x0067
                if (r2 != 0) goto L_0x0055
                com.nytimes.android.external.cache.k$y<java.lang.Object, java.lang.Object> r3 = com.nytimes.android.external.cache.k.C     // Catch:{ all -> 0x00af }
                if (r1 == r3) goto L_0x0055
                goto L_0x0067
            L_0x0055:
                com.nytimes.android.external.cache.k$g0 r14 = new com.nytimes.android.external.cache.k$g0     // Catch:{ all -> 0x00af }
                r0 = 0
                r14.<init>(r15, r0)     // Catch:{ all -> 0x00af }
                com.nytimes.android.external.cache.p r15 = com.nytimes.android.external.cache.p.REPLACED     // Catch:{ all -> 0x00af }
                r11.m(r12, r13, r14, r15)     // Catch:{ all -> 0x00af }
                r11.unlock()
                r11.D()
                return r0
            L_0x0067:
                int r1 = r11.f4724j     // Catch:{ all -> 0x00af }
                int r1 = r1 + r7
                r11.f4724j = r1     // Catch:{ all -> 0x00af }
                boolean r1 = r14.b()     // Catch:{ all -> 0x00af }
                if (r1 == 0) goto L_0x007e
                if (r2 != 0) goto L_0x0077
                com.nytimes.android.external.cache.p r1 = com.nytimes.android.external.cache.p.COLLECTED     // Catch:{ all -> 0x00af }
                goto L_0x0079
            L_0x0077:
                com.nytimes.android.external.cache.p r1 = com.nytimes.android.external.cache.p.REPLACED     // Catch:{ all -> 0x00af }
            L_0x0079:
                r11.m(r12, r13, r14, r1)     // Catch:{ all -> 0x00af }
                int r0 = r0 + -1
            L_0x007e:
                r1 = r11
                r2 = r10
                r3 = r12
                r4 = r15
                r1.Y(r2, r3, r4, r5)     // Catch:{ all -> 0x00af }
                r11.f4722h = r0     // Catch:{ all -> 0x00af }
                r11.n(r10)     // Catch:{ all -> 0x00af }
            L_0x008a:
                r11.unlock()
                r11.D()
                return r7
            L_0x0091:
                com.nytimes.android.external.cache.k$o r10 = r10.v()     // Catch:{ all -> 0x00af }
                goto L_0x002c
            L_0x0096:
                int r14 = r11.f4724j     // Catch:{ all -> 0x00af }
                int r14 = r14 + r7
                r11.f4724j = r14     // Catch:{ all -> 0x00af }
                com.nytimes.android.external.cache.k$o r13 = r11.A(r12, r13, r1)     // Catch:{ all -> 0x00af }
                r1 = r11
                r2 = r13
                r3 = r12
                r4 = r15
                r1.Y(r2, r3, r4, r5)     // Catch:{ all -> 0x00af }
                r8.set(r9, r13)     // Catch:{ all -> 0x00af }
                r11.f4722h = r0     // Catch:{ all -> 0x00af }
                r11.n(r13)     // Catch:{ all -> 0x00af }
                goto L_0x008a
            L_0x00af:
                r12 = move-exception
                r11.unlock()
                r11.D()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache.k.p.Z(java.lang.Object, int, com.nytimes.android.external.cache.k$l, java.lang.Object):boolean");
        }

        /* access modifiers changed from: package-private */
        public void a() {
            V(this.f4721g.v.a());
            W();
        }

        /* access modifiers changed from: package-private */
        public void a0() {
            if (tryLock()) {
                try {
                    j();
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (this.f4722h != 0) {
                lock();
                try {
                    AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f4726l;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (o oVar = atomicReferenceArray.get(i2); oVar != null; oVar = oVar.v()) {
                            if (oVar.h().b()) {
                                l(oVar, p.EXPLICIT);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, (Object) null);
                    }
                    d();
                    this.r.clear();
                    this.s.clear();
                    this.q.set(0);
                    this.f4724j++;
                    this.f4722h = 0;
                } finally {
                    unlock();
                    D();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b0(long j2) {
            if (tryLock()) {
                try {
                    p(j2);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            do {
            } while (this.f4728n.poll() != null);
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (this.f4721g.H()) {
                c();
            }
            if (this.f4721g.I()) {
                e();
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            do {
            } while (this.o.poll() != null);
        }

        /* access modifiers changed from: package-private */
        public boolean f(Object obj, int i2) {
            try {
                boolean z = false;
                if (this.f4722h != 0) {
                    o u = u(obj, i2, this.f4721g.v.a());
                    if (u == null) {
                        return false;
                    }
                    if (u.h().get() != null) {
                        z = true;
                    }
                    C();
                    return z;
                }
                C();
                return false;
            } finally {
                C();
            }
        }

        /* access modifiers changed from: package-private */
        public o<K, V> g(o<K, V> oVar, o<K, V> oVar2) {
            if (oVar.getKey() == null) {
                return null;
            }
            y<K, V> h2 = oVar.h();
            V v = h2.get();
            if (v == null && h2.b()) {
                return null;
            }
            o<K, V> f2 = this.f4721g.w.f(this, oVar, oVar2);
            f2.j(h2.d(this.o, v, f2));
            return f2;
        }

        /* access modifiers changed from: package-private */
        public void h() {
            int i2 = 0;
            do {
                Reference<? extends K> poll = this.f4728n.poll();
                if (poll != null) {
                    this.f4721g.u((o) poll);
                    i2++;
                } else {
                    return;
                }
            } while (i2 != 16);
        }

        /* access modifiers changed from: package-private */
        public void i() {
            while (true) {
                o poll = this.p.poll();
                if (poll == null) {
                    return;
                }
                if (this.s.contains(poll)) {
                    this.s.add(poll);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void j() {
            if (this.f4721g.H()) {
                h();
            }
            if (this.f4721g.I()) {
                k();
            }
        }

        /* access modifiers changed from: package-private */
        public void k() {
            int i2 = 0;
            do {
                Reference<? extends V> poll = this.o.poll();
                if (poll != null) {
                    this.f4721g.v((y) poll);
                    i2++;
                } else {
                    return;
                }
            } while (i2 != 16);
        }

        /* access modifiers changed from: package-private */
        public void l(o<K, V> oVar, p pVar) {
            m(oVar.getKey(), oVar.y(), oVar.h(), pVar);
        }

        /* access modifiers changed from: package-private */
        public void m(K k2, int i2, y<K, V> yVar, p pVar) {
            this.f4723i -= (long) yVar.g();
            if (this.f4721g.t != k.D) {
                this.f4721g.t.offer(r.a(k2, yVar.get(), pVar));
            }
        }

        /* access modifiers changed from: package-private */
        public void n(o<K, V> oVar) {
            if (this.f4721g.g()) {
                i();
                if (((long) oVar.h().g()) <= this.f4727m || P(oVar, oVar.y(), p.SIZE)) {
                    while (this.f4723i > this.f4727m) {
                        o w = w();
                        if (!P(w, w.y(), p.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: package-private */
        public void o() {
            AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f4726l;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i2 = this.f4722h;
                AtomicReferenceArray<o<K, V>> B = B(length << 1);
                this.f4725k = (B.length() * 3) / 4;
                int length2 = B.length() - 1;
                for (int i3 = 0; i3 < length; i3++) {
                    o oVar = atomicReferenceArray.get(i3);
                    if (oVar != null) {
                        o v = oVar.v();
                        int y = oVar.y() & length2;
                        if (v == null) {
                            B.set(y, oVar);
                        } else {
                            o oVar2 = oVar;
                            while (v != null) {
                                int y2 = v.y() & length2;
                                if (y2 != y) {
                                    oVar2 = v;
                                    y = y2;
                                }
                                v = v.v();
                            }
                            B.set(y, oVar2);
                            while (oVar != oVar2) {
                                int y3 = oVar.y() & length2;
                                o g2 = g(oVar, B.get(y3));
                                if (g2 != null) {
                                    B.set(y3, g2);
                                } else {
                                    O(oVar);
                                    i2--;
                                }
                                oVar = oVar.v();
                            }
                        }
                    }
                }
                this.f4726l = B;
                this.f4722h = i2;
            }
        }

        /* access modifiers changed from: package-private */
        public void p(long j2) {
            o peek;
            o peek2;
            i();
            do {
                peek = this.r.peek();
                if (peek == null || !this.f4721g.n(peek, j2)) {
                    do {
                        peek2 = this.s.peek();
                        if (peek2 == null || !this.f4721g.n(peek2, j2)) {
                            return;
                        }
                    } while (P(peek2, peek2.y(), p.EXPIRED));
                    throw new AssertionError();
                }
            } while (P(peek, peek.y(), p.EXPIRED));
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        public V q(Object obj, int i2) {
            try {
                if (this.f4722h != 0) {
                    long a2 = this.f4721g.v.a();
                    o u = u(obj, i2, a2);
                    if (u == null) {
                        return null;
                    }
                    Object obj2 = u.h().get();
                    if (obj2 != null) {
                        J(u, a2);
                        V X = X(u, u.getKey(), i2, obj2, a2, this.f4721g.x);
                        C();
                        return X;
                    }
                    a0();
                }
                C();
                return null;
            } finally {
                C();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V r(K r4, int r5, com.nytimes.android.external.cache.k.l<K, V> r6, com.nytimes.android.external.cache.j<V> r7) {
            /*
                r3 = this;
                java.lang.Object r7 = com.nytimes.android.external.cache.v.a(r7)     // Catch:{ all -> 0x002d }
                if (r7 == 0) goto L_0x0011
                r3.Z(r4, r5, r6, r7)     // Catch:{ all -> 0x000f }
                if (r7 != 0) goto L_0x000e
                r3.R(r4, r5, r6)
            L_0x000e:
                return r7
            L_0x000f:
                r0 = move-exception
                goto L_0x002f
            L_0x0011:
                com.nytimes.android.external.cache.CacheLoader$InvalidCacheLoadException r0 = new com.nytimes.android.external.cache.CacheLoader$InvalidCacheLoadException     // Catch:{ all -> 0x000f }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x000f }
                r1.<init>()     // Catch:{ all -> 0x000f }
                java.lang.String r2 = "CacheLoader returned null for key "
                r1.append(r2)     // Catch:{ all -> 0x000f }
                r1.append(r4)     // Catch:{ all -> 0x000f }
                java.lang.String r2 = "."
                r1.append(r2)     // Catch:{ all -> 0x000f }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x000f }
                r0.<init>(r1)     // Catch:{ all -> 0x000f }
                throw r0     // Catch:{ all -> 0x000f }
            L_0x002d:
                r0 = move-exception
                r7 = 0
            L_0x002f:
                if (r7 != 0) goto L_0x0034
                r3.R(r4, r5, r6)
            L_0x0034:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache.k.p.r(java.lang.Object, int, com.nytimes.android.external.cache.k$l, com.nytimes.android.external.cache.j):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        public o<K, V> s(Object obj, int i2) {
            for (o<K, V> t = t(i2); t != null; t = t.v()) {
                if (t.y() == i2) {
                    K key = t.getKey();
                    if (key == null) {
                        a0();
                    } else if (this.f4721g.f4664k.d(obj, key)) {
                        return t;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public o<K, V> t(int i2) {
            AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f4726l;
            return atomicReferenceArray.get(i2 & (atomicReferenceArray.length() - 1));
        }

        /* access modifiers changed from: package-private */
        public o<K, V> u(Object obj, int i2, long j2) {
            o<K, V> s2 = s(obj, i2);
            if (s2 == null) {
                return null;
            }
            if (!this.f4721g.n(s2, j2)) {
                return s2;
            }
            b0(j2);
            return null;
        }

        /* access modifiers changed from: package-private */
        public V v(o<K, V> oVar, long j2) {
            if (oVar.getKey() == null) {
                a0();
                return null;
            }
            V v = oVar.h().get();
            if (v == null) {
                a0();
                return null;
            } else if (!this.f4721g.n(oVar, j2)) {
                return v;
            } else {
                b0(j2);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public o<K, V> w() {
            for (o<K, V> oVar : this.s) {
                if (oVar.h().g() > 0) {
                    return oVar;
                }
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        public void x(AtomicReferenceArray<o<K, V>> atomicReferenceArray) {
            this.f4725k = (atomicReferenceArray.length() * 3) / 4;
            if (!this.f4721g.e()) {
                int i2 = this.f4725k;
                if (((long) i2) == this.f4727m) {
                    this.f4725k = i2 + 1;
                }
            }
            this.f4726l = atomicReferenceArray;
        }

        /* access modifiers changed from: package-private */
        public l<K, V> y(K k2, int i2, boolean z) {
            lock();
            try {
                long a2 = this.f4721g.v.a();
                E(a2);
                AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f4726l;
                int length = (atomicReferenceArray.length() - 1) & i2;
                o oVar = atomicReferenceArray.get(length);
                o oVar2 = oVar;
                while (oVar2 != null) {
                    Object key = oVar2.getKey();
                    if (oVar2.y() != i2 || key == null || !this.f4721g.f4664k.d(k2, key)) {
                        oVar2 = oVar2.v();
                    } else {
                        y h2 = oVar2.h();
                        if (!h2.c()) {
                            if (!z || a2 - oVar2.l() >= this.f4721g.s) {
                                this.f4724j++;
                                l<K, V> lVar = new l<>(h2);
                                oVar2.j(lVar);
                                unlock();
                                D();
                                return lVar;
                            }
                        }
                        return null;
                    }
                }
                this.f4724j++;
                l<K, V> lVar2 = new l<>();
                o A = A(k2, i2, oVar);
                A.j(lVar2);
                atomicReferenceArray.set(length, A);
                unlock();
                D();
                return lVar2;
            } finally {
                unlock();
                D();
            }
        }

        /* access modifiers changed from: package-private */
        public j<V> z(K k2, int i2, l<K, V> lVar, CacheLoader<? super K, V> cacheLoader) {
            j<V> i3 = lVar.i(k2, cacheLoader);
            i3.a(new a(k2, i2, lVar, i3), f.INSTANCE);
            return i3;
        }
    }

    /* compiled from: LocalCache */
    static class q<K, V> extends SoftReference<V> implements y<K, V> {

        /* renamed from: g  reason: collision with root package name */
        final o<K, V> f4734g;

        q(ReferenceQueue<V> referenceQueue, V v, o<K, V> oVar) {
            super(v, referenceQueue);
            this.f4734g = oVar;
        }

        public boolean b() {
            return true;
        }

        public boolean c() {
            return false;
        }

        public y<K, V> d(ReferenceQueue<V> referenceQueue, V v, o<K, V> oVar) {
            return new q(referenceQueue, v, oVar);
        }

        public void e(V v) {
        }

        public o<K, V> f() {
            return this.f4734g;
        }

        public int g() {
            return 1;
        }
    }

    /* compiled from: LocalCache */
    enum r {
        STRONG {
            /* access modifiers changed from: package-private */
            public g<Object> a() {
                return g.c();
            }

            /* access modifiers changed from: package-private */
            public <K, V> y<K, V> f(p<K, V> pVar, o<K, V> oVar, V v, int i2) {
                if (i2 == 1) {
                    return new v(v);
                }
                return new g0(v, i2);
            }
        },
        SOFT {
            /* access modifiers changed from: package-private */
            public g<Object> a() {
                return g.f();
            }

            /* access modifiers changed from: package-private */
            public <K, V> y<K, V> f(p<K, V> pVar, o<K, V> oVar, V v, int i2) {
                if (i2 == 1) {
                    return new q(pVar.o, v, oVar);
                }
                return new f0(pVar.o, v, oVar, i2);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            public g<Object> a() {
                return g.f();
            }

            /* access modifiers changed from: package-private */
            public <K, V> y<K, V> f(p<K, V> pVar, o<K, V> oVar, V v, int i2) {
                if (i2 == 1) {
                    return new d0(pVar.o, v, oVar);
                }
                return new h0(pVar.o, v, oVar, i2);
            }
        };

        /* access modifiers changed from: package-private */
        public abstract g<Object> a();

        /* access modifiers changed from: package-private */
        public abstract <K, V> y<K, V> f(p<K, V> pVar, o<K, V> oVar, V v, int i2);
    }

    /* compiled from: LocalCache */
    static final class s<K, V> extends u<K, V> {

        /* renamed from: k  reason: collision with root package name */
        volatile long f4739k = Long.MAX_VALUE;

        /* renamed from: l  reason: collision with root package name */
        o<K, V> f4740l = k.q();

        /* renamed from: m  reason: collision with root package name */
        o<K, V> f4741m = k.q();

        s(K k2, int i2, o<K, V> oVar) {
            super(k2, i2, oVar);
        }

        public o<K, V> f() {
            return this.f4741m;
        }

        public o<K, V> k() {
            return this.f4740l;
        }

        public void n(long j2) {
            this.f4739k = j2;
        }

        public void o(o<K, V> oVar) {
            this.f4740l = oVar;
        }

        public void t(o<K, V> oVar) {
            this.f4741m = oVar;
        }

        public long w() {
            return this.f4739k;
        }
    }

    /* compiled from: LocalCache */
    static final class t<K, V> extends u<K, V> {

        /* renamed from: k  reason: collision with root package name */
        volatile long f4742k = Long.MAX_VALUE;

        /* renamed from: l  reason: collision with root package name */
        o<K, V> f4743l = k.q();

        /* renamed from: m  reason: collision with root package name */
        o<K, V> f4744m = k.q();

        /* renamed from: n  reason: collision with root package name */
        volatile long f4745n = Long.MAX_VALUE;
        o<K, V> o = k.q();
        o<K, V> p = k.q();

        t(K k2, int i2, o<K, V> oVar) {
            super(k2, i2, oVar);
        }

        public void a(long j2) {
            this.f4745n = j2;
        }

        public o<K, V> f() {
            return this.f4744m;
        }

        public void i(o<K, V> oVar) {
            this.p = oVar;
        }

        public o<K, V> k() {
            return this.f4743l;
        }

        public long l() {
            return this.f4745n;
        }

        public void n(long j2) {
            this.f4742k = j2;
        }

        public void o(o<K, V> oVar) {
            this.f4743l = oVar;
        }

        public o<K, V> p() {
            return this.p;
        }

        public o<K, V> q() {
            return this.o;
        }

        public void t(o<K, V> oVar) {
            this.f4744m = oVar;
        }

        public long w() {
            return this.f4742k;
        }

        public void x(o<K, V> oVar) {
            this.o = oVar;
        }
    }

    /* compiled from: LocalCache */
    static class u<K, V> extends d<K, V> {

        /* renamed from: g  reason: collision with root package name */
        final K f4746g;

        /* renamed from: h  reason: collision with root package name */
        final int f4747h;

        /* renamed from: i  reason: collision with root package name */
        final o<K, V> f4748i;

        /* renamed from: j  reason: collision with root package name */
        volatile y<K, V> f4749j = k.E();

        u(K k2, int i2, o<K, V> oVar) {
            this.f4746g = k2;
            this.f4747h = i2;
            this.f4748i = oVar;
        }

        public K getKey() {
            return this.f4746g;
        }

        public y<K, V> h() {
            return this.f4749j;
        }

        public void j(y<K, V> yVar) {
            this.f4749j = yVar;
        }

        public o<K, V> v() {
            return this.f4748i;
        }

        public int y() {
            return this.f4747h;
        }
    }

    /* compiled from: LocalCache */
    static class v<K, V> implements y<K, V> {

        /* renamed from: g  reason: collision with root package name */
        final V f4750g;

        v(V v) {
            this.f4750g = v;
        }

        public boolean b() {
            return true;
        }

        public boolean c() {
            return false;
        }

        public y<K, V> d(ReferenceQueue<V> referenceQueue, V v, o<K, V> oVar) {
            return this;
        }

        public void e(V v) {
        }

        public o<K, V> f() {
            return null;
        }

        public int g() {
            return 1;
        }

        public V get() {
            return this.f4750g;
        }
    }

    /* compiled from: LocalCache */
    static final class w<K, V> extends u<K, V> {

        /* renamed from: k  reason: collision with root package name */
        volatile long f4751k = Long.MAX_VALUE;

        /* renamed from: l  reason: collision with root package name */
        o<K, V> f4752l = k.q();

        /* renamed from: m  reason: collision with root package name */
        o<K, V> f4753m = k.q();

        w(K k2, int i2, o<K, V> oVar) {
            super(k2, i2, oVar);
        }

        public void a(long j2) {
            this.f4751k = j2;
        }

        public void i(o<K, V> oVar) {
            this.f4753m = oVar;
        }

        public long l() {
            return this.f4751k;
        }

        public o<K, V> p() {
            return this.f4753m;
        }

        public o<K, V> q() {
            return this.f4752l;
        }

        public void x(o<K, V> oVar) {
            this.f4752l = oVar;
        }
    }

    /* compiled from: LocalCache */
    final class x extends k<K, V>.i<V> {
        x(k kVar) {
            super();
        }

        public V next() {
            return d().getValue();
        }
    }

    /* compiled from: LocalCache */
    interface y<K, V> {
        boolean b();

        boolean c();

        y<K, V> d(ReferenceQueue<V> referenceQueue, V v, o<K, V> oVar);

        void e(V v);

        o<K, V> f();

        int g();

        V get();
    }

    /* compiled from: LocalCache */
    final class z extends AbstractCollection<V> {

        /* renamed from: g  reason: collision with root package name */
        private final ConcurrentMap<?, ?> f4754g;

        z(ConcurrentMap<?, ?> concurrentMap) {
            this.f4754g = concurrentMap;
        }

        public void clear() {
            this.f4754g.clear();
        }

        public boolean contains(Object obj) {
            return this.f4754g.containsValue(obj);
        }

        public boolean isEmpty() {
            return this.f4754g.isEmpty();
        }

        public Iterator<V> iterator() {
            return new x(k.this);
        }

        public int size() {
            return this.f4754g.size();
        }

        public Object[] toArray() {
            return k.D(this).toArray();
        }

        public <E> E[] toArray(E[] eArr) {
            return k.D(this).toArray(eArr);
        }
    }

    k(e<? super K, ? super V> eVar, CacheLoader<? super K, V> cacheLoader) {
        Queue<r<K, V>> queue;
        this.f4663j = Math.min(eVar.d(), 65536);
        this.f4666m = eVar.i();
        this.f4667n = eVar.o();
        this.f4664k = eVar.h();
        this.f4665l = eVar.n();
        this.o = eVar.j();
        this.p = eVar.p();
        this.q = eVar.e();
        this.r = eVar.f();
        this.s = eVar.k();
        q<K1, V1> l2 = eVar.l();
        this.u = l2;
        if (l2 == e.b.INSTANCE) {
            queue = f();
        } else {
            queue = new ConcurrentLinkedQueue<>();
        }
        this.t = queue;
        this.v = eVar.m(x());
        this.w = f.i(this.f4666m, F(), J());
        this.x = cacheLoader;
        int min = Math.min(eVar.g(), 1073741824);
        if (g() && !e()) {
            min = Math.min(min, (int) this.o);
        }
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i4 < this.f4663j && (!g() || ((long) (i4 * 20)) <= this.o)) {
            i5++;
            i4 <<= 1;
        }
        this.f4661h = 32 - i5;
        this.f4660g = i4 - 1;
        this.f4662i = p(i4);
        int i6 = min / i4;
        while (i3 < (i6 * i4 < min ? i6 + 1 : i6)) {
            i3 <<= 1;
        }
        if (g()) {
            long j2 = this.o;
            long j3 = (long) i4;
            long j4 = (j2 / j3) + 1;
            long j5 = j2 % j3;
            while (i2 < this.f4662i.length) {
                if (((long) i2) == j5) {
                    j4--;
                }
                this.f4662i[i2] = d(i3, j4);
                i2++;
            }
            return;
        }
        while (true) {
            p<K, V>[] pVarArr = this.f4662i;
            if (i2 < pVarArr.length) {
                pVarArr[i2] = d(i3, -1);
                i2++;
            } else {
                return;
            }
        }
    }

    static int A(int i2) {
        int i3 = i2 + ((i2 << 15) ^ -12931);
        int i4 = i3 ^ (i3 >>> 10);
        int i5 = i4 + (i4 << 3);
        int i6 = i5 ^ (i5 >>> 6);
        int i7 = i6 + (i6 << 2) + (i6 << 14);
        return i7 ^ (i7 >>> 16);
    }

    public static char B(long j2) {
        if (j2 > 65535) {
            return 65535;
        }
        if (j2 < 0) {
            return 0;
        }
        return (char) ((int) j2);
    }

    /* access modifiers changed from: private */
    public static <E> ArrayList<E> D(Collection<E> collection) {
        return new ArrayList<>(collection);
    }

    static <K, V> y<K, V> E() {
        return C;
    }

    static <K, V> void b(o<K, V> oVar, o<K, V> oVar2) {
        oVar.o(oVar2);
        oVar2.t(oVar);
    }

    static <K, V> void c(o<K, V> oVar, o<K, V> oVar2) {
        oVar.x(oVar2);
        oVar2.i(oVar);
    }

    static <E> Queue<E> f() {
        return D;
    }

    static <K, V> o<K, V> q() {
        return n.INSTANCE;
    }

    static <K, V> void r(o<K, V> oVar) {
        o q2 = q();
        oVar.o(q2);
        oVar.t(q2);
    }

    static <K, V> void s(o<K, V> oVar) {
        o q2 = q();
        oVar.x(q2);
        oVar.i(q2);
    }

    /* access modifiers changed from: package-private */
    public p<K, V> C(int i2) {
        return this.f4662i[(i2 >>> this.f4661h) & this.f4660g];
    }

    /* access modifiers changed from: package-private */
    public boolean F() {
        return G() || w();
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return h() || g();
    }

    /* access modifiers changed from: package-private */
    public boolean H() {
        return this.f4666m != r.STRONG;
    }

    /* access modifiers changed from: package-private */
    public boolean I() {
        return this.f4667n != r.STRONG;
    }

    /* access modifiers changed from: package-private */
    public boolean J() {
        return K() || y();
    }

    /* access modifiers changed from: package-private */
    public boolean K() {
        return i();
    }

    public void clear() {
        for (p<K, V> b2 : this.f4662i) {
            b2.b();
        }
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int l2 = l(obj);
        return C(l2).f(obj, l2);
    }

    public boolean containsValue(Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        long a2 = this.v.a();
        p<K, V>[] pVarArr = this.f4662i;
        long j2 = -1;
        int i2 = 0;
        while (i2 < 3) {
            long j3 = 0;
            int length = pVarArr.length;
            int i3 = 0;
            while (i3 < length) {
                p<K, V> pVar = pVarArr[i3];
                int i4 = pVar.f4722h;
                AtomicReferenceArray<o<K, V>> atomicReferenceArray = pVar.f4726l;
                for (int i5 = 0; i5 < atomicReferenceArray.length(); i5++) {
                    o oVar = atomicReferenceArray.get(i5);
                    while (oVar != null) {
                        p<K, V>[] pVarArr2 = pVarArr;
                        V v2 = pVar.v(oVar, a2);
                        long j4 = a2;
                        if (v2 != null && this.f4665l.d(obj2, v2)) {
                            return true;
                        }
                        oVar = oVar.v();
                        pVarArr = pVarArr2;
                        a2 = j4;
                    }
                    long j5 = a2;
                    p<K, V>[] pVarArr3 = pVarArr;
                }
                p<K, V>[] pVarArr4 = pVarArr;
                j3 += (long) pVar.f4724j;
                i3++;
                a2 = a2;
            }
            long j6 = a2;
            p<K, V>[] pVarArr5 = pVarArr;
            if (j3 == j2) {
                return false;
            }
            i2++;
            j2 = j3;
            pVarArr = pVarArr5;
            a2 = j6;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public p<K, V> d(int i2, long j2) {
        return new p<>(this, i2, j2);
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.p != e.c.INSTANCE;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.A;
        if (set != null) {
            return set;
        }
        h hVar = new h(this);
        this.A = hVar;
        return hVar;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.o >= 0;
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int l2 = l(obj);
        return C(l2).q(obj, l2);
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.q > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.r > 0;
    }

    public boolean isEmpty() {
        p<K, V>[] pVarArr = this.f4662i;
        long j2 = 0;
        for (int i2 = 0; i2 < pVarArr.length; i2++) {
            if (pVarArr[i2].f4722h != 0) {
                return false;
            }
            j2 += (long) pVarArr[i2].f4724j;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < pVarArr.length; i3++) {
            if (pVarArr[i3].f4722h != 0) {
                return false;
            }
            j2 -= (long) pVarArr[i3].f4724j;
        }
        if (j2 != 0) {
            return false;
        }
        return true;
    }

    public V j(Object obj) {
        o.a(obj);
        int l2 = l(obj);
        return C(l2).q(obj, l2);
    }

    /* access modifiers changed from: package-private */
    public V k(o<K, V> oVar, long j2) {
        V v2;
        if (oVar.getKey() == null || (v2 = oVar.h().get()) == null || n(oVar, j2)) {
            return null;
        }
        return v2;
    }

    public Set<K> keySet() {
        Set<K> set = this.y;
        if (set != null) {
            return set;
        }
        C0137k kVar = new C0137k(this);
        this.y = kVar;
        return kVar;
    }

    /* access modifiers changed from: package-private */
    public int l(Object obj) {
        return A(this.f4664k.e(obj));
    }

    /* access modifiers changed from: package-private */
    public void m(Iterable<?> iterable) {
        for (Object remove : iterable) {
            remove(remove);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean n(o<K, V> oVar, long j2) {
        o.a(oVar);
        if (h() && j2 - oVar.w() >= this.q) {
            return true;
        }
        if (!i() || j2 - oVar.l() < this.r) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public long o() {
        p<K, V>[] pVarArr = this.f4662i;
        long j2 = 0;
        for (p<K, V> pVar : pVarArr) {
            j2 += (long) Math.max(0, pVar.f4722h);
        }
        return j2;
    }

    /* access modifiers changed from: package-private */
    public final p<K, V>[] p(int i2) {
        return new p[i2];
    }

    public V put(K k2, V v2) {
        o.a(k2);
        o.a(v2);
        int l2 = l(k2);
        return C(l2).F(k2, l2, v2, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public V putIfAbsent(K k2, V v2) {
        o.a(k2);
        o.a(v2);
        int l2 = l(k2);
        return C(l2).F(k2, l2, v2, true);
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int l2 = l(obj);
        return C(l2).M(obj, l2);
    }

    public boolean replace(K k2, V v2, V v3) {
        o.a(k2);
        o.a(v3);
        if (v2 == null) {
            return false;
        }
        int l2 = l(k2);
        return C(l2).U(k2, l2, v2, v3);
    }

    public int size() {
        return B(o());
    }

    /* access modifiers changed from: package-private */
    public void t() {
        while (true) {
            r poll = this.t.poll();
            if (poll != null) {
                try {
                    this.u.a(poll);
                } catch (Throwable th) {
                    B.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u(o<K, V> oVar) {
        int y2 = oVar.y();
        C(y2).G(oVar, y2);
    }

    /* access modifiers changed from: package-private */
    public void v(y<K, V> yVar) {
        o<K, V> f2 = yVar.f();
        int y2 = f2.y();
        C(y2).H(f2.getKey(), y2, yVar);
    }

    public Collection<V> values() {
        Collection<V> collection = this.z;
        if (collection != null) {
            return collection;
        }
        z zVar = new z(this);
        this.z = zVar;
        return zVar;
    }

    /* access modifiers changed from: package-private */
    public boolean w() {
        return h();
    }

    /* access modifiers changed from: package-private */
    public boolean x() {
        return y() || w();
    }

    /* access modifiers changed from: package-private */
    public boolean y() {
        return i() || z();
    }

    /* access modifiers changed from: package-private */
    public boolean z() {
        return this.s > 0;
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int l2 = l(obj);
        return C(l2).N(obj, l2, obj2);
    }

    public V replace(K k2, V v2) {
        o.a(k2);
        o.a(v2);
        int l2 = l(k2);
        return C(l2).T(k2, l2, v2);
    }
}

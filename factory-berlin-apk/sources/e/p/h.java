package e.p;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PagedList */
public abstract class h<T> extends AbstractList<T> {

    /* renamed from: g  reason: collision with root package name */
    final Executor f8819g;

    /* renamed from: h  reason: collision with root package name */
    final Executor f8820h;

    /* renamed from: i  reason: collision with root package name */
    final c<T> f8821i;

    /* renamed from: j  reason: collision with root package name */
    final f f8822j;

    /* renamed from: k  reason: collision with root package name */
    final j<T> f8823k;

    /* renamed from: l  reason: collision with root package name */
    int f8824l = 0;

    /* renamed from: m  reason: collision with root package name */
    T f8825m = null;

    /* renamed from: n  reason: collision with root package name */
    final int f8826n;
    boolean o = false;
    boolean p = false;
    private int q = Integer.MAX_VALUE;
    private int r = RecyclerView.UNDEFINED_DURATION;
    private final AtomicBoolean s = new AtomicBoolean(false);
    private final ArrayList<WeakReference<e>> t = new ArrayList<>();

    /* compiled from: PagedList */
    class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f8827g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f8828h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f8829i;

        a(boolean z, boolean z2, boolean z3) {
            this.f8827g = z;
            this.f8828h = z2;
            this.f8829i = z3;
        }

        public void run() {
            if (this.f8827g) {
                h.this.f8821i.c();
            }
            if (this.f8828h) {
                h.this.o = true;
            }
            if (this.f8829i) {
                h.this.p = true;
            }
            h.this.S(false);
        }
    }

    /* compiled from: PagedList */
    class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f8831g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f8832h;

        b(boolean z, boolean z2) {
            this.f8831g = z;
            this.f8832h = z2;
        }

        public void run() {
            h.this.s(this.f8831g, this.f8832h);
        }
    }

    /* compiled from: PagedList */
    public static abstract class c<T> {
        public void a(T t) {
        }

        public void b(T t) {
        }

        public void c() {
        }
    }

    /* compiled from: PagedList */
    public static final class d<Key, Value> {
        private final d<Key, Value> a;
        private final f b;
        private Executor c;

        /* renamed from: d  reason: collision with root package name */
        private Executor f8834d;

        /* renamed from: e  reason: collision with root package name */
        private c f8835e;

        /* renamed from: f  reason: collision with root package name */
        private Key f8836f;

        public d(d<Key, Value> dVar, f fVar) {
            if (dVar == null) {
                throw new IllegalArgumentException("DataSource may not be null");
            } else if (fVar != null) {
                this.a = dVar;
                this.b = fVar;
            } else {
                throw new IllegalArgumentException("Config may not be null");
            }
        }

        public h<Value> a() {
            Executor executor = this.c;
            if (executor != null) {
                Executor executor2 = this.f8834d;
                if (executor2 != null) {
                    return h.o(this.a, executor, executor2, this.f8835e, this.b, this.f8836f);
                }
                throw new IllegalArgumentException("BackgroundThreadExecutor required");
            }
            throw new IllegalArgumentException("MainThreadExecutor required");
        }

        public d<Key, Value> b(c cVar) {
            this.f8835e = cVar;
            return this;
        }

        public d<Key, Value> c(Executor executor) {
            this.f8834d = executor;
            return this;
        }

        public d<Key, Value> d(Key key) {
            this.f8836f = key;
            return this;
        }

        public d<Key, Value> e(Executor executor) {
            this.c = executor;
            return this;
        }
    }

    /* compiled from: PagedList */
    public static abstract class e {
        public abstract void a(int i2, int i3);

        public abstract void b(int i2, int i3);

        public abstract void c(int i2, int i3);
    }

    /* compiled from: PagedList */
    public static class f {
        public final int a;
        public final int b;
        public final boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8837d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8838e;

        /* compiled from: PagedList */
        public static final class a {
            private int a = -1;
            private int b = -1;
            private int c = -1;

            /* renamed from: d  reason: collision with root package name */
            private boolean f8839d = true;

            /* renamed from: e  reason: collision with root package name */
            private int f8840e = Integer.MAX_VALUE;

            public f a() {
                if (this.b < 0) {
                    this.b = this.a;
                }
                if (this.c < 0) {
                    this.c = this.a * 3;
                }
                if (this.f8839d || this.b != 0) {
                    int i2 = this.f8840e;
                    if (i2 == Integer.MAX_VALUE || i2 >= this.a + (this.b * 2)) {
                        return new f(this.a, this.b, this.f8839d, this.c, this.f8840e);
                    }
                    throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + this.a + ", prefetchDist=" + this.b + ", maxSize=" + this.f8840e);
                }
                throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
            }

            public a b(boolean z) {
                this.f8839d = z;
                return this;
            }

            public a c(int i2) {
                this.c = i2;
                return this;
            }

            public a d(int i2) {
                this.f8840e = i2;
                return this;
            }

            public a e(int i2) {
                if (i2 >= 1) {
                    this.a = i2;
                    return this;
                }
                throw new IllegalArgumentException("Page size must be a positive number");
            }

            public a f(int i2) {
                this.b = i2;
                return this;
            }
        }

        f(int i2, int i3, boolean z, int i4, int i5) {
            this.a = i2;
            this.b = i3;
            this.c = z;
            this.f8838e = i4;
            this.f8837d = i5;
        }
    }

    h(j<T> jVar, Executor executor, Executor executor2, c<T> cVar, f fVar) {
        this.f8823k = jVar;
        this.f8819g = executor;
        this.f8820h = executor2;
        this.f8821i = cVar;
        this.f8822j = fVar;
        this.f8826n = (fVar.b * 2) + fVar.a;
    }

    static <K, T> h<T> o(d<K, T> dVar, Executor executor, Executor executor2, c<T> cVar, f fVar, K k2) {
        int i2;
        if (dVar.d() || !fVar.c) {
            if (!dVar.d()) {
                dVar = ((l) dVar).m();
                if (k2 != null) {
                    i2 = ((Integer) k2).intValue();
                    return new c((b) dVar, executor, executor2, cVar, fVar, k2, i2);
                }
            }
            i2 = -1;
            return new c((b) dVar, executor, executor2, cVar, fVar, k2, i2);
        }
        return new n((l) dVar, executor, executor2, cVar, fVar, k2 != null ? ((Integer) k2).intValue() : 0);
    }

    public int D() {
        return this.f8823k.r();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean E();

    public boolean F() {
        return this.s.get();
    }

    public boolean H() {
        return F();
    }

    public void J(int i2) {
        if (i2 < 0 || i2 >= size()) {
            throw new IndexOutOfBoundsException("Index: " + i2 + ", Size: " + size());
        }
        this.f8824l = D() + i2;
        K(i2);
        this.q = Math.min(this.q, i2);
        this.r = Math.max(this.r, i2);
        S(true);
    }

    /* access modifiers changed from: package-private */
    public abstract void K(int i2);

    /* access modifiers changed from: package-private */
    public void L(int i2, int i3) {
        if (i3 != 0) {
            for (int size = this.t.size() - 1; size >= 0; size--) {
                e eVar = (e) this.t.get(size).get();
                if (eVar != null) {
                    eVar.a(i2, i3);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void M(int i2, int i3) {
        if (i3 != 0) {
            for (int size = this.t.size() - 1; size >= 0; size--) {
                e eVar = (e) this.t.get(size).get();
                if (eVar != null) {
                    eVar.b(i2, i3);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void N(int i2, int i3) {
        if (i3 != 0) {
            for (int size = this.t.size() - 1; size >= 0; size--) {
                e eVar = (e) this.t.get(size).get();
                if (eVar != null) {
                    eVar.c(i2, i3);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void P(int i2) {
        this.f8824l += i2;
        this.q += i2;
        this.r += i2;
    }

    public void Q(e eVar) {
        for (int size = this.t.size() - 1; size >= 0; size--) {
            e eVar2 = (e) this.t.get(size).get();
            if (eVar2 == null || eVar2 == eVar) {
                this.t.remove(size);
            }
        }
    }

    public List<T> R() {
        if (H()) {
            return this;
        }
        return new m(this);
    }

    /* access modifiers changed from: package-private */
    public void S(boolean z) {
        boolean z2 = true;
        boolean z3 = this.o && this.q <= this.f8822j.b;
        if (!this.p || this.r < (size() - 1) - this.f8822j.b) {
            z2 = false;
        }
        if (z3 || z2) {
            if (z3) {
                this.o = false;
            }
            if (z2) {
                this.p = false;
            }
            if (z) {
                this.f8819g.execute(new b(z3, z2));
            } else {
                s(z3, z2);
            }
        }
    }

    public T get(int i2) {
        T t2 = this.f8823k.get(i2);
        if (t2 != null) {
            this.f8825m = t2;
        }
        return t2;
    }

    public void n(List<T> list, e eVar) {
        if (!(list == null || list == this)) {
            if (!list.isEmpty()) {
                u((h) list, eVar);
            } else if (!this.f8823k.isEmpty()) {
                eVar.b(0, this.f8823k.size());
            }
        }
        for (int size = this.t.size() - 1; size >= 0; size--) {
            if (((e) this.t.get(size).get()) == null) {
                this.t.remove(size);
            }
        }
        this.t.add(new WeakReference(eVar));
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z, boolean z2, boolean z3) {
        if (this.f8821i != null) {
            if (this.q == Integer.MAX_VALUE) {
                this.q = this.f8823k.size();
            }
            if (this.r == Integer.MIN_VALUE) {
                this.r = 0;
            }
            if (z || z2 || z3) {
                this.f8819g.execute(new a(z, z2, z3));
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
    }

    public void r() {
        this.s.set(true);
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z, boolean z2) {
        if (z) {
            this.f8821i.b(this.f8823k.j());
        }
        if (z2) {
            this.f8821i.a(this.f8823k.k());
        }
    }

    public int size() {
        return this.f8823k.size();
    }

    /* access modifiers changed from: package-private */
    public abstract void u(h<T> hVar, e eVar);

    public abstract d<?, T> y();

    public abstract Object z();
}

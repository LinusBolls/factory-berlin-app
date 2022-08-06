package e.p;

import e.p.g;
import e.p.h;
import e.p.j;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: ContiguousPagedList */
class c<K, V> extends h<V> implements j.a {
    final boolean A;
    g.a<V> B = new a();
    final b<K, V> u;
    int v = 0;
    int w = 0;
    int x = 0;
    int y = 0;
    boolean z = false;

    /* compiled from: ContiguousPagedList */
    class a extends g.a<V> {
        a() {
        }

        public void a(int i2, g<V> gVar) {
            if (gVar.c()) {
                c.this.r();
            } else if (!c.this.F()) {
                List<T> list = gVar.a;
                boolean z = true;
                if (i2 == 0) {
                    c cVar = c.this;
                    cVar.f8823k.D(gVar.b, list, gVar.c, gVar.f8818d, cVar);
                    c cVar2 = c.this;
                    if (cVar2.f8824l == -1) {
                        cVar2.f8824l = gVar.b + gVar.f8818d + (list.size() / 2);
                    }
                } else {
                    c cVar3 = c.this;
                    boolean z2 = cVar3.f8824l > cVar3.f8823k.m();
                    c cVar4 = c.this;
                    boolean z3 = cVar4.A && cVar4.f8823k.P(cVar4.f8822j.f8837d, cVar4.f8826n, list.size());
                    if (i2 == 1) {
                        if (!z3 || z2) {
                            c cVar5 = c.this;
                            cVar5.f8823k.e(list, cVar5);
                        } else {
                            c cVar6 = c.this;
                            cVar6.y = 0;
                            cVar6.w = 0;
                        }
                    } else if (i2 != 2) {
                        throw new IllegalArgumentException("unexpected resultType " + i2);
                    } else if (!z3 || !z2) {
                        c cVar7 = c.this;
                        cVar7.f8823k.N(list, cVar7);
                    } else {
                        c cVar8 = c.this;
                        cVar8.x = 0;
                        cVar8.v = 0;
                    }
                    c cVar9 = c.this;
                    if (cVar9.A) {
                        if (z2) {
                            if (cVar9.v != 1 && cVar9.f8823k.S(cVar9.z, cVar9.f8822j.f8837d, cVar9.f8826n, cVar9)) {
                                c.this.v = 0;
                            }
                        } else if (cVar9.w != 1 && cVar9.f8823k.R(cVar9.z, cVar9.f8822j.f8837d, cVar9.f8826n, cVar9)) {
                            c.this.w = 0;
                        }
                    }
                }
                c cVar10 = c.this;
                if (cVar10.f8821i != null) {
                    boolean z4 = cVar10.f8823k.size() == 0;
                    boolean z5 = !z4 && i2 == 2 && gVar.a.size() == 0;
                    if (!(!z4 && i2 == 1 && gVar.a.size() == 0)) {
                        z = false;
                    }
                    c.this.q(z4, z5, z);
                }
            }
        }
    }

    /* compiled from: ContiguousPagedList */
    class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f8793g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Object f8794h;

        b(int i2, Object obj) {
            this.f8793g = i2;
            this.f8794h = obj;
        }

        public void run() {
            if (!c.this.F()) {
                if (c.this.u.e()) {
                    c.this.r();
                    return;
                }
                c cVar = c.this;
                cVar.u.h(this.f8793g, this.f8794h, cVar.f8822j.a, cVar.f8819g, cVar.B);
            }
        }
    }

    /* renamed from: e.p.c$c  reason: collision with other inner class name */
    /* compiled from: ContiguousPagedList */
    class C0579c implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f8796g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Object f8797h;

        C0579c(int i2, Object obj) {
            this.f8796g = i2;
            this.f8797h = obj;
        }

        public void run() {
            if (!c.this.F()) {
                if (c.this.u.e()) {
                    c.this.r();
                    return;
                }
                c cVar = c.this;
                cVar.u.g(this.f8796g, this.f8797h, cVar.f8822j.a, cVar.f8819g, cVar.B);
            }
        }
    }

    c(b<K, V> bVar, Executor executor, Executor executor2, h.c<V> cVar, h.f fVar, K k2, int i2) {
        super(new j(), executor, executor2, cVar, fVar);
        boolean z2 = false;
        this.u = bVar;
        this.f8824l = i2;
        if (bVar.e()) {
            r();
        } else {
            b<K, V> bVar2 = this.u;
            h.f fVar2 = this.f8822j;
            bVar2.i(k2, fVar2.f8838e, fVar2.a, fVar2.c, this.f8819g, this.B);
        }
        if (this.u.k() && this.f8822j.f8837d != Integer.MAX_VALUE) {
            z2 = true;
        }
        this.A = z2;
    }

    static int T(int i2, int i3, int i4) {
        return ((i3 + i2) + 1) - i4;
    }

    static int U(int i2, int i3, int i4) {
        return i2 - (i3 - i4);
    }

    private void V() {
        if (this.w == 0) {
            this.w = 1;
            this.f8820h.execute(new C0579c(((this.f8823k.l() + this.f8823k.s()) - 1) + this.f8823k.r(), this.f8823k.k()));
        }
    }

    private void W() {
        if (this.v == 0) {
            this.v = 1;
            this.f8820h.execute(new b(this.f8823k.l() + this.f8823k.r(), this.f8823k.j()));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void K(int i2) {
        int U = U(this.f8822j.b, i2, this.f8823k.l());
        int T = T(this.f8822j.b, i2, this.f8823k.l() + this.f8823k.s());
        int max = Math.max(U, this.x);
        this.x = max;
        if (max > 0) {
            W();
        }
        int max2 = Math.max(T, this.y);
        this.y = max2;
        if (max2 > 0) {
            V();
        }
    }

    public void a(int i2, int i3) {
        N(i2, i3);
    }

    public void d() {
        this.w = 2;
    }

    public void e() {
        this.v = 2;
    }

    public void g(int i2, int i3, int i4) {
        int i5 = (this.x - i3) - i4;
        this.x = i5;
        this.v = 0;
        if (i5 > 0) {
            W();
        }
        L(i2, i3);
        M(0, i4);
        P(i4);
    }

    public void i(int i2, int i3) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    public void j(int i2) {
        boolean z2 = false;
        M(0, i2);
        if (this.f8823k.l() > 0 || this.f8823k.u() > 0) {
            z2 = true;
        }
        this.z = z2;
    }

    public void k(int i2, int i3, int i4) {
        int i5 = (this.y - i3) - i4;
        this.y = i5;
        this.w = 0;
        if (i5 > 0) {
            V();
        }
        L(i2, i3);
        M(i2 + i3, i4);
    }

    public void l(int i2) {
        throw new IllegalStateException("Tiled callback on ContiguousPagedList");
    }

    public void m(int i2, int i3) {
        L(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void u(h<V> hVar, h.e eVar) {
        j<T> jVar = hVar.f8823k;
        int n2 = this.f8823k.n() - jVar.n();
        int o = this.f8823k.o() - jVar.o();
        int u2 = jVar.u();
        int l2 = jVar.l();
        if (jVar.isEmpty() || n2 < 0 || o < 0 || this.f8823k.u() != Math.max(u2 - n2, 0) || this.f8823k.l() != Math.max(l2 - o, 0) || this.f8823k.s() != jVar.s() + n2 + o) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        if (n2 != 0) {
            int min = Math.min(u2, n2);
            int i2 = n2 - min;
            int l3 = jVar.l() + jVar.s();
            if (min != 0) {
                eVar.a(l3, min);
            }
            if (i2 != 0) {
                eVar.b(l3 + min, i2);
            }
        }
        if (o != 0) {
            int min2 = Math.min(l2, o);
            int i3 = o - min2;
            if (min2 != 0) {
                eVar.a(l2, min2);
            }
            if (i3 != 0) {
                eVar.b(0, i3);
            }
        }
    }

    public d<?, V> y() {
        return this.u;
    }

    public Object z() {
        return this.u.j(this.f8824l, this.f8825m);
    }
}

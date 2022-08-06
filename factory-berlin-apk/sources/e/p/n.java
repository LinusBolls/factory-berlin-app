package e.p;

import e.p.g;
import e.p.h;
import e.p.j;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: TiledPagedList */
class n<T> extends h<T> implements j.a {
    final l<T> u;
    g.a<T> v = new a();

    /* compiled from: TiledPagedList */
    class a extends g.a<T> {
        a() {
        }

        public void a(int i2, g<T> gVar) {
            if (gVar.c()) {
                n.this.r();
            } else if (!n.this.F()) {
                if (i2 == 0 || i2 == 3) {
                    List<T> list = gVar.a;
                    if (n.this.f8823k.q() == 0) {
                        n nVar = n.this;
                        nVar.f8823k.E(gVar.b, list, gVar.c, gVar.f8818d, nVar.f8822j.a, nVar);
                    } else {
                        n nVar2 = n.this;
                        nVar2.f8823k.T(gVar.f8818d, list, nVar2.f8824l, nVar2.f8822j.f8837d, nVar2.f8826n, nVar2);
                    }
                    n nVar3 = n.this;
                    if (nVar3.f8821i != null) {
                        boolean z = true;
                        boolean z2 = nVar3.f8823k.size() == 0;
                        boolean z3 = !z2 && gVar.b == 0 && gVar.f8818d == 0;
                        int size = n.this.size();
                        if (z2 || (!(i2 == 0 && gVar.c == 0) && (i2 != 3 || gVar.f8818d + n.this.f8822j.a < size))) {
                            z = false;
                        }
                        n.this.q(z2, z3, z);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("unexpected resultType" + i2);
            }
        }
    }

    /* compiled from: TiledPagedList */
    class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f8854g;

        b(int i2) {
            this.f8854g = i2;
        }

        public void run() {
            if (!n.this.F()) {
                n nVar = n.this;
                int i2 = nVar.f8822j.a;
                if (nVar.u.e()) {
                    n.this.r();
                    return;
                }
                int i3 = this.f8854g * i2;
                int min = Math.min(i2, n.this.f8823k.size() - i3);
                n nVar2 = n.this;
                nVar2.u.j(3, i3, min, nVar2.f8819g, nVar2.v);
            }
        }
    }

    n(l<T> lVar, Executor executor, Executor executor2, h.c<T> cVar, h.f fVar, int i2) {
        super(new j(), executor, executor2, cVar, fVar);
        this.u = lVar;
        int i3 = this.f8822j.a;
        this.f8824l = i2;
        if (lVar.e()) {
            r();
            return;
        }
        int max = Math.max(this.f8822j.f8838e / i3, 2) * i3;
        this.u.i(true, Math.max(0, ((i2 - (max / 2)) / i3) * i3), max, i3, this.f8819g, this.v);
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void K(int i2) {
        j<T> jVar = this.f8823k;
        h.f fVar = this.f8822j;
        jVar.d(i2, fVar.b, fVar.a, this);
    }

    public void a(int i2, int i3) {
        N(i2, i3);
    }

    public void d() {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    public void e() {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    public void g(int i2, int i3, int i4) {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    public void i(int i2, int i3) {
        L(i2, i3);
    }

    public void j(int i2) {
        M(0, i2);
    }

    public void k(int i2, int i3, int i4) {
        throw new IllegalStateException("Contiguous callback on TiledPagedList");
    }

    public void l(int i2) {
        this.f8820h.execute(new b(i2));
    }

    public void m(int i2, int i3) {
        L(i2, i3);
    }

    /* access modifiers changed from: protected */
    public void u(h<T> hVar, h.e eVar) {
        j<T> jVar = hVar.f8823k;
        if (jVar.isEmpty() || this.f8823k.size() != jVar.size()) {
            throw new IllegalArgumentException("Invalid snapshot provided - doesn't appear to be a snapshot of this PagedList");
        }
        int i2 = this.f8822j.a;
        int l2 = this.f8823k.l() / i2;
        int q = this.f8823k.q();
        int i3 = 0;
        while (i3 < q) {
            int i4 = i3 + l2;
            int i5 = 0;
            while (i5 < this.f8823k.q()) {
                int i6 = i4 + i5;
                if (!this.f8823k.y(i2, i6) || jVar.y(i2, i6)) {
                    break;
                }
                i5++;
            }
            if (i5 > 0) {
                eVar.a(i4 * i2, i2 * i5);
                i3 += i5 - 1;
            }
            i3++;
        }
    }

    public d<?, T> y() {
        return this.u;
    }

    public Object z() {
        return Integer.valueOf(this.f8824l);
    }
}

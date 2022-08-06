package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import e.e.d;
import e.e.g;
import e.h.j.e;
import e.h.j.f;

/* compiled from: ViewInfoStore */
class z {
    final g<RecyclerView.d0, a> a = new g<>();
    final d<RecyclerView.d0> b = new d<>();

    /* compiled from: ViewInfoStore */
    static class a {

        /* renamed from: d  reason: collision with root package name */
        static e<a> f1358d = new f(20);
        int a;
        RecyclerView.l.c b;
        RecyclerView.l.c c;

        private a() {
        }

        static void a() {
            do {
            } while (f1358d.b() != null);
        }

        static a b() {
            a b2 = f1358d.b();
            return b2 == null ? new a() : b2;
        }

        static void c(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            f1358d.a(aVar);
        }
    }

    /* compiled from: ViewInfoStore */
    interface b {
        void a(RecyclerView.d0 d0Var);

        void b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    z() {
    }

    private RecyclerView.l.c l(RecyclerView.d0 d0Var, int i2) {
        a m2;
        RecyclerView.l.c cVar;
        int f2 = this.a.f(d0Var);
        if (f2 >= 0 && (m2 = this.a.m(f2)) != null) {
            int i3 = m2.a;
            if ((i3 & i2) != 0) {
                m2.a = (~i2) & i3;
                if (i2 == 4) {
                    cVar = m2.b;
                } else if (i2 == 8) {
                    cVar = m2.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((m2.a & 12) == 0) {
                    this.a.k(f2);
                    a.c(m2);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.a |= 2;
        aVar.b = cVar;
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.a |= 1;
    }

    /* access modifiers changed from: package-private */
    public void c(long j2, RecyclerView.d0 d0Var) {
        this.b.s(j2, d0Var);
    }

    /* access modifiers changed from: package-private */
    public void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.c = cVar;
        aVar.a |= 8;
    }

    /* access modifiers changed from: package-private */
    public void e(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.b = cVar;
        aVar.a |= 4;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.a.clear();
        this.b.d();
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.d0 g(long j2) {
        return this.b.h(j2);
    }

    /* access modifiers changed from: package-private */
    public boolean h(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        if (aVar == null || (aVar.a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean i(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        return (aVar == null || (aVar.a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        a.a();
    }

    public void k(RecyclerView.d0 d0Var) {
        p(d0Var);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.l.c m(RecyclerView.d0 d0Var) {
        return l(d0Var, 8);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.l.c n(RecyclerView.d0 d0Var) {
        return l(d0Var, 4);
    }

    /* access modifiers changed from: package-private */
    public void o(b bVar) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 i2 = this.a.i(size);
            a k2 = this.a.k(size);
            int i3 = k2.a;
            if ((i3 & 3) == 3) {
                bVar.a(i2);
            } else if ((i3 & 1) != 0) {
                RecyclerView.l.c cVar = k2.b;
                if (cVar == null) {
                    bVar.a(i2);
                } else {
                    bVar.c(i2, cVar, k2.c);
                }
            } else if ((i3 & 14) == 14) {
                bVar.b(i2, k2.b, k2.c);
            } else if ((i3 & 12) == 12) {
                bVar.d(i2, k2.b, k2.c);
            } else if ((i3 & 4) != 0) {
                bVar.c(i2, k2.b, (RecyclerView.l.c) null);
            } else if ((i3 & 8) != 0) {
                bVar.b(i2, k2.b, k2.c);
            }
            a.c(k2);
        }
    }

    /* access modifiers changed from: package-private */
    public void p(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        if (aVar != null) {
            aVar.a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public void q(RecyclerView.d0 d0Var) {
        int v = this.b.v() - 1;
        while (true) {
            if (v < 0) {
                break;
            } else if (d0Var == this.b.w(v)) {
                this.b.u(v);
                break;
            } else {
                v--;
            }
        }
        a remove = this.a.remove(d0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}

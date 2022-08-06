package e.f.a.j;

import e.f.a.j.e;
import java.util.ArrayList;

/* compiled from: Snapshot */
public class o {
    private int a;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f8614d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<a> f8615e = new ArrayList<>();

    /* compiled from: Snapshot */
    static class a {
        private e a;
        private e b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private e.c f8616d;

        /* renamed from: e  reason: collision with root package name */
        private int f8617e;

        public a(e eVar) {
            this.a = eVar;
            this.b = eVar.i();
            this.c = eVar.d();
            this.f8616d = eVar.h();
            this.f8617e = eVar.c();
        }

        public void a(f fVar) {
            fVar.h(this.a.j()).b(this.b, this.c, this.f8616d, this.f8617e);
        }

        public void b(f fVar) {
            e h2 = fVar.h(this.a.j());
            this.a = h2;
            if (h2 != null) {
                this.b = h2.i();
                this.c = this.a.d();
                this.f8616d = this.a.h();
                this.f8617e = this.a.c();
                return;
            }
            this.b = null;
            this.c = 0;
            this.f8616d = e.c.STRONG;
            this.f8617e = 0;
        }
    }

    public o(f fVar) {
        this.a = fVar.G();
        this.b = fVar.H();
        this.c = fVar.D();
        this.f8614d = fVar.r();
        ArrayList<e> i2 = fVar.i();
        int size = i2.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f8615e.add(new a(i2.get(i3)));
        }
    }

    public void a(f fVar) {
        fVar.C0(this.a);
        fVar.D0(this.b);
        fVar.y0(this.c);
        fVar.b0(this.f8614d);
        int size = this.f8615e.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f8615e.get(i2).a(fVar);
        }
    }

    public void b(f fVar) {
        this.a = fVar.G();
        this.b = fVar.H();
        this.c = fVar.D();
        this.f8614d = fVar.r();
        int size = this.f8615e.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f8615e.get(i2).b(fVar);
        }
    }
}

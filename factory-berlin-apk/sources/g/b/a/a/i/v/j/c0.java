package g.b.a.a.i.v.j;

import h.a.b;
import i.a.a;

/* compiled from: SQLiteEventStore_Factory */
public final class c0 implements b<b0> {
    private final a<g.b.a.a.i.w.a> a;
    private final a<g.b.a.a.i.w.a> b;
    private final a<d> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<h0> f9308d;

    public c0(a<g.b.a.a.i.w.a> aVar, a<g.b.a.a.i.w.a> aVar2, a<d> aVar3, a<h0> aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f9308d = aVar4;
    }

    public static c0 a(a<g.b.a.a.i.w.a> aVar, a<g.b.a.a.i.w.a> aVar2, a<d> aVar3, a<h0> aVar4) {
        return new c0(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: b */
    public b0 get() {
        return new b0(this.a.get(), this.b.get(), this.c.get(), this.f9308d.get());
    }
}

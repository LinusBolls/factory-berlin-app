package g.b.a.a.i;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import g.b.a.a.i.v.e;
import h.a.b;
import i.a.a;

/* compiled from: TransportRuntime_Factory */
public final class s implements b<q> {
    private final a<g.b.a.a.i.w.a> a;
    private final a<g.b.a.a.i.w.a> b;
    private final a<e> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<m> f9286d;

    /* renamed from: e  reason: collision with root package name */
    private final a<q> f9287e;

    public s(a<g.b.a.a.i.w.a> aVar, a<g.b.a.a.i.w.a> aVar2, a<e> aVar3, a<m> aVar4, a<q> aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f9286d = aVar4;
        this.f9287e = aVar5;
    }

    public static s a(a<g.b.a.a.i.w.a> aVar, a<g.b.a.a.i.w.a> aVar2, a<e> aVar3, a<m> aVar4, a<q> aVar5) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: b */
    public q get() {
        return new q(this.a.get(), this.b.get(), this.c.get(), this.f9286d.get(), this.f9287e.get());
    }
}

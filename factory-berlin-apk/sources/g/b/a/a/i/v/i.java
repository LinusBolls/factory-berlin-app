package g.b.a.a.i.v;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import g.b.a.a.i.v.j.c;
import h.a.b;
import h.a.d;
import i.a.a;

/* compiled from: SchedulingModule_WorkSchedulerFactory */
public final class i implements b<s> {
    private final a<Context> a;
    private final a<c> b;
    private final a<g> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<g.b.a.a.i.w.a> f9297d;

    public i(a<Context> aVar, a<c> aVar2, a<g> aVar3, a<g.b.a.a.i.w.a> aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f9297d = aVar4;
    }

    public static i a(a<Context> aVar, a<c> aVar2, a<g> aVar3, a<g.b.a.a.i.w.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static s c(Context context, c cVar, g gVar, g.b.a.a.i.w.a aVar) {
        s a2 = h.a(context, cVar, gVar, aVar);
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: b */
    public s get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.f9297d.get());
    }
}

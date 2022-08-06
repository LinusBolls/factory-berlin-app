package g.b.a.a.i.v;

import h.a.b;
import h.a.d;
import i.a.a;

/* compiled from: SchedulingConfigModule_ConfigFactory */
public final class g implements b<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> {
    private final a<g.b.a.a.i.w.a> a;

    public g(a<g.b.a.a.i.w.a> aVar) {
        this.a = aVar;
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.g a(g.b.a.a.i.w.a aVar) {
        com.google.android.datatransport.runtime.scheduling.jobscheduling.g a2 = f.a(aVar);
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public static g b(a<g.b.a.a.i.w.a> aVar) {
        return new g(aVar);
    }

    /* renamed from: c */
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.g get() {
        return a(this.a.get());
    }
}

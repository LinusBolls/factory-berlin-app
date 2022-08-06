package g.b.a.a.i.v.j;

import h.a.b;
import h.a.d;

/* compiled from: EventStoreModule_StoreConfigFactory */
public final class h implements b<d> {
    private static final h a = new h();

    public static h a() {
        return a;
    }

    public static d c() {
        d c = e.c();
        d.c(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    /* renamed from: b */
    public d get() {
        return c();
    }
}

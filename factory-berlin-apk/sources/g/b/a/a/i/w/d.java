package g.b.a.a.i.w;

import h.a.b;

/* compiled from: TimeModule_UptimeClockFactory */
public final class d implements b<a> {
    private static final d a = new d();

    public static d a() {
        return a;
    }

    public static a c() {
        a b = b.b();
        h.a.d.c(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    /* renamed from: b */
    public a get() {
        return c();
    }
}

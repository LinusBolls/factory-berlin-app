package g.b.a.a.i.w;

import h.a.b;
import h.a.d;

/* compiled from: TimeModule_EventClockFactory */
public final class c implements b<a> {
    private static final c a = new c();

    public static c a() {
        return a;
    }

    public static a b() {
        a a2 = b.a();
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: c */
    public a get() {
        return b();
    }
}

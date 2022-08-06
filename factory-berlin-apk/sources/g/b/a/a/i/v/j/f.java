package g.b.a.a.i.v.j;

import h.a.b;
import h.a.d;

/* compiled from: EventStoreModule_DbNameFactory */
public final class f implements b<String> {
    private static final f a = new f();

    public static f a() {
        return a;
    }

    public static String b() {
        String a2 = e.a();
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: c */
    public String get() {
        return b();
    }
}

package m.a.c;

import kotlin.jvm.internal.k;
import m.a.c.k.b;
import m.a.c.k.c;

/* compiled from: Koin.kt */
public final class a {
    private final c a = new c();
    private final b b = new b();
    private final m.a.c.l.a c = new m.a.c.l.a("-Root-", true, this);

    public final void a() {
        this.a.a();
        this.c.b();
        this.b.a();
    }

    public final void b() {
        this.c.c();
    }

    public final void c(String str) {
        k.f(str, "scopeId");
        this.a.c(str);
    }

    public final m.a.c.l.a d() {
        return this.c;
    }

    public final c e() {
        return this.a;
    }
}

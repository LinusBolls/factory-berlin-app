package m.a.c.g;

import kotlin.jvm.internal.k;

/* compiled from: Logger.kt */
public abstract class c {
    private b a;

    public c() {
        this((b) null, 1, (DefaultConstructorMarker) null);
    }

    public c(b bVar) {
        k.f(bVar, "level");
        this.a = bVar;
    }

    public final void a(String str) {
        k.f(str, "msg");
        e(b.DEBUG, str);
    }

    public final void b(String str) {
        k.f(str, "msg");
        e(b.ERROR, str);
    }

    public final void c(String str) {
        k.f(str, "msg");
        e(b.INFO, str);
    }

    public final boolean d(b bVar) {
        k.f(bVar, "lvl");
        return this.a.compareTo(bVar) <= 0;
    }

    public abstract void e(b bVar, String str);

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(b bVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? b.INFO : bVar);
    }
}

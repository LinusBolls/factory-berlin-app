package g.e.n.c.d.o;

import g.e.n.c.d.d;
import g.e.n.c.d.e;
import g.e.n.c.d.m;
import kotlin.jvm.internal.k;

/* compiled from: StartBleScanningUseCaseImpl.kt */
public final class l implements m {
    private final e a;
    private final d b;

    public l(e eVar, d dVar) {
        k.e(eVar, "bleScannerDataSource");
        k.e(dVar, "bleScannerConfiguration");
        this.a = eVar;
        this.b = dVar;
    }

    public void a() {
        this.a.a(this.b);
    }
}

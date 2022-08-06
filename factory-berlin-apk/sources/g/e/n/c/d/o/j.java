package g.e.n.c.d.o;

import g.e.n.c.d.b;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.e3.c;

/* compiled from: GetBleScansUseCaseImpl.kt */
public final class j implements g.e.n.c.d.j {
    private final d a;

    public j(d dVar) {
        k.e(dVar, "bleScanRepository");
        this.a = dVar;
    }

    public c<List<b>> a() {
        return this.a.a();
    }
}

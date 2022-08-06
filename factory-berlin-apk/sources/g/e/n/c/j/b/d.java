package g.e.n.c.j.b;

import g.e.m.c;
import g.e.n.c.j.a;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: GetRootUnitsUseCaseImpl.kt */
public final class d implements c {
    private final e a;

    public d(e eVar) {
        k.e(eVar, "unitRepository");
        this.a = eVar;
    }

    public Object a(kotlin.c0.d<? super c<? extends List<a.b>>> dVar) {
        return this.a.getRootUnits(dVar);
    }
}

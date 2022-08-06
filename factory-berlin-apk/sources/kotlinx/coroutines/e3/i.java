package kotlinx.coroutines.e3;

import kotlin.c0.g;
import kotlin.c0.h;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.flow.internal.d;
import kotlinx.coroutines.flow.internal.j;
import kotlinx.coroutines.x1;

/* compiled from: Context.kt */
final /* synthetic */ class i {
    private static final void a(g gVar) {
        if (!(gVar.get(x1.f11076e) == null)) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + gVar).toString());
        }
    }

    public static final <T> c<T> b(c<? extends T> cVar, g gVar) {
        a(gVar);
        if (k.a(gVar, h.f10600g)) {
            return cVar;
        }
        if (cVar instanceof j) {
            return j.a.a((j) cVar, gVar, 0, 2, (Object) null);
        }
        return new d(cVar, gVar, 0, 4, (DefaultConstructorMarker) null);
    }
}

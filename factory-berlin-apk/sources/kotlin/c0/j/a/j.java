package kotlin.c0.j.a;

import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.h;

/* compiled from: ContinuationImpl.kt */
public abstract class j extends a {
    public j(d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.c() == h.f10600g)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public g c() {
        return h.f10600g;
    }
}

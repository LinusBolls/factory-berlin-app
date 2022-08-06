package kotlinx.coroutines.internal;

import kotlin.jvm.internal.k;

/* compiled from: Atomic.kt */
public abstract class b {
    public d<?> a;

    public abstract void a(d<?> dVar, Object obj);

    public final d<?> b() {
        d<?> dVar = this.a;
        if (dVar != null) {
            return dVar;
        }
        k.q("atomicOp");
        throw null;
    }

    public abstract Object c(d<?> dVar);

    public final void d(d<?> dVar) {
        this.a = dVar;
    }
}

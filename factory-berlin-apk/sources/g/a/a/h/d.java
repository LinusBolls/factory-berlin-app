package g.a.a.h;

import g.a.a.h.f;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;

/* compiled from: ExecutionContext.kt */
public final class d implements f {
    public static final d b = new d();

    private d() {
    }

    public f a(f.d<?> dVar) {
        k.f(dVar, "key");
        return this;
    }

    public f b(f fVar) {
        k.f(fVar, "context");
        return fVar;
    }

    public <R> R fold(R r, p<? super R, ? super f.c, ? extends R> pVar) {
        k.f(pVar, "operation");
        return r;
    }
}

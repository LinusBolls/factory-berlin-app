package g.a.a.h;

import g.a.a.h.f;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;

/* compiled from: ExecutionContext.kt */
public final class a implements f {
    private final f b;
    private final f.c c;

    public a(f fVar, f.c cVar) {
        k.f(fVar, "left");
        k.f(cVar, "element");
        this.b = fVar;
        this.c = cVar;
    }

    public f a(f.d<?> dVar) {
        k.f(dVar, "key");
        if (this.c.c(dVar) != null) {
            return this.b;
        }
        f a = this.b.a(dVar);
        if (a == this.b) {
            return this;
        }
        if (a == d.b) {
            return this.c;
        }
        return new a(a, this.c);
    }

    public f b(f fVar) {
        k.f(fVar, "context");
        return f.b.a(this, fVar);
    }

    public <R> R fold(R r, p<? super R, ? super f.c, ? extends R> pVar) {
        k.f(pVar, "operation");
        return pVar.l(this.b.fold(r, pVar), this.c);
    }
}

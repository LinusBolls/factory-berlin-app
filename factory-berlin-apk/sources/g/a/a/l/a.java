package g.a.a.l;

import g.a.a.h.f;
import k.d0;
import k.e0;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;

/* compiled from: OkHttpExecutionContext.kt */
public final class a implements f.c {
    public static final C0609a c = new C0609a((DefaultConstructorMarker) null);
    private final f.d<?> b = c;

    /* renamed from: g.a.a.l.a$a  reason: collision with other inner class name */
    /* compiled from: OkHttpExecutionContext.kt */
    public static final class C0609a implements f.d<a> {
        private C0609a() {
        }

        public /* synthetic */ C0609a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(d0 d0Var) {
        k.f(d0Var, "response");
        d(d0Var);
    }

    private final d0 d(d0 d0Var) {
        d0.a K = d0Var.K();
        if (d0Var.a() != null) {
            K.b((e0) null);
        }
        d0 h2 = d0Var.h();
        if (h2 != null) {
            K.d(d(h2));
        }
        d0 F = d0Var.F();
        if (F != null) {
            K.n(d(F));
        }
        d0 c2 = K.c();
        k.b(c2, "builder.build()");
        return c2;
    }

    public f a(f.d<?> dVar) {
        k.f(dVar, "key");
        return f.c.a.c(this, dVar);
    }

    public f b(f fVar) {
        k.f(fVar, "context");
        return f.c.a.d(this, fVar);
    }

    public <E extends f.c> E c(f.d<E> dVar) {
        k.f(dVar, "key");
        return f.c.a.b(this, dVar);
    }

    public <R> R fold(R r, p<? super R, ? super f.c, ? extends R> pVar) {
        k.f(pVar, "operation");
        return f.c.a.a(this, r, pVar);
    }

    public f.d<?> getKey() {
        return this.b;
    }
}

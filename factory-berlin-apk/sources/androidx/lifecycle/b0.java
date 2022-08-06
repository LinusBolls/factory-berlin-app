package androidx.lifecycle;

import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.i0;

/* compiled from: CoroutineLiveData.kt */
public final class b0<T> implements a0<T> {
    private final g a;
    private f<T> b;

    @f(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {98}, m = "invokeSuspend")
    /* compiled from: CoroutineLiveData.kt */
    static final class a extends k implements p<i0, d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f966k;

        /* renamed from: l  reason: collision with root package name */
        Object f967l;

        /* renamed from: m  reason: collision with root package name */
        int f968m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ b0 f969n;
        final /* synthetic */ Object o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b0 b0Var, Object obj, d dVar) {
            super(2, dVar);
            this.f969n = b0Var;
            this.o = obj;
        }

        public final d<x> b(Object obj, d<?> dVar) {
            kotlin.jvm.internal.k.f(dVar, "completion");
            a aVar = new a(this.f969n, this.o, dVar);
            aVar.f966k = (i0) obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f968m;
            if (i2 == 0) {
                l.b(obj);
                i0 i0Var = this.f966k;
                f b = this.f969n.b();
                this.f967l = i0Var;
                this.f968m = 1;
                if (b.y(this) == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f967l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f969n.b().u(this.o);
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((a) b(obj, (d) obj2)).i(x.a);
        }
    }

    public b0(f<T> fVar, g gVar) {
        kotlin.jvm.internal.k.f(fVar, "target");
        kotlin.jvm.internal.k.f(gVar, "context");
        this.b = fVar;
        this.a = gVar.plus(a1.c().r0());
    }

    public Object a(T t, d<? super x> dVar) {
        return kotlinx.coroutines.d.c(this.a, new a(this, t, (d) null), dVar);
    }

    public final f<T> b() {
        return this.b;
    }
}

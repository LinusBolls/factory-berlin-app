package kotlinx.coroutines.e3;

import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.x1;

/* compiled from: Collect.kt */
final /* synthetic */ class h {

    @f(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {50}, m = "invokeSuspend")
    /* compiled from: Collect.kt */
    static final class a extends k implements p<i0, d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f10784k;

        /* renamed from: l  reason: collision with root package name */
        Object f10785l;

        /* renamed from: m  reason: collision with root package name */
        int f10786m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ c f10787n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, d dVar) {
            super(2, dVar);
            this.f10787n = cVar;
        }

        public final d<x> b(Object obj, d<?> dVar) {
            a aVar = new a(this.f10787n, dVar);
            aVar.f10784k = (i0) obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f10786m;
            if (i2 == 0) {
                l.b(obj);
                i0 i0Var = this.f10784k;
                c cVar = this.f10787n;
                this.f10785l = i0Var;
                this.f10786m = 1;
                if (e.c(cVar, this) == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f10785l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((a) b(obj, (d) obj2)).i(x.a);
        }
    }

    public static final Object a(c<?> cVar, d<? super x> dVar) {
        Object a2 = cVar.a(kotlinx.coroutines.flow.internal.l.f10922g, dVar);
        return a2 == d.c() ? a2 : x.a;
    }

    public static final <T> x1 b(c<? extends T> cVar, i0 i0Var) {
        return e.b(i0Var, (g) null, (l0) null, new a(cVar, (d) null), 3, (Object) null);
    }
}

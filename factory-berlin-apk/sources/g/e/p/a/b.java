package g.e.p.a;

import g.e.k.d;
import java.util.concurrent.CancellationException;
import kotlin.c0.g;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.e3.c;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.t2;
import kotlinx.coroutines.x1;

/* compiled from: FlowObservable.kt */
public final class b<T> extends d<T> {
    private x1 q;
    /* access modifiers changed from: private */
    public final c<T> r;
    private final d0 s;

    @f(c = "com.sensorberg.util.couroutine.FlowObservable$onActive$1", f = "FlowObservable.kt", l = {32}, m = "invokeSuspend")
    /* compiled from: FlowObservable.kt */
    static final class a extends k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f10233k;

        /* renamed from: l  reason: collision with root package name */
        Object f10234l;

        /* renamed from: m  reason: collision with root package name */
        Object f10235m;

        /* renamed from: n  reason: collision with root package name */
        int f10236n;
        final /* synthetic */ b o;

        /* renamed from: g.e.p.a.b$a$a  reason: collision with other inner class name */
        /* compiled from: Collect.kt */
        public static final class C0730a implements kotlinx.coroutines.e3.d<T> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ a f10237g;

            public C0730a(a aVar) {
                this.f10237g = aVar;
            }

            public Object a(Object obj, kotlin.c0.d dVar) {
                this.f10237g.o.w(obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.o = bVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            a aVar = new a(this.o, dVar);
            aVar.f10233k = (i0) obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f10236n;
            if (i2 == 0) {
                l.b(obj);
                i0 i0Var = this.f10233k;
                c y = this.o.r;
                C0730a aVar = new C0730a(this);
                this.f10234l = i0Var;
                this.f10235m = y;
                this.f10236n = 1;
                if (y.a(aVar, this) == c) {
                    return c;
                }
            } else if (i2 == 1) {
                c cVar = (c) this.f10235m;
                i0 i0Var2 = (i0) this.f10234l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    public b(c<? extends T> cVar, d0 d0Var) {
        kotlin.jvm.internal.k.e(cVar, "flow");
        kotlin.jvm.internal.k.e(d0Var, "dispatcher");
        this.r = cVar;
        this.s = d0Var;
    }

    /* access modifiers changed from: protected */
    public void s() {
        super.s();
        this.q = e.b(j0.a(this.s.plus(t2.b((x1) null, 1, (Object) null))), (g) null, (l0) null, new a(this, (kotlin.c0.d) null), 3, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void t() {
        super.t();
        x1 x1Var = this.q;
        if (x1Var != null) {
            x1.a.b(x1Var, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, d0 d0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i2 & 2) != 0 ? a1.c() : d0Var);
    }
}

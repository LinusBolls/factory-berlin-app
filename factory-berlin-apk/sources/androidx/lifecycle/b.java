package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.x1;

/* compiled from: CoroutineLiveData.kt */
public final class b<T> {
    /* access modifiers changed from: private */
    public x1 a;
    private x1 b;
    /* access modifiers changed from: private */
    public final f<T> c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final p<a0<T>, d<? super x>, Object> f954d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final long f955e;

    /* renamed from: f  reason: collision with root package name */
    private final i0 f956f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final kotlin.e0.c.a<x> f957g;

    @f(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {187}, m = "invokeSuspend")
    /* compiled from: CoroutineLiveData.kt */
    static final class a extends k implements p<i0, d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f958k;

        /* renamed from: l  reason: collision with root package name */
        Object f959l;

        /* renamed from: m  reason: collision with root package name */
        int f960m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ b f961n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, d dVar) {
            super(2, dVar);
            this.f961n = bVar;
        }

        public final d<x> b(Object obj, d<?> dVar) {
            kotlin.jvm.internal.k.f(dVar, "completion");
            a aVar = new a(this.f961n, dVar);
            aVar.f958k = (i0) obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f960m;
            if (i2 == 0) {
                l.b(obj);
                i0 i0Var = this.f958k;
                long e2 = this.f961n.f955e;
                this.f959l = i0Var;
                this.f960m = 1;
                if (t0.a(e2, this) == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f959l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!this.f961n.c.n()) {
                x1 d2 = this.f961n.a;
                if (d2 != null) {
                    x1.a.b(d2, (CancellationException) null, 1, (Object) null);
                }
                this.f961n.a = null;
            }
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((a) b(obj, (d) obj2)).i(x.a);
        }
    }

    @f(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {176}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.b$b  reason: collision with other inner class name */
    /* compiled from: CoroutineLiveData.kt */
    static final class C0022b extends k implements p<i0, d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f962k;

        /* renamed from: l  reason: collision with root package name */
        Object f963l;

        /* renamed from: m  reason: collision with root package name */
        Object f964m;

        /* renamed from: n  reason: collision with root package name */
        int f965n;
        final /* synthetic */ b o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0022b(b bVar, d dVar) {
            super(2, dVar);
            this.o = bVar;
        }

        public final d<x> b(Object obj, d<?> dVar) {
            kotlin.jvm.internal.k.f(dVar, "completion");
            C0022b bVar = new C0022b(this.o, dVar);
            bVar.f962k = (i0) obj;
            return bVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f965n;
            if (i2 == 0) {
                l.b(obj);
                i0 i0Var = this.f962k;
                b0 b0Var = new b0(this.o.c, i0Var.k());
                p a = this.o.f954d;
                this.f963l = i0Var;
                this.f964m = b0Var;
                this.f965n = 1;
                if (a.l(b0Var, this) == c) {
                    return c;
                }
            } else if (i2 == 1) {
                b0 b0Var2 = (b0) this.f964m;
                i0 i0Var2 = (i0) this.f963l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.o.f957g.d();
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((C0022b) b(obj, (d) obj2)).i(x.a);
        }
    }

    public b(f<T> fVar, p<? super a0<T>, ? super d<? super x>, ? extends Object> pVar, long j2, i0 i0Var, kotlin.e0.c.a<x> aVar) {
        kotlin.jvm.internal.k.f(fVar, "liveData");
        kotlin.jvm.internal.k.f(pVar, "block");
        kotlin.jvm.internal.k.f(i0Var, "scope");
        kotlin.jvm.internal.k.f(aVar, "onDone");
        this.c = fVar;
        this.f954d = pVar;
        this.f955e = j2;
        this.f956f = i0Var;
        this.f957g = aVar;
    }

    public final void g() {
        if (this.b == null) {
            this.b = e.b(this.f956f, a1.c().r0(), (l0) null, new a(this, (d) null), 2, (Object) null);
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }

    public final void h() {
        x1 x1Var = this.b;
        if (x1Var != null) {
            x1.a.b(x1Var, (CancellationException) null, 1, (Object) null);
        }
        this.b = null;
        if (this.a == null) {
            this.a = e.b(this.f956f, (g) null, (l0) null, new C0022b(this, (d) null), 3, (Object) null);
        }
    }
}

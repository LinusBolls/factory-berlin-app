package com.sensorberg.smartworkspace.app.screens.alarm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.m0;
import com.sensorberg.smartworkspace.app.i.a;
import g.e.n.g.f;
import g.e.n.g.y;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.e3.d;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.q1;
import kotlinx.coroutines.x1;

/* compiled from: AlarmLiveData.kt */
public final class g extends c0<a.d> {
    /* access modifiers changed from: private */
    public LiveData<a.d> r;
    private x1 s;
    private final f t;
    private final y u;

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements kotlinx.coroutines.e3.c<a.d> {
        final /* synthetic */ kotlinx.coroutines.e3.c a;

        /* renamed from: com.sensorberg.smartworkspace.app.screens.alarm.g$a$a  reason: collision with other inner class name */
        /* compiled from: Collect.kt */
        public static final class C0481a implements d<g.e.m.c<? extends a.d>> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ d f7317g;

            public C0481a(d dVar, a aVar) {
                this.f7317g = dVar;
            }

            public Object a(Object obj, kotlin.c0.d dVar) {
                d dVar2 = this.f7317g;
                Object a = ((g.e.m.c) obj).a();
                if (a == null) {
                    return a == d.c() ? a : x.a;
                }
                Object a2 = dVar2.a(a, dVar);
                return a2 == d.c() ? a2 : x.a;
            }
        }

        public a(kotlinx.coroutines.e3.c cVar) {
            this.a = cVar;
        }

        public Object a(d dVar, kotlin.c0.d dVar2) {
            Object a2 = this.a.a(new C0481a(dVar, this), dVar2);
            if (a2 == d.c()) {
                return a2;
            }
            return x.a;
        }
    }

    /* compiled from: Transformations.kt */
    public static final class b<I, O> implements e.b.a.c.a<y.a, LiveData<a.d>> {
        final /* synthetic */ kotlinx.coroutines.e3.c a;

        public b(kotlinx.coroutines.e3.c cVar) {
            this.a = cVar;
        }

        /* renamed from: b */
        public final LiveData<a.d> a(y.a aVar) {
            y.a aVar2 = aVar;
            if (k.a(aVar2, y.a.C0726a.a) || (aVar2 instanceof y.a.c) || (aVar2 instanceof y.a.b)) {
                e0 e0Var = new e0();
                e0Var.u(null);
                return e0Var;
            } else if (k.a(aVar2, y.a.d.a)) {
                return androidx.lifecycle.k.c(this.a, (kotlin.c0.g) null, 0, 3, (Object) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.smartworkspace.app.screens.alarm.AlarmLiveData$execute$1", f = "AlarmLiveData.kt", l = {}, m = "invokeSuspend")
    /* compiled from: AlarmLiveData.kt */
    static final class c extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f7318k;

        /* renamed from: l  reason: collision with root package name */
        int f7319l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g f7320m;

        /* compiled from: AlarmLiveData.kt */
        static final class a<T> implements f0<a.d> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ c f7321g;

            a(c cVar) {
                this.f7321g = cVar;
            }

            /* renamed from: a */
            public final void k(a.d dVar) {
                this.f7321g.f7320m.u(dVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.f7320m = gVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            k.e(dVar, "completion");
            c cVar = new c(this.f7320m, dVar);
            cVar.f7318k = (i0) obj;
            return cVar;
        }

        public final Object i(Object obj) {
            Object unused = d.c();
            if (this.f7319l == 0) {
                l.b(obj);
                LiveData x = this.f7320m.A();
                this.f7320m.v(x, new a(this));
                LiveData y = this.f7320m.r;
                if (y != null) {
                    this.f7320m.w(y);
                }
                this.f7320m.r = x;
                return x.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object l(Object obj, Object obj2) {
            return ((c) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    public g(f fVar, y yVar) {
        k.e(fVar, "graphQl");
        k.e(yVar, "userManager");
        this.t = fVar;
        this.u = yVar;
    }

    /* access modifiers changed from: private */
    public final LiveData<a.d> A() {
        LiveData<Y> c2 = m0.c(this.u.getStatusLiveData(), new b(new a(this.t.n(new com.sensorberg.smartworkspace.app.i.a(), 2000))));
        k.b(c2, "Transformations.switchMap(this) { transform(it) }");
        LiveData<a.d> a2 = m0.a(c2);
        k.b(a2, "Transformations.distinctUntilChanged(this)");
        return a2;
    }

    private final void B() {
        x1 x1Var = this.s;
        if (x1Var != null) {
            x1.a.b(x1Var, (CancellationException) null, 1, (Object) null);
        }
        this.s = e.b(q1.f11053g, a1.c(), (l0) null, new c(this, (kotlin.c0.d) null), 2, (Object) null);
    }

    public final void C() {
        n.a.a.a("AlarmLiveData: refresh", new Object[0]);
        if (n()) {
            B();
        }
    }

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        n.a.a.a("AlarmLiveData: onActive", new Object[0]);
        B();
    }

    /* access modifiers changed from: protected */
    public void r() {
        super.r();
        n.a.a.a("AlarmLiveData: onInactive", new Object[0]);
        x1 x1Var = this.s;
        if (x1Var != null) {
            x1.a.b(x1Var, (CancellationException) null, 1, (Object) null);
        }
    }
}

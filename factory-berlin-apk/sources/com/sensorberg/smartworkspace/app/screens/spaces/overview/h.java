package com.sensorberg.smartworkspace.app.screens.spaces.overview;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.c0.d;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.x1;

/* compiled from: SpacesOverviewViewModel.kt */
public final class h extends n0 {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final List<b> f7981k = n.i(new b(0, "", "-0"), new b(1, "", "-1"), new b(2, "", "-2"), new b(3, "", "-3"), new b(4, "", "-4"));

    /* renamed from: i  reason: collision with root package name */
    private final c0<List<a>> f7982i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<List<a>> f7983j;

    /* compiled from: SpacesOverviewViewModel.kt */
    static final class a extends k implements p<i0, d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f7984k;

        /* renamed from: l  reason: collision with root package name */
        Object f7985l;

        /* renamed from: m  reason: collision with root package name */
        int f7986m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ c0 f7987n;
        final /* synthetic */ x1 o;
        final /* synthetic */ h p;
        final /* synthetic */ d0 q;
        final /* synthetic */ d r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c0 c0Var, x1 x1Var, d dVar, h hVar, d0 d0Var, d dVar2) {
            super(2, dVar);
            this.f7987n = c0Var;
            this.o = x1Var;
            this.p = hVar;
            this.q = d0Var;
            this.r = dVar2;
        }

        public final d<x> b(Object obj, d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            a aVar = new a(this.f7987n, this.o, dVar, this.p, this.q, this.r);
            aVar.f7984k = (i0) obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f7986m;
            if (i2 == 0) {
                l.b(obj);
                i0 i0Var = this.f7984k;
                d dVar = this.r;
                this.f7985l = i0Var;
                this.f7986m = 1;
                obj = dVar.b(this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var2 = (i0) this.f7985l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x1.a.b(this.o, (CancellationException) null, 1, (Object) null);
            this.f7987n.u((List) obj);
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((a) b(obj, (d) obj2)).i(x.a);
        }
    }

    /* compiled from: SpacesOverviewViewModel.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.sensorberg.smartworkspace.app.screens.spaces.overview.SpacesOverviewViewModel$_spaces$1$loadingTimeoutJob$1", f = "SpacesOverviewViewModel.kt", l = {16}, m = "invokeSuspend")
    /* compiled from: SpacesOverviewViewModel.kt */
    static final class c extends k implements p<i0, d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f7988k;

        /* renamed from: l  reason: collision with root package name */
        Object f7989l;

        /* renamed from: m  reason: collision with root package name */
        int f7990m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ c0 f7991n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(c0 c0Var, d dVar) {
            super(2, dVar);
            this.f7991n = c0Var;
        }

        public final d<x> b(Object obj, d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            c cVar = new c(this.f7991n, dVar);
            cVar.f7988k = (i0) obj;
            return cVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f7990m;
            if (i2 == 0) {
                l.b(obj);
                this.f7989l = this.f7988k;
                this.f7990m = 1;
                if (t0.a(5000, this) == c) {
                    return c;
                }
            } else if (i2 == 1) {
                i0 i0Var = (i0) this.f7989l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (kotlin.jvm.internal.k.a((List) this.f7991n.l(), h.f7981k)) {
                this.f7991n.u(n.g());
            }
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((c) b(obj, (d) obj2)).i(x.a);
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public h(d dVar, d0 d0Var) {
        kotlin.jvm.internal.k.e(dVar, "spacesDataSource");
        kotlin.jvm.internal.k.e(d0Var, "mainDispatcher");
        c0<List<a>> c0Var = new c0<>();
        c0Var.u(f7981k);
        x1 b2 = e.b(o0.a(this), d0Var, (l0) null, new c(c0Var, (d) null), 2, (Object) null);
        x1 unused = e.b(o0.a(this), d0Var, (l0) null, new a(c0Var, b2, (d) null, this, d0Var, dVar), 2, (Object) null);
        x xVar = x.a;
        this.f7982i = c0Var;
        this.f7983j = c0Var;
    }

    public final LiveData<List<a>> s() {
        return this.f7983j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(d dVar, d0 d0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i2 & 2) != 0 ? a1.c() : d0Var);
    }
}

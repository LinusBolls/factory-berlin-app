package com.sensorberg.smartworkspace.app.screens.locker.error;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.n0;
import androidx.navigation.p;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.screens.locker.LockerGroupSelection;
import com.sensorberg.smartworkspace.app.screens.locker.error.LockerErrorFragment;
import g.e.n.g.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: LockerErrorViewModel.kt */
public final class d extends n0 implements c {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final e0<g.e.h.a.a<p>> f7611i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<g.e.h.a.a<p>> f7612j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final e0<g.e.h.a.a<x>> f7613k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<g.e.h.a.a<x>> f7614l;

    /* renamed from: m  reason: collision with root package name */
    private final kotlin.e0.c.a<x> f7615m = new a(this);

    /* renamed from: n  reason: collision with root package name */
    private final f0<x.a> f7616n = b.f7618g;
    private final LockerErrorFragment.Arguments o;
    private final g.e.n.g.x p;

    /* compiled from: LockerErrorViewModel.kt */
    static final class a extends l implements kotlin.e0.c.a<kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f7617h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(0);
            this.f7617h = dVar;
        }

        public final void a() {
            LockerErrorFragment.Arguments t = this.f7617h.t();
            p pVar = null;
            if (t != null) {
                if (t instanceof LockerErrorFragment.Arguments.a) {
                    pVar = b.a.a(((LockerErrorFragment.Arguments.a) this.f7617h.t()).a(), (IotUnit) null);
                } else if (t instanceof LockerErrorFragment.Arguments.c) {
                    pVar = b.a.c(((LockerErrorFragment.Arguments.c) this.f7617h.t()).a(), false);
                } else if (t instanceof LockerErrorFragment.Arguments.d) {
                    pVar = b.a.c(((LockerErrorFragment.Arguments.d) this.f7617h.t()).a(), true);
                } else if (k.a(t, LockerErrorFragment.Arguments.b.f7602g)) {
                    pVar = b.a.b();
                } else if (t instanceof LockerErrorFragment.Arguments.e) {
                    pVar = b.a.a((LockerGroupSelection) null, ((LockerErrorFragment.Arguments.e) this.f7617h.t()).a());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (pVar == null) {
                this.f7617h.f7613k.u(new g.e.h.a.a(kotlin.x.a));
                return;
            }
            n.a.a.a("LockerError.onRetryClicked. Navigating to " + pVar, new Object[0]);
            this.f7617h.f7611i.s(new g.e.h.a.a(pVar));
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return kotlin.x.a;
        }
    }

    /* compiled from: LockerErrorViewModel.kt */
    static final class b<T> implements f0<x.a> {

        /* renamed from: g  reason: collision with root package name */
        public static final b f7618g = new b();

        b() {
        }

        /* renamed from: a */
        public final void k(x.a aVar) {
        }
    }

    public d(LockerErrorFragment.Arguments arguments, g.e.n.g.x xVar) {
        k.e(xVar, "unitController");
        this.o = arguments;
        this.p = xVar;
        e0<g.e.h.a.a<p>> e0Var = new e0<>();
        this.f7611i = e0Var;
        this.f7612j = e0Var;
        e0<g.e.h.a.a<kotlin.x>> e0Var2 = new e0<>();
        this.f7613k = e0Var2;
        this.f7614l = e0Var2;
        this.p.getStatusLiveData().p(this.f7616n);
    }

    public kotlin.e0.c.a<kotlin.x> a() {
        return this.f7615m;
    }

    /* access modifiers changed from: protected */
    public void l() {
        this.p.getStatusLiveData().t(this.f7616n);
        super.l();
    }

    public final LockerErrorFragment.Arguments t() {
        return this.o;
    }

    public final LiveData<g.e.h.a.a<p>> u() {
        return this.f7612j;
    }

    public final LiveData<g.e.h.a.a<kotlin.x>> v() {
        return this.f7614l;
    }
}

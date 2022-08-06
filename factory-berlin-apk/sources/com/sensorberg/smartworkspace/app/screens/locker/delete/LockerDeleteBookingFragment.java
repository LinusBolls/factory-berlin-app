package com.sensorberg.smartworkspace.app.screens.locker.delete;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.f0;
import androidx.navigation.p;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.k.e0;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;

@i(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/locker/delete/LockerDeleteBookingFragment;", "Lcom/sensorberg/smartworkspace/app/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "since", "Landroidx/navigation/NavDirections;", "navDirections", "", "postDelayed", "(JLandroidx/navigation/NavDirections;)V", "Landroid/os/Handler;", "lifecycleHandler$delegate", "Lkotlin/Lazy;", "getLifecycleHandler", "()Landroid/os/Handler;", "lifecycleHandler", "Lcom/sensorberg/smartworkspace/app/screens/locker/delete/LockerDeleteBookingViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/sensorberg/smartworkspace/app/screens/locker/delete/LockerDeleteBookingViewModel;", "viewModel", "<init>", "()V", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: LockerDeleteBookingFragment.kt */
public final class LockerDeleteBookingFragment extends com.sensorberg.smartworkspace.app.a {
    private final kotlin.e e0 = g.a(new b(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private final kotlin.e f0 = g.a(new a(this, (m.a.c.j.a) null, new d(this)));
    private HashMap g0;

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<Handler> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f7563h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7564i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7565j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7563h = componentCallbacks;
            this.f7564i = aVar;
            this.f7565j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [android.os.Handler, java.lang.Object] */
        public final Handler d() {
            ComponentCallbacks componentCallbacks = this.f7563h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(Handler.class), this.f7564i, this.f7565j);
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class b extends l implements kotlin.e0.c.a<b> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f7566h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7567i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7568j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7566h = vVar;
            this.f7567i = aVar;
            this.f7568j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.smartworkspace.app.screens.locker.delete.b] */
        /* renamed from: a */
        public final b d() {
            return m.a.b.a.d.a.b.b(this.f7566h, v.b(b.class), this.f7567i, this.f7568j);
        }
    }

    /* compiled from: LockerDeleteBookingFragment.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LockerDeleteBookingFragment.kt */
    static final class d extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LockerDeleteBookingFragment f7569h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LockerDeleteBookingFragment lockerDeleteBookingFragment) {
            super(0);
            this.f7569h = lockerDeleteBookingFragment;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(this.f7569h.a0());
        }
    }

    /* compiled from: LockerDeleteBookingFragment.kt */
    static final class e<T> implements f0<g.e.h.a.a<? extends p>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ LockerDeleteBookingFragment f7570g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f7571h;

        /* compiled from: LockerDeleteBookingFragment.kt */
        static final class a extends l implements kotlin.e0.c.l<p, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ e f7572h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.f7572h = eVar;
            }

            public final void a(p pVar) {
                k.e(pVar, "navDirections");
                e eVar = this.f7572h;
                eVar.f7570g.W1(eVar.f7571h, pVar);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((p) obj);
                return x.a;
            }
        }

        e(LockerDeleteBookingFragment lockerDeleteBookingFragment, long j2) {
            this.f7570g = lockerDeleteBookingFragment;
            this.f7571h = j2;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<? extends p> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: LockerDeleteBookingFragment.kt */
    static final class f implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ LockerDeleteBookingFragment f7573g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p f7574h;

        f(LockerDeleteBookingFragment lockerDeleteBookingFragment, p pVar) {
            this.f7573g = lockerDeleteBookingFragment;
            this.f7574h = pVar;
        }

        public final void run() {
            androidx.navigation.fragment.a.a(this.f7573g).s(this.f7574h);
        }
    }

    static {
        new c((DefaultConstructorMarker) null);
    }

    private final Handler U1() {
        return (Handler) this.f0.getValue();
    }

    private final b V1() {
        return (b) this.e0.getValue();
    }

    /* access modifiers changed from: private */
    public final void W1(long j2, p pVar) {
        U1().postDelayed(new f(this, pVar), (j2 + 2000) - g.e.h.b.c.b.c());
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        e0 e0Var = (e0) R1(R.layout.frag_locker_delete_booking, viewGroup);
        View s = e0Var.s();
        k.d(s, "bind.root");
        com.sensorberg.smartworkspace.app.screens.locker.a.a(this, s);
        com.sensorberg.smartworkspace.app.screens.locker.opening.a aVar = com.sensorberg.smartworkspace.app.screens.locker.opening.a.a;
        ImageView imageView = e0Var.v;
        k.d(imageView, "bind.lockerImageFront");
        aVar.h(imageView);
        V1().t().o(a0(), new e(this, g.e.h.b.c.b.c()));
        return e0Var.s();
    }

    public /* synthetic */ void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.g0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}

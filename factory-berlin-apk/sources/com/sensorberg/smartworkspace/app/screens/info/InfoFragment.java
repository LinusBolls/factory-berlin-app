package com.sensorberg.smartworkspace.app.screens.info;

import android.app.NotificationManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.k.o;
import com.sensorberg.smartworkspace.app.utils.n;
import java.util.HashMap;
import kotlin.e;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

@i(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0004R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/info/InfoFragment;", "Lcom/sensorberg/smartworkspace/app/a;", "", "cancelAllNotifications", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "hidden", "onHiddenChanged", "(Z)V", "onPause", "onStart", "Lcom/sensorberg/smartworkspace/app/utils/ShowNotificationFlag;", "showNotification$delegate", "Lkotlin/Lazy;", "getShowNotification", "()Lcom/sensorberg/smartworkspace/app/utils/ShowNotificationFlag;", "showNotification", "Lcom/sensorberg/smartworkspace/app/screens/info/InfoViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/sensorberg/smartworkspace/app/screens/info/InfoViewModel;", "viewModel", "<init>", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: InfoFragment.kt */
public final class InfoFragment extends com.sensorberg.smartworkspace.app.a {
    private final e e0 = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private final e f0 = g.a(new b(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private HashMap g0;

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<n> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f7490h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7491i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7492j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7490h = componentCallbacks;
            this.f7491i = aVar;
            this.f7492j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.sensorberg.smartworkspace.app.utils.n] */
        public final n d() {
            ComponentCallbacks componentCallbacks = this.f7490h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(n.class), this.f7491i, this.f7492j);
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class b extends l implements kotlin.e0.c.a<h> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f7493h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7494i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7495j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7493h = vVar;
            this.f7494i = aVar;
            this.f7495j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.smartworkspace.app.screens.info.h] */
        /* renamed from: a */
        public final h d() {
            return m.a.b.a.d.a.b.b(this.f7493h, v.b(h.class), this.f7494i, this.f7495j);
        }
    }

    /* compiled from: InfoFragment.kt */
    static final class c<T> implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        public static final c f7496g = new c();

        c() {
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
        }
    }

    private final void T1() {
        n.a.a.a("cancel all notifications", new Object[0]);
        Context C = C();
        Object systemService = C != null ? C.getSystemService("notification") : null;
        if (systemService != null) {
            ((NotificationManager) systemService).cancelAll();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    private final n U1() {
        return (n) this.e0.getValue();
    }

    private final h V1() {
        return (h) this.f0.getValue();
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        o oVar = (o) com.sensorberg.smartworkspace.app.a.S1(this, R.layout.frag_info, (ViewGroup) null, 2, (Object) null);
        oVar.M(V1());
        RecyclerView recyclerView = oVar.v;
        k.d(recyclerView, "binding.recycler");
        recyclerView.setLayoutManager(new LinearLayoutManager(C()));
        b bVar = new b((c) m.a.a.a.a.a.a(this).d().e(v.b(c.class), (m.a.c.j.a) null, (kotlin.e0.c.a<m.a.c.i.a>) null));
        RecyclerView recyclerView2 = oVar.v;
        k.d(recyclerView2, "binding.recycler");
        recyclerView2.setAdapter(bVar);
        V1().u().o(a0(), bVar);
        return oVar.s();
    }

    public /* synthetic */ void D0() {
        super.D0();
        Q1();
    }

    public void G0(boolean z) {
        super.G0(z);
        U1().u(Boolean.valueOf(z));
        if (z) {
            V1().v();
        } else {
            T1();
        }
    }

    public void M0() {
        if (o0()) {
            V1().v();
        }
        super.M0();
    }

    public void Q1() {
        HashMap hashMap = this.g0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void T0() {
        U1().u(Boolean.valueOf(f0()));
        super.T0();
        T1();
    }

    public void w0(Bundle bundle) {
        super.w0(bundle);
        U1().o(this, c.f7496g);
    }
}

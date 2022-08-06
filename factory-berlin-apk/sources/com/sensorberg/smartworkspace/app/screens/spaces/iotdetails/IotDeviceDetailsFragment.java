package com.sensorberg.smartworkspace.app.screens.spaces.iotdetails;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f0;
import androidx.navigation.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.k.u;
import java.util.HashMap;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;

@i(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\rJ-\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/spaces/iotdetails/IotDeviceDetailsFragment;", "Lcom/sensorberg/smartworkspace/app/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "()V", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "<init>", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: IotDeviceDetailsFragment.kt */
public final class IotDeviceDetailsFragment extends com.sensorberg.smartworkspace.app.a {
    private ValueAnimator e0;
    private HashMap f0;

    /* compiled from: FragmentNavArgsLazy.kt */
    public static final class a extends l implements kotlin.e0.c.a<Bundle> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f7909h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f7909h = fragment;
        }

        /* renamed from: a */
        public final Bundle d() {
            Bundle A = this.f7909h.A();
            if (A != null) {
                return A;
            }
            throw new IllegalStateException("Fragment " + this.f7909h + " has null arguments");
        }
    }

    /* compiled from: IotDeviceDetailsFragment.kt */
    static final class b implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ IotDeviceDetailsFragment f7910g;

        b(IotDeviceDetailsFragment iotDeviceDetailsFragment) {
            this.f7910g = iotDeviceDetailsFragment;
        }

        public final void onClick(View view) {
            androidx.navigation.fragment.a.a(this.f7910g).t();
        }
    }

    /* compiled from: IotDeviceDetailsFragment.kt */
    static final class c<T> implements f0<List<? extends e>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f7911g;

        c(a aVar) {
            this.f7911g = aVar;
        }

        /* renamed from: a */
        public final void k(List<? extends e> list) {
            this.f7911g.K(list);
        }
    }

    /* compiled from: IotDeviceDetailsFragment.kt */
    static final class d<T> implements f0<g.e.h.a.a<? extends String>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Context f7912g;

        /* compiled from: IotDeviceDetailsFragment.kt */
        static final class a extends l implements kotlin.e0.c.l<String, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ d f7913h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(1);
                this.f7913h = dVar;
            }

            public final void a(String str) {
                k.e(str, "it");
                Toast.makeText(this.f7913h.f7912g, str, 1).show();
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((String) obj);
                return x.a;
            }
        }

        d(Context context) {
            this.f7912g = context;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<String> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: IotDeviceDetailsFragment.kt */
    static final class e extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f7914h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ kotlin.h0.f f7915i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar, kotlin.h0.f fVar2) {
            super(0);
            this.f7914h = fVar;
            this.f7915i = fVar2;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(((b) this.f7914h.getValue()).a(), ((b) this.f7914h.getValue()).b(), ((b) this.f7914h.getValue()).c());
        }
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        u uVar = (u) com.sensorberg.smartworkspace.app.a.S1(this, R.layout.frag_iotdevice_details, (ViewGroup) null, 2, (Object) null);
        ValueAnimator a2 = com.sensorberg.smartworkspace.app.widgets.f.f8059f.a();
        this.e0 = a2;
        d dVar = (d) m.a.b.a.d.a.b.b(this, v.b(d.class), (m.a.c.j.a) null, new e(new f(v.b(b.class), new a(this)), (kotlin.h0.f) null));
        a aVar = new a(dVar, a2);
        Context x1 = x1();
        k.d(x1, "requireContext()");
        RecyclerView recyclerView = uVar.v;
        k.d(recyclerView, "binding.recycler");
        recyclerView.setLayoutManager(new LinearLayoutManager(x1));
        RecyclerView recyclerView2 = uVar.v;
        k.d(recyclerView2, "binding.recycler");
        recyclerView2.setAdapter(aVar);
        uVar.v.addItemDecoration(new c(x1));
        uVar.w.setNavigationOnClickListener(new b(this));
        dVar.x().o(a0(), new c(aVar));
        dVar.y().o(a0(), new d(x1));
        return uVar.s();
    }

    public void D0() {
        ValueAnimator valueAnimator = this.e0;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimator2 = this.e0;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        this.e0 = null;
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}

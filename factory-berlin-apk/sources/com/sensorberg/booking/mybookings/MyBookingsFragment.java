package com.sensorberg.booking.mybookings;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f0;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;
import org.threeten.bp.LocalDate;

@i(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b#\u0010\u0013J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/sensorberg/booking/mybookings/MyBookingsFragment;", "Lcom/sensorberg/booking/mybookings/b;", "Landroidx/fragment/app/Fragment;", "", "unitId", "unitName", "", "onBookingItemClicked", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "()V", "onStart", "Lcom/sensorberg/booking/databinding/MyBookingsBinding;", "binding", "Lcom/sensorberg/booking/databinding/MyBookingsBinding;", "Lcom/sensorberg/core/Navigator;", "navigator$delegate", "Lkotlin/Lazy;", "getNavigator", "()Lcom/sensorberg/core/Navigator;", "navigator", "Lcom/sensorberg/booking/mybookings/MyBookingsViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/sensorberg/booking/mybookings/MyBookingsViewModel;", "viewModel", "<init>", "feature-booking_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: MyBookingsFragment.kt */
public final class MyBookingsFragment extends Fragment implements b {
    private final kotlin.e d0 = g.a(new b(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private final kotlin.e e0 = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private HashMap f0;

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<g.e.d.g> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f4838h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f4839i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f4840j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f4838h = componentCallbacks;
            this.f4839i = aVar;
            this.f4840j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, g.e.d.g] */
        public final g.e.d.g d() {
            ComponentCallbacks componentCallbacks = this.f4838h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(g.e.d.g.class), this.f4839i, this.f4840j);
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class b extends l implements kotlin.e0.c.a<j> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f4841h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f4842i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f4843j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f4841h = vVar;
            this.f4842i = aVar;
            this.f4843j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.booking.mybookings.j] */
        /* renamed from: a */
        public final j d() {
            return m.a.b.a.d.a.b.b(this.f4841h, v.b(j.class), this.f4842i, this.f4843j);
        }
    }

    /* compiled from: MyBookingsFragment.kt */
    static final class c implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ MyBookingsFragment f4844g;

        c(MyBookingsFragment myBookingsFragment) {
            this.f4844g = myBookingsFragment;
        }

        public final void onClick(View view) {
            this.f4844g.T1().a(androidx.navigation.fragment.a.a(this.f4844g));
        }
    }

    /* compiled from: MyBookingsFragment.kt */
    static final class d implements SwipeRefreshLayout.j {
        final /* synthetic */ MyBookingsFragment a;

        d(MyBookingsFragment myBookingsFragment) {
            this.a = myBookingsFragment;
        }

        public final void a() {
            this.a.U1().E();
        }
    }

    /* compiled from: MyBookingsFragment.kt */
    static final class e<T> implements f0<e.p.h<d>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g.e.b.i.g f4845g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f4846h;

        e(g.e.b.i.g gVar, a aVar) {
            this.f4845g = gVar;
            this.f4846h = aVar;
        }

        /* renamed from: a */
        public final void k(e.p.h<d> hVar) {
            SwipeRefreshLayout swipeRefreshLayout = this.f4845g.f9733e;
            k.d(swipeRefreshLayout, "binding.swiperefresh");
            swipeRefreshLayout.setRefreshing(false);
            this.f4846h.L(hVar);
        }
    }

    /* compiled from: MyBookingsFragment.kt */
    static final class f<T> implements f0<g.e.h.a.a<? extends Integer>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Context f4847g;

        /* compiled from: MyBookingsFragment.kt */
        static final class a extends l implements kotlin.e0.c.l<Integer, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ f f4848h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(1);
                this.f4848h = fVar;
            }

            public final void a(int i2) {
                Toast.makeText(this.f4848h.f4847g, i2, 1).show();
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a(((Number) obj).intValue());
                return x.a;
            }
        }

        f(Context context) {
            this.f4847g = context;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<Integer> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: MyBookingsFragment.kt */
    public static final class g extends RecyclerView.i {
        private final Handler a = new Handler(Looper.getMainLooper());
        private final kotlin.e0.c.a<x> b = new a(this);
        final /* synthetic */ g.e.b.i.g c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f4849d;

        /* compiled from: MyBookingsFragment.kt */
        static final class a extends l implements kotlin.e0.c.a<x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ g f4850h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(0);
                this.f4850h = gVar;
            }

            public final void a() {
                TextView textView = this.f4850h.c.b;
                k.d(textView, "binding.emptyText");
                textView.setVisibility(this.f4850h.f4849d.d() == 0 ? 0 : 8);
            }

            public /* bridge */ /* synthetic */ Object d() {
                a();
                return x.a;
            }
        }

        g(g.e.b.i.g gVar, a aVar) {
            this.c = gVar;
            this.f4849d = aVar;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.booking.mybookings.i] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(int r3, int r4) {
            /*
                r2 = this;
                super.d(r3, r4)
                android.os.Handler r3 = r2.a
                kotlin.e0.c.a<kotlin.x> r4 = r2.b
                if (r4 == 0) goto L_0x000f
                com.sensorberg.booking.mybookings.i r0 = new com.sensorberg.booking.mybookings.i
                r0.<init>(r4)
                r4 = r0
            L_0x000f:
                java.lang.Runnable r4 = (java.lang.Runnable) r4
                r0 = 500(0x1f4, double:2.47E-321)
                r3.postDelayed(r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.booking.mybookings.MyBookingsFragment.g.d(int, int):void");
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.booking.mybookings.i] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void f(int r3, int r4) {
            /*
                r2 = this;
                super.f(r3, r4)
                android.os.Handler r3 = r2.a
                kotlin.e0.c.a<kotlin.x> r4 = r2.b
                if (r4 == 0) goto L_0x000f
                com.sensorberg.booking.mybookings.i r0 = new com.sensorberg.booking.mybookings.i
                r0.<init>(r4)
                r4 = r0
            L_0x000f:
                java.lang.Runnable r4 = (java.lang.Runnable) r4
                r0 = 500(0x1f4, double:2.47E-321)
                r3.postDelayed(r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.booking.mybookings.MyBookingsFragment.g.f(int, int):void");
        }
    }

    /* compiled from: MyBookingsFragment.kt */
    public static final class h extends k {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ MyBookingsFragment f4851k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f4852l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(MyBookingsFragment myBookingsFragment, a aVar, Context context, Context context2, a aVar2) {
            super(context2, aVar2);
            this.f4851k = myBookingsFragment;
            this.f4852l = aVar;
        }

        public void B(RecyclerView.d0 d0Var, int i2) {
            k.e(d0Var, "viewHolder");
            d M = this.f4852l.M(d0Var.j());
            if (M != null) {
                this.f4851k.U1().F(M);
            }
        }
    }

    /* access modifiers changed from: private */
    public final g.e.d.g T1() {
        return (g.e.d.g) this.e0.getValue();
    }

    /* access modifiers changed from: private */
    public final j U1() {
        return (j) this.d0.getValue();
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        g.e.b.i.g c2 = g.e.b.i.g.c(layoutInflater);
        k.d(c2, "MyBookingsBinding.inflate(inflater)");
        a aVar = new a(this);
        Context x1 = x1();
        k.d(x1, "requireContext()");
        RecyclerView recyclerView = c2.f9732d;
        k.d(recyclerView, "binding.recycler");
        recyclerView.setLayoutManager(new LinearLayoutManager(x1));
        RecyclerView recyclerView2 = c2.f9732d;
        k.d(recyclerView2, "binding.recycler");
        recyclerView2.setAdapter(aVar);
        new androidx.recyclerview.widget.k(new h(this, aVar, x1, x1, aVar)).o(c2.f9732d);
        c2.c.setOnClickListener(new c(this));
        c2.f9733e.setOnRefreshListener(new d(this));
        U1().B().o(a0(), new e(c2, aVar));
        U1().C().o(a0(), new f(x1));
        aVar.F(new g(c2, aVar));
        return c2.b();
    }

    public void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void T0() {
        super.T0();
        U1().E();
    }

    public void l(String str, String str2) {
        k.e(str, "unitId");
        k.e(str2, "unitName");
        g.e.d.g T1 = T1();
        NavController a2 = androidx.navigation.fragment.a.a(this);
        LocalDate x0 = LocalDate.x0();
        k.d(x0, "LocalDate.now()");
        T1.c(a2, str, str2, x0);
    }
}

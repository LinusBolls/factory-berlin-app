package com.sensorberg.booking.roomschedule;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.List;
import kotlin.e0.c.p;
import kotlin.jvm.internal.v;
import kotlin.x;

@kotlin.i(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u0010\u0014J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020!8B@\u0002X\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u00101\u001a\u00020-8B@\u0002X\u0002¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/sensorberg/booking/roomschedule/RoomScheduleFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable$Callback;", "drawableCallback", "Landroid/graphics/drawable/Drawable;", "createIndeterminatedDrawable", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable$Callback;)Landroid/graphics/drawable/Drawable;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "()V", "Lcom/sensorberg/booking/roomschedule/RoomScheduleAdapter;", "adapter", "Lcom/sensorberg/booking/roomschedule/RoomScheduleAdapter;", "Lcom/sensorberg/booking/roomschedule/RoomScheduleFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "getArgs", "()Lcom/sensorberg/booking/roomschedule/RoomScheduleFragmentArgs;", "args", "Lcom/sensorberg/booking/databinding/FragRoomScheduleBinding;", "binding", "Lcom/sensorberg/booking/databinding/FragRoomScheduleBinding;", "Lcom/sensorberg/core/Navigator;", "navigator$delegate", "Lkotlin/Lazy;", "getNavigator", "()Lcom/sensorberg/core/Navigator;", "navigator", "Lcom/sensorberg/booking/roomschedule/RoomScheduleAddDecorator;", "roomScheduleAddDecorator", "Lcom/sensorberg/booking/roomschedule/RoomScheduleAddDecorator;", "Lcom/sensorberg/booking/roomschedule/RoomScheduleBookingsDecorator;", "roomScheduleBookingsDecorator", "Lcom/sensorberg/booking/roomschedule/RoomScheduleBookingsDecorator;", "Lcom/sensorberg/booking/roomschedule/RoomScheduleViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/sensorberg/booking/roomschedule/RoomScheduleViewModel;", "viewModel", "<init>", "feature-booking_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: RoomScheduleFragment.kt */
public final class RoomScheduleFragment extends Fragment {
    private b d0;
    private c e0;
    private a f0;
    private final androidx.navigation.f g0 = new androidx.navigation.f(v.b(d.class), new b(this));
    private final kotlin.e h0 = g.a(new c(this, (m.a.c.j.a) null, new m(this)));
    private final kotlin.e i0 = g.a(new a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private HashMap j0;

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.a<g.e.d.g> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f4919h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f4920i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f4921j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f4919h = componentCallbacks;
            this.f4920i = aVar;
            this.f4921j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, g.e.d.g] */
        public final g.e.d.g d() {
            ComponentCallbacks componentCallbacks = this.f4919h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(g.e.d.g.class), this.f4920i, this.f4921j);
        }
    }

    /* compiled from: FragmentNavArgsLazy.kt */
    public static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.a<Bundle> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f4922h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f4922h = fragment;
        }

        /* renamed from: a */
        public final Bundle d() {
            Bundle A = this.f4922h.A();
            if (A != null) {
                return A;
            }
            throw new IllegalStateException("Fragment " + this.f4922h + " has null arguments");
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.a<g> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f4923h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f4924i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f4925j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f4923h = vVar;
            this.f4924i = aVar;
            this.f4925j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.booking.roomschedule.g] */
        /* renamed from: a */
        public final g d() {
            return m.a.b.a.d.a.b.b(this.f4923h, v.b(g.class), this.f4924i, this.f4925j);
        }
    }

    /* compiled from: RoomScheduleFragment.kt */
    static final class d<T> implements f0<Long> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ RoomScheduleFragment f4926g;

        d(RoomScheduleFragment roomScheduleFragment) {
            this.f4926g = roomScheduleFragment;
        }

        /* renamed from: a */
        public final void k(Long l2) {
            b T1 = RoomScheduleFragment.T1(this.f4926g);
            kotlin.jvm.internal.k.d(l2, "it");
            T1.y(l2.longValue());
        }
    }

    /* compiled from: RoomScheduleFragment.kt */
    static final class e extends kotlin.jvm.internal.l implements p<org.threeten.bp.e, org.threeten.bp.e, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ RoomScheduleFragment f4927h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(RoomScheduleFragment roomScheduleFragment) {
            super(2);
            this.f4927h = roomScheduleFragment;
        }

        public final void a(org.threeten.bp.e eVar, org.threeten.bp.e eVar2) {
            kotlin.jvm.internal.k.e(eVar, "startLocalDateTime");
            kotlin.jvm.internal.k.e(eVar2, "endLocalDateTime");
            this.f4927h.Y1().B(this.f4927h.W1().b(), eVar, eVar2);
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
            a((org.threeten.bp.e) obj, (org.threeten.bp.e) obj2);
            return x.a;
        }
    }

    /* compiled from: RoomScheduleFragment.kt */
    static final class f<T> implements f0<List<? extends g.e.n.c.h.a>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g.e.b.i.a f4928g;

        f(g.e.b.i.a aVar) {
            this.f4928g = aVar;
        }

        /* renamed from: a */
        public final void k(List<g.e.n.c.h.a> list) {
            this.f4928g.f9728e.invalidate();
        }
    }

    /* compiled from: RoomScheduleFragment.kt */
    static final class g implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ RoomScheduleFragment f4929g;

        g(RoomScheduleFragment roomScheduleFragment) {
            this.f4929g = roomScheduleFragment;
        }

        public final void onClick(View view) {
            this.f4929g.X1().d(androidx.navigation.fragment.a.a(this.f4929g), this.f4929g.W1().b());
        }
    }

    /* compiled from: RoomScheduleFragment.kt */
    static final class h implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ RoomScheduleFragment f4930g;

        h(RoomScheduleFragment roomScheduleFragment) {
            this.f4930g = roomScheduleFragment;
        }

        public final void onClick(View view) {
            androidx.navigation.fragment.a.a(this.f4930g).t();
        }
    }

    /* compiled from: RoomScheduleFragment.kt */
    static final class i extends kotlin.jvm.internal.l implements kotlin.e0.c.a<Boolean> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ RoomScheduleFragment f4931h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g.e.b.i.a f4932i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(RoomScheduleFragment roomScheduleFragment, g.e.b.i.a aVar) {
            super(0);
            this.f4931h = roomScheduleFragment;
            this.f4932i = aVar;
        }

        public final boolean a() {
            if (!RoomScheduleFragment.T1(this.f4931h).u()) {
                return false;
            }
            b T1 = RoomScheduleFragment.T1(this.f4931h);
            RecyclerView recyclerView = this.f4932i.f9728e;
            kotlin.jvm.internal.k.d(recyclerView, "binding.recycler");
            T1.o(recyclerView);
            return true;
        }

        public /* bridge */ /* synthetic */ Object d() {
            return Boolean.valueOf(a());
        }
    }

    /* compiled from: RoomScheduleFragment.kt */
    static final class j<T> implements f0<Integer> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g.e.b.i.a f4933g;

        j(g.e.b.i.a aVar) {
            this.f4933g = aVar;
        }

        /* renamed from: a */
        public final void k(Integer num) {
            ImageView imageView = this.f4933g.b;
            kotlin.jvm.internal.k.d(num, "it");
            imageView.setImageResource(num.intValue());
        }
    }

    /* compiled from: RoomScheduleFragment.kt */
    static final class k<T> implements f0<g.e.h.a.a<? extends Integer>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Context f4934g;

        /* compiled from: RoomScheduleFragment.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<Integer, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ k f4935h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(k kVar) {
                super(1);
                this.f4935h = kVar;
            }

            public final void a(int i2) {
                Toast.makeText(this.f4935h.f4934g, i2, 0).show();
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a(((Number) obj).intValue());
                return x.a;
            }
        }

        k(Context context) {
            this.f4934g = context;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<Integer> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: RoomScheduleFragment.kt */
    static final class l<T> implements f0<g.e.h.a.a<? extends Boolean>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g.e.b.i.a f4936g;

        /* compiled from: RoomScheduleFragment.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<Boolean, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ l f4937h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(l lVar) {
                super(1);
                this.f4937h = lVar;
            }

            public final void a(boolean z) {
                FrameLayout frameLayout = this.f4937h.f4936g.f9727d;
                kotlin.jvm.internal.k.d(frameLayout, "binding.progress");
                frameLayout.setVisibility(z ? 0 : 8);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a(((Boolean) obj).booleanValue());
                return x.a;
            }
        }

        l(g.e.b.i.a aVar) {
            this.f4936g = aVar;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<Boolean> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: RoomScheduleFragment.kt */
    static final class m extends kotlin.jvm.internal.l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ RoomScheduleFragment f4938h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(RoomScheduleFragment roomScheduleFragment) {
            super(0);
            this.f4938h = roomScheduleFragment;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(this.f4938h.W1().a(), this.f4938h.W1().b());
        }
    }

    public static final /* synthetic */ b T1(RoomScheduleFragment roomScheduleFragment) {
        b bVar = roomScheduleFragment.d0;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.k.q("roomScheduleAddDecorator");
        throw null;
    }

    private final Drawable V1(Context context, Drawable.Callback callback) {
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        kotlin.jvm.internal.k.d(indeterminateDrawable, "indeterminateDrawable");
        indeterminateDrawable.setCallback(callback);
        return indeterminateDrawable;
    }

    /* access modifiers changed from: private */
    public final d W1() {
        return (d) this.g0.getValue();
    }

    /* access modifiers changed from: private */
    public final g.e.d.g X1() {
        return (g.e.d.g) this.i0.getValue();
    }

    /* access modifiers changed from: private */
    public final g Y1() {
        return (g) this.h0.getValue();
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.k.e(layoutInflater, "inflater");
        g.e.b.i.a c2 = g.e.b.i.a.c(layoutInflater);
        kotlin.jvm.internal.k.d(c2, "FragRoomScheduleBinding.inflate(inflater)");
        Context x1 = x1();
        kotlin.jvm.internal.k.d(x1, "requireContext()");
        RecyclerView recyclerView = c2.f9728e;
        kotlin.jvm.internal.k.d(recyclerView, "binding.recycler");
        this.d0 = new b(x1, V1(x1, recyclerView), new e(this));
        this.e0 = new c(x1);
        b bVar = this.d0;
        if (bVar != null) {
            this.f0 = new a(bVar);
            RecyclerView recyclerView2 = c2.f9728e;
            kotlin.jvm.internal.k.d(recyclerView2, "binding.recycler");
            recyclerView2.setLayoutManager(new LinearLayoutManager(x1));
            RecyclerView recyclerView3 = c2.f9728e;
            kotlin.jvm.internal.k.d(recyclerView3, "binding.recycler");
            a aVar = this.f0;
            if (aVar != null) {
                recyclerView3.setAdapter(aVar);
                RecyclerView recyclerView4 = c2.f9728e;
                c cVar = this.e0;
                if (cVar != null) {
                    recyclerView4.addItemDecoration(cVar);
                    RecyclerView recyclerView5 = c2.f9728e;
                    b bVar2 = this.d0;
                    if (bVar2 != null) {
                        recyclerView5.addItemDecoration(bVar2);
                        RecyclerView recyclerView6 = c2.f9728e;
                        b bVar3 = this.d0;
                        if (bVar3 != null) {
                            recyclerView6.addOnItemTouchListener(bVar3);
                            LiveData<g.e.d.e> F = Y1().F();
                            androidx.lifecycle.v a0 = a0();
                            a aVar2 = this.f0;
                            if (aVar2 != null) {
                                F.o(a0, aVar2);
                                LiveData<List<g.e.n.c.h.a>> J = Y1().J();
                                androidx.lifecycle.v a02 = a0();
                                c cVar2 = this.e0;
                                if (cVar2 != null) {
                                    J.o(a02, cVar2);
                                    androidx.lifecycle.v a03 = a0();
                                    b bVar4 = this.d0;
                                    if (bVar4 != null) {
                                        J.o(a03, bVar4);
                                        J.o(a0(), new f(c2));
                                        c2.c.setOnClickListener(new g(this));
                                        c2.f9729f.setNavigationOnClickListener(new h(this));
                                        CoordinatorLayout b2 = c2.b();
                                        kotlin.jvm.internal.k.d(b2, "binding.root");
                                        g.e.d.b.a(b2, new i(this, c2));
                                        FrameLayout frameLayout = c2.f9727d;
                                        Resources resources = x1.getResources();
                                        frameLayout.setPadding(frameLayout.getPaddingLeft(), (resources.getDisplayMetrics().heightPixels - resources.getDimensionPixelSize(g.e.b.c.collapsing_header_height)) / 3, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
                                        Y1().C().o(a0(), new j(c2));
                                        Y1().H().o(a0(), new k(x1));
                                        Y1().I().o(a0(), new l(c2));
                                        Y1().E().o(a0(), new d(this));
                                        TextView textView = c2.f9730g;
                                        kotlin.jvm.internal.k.d(textView, "binding.unitName");
                                        textView.setText(W1().c());
                                        return c2.b();
                                    }
                                    kotlin.jvm.internal.k.q("roomScheduleAddDecorator");
                                    throw null;
                                }
                                kotlin.jvm.internal.k.q("roomScheduleBookingsDecorator");
                                throw null;
                            }
                            kotlin.jvm.internal.k.q("adapter");
                            throw null;
                        }
                        kotlin.jvm.internal.k.q("roomScheduleAddDecorator");
                        throw null;
                    }
                    kotlin.jvm.internal.k.q("roomScheduleAddDecorator");
                    throw null;
                }
                kotlin.jvm.internal.k.q("roomScheduleBookingsDecorator");
                throw null;
            }
            kotlin.jvm.internal.k.q("adapter");
            throw null;
        }
        kotlin.jvm.internal.k.q("roomScheduleAddDecorator");
        throw null;
    }

    public void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.j0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}

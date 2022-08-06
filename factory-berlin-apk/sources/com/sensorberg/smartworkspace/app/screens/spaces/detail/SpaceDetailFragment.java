package com.sensorberg.smartworkspace.app.screens.spaces.detail;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.k.i1;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.p;
import java.util.HashMap;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0000\n\u0000\n\u0000\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0007¢\u0006\u0004\bA\u0010\u0018J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\u0018J\u001f\u0010*\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u00100\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u0010:\u001a\u0002058B@\u0002X\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010@\u001a\u00020;8B@\u0002X\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/spaces/detail/SpaceDetailFragment;", "com/sensorberg/smartworkspace/app/screens/spaces/detail/p$d$b$a", "com/sensorberg/smartworkspace/app/screens/spaces/detail/p$e$c", "com/sensorberg/smartworkspace/app/screens/spaces/detail/p$a$b", "com/sensorberg/smartworkspace/app/screens/spaces/detail/p$e$d$a", "com/sensorberg/smartworkspace/app/screens/spaces/detail/p$e$b$a", "com/sensorberg/smartworkspace/app/screens/spaces/detail/p$f$a", "com/sensorberg/smartworkspace/app/screens/spaces/detail/p$d$a$a", "Lcom/sensorberg/smartworkspace/app/a;", "Lcom/sensorberg/smartworkspace/app/screens/spaces/detail/Widget$Row$IconRowButton;", "iconRowButton", "", "onButtonClicked", "(Lcom/sensorberg/smartworkspace/app/screens/spaces/detail/Widget$Row$IconRowButton;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "()V", "Lcom/sensorberg/smartworkspace/app/screens/spaces/detail/Widget$DetailsButtonRow;", "item", "onDetailsClicked", "(Lcom/sensorberg/smartworkspace/app/screens/spaces/detail/Widget$DetailsButtonRow;)V", "Lcom/sensorberg/smartworkspace/app/screens/spaces/detail/Widget$Row;", "row", "onIconRowClicked", "(Lcom/sensorberg/smartworkspace/app/screens/spaces/detail/Widget$Row;)V", "Lcom/sensorberg/smartworkspace/app/screens/spaces/detail/Widget$Mini$MiniIcon;", "miniIcon", "onMiniIconClicked", "(Lcom/sensorberg/smartworkspace/app/screens/spaces/detail/Widget$Mini$MiniIcon;)V", "onMoreClicked", "Lcom/sensorberg/smartworkspace/app/screens/spaces/detail/Widget$SeekBarRow;", "seekBarRow", "", "targetValue", "onSeekBarChanged", "(Lcom/sensorberg/smartworkspace/app/screens/spaces/detail/Widget$SeekBarRow;I)V", "Lcom/sensorberg/smartworkspace/app/screens/spaces/detail/Widget$Row$IconRowSwitch;", "iconRowSwitch", "", "checked", "onSwitchChanged", "(Lcom/sensorberg/smartworkspace/app/screens/spaces/detail/Widget$Row$IconRowSwitch;Z)V", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "Lcom/sensorberg/smartworkspace/app/screens/spaces/detail/SpaceDetailFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "getArgs", "()Lcom/sensorberg/smartworkspace/app/screens/spaces/detail/SpaceDetailFragmentArgs;", "args", "Lcom/sensorberg/smartworkspace/app/screens/spaces/detail/SpaceDetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/sensorberg/smartworkspace/app/screens/spaces/detail/SpaceDetailViewModel;", "viewModel", "<init>", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: SpaceDetailFragment.kt */
public final class SpaceDetailFragment extends com.sensorberg.smartworkspace.app.a implements p.d.b.a, p.e.c, p.a.b, p.e.d.a, p.e.b.a, p.f.a, p.d.a.C0526a {
    private final androidx.navigation.f e0 = new androidx.navigation.f(v.b(i.class), new a(this));
    private final kotlin.e f0 = g.a(new b(this, (m.a.c.j.a) null, new h(this)));
    private ValueAnimator g0;
    private HashMap h0;

    /* compiled from: FragmentNavArgsLazy.kt */
    public static final class a extends l implements kotlin.e0.c.a<Bundle> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f7808h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f7808h = fragment;
        }

        /* renamed from: a */
        public final Bundle d() {
            Bundle A = this.f7808h.A();
            if (A != null) {
                return A;
            }
            throw new IllegalStateException("Fragment " + this.f7808h + " has null arguments");
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class b extends l implements kotlin.e0.c.a<l> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f7809h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7810i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7811j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7809h = vVar;
            this.f7810i = aVar;
            this.f7811j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.smartworkspace.app.screens.spaces.detail.l] */
        /* renamed from: a */
        public final l d() {
            return m.a.b.a.d.a.b.b(this.f7809h, v.b(l.class), this.f7810i, this.f7811j);
        }
    }

    /* compiled from: SpaceDetailFragment.kt */
    static final class c<T> implements f0<List<? extends p>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f7812g;

        c(h hVar) {
            this.f7812g = hVar;
        }

        /* renamed from: a */
        public final void k(List<? extends p> list) {
            this.f7812g.K(list);
        }
    }

    /* compiled from: SpaceDetailFragment.kt */
    static final class d<T> implements f0<g.e.h.a.a<? extends Integer>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SpaceDetailFragment f7813g;

        /* compiled from: SpaceDetailFragment.kt */
        static final class a extends l implements kotlin.e0.c.l<Integer, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ d f7814h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(1);
                this.f7814h = dVar;
            }

            public final void a(int i2) {
                Toast.makeText(this.f7814h.f7813g.C(), i2, 0).show();
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a(((Number) obj).intValue());
                return x.a;
            }
        }

        d(SpaceDetailFragment spaceDetailFragment) {
            this.f7813g = spaceDetailFragment;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<Integer> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: SpaceDetailFragment.kt */
    static final class e<T> implements f0<g.e.h.a.a<? extends String>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SpaceDetailFragment f7815g;

        /* compiled from: SpaceDetailFragment.kt */
        static final class a extends l implements kotlin.e0.c.l<String, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ e f7816h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.f7816h = eVar;
            }

            public final void a(String str) {
                k.e(str, "message");
                Toast.makeText(this.f7816h.f7815g.C(), str, 0).show();
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((String) obj);
                return x.a;
            }
        }

        e(SpaceDetailFragment spaceDetailFragment) {
            this.f7815g = spaceDetailFragment;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<String> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: SpaceDetailFragment.kt */
    static final class f<T> implements f0<g.e.h.a.a<? extends androidx.navigation.p>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SpaceDetailFragment f7817g;

        /* compiled from: SpaceDetailFragment.kt */
        static final class a extends l implements kotlin.e0.c.l<androidx.navigation.p, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ f f7818h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(1);
                this.f7818h = fVar;
            }

            public final void a(androidx.navigation.p pVar) {
                k.e(pVar, "navDirections");
                androidx.navigation.fragment.a.a(this.f7818h.f7817g).s(pVar);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((androidx.navigation.p) obj);
                return x.a;
            }
        }

        f(SpaceDetailFragment spaceDetailFragment) {
            this.f7817g = spaceDetailFragment;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<? extends androidx.navigation.p> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: SpaceDetailFragment.kt */
    static final class g implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ SpaceDetailFragment f7819g;

        g(SpaceDetailFragment spaceDetailFragment) {
            this.f7819g = spaceDetailFragment;
        }

        public final void onClick(View view) {
            androidx.navigation.fragment.a.a(this.f7819g).t();
        }
    }

    /* compiled from: SpaceDetailFragment.kt */
    static final class h extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ SpaceDetailFragment f7820h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(SpaceDetailFragment spaceDetailFragment) {
            super(0);
            this.f7820h = spaceDetailFragment;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(this.f7820h.U1().a(), this.f7820h.U1().b());
        }
    }

    /* access modifiers changed from: private */
    public final i U1() {
        return (i) this.e0.getValue();
    }

    private final l V1() {
        return (l) this.f0.getValue();
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        i1 i1Var = (i1) com.sensorberg.smartworkspace.app.a.S1(this, R.layout.fragment_spaces_detail, (ViewGroup) null, 2, (Object) null);
        ValueAnimator a2 = com.sensorberg.smartworkspace.app.widgets.f.f8059f.a();
        this.g0 = a2;
        h hVar = new h(a2, this, this, this, this, this, this, this);
        m mVar = m.a;
        Resources R = R();
        k.d(R, "resources");
        int b2 = m.b(mVar, R, R.dimen.iot_device_status_width, 0.95f, 0, 8, (Object) null);
        V1().K(b2);
        V1().G().o(a0(), new c(hVar));
        V1().E().o(a0(), new d(this));
        V1().D().o(a0(), new e(this));
        V1().F().o(a0(), new f(this));
        i1Var.w.setNavigationOnClickListener(new g(this));
        RecyclerView recyclerView = i1Var.v;
        k.d(recyclerView, "this");
        recyclerView.setAdapter(hVar);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), b2);
        gridLayoutManager.h3(new b(hVar, b2));
        x xVar = x.a;
        recyclerView.setLayoutManager(gridLayoutManager);
        Context context = recyclerView.getContext();
        k.d(context, "context");
        recyclerView.addItemDecoration(new k(context, b2));
        return i1Var.s();
    }

    public void D0() {
        super.D0();
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimator2 = this.g0;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        this.g0 = null;
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.h0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void b(p.e eVar) {
        k.e(eVar, "row");
        V1().b(eVar);
    }

    public void e(p.e.d dVar, boolean z) {
        k.e(dVar, "iconRowSwitch");
        V1().e(dVar, z);
    }

    public void f(p.d.a aVar) {
        k.e(aVar, "miniIcon");
        V1().f(aVar);
    }

    public void g(p.a aVar) {
        k.e(aVar, "item");
        V1().g(aVar);
    }

    public void m() {
        V1().m();
    }

    public void p(p.e.b bVar) {
        k.e(bVar, "iconRowButton");
        V1().p(bVar);
    }

    public void q(p.f fVar, int i2) {
        k.e(fVar, "seekBarRow");
        V1().q(fVar, i2);
    }
}

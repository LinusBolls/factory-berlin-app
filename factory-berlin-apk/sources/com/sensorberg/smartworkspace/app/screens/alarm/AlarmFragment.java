package com.sensorberg.smartworkspace.app.screens.alarm;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.k.c1;
import e.h.k.r;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;

@kotlin.i(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/alarm/AlarmFragment;", "Lcom/sensorberg/smartworkspace/app/a;", "", "destroyAlertDialog", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "Landroidx/appcompat/app/AlertDialog;", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "Lcom/sensorberg/smartworkspace/app/screens/alarm/AlarmFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "getArgs", "()Lcom/sensorberg/smartworkspace/app/screens/alarm/AlarmFragmentArgs;", "args", "Landroid/os/Handler;", "lifecycleHandler$delegate", "Lkotlin/Lazy;", "getLifecycleHandler", "()Landroid/os/Handler;", "lifecycleHandler", "Lcom/sensorberg/smartworkspace/app/screens/alarm/AlarmViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/sensorberg/smartworkspace/app/screens/alarm/AlarmViewModel;", "viewModel", "<init>", "Companion", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: AlarmFragment.kt */
public final class AlarmFragment extends com.sensorberg.smartworkspace.app.a {
    public static final d j0 = new d((DefaultConstructorMarker) null);
    private final androidx.navigation.f e0 = new androidx.navigation.f(v.b(e.class), new b(this));
    private final kotlin.e f0 = g.a(new c(this, (m.a.c.j.a) null, new j(this)));
    private final kotlin.e g0 = g.a(new a(this, (m.a.c.j.a) null, new e(this)));
    /* access modifiers changed from: private */
    public androidx.appcompat.app.b h0;
    private HashMap i0;

    /* compiled from: ComponentCallbackExt.kt */
    public static final class a extends l implements kotlin.e0.c.a<Handler> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ComponentCallbacks f7293h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7294i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7295j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7293h = componentCallbacks;
            this.f7294i = aVar;
            this.f7295j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [android.os.Handler, java.lang.Object] */
        public final Handler d() {
            ComponentCallbacks componentCallbacks = this.f7293h;
            return m.a.a.a.a.a.a(componentCallbacks).d().e(v.b(Handler.class), this.f7294i, this.f7295j);
        }
    }

    /* compiled from: FragmentNavArgsLazy.kt */
    public static final class b extends l implements kotlin.e0.c.a<Bundle> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f7296h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f7296h = fragment;
        }

        /* renamed from: a */
        public final Bundle d() {
            Bundle A = this.f7296h.A();
            if (A != null) {
                return A;
            }
            throw new IllegalStateException("Fragment " + this.f7296h + " has null arguments");
        }
    }

    /* compiled from: LifecycleOwnerExt.kt */
    public static final class c extends l implements kotlin.e0.c.a<l> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.v f7297h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7298i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7299j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(androidx.lifecycle.v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7297h = vVar;
            this.f7298i = aVar;
            this.f7299j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.n0, com.sensorberg.smartworkspace.app.screens.alarm.l] */
        /* renamed from: a */
        public final l d() {
            return m.a.b.a.d.a.b.b(this.f7297h, v.b(l.class), this.f7298i, this.f7299j);
        }
    }

    /* compiled from: AlarmFragment.kt */
    public static final class d {

        /* compiled from: AlarmFragment.kt */
        static final class a implements DialogInterface.OnClickListener {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ l f7300g;

            a(l lVar) {
                this.f7300g = lVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f7300g.B();
            }
        }

        /* compiled from: AlarmFragment.kt */
        static final class b implements DialogInterface.OnCancelListener {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ l f7301g;

            b(l lVar) {
                this.f7301g = lVar;
            }

            public final void onCancel(DialogInterface dialogInterface) {
                this.f7301g.B();
            }
        }

        private d() {
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [com.sensorberg.smartworkspace.app.screens.alarm.d] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.appcompat.app.b a(android.content.Context r3, com.sensorberg.smartworkspace.app.screens.alarm.l r4) {
            /*
                r2 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.k.e(r3, r0)
                java.lang.String r0 = "viewModel"
                kotlin.jvm.internal.k.e(r4, r0)
                androidx.appcompat.app.b$a r0 = new androidx.appcompat.app.b$a
                r0.<init>(r3)
                r3 = 2131820658(0x7f110072, float:1.9274037E38)
                r0.h(r3)
                kotlin.e0.c.p r3 = r4.C()
                if (r3 == 0) goto L_0x0021
                com.sensorberg.smartworkspace.app.screens.alarm.d r1 = new com.sensorberg.smartworkspace.app.screens.alarm.d
                r1.<init>(r3)
                r3 = r1
            L_0x0021:
                android.content.DialogInterface$OnClickListener r3 = (android.content.DialogInterface.OnClickListener) r3
                r1 = 2131820830(0x7f11011e, float:1.9274386E38)
                r0.m(r1, r3)
                r3 = 2131820688(0x7f110090, float:1.9274098E38)
                com.sensorberg.smartworkspace.app.screens.alarm.AlarmFragment$d$a r1 = new com.sensorberg.smartworkspace.app.screens.alarm.AlarmFragment$d$a
                r1.<init>(r4)
                r0.i(r3, r1)
                com.sensorberg.smartworkspace.app.screens.alarm.AlarmFragment$d$b r3 = new com.sensorberg.smartworkspace.app.screens.alarm.AlarmFragment$d$b
                r3.<init>(r4)
                r0.k(r3)
                androidx.appcompat.app.b r3 = r0.a()
                java.lang.String r4 = "AlertDialog.Builder(cont…nDenied() }\n\t\t\t}.create()"
                kotlin.jvm.internal.k.d(r3, r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.screens.alarm.AlarmFragment.d.a(android.content.Context, com.sensorberg.smartworkspace.app.screens.alarm.l):androidx.appcompat.app.b");
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AlarmFragment.kt */
    static final class e extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ AlarmFragment f7302h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AlarmFragment alarmFragment) {
            super(0);
            this.f7302h = alarmFragment;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(this.f7302h.a0());
        }
    }

    /* compiled from: AlarmFragment.kt */
    static final class f<T> implements f0<List<? extends m>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f7303g;

        f(a aVar) {
            this.f7303g = aVar;
        }

        /* renamed from: a */
        public final void k(List<? extends m> list) {
            this.f7303g.K(list);
        }
    }

    /* compiled from: AlarmFragment.kt */
    static final class g<T> implements f0<Boolean> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ AlarmFragment f7304g;

        g(AlarmFragment alarmFragment) {
            this.f7304g = alarmFragment;
        }

        /* renamed from: a */
        public final void k(Boolean bool) {
            this.f7304g.Y1();
            k.d(bool, "it");
            if (bool.booleanValue()) {
                AlarmFragment alarmFragment = this.f7304g;
                d dVar = AlarmFragment.j0;
                Context x1 = alarmFragment.x1();
                k.d(x1, "requireContext()");
                alarmFragment.h0 = dVar.a(x1, this.f7304g.b2());
                androidx.appcompat.app.b U1 = this.f7304g.h0;
                if (U1 != null) {
                    U1.show();
                }
            }
        }
    }

    /* compiled from: AlarmFragment.kt */
    static final class h<T> implements f0<g.e.h.a.a<? extends Integer>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c1 f7305g;

        /* compiled from: AlarmFragment.kt */
        static final class a extends l implements kotlin.e0.c.l<Integer, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ h f7306h;

            /* renamed from: com.sensorberg.smartworkspace.app.screens.alarm.AlarmFragment$h$a$a  reason: collision with other inner class name */
            /* compiled from: View.kt */
            public static final class C0479a implements Runnable {

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ View f7307g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ RecyclerView f7308h;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ int f7309i;

                public C0479a(View view, RecyclerView recyclerView, int i2) {
                    this.f7307g = view;
                    this.f7308h = recyclerView;
                    this.f7309i = i2;
                }

                public final void run() {
                    this.f7308h.smoothScrollToPosition(this.f7309i);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar) {
                super(1);
                this.f7306h = hVar;
            }

            public final void a(int i2) {
                RecyclerView recyclerView = this.f7306h.f7305g.v;
                k.b(r.a(recyclerView, new C0479a(recyclerView, recyclerView, i2)), "OneShotPreDrawListener.add(this) { action(this) }");
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a(((Number) obj).intValue());
                return x.a;
            }
        }

        h(c1 c1Var) {
            this.f7305g = c1Var;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<Integer> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: AlarmFragment.kt */
    static final class i<T> implements f0<g.e.h.a.a<? extends String>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ AlarmFragment f7310g;

        /* compiled from: AlarmFragment.kt */
        static final class a extends l implements kotlin.e0.c.l<String, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ i f7311h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(i iVar) {
                super(1);
                this.f7311h = iVar;
            }

            public final void a(String str) {
                k.e(str, "message");
                Toast.makeText(this.f7311h.f7310g.C(), str, 0).show();
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((String) obj);
                return x.a;
            }
        }

        i(AlarmFragment alarmFragment) {
            this.f7310g = alarmFragment;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<String> aVar) {
            aVar.a(new a(this));
        }
    }

    /* compiled from: AlarmFragment.kt */
    static final class j extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ AlarmFragment f7312h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(AlarmFragment alarmFragment) {
            super(0);
            this.f7312h = alarmFragment;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(this.f7312h.Z1().a());
        }
    }

    /* access modifiers changed from: private */
    public final void Y1() {
        androidx.appcompat.app.b bVar = this.h0;
        if (bVar != null) {
            bVar.dismiss();
        }
        this.h0 = null;
    }

    /* access modifiers changed from: private */
    public final e Z1() {
        return (e) this.e0.getValue();
    }

    private final Handler a2() {
        return (Handler) this.g0.getValue();
    }

    /* access modifiers changed from: private */
    public final l b2() {
        return (l) this.f0.getValue();
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        c1 c1Var = (c1) R1(R.layout.fragment_alarm, viewGroup);
        a aVar = new a(b2(), a2());
        RecyclerView recyclerView = c1Var.v;
        k.d(recyclerView, "binding.recyclerview");
        recyclerView.setAdapter(aVar);
        RecyclerView recyclerView2 = c1Var.v;
        k.d(recyclerView2, "binding.recyclerview");
        recyclerView2.setLayoutManager(new GridLayoutManager(C(), 1));
        b2().G().o(a0(), new f(aVar));
        b2().F().o(a0(), new g(this));
        b2().E().o(a0(), new h(c1Var));
        b2().D().o(a0(), new i(this));
        return c1Var.s();
    }

    public void D0() {
        super.D0();
        Y1();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.i0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}

package com.sensorberg.smartworkspace.app.screens.door.e;

import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnticipateInterpolator;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.f0;
import androidx.lifecycle.v;
import androidx.navigation.p;
import com.sensorberg.core.view.IotUnitImageView;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartworkspace.app.k.w0;
import com.sensorberg.smartworkspace.app.screens.door.e.b;
import com.sensorberg.smartworkspace.app.utils.t;
import com.sensorberg.smartworkspace.app.utils.u;
import java.util.HashMap;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: NearbyUnitFragment.kt */
public final class a extends com.sensorberg.smartworkspace.app.a implements t {
    private static final long j0 = Math.max(400, 432);
    private static final b k0 = new b(32, 200, 168, new AnticipateInterpolator(), new e.m.a.a.b());
    private static final b l0 = new b(0, 232, 200, new AnticipateInterpolator(), new e.m.a.a.b());
    private final kotlin.e e0 = g.a(new C0486a(this, (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private IotUnit f0;
    private float g0;
    /* access modifiers changed from: private */
    public float h0;
    private HashMap i0;

    /* renamed from: com.sensorberg.smartworkspace.app.screens.door.e.a$a  reason: collision with other inner class name */
    /* compiled from: LifecycleOwnerExt.kt */
    public static final class C0486a extends l implements kotlin.e0.c.a<b> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ v f7388h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f7389i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7390j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0486a(v vVar, m.a.c.j.a aVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f7388h = vVar;
            this.f7389i = aVar;
            this.f7390j = aVar2;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.smartworkspace.app.screens.door.e.b, androidx.lifecycle.n0] */
        /* renamed from: a */
        public final b d() {
            return m.a.b.a.d.a.b.b(this.f7388h, kotlin.jvm.internal.v.b(b.class), this.f7389i, this.f7390j);
        }
    }

    /* compiled from: NearbyUnitFragment.kt */
    private static final class b {
        private final long a;
        private final long b;
        private final long c;

        /* renamed from: d  reason: collision with root package name */
        private final TimeInterpolator f7391d;

        /* renamed from: e  reason: collision with root package name */
        private final TimeInterpolator f7392e;

        public b(long j2, long j3, long j4, TimeInterpolator timeInterpolator, TimeInterpolator timeInterpolator2) {
            k.e(timeInterpolator, "interpolatorOut");
            k.e(timeInterpolator2, "interpolatorIn");
            this.a = j2;
            this.b = j3;
            this.c = j4;
            this.f7391d = timeInterpolator;
            this.f7392e = timeInterpolator2;
        }

        public final long a() {
            return this.c;
        }

        public final long b() {
            return this.b;
        }

        public final TimeInterpolator c() {
            return this.f7392e;
        }

        public final TimeInterpolator d() {
            return this.f7391d;
        }

        public final long e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && k.a(this.f7391d, bVar.f7391d) && k.a(this.f7392e, bVar.f7392e);
        }

        public int hashCode() {
            int a2 = ((((defpackage.c.a(this.a) * 31) + defpackage.c.a(this.b)) * 31) + defpackage.c.a(this.c)) * 31;
            TimeInterpolator timeInterpolator = this.f7391d;
            int i2 = 0;
            int hashCode = (a2 + (timeInterpolator != null ? timeInterpolator.hashCode() : 0)) * 31;
            TimeInterpolator timeInterpolator2 = this.f7392e;
            if (timeInterpolator2 != null) {
                i2 = timeInterpolator2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "AnimateParameters(startDelay=" + this.a + ", durationOut=" + this.b + ", durationIn=" + this.c + ", interpolatorOut=" + this.f7391d + ", interpolatorIn=" + this.f7392e + ")";
        }
    }

    /* compiled from: NearbyUnitFragment.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: NearbyUnitFragment.kt */
    static final class d implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f7393g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ View f7394h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.l f7395i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Object f7396j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ b f7397k;

        d(a aVar, View view, kotlin.e0.c.l lVar, Object obj, b bVar) {
            this.f7393g = aVar;
            this.f7394h = view;
            this.f7395i = lVar;
            this.f7396j = obj;
            this.f7397k = bVar;
        }

        public final void run() {
            this.f7394h.setTranslationY(this.f7393g.h0);
            this.f7395i.o(this.f7396j);
            this.f7394h.animate().setStartDelay(0).setDuration(this.f7397k.a()).setInterpolator(this.f7397k.c()).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
        }
    }

    /* compiled from: NearbyUnitFragment.kt */
    static final class e extends l implements kotlin.e0.c.l<IotUnit, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ w0 f7398h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(w0 w0Var) {
            super(1);
            this.f7398h = w0Var;
        }

        public final void a(IotUnit iotUnit) {
            k.e(iotUnit, "it");
            this.f7398h.x.setIotUnit(iotUnit);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((IotUnit) obj);
            return x.a;
        }
    }

    /* compiled from: NearbyUnitFragment.kt */
    static final class f extends l implements kotlin.e0.c.l<String, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ w0 f7399h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(w0 w0Var) {
            super(1);
            this.f7399h = w0Var;
        }

        public final void a(String str) {
            k.e(str, "it");
            TextView textView = this.f7399h.y;
            k.d(textView, "binding.text");
            textView.setText(str);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((String) obj);
            return x.a;
        }
    }

    /* compiled from: NearbyUnitFragment.kt */
    static final class g<T> implements f0<IotUnit> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f7400g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ w0 f7401h;

        g(a aVar, w0 w0Var) {
            this.f7400g = aVar;
            this.f7401h = w0Var;
        }

        /* renamed from: a */
        public final void k(IotUnit iotUnit) {
            this.f7400g.X1(iotUnit, this.f7401h);
        }
    }

    /* compiled from: NearbyUnitFragment.kt */
    static final class h<T> implements f0<g.e.h.a.a<? extends x>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f7402g;

        /* renamed from: com.sensorberg.smartworkspace.app.screens.door.e.a$h$a  reason: collision with other inner class name */
        /* compiled from: NearbyUnitFragment.kt */
        static final class C0487a extends l implements kotlin.e0.c.l<x, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ h f7403h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0487a(h hVar) {
                super(1);
                this.f7403h = hVar;
            }

            public final void a(x xVar) {
                k.e(xVar, "it");
                u.d(this.f7403h.f7402g, "tabChangeRequest", com.sensorberg.smartworkspace.app.screens.door.a.Favorites);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((x) obj);
                return x.a;
            }
        }

        h(a aVar) {
            this.f7402g = aVar;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<x> aVar) {
            aVar.a(new C0487a(this));
        }
    }

    /* compiled from: NearbyUnitFragment.kt */
    static final class i<T> implements f0<g.e.h.a.a<? extends x>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f7404g;

        /* renamed from: com.sensorberg.smartworkspace.app.screens.door.e.a$i$a  reason: collision with other inner class name */
        /* compiled from: NearbyUnitFragment.kt */
        static final class C0488a extends l implements kotlin.e0.c.l<x, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ i f7405h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0488a(i iVar) {
                super(1);
                this.f7405h = iVar;
            }

            public final void a(x xVar) {
                k.e(xVar, "it");
                Toast.makeText(this.f7405h.f7404g.C(), R.string.sdk_not_ready, 1).show();
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((x) obj);
                return x.a;
            }
        }

        i(a aVar) {
            this.f7404g = aVar;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<x> aVar) {
            aVar.a(new C0488a(this));
        }
    }

    /* compiled from: NearbyUnitFragment.kt */
    static final class j<T> implements f0<g.e.h.a.a<? extends p>> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f7406g;

        /* renamed from: com.sensorberg.smartworkspace.app.screens.door.e.a$j$a  reason: collision with other inner class name */
        /* compiled from: NearbyUnitFragment.kt */
        static final class C0489a extends l implements kotlin.e0.c.l<p, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ j f7407h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0489a(j jVar) {
                super(1);
                this.f7407h = jVar;
            }

            public final void a(p pVar) {
                k.e(pVar, "navDirections");
                androidx.navigation.fragment.a.a(this.f7407h.f7406g).s(pVar);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((p) obj);
                return x.a;
            }
        }

        j(a aVar) {
            this.f7406g = aVar;
        }

        /* renamed from: a */
        public final void k(g.e.h.a.a<? extends p> aVar) {
            aVar.a(new C0489a(this));
        }
    }

    static {
        new c((DefaultConstructorMarker) null);
    }

    private final <T> void V1(b bVar, View view, T t, kotlin.e0.c.l<? super T, x> lVar) {
        view.animate().setStartDelay(bVar.e()).setDuration(bVar.b()).setInterpolator(bVar.d()).translationYBy(this.g0).scaleX(0.0f).scaleY(0.0f).alpha(0.0f).withEndAction(new d(this, view, lVar, t, bVar));
    }

    private final b W1() {
        return (b) this.e0.getValue();
    }

    /* access modifiers changed from: private */
    public final void X1(IotUnit iotUnit, w0 w0Var) {
        if (iotUnit != null) {
            IotUnit iotUnit2 = this.f0;
            if (iotUnit2 == null) {
                this.f0 = iotUnit;
                w0Var.x.setIotUnit(iotUnit);
                TextView textView = w0Var.y;
                k.d(textView, "binding.text");
                textView.setText(iotUnit.getDisplayName());
            } else if (!k.a(iotUnit2.getId(), iotUnit.getId())) {
                SystemClock.elapsedRealtime();
                this.f0 = iotUnit;
                b bVar = k0;
                IotUnitImageView iotUnitImageView = w0Var.x;
                k.d(iotUnitImageView, "binding.target");
                V1(bVar, iotUnitImageView, iotUnit, new e(w0Var));
                b bVar2 = l0;
                TextView textView2 = w0Var.y;
                k.d(textView2, "binding.text");
                V1(bVar2, textView2, iotUnit.getDisplayName(), new f(w0Var));
                W1().B(new b.C0490b(j0));
            }
        }
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        w0 w0Var = (w0) com.sensorberg.smartworkspace.app.a.S1(this, R.layout.frag_nearby_unit, (ViewGroup) null, 2, (Object) null);
        w0Var.M(W1());
        W1().E().o(a0(), new g(this, w0Var));
        W1().C().o(a0(), new h(this));
        W1().M().o(a0(), new i(this));
        W1().G().o(a0(), new j(this));
        Resources R = R();
        k.d(R, "resources");
        this.h0 = ((float) R.getDisplayMetrics().heightPixels) * 0.4f;
        Resources R2 = R();
        k.d(R2, "resources");
        this.g0 = ((float) R2.getDisplayMetrics().heightPixels) * 0.2f;
        return w0Var.s();
    }

    public /* synthetic */ void D0() {
        super.D0();
        Q1();
    }

    public void L1(boolean z) {
        super.L1(z);
        if (Z() != null) {
            W1().a0();
        }
    }

    public void M0() {
        this.f0 = null;
        super.M0();
    }

    public void Q1() {
        HashMap hashMap = this.i0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}

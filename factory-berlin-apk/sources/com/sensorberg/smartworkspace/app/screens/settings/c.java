package com.sensorberg.smartworkspace.app.screens.settings;

import android.content.SharedPreferences;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.n0;
import com.sensorberg.factory.R;
import com.sensorberg.smartspaces.sdk.model.User;
import com.sensorberg.smartworkspace.app.App;
import com.sensorberg.smartworkspace.app.h.a.d;
import com.sensorberg.smartworkspace.app.utils.j;
import g.e.n.g.y;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: SettingsViewModel.kt */
public final class c extends n0 {
    private final LiveData<String> A;
    private final e0<Boolean> B;
    private final LiveData<Boolean> C;
    private final e0<String> D;
    private final LiveData<String> E;
    private final e0<String> F;
    private final LiveData<String> G;
    private final e0<g.e.h.a.a<String>> H;
    private final LiveData<g.e.h.a.a<String>> I;
    private final e0<Boolean> J;
    private final LiveData<Boolean> K;
    /* access modifiers changed from: private */
    public boolean L;
    /* access modifiers changed from: private */
    public final c0<g.e.h.a.a<x>> M;
    private final LiveData<g.e.h.a.a<x>> N;
    /* access modifiers changed from: private */
    public final LiveData<y.a> O = this.Z.getStatusLiveData();
    /* access modifiers changed from: private */
    public final LiveData<Boolean> P = this.X.j();
    private final f0<Object> Q = new d(this);
    private int R;
    private final SharedPreferences S;
    private final e0<Boolean> T;
    private final LiveData<Boolean> U;
    private final e0<Integer> V;
    private final LiveData<g.e.h.a.a<Integer>> W;
    private final j X;
    private final com.sensorberg.smartworkspace.app.utils.c Y;
    private final y Z;

    /* renamed from: i  reason: collision with root package name */
    private final e0<Boolean> f7760i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<Boolean> f7761j;

    /* renamed from: k  reason: collision with root package name */
    private final LiveData<User> f7762k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<String> f7763l;

    /* renamed from: m  reason: collision with root package name */
    private final e0<Boolean> f7764m;

    /* renamed from: n  reason: collision with root package name */
    private final LiveData<Boolean> f7765n;
    private final LiveData<String> o;
    private final e0<Boolean> p;
    private final LiveData<Boolean> q;
    private final e0<Boolean> r;
    private final LiveData<Boolean> s;
    private final e0<Boolean> t;
    private final LiveData<Boolean> u;
    private final e0<String> v;
    private final LiveData<String> w;
    private final e0<Boolean> x;
    private final LiveData<Boolean> y;
    private final e0<String> z;

    /* compiled from: SettingsViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SettingsViewModel.kt */
    static final class b<I, O> implements e.b.a.c.a<User, String> {
        public static final b a = new b();

        b() {
        }

        /* renamed from: b */
        public final String a(User user) {
            if (user != null) {
                return user.getEmail();
            }
            return null;
        }
    }

    /* renamed from: com.sensorberg.smartworkspace.app.screens.settings.c$c  reason: collision with other inner class name */
    /* compiled from: SettingsViewModel.kt */
    static final class C0521c<I, O> implements e.b.a.c.a<Integer, g.e.h.a.a<? extends Integer>> {
        public static final C0521c a = new C0521c();

        C0521c() {
        }

        /* renamed from: b */
        public final g.e.h.a.a<Integer> a(Integer num) {
            return new g.e.h.a.a<>(num);
        }
    }

    /* compiled from: SettingsViewModel.kt */
    static final class d<T> implements f0<Object> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f7766g;

        d(c cVar) {
            this.f7766g = cVar;
        }

        public final void k(Object obj) {
            if (!this.f7766g.L || !k.a((Boolean) this.f7766g.P.l(), Boolean.FALSE)) {
                return;
            }
            if ((this.f7766g.O.l() instanceof y.a.b) || (this.f7766g.O.l() instanceof y.a.c)) {
                this.f7766g.M.u(new g.e.h.a.a(x.a));
            }
        }
    }

    /* compiled from: SettingsViewModel.kt */
    static final class e<I, O> implements e.b.a.c.a<User, String> {
        public static final e a = new e();

        e() {
        }

        /* renamed from: b */
        public final String a(User user) {
            if (user != null) {
                return user.getFullName();
            }
            return null;
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(com.sensorberg.smartworkspace.app.utils.j r2, com.sensorberg.smartworkspace.app.utils.c r3, g.e.n.g.y r4, com.sensorberg.smartworkspace.app.utils.l r5) {
        /*
            r1 = this;
            java.lang.String r0 = "pinInput"
            kotlin.jvm.internal.k.e(r2, r0)
            java.lang.String r0 = "buildConfig"
            kotlin.jvm.internal.k.e(r3, r0)
            java.lang.String r0 = "userManager"
            kotlin.jvm.internal.k.e(r4, r0)
            java.lang.String r0 = "sharedPreferenceProvider"
            kotlin.jvm.internal.k.e(r5, r0)
            r1.<init>()
            r1.X = r2
            r1.Y = r3
            r1.Z = r4
            androidx.lifecycle.e0 r2 = new androidx.lifecycle.e0
            r2.<init>()
            r1.f7760i = r2
            r1.f7761j = r2
            g.e.n.g.y r2 = r1.Z
            androidx.lifecycle.LiveData r2 = r2.h()
            androidx.lifecycle.LiveData r2 = g.e.m.d.a.c(r2)
            r1.f7762k = r2
            com.sensorberg.smartworkspace.app.screens.settings.c$e r3 = com.sensorberg.smartworkspace.app.screens.settings.c.e.a
            androidx.lifecycle.LiveData r2 = androidx.lifecycle.m0.b(r2, r3)
            java.lang.String r3 = "Transformations.map(user) { it?.fullName }"
            kotlin.jvm.internal.k.d(r2, r3)
            r1.f7763l = r2
            androidx.lifecycle.e0 r2 = new androidx.lifecycle.e0
            r2.<init>()
            r1.f7764m = r2
            r1.f7765n = r2
            androidx.lifecycle.LiveData<com.sensorberg.smartspaces.sdk.model.User> r2 = r1.f7762k
            com.sensorberg.smartworkspace.app.screens.settings.c$b r3 = com.sensorberg.smartworkspace.app.screens.settings.c.b.a
            androidx.lifecycle.LiveData r2 = androidx.lifecycle.m0.b(r2, r3)
            java.lang.String r3 = "Transformations.map(user) { it?.email }"
            kotlin.jvm.internal.k.d(r2, r3)
            r1.o = r2
            androidx.lifecycle.e0 r2 = new androidx.lifecycle.e0
            r2.<init>()
            r1.p = r2
            r1.q = r2
            androidx.lifecycle.e0 r2 = new androidx.lifecycle.e0
            r2.<init>()
            r1.r = r2
            r1.s = r2
            androidx.lifecycle.e0 r2 = new androidx.lifecycle.e0
            r2.<init>()
            r1.t = r2
            r1.u = r2
            androidx.lifecycle.e0 r2 = new androidx.lifecycle.e0
            r2.<init>()
            r1.v = r2
            r1.w = r2
            androidx.lifecycle.e0 r2 = new androidx.lifecycle.e0
            r2.<init>()
            r1.x = r2
            r1.y = r2
            androidx.lifecycle.e0 r2 = new androidx.lifecycle.e0
            r2.<init>()
            r1.z = r2
            r1.A = r2
            androidx.lifecycle.e0 r2 = new androidx.lifecycle.e0
            r2.<init>()
            r1.B = r2
            r1.C = r2
            androidx.lifecycle.e0 r2 = new androidx.lifecycle.e0
            r2.<init>()
            r1.D = r2
            r1.E = r2
            androidx.lifecycle.e0 r2 = new androidx.lifecycle.e0
            r2.<init>()
            r1.F = r2
            r1.G = r2
            androidx.lifecycle.e0 r2 = new androidx.lifecycle.e0
            r2.<init>()
            r1.H = r2
            r1.I = r2
            androidx.lifecycle.e0 r2 = new androidx.lifecycle.e0
            com.sensorberg.smartworkspace.app.utils.c r3 = r1.Y
            r3.b()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.<init>(r3)
            r1.J = r2
            r1.K = r2
            androidx.lifecycle.c0 r2 = new androidx.lifecycle.c0
            r2.<init>()
            r1.M = r2
            r1.N = r2
            g.e.n.g.y r2 = r1.Z
            androidx.lifecycle.LiveData r2 = r2.getStatusLiveData()
            r1.O = r2
            com.sensorberg.smartworkspace.app.utils.j r2 = r1.X
            androidx.lifecycle.LiveData r2 = r2.j()
            r1.P = r2
            com.sensorberg.smartworkspace.app.screens.settings.c$d r2 = new com.sensorberg.smartworkspace.app.screens.settings.c$d
            r2.<init>(r1)
            r1.Q = r2
            java.lang.String r2 = "settings"
            r3 = 0
            android.content.SharedPreferences r2 = r5.a(r2, r3)
            r1.S = r2
            androidx.lifecycle.e0 r2 = new androidx.lifecycle.e0
            boolean r4 = r1.O()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.<init>(r4)
            r1.T = r2
            r1.U = r2
            androidx.lifecycle.e0 r2 = new androidx.lifecycle.e0
            r2.<init>()
            r1.V = r2
            com.sensorberg.smartworkspace.app.screens.settings.c$c r4 = com.sensorberg.smartworkspace.app.screens.settings.c.C0521c.a
            androidx.lifecycle.LiveData r2 = androidx.lifecycle.m0.b(r2, r4)
            java.lang.String r4 = "Transformations.map(_sho…geLiveData) { Event(it) }"
            kotlin.jvm.internal.k.d(r2, r4)
            r1.W = r2
            androidx.lifecycle.e0<java.lang.String> r2 = r1.F
            com.sensorberg.smartworkspace.app.utils.c r4 = r1.Y
            java.lang.String r4 = r4.z()
            r2.u(r4)
            androidx.lifecycle.e0<java.lang.Boolean> r2 = r1.f7760i
            boolean r4 = r1.P()
            r5 = 1
            r4 = r4 ^ r5
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.u(r4)
            androidx.lifecycle.e0<java.lang.Boolean> r2 = r1.p
            boolean r4 = r1.P()
            r4 = r4 ^ r5
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.u(r4)
            androidx.lifecycle.e0<java.lang.Boolean> r2 = r1.f7764m
            boolean r4 = r1.P()
            r4 = r4 ^ r5
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.u(r4)
            androidx.lifecycle.e0<java.lang.Boolean> r2 = r1.t
            com.sensorberg.smartworkspace.app.utils.c r4 = r1.Y
            java.lang.String r4 = r4.g()
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0155
            r4 = 1
            goto L_0x0156
        L_0x0155:
            r4 = 0
        L_0x0156:
            if (r4 == 0) goto L_0x016b
            com.sensorberg.smartworkspace.app.utils.c r4 = r1.Y
            java.lang.String r4 = r4.h()
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0166
            r4 = 1
            goto L_0x0167
        L_0x0166:
            r4 = 0
        L_0x0167:
            if (r4 == 0) goto L_0x016b
            r4 = 1
            goto L_0x016c
        L_0x016b:
            r4 = 0
        L_0x016c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.u(r4)
            androidx.lifecycle.e0<java.lang.String> r2 = r1.v
            com.sensorberg.smartworkspace.app.utils.c r4 = r1.Y
            java.lang.String r4 = r4.g()
            r2.u(r4)
            androidx.lifecycle.e0<java.lang.Boolean> r2 = r1.x
            com.sensorberg.smartworkspace.app.utils.c r4 = r1.Y
            java.lang.String r4 = r4.i()
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x018e
            r4 = 1
            goto L_0x018f
        L_0x018e:
            r4 = 0
        L_0x018f:
            if (r4 == 0) goto L_0x01a4
            com.sensorberg.smartworkspace.app.utils.c r4 = r1.Y
            java.lang.String r4 = r4.j()
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x019f
            r4 = 1
            goto L_0x01a0
        L_0x019f:
            r4 = 0
        L_0x01a0:
            if (r4 == 0) goto L_0x01a4
            r4 = 1
            goto L_0x01a5
        L_0x01a4:
            r4 = 0
        L_0x01a5:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.u(r4)
            androidx.lifecycle.e0<java.lang.String> r2 = r1.z
            com.sensorberg.smartworkspace.app.utils.c r4 = r1.Y
            java.lang.String r4 = r4.i()
            r2.u(r4)
            androidx.lifecycle.e0<java.lang.Boolean> r2 = r1.B
            com.sensorberg.smartworkspace.app.utils.c r4 = r1.Y
            java.lang.String r4 = r4.k()
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x01c7
            r4 = 1
            goto L_0x01c8
        L_0x01c7:
            r4 = 0
        L_0x01c8:
            if (r4 == 0) goto L_0x01dd
            com.sensorberg.smartworkspace.app.utils.c r4 = r1.Y
            java.lang.String r4 = r4.l()
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x01d8
            r4 = 1
            goto L_0x01d9
        L_0x01d8:
            r4 = 0
        L_0x01d9:
            if (r4 == 0) goto L_0x01dd
            r4 = 1
            goto L_0x01de
        L_0x01dd:
            r4 = 0
        L_0x01de:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.u(r4)
            androidx.lifecycle.e0<java.lang.String> r2 = r1.D
            com.sensorberg.smartworkspace.app.utils.c r4 = r1.Y
            java.lang.String r4 = r4.k()
            r2.u(r4)
            androidx.lifecycle.e0<java.lang.Boolean> r2 = r1.r
            com.sensorberg.smartworkspace.app.utils.c r4 = r1.Y
            java.lang.String r4 = r4.f()
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x01ff
            r3 = 1
        L_0x01ff:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.u(r3)
            androidx.lifecycle.c0<g.e.h.a.a<kotlin.x>> r2 = r1.M
            androidx.lifecycle.LiveData<g.e.n.g.y$a> r3 = r1.O
            androidx.lifecycle.f0<java.lang.Object> r4 = r1.Q
            r2.v(r3, r4)
            androidx.lifecycle.c0<g.e.h.a.a<kotlin.x>> r2 = r1.M
            androidx.lifecycle.LiveData<java.lang.Boolean> r3 = r1.P
            androidx.lifecycle.f0<java.lang.Object> r4 = r1.Q
            r2.v(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartworkspace.app.screens.settings.c.<init>(com.sensorberg.smartworkspace.app.utils.j, com.sensorberg.smartworkspace.app.utils.c, g.e.n.g.y, com.sensorberg.smartworkspace.app.utils.l):void");
    }

    private final boolean O() {
        return this.S.getBoolean("debug_mode", false);
    }

    private final boolean P() {
        return !k.a(this.Y.K(), d.a.a);
    }

    private final void U(String str) {
        this.H.u(new g.e.h.a.a(str));
    }

    private final void v() {
        this.T.u(Boolean.TRUE);
        this.V.u(Integer.valueOf(R.string.settings_debug_enabled));
        SharedPreferences.Editor edit = this.S.edit();
        k.b(edit, "editor");
        edit.putBoolean("debug_mode", true);
        edit.apply();
    }

    public final LiveData<String> A() {
        return this.E;
    }

    public final LiveData<Boolean> B() {
        return this.q;
    }

    public final LiveData<Boolean> C() {
        return this.U;
    }

    public final LiveData<Boolean> D() {
        return this.f7765n;
    }

    public final LiveData<Boolean> E() {
        return this.s;
    }

    public final LiveData<g.e.h.a.a<String>> F() {
        return this.I;
    }

    public final LiveData<Boolean> G() {
        return this.u;
    }

    public final LiveData<Boolean> H() {
        return this.y;
    }

    public final LiveData<Boolean> I() {
        return this.C;
    }

    public final LiveData<g.e.h.a.a<Integer>> J() {
        return this.W;
    }

    public final LiveData<Boolean> K() {
        return this.K;
    }

    public final LiveData<Boolean> L() {
        return this.f7761j;
    }

    public final LiveData<String> M() {
        return this.f7763l;
    }

    public final LiveData<String> N() {
        return this.G;
    }

    public final void Q() {
        this.L = true;
        this.X.d();
        this.Z.g();
    }

    public final void R() {
        U(this.Y.h());
    }

    public final void S() {
        U(this.Y.j());
    }

    public final void T() {
        U(this.Y.l());
    }

    public final void V() {
        if (this.Y.E() && !k.a(this.T.l(), Boolean.TRUE)) {
            int i2 = this.R + 1;
            this.R = i2;
            if (i2 >= 10) {
                v();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void l() {
        super.l();
        App.f6872k.a(this);
    }

    public final LiveData<g.e.h.a.a<x>> w() {
        return this.N;
    }

    public final LiveData<String> x() {
        return this.o;
    }

    public final LiveData<String> y() {
        return this.w;
    }

    public final LiveData<String> z() {
        return this.A;
    }
}

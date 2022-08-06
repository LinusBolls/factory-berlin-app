package com.sensorberg.smartworkspace.app.activities.login.internal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.n0;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.App;
import g.e.n.g.y;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: UsernameViewModel.kt */
public final class a extends n0 {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f6941i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    private final e0<Boolean> f6942j = new e0<>();

    /* renamed from: k  reason: collision with root package name */
    private final LiveData<Boolean> f6943k;

    /* renamed from: l  reason: collision with root package name */
    private final kotlin.e0.c.a<x> f6944l;

    /* renamed from: m  reason: collision with root package name */
    private final kotlin.e0.c.a<x> f6945m;

    /* renamed from: n  reason: collision with root package name */
    private final e0<String> f6946n = new e0<>();
    private final e0<String> o = new e0<>();
    /* access modifiers changed from: private */
    public final e0<Boolean> p = new e0<>();
    /* access modifiers changed from: private */
    public final e0<g.e.h.a.a<x>> q;
    private final LiveData<g.e.h.a.a<x>> r;
    /* access modifiers changed from: private */
    public final e0<g.e.h.a.a<C0420a>> s;
    private final LiveData<g.e.h.a.a<C0420a>> t;
    private final y u;
    private final g.e.d.s.a v;

    /* renamed from: com.sensorberg.smartworkspace.app.activities.login.internal.a$a  reason: collision with other inner class name */
    /* compiled from: UsernameViewModel.kt */
    public static abstract class C0420a {

        /* renamed from: com.sensorberg.smartworkspace.app.activities.login.internal.a$a$a  reason: collision with other inner class name */
        /* compiled from: UsernameViewModel.kt */
        public static abstract class C0421a extends C0420a {
            private final int a;

            /* renamed from: com.sensorberg.smartworkspace.app.activities.login.internal.a$a$a$a  reason: collision with other inner class name */
            /* compiled from: UsernameViewModel.kt */
            public static final class C0422a extends C0421a {
                public static final C0422a b = new C0422a();

                private C0422a() {
                    super(R.string.label_no_internet_connection, (DefaultConstructorMarker) null);
                }
            }

            /* renamed from: com.sensorberg.smartworkspace.app.activities.login.internal.a$a$a$b */
            /* compiled from: UsernameViewModel.kt */
            public static final class b extends C0421a {
                public static final b b = new b();

                private b() {
                    super(R.string.label_login_credentials_error, (DefaultConstructorMarker) null);
                }
            }

            private C0421a(int i2) {
                super((DefaultConstructorMarker) null);
                this.a = i2;
            }

            public final int a() {
                return this.a;
            }

            public /* synthetic */ C0421a(int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i2);
            }
        }

        /* renamed from: com.sensorberg.smartworkspace.app.activities.login.internal.a$a$b */
        /* compiled from: UsernameViewModel.kt */
        public static final class b extends C0420a {
            public static final b a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }
        }

        private C0420a() {
        }

        public /* synthetic */ C0420a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: UsernameViewModel.kt */
    static final class b extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6947h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.f6947h = aVar;
        }

        public final void a() {
            a aVar = this.f6947h;
            aVar.I(aVar.C().l(), this.f6947h.z().l());
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: UsernameViewModel.kt */
    static final class c extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6948h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.f6948h = aVar;
        }

        public final void a() {
            a aVar = this.f6948h;
            aVar.I(aVar.C().l(), this.f6948h.z().l());
            this.f6948h.q.u(new g.e.h.a.a(x.a));
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: UsernameViewModel.kt */
    static final class d<T> implements f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f6949g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c0 f6950h;

        d(a aVar, c0 c0Var) {
            this.f6949g = aVar;
            this.f6950h = c0Var;
        }

        /* renamed from: a */
        public final void k(String str) {
            boolean z;
            c0 c0Var = this.f6950h;
            a aVar = this.f6949g;
            if (aVar.H(aVar.C().l())) {
                a aVar2 = this.f6949g;
                if (aVar2.H(aVar2.z().l())) {
                    z = true;
                    c0Var.u(Boolean.valueOf(z));
                }
            }
            z = false;
            c0Var.u(Boolean.valueOf(z));
        }
    }

    /* compiled from: UsernameViewModel.kt */
    static final class e extends l implements kotlin.e0.c.l<Void, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6951h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(1);
            this.f6951h = aVar;
        }

        public final void a(Void voidR) {
            this.f6951h.p.u(Boolean.TRUE);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Void) obj);
            return x.a;
        }
    }

    /* compiled from: UsernameViewModel.kt */
    static final class f extends l implements kotlin.e0.c.l<Void, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6952h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(1);
            this.f6952h = aVar;
        }

        public final void a(Void voidR) {
            this.f6952h.p.u(Boolean.FALSE);
            this.f6952h.f6941i.set(false);
            this.f6952h.s.u(new g.e.h.a.a(C0420a.b.a));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Void) obj);
            return x.a;
        }
    }

    /* compiled from: UsernameViewModel.kt */
    static final class g extends l implements kotlin.e0.c.l<Exception, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6953h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(1);
            this.f6953h = aVar;
        }

        public final void a(Exception exc) {
            this.f6953h.p.u(Boolean.FALSE);
            this.f6953h.f6941i.set(false);
            this.f6953h.s.u(new g.e.h.a.a(C0420a.C0421a.b.b));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Exception) obj);
            return x.a;
        }
    }

    public a(y yVar, g.e.d.s.a aVar) {
        k.e(yVar, "userManager");
        k.e(aVar, "connectivityProvider");
        this.u = yVar;
        this.v = aVar;
        e0<g.e.h.a.a<x>> e0Var = new e0<>();
        this.q = e0Var;
        this.r = e0Var;
        e0<g.e.h.a.a<C0420a>> e0Var2 = new e0<>();
        this.s = e0Var2;
        this.t = e0Var2;
        this.f6943k = F();
        this.f6944l = E();
        this.f6945m = D();
    }

    private final kotlin.e0.c.a<x> D() {
        return new b(this);
    }

    private final kotlin.e0.c.a<x> E() {
        return new c(this);
    }

    private final LiveData<Boolean> F() {
        c0 c0Var = new c0();
        d dVar = new d(this, c0Var);
        c0Var.v(this.f6946n, dVar);
        c0Var.v(this.o, dVar);
        return c0Var;
    }

    /* access modifiers changed from: private */
    public final boolean H(String str) {
        boolean z = str != null && str.length() > 2;
        n.a.a.a("input isValid: " + z, new Object[0]);
        return z;
    }

    public final LiveData<Boolean> A() {
        return this.p;
    }

    public final LiveData<g.e.h.a.a<C0420a>> B() {
        return this.t;
    }

    public final e0<String> C() {
        return this.f6946n;
    }

    public final LiveData<Boolean> G() {
        return this.f6943k;
    }

    public final void I(String str, String str2) {
        if (!this.v.a()) {
            this.s.u(new g.e.h.a.a(C0420a.C0421a.C0422a.b));
            return;
        }
        if (!(str == null || p.s(str))) {
            if (!(str2 == null || p.s(str2)) && this.f6941i.compareAndSet(false, true)) {
                g.e.m.d.e<Boolean, P> a = g.e.m.d.f.a(this.u.i(str, str2), this.f6942j);
                a.e(new e(this));
                a.g(new f(this));
                a.f(new g(this));
            }
        }
    }

    public final void J(String str) {
        k.e(str, "password");
        this.o.u(str);
    }

    public final void K(String str) {
        k.e(str, "username");
        this.f6946n.u(str);
    }

    /* access modifiers changed from: protected */
    public void l() {
        super.l();
        this.f6942j.u(Boolean.TRUE);
        App.f6872k.a(this);
    }

    public final LiveData<g.e.h.a.a<x>> w() {
        return this.r;
    }

    public final kotlin.e0.c.a<x> x() {
        return this.f6945m;
    }

    public final kotlin.e0.c.a<x> y() {
        return this.f6944l;
    }

    public final e0<String> z() {
        return this.o;
    }
}

package com.sensorberg.smartworkspace.app.screens.password;

import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.App;
import g.e.m.d.f;
import g.e.n.g.s;
import g.e.n.g.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: ChangePasswordViewModel.kt */
public final class a extends n0 {

    /* renamed from: i  reason: collision with root package name */
    private final e0<Boolean> f7698i = new e0<>();

    /* renamed from: j  reason: collision with root package name */
    private final c0<C0520a> f7699j;

    /* renamed from: k  reason: collision with root package name */
    private final c0<g.e.h.a.a<String>> f7700k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<g.e.h.a.a<String>> f7701l;

    /* renamed from: m  reason: collision with root package name */
    private final LiveData<Boolean> f7702m;

    /* renamed from: n  reason: collision with root package name */
    private final LiveData<Boolean> f7703n;
    private final e0<g.e.h.a.a<x>> o;
    private final LiveData<g.e.h.a.a<x>> p;
    private final e0<g.e.h.a.a<x>> q;
    private final LiveData<g.e.h.a.a<x>> r;
    private final e0<String> s;
    private final e0<String> t;
    private final e0<String> u;
    private final s v;
    private final Resources w;

    /* renamed from: com.sensorberg.smartworkspace.app.screens.password.a$a  reason: collision with other inner class name */
    /* compiled from: ChangePasswordViewModel.kt */
    public enum C0520a {
        AWAITING_USER,
        PROCESSING,
        SUCCESS
    }

    /* compiled from: ChangePasswordViewModel.kt */
    static final class b extends l implements kotlin.e0.c.l<Void, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f7708h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.f7708h = aVar;
        }

        public final void a(Void voidR) {
            this.f7708h.I();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Void) obj);
            return x.a;
        }
    }

    /* compiled from: ChangePasswordViewModel.kt */
    static final class c extends l implements kotlin.e0.c.l<Exception, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f7709h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.f7709h = aVar;
        }

        public final void a(Exception exc) {
            this.f7709h.H(exc);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Exception) obj);
            return x.a;
        }
    }

    /* compiled from: ChangePasswordViewModel.kt */
    static final class d<I, O> implements e.b.a.c.a<C0520a, Boolean> {
        public static final d a = new d();

        d() {
        }

        /* renamed from: b */
        public final Boolean a(C0520a aVar) {
            if (aVar != null) {
                int i2 = b.a[aVar.ordinal()];
                if (i2 == 1) {
                    return Boolean.TRUE;
                }
                if (!(i2 == 2 || i2 == 3)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Boolean.FALSE;
        }
    }

    /* compiled from: ChangePasswordViewModel.kt */
    static final class e<T> implements f0<String> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f7710g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c0 f7711h;

        e(a aVar, c0 c0Var) {
            this.f7710g = aVar;
            this.f7711h = c0Var;
        }

        /* renamed from: a */
        public final void k(String str) {
            c0 c0Var = this.f7711h;
            a aVar = this.f7710g;
            c0Var.u(Boolean.valueOf(aVar.G(aVar.w().l(), this.f7710g.y().l(), this.f7710g.z().l())));
        }
    }

    public a(s sVar, Resources resources) {
        k.e(sVar, "sdk");
        k.e(resources, "resources");
        this.v = sVar;
        this.w = resources;
        c0<g.e.h.a.a<String>> c0Var = new c0<>();
        this.f7700k = c0Var;
        this.f7701l = c0Var;
        e0<g.e.h.a.a<x>> e0Var = new e0<>();
        this.o = e0Var;
        this.p = e0Var;
        e0<g.e.h.a.a<x>> e0Var2 = new e0<>();
        this.q = e0Var2;
        this.r = e0Var2;
        e0<String> e0Var3 = new e0<>();
        e0Var3.u("");
        x xVar = x.a;
        this.s = e0Var3;
        e0<String> e0Var4 = new e0<>();
        e0Var4.u("");
        x xVar2 = x.a;
        this.t = e0Var4;
        e0<String> e0Var5 = new e0<>();
        e0Var5.u("");
        x xVar3 = x.a;
        this.u = e0Var5;
        this.f7699j = E();
        this.f7702m = D();
        this.f7703n = C();
    }

    private final LiveData<Boolean> C() {
        LiveData<Boolean> b2 = m0.b(this.f7699j, d.a);
        k.d(b2, "Transformations.map(stat…return@map false\n\t\t\t}\n\t\t}");
        return b2;
    }

    private final LiveData<Boolean> D() {
        c0 c0Var = new c0();
        e eVar = new e(this, c0Var);
        c0Var.v(this.s, eVar);
        c0Var.v(this.t, eVar);
        c0Var.v(this.u, eVar);
        return c0Var;
    }

    private final c0<C0520a> E() {
        c0<C0520a> c0Var = new c0<>();
        c0Var.u(C0520a.AWAITING_USER);
        return c0Var;
    }

    /* access modifiers changed from: private */
    public final boolean G(String str, String str2, String str3) {
        C0520a l2 = this.f7699j.l();
        C0520a aVar = C0520a.AWAITING_USER;
        if (l2 != aVar) {
            this.f7699j.u(aVar);
        }
        if ((str == null || p.s(str)) || str.length() <= 2) {
            return false;
        }
        if ((str2 == null || p.s(str2)) || str2.length() <= 2) {
            return false;
        }
        if ((str3 == null || p.s(str3)) || !k.a(str2, str3)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final void H(Exception exc) {
        String message;
        if (!(exc == null || (message = exc.getMessage()) == null)) {
            K(message);
        }
        this.f7699j.u(C0520a.AWAITING_USER);
    }

    /* access modifiers changed from: private */
    public final void I() {
        this.f7699j.u(C0520a.SUCCESS);
        this.q.u(new g.e.h.a.a(x.a));
    }

    private final void K(String str) {
        this.f7700k.u(new g.e.h.a.a(str));
    }

    private final void u(String str, String str2, String str3) {
        this.o.u(new g.e.h.a.a(x.a));
        if (!G(str, str2, str3)) {
            String string = this.w.getString(R.string.label_password_no_match);
            k.d(string, "resources.getString(R.st….label_password_no_match)");
            K(string);
            return;
        }
        this.f7699j.u(C0520a.PROCESSING);
        y f2 = this.v.f();
        k.c(str);
        k.c(str2);
        k.c(str3);
        g.e.m.d.e<Boolean, P> a = f.a(f2.w(str, str2, str3), this.f7698i);
        a.g(new b(this));
        a.f(new c(this));
    }

    public final LiveData<g.e.h.a.a<x>> A() {
        return this.p;
    }

    public final LiveData<g.e.h.a.a<x>> B() {
        return this.r;
    }

    public final LiveData<Boolean> F() {
        return this.f7702m;
    }

    public final void J() {
        u(this.s.l(), this.t.l(), this.u.l());
    }

    /* access modifiers changed from: protected */
    public void l() {
        super.l();
        App.f6872k.a(this);
    }

    public final LiveData<Boolean> v() {
        return this.f7703n;
    }

    public final e0<String> w() {
        return this.s;
    }

    public final LiveData<g.e.h.a.a<String>> x() {
        return this.f7701l;
    }

    public final e0<String> y() {
        return this.t;
    }

    public final e0<String> z() {
        return this.u;
    }
}

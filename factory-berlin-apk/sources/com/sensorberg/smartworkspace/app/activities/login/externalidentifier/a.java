package com.sensorberg.smartworkspace.app.activities.login.externalidentifier;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import com.sensorberg.factory.R;
import g.e.n.g.y;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: ExternalIdentifierLoginViewModel.kt */
public final class a extends n0 {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final e0<Integer> f6923i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<g.e.h.a.a<Integer>> f6924j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final e0<Boolean> f6925k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<Boolean> f6926l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final e0<C0418a> f6927m;

    /* renamed from: n  reason: collision with root package name */
    private final LiveData<g.e.h.a.a<C0418a>> f6928n;
    private final y o;
    private final g.e.d.s.a p;

    /* renamed from: com.sensorberg.smartworkspace.app.activities.login.externalidentifier.a$a  reason: collision with other inner class name */
    /* compiled from: ExternalIdentifierLoginViewModel.kt */
    public static abstract class C0418a {

        /* renamed from: com.sensorberg.smartworkspace.app.activities.login.externalidentifier.a$a$a  reason: collision with other inner class name */
        /* compiled from: ExternalIdentifierLoginViewModel.kt */
        public static final class C0419a extends C0418a {
            public static final C0419a a = new C0419a();

            private C0419a() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: com.sensorberg.smartworkspace.app.activities.login.externalidentifier.a$a$b */
        /* compiled from: ExternalIdentifierLoginViewModel.kt */
        public static final class b extends C0418a {
            public static final b a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }
        }

        private C0418a() {
        }

        public /* synthetic */ C0418a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ExternalIdentifierLoginViewModel.kt */
    static final class b extends l implements kotlin.e0.c.l<Void, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6929h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.f6929h = aVar;
        }

        public final void a(Void voidR) {
            this.f6929h.f6925k.u(Boolean.TRUE);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Void) obj);
            return x.a;
        }
    }

    /* compiled from: ExternalIdentifierLoginViewModel.kt */
    static final class c extends l implements kotlin.e0.c.l<Void, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6930h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.f6930h = aVar;
        }

        public final void a(Void voidR) {
            this.f6930h.f6925k.u(Boolean.FALSE);
            this.f6930h.f6927m.u(C0418a.b.a);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Void) obj);
            return x.a;
        }
    }

    /* compiled from: ExternalIdentifierLoginViewModel.kt */
    static final class d extends l implements kotlin.e0.c.l<Exception, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6931h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.f6931h = aVar;
        }

        public final void a(Exception exc) {
            this.f6931h.f6925k.u(Boolean.FALSE);
            this.f6931h.f6923i.u(Integer.valueOf(R.string.label_login_external_identifier_error));
            this.f6931h.f6927m.u(C0418a.C0419a.a);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Exception) obj);
            return x.a;
        }
    }

    /* compiled from: ExternalIdentifierLoginViewModel.kt */
    static final class e<I, O> implements e.b.a.c.a<Integer, g.e.h.a.a<? extends Integer>> {
        public static final e a = new e();

        e() {
        }

        /* renamed from: b */
        public final g.e.h.a.a<Integer> a(Integer num) {
            return new g.e.h.a.a<>(num);
        }
    }

    /* compiled from: ExternalIdentifierLoginViewModel.kt */
    static final class f<I, O> implements e.b.a.c.a<C0418a, g.e.h.a.a<? extends C0418a>> {
        public static final f a = new f();

        f() {
        }

        /* renamed from: b */
        public final g.e.h.a.a<C0418a> a(C0418a aVar) {
            return new g.e.h.a.a<>(aVar);
        }
    }

    public a(y yVar, g.e.d.s.a aVar) {
        k.e(yVar, "userManager");
        k.e(aVar, "connectivityProvider");
        this.o = yVar;
        this.p = aVar;
        e0<Integer> e0Var = new e0<>();
        this.f6923i = e0Var;
        LiveData<g.e.h.a.a<Integer>> b2 = m0.b(e0Var, e.a);
        k.d(b2, "Transformations.map(_showError) { Event(it) }");
        this.f6924j = b2;
        e0<Boolean> e0Var2 = new e0<>();
        this.f6925k = e0Var2;
        this.f6926l = e0Var2;
        e0<C0418a> e0Var3 = new e0<>();
        this.f6927m = e0Var3;
        LiveData<g.e.h.a.a<C0418a>> b3 = m0.b(e0Var3, f.a);
        k.d(b3, "Transformations.map(_state) { Event(it) }");
        this.f6928n = b3;
    }

    public final void u(String str) {
        k.e(str, "token");
        if (!this.p.a()) {
            this.f6923i.u(Integer.valueOf(R.string.label_no_internet_connection));
            return;
        }
        g.e.m.d.e b2 = g.e.m.d.f.b(this.o.A(str), (LiveData) null, 1, (Object) null);
        b2.e(new b(this));
        b2.g(new c(this));
        b2.f(new d(this));
    }

    public final LiveData<g.e.h.a.a<Integer>> v() {
        return this.f6924j;
    }

    public final LiveData<Boolean> w() {
        return this.f6926l;
    }

    public final LiveData<g.e.h.a.a<C0418a>> x() {
        return this.f6928n;
    }
}

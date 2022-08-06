package com.sensorberg.smartspaces.backend.m;

import com.sensorberg.smartspaces.backend.model.AuthToken;
import com.sensorberg.smartspaces.backend.model.BeBooking;
import com.sensorberg.smartspaces.backend.model.User;
import com.sensorberg.smartspaces.backend.model.settings.AppSettings;
import com.sensorberg.smartspaces.backend.model.settings.BlueIdSettings;
import com.sensorberg.smartspaces.backend.model.settings.Modules;
import com.sensorberg.smartspaces.backend.model.units.BeUnit;
import com.sensorberg.smartspaces.backend.q.j;
import g.e.m.a;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: CoreObservables.kt */
public final class a {
    private final g.e.k.e<g.e.m.a<User, Void>> a;
    private final g.e.k.e<g.e.m.a<List<BeUnit>, Void>> b = k();
    private final g.e.k.e<g.e.m.a<List<BeBooking>, Void>> c = i();

    /* renamed from: d  reason: collision with root package name */
    private final g.e.k.e<g.e.m.a<AppSettings, Void>> f6012d;

    /* renamed from: e  reason: collision with root package name */
    private final g.e.k.e<g.e.m.a<BlueIdSettings, Void>> f6013e;

    /* renamed from: f  reason: collision with root package name */
    private final d f6014f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final com.sensorberg.smartspaces.backend.q.c f6015g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final com.sensorberg.smartspaces.backend.q.h f6016h;

    /* renamed from: i  reason: collision with root package name */
    private final com.sensorberg.encryptor.d f6017i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final g.e.k.a f6018j;

    /* renamed from: com.sensorberg.smartspaces.backend.m.a$a  reason: collision with other inner class name */
    /* compiled from: CoreObservables.kt */
    private static final class C0336a<T> extends g.e.k.c<g.e.m.a<T, Void>> {
        /* access modifiers changed from: private */
        public final g.e.k.e<T> r;

        /* renamed from: com.sensorberg.smartspaces.backend.m.a$a$a  reason: collision with other inner class name */
        /* compiled from: CoreObservables.kt */
        static final class C0337a extends l implements kotlin.e0.c.l<T, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C0336a f6019h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0337a(C0336a aVar) {
                super(1);
                this.f6019h = aVar;
            }

            public final void a(T t) {
                this.f6019h.w(g.e.m.a.f9908e.d(t));
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a(obj);
                return x.a;
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.m.a$a$b */
        /* compiled from: CoreObservables.kt */
        static final class b extends l implements kotlin.e0.c.l<g.e.m.a<T, Void>, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C0336a f6020h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C0336a aVar) {
                super(1);
                this.f6020h = aVar;
            }

            public final void a(g.e.m.a<T, Void> aVar) {
                g.e.m.a aVar2;
                a.b f2 = aVar != null ? aVar.f() : null;
                if (f2 != null) {
                    int i2 = b.a[f2.ordinal()];
                    if (i2 == 1) {
                        C0336a aVar3 = this.f6020h;
                        aVar3.w(a.C0681a.b(g.e.m.a.f9908e, (Object) null, aVar3.D(), 1, (Object) null));
                    } else if (i2 == 2) {
                        Object C = this.f6020h.D();
                        C0336a aVar4 = this.f6020h;
                        if (C == null) {
                            aVar2 = g.e.m.a.f9908e.c(aVar.d());
                        } else {
                            aVar2 = g.e.m.a.f9908e.d(aVar4.D());
                        }
                        aVar4.w(aVar2);
                    } else if (i2 == 3) {
                        this.f6020h.w(g.e.m.a.f9908e.d(aVar.c()));
                        if (this.f6020h.r instanceof g.e.k.d) {
                            ((g.e.k.d) this.f6020h.r).w(aVar.c());
                        }
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((g.e.m.a) obj);
                return x.a;
            }
        }

        public C0336a(g.e.k.e<T> eVar, g.e.k.e<g.e.m.a<T, Void>> eVar2, g.e.k.a aVar) {
            k.e(eVar, "cached");
            k.e(eVar2, "fresh");
            k.e(aVar, "cancellation");
            this.r = eVar;
            g.e.k.h.a.i(eVar, aVar, new C0337a(this));
            z(eVar2, new b(this));
        }

        /* access modifiers changed from: private */
        public final T D() {
            g.e.m.a aVar = (g.e.m.a) n();
            T c = aVar != null ? aVar.c() : null;
            if (c != null) {
                return c;
            }
            return this.r.n();
        }
    }

    /* compiled from: CoreObservables.kt */
    static final class b extends l implements kotlin.e0.c.l<g.e.m.a<AppSettings, Void>, g.e.m.a<BlueIdSettings, Void>> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f6021h = new b();

        /* renamed from: com.sensorberg.smartspaces.backend.m.a$b$a  reason: collision with other inner class name */
        /* compiled from: CoreObservables.kt */
        static final class C0338a extends l implements kotlin.e0.c.l<AppSettings, BlueIdSettings> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0338a f6022h = new C0338a();

            C0338a() {
                super(1);
            }

            /* renamed from: a */
            public final BlueIdSettings o(AppSettings appSettings) {
                Modules modules;
                if (appSettings == null || (modules = appSettings.modules) == null) {
                    return null;
                }
                return modules.blueid;
            }
        }

        b() {
            super(1);
        }

        /* renamed from: a */
        public final g.e.m.a<BlueIdSettings, Void> o(g.e.m.a<AppSettings, Void> aVar) {
            if (aVar != null) {
                return g.e.m.b.a(aVar, C0338a.f6022h);
            }
            return null;
        }
    }

    /* compiled from: CoreObservables.kt */
    static final class c extends l implements kotlin.e0.c.l<AuthToken, g.e.k.e<g.e.m.a<List<? extends BeBooking>, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6023h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.f6023h = aVar;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<List<BeBooking>, Void>> o(AuthToken authToken) {
            k.e(authToken, "it");
            com.sensorberg.smartspaces.backend.q.h b = this.f6023h.f6016h;
            retrofit2.b<com.github.jasminb.jsonapi.d<List<BeBooking>>> b2 = this.f6023h.f6015g.b();
            k.d(b2, "backendApi.myBookings");
            return j.c(b.a(b2));
        }
    }

    /* compiled from: CoreObservables.kt */
    static final class d extends l implements kotlin.e0.c.l<g.e.m.a<com.github.jasminb.jsonapi.d<User>, Void>, g.e.m.a<AppSettings, Void>> {

        /* renamed from: h  reason: collision with root package name */
        public static final d f6024h = new d();

        /* renamed from: com.sensorberg.smartspaces.backend.m.a$d$a  reason: collision with other inner class name */
        /* compiled from: CoreObservables.kt */
        static final class C0339a extends l implements kotlin.e0.c.l<com.github.jasminb.jsonapi.d<User>, AppSettings> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0339a f6025h = new C0339a();

            C0339a() {
                super(1);
            }

            /* renamed from: a */
            public final AppSettings o(com.github.jasminb.jsonapi.d<User> dVar) {
                if (dVar != null) {
                    return AppSettings.extractSettings(dVar);
                }
                return null;
            }
        }

        d() {
            super(1);
        }

        /* renamed from: a */
        public final g.e.m.a<AppSettings, Void> o(g.e.m.a<com.github.jasminb.jsonapi.d<User>, Void> aVar) {
            if (aVar != null) {
                return g.e.m.b.a(aVar, C0339a.f6025h);
            }
            return null;
        }
    }

    /* compiled from: CoreObservables.kt */
    static final class e extends l implements kotlin.e0.c.l<AuthToken, g.e.k.e<g.e.m.a<List<? extends BeUnit>, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6026h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(1);
            this.f6026h = aVar;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<List<BeUnit>, Void>> o(AuthToken authToken) {
            k.e(authToken, "it");
            com.sensorberg.smartspaces.backend.q.h b = this.f6026h.f6016h;
            retrofit2.b<com.github.jasminb.jsonapi.d<List<BeUnit>>> f2 = this.f6026h.f6015g.f();
            k.d(f2, "backendApi.unitsFromCache");
            g.e.k.e<com.github.jasminb.jsonapi.d<List<BeUnit>>> a = g.e.m.e.b.a(b.b(f2));
            com.sensorberg.smartspaces.backend.q.h b2 = this.f6026h.f6016h;
            retrofit2.b<com.github.jasminb.jsonapi.d<List<BeUnit>>> o = this.f6026h.f6015g.o();
            k.d(o, "backendApi.unitsFromNetwork");
            return j.c(new C0336a(a, b2.a(o), this.f6026h.f6018j));
        }
    }

    /* compiled from: CoreObservables.kt */
    static final class f extends l implements kotlin.e0.c.l<AuthToken, g.e.k.e<g.e.m.a<com.github.jasminb.jsonapi.d<User>, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6027h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(1);
            this.f6027h = aVar;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<com.github.jasminb.jsonapi.d<User>, Void>> o(AuthToken authToken) {
            k.e(authToken, "it");
            com.sensorberg.smartspaces.backend.q.h b = this.f6027h.f6016h;
            retrofit2.b<com.github.jasminb.jsonapi.d<User>> m2 = this.f6027h.f6015g.m();
            k.d(m2, "backendApi.user");
            return b.a(m2);
        }
    }

    /* compiled from: CoreObservables.kt */
    static final class g extends l implements kotlin.e0.c.l<BlueIdSettings, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.l f6028h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(kotlin.e0.c.l lVar) {
            super(1);
            this.f6028h = lVar;
        }

        public final void a(BlueIdSettings blueIdSettings) {
            kotlin.e0.c.l lVar = this.f6028h;
            k.c(blueIdSettings);
            lVar.o(blueIdSettings);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((BlueIdSettings) obj);
            return x.a;
        }
    }

    /* compiled from: CoreObservables.kt */
    static final class h extends l implements kotlin.e0.c.l<g.e.m.a<AppSettings, Void>, AppSettings> {

        /* renamed from: h  reason: collision with root package name */
        public static final h f6029h = new h();

        h() {
            super(1);
        }

        /* renamed from: a */
        public final AppSettings o(g.e.m.a<AppSettings, Void> aVar) {
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* compiled from: CoreObservables.kt */
    static final class i extends l implements kotlin.e0.c.l<g.e.m.a<User, Void>, User> {

        /* renamed from: h  reason: collision with root package name */
        public static final i f6030h = new i();

        i() {
            super(1);
        }

        /* renamed from: a */
        public final User o(g.e.m.a<User, Void> aVar) {
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    public a(d dVar, com.sensorberg.smartspaces.backend.q.c cVar, com.sensorberg.smartspaces.backend.q.h hVar, com.sensorberg.encryptor.d dVar2, g.e.k.a aVar) {
        k.e(dVar, "authToken");
        k.e(cVar, "backendApi");
        k.e(hVar, "callFactory");
        k.e(dVar2, "encryptor");
        k.e(aVar, "cancellation");
        this.f6014f = dVar;
        this.f6015g = cVar;
        this.f6016h = hVar;
        this.f6017i = dVar2;
        this.f6018j = aVar;
        g.e.k.e<g.e.m.a<com.github.jasminb.jsonapi.d<User>, Void>> m2 = m();
        this.a = l(m2);
        g.e.k.e<g.e.m.a<AppSettings, Void>> j2 = j(m2);
        this.f6012d = j2;
        this.f6013e = h(j2);
    }

    private final g.e.k.e<g.e.m.a<BlueIdSettings, Void>> h(g.e.k.e<g.e.m.a<AppSettings, Void>> eVar) {
        return g.e.k.h.a.b(eVar, b.f6021h);
    }

    private final g.e.k.e<g.e.m.a<List<BeBooking>, Void>> i() {
        return this.f6014f.e(new c(this));
    }

    private final g.e.k.e<g.e.m.a<AppSettings, Void>> j(g.e.k.e<g.e.m.a<com.github.jasminb.jsonapi.d<User>, Void>> eVar) {
        return new C0336a(new c(this.f6017i.c("settings", AppSettings.class)), g.e.k.h.a.b(eVar, d.f6024h), this.f6018j);
    }

    private final g.e.k.e<g.e.m.a<List<BeUnit>, Void>> k() {
        return this.f6014f.e(new e(this));
    }

    private final g.e.k.e<g.e.m.a<User, Void>> l(g.e.k.e<g.e.m.a<com.github.jasminb.jsonapi.d<User>, Void>> eVar) {
        return new C0336a(new c(this.f6017i.c("api_me", User.class)), j.c(eVar), this.f6018j);
    }

    private final g.e.k.e<g.e.m.a<com.github.jasminb.jsonapi.d<User>, Void>> m() {
        return this.f6014f.e(new f(this));
    }

    public final BlueIdSettings d() {
        g.e.m.a n2 = this.f6013e.n();
        if (n2 != null) {
            return (BlueIdSettings) n2.c();
        }
        return null;
    }

    public final g.e.k.e<g.e.m.a<List<BeBooking>, Void>> e() {
        return this.c;
    }

    public final g.e.k.e<g.e.m.a<List<BeUnit>, Void>> f() {
        return this.b;
    }

    public final g.e.k.e<g.e.m.a<User, Void>> g() {
        return this.a;
    }

    public final void n(kotlin.e0.c.l<? super BlueIdSettings, x> lVar) {
        k.e(lVar, "callback");
        g.e.m.e.e.a(this.f6013e, this.f6018j).f(new g(lVar));
    }

    public final void o() {
        com.sensorberg.smartspaces.backend.q.h hVar = this.f6016h;
        retrofit2.b<com.github.jasminb.jsonapi.d<List<BeBooking>>> b2 = this.f6015g.b();
        k.d(b2, "backendApi.myBookings");
        hVar.d(b2);
    }

    public final void p(kotlin.e0.c.l<? super AppSettings, x> lVar) {
        k.e(lVar, "callback");
        g.e.k.h.a.i(g.e.k.h.a.b(this.f6012d, h.f6029h), this.f6018j, lVar);
    }

    public final void q(kotlin.e0.c.l<? super User, x> lVar) {
        k.e(lVar, "callback");
        g.e.k.h.a.i(g.e.k.h.a.b(this.a, i.f6030h), this.f6018j, lVar);
    }

    public final <T> g.e.k.e<T> r(kotlin.e0.c.l<? super User, ? extends g.e.k.e<T>> lVar) {
        k.e(lVar, "callback");
        return g.e.k.h.a.n(g.e.m.e.b.a(this.a), this.f6018j, lVar);
    }
}

package com.sensorberg.smartspaces.backend;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import com.sensorberg.smartspaces.backend.m.h;
import com.sensorberg.smartspaces.backend.model.AuthToken;
import com.sensorberg.smartspaces.backend.model.ExternalToken;
import com.sensorberg.smartspaces.backend.model.LoginData;
import com.sensorberg.smartspaces.backend.model.RefreshToken;
import com.sensorberg.smartspaces.backend.model.UserDevice;
import com.sensorberg.smartspaces.backend.q.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: StartupAndLogin.kt */
public final class i {
    /* access modifiers changed from: private */
    public final String a;
    /* access modifiers changed from: private */
    public final h b;
    /* access modifiers changed from: private */
    public final Context c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final com.sensorberg.smartspaces.backend.m.d f5679d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final com.sensorberg.smartspaces.backend.m.i f5680e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final g.e.k.a f5681f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final com.sensorberg.smartspaces.backend.q.c f5682g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final com.sensorberg.smartspaces.backend.q.h f5683h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final com.sensorberg.smartspaces.backend.m.e f5684i;

    /* renamed from: j  reason: collision with root package name */
    private final com.sensorberg.encryptor.d f5685j;

    /* compiled from: StartupAndLogin.kt */
    private static final class a {
        private final LiveData<Boolean> a;
        private final e0<String> b;
        private final C0187a c = new C0187a(this);
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final b f5686d = new b(this);
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final String f5687e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final g.e.k.d<Boolean> f5688f;

        /* renamed from: com.sensorberg.smartspaces.backend.i$a$a  reason: collision with other inner class name */
        /* compiled from: StartupAndLogin.kt */
        public static final class C0187a implements f0<Boolean> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ a f5689g;

            C0187a(a aVar) {
                this.f5689g = aVar;
            }

            /* renamed from: a */
            public void k(Boolean bool) {
                if (bool != null) {
                    this.f5689g.e().t(this);
                    if (bool.booleanValue()) {
                        this.f5689g.f().p(this.f5689g.f5686d);
                    } else {
                        this.f5689g.f5688f.w(Boolean.TRUE);
                    }
                }
            }
        }

        /* compiled from: StartupAndLogin.kt */
        public static final class b implements f0<String> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ a f5690g;

            b(a aVar) {
                this.f5690g = aVar;
            }

            /* renamed from: a */
            public void k(String str) {
                if (str != null) {
                    this.f5690g.f().t(this);
                    this.f5690g.f5688f.w(Boolean.valueOf(!k.a(this.f5690g.f5687e, str)));
                }
            }
        }

        public a(com.sensorberg.encryptor.d dVar, String str, g.e.k.d<Boolean> dVar2) {
            k.e(dVar, "encryptor");
            k.e(str, "authenticationToken");
            k.e(dVar2, "result");
            this.f5687e = str;
            this.f5688f = dVar2;
            this.a = dVar.contains("external_pre_shared_auth_token");
            this.b = dVar.b("external_pre_shared_auth_token");
        }

        public final void d() {
            this.a.p(this.c);
        }

        public final LiveData<Boolean> e() {
            return this.a;
        }

        public final e0<String> f() {
            return this.b;
        }
    }

    /* compiled from: StartupAndLogin.kt */
    static final class b extends l implements kotlin.e0.c.l<AuthToken, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i f5691h;

        /* compiled from: StartupAndLogin.kt */
        static final class a extends l implements kotlin.e0.c.l<AuthToken, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ b f5692h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(1);
                this.f5692h = bVar;
            }

            public final void a(AuthToken authToken) {
                if (authToken != null) {
                    this.f5692h.f5691h.f5679d.d(authToken);
                }
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((AuthToken) obj);
                return x.a;
            }
        }

        /* renamed from: com.sensorberg.smartspaces.backend.i$b$b  reason: collision with other inner class name */
        /* compiled from: StartupAndLogin.kt */
        static final class C0188b extends l implements kotlin.e0.c.l<Exception, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ b f5693h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0188b(b bVar) {
                super(1);
                this.f5693h = bVar;
            }

            public final void a(Exception exc) {
                this.f5693h.f5691h.n();
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((Exception) obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar) {
            super(1);
            this.f5691h = iVar;
        }

        public final void a(AuthToken authToken) {
            k.e(authToken, "authToken");
            if (AuthToken.shouldRenew(authToken, System.currentTimeMillis())) {
                com.sensorberg.smartspaces.backend.q.h e2 = this.f5691h.f5683h;
                retrofit2.b<AuthToken> l2 = this.f5691h.f5682g.l(new RefreshToken(authToken.refreshToken, this.f5691h.a));
                k.d(l2, "backendApi.exchangeToken…n.refreshToken, oauthId))");
                g.e.m.e.d<AuthToken, P> a2 = g.e.m.e.e.a(e2.b(l2), this.f5691h.f5681f);
                a2.f(new a(this));
                a2.e(new C0188b(this));
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((AuthToken) obj);
            return x.a;
        }
    }

    /* compiled from: StartupAndLogin.kt */
    static final class c extends l implements kotlin.e0.c.l<Boolean, g.e.k.e<g.e.m.a<Void, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i f5694h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f5695i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar, String str) {
            super(1);
            this.f5694h = iVar;
            this.f5695i = str;
        }

        public final g.e.k.e<g.e.m.a<Void, Void>> a(boolean z) {
            if (z) {
                com.sensorberg.smartspaces.backend.q.h e2 = this.f5694h.f5683h;
                retrofit2.b<AuthToken> q = this.f5694h.f5682g.q(new ExternalToken(this.f5695i, this.f5694h.a));
                k.d(q, "backendApi.login(Externa…nticationToken, oauthId))");
                return this.f5694h.r(e2.b(q));
            }
            g.e.k.d dVar = new g.e.k.d();
            dVar.w(g.e.m.a.f9908e.d(null));
            return dVar;
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* compiled from: StartupAndLogin.kt */
    static final class d extends l implements kotlin.e0.c.l<AuthToken, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i f5696h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar) {
            super(1);
            this.f5696h = iVar;
        }

        public final void a(AuthToken authToken) {
            if (authToken != null) {
                n.a.a.a("Login Success", new Object[0]);
                this.f5696h.f5679d.d(authToken);
                g.e.k.e unused = this.f5696h.s((String) null);
                return;
            }
            this.f5696h.f5684i.l("Call returned empty token");
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((AuthToken) obj);
            return x.a;
        }
    }

    /* compiled from: StartupAndLogin.kt */
    static final class e extends l implements kotlin.e0.c.l<Exception, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i f5697h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar) {
            super(1);
            this.f5697h = iVar;
        }

        public final void a(Exception exc) {
            String str;
            if (exc == null || (str = exc.getMessage()) == null) {
                str = "Failed to login";
            }
            n.a.a.m(exc, "Login Failed: " + str, new Object[0]);
            this.f5697h.f5684i.l(str);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Exception) obj);
            return x.a;
        }
    }

    /* compiled from: StartupAndLogin.kt */
    static final class f extends l implements kotlin.e0.c.l<UserDevice, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i f5698h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(i iVar) {
            super(1);
            this.f5698h = iVar;
        }

        public final void a(UserDevice userDevice) {
            if (userDevice != null) {
                this.f5698h.f5680e.e(userDevice);
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((UserDevice) obj);
            return x.a;
        }
    }

    /* compiled from: StartupAndLogin.kt */
    static final class g extends l implements kotlin.e0.c.l<AuthToken, g.e.k.e<g.e.m.a<UserDevice, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i f5699h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f5700i;

        /* compiled from: StartupAndLogin.kt */
        static final class a extends l implements kotlin.e0.c.l<String, g.e.k.e<g.e.m.a<UserDevice, Void>>> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ g f5701h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(1);
                this.f5701h = gVar;
            }

            /* renamed from: a */
            public final g.e.k.e<g.e.m.a<UserDevice, Void>> o(String str) {
                k.e(str, "pubKey");
                g gVar = this.f5701h;
                String str2 = gVar.f5700i;
                if (str2 == null) {
                    str2 = gVar.f5699h.f5680e.a();
                }
                com.sensorberg.smartspaces.backend.q.h e2 = this.f5701h.f5699h.f5683h;
                retrofit2.b<com.github.jasminb.jsonapi.d<UserDevice>> e3 = this.f5701h.f5699h.f5682g.e(new UserDevice(this.f5701h.f5699h.c, str2, str));
                k.d(e3, "backendApi.postDevice(Us…ice(context, id, pubKey))");
                return j.c(e2.b(e3));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(i iVar, String str) {
            super(1);
            this.f5699h = iVar;
            this.f5700i = str;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<UserDevice, Void>> o(AuthToken authToken) {
            k.e(authToken, "it");
            return this.f5699h.b.k(new a(this));
        }
    }

    public i(String str, h hVar, Context context, com.sensorberg.smartspaces.backend.m.d dVar, com.sensorberg.smartspaces.backend.m.i iVar, g.e.k.a aVar, com.sensorberg.smartspaces.backend.q.c cVar, com.sensorberg.smartspaces.backend.q.h hVar2, com.sensorberg.smartspaces.backend.m.e eVar, com.sensorberg.encryptor.d dVar2) {
        k.e(str, "oauthId");
        k.e(hVar, "rsaEncryption");
        k.e(context, "context");
        k.e(dVar, "authToken");
        k.e(iVar, "userDevice");
        k.e(aVar, "cancellation");
        k.e(cVar, "backendApi");
        k.e(hVar2, "callFactory");
        k.e(eVar, "backendStatus");
        k.e(dVar2, "encryptor");
        this.a = str;
        this.b = hVar;
        this.c = context;
        this.f5679d = dVar;
        this.f5680e = iVar;
        this.f5681f = aVar;
        this.f5682g = cVar;
        this.f5683h = hVar2;
        this.f5684i = eVar;
        this.f5685j = dVar2;
        eVar.toString();
        n();
    }

    private final g.e.k.e<g.e.m.a<Void, Void>> m() {
        g.e.k.d dVar = new g.e.k.d();
        dVar.w(g.e.m.a.f9908e.c(new IllegalStateException("Already logged in")));
        return dVar;
    }

    /* access modifiers changed from: private */
    public final void n() {
        this.f5679d.c(new b(this));
    }

    private final g.e.k.e<Boolean> o(com.sensorberg.encryptor.d dVar, String str) {
        g.e.k.d dVar2 = new g.e.k.d();
        new a(dVar, str, dVar2).d();
        return dVar2;
    }

    /* access modifiers changed from: private */
    public final g.e.k.e<g.e.m.a<Void, Void>> r(g.e.k.e<g.e.m.a<AuthToken, Void>> eVar) {
        this.f5684i.h();
        g.e.m.e.d<g.e.m.a<AuthToken, Void>, P> a2 = g.e.m.e.e.a(eVar, this.f5681f);
        a2.f(new d(this));
        a2.e(new e(this));
        return j.b(eVar);
    }

    /* access modifiers changed from: private */
    public final g.e.k.e<g.e.m.a<UserDevice, Void>> s(String str) {
        g.e.k.e<g.e.m.a<UserDevice, Void>> e2 = this.f5679d.e(new g(this, str));
        g.e.m.e.e.a(e2, this.f5681f).f(new f(this));
        return e2;
    }

    public final g.e.k.e<g.e.m.a<Void, Void>> p(String str) {
        k.e(str, "authenticationToken");
        if (this.f5684i.e()) {
            return m();
        }
        return g.e.k.h.a.n(o(this.f5685j, str), this.f5681f, new c(this, str));
    }

    public final g.e.k.e<g.e.m.a<Void, Void>> q(String str) {
        g.e.m.a aVar;
        k.e(str, "redirectedUri");
        if (this.f5684i.e()) {
            return m();
        }
        g.e.k.d dVar = new g.e.k.d();
        try {
            aVar = g.e.m.a.f9908e.d(AuthToken.from(str));
        } catch (Exception e2) {
            String str2 = "Failed to parse token. " + e2.getMessage();
            n.a.a.m(e2, str2, new Object[0]);
            aVar = g.e.m.a.f9908e.c(new IllegalArgumentException(str2));
        }
        dVar.w(aVar);
        return r(dVar);
    }

    public final g.e.k.e<g.e.m.a<Void, Void>> t(String str) {
        k.e(str, "deviceId");
        return j.b(s(str));
    }

    public final g.e.k.e<g.e.m.a<Void, Void>> u(String str, String str2) {
        k.e(str, "username");
        k.e(str2, "password");
        if (this.f5684i.e()) {
            return m();
        }
        n.a.a.a("Logging user '" + str + '\'', new Object[0]);
        com.sensorberg.smartspaces.backend.q.h hVar = this.f5683h;
        retrofit2.b<AuthToken> g2 = this.f5682g.g(new LoginData(str, str2, this.a));
        k.d(g2, "backendApi.login(LoginDa…name, password, oauthId))");
        return r(hVar.b(g2));
    }
}

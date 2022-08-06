package com.sensorberg.smartspaces.backend.m;

import android.content.SharedPreferences;
import androidx.lifecycle.f0;
import com.sensorberg.encryptor.d;
import com.sensorberg.smartspaces.backend.f;
import com.sensorberg.smartspaces.backend.model.AuthToken;
import com.sensorberg.smartspaces.backend.model.User;
import com.sensorberg.smartspaces.backend.model.UserDevice;
import com.sensorberg.smartspaces.backend.model.settings.AppSettings;
import g.e.k.d;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: ObservableBackendStatus.kt */
public final class e {
    /* access modifiers changed from: private */
    public final d<f> a = new d<>();
    /* access modifiers changed from: private */
    public final SharedPreferences b;
    private final com.sensorberg.encryptor.d c;

    /* renamed from: d  reason: collision with root package name */
    private final d f6033d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final i f6034e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final a f6035f;

    /* compiled from: ObservableBackendStatus.kt */
    static final class a<T> implements f0<d.C0159d> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f6036g;

        a(e eVar) {
            this.f6036g = eVar;
        }

        /* renamed from: a */
        public final void k(d.C0159d dVar) {
            if (dVar instanceof d.C0159d.b) {
                this.f6036g.a.w(new f.a(((d.C0159d.b) dVar).a()));
            }
        }
    }

    /* compiled from: ObservableBackendStatus.kt */
    static final class b extends l implements kotlin.e0.c.l<AuthToken, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f6037h;

        /* compiled from: ObservableBackendStatus.kt */
        static final class a extends l implements kotlin.e0.c.l<UserDevice, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ b f6038h;

            /* renamed from: com.sensorberg.smartspaces.backend.m.e$b$a$a  reason: collision with other inner class name */
            /* compiled from: ObservableBackendStatus.kt */
            static final class C0340a extends l implements kotlin.e0.c.l<User, x> {

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ a f6039h;

                /* renamed from: com.sensorberg.smartspaces.backend.m.e$b$a$a$a  reason: collision with other inner class name */
                /* compiled from: ObservableBackendStatus.kt */
                static final class C0341a extends l implements kotlin.e0.c.l<AppSettings, x> {

                    /* renamed from: h  reason: collision with root package name */
                    final /* synthetic */ C0340a f6040h;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0341a(C0340a aVar) {
                        super(1);
                        this.f6040h = aVar;
                    }

                    public final void a(AppSettings appSettings) {
                        k.e(appSettings, "it");
                        n.a.a.f("AuthToken, UserDevice, User and Settings loaded. Backend status = READY", new Object[0]);
                        this.f6040h.f6039h.f6038h.f6037h.b.edit().putBoolean("is_initialized", true).apply();
                        this.f6040h.f6039h.f6038h.f6037h.a.w(f.C0185f.a);
                    }

                    public /* bridge */ /* synthetic */ Object o(Object obj) {
                        a((AppSettings) obj);
                        return x.a;
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0340a(a aVar) {
                    super(1);
                    this.f6039h = aVar;
                }

                public final void a(User user) {
                    k.e(user, "it");
                    this.f6039h.f6038h.f6037h.f6035f.p(new C0341a(this));
                }

                public /* bridge */ /* synthetic */ Object o(Object obj) {
                    a((User) obj);
                    return x.a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(1);
                this.f6038h = bVar;
            }

            public final void a(UserDevice userDevice) {
                k.e(userDevice, "it");
                this.f6038h.f6037h.f6035f.q(new C0340a(this));
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((UserDevice) obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(1);
            this.f6037h = eVar;
        }

        public final void a(AuthToken authToken) {
            k.e(authToken, "it");
            this.f6037h.f6034e.d(new a(this));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((AuthToken) obj);
            return x.a;
        }
    }

    public e(SharedPreferences sharedPreferences, com.sensorberg.encryptor.d dVar, d dVar2, i iVar, a aVar) {
        k.e(sharedPreferences, "prefs");
        k.e(dVar, "encryptor");
        k.e(dVar2, "authToken");
        k.e(iVar, "userDevice");
        k.e(aVar, "coreObservables");
        this.b = sharedPreferences;
        this.c = dVar;
        this.f6033d = dVar2;
        this.f6034e = iVar;
        this.f6035f = aVar;
        g();
        i();
        j();
    }

    private final void g() {
        Object obj;
        boolean z = this.b.getBoolean("is_initialized", false);
        g.e.k.d<f> dVar = this.a;
        if (z) {
            obj = f.c.a;
        } else {
            obj = f.e.a;
        }
        dVar.w(obj);
    }

    private final void i() {
        this.c.a().p(new a(this));
    }

    private final void j() {
        this.f6033d.c(new b(this));
    }

    public final boolean e() {
        return (this.a.n() instanceof f.c) || (this.a.n() instanceof f.C0185f);
    }

    public final g.e.k.e<f> f() {
        return this.a;
    }

    public final void h() {
        this.a.w(f.c.a);
    }

    public final void k(String str) {
        k.e(str, "message");
        this.a.w(new f.b(str));
    }

    public final void l(String str) {
        k.e(str, "message");
        this.a.w(new f.d(str));
    }
}

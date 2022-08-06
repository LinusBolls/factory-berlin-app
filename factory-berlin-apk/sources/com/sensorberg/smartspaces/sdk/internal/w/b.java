package com.sensorberg.smartspaces.sdk.internal.w;

import androidx.lifecycle.LiveData;
import com.sensorberg.smartspaces.backend.f;
import com.sensorberg.smartspaces.backend.model.User;
import com.sensorberg.smartspaces.sdk.internal.d;
import g.e.k.h;
import g.e.n.g.y;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: UserManagerImpl.kt */
public final class b implements y {
    private final AtomicBoolean a = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public final g.e.k.d<y.a> b = new g.e.k.d<>();
    private final l<g.e.m.a<User, Void>, g.e.m.a<com.sensorberg.smartspaces.sdk.model.User, Void>> c = f.f6869h;

    /* renamed from: d  reason: collision with root package name */
    private final LiveData<g.e.m.a<com.sensorberg.smartspaces.sdk.model.User, Void>> f6852d = com.sensorberg.smartspaces.sdk.internal.f.b(h.a.b(this.f6855g.A(), this.c), this.f6856h).x();

    /* renamed from: e  reason: collision with root package name */
    private final g.e.k.e<y.a> f6853e = l();

    /* renamed from: f  reason: collision with root package name */
    private final kotlin.e f6854f = g.a(new e(this));
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final com.sensorberg.smartspaces.backend.a f6855g;

    /* renamed from: h  reason: collision with root package name */
    private final g.e.k.a f6856h;

    /* renamed from: i  reason: collision with root package name */
    private final g.e.k.a f6857i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final com.sensorberg.smartspaces.sdk.internal.p.e f6858j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final kotlin.e0.c.a<x> f6859k;

    /* compiled from: UserManagerImpl.kt */
    static final class a extends kotlin.jvm.internal.l implements l<y.a, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6860h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.f6860h = bVar;
        }

        public final void a(y.a aVar) {
            n.a.a.f("SmartWorkspace SDK status is: " + aVar, new Object[0]);
            if (aVar instanceof y.a.b) {
                y.a.b bVar = (y.a.b) aVar;
                int i2 = a.a[bVar.b().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    this.f6860h.m(bVar.b(), bVar.a());
                }
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((y.a) obj);
            return x.a;
        }
    }

    /* renamed from: com.sensorberg.smartspaces.sdk.internal.w.b$b  reason: collision with other inner class name */
    /* compiled from: UserManagerImpl.kt */
    static final class C0415b extends kotlin.jvm.internal.l implements l<Object, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6861h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g.e.k.c f6862i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6863j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0415b(b bVar, g.e.k.c cVar, g.e.k.e eVar) {
            super(1);
            this.f6861h = bVar;
            this.f6862i = cVar;
            this.f6863j = eVar;
        }

        public final void a(Object obj) {
            y.a aVar = (y.a) this.f6861h.b.n();
            if (aVar != null) {
                this.f6862i.w(aVar);
                return;
            }
            this.f6862i.w(this.f6861h.n((com.sensorberg.smartspaces.backend.f) this.f6863j.n(), (y.a) this.f6862i.n()));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a(obj);
            return x.a;
        }
    }

    /* compiled from: UserManagerImpl.kt */
    static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6864h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.f6864h = bVar;
        }

        public final void a() {
            this.f6864h.f6855g.i();
            this.f6864h.f6858j.destroy();
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: UserManagerImpl.kt */
    static final class d extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6865h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ y.a.e f6866i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f6867j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, y.a.e eVar, String str) {
            super(0);
            this.f6865h = bVar;
            this.f6866i = eVar;
            this.f6867j = str;
        }

        public final void a() {
            this.f6865h.b.w(new y.a.c(this.f6866i, this.f6867j));
            this.f6865h.f6859k.d();
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: UserManagerImpl.kt */
    static final class e extends kotlin.jvm.internal.l implements kotlin.e0.c.a<LiveData<y.a>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6868h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.f6868h = bVar;
        }

        /* renamed from: a */
        public final LiveData<y.a> d() {
            return this.f6868h.k().x();
        }
    }

    /* compiled from: UserManagerImpl.kt */
    static final class f extends kotlin.jvm.internal.l implements l<g.e.m.a<User, Void>, g.e.m.a<com.sensorberg.smartspaces.sdk.model.User, Void>> {

        /* renamed from: h  reason: collision with root package name */
        public static final f f6869h = new f();

        /* compiled from: UserManagerImpl.kt */
        static final class a extends kotlin.jvm.internal.l implements l<User, com.sensorberg.smartspaces.sdk.model.User> {

            /* renamed from: h  reason: collision with root package name */
            public static final a f6870h = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final com.sensorberg.smartspaces.sdk.model.User o(User user) {
                if (user == null) {
                    return null;
                }
                String str = user.id;
                k.d(str, "it.id");
                return new com.sensorberg.smartspaces.sdk.model.User(str, user.fullName, user.email);
            }
        }

        f() {
            super(1);
        }

        /* renamed from: a */
        public final g.e.m.a<com.sensorberg.smartspaces.sdk.model.User, Void> o(g.e.m.a<User, Void> aVar) {
            if (aVar != null) {
                return g.e.m.b.a(aVar, a.f6870h);
            }
            return null;
        }
    }

    public b(com.sensorberg.smartspaces.backend.a aVar, g.e.k.a aVar2, g.e.k.a aVar3, com.sensorberg.smartspaces.sdk.internal.p.e eVar, kotlin.e0.c.a<x> aVar4) {
        k.e(aVar, "backend");
        k.e(aVar2, "logOutEvent");
        k.e(aVar3, "cancellation");
        k.e(eVar, "blueId");
        k.e(aVar4, "dependencyReload");
        this.f6855g = aVar;
        this.f6856h = aVar2;
        this.f6857i = aVar3;
        this.f6858j = eVar;
        this.f6859k = aVar4;
        f(this.f6853e);
    }

    private final void f(g.e.k.e<y.a> eVar) {
        eVar.r(new a(this));
    }

    private final LiveData<y.a> j() {
        return (LiveData) this.f6854f.getValue();
    }

    private final g.e.k.e<y.a> l() {
        g.e.k.c cVar = new g.e.k.c();
        g.e.k.e<com.sensorberg.smartspaces.backend.f> y = this.f6855g.y();
        C0415b bVar = new C0415b(this, cVar, y);
        cVar.z(y, bVar);
        cVar.z(this.b, bVar);
        return h.a.a(cVar);
    }

    /* access modifiers changed from: private */
    public final y.a n(com.sensorberg.smartspaces.backend.f fVar, y.a aVar) {
        if (fVar instanceof f.e) {
            if (aVar instanceof y.a.c) {
                return (y.a.c) aVar;
            }
            if (!(aVar instanceof y.a.b)) {
                return new y.a.c(y.a.e.NotLoggedIn, "First boot");
            }
            y.a.b bVar = (y.a.b) aVar;
            return new y.a.c(bVar.b(), bVar.a());
        } else if (fVar instanceof f.a) {
            return new y.a.b(y.a.e.EncryptionFailure, ((f.a) fVar).a());
        } else {
            if (fVar instanceof f.d) {
                return new y.a.c(y.a.e.UserNotAuthorised, ((f.d) fVar).a());
            }
            if (fVar instanceof f.c) {
                return y.a.C0726a.a;
            }
            if (fVar instanceof f.C0185f) {
                return y.a.d.a;
            }
            if (fVar instanceof f.b) {
                return new y.a.b(y.a.e.UserNotAuthorised, ((f.b) fVar).a());
            }
            if (fVar == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public LiveData<g.e.m.a<Void, Void>> A(String str) {
        k.e(str, "authenticationToken");
        return com.sensorberg.smartspaces.sdk.internal.f.b(this.f6855g.l(str), this.f6856h).x();
    }

    public void g() {
        m(y.a.e.ClientApplicationRequestedLogout, "Client application requested logout");
    }

    public LiveData<y.a> getStatusLiveData() {
        return j();
    }

    public LiveData<g.e.m.a<com.sensorberg.smartspaces.sdk.model.User, Void>> h() {
        return this.f6852d;
    }

    public LiveData<g.e.m.a<Void, Void>> i(String str, String str2) {
        k.e(str, "username");
        k.e(str2, "password");
        return com.sensorberg.smartspaces.sdk.internal.f.b(this.f6855g.N(str, str2), this.f6856h).x();
    }

    public final g.e.k.e<y.a> k() {
        return this.f6853e;
    }

    public final void m(y.a.e eVar, String str) {
        k.e(eVar, "reason");
        k.e(str, "message");
        if (!this.a.compareAndSet(false, true)) {
            n.a.a.k("SDK is already " + this.f6853e.n(), new Object[0]);
            return;
        }
        this.f6857i.b();
        this.b.w(new y.a.b(eVar, str));
        this.f6855g.I();
        n.a.a.l(new RuntimeException("Logging out because `" + str + "`. Stacktrace is:"));
        g.e.e.a aVar = g.e.e.a.f9778f;
        aVar.j(aVar.d(), new c(this)).g(g.e.e.a.f9778f.e(), new d(this, eVar, str));
    }

    public LiveData<g.e.m.a<Void, Void>> w(String str, String str2, String str3) {
        k.e(str, "currentPassword");
        k.e(str2, "newPassword");
        k.e(str3, "newPasswordConfirmation");
        if (this.f6856h.c()) {
            return com.sensorberg.smartspaces.sdk.internal.f.a(d.c.a);
        }
        return com.sensorberg.smartspaces.sdk.internal.f.b(this.f6855g.h(str, str2, str3), this.f6856h).x();
    }

    public LiveData<g.e.m.a<Void, Void>> y(String str) {
        k.e(str, "redirectedUri");
        return com.sensorberg.smartspaces.sdk.internal.f.b(this.f6855g.C(str), this.f6856h).x();
    }
}

package com.sensorberg.smartspaces.sdk.internal.r;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.f0;
import androidx.lifecycle.m0;
import com.sensorberg.smartspaces.sdk.model.User;
import g.e.n.g.y;
import kotlin.jvm.internal.k;

/* compiled from: UserManagerDecorator.kt */
public final class j extends a<y> implements y {
    public static final a c = new a((DefaultConstructorMarker) null);
    private final LiveData<y.a> b = G();

    /* compiled from: UserManagerDecorator.kt */
    public static final class a {
        private a() {
        }

        public final y.a a(y.a aVar, y.a aVar2) {
            k.e(aVar, "newStatus");
            if (!(aVar2 instanceof y.a.b) || !(aVar instanceof y.a.c)) {
                return aVar;
            }
            y.a.b bVar = (y.a.b) aVar2;
            return new y.a.c(bVar.b(), bVar.a());
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: UserManagerDecorator.kt */
    static final class b<I, O> implements e.b.a.c.a<y, LiveData<g.e.m.a<User, Void>>> {
        public static final b a = new b();

        b() {
        }

        /* renamed from: b */
        public final LiveData<g.e.m.a<User, Void>> a(y yVar) {
            if (yVar != null) {
                return yVar.h();
            }
            return null;
        }
    }

    /* compiled from: UserManagerDecorator.kt */
    public static final class c implements f0<y> {

        /* renamed from: g  reason: collision with root package name */
        private LiveData<y.a> f6549g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c0 f6550h;

        /* compiled from: UserManagerDecorator.kt */
        static final class a<T> implements f0<y.a> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ c f6551g;

            a(c cVar) {
                this.f6551g = cVar;
            }

            /* renamed from: a */
            public final void k(y.a aVar) {
                c0 c0Var = this.f6551g.f6550h;
                a aVar2 = j.c;
                k.d(aVar, "newStatus");
                c0Var.u(aVar2.a(aVar, (y.a) this.f6551g.f6550h.l()));
            }
        }

        c(c0 c0Var) {
            this.f6550h = c0Var;
        }

        /* renamed from: a */
        public void k(y yVar) {
            LiveData<y.a> statusLiveData = yVar != null ? yVar.getStatusLiveData() : null;
            if (!k.a(this.f6549g, statusLiveData)) {
                LiveData<y.a> liveData = this.f6549g;
                if (liveData != null) {
                    this.f6550h.w(liveData);
                }
                this.f6549g = statusLiveData;
                if (statusLiveData != null) {
                    this.f6550h.v(statusLiveData, new a(this));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(y yVar) {
        super(yVar);
        k.e(yVar, "first");
    }

    private final LiveData<y.a> G() {
        c0 c0Var = new c0();
        c0Var.v(E(), new c(c0Var));
        return c0Var;
    }

    public LiveData<g.e.m.a<Void, Void>> A(String str) {
        k.e(str, "authenticationToken");
        return ((y) D()).A(str);
    }

    public void g() {
        ((y) D()).g();
    }

    public LiveData<y.a> getStatusLiveData() {
        return this.b;
    }

    public LiveData<g.e.m.a<User, Void>> h() {
        LiveData<g.e.m.a<User, Void>> c2 = m0.c(E(), b.a);
        k.d(c2, "Transformations.switchMa…{ it?.getUserLiveData() }");
        return c2;
    }

    public LiveData<g.e.m.a<Void, Void>> i(String str, String str2) {
        k.e(str, "username");
        k.e(str2, "password");
        return ((y) D()).i(str, str2);
    }

    public LiveData<g.e.m.a<Void, Void>> w(String str, String str2, String str3) {
        k.e(str, "currentPassword");
        k.e(str2, "newPassword");
        k.e(str3, "newPasswordConfirmation");
        return ((y) D()).w(str, str2, str3);
    }

    public LiveData<g.e.m.a<Void, Void>> y(String str) {
        k.e(str, "redirectedUri");
        return ((y) D()).y(str);
    }
}

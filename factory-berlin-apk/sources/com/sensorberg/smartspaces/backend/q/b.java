package com.sensorberg.smartspaces.backend.q;

import com.sensorberg.smartspaces.backend.m.d;
import com.sensorberg.smartspaces.backend.model.AuthToken;
import java.util.List;
import java.util.ListIterator;
import k.b0;
import k.d0;
import k.w;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: AuthTokenInterceptor.kt */
public final class b implements w {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final List<String> f6075d = n.i("/oauth/token?type=login", "/oauth/token?type=token");

    /* renamed from: e  reason: collision with root package name */
    public static final C0347b f6076e = new C0347b((DefaultConstructorMarker) null);
    private volatile String b;
    private final d c;

    /* compiled from: AuthTokenInterceptor.kt */
    static final class a extends l implements kotlin.e0.c.l<AuthToken, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6077h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.f6077h = bVar;
        }

        public final void a(AuthToken authToken) {
            k.e(authToken, "it");
            this.f6077h.c(authToken.accessToken);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((AuthToken) obj);
            return x.a;
        }
    }

    /* renamed from: com.sensorberg.smartspaces.backend.q.b$b  reason: collision with other inner class name */
    /* compiled from: AuthTokenInterceptor.kt */
    public static final class C0347b {
        private C0347b() {
        }

        public final List<String> a() {
            return b.f6075d;
        }

        public final boolean b(w.a aVar) {
            k.e(aVar, "chain");
            return c(aVar.j());
        }

        public final boolean c(b0 b0Var) {
            String str;
            k.e(b0Var, "request");
            String vVar = b0Var.k().toString();
            List<String> a = a();
            ListIterator<String> listIterator = a.listIterator(a.size());
            while (true) {
                str = null;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                String previous = listIterator.previous();
                if (q.I(vVar, previous, false, 2, (Object) null)) {
                    str = previous;
                    break;
                }
            }
            return str == null;
        }

        public /* synthetic */ C0347b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(d dVar) {
        k.e(dVar, "token");
        this.c = dVar;
        dVar.c(new a(this));
    }

    public d0 a(w.a aVar) {
        k.e(aVar, "chain");
        if (f6076e.b(aVar)) {
            int i2 = 0;
            while (this.b == null && i2 <= 10) {
                i2++;
                Thread.sleep(333);
            }
            if (this.b != null) {
                b0.a i3 = aVar.j().i();
                i3.i("authorization");
                i3.a("authorization", "Bearer " + this.b);
                return aVar.a(i3.b());
            }
        }
        return aVar.a(aVar.j());
    }

    public final void c(String str) {
        this.b = str;
    }
}

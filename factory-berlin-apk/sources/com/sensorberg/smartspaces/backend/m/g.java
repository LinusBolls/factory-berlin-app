package com.sensorberg.smartspaces.backend.m;

import com.sensorberg.smartspaces.backend.j.a;
import com.sensorberg.smartspaces.backend.model.AuthToken;
import com.sensorberg.smartspaces.backend.q.p.e;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: ObservableIotDevices.kt */
public final class g {
    /* access modifiers changed from: private */
    public final d a;
    /* access modifiers changed from: private */
    public final e b;

    /* compiled from: ObservableIotDevices.kt */
    static final class a extends l implements kotlin.e0.c.a<g.e.k.e<g.e.m.a<a.i, Void>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g f6044h;

        /* renamed from: com.sensorberg.smartspaces.backend.m.g$a$a  reason: collision with other inner class name */
        /* compiled from: ObservableIotDevices.kt */
        static final class C0342a extends l implements kotlin.e0.c.l<AuthToken, g.e.k.e<g.e.m.a<a.i, Void>>> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f6045h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0342a(a aVar) {
                super(1);
                this.f6045h = aVar;
            }

            /* renamed from: a */
            public final g.e.k.e<g.e.m.a<a.i, Void>> o(AuthToken authToken) {
                k.e(authToken, "it");
                return this.f6045h.f6044h.b.a(new com.sensorberg.smartspaces.backend.j.a());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(0);
            this.f6044h = gVar;
        }

        /* renamed from: a */
        public final g.e.k.e<g.e.m.a<a.i, Void>> d() {
            return this.f6044h.a.e(new C0342a(this));
        }
    }

    public g(d dVar, e eVar) {
        k.e(dVar, "authToken");
        k.e(eVar, "observableApolloOperationFactory");
        this.a = dVar;
        this.b = eVar;
        kotlin.e<T> unused = g.a(new a(this));
    }
}

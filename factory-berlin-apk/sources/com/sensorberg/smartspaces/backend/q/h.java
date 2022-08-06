package com.sensorberg.smartspaces.backend.q;

import com.github.jasminb.jsonapi.d;
import com.sensorberg.smartspaces.backend.e;
import com.sensorberg.smartspaces.backend.l.a;
import com.sensorberg.smartspaces.backend.model.BeBooking;
import com.sensorberg.smartspaces.backend.model.User;
import com.sensorberg.smartspaces.backend.model.units.BeUnit;
import com.sensorberg.smartspaces.backend.q.f;
import java.util.List;
import k.b0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;

/* compiled from: ObservableRetrofitCallFactory.kt */
public final class h implements com.sensorberg.smartspaces.backend.l.a {

    /* renamed from: j  reason: collision with root package name */
    public static final a f6085j = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final e f6086g;

    /* renamed from: h  reason: collision with root package name */
    private final c f6087h;

    /* renamed from: i  reason: collision with root package name */
    private final k f6088i;

    /* compiled from: ObservableRetrofitCallFactory.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public final boolean b(retrofit2.b<?> bVar) {
            b0 j2 = bVar.j();
            if (p.q(j2.h(), "get", true)) {
                f.c cVar = f.f6084d;
                k.d(j2, "request");
                if (!cVar.a(j2)) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ObservableRetrofitCallFactory.kt */
    static final class b extends l implements kotlin.e0.c.l<d<?>, x> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f6089h = new b();

        b() {
            super(1);
        }

        public final void a(d<?> dVar) {
            k.e(dVar, "it");
            dVar.e();
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((d) obj);
            return x.a;
        }
    }

    public h(c cVar, g.e.k.a aVar, k kVar) {
        k.e(cVar, "backendApi");
        k.e(aVar, "cancellation");
        k.e(kVar, "responseErrorHandler");
        this.f6087h = cVar;
        this.f6088i = kVar;
        this.f6086g = e.f6080g.b(cVar, aVar, kVar);
    }

    public final <T> g<T> a(retrofit2.b<T> bVar) {
        g<T> gVar;
        k.e(bVar, "call");
        if (f6085j.b(bVar)) {
            gVar = this.f6086g.d(bVar).b();
        } else {
            gVar = new g<>(this.f6088i);
        }
        gVar.E(bVar);
        return gVar;
    }

    public final <T> g<T> b(retrofit2.b<T> bVar) {
        k.e(bVar, "call");
        g<T> gVar = new g<>(this.f6088i);
        gVar.E(bVar);
        return gVar;
    }

    public final void c(e eVar) {
        k.e(eVar, "refresh");
        int i2 = i.a[eVar.ordinal()];
        if (i2 == 1) {
            this.f6086g.b(b.f6089h);
        } else if (i2 == 2) {
            retrofit2.b<d<User>> m2 = this.f6087h.m();
            k.d(m2, "backendApi.user");
            d(m2);
        } else if (i2 == 3) {
            retrofit2.b<d<List<BeUnit>>> o = this.f6087h.o();
            k.d(o, "backendApi.unitsFromNetwork");
            d(o);
        } else if (i2 == 4) {
            retrofit2.b<d<List<BeBooking>>> b2 = this.f6087h.b();
            k.d(b2, "backendApi.myBookings");
            d(b2);
        }
    }

    public final void d(retrofit2.b<?> bVar) {
        k.e(bVar, "call");
        d<?> c = this.f6086g.c(bVar);
        if (c != null) {
            c.e();
        }
    }

    public m.a.c.a n() {
        return a.C0333a.a(this);
    }
}

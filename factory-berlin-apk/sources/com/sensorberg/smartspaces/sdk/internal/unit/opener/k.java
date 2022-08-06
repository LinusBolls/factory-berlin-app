package com.sensorberg.smartspaces.sdk.internal.unit.opener;

import com.sensorberg.smartspaces.backend.model.ActuatorRequest;
import com.sensorberg.smartspaces.backend.model.Statistics;
import com.sensorberg.smartspaces.sdk.exception.GattException;
import com.sensorberg.smartspaces.sdk.internal.Connector;
import com.sensorberg.smartspaces.sdk.internal.unit.opener.e;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.k.h;
import g.e.m.a;
import g.e.n.g.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e;
import kotlin.j;
import kotlin.jvm.internal.l;
import kotlin.x;
import no.nordicsemi.android.support.v18.scanner.m;

/* compiled from: GatewayOpener.kt */
public final class k extends m {
    public static final a D = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final Statistics A;
    /* access modifiers changed from: private */
    public final com.sensorberg.smartspaces.backend.a B;
    private final l C;
    private final e v = g.a(b.f6761h);
    private List<? extends d> w;
    /* access modifiers changed from: private */
    public final IotUnit x;
    /* access modifiers changed from: private */
    public final Connector.c y;
    private final m z;

    /* compiled from: GatewayOpener.kt */
    public static final class a {
        private a() {
        }

        private final e a(List<? extends e> list) {
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (next instanceof e.b.a) {
                    arrayList.add(next);
                }
            }
            Object obj = null;
            if (!(list.size() == arrayList.size())) {
                return null;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    long c = ((e.b.a) obj).c();
                    do {
                        Object next2 = it.next();
                        long c2 = ((e.b.a) next2).c();
                        if (c < c2) {
                            obj = next2;
                            c = c2;
                        }
                    } while (it.hasNext());
                }
            }
            if (obj != null) {
                e.b.a aVar = (e.b.a) obj;
                Exception b = aVar.b();
                if ((b instanceof IOException) || (b instanceof GatewayServerException) || (b instanceof GattException)) {
                    return aVar;
                }
                n.a.a.k("Communication failure with unexpected exception type " + aVar.b() + '.', new Object[0]);
                String message = aVar.b().getMessage();
                if (message == null) {
                    message = "Failed to communicate";
                }
                return new e.b.a(aVar.c(), aVar.a(), new IOException(message));
            }
            throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartspaces.sdk.internal.unit.opener.ChannelResponse.Fail.CommunicationFail");
        }

        private final e b(List<? extends e> list) {
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (next instanceof e.b.c) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (T next2 : list) {
                if (next2 instanceof e.b.a) {
                    arrayList2.add(next2);
                }
            }
            boolean z = true;
            if (!(!arrayList.isEmpty()) || list.size() != arrayList.size() + arrayList2.size()) {
                z = false;
            }
            Object obj = null;
            if (!z) {
                return null;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    long c = ((e.b.c) obj).c();
                    do {
                        Object next3 = it.next();
                        long c2 = ((e.b.c) next3).c();
                        if (c < c2) {
                            obj = next3;
                            c = c2;
                        }
                    } while (it.hasNext());
                }
            }
            return (e) obj;
        }

        public final e c(List<? extends e> list) {
            T t;
            kotlin.jvm.internal.k.e(list, "channelResponseList");
            T t2 = null;
            if (v.w(list).isEmpty()) {
                return null;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((e) t) instanceof e.a) {
                    break;
                }
            }
            e eVar = (e) t;
            if (eVar != null) {
                return eVar;
            }
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next = it2.next();
                if (((e) next) instanceof e.b.C0408b) {
                    t2 = next;
                    break;
                }
            }
            e eVar2 = (e) t2;
            if (eVar2 != null) {
                return eVar2;
            }
            e b = b(list);
            if (b != null) {
                return b;
            }
            return a(list);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: GatewayOpener.kt */
    static final class b extends l implements kotlin.e0.c.a<RuntimeException> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f6761h = new b();

        b() {
            super(0);
        }

        /* renamed from: a */
        public final RuntimeException d() {
            return new RuntimeException("Internal Cancel");
        }
    }

    /* compiled from: GatewayOpener.kt */
    public static final class c implements kotlin.e0.c.l<e, x> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ k f6762g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6763h;

        c(k kVar, g.e.k.e eVar) {
            this.f6762g = kVar;
            this.f6763h = eVar;
        }

        private final void a(f fVar) {
            this.f6763h.v(this);
            for (d a : k.H(this.f6762g)) {
                a.a(this.f6762g.N());
            }
            fVar.a(this.f6762g.A);
            this.f6762g.B.H(this.f6762g.A);
        }

        public void b(e eVar) {
            g.e.m.a aVar;
            if (eVar != null) {
                k kVar = this.f6762g;
                if (eVar instanceof e.a) {
                    a(((e.a) eVar).a());
                    aVar = g.e.m.a.f9908e.d(this.f6762g.x);
                } else if (eVar instanceof e.b.C0408b) {
                    e.b.C0408b bVar = (e.b.C0408b) eVar;
                    kVar.B.M(this.f6762g.A.getRequestId(), ActuatorRequest.STATE_FAILED, bVar.b().getMessage(), this.f6762g.x.getUnitId(), this.f6762g.y.b(), this.f6762g.x.getActuatorId(), this.f6762g.x.getAction$sdk_release());
                    a(bVar.a());
                    aVar = g.e.m.a.f9908e.c(bVar.b());
                } else if (eVar instanceof e.b.a) {
                    e.b.a aVar2 = (e.b.a) eVar;
                    kVar.B.M(this.f6762g.A.getRequestId(), ActuatorRequest.STATE_FAILED, aVar2.b().getMessage(), this.f6762g.x.getUnitId(), this.f6762g.y.b(), this.f6762g.x.getActuatorId(), this.f6762g.x.getAction$sdk_release());
                    a(aVar2.a());
                    aVar = g.e.m.a.f9908e.c(aVar2.b());
                } else if (eVar instanceof e.b.c) {
                    e.b.c cVar = (e.b.c) eVar;
                    a(cVar.a());
                    aVar = g.e.m.a.f9908e.c(cVar.b());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                kVar.w(aVar);
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            b((e) obj);
            return x.a;
        }
    }

    /* compiled from: GatewayOpener.kt */
    static final class d extends l implements kotlin.e0.c.l<e, e> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ k f6764h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(k kVar) {
            super(1);
            this.f6764h = kVar;
        }

        /* renamed from: a */
        public final e o(e eVar) {
            List<d> H = k.H(this.f6764h);
            ArrayList arrayList = new ArrayList(o.p(H, 10));
            for (d n2 : H) {
                arrayList.add((e) n2.n());
            }
            return k.D.c(arrayList);
        }
    }

    public k(IotUnit iotUnit, Connector.c cVar, m mVar, Statistics statistics, com.sensorberg.smartspaces.backend.a aVar, l lVar) {
        kotlin.jvm.internal.k.e(iotUnit, "iotUnit");
        kotlin.jvm.internal.k.e(cVar, "sensorbergGateway1");
        kotlin.jvm.internal.k.e(mVar, "scanResult");
        kotlin.jvm.internal.k.e(statistics, "statistics");
        kotlin.jvm.internal.k.e(aVar, "backend");
        kotlin.jvm.internal.k.e(lVar, "openerFactory");
        this.x = iotUnit;
        this.y = cVar;
        this.z = mVar;
        this.A = statistics;
        this.B = aVar;
        this.C = lVar;
    }

    public static final /* synthetic */ List H(k kVar) {
        List<? extends d> list = kVar.w;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.k.q("channels");
        throw null;
    }

    /* access modifiers changed from: private */
    public final RuntimeException N() {
        return (RuntimeException) this.v.getValue();
    }

    /* access modifiers changed from: protected */
    public void E(Exception exc) {
        kotlin.jvm.internal.k.e(exc, "exception");
        List<? extends d> list = this.w;
        if (list != null) {
            for (d a2 : list) {
                a2.a(exc);
            }
            return;
        }
        kotlin.jvm.internal.k.q("channels");
        throw null;
    }

    public void F() {
        n.a.a.a("Starting GatewayOpener. Connecting to " + this.x.getDisplayName(), new Object[0]);
        j<g.e.k.e<String>, g.e.k.e<g.e.m.a<ActuatorRequest, Void>>> m2 = this.B.m(this.x.getUnitId(), this.y.b(), this.x.getActuatorId(), this.x.getAction$sdk_release(), this.A.getRequestId(), this.y.g());
        g.e.k.e a2 = m2.a();
        g.e.k.e b2 = m2.b();
        List<? extends d> j2 = n.j(a2 != null ? this.C.b(a2, this.x, this.z) : null, b2 != null ? this.C.c(this.x, b2) : null);
        this.w = j2;
        if (j2 == null) {
            kotlin.jvm.internal.k.q("channels");
            throw null;
        } else if (j2.isEmpty()) {
            w(g.e.m.a.f9908e.c(new IOException("No communication channels available")));
        } else {
            w(new g.e.m.a(a.b.EXECUTING, this.x, i.Connecting, (Exception) null));
            h hVar = h.a;
            List<? extends d> list = this.w;
            if (list != null) {
                g.e.k.e f2 = h.f(hVar, list, (g.e.k.a) null, new d(this), 2, (Object) null);
                f2.r(new c(this, f2));
                return;
            }
            kotlin.jvm.internal.k.q("channels");
            throw null;
        }
    }
}

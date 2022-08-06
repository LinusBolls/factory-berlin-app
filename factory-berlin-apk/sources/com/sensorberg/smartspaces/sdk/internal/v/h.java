package com.sensorberg.smartspaces.sdk.internal.v;

import com.sensorberg.smartspaces.sdk.internal.s.d;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.n.c.d.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.x;

/* compiled from: WaitFor.kt */
public final class h implements com.sensorberg.smartspaces.sdk.internal.s.d {

    /* renamed from: g  reason: collision with root package name */
    public static final h f6844g = new h();

    /* compiled from: WaitFor.kt */
    public interface a {
        void a();

        Collection<g.e.k.e<? extends Object>> b();
    }

    /* compiled from: WaitFor.kt */
    static final class b extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.e.k.a f6845h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g.e.k.e f6846i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6847j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g.e.k.a aVar, g.e.k.e eVar, kotlin.e0.c.a aVar2) {
            super(0);
            this.f6845h = aVar;
            this.f6846i = eVar;
            this.f6847j = aVar2;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(this.f6845h, this.f6846i, this.f6847j);
        }
    }

    /* compiled from: WaitFor.kt */
    static final class c extends l implements kotlin.e0.c.a<m.a.c.i.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.e.k.a f6848h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.l f6849i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g.e.k.a aVar, kotlin.e0.c.l lVar) {
            super(0);
            this.f6848h = aVar;
            this.f6849i = lVar;
        }

        /* renamed from: a */
        public final m.a.c.i.a d() {
            return m.a.c.i.b.b(null, this.f6848h, this.f6849i);
        }
    }

    /* compiled from: WaitFor.kt */
    static final class d implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g.e.k.a f6850g;

        d(g.e.k.a aVar) {
            this.f6850g = aVar;
        }

        public final void run() {
            if (!this.f6850g.c()) {
                n.a.a.a("WaitForIt timed-out", new Object[0]);
                this.f6850g.b();
            }
        }
    }

    /* compiled from: WaitFor.kt */
    static final class e extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6851h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.f6851h = aVar;
        }

        public final void a() {
            this.f6851h.a();
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    private h() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (kotlin.jvm.internal.k.a(r0.b(), ((g.e.n.c.d.b.C0694b) r5).f()) != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (kotlin.jvm.internal.k.a(((com.sensorberg.smartspaces.sdk.internal.Connector.a) r0).f(), ((g.e.n.c.d.b.a) r5).e()) != false) goto L_0x003b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean d(g.e.n.c.d.b r5, com.sensorberg.smartspaces.sdk.model.IotUnit r6) {
        /*
            r4 = this;
            java.util.List r6 = r6.getConnections$sdk_release()
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0069
        L_0x0012:
            java.util.Iterator r6 = r6.iterator()
        L_0x0016:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r6.next()
            com.sensorberg.smartspaces.sdk.internal.Connector r0 = (com.sensorberg.smartspaces.sdk.internal.Connector) r0
            boolean r3 = r5 instanceof g.e.n.c.d.b.C0694b
            if (r3 == 0) goto L_0x003f
            boolean r3 = r0 instanceof com.sensorberg.smartspaces.sdk.internal.Connector.c
            if (r3 == 0) goto L_0x003d
            java.lang.String r0 = r0.b()
            r3 = r5
            g.e.n.c.d.b$b r3 = (g.e.n.c.d.b.C0694b) r3
            java.lang.String r3 = r3.f()
            boolean r0 = kotlin.jvm.internal.k.a(r0, r3)
            if (r0 == 0) goto L_0x003d
        L_0x003b:
            r0 = 1
            goto L_0x0060
        L_0x003d:
            r0 = 0
            goto L_0x0060
        L_0x003f:
            boolean r3 = r5 instanceof g.e.n.c.d.b.a
            if (r3 == 0) goto L_0x005b
            boolean r3 = r0 instanceof com.sensorberg.smartspaces.sdk.internal.Connector.a
            if (r3 == 0) goto L_0x003d
            com.sensorberg.smartspaces.sdk.internal.Connector$a r0 = (com.sensorberg.smartspaces.sdk.internal.Connector.a) r0
            java.lang.String r0 = r0.f()
            r3 = r5
            g.e.n.c.d.b$a r3 = (g.e.n.c.d.b.a) r3
            java.lang.String r3 = r3.e()
            boolean r0 = kotlin.jvm.internal.k.a(r0, r3)
            if (r0 == 0) goto L_0x003d
            goto L_0x003b
        L_0x005b:
            boolean r0 = r5 instanceof g.e.n.c.d.b.c
            if (r0 == 0) goto L_0x0063
            goto L_0x003d
        L_0x0060:
            if (r0 == 0) goto L_0x0016
            goto L_0x0069
        L_0x0063:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.internal.v.h.d(g.e.n.c.d.b, com.sensorberg.smartspaces.sdk.model.IotUnit):boolean");
    }

    private final void g(g.e.k.a aVar, a aVar2, long j2) {
        f.c.b().postDelayed(new d(aVar), j2);
        g.e.k.h.a.g(aVar2.b(), aVar, new e(aVar2));
    }

    public final g.e.k.a a(long j2, g.e.k.e<Boolean> eVar, kotlin.e0.c.a<x> aVar) {
        k.e(aVar, "callback");
        g.e.k.a aVar2 = new g.e.k.a();
        g(aVar2, (a) n().d().e(v.b(a.class), (m.a.c.j.a) null, new b(aVar2, eVar, aVar)), j2);
        return aVar2;
    }

    public final g.e.k.a b(long j2, kotlin.e0.c.l<? super IotUnit, x> lVar) {
        k.e(lVar, "callback");
        g.e.k.a aVar = new g.e.k.a();
        g(aVar, (b) n().d().e(v.b(b.class), (m.a.c.j.a) null, new c(aVar, lVar)), j2);
        return aVar;
    }

    public final IotUnit c(g.e.n.c.d.b bVar, List<IotUnit> list) {
        T t;
        k.e(bVar, "scan");
        k.e(list, "units");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (f6844g.d(bVar, (IotUnit) t)) {
                break;
            }
        }
        IotUnit iotUnit = (IotUnit) t;
        if (iotUnit != null) {
            return iotUnit.updateConnections$sdk_release(bVar);
        }
        return null;
    }

    public final boolean e(g.e.n.c.d.b bVar, g gVar) {
        k.e(bVar, "scan");
        k.e(gVar, "calibration");
        if (bVar instanceof b.C0694b) {
            if (bVar.b() < gVar.c()) {
                return false;
            }
            return true;
        } else if (bVar.c().b() < -60) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean f(IotUnit iotUnit, g.e.n.c.d.b bVar) {
        k.e(iotUnit, "unit");
        k.e(bVar, "scan");
        return iotUnit.hasConnector(bVar);
    }

    public final IotUnit h(IotUnit iotUnit, g.e.n.c.d.b bVar) {
        k.e(iotUnit, "iotUnit");
        k.e(bVar, "bleScan");
        return iotUnit.updateConnections$sdk_release(bVar);
    }

    public m.a.c.a n() {
        return d.a.a(this);
    }
}

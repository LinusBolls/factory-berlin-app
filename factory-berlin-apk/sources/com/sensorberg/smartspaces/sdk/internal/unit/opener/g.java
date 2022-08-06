package com.sensorberg.smartspaces.sdk.internal.unit.opener;

import com.sensorberg.smartspaces.backend.model.Statistics;
import com.sensorberg.smartspaces.sdk.internal.Connector;
import com.sensorberg.smartspaces.sdk.internal.e;
import com.sensorberg.smartspaces.sdk.internal.v.h;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.m.a;
import g.e.n.c.d.b;
import g.e.n.c.d.k;
import g.e.n.g.d;
import g.e.n.g.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.c0.j.a.f;
import kotlin.e0.c.l;
import kotlin.x;
import kotlinx.coroutines.d0;
import no.nordicsemi.android.support.v18.scanner.m;

/* compiled from: FindScanStep.kt */
public final class g extends m {
    private final k A;
    private d v;
    /* access modifiers changed from: private */
    public final IotUnit w;
    /* access modifiers changed from: private */
    public final Statistics x;
    private final l y;
    /* access modifiers changed from: private */
    public final g.e.n.c.d.g z;

    @f(c = "com.sensorberg.smartspaces.sdk.internal.unit.opener.FindScanStep$search$1", f = "FindScanStep.kt", l = {44}, m = "invokeSuspend")
    /* compiled from: FindScanStep.kt */
    static final class a extends kotlin.c0.j.a.k implements l<kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        int f6753k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ g f6754l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Connector f6755m;

        /* renamed from: com.sensorberg.smartspaces.sdk.internal.unit.opener.g$a$a  reason: collision with other inner class name */
        /* compiled from: FindScanStep.kt */
        static final class C0409a extends kotlin.jvm.internal.l implements l<b, Boolean> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f6756h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0409a(a aVar) {
                super(1);
                this.f6756h = aVar;
            }

            public final boolean a(b bVar) {
                kotlin.jvm.internal.k.e(bVar, "it");
                return h.f6844g.f(this.f6756h.f6754l.w, bVar);
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                return Boolean.valueOf(a((b) obj));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, Connector connector, kotlin.c0.d dVar) {
            super(1, dVar);
            this.f6754l = gVar;
            this.f6755m = connector;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6753k;
            if (i2 == 0) {
                kotlin.l.b(obj);
                g.e.n.c.d.g H = this.f6754l.z;
                C0409a aVar = new C0409a(this);
                this.f6753k = 1;
                obj = H.a(aVar, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f6754l.x.markSearchEnd("ble");
            n.a.a.a("Found " + this.f6754l.w.getType() + ' ' + this.f6754l.w.getDisplayName(), new Object[0]);
            g gVar = this.f6754l;
            gVar.K(gVar.w, this.f6755m, ((b) obj).c(), this.f6754l.x);
            return x.a;
        }

        public final Object o(Object obj) {
            return ((a) s((kotlin.c0.d) obj)).i(x.a);
        }

        public final kotlin.c0.d<x> s(kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            return new a(this.f6754l, this.f6755m, dVar);
        }
    }

    public g(IotUnit iotUnit, Statistics statistics, l lVar, g.e.n.c.d.g gVar, k kVar) {
        kotlin.jvm.internal.k.e(iotUnit, "iotUnit");
        kotlin.jvm.internal.k.e(statistics, "statistic");
        kotlin.jvm.internal.k.e(lVar, "openerFactory");
        kotlin.jvm.internal.k.e(gVar, "findFirstBleScanUseCase");
        kotlin.jvm.internal.k.e(kVar, "isScanResultTimedOutUseCase");
        this.w = iotUnit;
        this.x = statistics;
        this.y = lVar;
        this.z = gVar;
        this.A = kVar;
    }

    /* access modifiers changed from: private */
    public final void K(IotUnit iotUnit, Connector connector, m mVar, Statistics statistics) {
        m mVar2;
        w(new g.e.m.a(a.b.EXECUTING, iotUnit, i.Connecting, (Exception) null));
        if (connector instanceof Connector.c) {
            mVar2 = this.y.d(iotUnit, (Connector.c) connector, mVar, statistics);
        } else if (connector instanceof Connector.a) {
            mVar2 = this.y.a(iotUnit, (Connector.a) connector, statistics);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        D(mVar2);
    }

    private final void L(Connector connector) {
        n.a.a.a("search", new Object[0]);
        this.v = e.b((d0) null, new a(this, connector, (kotlin.c0.d) null), 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void E(Exception exc) {
        kotlin.jvm.internal.k.e(exc, "exception");
        d dVar = this.v;
        if (dVar != null) {
            dVar.cancel();
        }
        w(g.e.m.a.f9908e.c(exc));
    }

    public void F() {
        n.a.a.a("Starting FindScanStep. Finding bleScan for " + this.w.getDisplayName(), new Object[0]);
        Connector connector = this.w.getConnections$sdk_release().get(0);
        m c = connector.c();
        if (c == null || !this.A.a(c)) {
            w(new g.e.m.a(a.b.EXECUTING, this.w, i.SearchingUnit, (Exception) null));
            n.a.a.a("Searching for " + this.w.getDisplayName() + " on a " + this.w.getType() + " connected to " + this.w.getHardwareType(), new Object[0]);
            L(connector);
            return;
        }
        this.x.markSearchEnd("ble");
        K(this.w, connector, c, this.x);
    }
}

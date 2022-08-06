package com.sensorberg.smartspaces.sdk.internal.unit.opener;

import com.sensorberg.smartspaces.backend.model.ActuatorRequest;
import com.sensorberg.smartspaces.backend.model.BlueIdDeviceDetails;
import com.sensorberg.smartspaces.backend.model.Statistics;
import com.sensorberg.smartspaces.sdk.internal.Connector;
import com.sensorberg.smartspaces.sdk.internal.p.h;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.m.a;
import g.e.n.g.i;
import kotlin.e0.c.l;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: BlueIdOpener.kt */
public final class b extends m {
    private final Statistics A;
    /* access modifiers changed from: private */
    public final com.sensorberg.smartspaces.backend.a B;
    /* access modifiers changed from: private */
    public final com.sensorberg.smartspaces.sdk.internal.p.e C;
    private l<? super g.e.m.a<Void, h>, x> v;
    private g.e.k.e<g.e.m.a<Void, h>> w;
    private final f x = new f("ble");
    /* access modifiers changed from: private */
    public final IotUnit y;
    /* access modifiers changed from: private */
    public final Connector.a z;

    /* compiled from: BlueIdOpener.kt */
    public static final class a implements l<g.e.m.a<Void, h>, x> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f6739g;

        a(b bVar) {
            this.f6739g = bVar;
        }

        public void a(g.e.m.a<Void, h> aVar) {
            if (aVar != null) {
                int i2 = a.a[aVar.f().ordinal()];
                if (i2 == 1) {
                    this.f6739g.R(g.e.m.a.f9908e.d(null), ActuatorRequest.STATE_SUCCESS);
                } else if (i2 == 2) {
                    this.f6739g.R(g.e.m.a.f9908e.c(aVar.d()), ActuatorRequest.STATE_FAILED);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((g.e.m.a) obj);
            return x.a;
        }
    }

    /* renamed from: com.sensorberg.smartspaces.sdk.internal.unit.opener.b$b  reason: collision with other inner class name */
    /* compiled from: BlueIdOpener.kt */
    static final class C0407b extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6740h;

        /* renamed from: com.sensorberg.smartspaces.sdk.internal.unit.opener.b$b$a */
        /* compiled from: BlueIdOpener.kt */
        static final class a extends kotlin.jvm.internal.l implements l<Void, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C0407b f6741h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C0407b bVar) {
                super(1);
                this.f6741h = bVar;
            }

            public final void a(Void voidR) {
                this.f6741h.f6740h.C.b();
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a((Void) obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0407b(b bVar) {
            super(0);
            this.f6740h = bVar;
        }

        public final void a() {
            g.e.m.e.e.b(this.f6740h.B.j(this.f6740h.z.g()), (g.e.k.a) null, 1, (Object) null).f(new a(this));
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: BlueIdOpener.kt */
    static final class c extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6742h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.f6742h = bVar;
        }

        public final void a() {
            this.f6742h.Q();
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: BlueIdOpener.kt */
    static final class d extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6743h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.f6743h = bVar;
        }

        public final void a() {
            this.f6743h.P();
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: BlueIdOpener.kt */
    static final class e extends kotlin.jvm.internal.l implements p<String, Integer, x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6744h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(2);
            this.f6744h = bVar;
        }

        public final void a(String str, Integer num) {
            k.e(str, "<anonymous parameter 0>");
            b bVar = this.f6744h;
            bVar.S(bVar.y.getActuatorId(), (String) null, (String) null, num);
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
            a((String) obj, (Integer) obj2);
            return x.a;
        }
    }

    /* compiled from: BlueIdOpener.kt */
    static final class f extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6745h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ BlueIdDeviceDetails f6746i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, BlueIdDeviceDetails blueIdDeviceDetails) {
            super(0);
            this.f6745h = bVar;
            this.f6746i = blueIdDeviceDetails;
        }

        public final void a() {
            this.f6745h.B.G(this.f6746i);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    public b(IotUnit iotUnit, Connector.a aVar, Statistics statistics, com.sensorberg.smartspaces.backend.a aVar2, com.sensorberg.smartspaces.sdk.internal.p.e eVar) {
        k.e(iotUnit, "iotUnit");
        k.e(aVar, "connection");
        k.e(statistics, "statistic");
        k.e(aVar2, "backend");
        k.e(eVar, "blueId");
        this.y = iotUnit;
        this.z = aVar;
        this.A = statistics;
        this.B = aVar2;
        this.C = eVar;
    }

    private final l<g.e.m.a<Void, h>, x> O() {
        return new a(this);
    }

    /* access modifiers changed from: private */
    public final void P() {
        g.e.e.a aVar = g.e.e.a.f9778f;
        aVar.j(aVar.e(), new C0407b(this));
    }

    /* access modifiers changed from: private */
    public final void Q() {
        Exception B2 = B();
        if (B2 != null) {
            throw B2;
        } else if (this.B.B()) {
            n.a.a.a("enable blue id admin mode for time sync", new Object[0]);
            this.B.k(this.z.g());
        } else {
            throw new IllegalStateException("Server time difference threshold reached - Device time is behind server time");
        }
    }

    /* access modifiers changed from: private */
    public final void R(g.e.m.a<IotUnit, i> aVar, String str) {
        n.a.a.a("BlueIdOpener result = " + str, new Object[0]);
        g.e.k.e<g.e.m.a<Void, h>> eVar = this.w;
        String str2 = null;
        if (eVar != null) {
            l<? super g.e.m.a<Void, h>, x> lVar = this.v;
            if (lVar != null) {
                eVar.v(lVar);
                this.x.c();
                this.x.a(this.A);
                this.B.H(this.A);
                w(aVar);
                com.sensorberg.smartspaces.backend.a aVar2 = this.B;
                String requestId = this.A.getRequestId();
                Exception d2 = aVar.d();
                if (d2 != null) {
                    str2 = d2.getMessage();
                }
                aVar2.L(requestId, str, str2, this.y.getUnitId(), this.z.b(), this.y.getActuatorId(), this.y.getAction$sdk_release());
                return;
            }
            k.q("blueIdObserver");
            throw null;
        }
        k.q("blueIdOpening");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void S(String str, String str2, String str3, Integer num) {
        BlueIdDeviceDetails blueIdDeviceDetails = new BlueIdDeviceDetails();
        blueIdDeviceDetails.firmwareVersion = str2;
        blueIdDeviceDetails.hardwareVersion = str3;
        blueIdDeviceDetails.batteryLevel = num;
        blueIdDeviceDetails.id = str;
        n.a.a.a("BlueId device " + this.z.f() + " details are " + blueIdDeviceDetails, new Object[0]);
        g.e.e.a aVar = g.e.e.a.f9778f;
        aVar.j(aVar.e(), new f(this, blueIdDeviceDetails));
    }

    public void F() {
        n.a.a.a("Starting BlueIdOpener. Connecting to " + this.y.getDisplayName(), new Object[0]);
        w(new g.e.m.a(a.b.EXECUTING, this.y, i.Connecting, (Exception) null));
        this.x.b();
        this.w = this.C.g(this.z.g(), new c(this), new d(this), new e(this));
        l<g.e.m.a<Void, h>, x> O = O();
        this.v = O;
        g.e.k.e<g.e.m.a<Void, h>> eVar = this.w;
        if (eVar == null) {
            k.q("blueIdOpening");
            throw null;
        } else if (O != null) {
            eVar.r(O);
        } else {
            k.q("blueIdObserver");
            throw null;
        }
    }
}

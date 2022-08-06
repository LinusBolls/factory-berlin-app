package com.sensorberg.smartspaces.sdk.internal.unit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.k;
import com.sensorberg.smartspaces.backend.model.BlueIdDeviceDetails;
import com.sensorberg.smartspaces.sdk.internal.Connector;
import com.sensorberg.smartspaces.sdk.internal.s.d;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.e.a;
import g.e.n.c.d.b;
import g.e.n.c.d.m;
import g.e.n.c.d.n;
import java.util.Iterator;
import java.util.List;
import kotlin.e0.c.q;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import kotlin.x;

/* compiled from: DebugBlueIdDetails.kt */
public final class a implements com.sensorberg.smartspaces.sdk.internal.s.d {

    /* renamed from: g  reason: collision with root package name */
    private final kotlin.e f6671g = g.a(new C0402a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: h  reason: collision with root package name */
    private final kotlin.e f6672h = g.a(new b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.e f6673i = g.a(new c(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<List<g.e.n.c.d.b>> f6674j = k.c(j().a(), (kotlin.c0.g) null, 0, 3, (Object) null);

    /* renamed from: k  reason: collision with root package name */
    private final kotlin.e f6675k = g.a(new d(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: l  reason: collision with root package name */
    private final kotlin.e f6676l = g.a(new e(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final IotUnit f6677m;

    /* renamed from: com.sensorberg.smartspaces.sdk.internal.unit.a$a  reason: collision with other inner class name */
    /* compiled from: Scope.kt */
    public static final class C0402a extends l implements kotlin.e0.c.a<com.sensorberg.smartspaces.backend.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6678h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6679i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6680j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0402a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6678h = aVar;
            this.f6679i = aVar2;
            this.f6680j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.smartspaces.backend.a] */
        public final com.sensorberg.smartspaces.backend.a d() {
            return this.f6678h.e(v.b(com.sensorberg.smartspaces.backend.a.class), this.f6679i, this.f6680j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class b extends l implements kotlin.e0.c.a<com.sensorberg.smartspaces.sdk.internal.p.e> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6681h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6682i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6683j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6681h = aVar;
            this.f6682i = aVar2;
            this.f6683j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.smartspaces.sdk.internal.p.e, java.lang.Object] */
        public final com.sensorberg.smartspaces.sdk.internal.p.e d() {
            return this.f6681h.e(v.b(com.sensorberg.smartspaces.sdk.internal.p.e.class), this.f6682i, this.f6683j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class c extends l implements kotlin.e0.c.a<g.e.n.c.d.j> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6684h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6685i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6686j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6684h = aVar;
            this.f6685i = aVar2;
            this.f6686j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [g.e.n.c.d.j, java.lang.Object] */
        public final g.e.n.c.d.j d() {
            return this.f6684h.e(v.b(g.e.n.c.d.j.class), this.f6685i, this.f6686j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class d extends l implements kotlin.e0.c.a<m> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6687h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6688i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6689j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6687h = aVar;
            this.f6688i = aVar2;
            this.f6689j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [g.e.n.c.d.m, java.lang.Object] */
        public final m d() {
            return this.f6687h.e(v.b(m.class), this.f6688i, this.f6689j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class e extends l implements kotlin.e0.c.a<n> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6690h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6691i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6692j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6690h = aVar;
            this.f6691i = aVar2;
            this.f6692j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [g.e.n.c.d.n, java.lang.Object] */
        public final n d() {
            return this.f6690h.e(v.b(n.class), this.f6691i, this.f6692j);
        }
    }

    /* compiled from: DebugBlueIdDetails.kt */
    static final class f<T> implements f0<List<? extends g.e.n.c.d.b>> {

        /* renamed from: g  reason: collision with root package name */
        public static final f f6693g = new f();

        f() {
        }

        /* renamed from: a */
        public final void k(List<? extends g.e.n.c.d.b> list) {
        }
    }

    /* compiled from: DebugBlueIdDetails.kt */
    static final class g extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6694h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(0);
            this.f6694h = aVar;
        }

        public final void a() {
            this.f6694h.l().a();
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: DebugBlueIdDetails.kt */
    static final class h extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6695h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.smartspaces.backend.a f6696i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f6697j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ u f6698k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ u f6699l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, com.sensorberg.smartspaces.backend.a aVar2, String str, u uVar, u uVar2) {
            super(0);
            this.f6695h = aVar;
            this.f6696i = aVar2;
            this.f6697j = str;
            this.f6698k = uVar;
            this.f6699l = uVar2;
        }

        public final void a() {
            try {
                this.f6696i.k(this.f6697j);
                this.f6698k.f10686g = this.f6695h.i(this.f6695h.h());
            } catch (Exception e2) {
                n.a.a.m(e2, "debugGetBlueIdDetails failed with exception", new Object[0]);
                this.f6699l.f10686g = e2;
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: DebugBlueIdDetails.kt */
    static final class i extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6700h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ com.sensorberg.smartspaces.backend.a f6701i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f6702j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ u f6703k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ q f6704l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ u f6705m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.l f6706n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar, com.sensorberg.smartspaces.backend.a aVar2, String str, u uVar, q qVar, u uVar2, kotlin.e0.c.l lVar) {
            super(0);
            this.f6700h = aVar;
            this.f6701i = aVar2;
            this.f6702j = str;
            this.f6703k = uVar;
            this.f6704l = qVar;
            this.f6705m = uVar2;
            this.f6706n = lVar;
        }

        public final void a() {
            this.f6701i.j(this.f6702j);
            BlueIdDeviceDetails blueIdDeviceDetails = (BlueIdDeviceDetails) this.f6703k.f10686g;
            if (blueIdDeviceDetails != null) {
                this.f6704l.k(blueIdDeviceDetails.hardwareVersion, blueIdDeviceDetails.firmwareVersion, blueIdDeviceDetails.batteryLevel);
                this.f6701i.G(blueIdDeviceDetails);
            }
            Exception exc = (Exception) this.f6705m.f10686g;
            if (exc != null) {
                kotlin.e0.c.l lVar = this.f6706n;
                lVar.o("Crash with exception: " + exc.getMessage());
            }
            this.f6700h.k().a();
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: DebugBlueIdDetails.kt */
    static final class j extends l implements q<String, String, Integer, BlueIdDeviceDetails> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f6707h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(3);
            this.f6707h = aVar;
        }

        public final BlueIdDeviceDetails a(String str, String str2, int i2) {
            n.a.a.a("BlueId details. hardware: " + str + "; firmware: " + str2 + "; battery: " + i2, new Object[0]);
            BlueIdDeviceDetails blueIdDeviceDetails = new BlueIdDeviceDetails();
            blueIdDeviceDetails.hardwareVersion = str;
            blueIdDeviceDetails.firmwareVersion = str2;
            blueIdDeviceDetails.batteryLevel = Integer.valueOf(i2);
            blueIdDeviceDetails.id = this.f6707h.f6677m.getActuatorId();
            return blueIdDeviceDetails;
        }

        public /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3) {
            return a((String) obj, (String) obj2, ((Number) obj3).intValue());
        }
    }

    public a(IotUnit iotUnit) {
        kotlin.jvm.internal.k.e(iotUnit, "iotUnit");
        this.f6677m = iotUnit;
        this.f6674j.p(f.f6693g);
    }

    private final com.sensorberg.smartspaces.backend.a g() {
        return (com.sensorberg.smartspaces.backend.a) this.f6671g.getValue();
    }

    /* access modifiers changed from: private */
    public final com.sensorberg.smartspaces.sdk.internal.p.e h() {
        return (com.sensorberg.smartspaces.sdk.internal.p.e) this.f6672h.getValue();
    }

    /* access modifiers changed from: private */
    public final BlueIdDeviceDetails i(com.sensorberg.smartspaces.sdk.internal.p.e eVar) {
        Connector connector = this.f6677m.getConnections$sdk_release().get(0);
        if (connector != null) {
            return (BlueIdDeviceDetails) eVar.c(((Connector.a) connector).g(), new j(this));
        }
        throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartspaces.sdk.internal.Connector.BlueIdDevice");
    }

    private final g.e.n.c.d.j j() {
        return (g.e.n.c.d.j) this.f6673i.getValue();
    }

    /* access modifiers changed from: private */
    public final m k() {
        return (m) this.f6675k.getValue();
    }

    /* access modifiers changed from: private */
    public final n l() {
        return (n) this.f6676l.getValue();
    }

    public final void f(q<? super String, ? super String, ? super Integer, x> qVar, kotlin.e0.c.l<? super String, x> lVar) {
        Object obj;
        boolean z;
        kotlin.jvm.internal.k.e(qVar, "callback");
        kotlin.jvm.internal.k.e(lVar, "onFail");
        if (this.f6677m.getHardwareType() == IotUnit.HardwareType.SB_GATEWAY) {
            lVar.o("get details is for Blue-ID devices only");
            return;
        }
        u uVar = new u();
        no.nordicsemi.android.support.v18.scanner.m mVar = null;
        uVar.f10686g = null;
        u uVar2 = new u();
        uVar2.f10686g = null;
        Connector connector = this.f6677m.getConnections$sdk_release().get(0);
        if (connector != null) {
            Connector.a aVar = (Connector.a) connector;
            String g2 = aVar.g();
            no.nordicsemi.android.support.v18.scanner.m c2 = aVar.c();
            if (c2 != null) {
                mVar = c2;
            } else {
                List l2 = this.f6674j.l();
                if (l2 != null) {
                    Iterator it = l2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        g.e.n.c.d.b bVar = (g.e.n.c.d.b) obj;
                        if (!(bVar instanceof b.a) || !kotlin.jvm.internal.k.a(((b.a) bVar).e(), aVar.f())) {
                            z = false;
                            continue;
                        } else {
                            z = true;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    g.e.n.c.d.b bVar2 = (g.e.n.c.d.b) obj;
                    if (bVar2 != null) {
                        mVar = bVar2.c();
                    }
                }
            }
            n.a.a.a("Found " + mVar + " for this device", new Object[0]);
            com.sensorberg.smartspaces.backend.a g3 = g();
            g.e.e.a aVar2 = g.e.e.a.f9778f;
            a.c j2 = aVar2.j(aVar2.e(), new g(this));
            com.sensorberg.smartspaces.backend.a aVar3 = g3;
            String str = g2;
            u uVar3 = uVar;
            j2.g(g.e.e.a.f9778f.c(), new h(this, aVar3, str, uVar3, uVar2));
            j2.g(g.e.e.a.f9778f.e(), new i(this, aVar3, str, uVar3, qVar, uVar2, lVar));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.sensorberg.smartspaces.sdk.internal.Connector.BlueIdDevice");
    }

    public m.a.c.a n() {
        return d.a.a(this);
    }
}

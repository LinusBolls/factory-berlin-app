package com.sensorberg.smartspaces.sdk.internal.u;

import com.sensorberg.smartspaces.sdk.model.IotDevice;
import com.sensorberg.smartspaces.sdk.model.StateChangeRequest;
import g.e.k.e;
import g.e.m.c;
import g.e.n.g.g;
import g.e.n.g.h;
import g.e.n.g.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.jvm.internal.l;
import kotlin.x;
import kotlinx.coroutines.d0;

/* compiled from: IotDeviceControllerImpl.kt */
public final class c implements g {
    private final e<g.b> a;
    private final g.e.k.a b;
    private final b c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final g f6629d;

    /* compiled from: IotDeviceControllerImpl.kt */
    static final class a extends l implements kotlin.e0.c.l<g.b, x> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f6630h = new a();

        a() {
            super(1);
        }

        public final void a(g.b bVar) {
            n.a.a.a("IotDeviceController status is: " + bVar, new Object[0]);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((g.b) obj);
            return x.a;
        }
    }

    @f(c = "com.sensorberg.smartspaces.sdk.internal.iot.IotDeviceControllerImpl$execute$3", f = "IotDeviceControllerImpl.kt", l = {90}, m = "invokeSuspend")
    /* compiled from: IotDeviceControllerImpl.kt */
    static final class b extends k implements kotlin.e0.c.l<kotlin.c0.d<? super g.e.m.c<? extends x>>, Object> {

        /* renamed from: k  reason: collision with root package name */
        int f6631k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ c f6632l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ StateChangeRequest f6633m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ List f6634n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, StateChangeRequest stateChangeRequest, List list, kotlin.c0.d dVar) {
            super(1, dVar);
            this.f6632l = cVar;
            this.f6633m = stateChangeRequest;
            this.f6634n = list;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f6631k;
            if (i2 == 0) {
                kotlin.l.b(obj);
                g e2 = this.f6632l.f6629d;
                String id = this.f6633m.getIotDevice$sdk_release().getId();
                List list = this.f6634n;
                this.f6631k = 1;
                obj = e2.a(id, list, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                kotlin.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object o(Object obj) {
            return ((b) s((kotlin.c0.d) obj)).i(x.a);
        }

        public final kotlin.c0.d<x> s(kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            return new b(this.f6632l, this.f6633m, this.f6634n, dVar);
        }
    }

    /* renamed from: com.sensorberg.smartspaces.sdk.internal.u.c$c  reason: collision with other inner class name */
    /* compiled from: SafeCollector.common.kt */
    public static final class C0398c implements kotlinx.coroutines.e3.c<g.e.m.c<? extends List<? extends IotDevice>>> {
        final /* synthetic */ kotlinx.coroutines.e3.c a;
        final /* synthetic */ c b;
        final /* synthetic */ h c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g.e.n.g.k f6635d;

        /* renamed from: com.sensorberg.smartspaces.sdk.internal.u.c$c$a */
        /* compiled from: Collect.kt */
        public static final class a implements kotlinx.coroutines.e3.d<g.e.m.c<? extends List<? extends IotDevice>>> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.e3.d f6636g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C0398c f6637h;

            public a(kotlinx.coroutines.e3.d dVar, C0398c cVar) {
                this.f6636g = dVar;
                this.f6637h = cVar;
            }

            public Object a(Object obj, kotlin.c0.d dVar) {
                kotlinx.coroutines.e3.d dVar2 = this.f6636g;
                g.e.m.c cVar = (g.e.m.c) obj;
                if (cVar instanceof c.b) {
                    C0398c cVar2 = this.f6637h;
                    cVar = new c.b(this.f6637h.b.g((List) ((c.b) cVar).f(), cVar2.c, cVar2.f6635d));
                }
                Object a = dVar2.a(cVar, dVar);
                return a == d.c() ? a : x.a;
            }
        }

        public C0398c(kotlinx.coroutines.e3.c cVar, c cVar2, h hVar, g.e.n.g.k kVar) {
            this.a = cVar;
            this.b = cVar2;
            this.c = hVar;
            this.f6635d = kVar;
        }

        public Object a(kotlinx.coroutines.e3.d dVar, kotlin.c0.d dVar2) {
            Object a2 = this.a.a(new a(dVar, this), dVar2);
            if (a2 == d.c()) {
                return a2;
            }
            return x.a;
        }
    }

    /* compiled from: IotDeviceControllerImpl.kt */
    static final class d extends l implements kotlin.e0.c.a<kotlinx.coroutines.e3.c<? extends g.e.m.c<? extends List<? extends IotDevice>>>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f6638h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f6639i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ h f6640j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ g.e.n.g.k f6641k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, long j2, h hVar, g.e.n.g.k kVar) {
            super(0);
            this.f6638h = cVar;
            this.f6639i = j2;
            this.f6640j = hVar;
            this.f6641k = kVar;
        }

        /* renamed from: a */
        public final kotlinx.coroutines.e3.c<g.e.m.c<List<IotDevice>>> d() {
            return this.f6638h.h(this.f6638h.j(this.f6639i), this.f6640j, this.f6641k);
        }
    }

    public c(g.e.k.a aVar, e<g.b> eVar, b bVar, g gVar) {
        kotlin.jvm.internal.k.e(aVar, "logoutEvent");
        kotlin.jvm.internal.k.e(eVar, "status");
        kotlin.jvm.internal.k.e(bVar, "getIotDeviceDetailsUseCase");
        kotlin.jvm.internal.k.e(gVar, "setIotDeviceStateUseCase");
        this.b = aVar;
        this.c = bVar;
        this.f6629d = gVar;
        e<g.b> b2 = com.sensorberg.smartspaces.sdk.internal.f.b(eVar, aVar);
        this.a = b2;
        b2.r(a.f6630h);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r5 != null) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.sensorberg.smartspaces.sdk.model.IotDevice> g(java.util.List<com.sensorberg.smartspaces.sdk.model.IotDevice> r18, g.e.n.g.h r19, g.e.n.g.k r20) {
        /*
            r17 = this;
            r0 = r19
            r1 = r20
            if (r18 == 0) goto L_0x0073
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r18.iterator()
        L_0x000f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0072
            java.lang.Object r4 = r3.next()
            com.sensorberg.smartspaces.sdk.model.IotDevice r4 = (com.sensorberg.smartspaces.sdk.model.IotDevice) r4
            if (r1 == 0) goto L_0x0055
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.util.List r5 = r4.getProperties()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0030:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L_0x0047
            java.lang.Object r13 = r5.next()
            r14 = r13
            com.sensorberg.smartspaces.sdk.model.Property r14 = (com.sensorberg.smartspaces.sdk.model.Property) r14
            boolean r14 = r1.a(r14)
            if (r14 == 0) goto L_0x0030
            r12.add(r13)
            goto L_0x0030
        L_0x0047:
            r13 = 0
            r14 = 0
            r15 = 447(0x1bf, float:6.26E-43)
            r16 = 0
            r5 = r4
            com.sensorberg.smartspaces.sdk.model.IotDevice r5 = com.sensorberg.smartspaces.sdk.model.IotDevice.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r5 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r5 = r4
        L_0x0056:
            java.util.List r5 = r5.getProperties()
            boolean r5 = r5.isEmpty()
            r6 = 0
            if (r5 == 0) goto L_0x0063
        L_0x0061:
            r4 = r6
            goto L_0x006c
        L_0x0063:
            if (r0 == 0) goto L_0x006c
            boolean r5 = r0.a(r4)
            if (r5 != 0) goto L_0x006c
            goto L_0x0061
        L_0x006c:
            if (r4 == 0) goto L_0x000f
            r2.add(r4)
            goto L_0x000f
        L_0x0072:
            return r2
        L_0x0073:
            java.util.List r0 = kotlin.a0.n.g()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.internal.u.c.g(java.util.List, g.e.n.g.h, g.e.n.g.k):java.util.List");
    }

    /* access modifiers changed from: private */
    public final kotlinx.coroutines.e3.c<g.e.m.c<List<IotDevice>>> h(kotlinx.coroutines.e3.c<? extends g.e.m.c<? extends List<IotDevice>>> cVar, h hVar, g.e.n.g.k kVar) {
        return (hVar == null && kVar == null) ? cVar : new C0398c(cVar, this, hVar, kVar);
    }

    /* access modifiers changed from: private */
    public final kotlinx.coroutines.e3.c<g.e.m.c<List<IotDevice>>> j(long j2) {
        return this.c.a(j2);
    }

    public kotlinx.coroutines.e3.c<g.b> a() {
        return e.l(this.a, this.b, (d0) null, 2, (Object) null);
    }

    public kotlinx.coroutines.e3.c<g.e.m.c<List<IotDevice>>> d(t tVar, h hVar, g.e.n.g.k kVar, long j2) {
        kotlin.jvm.internal.k.e(tVar, "sorting");
        return i(hVar, kVar, j2);
    }

    public kotlinx.coroutines.e3.c<g.e.m.c<List<IotDevice>>> i(h hVar, g.e.n.g.k kVar, long j2) {
        if (this.b.c()) {
            return kotlinx.coroutines.e3.e.g();
        }
        g.e.p.a.a aVar = g.e.p.a.a.a;
        return aVar.a(aVar.b(new d(this, j2, hVar, kVar)));
    }

    public Object v(StateChangeRequest stateChangeRequest, kotlin.c0.d<? super g.e.m.c<x>> dVar) {
        Exception a2 = f.a.a(stateChangeRequest, this.a.n());
        if (a2 != null) {
            return new c.a((List<? extends Throwable>) m.b(a2));
        }
        List<StateChangeRequest.StateRequest> states$sdk_release = stateChangeRequest.getStates$sdk_release();
        ArrayList arrayList = new ArrayList(o.p(states$sdk_release, 10));
        for (StateChangeRequest.StateRequest stateRequest : states$sdk_release) {
            arrayList.add(new com.sensorberg.smartspaces.backend.j.f.b(stateRequest.getProperty().getKind(), stateRequest.getValue()));
        }
        return g.e.p.a.a.a.c(new b(this, stateChangeRequest, arrayList, (kotlin.c0.d) null), dVar);
    }
}

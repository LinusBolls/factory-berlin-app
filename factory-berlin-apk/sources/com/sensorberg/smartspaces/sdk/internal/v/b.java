package com.sensorberg.smartspaces.sdk.internal.v;

import com.sensorberg.smartspaces.sdk.internal.v.h;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.n.c.d.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.l;
import kotlin.x;
import kotlinx.coroutines.d0;

/* compiled from: AwaitClosestUnit.kt */
public final class b implements h.a {
    private final AtomicBoolean a = new AtomicBoolean(true);
    private boolean b;
    /* access modifiers changed from: private */
    public final g.e.k.d<IotUnit> c = new g.e.k.d<>();

    /* renamed from: d  reason: collision with root package name */
    private final g.e.k.e<g.e.m.a<List<IotUnit>, Void>> f6788d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final g f6789e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public g.e.n.g.d f6790f;

    /* renamed from: g  reason: collision with root package name */
    private final String f6791g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final g.e.k.a f6792h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final g f6793i;

    /* renamed from: j  reason: collision with root package name */
    private final l<IotUnit, x> f6794j;

    /* compiled from: AwaitClosestUnit.kt */
    static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6795h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.f6795h = bVar;
        }

        public final void a() {
            n.a.a.a("onCancelled", new Object[0]);
            g.e.n.g.d e2 = this.f6795h.f6790f;
            if (e2 != null) {
                e2.cancel();
            }
            g c = this.f6795h.f6789e;
            if (c != null) {
                c.b();
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    @f(c = "com.sensorberg.smartspaces.sdk.internal.tap.AwaitClosestUnit$check$1", f = "AwaitClosestUnit.kt", l = {73}, m = "invokeSuspend")
    /* renamed from: com.sensorberg.smartspaces.sdk.internal.v.b$b  reason: collision with other inner class name */
    /* compiled from: AwaitClosestUnit.kt */
    static final class C0412b extends k implements l<kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        Object f6796k;

        /* renamed from: l  reason: collision with root package name */
        int f6797l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b f6798m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ l f6799n;
        final /* synthetic */ List o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0412b(b bVar, l lVar, List list, kotlin.c0.d dVar) {
            super(1, dVar);
            this.f6798m = bVar;
            this.f6799n = lVar;
            this.o = list;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object i(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.c0.i.d.c()
                int r1 = r5.f6797l
                r2 = 1
                if (r1 == 0) goto L_0x001c
                if (r1 != r2) goto L_0x0014
                java.lang.Object r1 = r5.f6796k
                com.sensorberg.smartspaces.sdk.model.IotUnit r1 = (com.sensorberg.smartspaces.sdk.model.IotUnit) r1
                kotlin.l.b(r6)
                r1 = r5
                goto L_0x0034
            L_0x0014:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001c:
                kotlin.l.b(r6)
                r6 = 0
                r1 = r5
            L_0x0021:
                com.sensorberg.smartspaces.sdk.internal.v.b r3 = r1.f6798m
                g.e.n.c.d.g r3 = r3.f6793i
                kotlin.e0.c.l r4 = r1.f6799n
                r1.f6796k = r6
                r1.f6797l = r2
                java.lang.Object r6 = r3.a(r4, r1)
                if (r6 != r0) goto L_0x0034
                return r0
            L_0x0034:
                g.e.n.c.d.b r6 = (g.e.n.c.d.b) r6
                com.sensorberg.smartspaces.sdk.internal.v.h r3 = com.sensorberg.smartspaces.sdk.internal.v.h.f6844g
                java.util.List r4 = r1.o
                com.sensorberg.smartspaces.sdk.model.IotUnit r6 = r3.c(r6, r4)
                if (r6 != 0) goto L_0x004c
                com.sensorberg.smartspaces.sdk.internal.v.b r3 = r1.f6798m
                g.e.k.a r3 = r3.f6792h
                boolean r3 = r3.c()
                if (r3 == 0) goto L_0x0021
            L_0x004c:
                if (r6 == 0) goto L_0x005f
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "found unit"
                n.a.a.a(r2, r0)
                com.sensorberg.smartspaces.sdk.internal.v.b r0 = r1.f6798m
                g.e.k.d r0 = r0.c
                r0.w(r6)
            L_0x005f:
                kotlin.x r6 = kotlin.x.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.internal.v.b.C0412b.i(java.lang.Object):java.lang.Object");
        }

        public final Object o(Object obj) {
            return ((C0412b) s((kotlin.c0.d) obj)).i(x.a);
        }

        public final kotlin.c0.d<x> s(kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            return new C0412b(this.f6798m, this.f6799n, this.o, dVar);
        }
    }

    @f(c = "com.sensorberg.smartspaces.sdk.internal.tap.AwaitClosestUnit$check$2", f = "AwaitClosestUnit.kt", l = {96}, m = "invokeSuspend")
    /* compiled from: AwaitClosestUnit.kt */
    static final class c extends k implements l<kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        Object f6800k;

        /* renamed from: l  reason: collision with root package name */
        int f6801l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b f6802m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ l f6803n;
        final /* synthetic */ IotUnit o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, l lVar, IotUnit iotUnit, kotlin.c0.d dVar) {
            super(1, dVar);
            this.f6802m = bVar;
            this.f6803n = lVar;
            this.o = iotUnit;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object i(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.c0.i.d.c()
                int r1 = r5.f6801l
                r2 = 1
                if (r1 == 0) goto L_0x001c
                if (r1 != r2) goto L_0x0014
                java.lang.Object r1 = r5.f6800k
                com.sensorberg.smartspaces.sdk.model.IotUnit r1 = (com.sensorberg.smartspaces.sdk.model.IotUnit) r1
                kotlin.l.b(r6)
                r1 = r5
                goto L_0x0034
            L_0x0014:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001c:
                kotlin.l.b(r6)
                r6 = 0
                r1 = r5
            L_0x0021:
                com.sensorberg.smartspaces.sdk.internal.v.b r3 = r1.f6802m
                g.e.n.c.d.g r3 = r3.f6793i
                kotlin.e0.c.l r4 = r1.f6803n
                r1.f6800k = r6
                r1.f6801l = r2
                java.lang.Object r6 = r3.a(r4, r1)
                if (r6 != r0) goto L_0x0034
                return r0
            L_0x0034:
                g.e.n.c.d.b r6 = (g.e.n.c.d.b) r6
                com.sensorberg.smartspaces.sdk.internal.v.h r3 = com.sensorberg.smartspaces.sdk.internal.v.h.f6844g
                com.sensorberg.smartspaces.sdk.model.IotUnit r4 = r1.o
                com.sensorberg.smartspaces.sdk.model.IotUnit r6 = r3.h(r4, r6)
                if (r6 != 0) goto L_0x004c
                com.sensorberg.smartspaces.sdk.internal.v.b r3 = r1.f6802m
                g.e.k.a r3 = r3.f6792h
                boolean r3 = r3.c()
                if (r3 == 0) goto L_0x0021
            L_0x004c:
                if (r6 == 0) goto L_0x005f
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "found unit"
                n.a.a.a(r2, r0)
                com.sensorberg.smartspaces.sdk.internal.v.b r0 = r1.f6802m
                g.e.k.d r0 = r0.c
                r0.w(r6)
            L_0x005f:
                kotlin.x r6 = kotlin.x.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.internal.v.b.c.i(java.lang.Object):java.lang.Object");
        }

        public final Object o(Object obj) {
            return ((c) s((kotlin.c0.d) obj)).i(x.a);
        }

        public final kotlin.c0.d<x> s(kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            return new c(this.f6802m, this.f6803n, this.o, dVar);
        }
    }

    /* compiled from: AwaitClosestUnit.kt */
    static final class d extends kotlin.jvm.internal.l implements l<g.e.n.c.d.b, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6804h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(1);
            this.f6804h = bVar;
        }

        public final boolean a(g.e.n.c.d.b bVar) {
            kotlin.jvm.internal.k.e(bVar, "bleScanObject");
            h hVar = h.f6844g;
            g c = this.f6804h.f6789e;
            kotlin.jvm.internal.k.c(c);
            return hVar.e(bVar, c);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Boolean.valueOf(a((g.e.n.c.d.b) obj));
        }
    }

    /* compiled from: AwaitClosestUnit.kt */
    static final class e extends kotlin.jvm.internal.l implements l<g.e.n.c.d.b, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ IotUnit f6805h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(IotUnit iotUnit) {
            super(1);
            this.f6805h = iotUnit;
        }

        public final boolean a(g.e.n.c.d.b bVar) {
            kotlin.jvm.internal.k.e(bVar, "bleScanObject");
            return h.f6844g.f(this.f6805h, bVar);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Boolean.valueOf(a((g.e.n.c.d.b) obj));
        }
    }

    public b(String str, g.e.k.a aVar, com.sensorberg.smartspaces.sdk.internal.unit.f fVar, g.e.p.c.c cVar, g gVar, g.e.n.c.d.h hVar, l<? super IotUnit, x> lVar) {
        g gVar2;
        kotlin.jvm.internal.k.e(aVar, "cancel");
        kotlin.jvm.internal.k.e(fVar, "unitParser");
        kotlin.jvm.internal.k.e(cVar, "handlerProvider");
        kotlin.jvm.internal.k.e(gVar, "findFirstBleScanUseCase");
        kotlin.jvm.internal.k.e(hVar, "getBleCalibrationUseCase");
        kotlin.jvm.internal.k.e(lVar, "callback");
        this.f6791g = str;
        this.f6792h = aVar;
        this.f6793i = gVar;
        this.f6794j = lVar;
        this.f6788d = fVar.c();
        if (this.f6791g == null) {
            gVar2 = new g(System.currentTimeMillis(), hVar.a(), cVar);
        } else {
            gVar2 = null;
        }
        this.f6789e = gVar2;
        this.f6792h.d(new a(this));
    }

    public void a() {
        Object obj;
        n.a.a.a("check", new Object[0]);
        if (!this.b) {
            if (this.a.get()) {
                g.e.m.a n2 = this.f6788d.n();
                List list = n2 != null ? (List) n2.c() : null;
                if (list == null) {
                    return;
                }
                if (this.f6791g == null) {
                    n.a.a.a("actuatorId is null", new Object[0]);
                    this.a.set(false);
                    this.f6790f = com.sensorberg.smartspaces.sdk.internal.e.b((d0) null, new C0412b(this, new d(this), list, (kotlin.c0.d) null), 1, (Object) null);
                    return;
                }
                n.a.a.a("actuatorId not null", new Object[0]);
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.k.a(((IotUnit) obj).getActuatorId(), this.f6791g)) {
                        break;
                    }
                }
                IotUnit iotUnit = (IotUnit) obj;
                if (iotUnit != null) {
                    this.a.set(false);
                    this.f6790f = com.sensorberg.smartspaces.sdk.internal.e.b((d0) null, new c(this, new e(iotUnit), iotUnit, (kotlin.c0.d) null), 1, (Object) null);
                    return;
                }
                this.f6792h.b();
                return;
            }
            IotUnit n3 = this.c.n();
            if (n3 != null) {
                this.b = true;
                g gVar = this.f6789e;
                if (gVar != null) {
                    gVar.b();
                }
                this.f6794j.o(n3);
                this.f6792h.b();
            }
        }
    }

    public Collection<g.e.k.e<? extends Object>> b() {
        return n.i(this.c, this.f6788d);
    }
}

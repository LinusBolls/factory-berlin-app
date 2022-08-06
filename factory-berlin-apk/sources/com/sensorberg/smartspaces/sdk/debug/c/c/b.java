package com.sensorberg.smartspaces.sdk.debug.c.c;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import com.sensorberg.smartspaces.sdk.internal.Connector;
import com.sensorberg.smartspaces.sdk.internal.s.d;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.m.a;
import g.e.n.g.t;
import g.e.n.g.u;
import g.e.n.g.x;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.c.q;
import kotlin.jvm.internal.v;

/* compiled from: IotUnitViewModel.kt */
public final class b extends n0 implements com.sensorberg.smartspaces.sdk.internal.s.d {
    /* access modifiers changed from: private */
    public static final org.threeten.bp.format.c y;
    public static final k z = new k((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.e f6293i = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: j  reason: collision with root package name */
    private final g.e.n.g.e f6294j = new g.e.n.g.e();

    /* renamed from: k  reason: collision with root package name */
    private final LiveData<IotUnit> f6295k;

    /* renamed from: l  reason: collision with root package name */
    private final c0<LiveData<g.e.m.a<IotUnit, g.e.n.g.i>>> f6296l = new c0<>();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final LiveData<Boolean> f6297m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final LiveData<Boolean> f6298n;
    private final LiveData<l> o;
    private final LiveData<m> p;
    private final LiveData<String> q;
    private final LiveData<Boolean> r;
    private final LiveData<String> s;
    private final LiveData<String> t;
    private final LiveData<String> u;
    private final LiveData<Boolean> v;
    private final LiveData<Boolean> w;
    private final LiveData<Boolean> x;

    /* compiled from: Scope.kt */
    public static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6299h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6300i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6301j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6299h = aVar;
            this.f6300i = aVar2;
            this.f6301j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [g.e.n.g.x, java.lang.Object] */
        public final x d() {
            return this.f6299h.e(v.b(x.class), this.f6300i, this.f6301j);
        }
    }

    /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.c.b$b  reason: collision with other inner class name */
    /* compiled from: IotUnitViewModel.kt */
    static final class C0374b<I, O> implements e.b.a.c.a<g.e.m.a<List<? extends IotUnit>, Void>, IotUnit> {
        final /* synthetic */ String a;

        C0374b(String str) {
            this.a = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: com.sensorberg.smartspaces.sdk.model.IotUnit} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.sensorberg.smartspaces.sdk.model.IotUnit} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.sensorberg.smartspaces.sdk.model.IotUnit} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.sensorberg.smartspaces.sdk.model.IotUnit} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.sensorberg.smartspaces.sdk.model.IotUnit a(g.e.m.a<java.util.List<com.sensorberg.smartspaces.sdk.model.IotUnit>, java.lang.Void> r5) {
            /*
                r4 = this;
                r0 = 0
                if (r5 == 0) goto L_0x002b
                java.lang.Object r5 = r5.c()
                java.util.List r5 = (java.util.List) r5
                if (r5 == 0) goto L_0x002b
                java.util.Iterator r5 = r5.iterator()
            L_0x000f:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L_0x0029
                java.lang.Object r1 = r5.next()
                r2 = r1
                com.sensorberg.smartspaces.sdk.model.IotUnit r2 = (com.sensorberg.smartspaces.sdk.model.IotUnit) r2
                java.lang.String r2 = r2.getId()
                java.lang.String r3 = r4.a
                boolean r2 = kotlin.jvm.internal.k.a(r2, r3)
                if (r2 == 0) goto L_0x000f
                r0 = r1
            L_0x0029:
                com.sensorberg.smartspaces.sdk.model.IotUnit r0 = (com.sensorberg.smartspaces.sdk.model.IotUnit) r0
            L_0x002b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.debug.c.c.b.C0374b.a(g.e.m.a):com.sensorberg.smartspaces.sdk.model.IotUnit");
        }
    }

    /* compiled from: IotUnitViewModel.kt */
    static final class c<I, O> implements e.b.a.c.a<IotUnit, l> {
        public static final c a = new c();

        c() {
        }

        /* renamed from: b */
        public final l a(IotUnit iotUnit) {
            if (iotUnit == null) {
                return null;
            }
            int j2 = com.sensorberg.smartspaces.sdk.debug.c.d.c.r.j(iotUnit);
            String displayName = iotUnit.getDisplayName();
            String grouping = iotUnit.getGrouping();
            String str = iotUnit.getType() + " / " + iotUnit.getHardwareType();
            StringBuilder sb = new StringBuilder();
            sb.append("unit: ");
            String backendUnitType = iotUnit.getBackendUnitType();
            if (backendUnitType == null) {
                backendUnitType = "null";
            }
            sb.append(backendUnitType);
            return new l(j2, displayName, grouping, str, sb.toString(), "actuator: " + iotUnit.getActuatorType$sdk_release() + " / " + iotUnit.getAction$sdk_release(), b.z.c(iotUnit), iotUnit.getUnitId(), iotUnit.getActuatorId());
        }
    }

    /* compiled from: IotUnitViewModel.kt */
    static final class d<I, O> implements e.b.a.c.a<g.e.m.a<IotUnit, g.e.n.g.i>, String> {
        public static final d a = new d();

        d() {
        }

        /* renamed from: b */
        public final String a(g.e.m.a<IotUnit, g.e.n.g.i> aVar) {
            String str;
            a.b f2 = aVar != null ? aVar.f() : null;
            if (f2 == null) {
                return "";
            }
            int i2 = c.b[f2.ordinal()];
            if (i2 == 1) {
                g.e.n.g.i e2 = aVar.e();
                if (e2 == null) {
                    return "";
                }
                int i3 = c.a[e2.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    return b.z.d() + " searching";
                } else if (i3 == 3) {
                    return b.z.d() + " connecting";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (i2 == 2) {
                return b.z.d() + " success";
            } else if (i2 == 3) {
                StringBuilder sb = new StringBuilder();
                sb.append(b.z.d());
                sb.append(" fail: ");
                Exception d2 = aVar.d();
                if (d2 == null || (str = d2.getMessage()) == null) {
                    str = "null";
                }
                sb.append(str);
                return sb.toString();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* compiled from: IotUnitViewModel.kt */
    static final class e<I, O> implements e.b.a.c.a<g.e.m.a<IotUnit, g.e.n.g.i>, Boolean> {
        public static final e a = new e();

        e() {
        }

        /* renamed from: b */
        public final Boolean a(g.e.m.a<IotUnit, g.e.n.g.i> aVar) {
            return Boolean.valueOf((aVar != null ? aVar.f() : null) == a.b.EXECUTING);
        }
    }

    /* compiled from: IotUnitViewModel.kt */
    static final class f extends kotlin.jvm.internal.l implements kotlin.e0.c.l<e0<m>, kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6302h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ LiveData f6303i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f6304j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, LiveData liveData, String str) {
            super(1);
            this.f6302h = bVar;
            this.f6303i = liveData;
            this.f6304j = str;
        }

        /* JADX WARNING: type inference failed for: r3v1, types: [com.sensorberg.smartspaces.sdk.debug.c.c.b$m] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(androidx.lifecycle.e0<com.sensorberg.smartspaces.sdk.debug.c.c.b.m> r6) {
            /*
                r5 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.k.e(r6, r0)
                androidx.lifecycle.LiveData r0 = r5.f6303i
                java.lang.Object r0 = r0.l()
                g.e.m.a r0 = (g.e.m.a) r0
                r1 = 0
                if (r0 == 0) goto L_0x007f
                java.lang.Object r0 = r0.c()
                java.util.List r0 = (java.util.List) r0
                if (r0 == 0) goto L_0x007f
                java.util.Iterator r0 = r0.iterator()
            L_0x001c:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0036
                java.lang.Object r2 = r0.next()
                r3 = r2
                com.sensorberg.smartspaces.sdk.model.IotUnit r3 = (com.sensorberg.smartspaces.sdk.model.IotUnit) r3
                java.lang.String r3 = r3.getId()
                java.lang.String r4 = r5.f6304j
                boolean r3 = kotlin.jvm.internal.k.a(r3, r4)
                if (r3 == 0) goto L_0x001c
                goto L_0x0037
            L_0x0036:
                r2 = r1
            L_0x0037:
                com.sensorberg.smartspaces.sdk.model.IotUnit r2 = (com.sensorberg.smartspaces.sdk.model.IotUnit) r2
                if (r2 == 0) goto L_0x007f
                java.util.List r0 = r2.getConnections$sdk_release()
                java.lang.Object r0 = kotlin.a0.v.A(r0)
                com.sensorberg.smartspaces.sdk.internal.Connector r0 = (com.sensorberg.smartspaces.sdk.internal.Connector) r0
                if (r0 == 0) goto L_0x0055
                no.nordicsemi.android.support.v18.scanner.m r0 = r0.c()
                if (r0 == 0) goto L_0x0055
                int r0 = r0.b()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            L_0x0055:
                com.sensorberg.smartspaces.sdk.debug.c.d.c$h r0 = com.sensorberg.smartspaces.sdk.debug.c.d.c.r
                int r0 = r0.o(r1)
                com.sensorberg.smartspaces.sdk.debug.c.c.b r2 = r5.f6302h
                androidx.lifecycle.LiveData r2 = r2.f6298n
                androidx.lifecycle.e0 r2 = (androidx.lifecycle.e0) r2
                java.lang.Object r2 = r2.l()
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                boolean r2 = kotlin.jvm.internal.k.a(r2, r3)
                com.sensorberg.smartspaces.sdk.debug.c.c.b$m r3 = new com.sensorberg.smartspaces.sdk.debug.c.c.b$m
                com.sensorberg.smartspaces.sdk.debug.c.d.c$h r4 = com.sensorberg.smartspaces.sdk.debug.c.d.c.r
                java.lang.String r1 = r4.p(r1)
                if (r2 == 0) goto L_0x007b
                r0 = 100
            L_0x007b:
                r3.<init>(r1, r0)
                r1 = r3
            L_0x007f:
                r6.u(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.debug.c.c.b.f.a(androidx.lifecycle.e0):void");
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((e0) obj);
            return kotlin.x.a;
        }
    }

    /* compiled from: IotUnitViewModel.kt */
    static final class g<I, O> implements e.b.a.c.a<IotUnit, Boolean> {
        public static final g a = new g();

        g() {
        }

        /* renamed from: b */
        public final Boolean a(IotUnit iotUnit) {
            return Boolean.valueOf((iotUnit != null ? iotUnit.getHardwareType() : null) == IotUnit.HardwareType.BLUE_ID);
        }
    }

    /* compiled from: IotUnitViewModel.kt */
    static final class h extends kotlin.jvm.internal.l implements kotlin.e0.c.l<e0<Boolean>, kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6305h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(1);
            this.f6305h = bVar;
        }

        public final void a(e0<Boolean> e0Var) {
            kotlin.jvm.internal.k.e(e0Var, "it");
            e0Var.u(Boolean.valueOf(kotlin.jvm.internal.k.a((Boolean) ((e0) this.f6305h.f6297m).l(), Boolean.TRUE) || kotlin.jvm.internal.k.a((Boolean) ((e0) this.f6305h.f6298n).l(), Boolean.TRUE)));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((e0) obj);
            return kotlin.x.a;
        }
    }

    /* compiled from: IotUnitViewModel.kt */
    static final class i extends kotlin.jvm.internal.l implements kotlin.e0.c.l<e0<Boolean>, kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6306h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(1);
            this.f6306h = bVar;
        }

        public final void a(e0<Boolean> e0Var) {
            kotlin.jvm.internal.k.e(e0Var, "it");
            e0Var.u(Boolean.valueOf(!kotlin.jvm.internal.k.a((Boolean) ((e0) this.f6306h.f6297m).l(), Boolean.TRUE)));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((e0) obj);
            return kotlin.x.a;
        }
    }

    /* compiled from: IotUnitViewModel.kt */
    static final class j extends kotlin.jvm.internal.l implements kotlin.e0.c.l<e0<Boolean>, kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6307h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(1);
            this.f6307h = bVar;
        }

        public final void a(e0<Boolean> e0Var) {
            kotlin.jvm.internal.k.e(e0Var, "it");
            boolean z = true;
            if (!(!kotlin.jvm.internal.k.a((Boolean) ((e0) this.f6307h.f6297m).l(), Boolean.TRUE)) || !(!kotlin.jvm.internal.k.a((Boolean) ((e0) this.f6307h.f6298n).l(), Boolean.TRUE))) {
                z = false;
            }
            e0Var.u(Boolean.valueOf(z));
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((e0) obj);
            return kotlin.x.a;
        }
    }

    /* compiled from: IotUnitViewModel.kt */
    public static final class k {
        private k() {
        }

        /* access modifiers changed from: private */
        public final String c(IotUnit iotUnit) {
            Connector connector = (Connector) v.A(iotUnit.getConnections$sdk_release());
            if (connector instanceof Connector.c) {
                StringBuilder sb = new StringBuilder();
                sb.append("gateway: ");
                Connector.c cVar = (Connector.c) connector;
                sb.append(cVar.f());
                sb.append(" / ");
                sb.append(cVar.g());
                return sb.toString();
            } else if (connector instanceof Connector.a) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("blueid: ");
                Connector.a aVar = (Connector.a) connector;
                sb2.append(aVar.g());
                sb2.append(" / ");
                sb2.append(aVar.f());
                return sb2.toString();
            } else if (connector == null) {
                return "null";
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }

        /* access modifiers changed from: private */
        public final String d() {
            String b = b.y.b(org.threeten.bp.f.V());
            kotlin.jvm.internal.k.d(b, "formatter.format(LocalTime.now())");
            return b;
        }

        public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: IotUnitViewModel.kt */
    public static final class l {
        private final int a;
        private final String b;
        private final String c;

        /* renamed from: d  reason: collision with root package name */
        private final String f6308d;

        /* renamed from: e  reason: collision with root package name */
        private final String f6309e;

        /* renamed from: f  reason: collision with root package name */
        private final String f6310f;

        /* renamed from: g  reason: collision with root package name */
        private final String f6311g;

        /* renamed from: h  reason: collision with root package name */
        private final String f6312h;

        /* renamed from: i  reason: collision with root package name */
        private final String f6313i;

        public l(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            kotlin.jvm.internal.k.e(str, "title");
            kotlin.jvm.internal.k.e(str2, "subtitle");
            kotlin.jvm.internal.k.e(str3, "types");
            kotlin.jvm.internal.k.e(str4, "backendUnit");
            kotlin.jvm.internal.k.e(str5, "actuator");
            kotlin.jvm.internal.k.e(str6, "connection");
            kotlin.jvm.internal.k.e(str7, "unitId");
            kotlin.jvm.internal.k.e(str8, "actuatorId");
            this.a = i2;
            this.b = str;
            this.c = str2;
            this.f6308d = str3;
            this.f6309e = str4;
            this.f6310f = str5;
            this.f6311g = str6;
            this.f6312h = str7;
            this.f6313i = str8;
        }

        public final String a() {
            return this.f6310f;
        }

        public final String b() {
            return this.f6313i;
        }

        public final String c() {
            return this.f6309e;
        }

        public final String d() {
            return this.f6311g;
        }

        public final int e() {
            return this.a;
        }

        public final String f() {
            return this.c;
        }

        public final String g() {
            return this.b;
        }

        public final String h() {
            return this.f6308d;
        }

        public final String i() {
            return this.f6312h;
        }
    }

    /* compiled from: IotUnitViewModel.kt */
    public static final class m {
        private final String a;
        private final int b;

        public m(String str, int i2) {
            kotlin.jvm.internal.k.e(str, "rssiValue");
            this.a = str;
            this.b = i2;
        }

        public final int a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }
    }

    /* compiled from: IotUnitViewModel.kt */
    static final class n extends kotlin.jvm.internal.l implements q<String, String, Integer, kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6314h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(b bVar) {
            super(3);
            this.f6314h = bVar;
        }

        public final void a(String str, String str2, Integer num) {
            ((e0) this.f6314h.f6297m).u(Boolean.FALSE);
            ((e0) this.f6314h.x()).u("hardwareRevision: " + str);
            ((e0) this.f6314h.w()).u("firmwareVersion: " + str2);
            ((e0) this.f6314h.u()).u("batteryStatus: " + num);
        }

        public /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3) {
            a((String) obj, (String) obj2, (Integer) obj3);
            return kotlin.x.a;
        }
    }

    /* compiled from: IotUnitViewModel.kt */
    static final class o extends kotlin.jvm.internal.l implements kotlin.e0.c.l<String, kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f6315h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(b bVar) {
            super(1);
            this.f6315h = bVar;
        }

        public final void a(String str) {
            kotlin.jvm.internal.k.e(str, "it");
            ((e0) this.f6315h.f6297m).u(Boolean.FALSE);
            ((e0) this.f6315h.x()).u("Fail to get blueId details: " + str);
            ((e0) this.f6315h.w()).u("(╯°□°）╯︵ ┻━┻");
            ((e0) this.f6315h.u()).u(null);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((String) obj);
            return kotlin.x.a;
        }
    }

    /* compiled from: IotUnitViewModel.kt */
    static final class p<I, O> implements e.b.a.c.a<LiveData<g.e.m.a<IotUnit, g.e.n.g.i>>, LiveData<g.e.m.a<IotUnit, g.e.n.g.i>>> {
        public static final p a = new p();

        p() {
        }

        public /* bridge */ /* synthetic */ Object a(Object obj) {
            LiveData liveData = (LiveData) obj;
            b(liveData);
            return liveData;
        }

        public final LiveData<g.e.m.a<IotUnit, g.e.n.g.i>> b(LiveData<g.e.m.a<IotUnit, g.e.n.g.i>> liveData) {
            return liveData;
        }
    }

    static {
        org.threeten.bp.format.c h2 = org.threeten.bp.format.c.h(org.threeten.bp.format.i.SHORT);
        kotlin.jvm.internal.k.d(h2, "DateTimeFormatter.ofLoca…edTime(FormatStyle.SHORT)");
        y = h2;
    }

    public b(String str) {
        kotlin.jvm.internal.k.e(str, "iotUnitId");
        LiveData<IotUnit> b = m0.b(u.a.a(D(), g.e.n.g.b.All, t.None, (IotUnit.Type) null, 4, (Object) null), new C0374b(str));
        kotlin.jvm.internal.k.d(b, "Transformations.map(unit… it.id == iotUnitId }\n\t\t}");
        this.f6295k = b;
        LiveData<l> b2 = m0.b(b, c.a);
        kotlin.jvm.internal.k.d(b2, "Transformations.map(iotU…Unit.actuatorId)\n\t\t\t}\n\t\t}");
        this.o = b2;
        LiveData a2 = u.a.a(D(), g.e.n.g.b.All, t.Distance, (IotUnit.Type) null, 4, (Object) null);
        LiveData<Y> c2 = m0.c(this.f6296l, p.a);
        kotlin.jvm.internal.k.d(c2, "Transformations.switchMap(openingMediator) { it }");
        LiveData<String> b3 = m0.b(c2, d.a);
        kotlin.jvm.internal.k.d(b3, "Transformations.map(open…\"\n\t\t\t\tnull -> \"\"\n\t\t\t}\n\t\t}");
        this.q = b3;
        LiveData<Boolean> b4 = m0.b(c2, e.a);
        kotlin.jvm.internal.k.d(b4, "Transformations.map(open…sponse.Status.EXECUTING }");
        this.f6298n = b4;
        if (b4 != null) {
            ((e0) b4).u(Boolean.FALSE);
            this.f6297m = new e0();
            this.p = com.sensorberg.smartspaces.sdk.debug.c.d.c.r.m(new LiveData[]{a2, this.f6298n}, new f(this, a2, str));
            LiveData<Boolean> b5 = m0.b(this.f6295k, g.a);
            kotlin.jvm.internal.k.d(b5, "Transformations.map(iotU…it.HardwareType.BLUE_ID }");
            this.r = b5;
            this.s = new e0();
            this.t = new e0();
            this.u = new e0();
            this.v = com.sensorberg.smartspaces.sdk.debug.c.d.c.r.m(new LiveData[]{this.f6297m, this.f6298n}, new h(this));
            this.w = com.sensorberg.smartspaces.sdk.debug.c.d.c.r.m(new LiveData[]{this.f6297m}, new i(this));
            this.x = com.sensorberg.smartspaces.sdk.debug.c.d.c.r.m(new LiveData[]{this.f6297m, c2}, new j(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Boolean>");
    }

    private final x D() {
        return (x) this.f6293i.getValue();
    }

    public final LiveData<Boolean> A() {
        return this.x;
    }

    public final LiveData<Boolean> B() {
        return this.v;
    }

    public final LiveData<Boolean> C() {
        return this.w;
    }

    public final LiveData<l> E() {
        return this.o;
    }

    public final LiveData<Boolean> F() {
        return this.r;
    }

    public final void G() {
        if (kotlin.jvm.internal.k.a(this.f6298n.l(), Boolean.TRUE)) {
            g.e.n.g.e.c(this.f6294j, (Exception) null, 1, (Object) null);
            return;
        }
        IotUnit l2 = this.f6295k.l();
        if (l2 != null) {
            c0<LiveData<g.e.m.a<IotUnit, g.e.n.g.i>>> c0Var = this.f6296l;
            x D = D();
            kotlin.jvm.internal.k.d(l2, "it");
            c0Var.u(D.openLiveData(l2, this.f6294j));
        }
    }

    /* access modifiers changed from: protected */
    public void l() {
        g.e.n.g.e.c(this.f6294j, (Exception) null, 1, (Object) null);
        super.l();
    }

    public m.a.c.a n() {
        return d.a.a(this);
    }

    public final LiveData<String> u() {
        return this.u;
    }

    public final void v() {
        if (!kotlin.jvm.internal.k.a(this.f6298n.l(), Boolean.TRUE)) {
            LiveData<Boolean> liveData = this.f6297m;
            if (liveData != null) {
                ((e0) liveData).u(Boolean.TRUE);
                LiveData<String> liveData2 = this.s;
                if (liveData2 != null) {
                    ((e0) liveData2).u("...loading blue-id details");
                    LiveData<String> liveData3 = this.t;
                    if (liveData3 != null) {
                        ((e0) liveData3).u("(this can take a while)");
                        LiveData<String> liveData4 = this.u;
                        if (liveData4 != null) {
                            ((e0) liveData4).u("¯\\_(ツ)_/¯");
                            IotUnit l2 = this.f6295k.l();
                            if (l2 != null) {
                                l2.debugGetBlueIdDetails(new n(this), new o(this));
                                return;
                            }
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.String>");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.String>");
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.String>");
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Boolean>");
        }
    }

    public final LiveData<String> w() {
        return this.t;
    }

    public final LiveData<String> x() {
        return this.s;
    }

    public final LiveData<String> y() {
        return this.q;
    }

    public final LiveData<m> z() {
        return this.p;
    }
}

package com.sensorberg.smartspaces.sdk.debug.c.a;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import com.sensorberg.smartspaces.backend.model.User;
import com.sensorberg.smartspaces.sdk.internal.s.d;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import g.e.m.a;
import g.e.n.g.t;
import g.e.n.g.u;
import g.e.n.g.x;
import g.e.n.g.y;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

/* compiled from: HomeViewModel.kt */
public final class b extends n0 implements com.sensorberg.smartspaces.sdk.internal.s.d {
    public static final k t = new k((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    private final kotlin.e f6185i = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: j  reason: collision with root package name */
    private final kotlin.e f6186j = g.a(new C0360b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: k  reason: collision with root package name */
    private final kotlin.e f6187k = g.a(new c(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: l  reason: collision with root package name */
    private final kotlin.e f6188l = g.a(new d(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: m  reason: collision with root package name */
    private final kotlin.e f6189m = g.a(new e(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: n  reason: collision with root package name */
    private final String f6190n = ("Base URL: " + r().q());
    private final LiveData<String> o;
    private final LiveData<String> p;
    private final LiveData<String> q;
    private final LiveData<String> r;
    private final LiveData<String> s;

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<com.sensorberg.smartspaces.sdk.internal.w.b> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6191h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6192i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6193j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6191h = aVar;
            this.f6192i = aVar2;
            this.f6193j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.smartspaces.sdk.internal.w.b, java.lang.Object] */
        public final com.sensorberg.smartspaces.sdk.internal.w.b d() {
            return this.f6191h.e(v.b(com.sensorberg.smartspaces.sdk.internal.w.b.class), this.f6192i, this.f6193j);
        }
    }

    /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.a.b$b  reason: collision with other inner class name */
    /* compiled from: Scope.kt */
    public static final class C0360b extends l implements kotlin.e0.c.a<com.sensorberg.smartspaces.sdk.internal.unit.c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6194h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6195i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6196j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0360b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6194h = aVar;
            this.f6195i = aVar2;
            this.f6196j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.smartspaces.sdk.internal.unit.c, java.lang.Object] */
        public final com.sensorberg.smartspaces.sdk.internal.unit.c d() {
            return this.f6194h.e(v.b(com.sensorberg.smartspaces.sdk.internal.unit.c.class), this.f6195i, this.f6196j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class c extends l implements kotlin.e0.c.a<com.sensorberg.smartspaces.backend.a> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6197h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6198i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6199j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6197h = aVar;
            this.f6198i = aVar2;
            this.f6199j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.sensorberg.smartspaces.backend.a] */
        public final com.sensorberg.smartspaces.backend.a d() {
            return this.f6197h.e(v.b(com.sensorberg.smartspaces.backend.a.class), this.f6198i, this.f6199j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class d extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6200h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6201i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6202j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6200h = aVar;
            this.f6201i = aVar2;
            this.f6202j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [g.e.n.g.x, java.lang.Object] */
        public final x d() {
            return this.f6200h.e(v.b(x.class), this.f6201i, this.f6202j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class e extends l implements kotlin.e0.c.a<g.e.n.c.d.i> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6203h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6204i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6205j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6203h = aVar;
            this.f6204i = aVar2;
            this.f6205j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [g.e.n.c.d.i, java.lang.Object] */
        public final g.e.n.c.d.i d() {
            return this.f6203h.e(v.b(g.e.n.c.d.i.class), this.f6204i, this.f6205j);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    public static final class f implements kotlinx.coroutines.e3.c<String> {
        final /* synthetic */ kotlinx.coroutines.e3.c a;

        /* compiled from: Collect.kt */
        public static final class a implements kotlinx.coroutines.e3.d<g.e.n.c.d.f> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.e3.d f6206g;

            public a(kotlinx.coroutines.e3.d dVar, f fVar) {
                this.f6206g = dVar;
            }

            public Object a(Object obj, kotlin.c0.d dVar) {
                kotlinx.coroutines.e3.d dVar2 = this.f6206g;
                Object a = dVar2.a("BLE Scanner: " + ((g.e.n.c.d.f) obj), dVar);
                return a == d.c() ? a : kotlin.x.a;
            }
        }

        public f(kotlinx.coroutines.e3.c cVar) {
            this.a = cVar;
        }

        public Object a(kotlinx.coroutines.e3.d dVar, kotlin.c0.d dVar2) {
            Object a2 = this.a.a(new a(dVar, this), dVar2);
            if (a2 == d.c()) {
                return a2;
            }
            return kotlin.x.a;
        }
    }

    /* compiled from: HomeViewModel.kt */
    static final class g<I, O> implements e.b.a.c.a<y.a, String> {
        public static final g a = new g();

        g() {
        }

        /* renamed from: b */
        public final String a(y.a aVar) {
            return "User Manager: " + aVar;
        }
    }

    /* compiled from: HomeViewModel.kt */
    static final class h<I, O> implements e.b.a.c.a<g.e.m.a<User, Void>, String> {
        public static final h a = new h();

        h() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
            r4 = r6.c();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a(g.e.m.a<com.sensorberg.smartspaces.backend.model.User, java.lang.Void> r6) {
            /*
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "User: "
                r0.append(r1)
                com.sensorberg.smartspaces.sdk.debug.c.a.b$k r1 = com.sensorberg.smartspaces.sdk.debug.c.a.b.t
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 0
                if (r6 == 0) goto L_0x001f
                java.lang.Object r4 = r6.c()
                com.sensorberg.smartspaces.backend.model.User r4 = (com.sensorberg.smartspaces.backend.model.User) r4
                if (r4 == 0) goto L_0x001f
                java.lang.String r4 = r4.fullName
                goto L_0x0020
            L_0x001f:
                r4 = r3
            L_0x0020:
                r2.append(r4)
                java.lang.String r4 = " / "
                r2.append(r4)
                if (r6 == 0) goto L_0x0034
                java.lang.Object r4 = r6.c()
                com.sensorberg.smartspaces.backend.model.User r4 = (com.sensorberg.smartspaces.backend.model.User) r4
                if (r4 == 0) goto L_0x0034
                java.lang.String r3 = r4.email
            L_0x0034:
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r6 = r1.b(r2, r6)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.debug.c.a.b.h.a(g.e.m.a):java.lang.String");
        }
    }

    /* compiled from: HomeViewModel.kt */
    static final class i<I, O> implements e.b.a.c.a<x.a, String> {
        public static final i a = new i();

        i() {
        }

        /* renamed from: b */
        public final String a(x.a aVar) {
            return "Unit Controller: " + aVar;
        }
    }

    /* compiled from: HomeViewModel.kt */
    static final class j<I, O> implements e.b.a.c.a<g.e.m.a<List<? extends IotUnit>, Void>, String> {
        public static final j a = new j();

        j() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r1 = r7.c();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a(g.e.m.a<java.util.List<com.sensorberg.smartspaces.sdk.model.IotUnit>, java.lang.Void> r7) {
            /*
                r6 = this;
                r0 = 0
                if (r7 == 0) goto L_0x0010
                java.lang.Object r1 = r7.c()
                java.util.List r1 = (java.util.List) r1
                if (r1 == 0) goto L_0x0010
                int r1 = r1.size()
                goto L_0x0011
            L_0x0010:
                r1 = 0
            L_0x0011:
                r2 = 0
                if (r7 == 0) goto L_0x004a
                java.lang.Object r3 = r7.c()
                java.util.List r3 = (java.util.List) r3
                if (r3 == 0) goto L_0x004a
                boolean r4 = r3 instanceof java.util.Collection
                if (r4 == 0) goto L_0x0027
                boolean r4 = r3.isEmpty()
                if (r4 == 0) goto L_0x0027
                goto L_0x0046
            L_0x0027:
                java.util.Iterator r3 = r3.iterator()
            L_0x002b:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x0046
                java.lang.Object r4 = r3.next()
                com.sensorberg.smartspaces.sdk.model.IotUnit r4 = (com.sensorberg.smartspaces.sdk.model.IotUnit) r4
                boolean r4 = r4.isNearby()
                if (r4 == 0) goto L_0x002b
                int r0 = r0 + 1
                if (r0 < 0) goto L_0x0042
                goto L_0x002b
            L_0x0042:
                kotlin.a0.l.n()
                throw r2
            L_0x0046:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            L_0x004a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "Units Found: "
                r0.append(r3)
                com.sensorberg.smartspaces.sdk.debug.c.a.b$k r3 = com.sensorberg.smartspaces.sdk.debug.c.a.b.t
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "nearby: "
                r4.append(r5)
                r4.append(r2)
                java.lang.String r2 = " / total: "
                r4.append(r2)
                r4.append(r1)
                java.lang.String r1 = r4.toString()
                java.lang.String r7 = r3.b(r1, r7)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.debug.c.a.b.j.a(g.e.m.a):java.lang.String");
        }
    }

    /* compiled from: HomeViewModel.kt */
    public static final class k {
        private k() {
        }

        /* access modifiers changed from: private */
        public final String b(String str, g.e.m.a<? extends Object, ? extends Object> aVar) {
            String str2 = null;
            a.b f2 = aVar != null ? aVar.f() : null;
            if (f2 == null) {
                return "...";
            }
            int i2 = c.a[f2.ordinal()];
            if (i2 == 1) {
                return "(Executing) " + str;
            } else if (i2 == 2) {
                return "(Success) " + str;
            } else if (i2 == 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("(Failed ");
                Exception d2 = aVar.d();
                if (d2 != null) {
                    str2 = d2.getMessage();
                }
                sb.append(str2);
                sb.append(") ");
                sb.append(str);
                return sb.toString();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }

        public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b() {
        LiveData<String> b = m0.b(z().getStatusLiveData(), g.a);
        kotlin.jvm.internal.k.d(b, "Transformations.map(user…\t\t\"User Manager: $it\"\n\t\t}");
        this.o = b;
        LiveData<String> b2 = m0.b(r().A().x(), h.a);
        kotlin.jvm.internal.k.d(b2, "Transformations.map(back….data?.email}\", it)}\"\n\t\t}");
        this.p = b2;
        LiveData<String> b3 = m0.b(B().x(), i.a);
        kotlin.jvm.internal.k.d(b3, "Transformations.map(_uni…Unit Controller: $it\"\n\t\t}");
        this.q = b3;
        this.r = androidx.lifecycle.k.c(new f(s().a()), (kotlin.c0.g) null, 0, 3, (Object) null);
        LiveData<String> b4 = m0.b(u.a.a(v(), g.e.n.g.b.All, t.Distance, (IotUnit.Type) null, 4, (Object) null), j.a);
        kotlin.jvm.internal.k.d(b4, "Transformations.map(unit…total: $total\", it)}\"\n\t\t}");
        this.s = b4;
    }

    private final com.sensorberg.smartspaces.sdk.internal.unit.c B() {
        return (com.sensorberg.smartspaces.sdk.internal.unit.c) this.f6186j.getValue();
    }

    private final com.sensorberg.smartspaces.backend.a r() {
        return (com.sensorberg.smartspaces.backend.a) this.f6187k.getValue();
    }

    private final g.e.n.c.d.i s() {
        return (g.e.n.c.d.i) this.f6189m.getValue();
    }

    private final x v() {
        return (x) this.f6188l.getValue();
    }

    private final com.sensorberg.smartspaces.sdk.internal.w.b z() {
        return (com.sensorberg.smartspaces.sdk.internal.w.b) this.f6185i.getValue();
    }

    public final LiveData<String> A() {
        return this.o;
    }

    public m.a.c.a n() {
        return d.a.a(this);
    }

    public final LiveData<String> t() {
        return this.r;
    }

    public final String u() {
        return this.f6190n;
    }

    public final LiveData<String> w() {
        return this.q;
    }

    public final LiveData<String> x() {
        return this.s;
    }

    public final LiveData<String> y() {
        return this.p;
    }
}

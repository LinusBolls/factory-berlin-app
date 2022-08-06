package com.sensorberg.smartspaces.sdk.debug.c.d;

import android.bluetooth.BluetoothDevice;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import com.sensorberg.smartspaces.sdk.internal.Connector;
import com.sensorberg.smartspaces.sdk.internal.s.d;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import com.sensorberg.smartspaces.sdk.model.Schedule;
import g.e.m.a;
import g.e.n.c.d.b;
import g.e.n.g.c;
import g.e.n.g.m;
import g.e.n.g.t;
import g.e.n.g.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import org.threeten.bp.LocalDate;

/* compiled from: OverviewViewModel.kt */
public final class c extends n0 implements com.sensorberg.smartspaces.sdk.internal.s.d {
    public static final h r = new h((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    private final LiveData<List<i>> f6325i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final e0<t> f6326j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final e0<Integer> f6327k;

    /* renamed from: l  reason: collision with root package name */
    private final kotlin.e f6328l = g.a(new a(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: m  reason: collision with root package name */
    private final kotlin.e f6329m = g.a(new b(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));

    /* renamed from: n  reason: collision with root package name */
    private final kotlin.e f6330n = g.a(new C0378c(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private final kotlin.e o = g.a(new d(n().d(), (m.a.c.j.a) null, (kotlin.e0.c.a) null));
    private final LiveData<String> p;
    private final LiveData<String> q;

    /* compiled from: Scope.kt */
    public static final class a extends l implements kotlin.e0.c.a<g.e.n.g.c> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6331h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6332i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6333j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6331h = aVar;
            this.f6332i = aVar2;
            this.f6333j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, g.e.n.g.c] */
        public final g.e.n.g.c d() {
            return this.f6331h.e(v.b(g.e.n.g.c.class), this.f6332i, this.f6333j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class b extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6334h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6335i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6336j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6334h = aVar;
            this.f6335i = aVar2;
            this.f6336j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [g.e.n.g.x, java.lang.Object] */
        public final x d() {
            return this.f6334h.e(v.b(x.class), this.f6335i, this.f6336j);
        }
    }

    /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.d.c$c  reason: collision with other inner class name */
    /* compiled from: Scope.kt */
    public static final class C0378c extends l implements kotlin.e0.c.a<com.sensorberg.smartspaces.sdk.internal.p.e> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6337h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6338i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6339j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0378c(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6337h = aVar;
            this.f6338i = aVar2;
            this.f6339j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.sensorberg.smartspaces.sdk.internal.p.e, java.lang.Object] */
        public final com.sensorberg.smartspaces.sdk.internal.p.e d() {
            return this.f6337h.e(v.b(com.sensorberg.smartspaces.sdk.internal.p.e.class), this.f6338i, this.f6339j);
        }
    }

    /* compiled from: Scope.kt */
    public static final class d extends l implements kotlin.e0.c.a<g.e.n.c.d.j> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m.a.c.l.a f6340h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m.a.c.j.a f6341i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f6342j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(m.a.c.l.a aVar, m.a.c.j.a aVar2, kotlin.e0.c.a aVar3) {
            super(0);
            this.f6340h = aVar;
            this.f6341i = aVar2;
            this.f6342j = aVar3;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [g.e.n.c.d.j, java.lang.Object] */
        public final g.e.n.c.d.j d() {
            return this.f6340h.e(v.b(g.e.n.c.d.j.class), this.f6341i, this.f6342j);
        }
    }

    /* compiled from: OverviewViewModel.kt */
    static final class e<I, O> implements e.b.a.c.a<g.e.m.a<List<? extends i>, Void>, List<? extends i>> {
        public static final e a = new e();

        e() {
        }

        /* renamed from: b */
        public final List<i> a(g.e.m.a<List<i>, Void> aVar) {
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* compiled from: OverviewViewModel.kt */
    static final class f extends l implements kotlin.e0.c.l<e0<String>, kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f6343h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(1);
            this.f6343h = cVar;
        }

        public final void a(e0<String> e0Var) {
            String str;
            String str2;
            kotlin.jvm.internal.k.e(e0Var, "it");
            t tVar = (t) this.f6343h.f6326j.l();
            if (tVar == null) {
                tVar = t.None;
            }
            int i2 = e.a[tVar.ordinal()];
            if (i2 == 1) {
                str = "Alphabetical";
            } else if (i2 == 2) {
                str = "by Distance";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            Integer num = (Integer) this.f6343h.f6327k.l();
            if (num == null) {
                num = 3;
            }
            if (num != null && num.intValue() == 4) {
                str2 = "Gateways";
            } else if (num != null && num.intValue() == 5) {
                str2 = "BlueIds";
            } else {
                str2 = (num != null && num.intValue() == 6) ? "Unknowns" : "All";
            }
            e0Var.u(str2 + ' ' + str);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((e0) obj);
            return kotlin.x.a;
        }
    }

    /* compiled from: OverviewViewModel.kt */
    static final class g<I, O> implements e.b.a.c.a<x.a, String> {
        public static final g a = new g();

        g() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r1 = r1.toString();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a(g.e.n.g.x.a r1) {
            /*
                r0 = this;
                if (r1 == 0) goto L_0x0009
                java.lang.String r1 = r1.toString()
                if (r1 == 0) goto L_0x0009
                goto L_0x000b
            L_0x0009:
                java.lang.String r1 = " "
            L_0x000b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.debug.c.d.c.g.a(g.e.n.g.x$a):java.lang.String");
        }
    }

    /* compiled from: OverviewViewModel.kt */
    public static final class h {

        /* compiled from: OverviewViewModel.kt */
        static final class a extends kotlin.jvm.internal.l implements kotlin.e0.c.l<i, i> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ List f6344h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(1);
                this.f6344h = list;
            }

            /* renamed from: a */
            public final i o(i iVar) {
                i iVar2 = iVar;
                kotlin.jvm.internal.k.e(iVar2, "item");
                List list = this.f6344h;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (kotlin.jvm.internal.k.a(((IotUnit) it.next()).getId(), iVar.g())) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                return z ? i.b(iVar, 0, (String) null, 0, (String) null, (String) null, true, false, false, 0.0f, (String) null, 0, (IotUnit) null, 4063, (Object) null) : iVar2;
            }
        }

        /* compiled from: OverviewViewModel.kt */
        static final class b extends kotlin.jvm.internal.l implements kotlin.e0.c.l<i, i> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ List f6345h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(List list) {
                super(1);
                this.f6345h = list;
            }

            /* renamed from: a */
            public final i o(i iVar) {
                i iVar2 = iVar;
                kotlin.jvm.internal.k.e(iVar2, "item");
                List list = this.f6345h;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (kotlin.jvm.internal.k.a((String) it.next(), iVar.o())) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                return z ? i.b(iVar, 0, (String) null, 0, (String) null, (String) null, false, false, true, 0.0f, (String) null, 0, (IotUnit) null, 3967, (Object) null) : iVar2;
            }
        }

        /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.d.c$h$c  reason: collision with other inner class name */
        /* compiled from: OverviewViewModel.kt */
        static final class C0379c extends kotlin.jvm.internal.l implements kotlin.e0.c.l<i, i> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ List f6346h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ long f6347i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0379c(List list, long j2) {
                super(1);
                this.f6346h = list;
                this.f6347i = j2;
            }

            /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x0082 A[EDGE_INSN: B:33:0x0082->B:31:0x0082 ?: BREAK  , SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.sensorberg.smartspaces.sdk.debug.c.d.c.i o(com.sensorberg.smartspaces.sdk.debug.c.d.c.i r17) {
                /*
                    r16 = this;
                    r0 = r16
                    r1 = r17
                    java.lang.String r2 = "item"
                    kotlin.jvm.internal.k.e(r1, r2)
                    java.util.List r2 = r0.f6346h
                    boolean r3 = r2 instanceof java.util.Collection
                    r4 = 1
                    r5 = 0
                    if (r3 == 0) goto L_0x0019
                    boolean r3 = r2.isEmpty()
                    if (r3 == 0) goto L_0x0019
                L_0x0017:
                    r4 = 0
                    goto L_0x0082
                L_0x0019:
                    java.util.Iterator r2 = r2.iterator()
                L_0x001d:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L_0x0017
                    java.lang.Object r3 = r2.next()
                    com.sensorberg.smartspaces.sdk.model.Schedule r3 = (com.sensorberg.smartspaces.sdk.model.Schedule) r3
                    com.sensorberg.smartspaces.sdk.model.IotUnit r6 = r3.getIotUnit()
                    java.lang.String r6 = r6.getId()
                    java.lang.String r7 = r17.g()
                    boolean r6 = kotlin.jvm.internal.k.a(r6, r7)
                    if (r6 == 0) goto L_0x007f
                    java.util.List r3 = r3.getBusy()
                    boolean r6 = r3 instanceof java.util.Collection
                    if (r6 == 0) goto L_0x004b
                    boolean r6 = r3.isEmpty()
                    if (r6 == 0) goto L_0x004b
                L_0x0049:
                    r3 = 0
                    goto L_0x007b
                L_0x004b:
                    java.util.Iterator r3 = r3.iterator()
                L_0x004f:
                    boolean r6 = r3.hasNext()
                    if (r6 == 0) goto L_0x0049
                    java.lang.Object r6 = r3.next()
                    g.e.n.c.h.a r6 = (g.e.n.c.h.a) r6
                    java.lang.Long r7 = r6.a()
                    long r8 = r6.b()
                    long r10 = r0.f6347i
                    int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                    if (r6 >= 0) goto L_0x0077
                    if (r7 == 0) goto L_0x0075
                    long r6 = r7.longValue()
                    long r8 = r0.f6347i
                    int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    if (r10 <= 0) goto L_0x0077
                L_0x0075:
                    r6 = 1
                    goto L_0x0078
                L_0x0077:
                    r6 = 0
                L_0x0078:
                    if (r6 == 0) goto L_0x004f
                    r3 = 1
                L_0x007b:
                    if (r3 == 0) goto L_0x007f
                    r3 = 1
                    goto L_0x0080
                L_0x007f:
                    r3 = 0
                L_0x0080:
                    if (r3 == 0) goto L_0x001d
                L_0x0082:
                    if (r4 == 0) goto L_0x0099
                    r2 = 0
                    r3 = 0
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 1
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 4031(0xfbf, float:5.649E-42)
                    r15 = 0
                    r1 = r17
                    com.sensorberg.smartspaces.sdk.debug.c.d.c$i r1 = com.sensorberg.smartspaces.sdk.debug.c.d.c.i.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                L_0x0099:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sensorberg.smartspaces.sdk.debug.c.d.c.h.C0379c.o(com.sensorberg.smartspaces.sdk.debug.c.d.c$i):com.sensorberg.smartspaces.sdk.debug.c.d.c$i");
            }
        }

        /* compiled from: OverviewViewModel.kt */
        static final class d extends kotlin.jvm.internal.l implements kotlin.e0.c.l<i, i> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ List f6348h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(List list) {
                super(1);
                this.f6348h = list;
            }

            /* renamed from: a */
            public final i o(i iVar) {
                Object obj;
                kotlin.jvm.internal.k.e(iVar, "item");
                Iterator it = this.f6348h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.k.a(iVar.e(), c.r.h((g.e.n.c.d.b) obj))) {
                        break;
                    }
                }
                g.e.n.c.d.b bVar = (g.e.n.c.d.b) obj;
                if (bVar != null) {
                    this.f6348h.remove(bVar);
                    float a = bVar.a();
                    i b = i.b(iVar, 0, c.r.p(Integer.valueOf(bVar.c().b())), c.r.o(Integer.valueOf(bVar.c().b())), (String) null, (String) null, false, false, false, a, (String) null, 0, (IotUnit) null, 3833, (Object) null);
                    if (b != null) {
                        return b;
                    }
                }
                return iVar;
            }
        }

        /* compiled from: OverviewViewModel.kt */
        static final class e<T> implements f0<Object> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ kotlin.e0.c.l f6349g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ c0 f6350h;

            e(kotlin.e0.c.l lVar, c0 c0Var) {
                this.f6349g = lVar;
                this.f6350h = c0Var;
            }

            public final void k(Object obj) {
                this.f6349g.o(this.f6350h);
            }
        }

        /* compiled from: OverviewViewModel.kt */
        static final class f extends kotlin.jvm.internal.l implements kotlin.e0.c.l<i, Boolean> {

            /* renamed from: h  reason: collision with root package name */
            public static final f f6351h = new f();

            f() {
                super(1);
            }

            public final boolean a(i iVar) {
                kotlin.jvm.internal.k.e(iVar, "it");
                IotUnit k2 = iVar.k();
                return (k2 != null ? k2.getHardwareType() : null) == IotUnit.HardwareType.SB_GATEWAY;
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                return Boolean.valueOf(a((i) obj));
            }
        }

        /* compiled from: OverviewViewModel.kt */
        static final class g extends kotlin.jvm.internal.l implements kotlin.e0.c.l<i, Boolean> {

            /* renamed from: h  reason: collision with root package name */
            public static final g f6352h = new g();

            g() {
                super(1);
            }

            public final boolean a(i iVar) {
                kotlin.jvm.internal.k.e(iVar, "it");
                IotUnit k2 = iVar.k();
                return (k2 != null ? k2.getHardwareType() : null) == IotUnit.HardwareType.BLUE_ID;
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                return Boolean.valueOf(a((i) obj));
            }
        }

        /* renamed from: com.sensorberg.smartspaces.sdk.debug.c.d.c$h$h  reason: collision with other inner class name */
        /* compiled from: OverviewViewModel.kt */
        static final class C0380h extends kotlin.jvm.internal.l implements kotlin.e0.c.l<i, Boolean> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0380h f6353h = new C0380h();

            C0380h() {
                super(1);
            }

            public final boolean a(i iVar) {
                kotlin.jvm.internal.k.e(iVar, "it");
                return iVar.k() == null;
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                return Boolean.valueOf(a((i) obj));
            }
        }

        /* compiled from: OverviewViewModel.kt */
        static final class i extends kotlin.jvm.internal.l implements kotlin.e0.c.l<i, Comparable<?>> {

            /* renamed from: h  reason: collision with root package name */
            public static final i f6354h = new i();

            i() {
                super(1);
            }

            /* renamed from: a */
            public final Comparable<?> o(i iVar) {
                kotlin.jvm.internal.k.e(iVar, "it");
                return Integer.valueOf(iVar.n());
            }
        }

        /* compiled from: OverviewViewModel.kt */
        static final class j extends kotlin.jvm.internal.l implements kotlin.e0.c.l<i, Comparable<?>> {

            /* renamed from: h  reason: collision with root package name */
            public static final j f6355h = new j();

            j() {
                super(1);
            }

            /* renamed from: a */
            public final Comparable<?> o(i iVar) {
                kotlin.jvm.internal.k.e(iVar, "it");
                String h2 = iVar.h();
                Locale locale = Locale.US;
                kotlin.jvm.internal.k.d(locale, "Locale.US");
                if (h2 != null) {
                    String lowerCase = h2.toLowerCase(locale);
                    kotlin.jvm.internal.k.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    return lowerCase;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }

        /* compiled from: OverviewViewModel.kt */
        static final class k extends kotlin.jvm.internal.l implements kotlin.e0.c.l<i, Comparable<?>> {

            /* renamed from: h  reason: collision with root package name */
            public static final k f6356h = new k();

            k() {
                super(1);
            }

            /* renamed from: a */
            public final Comparable<?> o(i iVar) {
                kotlin.jvm.internal.k.e(iVar, "it");
                return Float.valueOf(-iVar.i());
            }
        }

        /* compiled from: OverviewViewModel.kt */
        static final class l extends kotlin.jvm.internal.l implements kotlin.e0.c.l<i, Comparable<?>> {

            /* renamed from: h  reason: collision with root package name */
            public static final l f6357h = new l();

            l() {
                super(1);
            }

            /* renamed from: a */
            public final Comparable<?> o(i iVar) {
                kotlin.jvm.internal.k.e(iVar, "it");
                return iVar.h();
            }
        }

        private h() {
        }

        private final void c(List<i> list, List<IotUnit> list2) {
            l(list, new a(list2));
        }

        private final void d(List<i> list, List<String> list2) {
            l(list, new b(list2));
        }

        private final void e(List<i> list, List<Schedule> list2) {
            l(list, new C0379c(list2, System.currentTimeMillis()));
        }

        private final void f(List<i> list, List<g.e.n.c.d.b> list2) {
            List<i> list3 = list;
            l(list3, new d(list2));
            for (g.e.n.c.d.b bVar : list2) {
                String h2 = c.r.h(bVar);
                int i2 = m.smartspaces_unknown;
                String p = c.r.p(Integer.valueOf(bVar.c().b()));
                int o = c.r.o(Integer.valueOf(bVar.c().b()));
                BluetoothDevice a2 = bVar.c().a();
                kotlin.jvm.internal.k.d(a2, "it.currentScanResult.device");
                String address = a2.getAddress();
                kotlin.jvm.internal.k.d(address, "it.currentScanResult.device.address");
                list3.add(new i(i2, p, o, address, h2, false, false, false, bVar.a(), h2, 1, (IotUnit) null));
            }
        }

        private final String g(IotUnit iotUnit) {
            Connector connector = iotUnit.getConnections$sdk_release().get(0);
            if (connector instanceof Connector.c) {
                return ((Connector.c) connector).f();
            }
            if (connector instanceof Connector.a) {
                return ((Connector.a) connector).f();
            }
            throw new NoWhenBranchMatchedException();
        }

        /* access modifiers changed from: private */
        public final String h(g.e.n.c.d.b bVar) {
            if (bVar instanceof b.C0694b) {
                return ((b.C0694b) bVar).f();
            }
            if (bVar instanceof b.a) {
                return ((b.a) bVar).e();
            }
            if (bVar instanceof b.c) {
                return ((b.c) bVar).e();
            }
            throw new NoWhenBranchMatchedException();
        }

        private final void i(List<i> list, List<IotUnit> list2) {
            for (IotUnit iotUnit : list2) {
                List<i> list3 = list;
                list3.add(new i(c.r.j(iotUnit), c.r.p((Integer) null), c.r.o((Integer) null), iotUnit.getDisplayName(), iotUnit.getActuatorId(), false, false, false, Float.NEGATIVE_INFINITY, c.r.g(iotUnit), 0, iotUnit));
            }
        }

        private final <T> void k(List<T> list, kotlin.e0.c.l<? super T, Boolean> lVar) {
            ListIterator<T> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (!lVar.o(listIterator.next()).booleanValue()) {
                    listIterator.remove();
                }
            }
        }

        private final <T> void l(List<T> list, kotlin.e0.c.l<? super T, ? extends T> lVar) {
            ListIterator<T> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                listIterator.set(lVar.o(listIterator.next()));
            }
        }

        /* access modifiers changed from: private */
        public final List<i> n(List<IotUnit> list, List<IotUnit> list2, List<? extends g.e.n.c.d.b> list3, List<Schedule> list4, List<String> list5, t tVar, Integer num) {
            List<T> list6;
            List<T> list7;
            List<T> list8;
            List<T> list9;
            List<T> list10;
            if (list == null || (list6 = v.T(list)) == null) {
                list6 = new ArrayList<>();
            }
            if (list2 == null || (list7 = v.T(list2)) == null) {
                list7 = new ArrayList<>();
            }
            if (list3 == null || (list8 = v.T(list3)) == null) {
                list8 = new ArrayList<>();
            }
            if (list4 == null || (list9 = v.T(list4)) == null) {
                list9 = new ArrayList<>();
            }
            if (list5 == null || (list10 = v.T(list5)) == null) {
                list10 = new ArrayList<>();
            }
            ArrayList arrayList = new ArrayList();
            i(arrayList, list6);
            f(arrayList, list8);
            c(arrayList, list7);
            e(arrayList, list9);
            d(arrayList, list10);
            int intValue = num != null ? num.intValue() : 3;
            if (intValue == 4) {
                k(arrayList, f.f6351h);
            } else if (intValue == 5) {
                k(arrayList, g.f6352h);
            } else if (intValue == 6) {
                k(arrayList, C0380h.f6353h);
            }
            if (tVar == null) {
                tVar = t.None;
            }
            int i2 = d.a[tVar.ordinal()];
            if (i2 == 1) {
                r.r(arrayList, b.b(i.f6354h, j.f6355h));
            } else if (i2 == 2) {
                r.r(arrayList, b.b(k.f6356h, l.f6357h));
            }
            return arrayList;
        }

        public final int j(IotUnit iotUnit) {
            kotlin.jvm.internal.k.e(iotUnit, "iotUnit");
            if (iotUnit.getHardwareType() == IotUnit.HardwareType.SB_GATEWAY) {
                return m.smartspaces_gateway;
            }
            return m.smartspaces_cylinder;
        }

        public final <T> LiveData<T> m(LiveData<? extends Object>[] liveDataArr, kotlin.e0.c.l<? super e0<T>, kotlin.x> lVar) {
            kotlin.jvm.internal.k.e(liveDataArr, "sources");
            kotlin.jvm.internal.k.e(lVar, "mapper");
            c0 c0Var = new c0();
            e eVar = new e(lVar, c0Var);
            for (LiveData<? extends Object> v : liveDataArr) {
                c0Var.v(v, eVar);
            }
            return c0Var;
        }

        public final int o(Integer num) {
            if (num == null) {
                return 1;
            }
            int intValue = num.intValue();
            if (-50 <= intValue && intValue <= 0) {
                return 5;
            }
            int intValue2 = num.intValue();
            if (-70 <= intValue2 && -50 >= intValue2) {
                return 4;
            }
            int intValue3 = num.intValue();
            return (-90 <= intValue3 && -70 >= intValue3) ? 3 : 2;
        }

        public final String p(Integer num) {
            if (num == null) {
                return "rssi: -- dB";
            }
            return "rssi: " + num + " dB";
        }

        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: OverviewViewModel.kt */
    public static final class i {
        private final int a;
        private final String b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private final String f6358d;

        /* renamed from: e  reason: collision with root package name */
        private final String f6359e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f6360f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f6361g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f6362h;

        /* renamed from: i  reason: collision with root package name */
        private final float f6363i;

        /* renamed from: j  reason: collision with root package name */
        private final String f6364j;

        /* renamed from: k  reason: collision with root package name */
        private final int f6365k;

        /* renamed from: l  reason: collision with root package name */
        private final IotUnit f6366l;

        public i(int i2, String str, int i3, String str2, String str3, boolean z, boolean z2, boolean z3, float f2, String str4, int i4, IotUnit iotUnit) {
            kotlin.jvm.internal.k.e(str, "rssiValue");
            kotlin.jvm.internal.k.e(str2, "displayName");
            kotlin.jvm.internal.k.e(str3, "deviceId");
            kotlin.jvm.internal.k.e(str4, "bluetoothId");
            this.a = i2;
            this.b = str;
            this.c = i3;
            this.f6358d = str2;
            this.f6359e = str3;
            this.f6360f = z;
            this.f6361g = z2;
            this.f6362h = z3;
            this.f6363i = f2;
            this.f6364j = str4;
            this.f6365k = i4;
            this.f6366l = iotUnit;
        }

        public static /* synthetic */ i b(i iVar, int i2, String str, int i3, String str2, String str3, boolean z, boolean z2, boolean z3, float f2, String str4, int i4, IotUnit iotUnit, int i5, Object obj) {
            i iVar2 = iVar;
            int i6 = i5;
            return iVar.a((i6 & 1) != 0 ? iVar2.a : i2, (i6 & 2) != 0 ? iVar2.b : str, (i6 & 4) != 0 ? iVar2.c : i3, (i6 & 8) != 0 ? iVar2.f6358d : str2, (i6 & 16) != 0 ? iVar2.f6359e : str3, (i6 & 32) != 0 ? iVar2.f6360f : z, (i6 & 64) != 0 ? iVar2.f6361g : z2, (i6 & 128) != 0 ? iVar2.f6362h : z3, (i6 & 256) != 0 ? iVar2.f6363i : f2, (i6 & 512) != 0 ? iVar2.f6364j : str4, (i6 & 1024) != 0 ? iVar2.f6365k : i4, (i6 & 2048) != 0 ? iVar2.f6366l : iotUnit);
        }

        public final i a(int i2, String str, int i3, String str2, String str3, boolean z, boolean z2, boolean z3, float f2, String str4, int i4, IotUnit iotUnit) {
            String str5 = str;
            kotlin.jvm.internal.k.e(str5, "rssiValue");
            String str6 = str2;
            kotlin.jvm.internal.k.e(str6, "displayName");
            String str7 = str3;
            kotlin.jvm.internal.k.e(str7, "deviceId");
            String str8 = str4;
            kotlin.jvm.internal.k.e(str8, "bluetoothId");
            return new i(i2, str5, i3, str6, str7, z, z2, z3, f2, str8, i4, iotUnit);
        }

        public final boolean c() {
            return this.f6360f;
        }

        public final boolean d() {
            return this.f6362h;
        }

        public final String e() {
            return this.f6364j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a == iVar.a && kotlin.jvm.internal.k.a(this.b, iVar.b) && this.c == iVar.c && kotlin.jvm.internal.k.a(this.f6358d, iVar.f6358d) && kotlin.jvm.internal.k.a(this.f6359e, iVar.f6359e) && this.f6360f == iVar.f6360f && this.f6361g == iVar.f6361g && this.f6362h == iVar.f6362h && Float.compare(this.f6363i, iVar.f6363i) == 0 && kotlin.jvm.internal.k.a(this.f6364j, iVar.f6364j) && this.f6365k == iVar.f6365k && kotlin.jvm.internal.k.a(this.f6366l, iVar.f6366l);
        }

        public final boolean f() {
            return this.f6361g;
        }

        public final String g() {
            return this.f6359e;
        }

        public final String h() {
            return this.f6358d;
        }

        public int hashCode() {
            int i2 = this.a * 31;
            String str = this.b;
            int i3 = 0;
            int hashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.c) * 31;
            String str2 = this.f6358d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f6359e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            boolean z = this.f6360f;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i4 = (hashCode3 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f6361g;
            if (z3) {
                z3 = true;
            }
            int i5 = (i4 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f6362h;
            if (!z4) {
                z2 = z4;
            }
            int floatToIntBits = (((i5 + (z2 ? 1 : 0)) * 31) + Float.floatToIntBits(this.f6363i)) * 31;
            String str4 = this.f6364j;
            int hashCode4 = (((floatToIntBits + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f6365k) * 31;
            IotUnit iotUnit = this.f6366l;
            if (iotUnit != null) {
                i3 = iotUnit.hashCode();
            }
            return hashCode4 + i3;
        }

        public final float i() {
            return this.f6363i;
        }

        public final int j() {
            return this.a;
        }

        public final IotUnit k() {
            return this.f6366l;
        }

        public final int l() {
            return this.c;
        }

        public final String m() {
            return this.b;
        }

        public final int n() {
            return this.f6365k;
        }

        public final String o() {
            List<Connector> connections$sdk_release;
            Connector connector;
            IotUnit iotUnit = this.f6366l;
            if (iotUnit == null || (connections$sdk_release = iotUnit.getConnections$sdk_release()) == null || (connector = (Connector) v.A(connections$sdk_release)) == null || !(connector instanceof Connector.a)) {
                return null;
            }
            return ((Connector.a) connector).g();
        }

        public String toString() {
            return "Item(hardwareIcon=" + this.a + ", rssiValue=" + this.b + ", rssiLevel=" + this.c + ", displayName=" + this.f6358d + ", deviceId=" + this.f6359e + ", available=" + this.f6360f + ", booked=" + this.f6361g + ", blueId=" + this.f6362h + ", distance=" + this.f6363i + ", bluetoothId=" + this.f6364j + ", isUnknown=" + this.f6365k + ", iotUnit=" + this.f6366l + ")";
        }
    }

    /* compiled from: OverviewViewModel.kt */
    static final class j extends l implements kotlin.e0.c.a<kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LiveData f6367h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ LiveData f6368i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ LiveData f6369j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ LiveData f6370k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ LiveData f6371l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ t f6372m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Integer f6373n;
        final /* synthetic */ e0 o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(LiveData liveData, LiveData liveData2, LiveData liveData3, LiveData liveData4, LiveData liveData5, t tVar, Integer num, e0 e0Var) {
            super(0);
            this.f6367h = liveData;
            this.f6368i = liveData2;
            this.f6369j = liveData3;
            this.f6370k = liveData4;
            this.f6371l = liveData5;
            this.f6372m = tVar;
            this.f6373n = num;
            this.o = e0Var;
        }

        public final void a() {
            h hVar = c.r;
            List list = (List) this.f6367h.l();
            List list2 = (List) this.f6368i.l();
            List list3 = (List) this.f6369j.l();
            g.e.m.a aVar = (g.e.m.a) this.f6370k.l();
            this.o.s(new g.e.m.a(a.b.SUCCESS, hVar.n(list, list2, list3, aVar != null ? (List) aVar.c() : null, (List) this.f6371l.l(), this.f6372m, this.f6373n), null, (Exception) null));
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return kotlin.x.a;
        }
    }

    /* compiled from: OverviewViewModel.kt */
    static final class k extends l implements kotlin.e0.c.l<e0<g.e.m.a<List<? extends i>, Void>>, kotlin.x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f6374h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ LiveData f6375i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ LiveData f6376j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ LiveData f6377k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ LiveData f6378l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ LiveData f6379m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar, LiveData liveData, LiveData liveData2, LiveData liveData3, LiveData liveData4, LiveData liveData5) {
            super(1);
            this.f6374h = cVar;
            this.f6375i = liveData;
            this.f6376j = liveData2;
            this.f6377k = liveData3;
            this.f6378l = liveData4;
            this.f6379m = liveData5;
        }

        public final void a(e0<g.e.m.a<List<i>, Void>> e0Var) {
            kotlin.jvm.internal.k.e(e0Var, "it");
            c cVar = this.f6374h;
            cVar.C(e0Var, this.f6375i, this.f6376j, this.f6377k, this.f6378l, this.f6379m, (t) cVar.f6326j.l(), (Integer) this.f6374h.f6327k.l());
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((e0) obj);
            return kotlin.x.a;
        }
    }

    public c() {
        e0<t> e0Var = new e0<>();
        e0Var.u(t.None);
        kotlin.x xVar = kotlin.x.a;
        this.f6326j = e0Var;
        e0<Integer> e0Var2 = new e0<>();
        e0Var2.u(3);
        kotlin.x xVar2 = kotlin.x.a;
        this.f6327k = e0Var2;
        LiveData c = androidx.lifecycle.k.c(A().getUnits(g.e.n.g.b.All, t.None, (IotUnit.Type) null), (kotlin.c0.g) null, 0, 3, (Object) null);
        LiveData c2 = androidx.lifecycle.k.c(A().getUnits(g.e.n.g.b.AvailableNow, t.None, (IotUnit.Type) null), (kotlin.c0.g) null, 0, 3, (Object) null);
        LiveData c3 = androidx.lifecycle.k.c(x().a(), (kotlin.c0.g) null, 0, 3, (Object) null);
        g.e.n.g.c v = v();
        LocalDate x0 = LocalDate.x0();
        kotlin.jvm.internal.k.d(x0, "LocalDate.now()");
        LocalDate H0 = LocalDate.x0().H0(2);
        kotlin.jvm.internal.k.d(H0, "LocalDate.now().plusWeeks(WEEKS)");
        LiveData c4 = c.a.c(v, x0, H0, (IotUnit) null, 4, (Object) null);
        LiveData<List<String>> x = u().d().x();
        LiveData<List<i>> b2 = m0.b(r.m(new LiveData[]{c, c2, c3, c4, x, this.f6326j, this.f6327k}, new k(this, c, c2, c3, c4, x)), e.a);
        kotlin.jvm.internal.k.d(b2, "Transformations.map(responseData) { it?.data }");
        this.f6325i = b2;
        this.p = r.m(new LiveData[]{this.f6326j, this.f6327k}, new f(this));
        LiveData<String> b3 = m0.b(A().getStatusLiveData(), g.a);
        kotlin.jvm.internal.k.d(b3, "Transformations.map(unit…it?.toString() ?: \" \"\n\t\t}");
        this.q = b3;
    }

    private final x A() {
        return (x) this.f6329m.getValue();
    }

    /* access modifiers changed from: private */
    public final void C(e0<g.e.m.a<List<i>, Void>> e0Var, LiveData<List<IotUnit>> liveData, LiveData<List<IotUnit>> liveData2, LiveData<List<g.e.n.c.d.b>> liveData3, LiveData<g.e.m.a<List<Schedule>, Void>> liveData4, LiveData<List<String>> liveData5, t tVar, Integer num) {
        g.e.e.a aVar = g.e.e.a.f9778f;
        aVar.j(aVar.d(), new j(liveData, liveData2, liveData3, liveData4, liveData5, tVar, num, e0Var));
    }

    private final com.sensorberg.smartspaces.sdk.internal.p.e u() {
        return (com.sensorberg.smartspaces.sdk.internal.p.e) this.f6330n.getValue();
    }

    private final g.e.n.g.c v() {
        return (g.e.n.g.c) this.f6328l.getValue();
    }

    private final g.e.n.c.d.j x() {
        return (g.e.n.c.d.j) this.o.getValue();
    }

    public final void B(int i2) {
        switch (i2) {
            case 1:
                this.f6326j.u(t.None);
                return;
            case 2:
                this.f6326j.u(t.Distance);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                this.f6327k.u(Integer.valueOf(i2));
                return;
            default:
                return;
        }
    }

    public m.a.c.a n() {
        return d.a.a(this);
    }

    public final LiveData<List<i>> w() {
        return this.f6325i;
    }

    public final LiveData<String> y() {
        return this.q;
    }

    public final LiveData<String> z() {
        return this.p;
    }
}

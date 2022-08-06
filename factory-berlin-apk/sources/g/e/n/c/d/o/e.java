package g.e.n.c.d.o;

import androidx.recyclerview.widget.RecyclerView;
import g.e.n.c.d.b;
import g.e.n.c.g.f.g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.c0.j.a.f;
import kotlin.jvm.internal.k;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.e3.c;
import kotlinx.coroutines.e3.d;

/* compiled from: BleScanRepositoryImpl.kt */
public final class e implements d {
    /* access modifiers changed from: private */
    public final Map<String, b> a;
    private final c<List<b>> b;
    /* access modifiers changed from: private */
    public final b c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final g f9998d;

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements c<List<? extends b>> {
        final /* synthetic */ c a;
        final /* synthetic */ e b;

        /* renamed from: g.e.n.c.d.o.e$a$a  reason: collision with other inner class name */
        /* compiled from: Collect.kt */
        public static final class C0696a implements d<g.e.n.c.d.c> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ d f9999g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f10000h;

            @f(c = "com.sensorberg.smartspaces.domain.bluetooth.internal.BleScanRepositoryImpl$$special$$inlined$map$1$2", f = "BleScanRepositoryImpl.kt", l = {144, 139}, m = "emit")
            /* renamed from: g.e.n.c.d.o.e$a$a$a  reason: collision with other inner class name */
            public static final class C0697a extends kotlin.c0.j.a.d {
                Object A;
                Object B;

                /* renamed from: j  reason: collision with root package name */
                /* synthetic */ Object f10001j;

                /* renamed from: k  reason: collision with root package name */
                int f10002k;

                /* renamed from: l  reason: collision with root package name */
                final /* synthetic */ C0696a f10003l;

                /* renamed from: m  reason: collision with root package name */
                Object f10004m;

                /* renamed from: n  reason: collision with root package name */
                Object f10005n;
                Object o;
                Object p;
                Object q;
                Object r;
                Object s;
                Object t;
                Object u;
                Object v;
                Object w;
                Object x;
                Object y;
                Object z;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0697a(C0696a aVar, kotlin.c0.d dVar) {
                    super(dVar);
                    this.f10003l = aVar;
                }

                public final Object i(Object obj) {
                    this.f10001j = obj;
                    this.f10002k |= RecyclerView.UNDEFINED_DURATION;
                    return this.f10003l.a((Object) null, this);
                }
            }

            public C0696a(d dVar, a aVar) {
                this.f9999g = dVar;
                this.f10000h = aVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.util.List} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.util.List} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.util.List<g.e.n.c.d.b>} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.util.List} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.util.List<g.e.n.c.d.b>} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.util.List} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.util.List<g.e.n.c.d.b>} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: java.util.List<g.e.n.c.d.b>} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.util.List<g.e.n.c.d.b>} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.util.List<g.e.n.c.d.b>} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.util.List<g.e.n.c.d.b>} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.util.List} */
            /* JADX WARNING: type inference failed for: r12v9, types: [kotlin.c0.d] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x00a7  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x00fc  */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x018a  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x01aa A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object a(java.lang.Object r22, kotlin.c0.d r23) {
                /*
                    r21 = this;
                    r0 = r21
                    r1 = r23
                    boolean r2 = r1 instanceof g.e.n.c.d.o.e.a.C0696a.C0697a
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    g.e.n.c.d.o.e$a$a$a r2 = (g.e.n.c.d.o.e.a.C0696a.C0697a) r2
                    int r3 = r2.f10002k
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.f10002k = r3
                    goto L_0x001c
                L_0x0017:
                    g.e.n.c.d.o.e$a$a$a r2 = new g.e.n.c.d.o.e$a$a$a
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.f10001j
                    java.lang.Object r3 = kotlin.c0.i.d.c()
                    int r4 = r2.f10002k
                    r5 = 2
                    r6 = 1
                    if (r4 == 0) goto L_0x00a7
                    if (r4 == r6) goto L_0x004f
                    if (r4 != r5) goto L_0x0047
                    java.lang.Object r3 = r2.s
                    kotlinx.coroutines.e3.d r3 = (kotlinx.coroutines.e3.d) r3
                    java.lang.Object r3 = r2.r
                    java.lang.Object r3 = r2.q
                    g.e.n.c.d.o.e$a$a$a r3 = (g.e.n.c.d.o.e.a.C0696a.C0697a) r3
                    java.lang.Object r3 = r2.p
                    java.lang.Object r3 = r2.o
                    g.e.n.c.d.o.e$a$a$a r3 = (g.e.n.c.d.o.e.a.C0696a.C0697a) r3
                    java.lang.Object r3 = r2.f10005n
                    java.lang.Object r2 = r2.f10004m
                    g.e.n.c.d.o.e$a$a r2 = (g.e.n.c.d.o.e.a.C0696a) r2
                    kotlin.l.b(r1)
                    goto L_0x01ab
                L_0x0047:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x004f:
                    java.lang.Object r4 = r2.B
                    kotlinx.coroutines.e3.d r4 = (kotlinx.coroutines.e3.d) r4
                    java.lang.Object r7 = r2.A
                    g.e.n.c.d.b r7 = (g.e.n.c.d.b) r7
                    java.lang.Object r7 = r2.z
                    java.lang.Object r7 = r2.y
                    java.util.Iterator r7 = (java.util.Iterator) r7
                    java.lang.Object r8 = r2.x
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.lang.Object r9 = r2.w
                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                    java.lang.Object r10 = r2.v
                    java.lang.Iterable r10 = (java.lang.Iterable) r10
                    java.lang.Object r11 = r2.u
                    g.e.n.c.d.c r11 = (g.e.n.c.d.c) r11
                    java.lang.Object r12 = r2.t
                    kotlin.c0.d r12 = (kotlin.c0.d) r12
                    java.lang.Object r13 = r2.s
                    kotlinx.coroutines.e3.d r13 = (kotlinx.coroutines.e3.d) r13
                    java.lang.Object r14 = r2.r
                    java.lang.Object r15 = r2.q
                    g.e.n.c.d.o.e$a$a$a r15 = (g.e.n.c.d.o.e.a.C0696a.C0697a) r15
                    java.lang.Object r5 = r2.p
                    java.lang.Object r6 = r2.o
                    g.e.n.c.d.o.e$a$a$a r6 = (g.e.n.c.d.o.e.a.C0696a.C0697a) r6
                    r16 = r3
                    java.lang.Object r3 = r2.f10005n
                    r22 = r3
                    java.lang.Object r3 = r2.f10004m
                    g.e.n.c.d.o.e$a$a r3 = (g.e.n.c.d.o.e.a.C0696a) r3
                    kotlin.l.b(r1)
                    r1 = r22
                    r19 = r7
                    r7 = r12
                    r0 = r13
                    r12 = r8
                    r13 = r9
                    r9 = r16
                    r8 = r3
                    r3 = r14
                    r14 = r10
                    r10 = 1
                    r20 = r4
                    r4 = r2
                    r2 = r5
                    r5 = r6
                    r6 = r15
                    r15 = r11
                    r11 = r20
                    goto L_0x0178
                L_0x00a7:
                    r16 = r3
                    kotlin.l.b(r1)
                    kotlinx.coroutines.e3.d r1 = r0.f9999g
                    r3 = r22
                    g.e.n.c.d.c r3 = (g.e.n.c.d.c) r3
                    boolean r4 = r3 instanceof g.e.n.c.d.c.b
                    if (r4 != 0) goto L_0x00c9
                    java.util.List r3 = kotlin.a0.n.g()
                    r8 = r0
                    r0 = r1
                    r4 = r0
                    r5 = r2
                    r6 = r5
                    r7 = r6
                    r13 = r3
                    r11 = r16
                    r1 = r22
                    r2 = r1
                    r3 = r2
                    goto L_0x0193
                L_0x00c9:
                    g.e.n.c.d.o.e$a r4 = r0.f10000h
                    g.e.n.c.d.o.e r4 = r4.b
                    g.e.n.c.d.o.b r4 = r4.c
                    r5 = r3
                    g.e.n.c.d.c$b r5 = (g.e.n.c.d.c.b) r5
                    g.e.n.c.d.o.e$a r6 = r0.f10000h
                    g.e.n.c.d.o.e r6 = r6.b
                    java.util.Map r6 = r6.a
                    java.util.List r4 = r4.a(r5, r6)
                    java.util.Iterator r5 = r4.iterator()
                    r8 = r0
                    r0 = r1
                    r10 = r0
                    r6 = r2
                    r7 = r6
                    r15 = r3
                    r12 = r4
                    r13 = r12
                    r14 = r13
                    r11 = r5
                    r9 = r16
                    r1 = r22
                    r3 = r1
                    r4 = r7
                    r5 = r4
                    r2 = r3
                L_0x00f6:
                    boolean r16 = r11.hasNext()
                    if (r16 == 0) goto L_0x018a
                    r16 = r9
                    java.lang.Object r9 = r11.next()
                    r22 = r10
                    r10 = r9
                    g.e.n.c.d.b r10 = (g.e.n.c.d.b) r10
                    r17 = r9
                    g.e.n.c.d.o.e$a r9 = r8.f10000h
                    g.e.n.c.d.o.e r9 = r9.b
                    java.util.Map r9 = r9.a
                    no.nordicsemi.android.support.v18.scanner.m r18 = r10.c()
                    r19 = r11
                    android.bluetooth.BluetoothDevice r11 = r18.a()
                    r18 = r12
                    java.lang.String r12 = "bleScan.currentScanResult.device"
                    kotlin.jvm.internal.k.d(r11, r12)
                    java.lang.String r11 = r11.getAddress()
                    java.lang.String r12 = "bleScan.currentScanResult.device.address"
                    kotlin.jvm.internal.k.d(r11, r12)
                    r9.put(r11, r10)
                    boolean r9 = r10 instanceof g.e.n.c.d.b.c
                    if (r9 == 0) goto L_0x017d
                    g.e.n.c.d.o.e$a r9 = r8.f10000h
                    g.e.n.c.d.o.e r9 = r9.b
                    g.e.n.c.g.f.g r9 = r9.f9998d
                    no.nordicsemi.android.support.v18.scanner.m r11 = r10.c()
                    r4.f10004m = r8
                    r4.f10005n = r1
                    r4.o = r5
                    r4.p = r2
                    r4.q = r6
                    r4.r = r3
                    r4.s = r0
                    r4.t = r7
                    r4.u = r15
                    r4.v = r14
                    r4.w = r13
                    r12 = r18
                    r4.x = r12
                    r18 = r0
                    r0 = r19
                    r4.y = r0
                    r0 = r17
                    r4.z = r0
                    r4.A = r10
                    r0 = r22
                    r4.B = r0
                    r10 = 1
                    r4.f10002k = r10
                    java.lang.Object r9 = r9.a(r11, r4)
                    r11 = r16
                    if (r9 != r11) goto L_0x0174
                    return r11
                L_0x0174:
                    r9 = r11
                    r11 = r0
                    r0 = r18
                L_0x0178:
                    r10 = r11
                L_0x0179:
                    r11 = r19
                    goto L_0x00f6
                L_0x017d:
                    r11 = r16
                    r12 = r18
                    r18 = r0
                    r0 = r22
                    r10 = r0
                    r9 = r11
                    r0 = r18
                    goto L_0x0179
                L_0x018a:
                    r18 = r0
                    r11 = r9
                    r0 = r10
                    r7 = r6
                    r6 = r5
                    r5 = r4
                    r4 = r18
                L_0x0193:
                    r5.f10004m = r8
                    r5.f10005n = r1
                    r5.o = r6
                    r5.p = r2
                    r5.q = r7
                    r5.r = r3
                    r5.s = r4
                    r1 = 2
                    r5.f10002k = r1
                    java.lang.Object r0 = r0.a(r13, r5)
                    if (r0 != r11) goto L_0x01ab
                    return r11
                L_0x01ab:
                    kotlin.x r0 = kotlin.x.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: g.e.n.c.d.o.e.a.C0696a.a(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        public a(c cVar, e eVar) {
            this.a = cVar;
            this.b = eVar;
        }

        public Object a(d dVar, kotlin.c0.d dVar2) {
            Object a2 = this.a.a(new C0696a(dVar, this), dVar2);
            if (a2 == d.c()) {
                return a2;
            }
            return x.a;
        }
    }

    public e(g.e.n.c.d.e eVar, g.e.n.c.d.d dVar, b bVar, g gVar, d0 d0Var) {
        k.e(eVar, "bleScannerDataSource");
        k.e(dVar, "bleScannerConfiguration");
        k.e(bVar, "bleScanParser");
        k.e(gVar, "readMyRenzPkaIdInteractor");
        k.e(d0Var, "dispatcher");
        this.c = bVar;
        this.f9998d = gVar;
        this.a = new HashMap();
        this.b = kotlinx.coroutines.e3.e.l(new a(eVar.b(dVar), this), d0Var);
    }

    public c<List<b>> a() {
        return this.b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g.e.n.c.d.e eVar, g.e.n.c.d.d dVar, b bVar, g gVar, d0 d0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, dVar, bVar, gVar, (i2 & 16) != 0 ? a1.a() : d0Var);
    }
}

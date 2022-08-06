package g.e.n.c.g.f;

import androidx.recyclerview.widget.RecyclerView;
import g.e.n.c.d.j;
import java.util.List;
import kotlin.c0.j.a.f;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.e3.d;
import kotlinx.coroutines.e3.e;

/* compiled from: GetNearbyPostBoxesUseCaseImpl.kt */
public final class a implements g.e.n.c.g.a {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final List<String> f10038e = n.i("my_renz_parcel_box", "my_renz_letter_box");

    /* renamed from: f  reason: collision with root package name */
    public static final C0706a f10039f = new C0706a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final c a;
    private final j b;
    /* access modifiers changed from: private */
    public final f c;

    /* renamed from: d  reason: collision with root package name */
    private final d0 f10040d;

    /* renamed from: g.e.n.c.g.f.a$a  reason: collision with other inner class name */
    /* compiled from: GetNearbyPostBoxesUseCaseImpl.kt */
    public static final class C0706a {
        private C0706a() {
        }

        public final List<String> a() {
            return a.f10038e;
        }

        public /* synthetic */ C0706a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @f(c = "com.sensorberg.smartspaces.domain.postbox.internal.GetNearbyPostBoxesUseCaseImpl$execute$1", f = "GetNearbyPostBoxesUseCaseImpl.kt", l = {17, 19, 50}, m = "invokeSuspend")
    /* compiled from: GetNearbyPostBoxesUseCaseImpl.kt */
    static final class b extends k implements p<d<? super List<? extends g.e.n.c.g.b>>, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private d f10041k;

        /* renamed from: l  reason: collision with root package name */
        Object f10042l;

        /* renamed from: m  reason: collision with root package name */
        Object f10043m;

        /* renamed from: n  reason: collision with root package name */
        Object f10044n;
        Object o;
        int p;
        final /* synthetic */ a q;
        final /* synthetic */ String r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, String str, kotlin.c0.d dVar) {
            super(2, dVar);
            this.q = aVar;
            this.r = str;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.e(dVar, "completion");
            b bVar = new b(this.q, this.r, dVar);
            bVar.f10041k = (d) obj;
            return bVar;
        }

        public final Object i(Object obj) {
            d dVar;
            Object c = d.c();
            int i2 = this.p;
            if (i2 == 0) {
                l.b(obj);
                dVar = this.f10041k;
                c d2 = this.q.a;
                String str = this.r;
                List<String> a = a.f10039f.a();
                this.f10042l = dVar;
                this.p = 1;
                obj = d2.a(str, a, this);
                if (obj == c) {
                    return c;
                }
            } else if (i2 == 1) {
                dVar = (d) this.f10042l;
                l.b(obj);
            } else if (i2 == 2) {
                List list = (List) this.f10043m;
                d dVar2 = (d) this.f10042l;
                l.b(obj);
                return x.a;
            } else if (i2 == 3) {
                kotlinx.coroutines.e3.c cVar = (kotlinx.coroutines.e3.c) this.o;
                d dVar3 = (d) this.f10044n;
                List list2 = (List) this.f10043m;
                d dVar4 = (d) this.f10042l;
                l.b(obj);
                return x.a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list3 = (List) ((g.e.m.c) obj).a();
            if (list3 == null) {
                List g2 = n.g();
                this.f10042l = dVar;
                this.f10043m = list3;
                this.p = 2;
                if (dVar.a(g2, this) == c) {
                    return c;
                }
                return x.a;
            }
            kotlinx.coroutines.e3.c c2 = this.q.f(list3);
            this.f10042l = dVar;
            this.f10043m = list3;
            this.f10044n = dVar;
            this.o = c2;
            this.p = 3;
            if (c2.a(dVar, this) == c) {
                return c;
            }
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((b) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    public static final class c implements kotlinx.coroutines.e3.c<List<? extends g.e.n.c.g.b>> {
        final /* synthetic */ kotlinx.coroutines.e3.c a;
        final /* synthetic */ a b;
        final /* synthetic */ List c;

        /* renamed from: g.e.n.c.g.f.a$c$a  reason: collision with other inner class name */
        /* compiled from: Collect.kt */
        public static final class C0707a implements d<List<? extends g.e.n.c.d.b>> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ d f10045g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ c f10046h;

            @f(c = "com.sensorberg.smartspaces.domain.postbox.internal.GetNearbyPostBoxesUseCaseImpl$getNearby$$inlined$map$1$2", f = "GetNearbyPostBoxesUseCaseImpl.kt", l = {146, 136}, m = "emit")
            /* renamed from: g.e.n.c.g.f.a$c$a$a  reason: collision with other inner class name */
            public static final class C0708a extends kotlin.c0.j.a.d {
                Object A;
                Object B;
                Object C;
                Object D;

                /* renamed from: j  reason: collision with root package name */
                /* synthetic */ Object f10047j;

                /* renamed from: k  reason: collision with root package name */
                int f10048k;

                /* renamed from: l  reason: collision with root package name */
                final /* synthetic */ C0707a f10049l;

                /* renamed from: m  reason: collision with root package name */
                Object f10050m;

                /* renamed from: n  reason: collision with root package name */
                Object f10051n;
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
                public C0708a(C0707a aVar, kotlin.c0.d dVar) {
                    super(dVar);
                    this.f10049l = aVar;
                }

                public final Object i(Object obj) {
                    this.f10047j = obj;
                    this.f10048k |= RecyclerView.UNDEFINED_DURATION;
                    return this.f10049l.a((Object) null, this);
                }
            }

            public C0707a(d dVar, c cVar) {
                this.f10045g = dVar;
                this.f10046h = cVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.util.ArrayList} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.util.List} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.util.ArrayList} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.util.List} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kotlin.c0.d} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: g.e.n.c.g.d} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kotlin.c0.d} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.util.List} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.util.ArrayList} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: g.e.n.c.g.f.a$c$a$a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x00af  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x00de  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x014b  */
            /* JADX WARNING: Removed duplicated region for block: B:37:0x01a7  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x01af  */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x01dc A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object a(java.lang.Object r25, kotlin.c0.d r26) {
                /*
                    r24 = this;
                    r0 = r24
                    r1 = r26
                    boolean r2 = r1 instanceof g.e.n.c.g.f.a.c.C0707a.C0708a
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    g.e.n.c.g.f.a$c$a$a r2 = (g.e.n.c.g.f.a.c.C0707a.C0708a) r2
                    int r3 = r2.f10048k
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.f10048k = r3
                    goto L_0x001c
                L_0x0017:
                    g.e.n.c.g.f.a$c$a$a r2 = new g.e.n.c.g.f.a$c$a$a
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.f10047j
                    java.lang.Object r3 = kotlin.c0.i.d.c()
                    int r4 = r2.f10048k
                    r5 = 2
                    r6 = 1
                    if (r4 == 0) goto L_0x00af
                    if (r4 == r6) goto L_0x004f
                    if (r4 != r5) goto L_0x0047
                    java.lang.Object r3 = r2.s
                    kotlinx.coroutines.e3.d r3 = (kotlinx.coroutines.e3.d) r3
                    java.lang.Object r3 = r2.r
                    java.lang.Object r3 = r2.q
                    g.e.n.c.g.f.a$c$a$a r3 = (g.e.n.c.g.f.a.c.C0707a.C0708a) r3
                    java.lang.Object r3 = r2.p
                    java.lang.Object r3 = r2.o
                    g.e.n.c.g.f.a$c$a$a r3 = (g.e.n.c.g.f.a.c.C0707a.C0708a) r3
                    java.lang.Object r3 = r2.f10051n
                    java.lang.Object r2 = r2.f10050m
                    g.e.n.c.g.f.a$c$a r2 = (g.e.n.c.g.f.a.c.C0707a) r2
                    kotlin.l.b(r1)
                    goto L_0x01dd
                L_0x0047:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x004f:
                    java.lang.Object r4 = r2.D
                    kotlinx.coroutines.e3.d r4 = (kotlinx.coroutines.e3.d) r4
                    java.lang.Object r7 = r2.C
                    g.e.n.c.g.d r7 = (g.e.n.c.g.d) r7
                    java.lang.Object r8 = r2.B
                    java.lang.Object r8 = r2.A
                    java.lang.Object r8 = r2.z
                    java.util.Iterator r8 = (java.util.Iterator) r8
                    java.lang.Object r9 = r2.y
                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                    java.lang.Object r10 = r2.x
                    java.util.Collection r10 = (java.util.Collection) r10
                    java.lang.Object r11 = r2.w
                    java.lang.Iterable r11 = (java.lang.Iterable) r11
                    java.lang.Object r12 = r2.v
                    java.lang.Iterable r12 = (java.lang.Iterable) r12
                    java.lang.Object r13 = r2.u
                    java.util.List r13 = (java.util.List) r13
                    java.lang.Object r14 = r2.t
                    kotlin.c0.d r14 = (kotlin.c0.d) r14
                    java.lang.Object r15 = r2.s
                    kotlinx.coroutines.e3.d r15 = (kotlinx.coroutines.e3.d) r15
                    java.lang.Object r5 = r2.r
                    java.lang.Object r6 = r2.q
                    g.e.n.c.g.f.a$c$a$a r6 = (g.e.n.c.g.f.a.c.C0707a.C0708a) r6
                    r16 = r3
                    java.lang.Object r3 = r2.p
                    r25 = r3
                    java.lang.Object r3 = r2.o
                    g.e.n.c.g.f.a$c$a$a r3 = (g.e.n.c.g.f.a.c.C0707a.C0708a) r3
                    r17 = r3
                    java.lang.Object r3 = r2.f10051n
                    r18 = r3
                    java.lang.Object r3 = r2.f10050m
                    g.e.n.c.g.f.a$c$a r3 = (g.e.n.c.g.f.a.c.C0707a) r3
                    kotlin.l.b(r1)
                    r0 = r13
                    r13 = r10
                    r10 = r4
                    r4 = r2
                    r2 = r25
                    r23 = r8
                    r8 = r3
                    r3 = r5
                    r5 = r17
                    r17 = r16
                    r16 = r12
                    r12 = r9
                    r9 = r15
                    r15 = r11
                    r11 = r23
                    goto L_0x0145
                L_0x00af:
                    r16 = r3
                    kotlin.l.b(r1)
                    kotlinx.coroutines.e3.d r1 = r0.f10045g
                    r3 = r25
                    java.util.List r3 = (java.util.List) r3
                    g.e.n.c.g.f.a$c r4 = r0.f10046h
                    java.util.List r4 = r4.c
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    java.util.Iterator r6 = r4.iterator()
                    r8 = r0
                    r9 = r1
                    r10 = r9
                    r7 = r2
                    r0 = r3
                    r12 = r4
                    r14 = r12
                    r15 = r14
                    r13 = r5
                    r11 = r6
                    r1 = r25
                    r3 = r1
                    r4 = r7
                    r5 = r4
                    r6 = r5
                    r2 = r3
                L_0x00d8:
                    boolean r17 = r11.hasNext()
                    if (r17 == 0) goto L_0x01c0
                    r17 = r10
                    java.lang.Object r10 = r11.next()
                    r25 = r11
                    r11 = r10
                    g.e.n.c.g.d r11 = (g.e.n.c.g.d) r11
                    r18 = r10
                    g.e.n.c.g.f.a$c r10 = r8.f10046h
                    g.e.n.c.g.f.a r10 = r10.b
                    g.e.n.c.g.f.f r10 = r10.c
                    r19 = r10
                    java.lang.String r10 = r11.a()
                    r4.f10050m = r8
                    r4.f10051n = r1
                    r4.o = r5
                    r4.p = r2
                    r4.q = r6
                    r4.r = r3
                    r4.s = r9
                    r4.t = r7
                    r4.u = r0
                    r4.v = r15
                    r4.w = r14
                    r4.x = r13
                    r4.y = r12
                    r20 = r0
                    r0 = r25
                    r4.z = r0
                    r0 = r18
                    r4.A = r0
                    r4.B = r0
                    r4.C = r11
                    r0 = r17
                    r4.D = r0
                    r17 = r7
                    r7 = 1
                    r4.f10048k = r7
                    r7 = r19
                    java.lang.Object r7 = r7.c(r10, r4)
                    r10 = r16
                    if (r7 != r10) goto L_0x0135
                    return r10
                L_0x0135:
                    r18 = r1
                    r1 = r7
                    r7 = r11
                    r16 = r15
                    r11 = r25
                    r15 = r14
                    r14 = r17
                    r17 = r10
                    r10 = r0
                    r0 = r20
                L_0x0145:
                    java.lang.String r1 = (java.lang.String) r1
                    r19 = 0
                    if (r1 == 0) goto L_0x01a7
                    java.util.Iterator r20 = r0.iterator()
                L_0x014f:
                    boolean r21 = r20.hasNext()
                    if (r21 == 0) goto L_0x0186
                    java.lang.Object r21 = r20.next()
                    r22 = r21
                    g.e.n.c.d.b r22 = (g.e.n.c.d.b) r22
                    no.nordicsemi.android.support.v18.scanner.m r22 = r22.c()
                    r25 = r0
                    android.bluetooth.BluetoothDevice r0 = r22.a()
                    r22 = r2
                    java.lang.String r2 = "it.currentScanResult.device"
                    kotlin.jvm.internal.k.d(r0, r2)
                    java.lang.String r0 = r0.getAddress()
                    boolean r0 = kotlin.jvm.internal.k.a(r0, r1)
                    java.lang.Boolean r0 = kotlin.c0.j.a.b.a(r0)
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L_0x0181
                    goto L_0x018c
                L_0x0181:
                    r0 = r25
                    r2 = r22
                    goto L_0x014f
                L_0x0186:
                    r25 = r0
                    r22 = r2
                    r21 = r19
                L_0x018c:
                    g.e.n.c.d.b r21 = (g.e.n.c.d.b) r21
                    if (r21 == 0) goto L_0x01ab
                    no.nordicsemi.android.support.v18.scanner.m r0 = r21.c()
                    if (r0 == 0) goto L_0x01ab
                    android.bluetooth.BluetoothDevice r0 = r0.a()
                    if (r0 == 0) goto L_0x01ab
                    java.lang.String r1 = "bleScanList.firstOrNull …?: return@mapNotNull null"
                    kotlin.jvm.internal.k.d(r0, r1)
                    g.e.n.c.g.b r1 = new g.e.n.c.g.b
                    r1.<init>(r7, r0)
                    goto L_0x01ad
                L_0x01a7:
                    r25 = r0
                    r22 = r2
                L_0x01ab:
                    r1 = r19
                L_0x01ad:
                    if (r1 == 0) goto L_0x01b2
                    r13.add(r1)
                L_0x01b2:
                    r0 = r25
                    r7 = r14
                    r14 = r15
                    r15 = r16
                    r16 = r17
                    r1 = r18
                    r2 = r22
                    goto L_0x00d8
                L_0x01c0:
                    r0 = r10
                    r10 = r16
                    java.util.List r13 = (java.util.List) r13
                    r4.f10050m = r8
                    r4.f10051n = r1
                    r4.o = r5
                    r4.p = r2
                    r4.q = r6
                    r4.r = r3
                    r4.s = r9
                    r1 = 2
                    r4.f10048k = r1
                    java.lang.Object r0 = r0.a(r13, r4)
                    if (r0 != r10) goto L_0x01dd
                    return r10
                L_0x01dd:
                    kotlin.x r0 = kotlin.x.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: g.e.n.c.g.f.a.c.C0707a.a(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        public c(kotlinx.coroutines.e3.c cVar, a aVar, List list) {
            this.a = cVar;
            this.b = aVar;
            this.c = list;
        }

        public Object a(d dVar, kotlin.c0.d dVar2) {
            Object a2 = this.a.a(new C0707a(dVar, this), dVar2);
            if (a2 == d.c()) {
                return a2;
            }
            return x.a;
        }
    }

    public a(c cVar, j jVar, f fVar, d0 d0Var) {
        kotlin.jvm.internal.k.e(cVar, "postBoxDataSource");
        kotlin.jvm.internal.k.e(jVar, "getBleScansUseCase");
        kotlin.jvm.internal.k.e(fVar, "postBoxStorage");
        kotlin.jvm.internal.k.e(d0Var, "dispatcher");
        this.a = cVar;
        this.b = jVar;
        this.c = fVar;
        this.f10040d = d0Var;
    }

    /* access modifiers changed from: private */
    public final kotlinx.coroutines.e3.c<List<g.e.n.c.g.b>> f(List<? extends g.e.n.c.g.d> list) {
        return e.l(e.d(new c(this.b.a(), this, list)), this.f10040d);
    }

    public kotlinx.coroutines.e3.c<List<g.e.n.c.g.b>> a(String str) {
        kotlin.jvm.internal.k.e(str, "unitId");
        return e.i(new b(this, str, (kotlin.c0.d) null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, j jVar, f fVar, d0 d0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, jVar, fVar, (i2 & 8) != 0 ? a1.a() : d0Var);
    }
}

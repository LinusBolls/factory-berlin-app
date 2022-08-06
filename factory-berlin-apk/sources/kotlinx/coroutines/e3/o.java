package kotlinx.coroutines.e3;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.c0.j.a.d;
import kotlin.c0.j.a.f;
import kotlin.e0.c.p;
import kotlin.x;

/* compiled from: Transform.kt */
final /* synthetic */ class o {

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements c<T> {
        final /* synthetic */ c a;
        final /* synthetic */ p b;

        /* renamed from: kotlinx.coroutines.e3.o$a$a  reason: collision with other inner class name */
        /* compiled from: Collect.kt */
        public static final class C0768a implements d<T> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ d f10835g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a f10836h;

            @f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {134, 135}, m = "emit")
            /* renamed from: kotlinx.coroutines.e3.o$a$a$a  reason: collision with other inner class name */
            public static final class C0769a extends d {

                /* renamed from: j  reason: collision with root package name */
                /* synthetic */ Object f10837j;

                /* renamed from: k  reason: collision with root package name */
                int f10838k;

                /* renamed from: l  reason: collision with root package name */
                final /* synthetic */ C0768a f10839l;

                /* renamed from: m  reason: collision with root package name */
                Object f10840m;

                /* renamed from: n  reason: collision with root package name */
                Object f10841n;
                Object o;
                Object p;
                Object q;
                Object r;
                Object s;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0769a(C0768a aVar, kotlin.c0.d dVar) {
                    super(dVar);
                    this.f10839l = aVar;
                }

                public final Object i(Object obj) {
                    this.f10837j = obj;
                    this.f10838k |= RecyclerView.UNDEFINED_DURATION;
                    return this.f10839l.a((Object) null, this);
                }
            }

            public C0768a(d dVar, a aVar) {
                this.f10835g = dVar;
                this.f10836h = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x00a1 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object a(java.lang.Object r10, kotlin.c0.d r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof kotlinx.coroutines.e3.o.a.C0768a.C0769a
                    if (r0 == 0) goto L_0x0013
                    r0 = r11
                    kotlinx.coroutines.e3.o$a$a$a r0 = (kotlinx.coroutines.e3.o.a.C0768a.C0769a) r0
                    int r1 = r0.f10838k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f10838k = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.e3.o$a$a$a r0 = new kotlinx.coroutines.e3.o$a$a$a
                    r0.<init>(r9, r11)
                L_0x0018:
                    java.lang.Object r11 = r0.f10837j
                    java.lang.Object r1 = kotlin.c0.i.d.c()
                    int r2 = r0.f10838k
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x0064
                    if (r2 == r4) goto L_0x004a
                    if (r2 != r3) goto L_0x0042
                    java.lang.Object r10 = r0.s
                    kotlinx.coroutines.e3.d r10 = (kotlinx.coroutines.e3.d) r10
                    java.lang.Object r10 = r0.r
                    java.lang.Object r10 = r0.q
                    kotlin.c0.d r10 = (kotlin.c0.d) r10
                    java.lang.Object r10 = r0.p
                    java.lang.Object r10 = r0.o
                    kotlinx.coroutines.e3.o$a$a$a r10 = (kotlinx.coroutines.e3.o.a.C0768a.C0769a) r10
                    java.lang.Object r10 = r0.f10841n
                    java.lang.Object r10 = r0.f10840m
                    kotlinx.coroutines.e3.o$a$a r10 = (kotlinx.coroutines.e3.o.a.C0768a) r10
                    kotlin.l.b(r11)
                    goto L_0x00a2
                L_0x0042:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L_0x004a:
                    java.lang.Object r10 = r0.s
                    kotlinx.coroutines.e3.d r10 = (kotlinx.coroutines.e3.d) r10
                    java.lang.Object r2 = r0.r
                    java.lang.Object r4 = r0.q
                    kotlin.c0.d r4 = (kotlin.c0.d) r4
                    java.lang.Object r5 = r0.p
                    java.lang.Object r6 = r0.o
                    kotlinx.coroutines.e3.o$a$a$a r6 = (kotlinx.coroutines.e3.o.a.C0768a.C0769a) r6
                    java.lang.Object r7 = r0.f10841n
                    java.lang.Object r8 = r0.f10840m
                    kotlinx.coroutines.e3.o$a$a r8 = (kotlinx.coroutines.e3.o.a.C0768a) r8
                    kotlin.l.b(r11)
                    goto L_0x008b
                L_0x0064:
                    kotlin.l.b(r11)
                    kotlinx.coroutines.e3.d r11 = r9.f10835g
                    kotlinx.coroutines.e3.o$a r2 = r9.f10836h
                    kotlin.e0.c.p r2 = r2.b
                    r0.f10840m = r9
                    r0.f10841n = r10
                    r0.o = r0
                    r0.p = r10
                    r0.q = r0
                    r0.r = r10
                    r0.s = r11
                    r0.f10838k = r4
                    java.lang.Object r2 = r2.l(r10, r0)
                    if (r2 != r1) goto L_0x0084
                    return r1
                L_0x0084:
                    r8 = r9
                    r2 = r10
                    r5 = r2
                    r7 = r5
                    r10 = r11
                    r4 = r0
                    r6 = r4
                L_0x008b:
                    r0.f10840m = r8
                    r0.f10841n = r7
                    r0.o = r6
                    r0.p = r5
                    r0.q = r4
                    r0.r = r2
                    r0.s = r10
                    r0.f10838k = r3
                    java.lang.Object r10 = r10.a(r2, r0)
                    if (r10 != r1) goto L_0x00a2
                    return r1
                L_0x00a2:
                    kotlin.x r10 = kotlin.x.a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e3.o.a.C0768a.a(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        public a(c cVar, p pVar) {
            this.a = cVar;
            this.b = pVar;
        }

        public Object a(d dVar, kotlin.c0.d dVar2) {
            Object a2 = this.a.a(new C0768a(dVar, this), dVar2);
            if (a2 == d.c()) {
                return a2;
            }
            return x.a;
        }
    }

    public static final <T> c<T> a(c<? extends T> cVar, p<? super T, ? super kotlin.c0.d<? super x>, ? extends Object> pVar) {
        return new a(cVar, pVar);
    }
}

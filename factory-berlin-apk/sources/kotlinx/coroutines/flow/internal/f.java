package kotlinx.coroutines.flow.internal;

import kotlin.TypeCastException;
import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.k;
import kotlin.e0.c.p;
import kotlin.e0.c.r;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.u;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.channels.v;
import kotlinx.coroutines.e3.c;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;

/* compiled from: Combine.kt */
public final class f {

    @kotlin.c0.j.a.f(c = "kotlinx.coroutines.flow.internal.CombineKt$asFairChannel$1", f = "Combine.kt", l = {143}, m = "invokeSuspend")
    /* compiled from: Combine.kt */
    static final class a extends k implements p<kotlinx.coroutines.channels.p<? super Object>, d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private kotlinx.coroutines.channels.p f10892k;

        /* renamed from: l  reason: collision with root package name */
        Object f10893l;

        /* renamed from: m  reason: collision with root package name */
        Object f10894m;

        /* renamed from: n  reason: collision with root package name */
        Object f10895n;
        int o;
        final /* synthetic */ c p;

        /* renamed from: kotlinx.coroutines.flow.internal.f$a$a  reason: collision with other inner class name */
        /* compiled from: Collect.kt */
        public static final class C0774a implements kotlinx.coroutines.e3.d<Object> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.f f10896g;

            public C0774a(kotlinx.coroutines.channels.f fVar) {
                this.f10896g = fVar;
            }

            public Object a(Object obj, d dVar) {
                kotlinx.coroutines.channels.f fVar = this.f10896g;
                if (obj == null) {
                    obj = m.a;
                }
                Object Z0 = fVar.Z0(obj, dVar);
                return Z0 == d.c() ? Z0 : x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, d dVar) {
            super(2, dVar);
            this.p = cVar;
        }

        public final d<x> b(Object obj, d<?> dVar) {
            a aVar = new a(this.p, dVar);
            aVar.f10892k = (kotlinx.coroutines.channels.p) obj;
            return aVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.o;
            if (i2 == 0) {
                l.b(obj);
                kotlinx.coroutines.channels.p pVar = this.f10892k;
                v U = pVar.U();
                if (U != null) {
                    kotlinx.coroutines.channels.f fVar = (kotlinx.coroutines.channels.f) U;
                    c cVar = this.p;
                    C0774a aVar = new C0774a(fVar);
                    this.f10893l = pVar;
                    this.f10894m = fVar;
                    this.f10895n = cVar;
                    this.o = 1;
                    if (cVar.a(aVar, this) == c) {
                        return c;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelCoroutine<kotlin.Any>");
                }
            } else if (i2 == 1) {
                c cVar2 = (c) this.f10895n;
                kotlinx.coroutines.channels.f fVar2 = (kotlinx.coroutines.channels.f) this.f10894m;
                kotlinx.coroutines.channels.p pVar2 = (kotlinx.coroutines.channels.p) this.f10893l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((a) b(obj, (d) obj2)).i(x.a);
        }
    }

    @kotlin.c0.j.a.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineTransformInternal$2", f = "Combine.kt", l = {146}, m = "invokeSuspend")
    /* compiled from: Combine.kt */
    static final class b extends k implements p<i0, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private i0 f10897k;

        /* renamed from: l  reason: collision with root package name */
        Object f10898l;

        /* renamed from: m  reason: collision with root package name */
        Object f10899m;

        /* renamed from: n  reason: collision with root package name */
        Object f10900n;
        Object o;
        Object p;
        Object q;
        Object r;
        Object s;
        int t;
        final /* synthetic */ kotlinx.coroutines.e3.d u;
        final /* synthetic */ kotlinx.coroutines.e3.c v;
        final /* synthetic */ kotlinx.coroutines.e3.c w;
        final /* synthetic */ r x;

        /* compiled from: Combine.kt */
        static final class a extends k implements p<Object, kotlin.c0.d<? super x>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private Object f10901k;

            /* renamed from: l  reason: collision with root package name */
            Object f10902l;

            /* renamed from: m  reason: collision with root package name */
            int f10903m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ b f10904n;
            final /* synthetic */ q o;
            final /* synthetic */ kotlinx.coroutines.channels.r p;
            final /* synthetic */ u q;
            final /* synthetic */ u r;
            final /* synthetic */ q s;
            final /* synthetic */ kotlinx.coroutines.channels.r t;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(kotlin.c0.d dVar, b bVar, q qVar, kotlinx.coroutines.channels.r rVar, u uVar, u uVar2, q qVar2, kotlinx.coroutines.channels.r rVar2) {
                super(2, dVar);
                this.f10904n = bVar;
                this.o = qVar;
                this.p = rVar;
                this.q = uVar;
                this.r = uVar2;
                this.s = qVar2;
                this.t = rVar2;
            }

            public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
                a aVar = new a(dVar, this.f10904n, this.o, this.p, this.q, this.r, this.s, this.t);
                aVar.f10901k = obj;
                return aVar;
            }

            public final Object i(Object obj) {
                Object c = d.c();
                int i2 = this.f10903m;
                if (i2 == 0) {
                    l.b(obj);
                    T t2 = this.f10901k;
                    this.q.f10686g = t2;
                    if (this.r.f10686g != null) {
                        b bVar = this.f10904n;
                        r rVar = bVar.x;
                        kotlinx.coroutines.e3.d dVar = bVar.u;
                        T d2 = f.d();
                        T t3 = this.q.f10686g;
                        T t4 = null;
                        if (t3 == d2) {
                            t3 = null;
                        }
                        T d3 = f.d();
                        T t5 = this.r.f10686g;
                        if (t5 != d3) {
                            t4 = t5;
                        }
                        this.f10902l = t2;
                        this.f10903m = 1;
                        if (rVar.z(dVar, t3, t4, this) == c) {
                            return c;
                        }
                    }
                } else if (i2 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return x.a;
            }

            public final Object l(Object obj, Object obj2) {
                return ((a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
            }
        }

        /* renamed from: kotlinx.coroutines.flow.internal.f$b$b  reason: collision with other inner class name */
        /* compiled from: Combine.kt */
        public static final class C0775b extends k implements p<Object, kotlin.c0.d<? super x>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private Object f10905k;

            /* renamed from: l  reason: collision with root package name */
            Object f10906l;

            /* renamed from: m  reason: collision with root package name */
            int f10907m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ p f10908n;
            final /* synthetic */ b o;
            final /* synthetic */ q p;
            final /* synthetic */ kotlinx.coroutines.channels.r q;
            final /* synthetic */ u r;
            final /* synthetic */ u s;
            final /* synthetic */ q t;
            final /* synthetic */ kotlinx.coroutines.channels.r u;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0775b(p pVar, kotlin.c0.d dVar, b bVar, q qVar, kotlinx.coroutines.channels.r rVar, u uVar, u uVar2, q qVar2, kotlinx.coroutines.channels.r rVar2) {
                super(2, dVar);
                this.f10908n = pVar;
                this.o = bVar;
                this.p = qVar;
                this.q = rVar;
                this.r = uVar;
                this.s = uVar2;
                this.t = qVar2;
                this.u = rVar2;
            }

            public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
                C0775b bVar = new C0775b(this.f10908n, dVar, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
                bVar.f10905k = obj;
                return bVar;
            }

            public final Object i(Object obj) {
                Object c = d.c();
                int i2 = this.f10907m;
                if (i2 == 0) {
                    l.b(obj);
                    Object obj2 = this.f10905k;
                    if (obj2 == null) {
                        this.p.f10682g = true;
                    } else {
                        p pVar = this.f10908n;
                        this.f10906l = obj2;
                        this.f10907m = 1;
                        if (pVar.l(obj2, this) == c) {
                            return c;
                        }
                    }
                } else if (i2 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return x.a;
            }

            public final Object l(Object obj, Object obj2) {
                return ((C0775b) b(obj, (kotlin.c0.d) obj2)).i(x.a);
            }
        }

        /* compiled from: Combine.kt */
        static final class c extends k implements p<Object, kotlin.c0.d<? super x>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private Object f10909k;

            /* renamed from: l  reason: collision with root package name */
            Object f10910l;

            /* renamed from: m  reason: collision with root package name */
            int f10911m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ b f10912n;
            final /* synthetic */ q o;
            final /* synthetic */ kotlinx.coroutines.channels.r p;
            final /* synthetic */ u q;
            final /* synthetic */ u r;
            final /* synthetic */ q s;
            final /* synthetic */ kotlinx.coroutines.channels.r t;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(kotlin.c0.d dVar, b bVar, q qVar, kotlinx.coroutines.channels.r rVar, u uVar, u uVar2, q qVar2, kotlinx.coroutines.channels.r rVar2) {
                super(2, dVar);
                this.f10912n = bVar;
                this.o = qVar;
                this.p = rVar;
                this.q = uVar;
                this.r = uVar2;
                this.s = qVar2;
                this.t = rVar2;
            }

            public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
                c cVar = new c(dVar, this.f10912n, this.o, this.p, this.q, this.r, this.s, this.t);
                cVar.f10909k = obj;
                return cVar;
            }

            public final Object i(Object obj) {
                Object c = d.c();
                int i2 = this.f10911m;
                if (i2 == 0) {
                    l.b(obj);
                    T t2 = this.f10909k;
                    this.r.f10686g = t2;
                    if (this.q.f10686g != null) {
                        b bVar = this.f10912n;
                        r rVar = bVar.x;
                        kotlinx.coroutines.e3.d dVar = bVar.u;
                        T d2 = f.d();
                        T t3 = this.q.f10686g;
                        T t4 = null;
                        if (t3 == d2) {
                            t3 = null;
                        }
                        T d3 = f.d();
                        T t5 = this.r.f10686g;
                        if (t5 != d3) {
                            t4 = t5;
                        }
                        this.f10910l = t2;
                        this.f10911m = 1;
                        if (rVar.z(dVar, t3, t4, this) == c) {
                            return c;
                        }
                    }
                } else if (i2 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return x.a;
            }

            public final Object l(Object obj, Object obj2) {
                return ((c) b(obj, (kotlin.c0.d) obj2)).i(x.a);
            }
        }

        /* compiled from: Combine.kt */
        public static final class d extends k implements p<Object, kotlin.c0.d<? super x>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private Object f10913k;

            /* renamed from: l  reason: collision with root package name */
            Object f10914l;

            /* renamed from: m  reason: collision with root package name */
            int f10915m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ p f10916n;
            final /* synthetic */ b o;
            final /* synthetic */ q p;
            final /* synthetic */ kotlinx.coroutines.channels.r q;
            final /* synthetic */ u r;
            final /* synthetic */ u s;
            final /* synthetic */ q t;
            final /* synthetic */ kotlinx.coroutines.channels.r u;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(p pVar, kotlin.c0.d dVar, b bVar, q qVar, kotlinx.coroutines.channels.r rVar, u uVar, u uVar2, q qVar2, kotlinx.coroutines.channels.r rVar2) {
                super(2, dVar);
                this.f10916n = pVar;
                this.o = bVar;
                this.p = qVar;
                this.q = rVar;
                this.r = uVar;
                this.s = uVar2;
                this.t = qVar2;
                this.u = rVar2;
            }

            public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
                d dVar2 = new d(this.f10916n, dVar, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
                dVar2.f10913k = obj;
                return dVar2;
            }

            public final Object i(Object obj) {
                Object c = d.c();
                int i2 = this.f10915m;
                if (i2 == 0) {
                    l.b(obj);
                    Object obj2 = this.f10913k;
                    if (obj2 == null) {
                        this.t.f10682g = true;
                    } else {
                        p pVar = this.f10916n;
                        this.f10914l = obj2;
                        this.f10915m = 1;
                        if (pVar.l(obj2, this) == c) {
                            return c;
                        }
                    }
                } else if (i2 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return x.a;
            }

            public final Object l(Object obj, Object obj2) {
                return ((d) b(obj, (kotlin.c0.d) obj2)).i(x.a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(kotlinx.coroutines.e3.d dVar, kotlinx.coroutines.e3.c cVar, kotlinx.coroutines.e3.c cVar2, r rVar, kotlin.c0.d dVar2) {
            super(2, dVar2);
            this.u = dVar;
            this.v = cVar;
            this.w = cVar2;
            this.x = rVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            b bVar = new b(this.u, this.v, this.w, this.x, dVar);
            bVar.f10897k = (i0) obj;
            return bVar;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(1:(2:3|41)(2:4|5))(1:6)|7|(13:13|14|15|16|17|18|(1:20)(4:21|22|23|24)|25|(1:27)(1:28)|35|(1:37)|(1:39)(4:40|41|7|(0)(2:11|12))|39)(0)|9|13|14|15|16|17|18|(0)(0)|25|(0)(0)|35|(0)|(0)|39) */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:21|22|23|24) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0116, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0118, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x011a, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x011b, code lost:
            r3 = r7;
            r17 = r8;
            r18 = r9;
            r19 = r10;
            r20 = r11;
            r21 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0126, code lost:
            r16 = r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0128, code lost:
            r3.d0(r0);
         */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00bc A[Catch:{ all -> 0x0118 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00bf A[Catch:{ all -> 0x0118 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00f7 A[Catch:{ all -> 0x0116 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00f8 A[Catch:{ all -> 0x0116 }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0135  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x013a A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x013b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object i(java.lang.Object r24) {
            /*
                r23 = this;
                r1 = r23
                java.lang.Object r0 = kotlin.c0.i.d.c()
                int r2 = r1.t
                r3 = 1
                if (r2 == 0) goto L_0x0042
                if (r2 != r3) goto L_0x003a
                java.lang.Object r2 = r1.s
                kotlinx.coroutines.flow.internal.f$b r2 = (kotlinx.coroutines.flow.internal.f.b) r2
                java.lang.Object r2 = r1.r
                kotlin.jvm.internal.q r2 = (kotlin.jvm.internal.q) r2
                java.lang.Object r4 = r1.q
                kotlin.jvm.internal.q r4 = (kotlin.jvm.internal.q) r4
                java.lang.Object r5 = r1.p
                kotlin.jvm.internal.u r5 = (kotlin.jvm.internal.u) r5
                java.lang.Object r6 = r1.o
                kotlin.jvm.internal.u r6 = (kotlin.jvm.internal.u) r6
                java.lang.Object r7 = r1.f10900n
                kotlinx.coroutines.channels.r r7 = (kotlinx.coroutines.channels.r) r7
                java.lang.Object r8 = r1.f10899m
                kotlinx.coroutines.channels.r r8 = (kotlinx.coroutines.channels.r) r8
                java.lang.Object r9 = r1.f10898l
                kotlinx.coroutines.i0 r9 = (kotlinx.coroutines.i0) r9
                kotlin.l.b(r24)
                r14 = r2
                r15 = r4
                r13 = r5
                r12 = r6
                r11 = r7
                r10 = r8
                r2 = r0
                r8 = r1
                goto L_0x0147
            L_0x003a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0042:
                kotlin.l.b(r24)
                kotlinx.coroutines.i0 r2 = r1.f10897k
                kotlinx.coroutines.e3.c r4 = r1.v
                kotlinx.coroutines.channels.r r4 = kotlinx.coroutines.flow.internal.f.b(r2, r4)
                kotlinx.coroutines.e3.c r5 = r1.w
                kotlinx.coroutines.channels.r r5 = kotlinx.coroutines.flow.internal.f.b(r2, r5)
                kotlin.jvm.internal.u r6 = new kotlin.jvm.internal.u
                r6.<init>()
                r7 = 0
                r6.f10686g = r7
                kotlin.jvm.internal.u r8 = new kotlin.jvm.internal.u
                r8.<init>()
                r8.f10686g = r7
                kotlin.jvm.internal.q r7 = new kotlin.jvm.internal.q
                r7.<init>()
                r9 = 0
                r7.f10682g = r9
                kotlin.jvm.internal.q r10 = new kotlin.jvm.internal.q
                r10.<init>()
                r10.f10682g = r9
                r9 = r2
                r11 = r5
                r12 = r6
                r15 = r7
                r13 = r8
                r14 = r10
                r2 = r0
                r8 = r1
                r10 = r4
            L_0x007a:
                boolean r0 = r15.f10682g
                if (r0 == 0) goto L_0x0086
                boolean r0 = r14.f10682g
                if (r0 != 0) goto L_0x0083
                goto L_0x0086
            L_0x0083:
                kotlin.x r0 = kotlin.x.a
                return r0
            L_0x0086:
                r8.f10898l = r9
                r8.f10899m = r10
                r8.f10900n = r11
                r8.o = r12
                r8.p = r13
                r8.q = r15
                r8.r = r14
                r8.s = r8
                r8.t = r3
                kotlinx.coroutines.h3.b r7 = new kotlinx.coroutines.h3.b
                r7.<init>(r8)
                boolean r0 = r15.f10682g     // Catch:{ all -> 0x011a }
                kotlinx.coroutines.flow.internal.f$b$a r16 = new kotlinx.coroutines.flow.internal.f$b$a     // Catch:{ all -> 0x011a }
                r5 = 0
                r4 = r16
                r6 = r8
                r3 = r7
                r7 = r15
                r17 = r8
                r8 = r10
                r18 = r9
                r9 = r12
                r19 = r10
                r10 = r13
                r20 = r11
                r11 = r14
                r21 = r12
                r12 = r20
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0118 }
                if (r0 == 0) goto L_0x00bf
                r16 = r13
                goto L_0x00e0
            L_0x00bf:
                kotlinx.coroutines.h3.c r0 = r19.p()     // Catch:{ all -> 0x0118 }
                kotlinx.coroutines.flow.internal.f$b$b r12 = new kotlinx.coroutines.flow.internal.f$b$b     // Catch:{ all -> 0x0118 }
                r6 = 0
                r4 = r12
                r5 = r16
                r7 = r17
                r8 = r15
                r9 = r19
                r10 = r21
                r11 = r13
                r22 = r12
                r12 = r14
                r16 = r13
                r13 = r20
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0116 }
                r4 = r22
                r3.A(r0, r4)     // Catch:{ all -> 0x0116 }
            L_0x00e0:
                boolean r0 = r14.f10682g     // Catch:{ all -> 0x0116 }
                kotlinx.coroutines.flow.internal.f$b$c r13 = new kotlinx.coroutines.flow.internal.f$b$c     // Catch:{ all -> 0x0116 }
                r5 = 0
                r4 = r13
                r6 = r17
                r7 = r15
                r8 = r19
                r9 = r21
                r10 = r16
                r11 = r14
                r12 = r20
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0116 }
                if (r0 == 0) goto L_0x00f8
                goto L_0x012b
            L_0x00f8:
                kotlinx.coroutines.h3.c r0 = r20.p()     // Catch:{ all -> 0x0116 }
                kotlinx.coroutines.flow.internal.f$b$d r12 = new kotlinx.coroutines.flow.internal.f$b$d     // Catch:{ all -> 0x0116 }
                r6 = 0
                r4 = r12
                r5 = r13
                r7 = r17
                r8 = r15
                r9 = r19
                r10 = r21
                r11 = r16
                r13 = r12
                r12 = r14
                r1 = r13
                r13 = r20
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0116 }
                r3.A(r0, r1)     // Catch:{ all -> 0x0116 }
                goto L_0x012b
            L_0x0116:
                r0 = move-exception
                goto L_0x0128
            L_0x0118:
                r0 = move-exception
                goto L_0x0126
            L_0x011a:
                r0 = move-exception
                r3 = r7
                r17 = r8
                r18 = r9
                r19 = r10
                r20 = r11
                r21 = r12
            L_0x0126:
                r16 = r13
            L_0x0128:
                r3.d0(r0)
            L_0x012b:
                java.lang.Object r0 = r3.c0()
                java.lang.Object r1 = kotlin.c0.i.d.c()
                if (r0 != r1) goto L_0x0138
                kotlin.c0.j.a.h.c(r17)
            L_0x0138:
                if (r0 != r2) goto L_0x013b
                return r2
            L_0x013b:
                r13 = r16
                r8 = r17
                r9 = r18
                r10 = r19
                r11 = r20
                r12 = r21
            L_0x0147:
                r1 = r23
                r3 = 1
                goto L_0x007a
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.f.b.i(java.lang.Object):java.lang.Object");
        }

        public final Object l(Object obj, Object obj2) {
            return ((b) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    /* access modifiers changed from: private */
    public static final kotlinx.coroutines.channels.r<Object> b(i0 i0Var, c<?> cVar) {
        return n.c(i0Var, (g) null, 0, new a(cVar, (d) null), 3, (Object) null);
    }

    public static final <T1, T2, R> Object c(kotlinx.coroutines.e3.d<? super R> dVar, c<? extends T1> cVar, c<? extends T2> cVar2, r<? super kotlinx.coroutines.e3.d<? super R>, ? super T1, ? super T2, ? super d<? super x>, ? extends Object> rVar, d<? super x> dVar2) {
        Object e2 = j0.e(new b(dVar, cVar, cVar2, rVar, (d) null), dVar2);
        if (e2 == d.c()) {
            return e2;
        }
        return x.a;
    }

    public static final kotlinx.coroutines.internal.x d() {
        return m.a;
    }
}

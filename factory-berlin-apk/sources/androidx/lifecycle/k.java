package androidx.lifecycle;

import kotlin.c0.g;
import kotlin.c0.h;
import kotlin.c0.j.a.f;
import kotlin.e0.c.p;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.channels.e;
import kotlinx.coroutines.e3.c;
import kotlinx.coroutines.e3.d;
import kotlinx.coroutines.i0;

/* compiled from: FlowLiveData.kt */
public final class k {

    @f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {91, 95, 96}, m = "invokeSuspend")
    /* compiled from: FlowLiveData.kt */
    static final class a extends kotlin.c0.j.a.k implements p<d<? super T>, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private d f994k;

        /* renamed from: l  reason: collision with root package name */
        Object f995l;

        /* renamed from: m  reason: collision with root package name */
        Object f996m;

        /* renamed from: n  reason: collision with root package name */
        Object f997n;
        Object o;
        Object p;
        int q;
        final /* synthetic */ LiveData r;

        @f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.k$a$a  reason: collision with other inner class name */
        /* compiled from: FlowLiveData.kt */
        static final class C0023a extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private i0 f998k;

            /* renamed from: l  reason: collision with root package name */
            int f999l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ a f1000m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ f0 f1001n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0023a(a aVar, f0 f0Var, kotlin.c0.d dVar) {
                super(2, dVar);
                this.f1000m = aVar;
                this.f1001n = f0Var;
            }

            public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
                kotlin.jvm.internal.k.f(dVar, "completion");
                C0023a aVar = new C0023a(this.f1000m, this.f1001n, dVar);
                aVar.f998k = (i0) obj;
                return aVar;
            }

            public final Object i(Object obj) {
                Object unused = d.c();
                if (this.f999l == 0) {
                    l.b(obj);
                    this.f1000m.r.p(this.f1001n);
                    return x.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object l(Object obj, Object obj2) {
                return ((C0023a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
            }
        }

        @f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        /* compiled from: FlowLiveData.kt */
        static final class b extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private i0 f1002k;

            /* renamed from: l  reason: collision with root package name */
            int f1003l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ a f1004m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ f0 f1005n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar, f0 f0Var, kotlin.c0.d dVar) {
                super(2, dVar);
                this.f1004m = aVar;
                this.f1005n = f0Var;
            }

            public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
                kotlin.jvm.internal.k.f(dVar, "completion");
                b bVar = new b(this.f1004m, this.f1005n, dVar);
                bVar.f1002k = (i0) obj;
                return bVar;
            }

            public final Object i(Object obj) {
                Object unused = d.c();
                if (this.f1003l == 0) {
                    l.b(obj);
                    this.f1004m.r.t(this.f1005n);
                    return x.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object l(Object obj, Object obj2) {
                return ((b) b(obj, (kotlin.c0.d) obj2)).i(x.a);
            }
        }

        /* compiled from: FlowLiveData.kt */
        static final class c<T> implements f0<T> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ e f1006g;

            c(e eVar) {
                this.f1006g = eVar;
            }

            public final void k(T t) {
                this.f1006g.offer(t);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LiveData liveData, kotlin.c0.d dVar) {
            super(2, dVar);
            this.r = liveData;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.f(dVar, "completion");
            a aVar = new a(this.r, dVar);
            aVar.f994k = (d) obj;
            return aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a5 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5 A[Catch:{ all -> 0x00e4 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object i(java.lang.Object r18) {
            /*
                r17 = this;
                r1 = r17
                java.lang.Object r0 = kotlin.c0.i.d.c()
                int r2 = r1.q
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0063
                if (r2 == r5) goto L_0x0053
                if (r2 == r4) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r2 = r1.p
                kotlinx.coroutines.channels.g r2 = (kotlinx.coroutines.channels.g) r2
                java.lang.Object r5 = r1.f997n
                androidx.lifecycle.f0 r5 = (androidx.lifecycle.f0) r5
                java.lang.Object r7 = r1.f996m
                kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.e) r7
                java.lang.Object r8 = r1.f995l
                kotlinx.coroutines.e3.d r8 = (kotlinx.coroutines.e3.d) r8
                kotlin.l.b(r18)     // Catch:{ all -> 0x004f }
                r9 = r1
            L_0x0028:
                r16 = r8
                r8 = r2
                r2 = r5
                r5 = r7
                r7 = r16
                goto L_0x0095
            L_0x0030:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0038:
                java.lang.Object r2 = r1.o
                kotlinx.coroutines.channels.g r2 = (kotlinx.coroutines.channels.g) r2
                java.lang.Object r5 = r1.f997n
                androidx.lifecycle.f0 r5 = (androidx.lifecycle.f0) r5
                java.lang.Object r7 = r1.f996m
                kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.e) r7
                java.lang.Object r8 = r1.f995l
                kotlinx.coroutines.e3.d r8 = (kotlinx.coroutines.e3.d) r8
                kotlin.l.b(r18)     // Catch:{ all -> 0x004f }
                r10 = r18
                r9 = r1
                goto L_0x00ad
            L_0x004f:
                r0 = move-exception
                r9 = r1
                goto L_0x00eb
            L_0x0053:
                java.lang.Object r2 = r1.f997n
                androidx.lifecycle.f0 r2 = (androidx.lifecycle.f0) r2
                java.lang.Object r5 = r1.f996m
                kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.e) r5
                java.lang.Object r7 = r1.f995l
                kotlinx.coroutines.e3.d r7 = (kotlinx.coroutines.e3.d) r7
                kotlin.l.b(r18)
                goto L_0x0090
            L_0x0063:
                kotlin.l.b(r18)
                kotlinx.coroutines.e3.d r7 = r1.f994k
                r2 = -1
                kotlinx.coroutines.channels.e r2 = kotlinx.coroutines.channels.h.a(r2)
                androidx.lifecycle.k$a$c r8 = new androidx.lifecycle.k$a$c
                r8.<init>(r2)
                kotlinx.coroutines.h2 r9 = kotlinx.coroutines.a1.c()
                kotlinx.coroutines.h2 r9 = r9.r0()
                androidx.lifecycle.k$a$a r10 = new androidx.lifecycle.k$a$a
                r10.<init>(r1, r8, r6)
                r1.f995l = r7
                r1.f996m = r2
                r1.f997n = r8
                r1.q = r5
                java.lang.Object r5 = kotlinx.coroutines.d.c(r9, r10, r1)
                if (r5 != r0) goto L_0x008e
                return r0
            L_0x008e:
                r5 = r2
                r2 = r8
            L_0x0090:
                kotlinx.coroutines.channels.g r8 = r5.iterator()     // Catch:{ all -> 0x00e8 }
                r9 = r1
            L_0x0095:
                r9.f995l = r7     // Catch:{ all -> 0x00e6 }
                r9.f996m = r5     // Catch:{ all -> 0x00e6 }
                r9.f997n = r2     // Catch:{ all -> 0x00e6 }
                r9.o = r8     // Catch:{ all -> 0x00e6 }
                r9.q = r4     // Catch:{ all -> 0x00e6 }
                java.lang.Object r10 = r8.a(r9)     // Catch:{ all -> 0x00e6 }
                if (r10 != r0) goto L_0x00a6
                return r0
            L_0x00a6:
                r16 = r5
                r5 = r2
                r2 = r8
                r8 = r7
                r7 = r16
            L_0x00ad:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00e4 }
                boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00e4 }
                if (r10 == 0) goto L_0x00cc
                java.lang.Object r10 = r2.next()     // Catch:{ all -> 0x00e4 }
                r9.f995l = r8     // Catch:{ all -> 0x00e4 }
                r9.f996m = r7     // Catch:{ all -> 0x00e4 }
                r9.f997n = r5     // Catch:{ all -> 0x00e4 }
                r9.o = r10     // Catch:{ all -> 0x00e4 }
                r9.p = r2     // Catch:{ all -> 0x00e4 }
                r9.q = r3     // Catch:{ all -> 0x00e4 }
                java.lang.Object r10 = r8.a(r10, r9)     // Catch:{ all -> 0x00e4 }
                if (r10 != r0) goto L_0x0028
                return r0
            L_0x00cc:
                kotlinx.coroutines.q1 r10 = kotlinx.coroutines.q1.f11053g
                kotlinx.coroutines.h2 r0 = kotlinx.coroutines.a1.c()
                kotlinx.coroutines.h2 r11 = r0.r0()
                r12 = 0
                androidx.lifecycle.k$a$b r13 = new androidx.lifecycle.k$a$b
                r13.<init>(r9, r5, r6)
                r14 = 2
                r15 = 0
                kotlinx.coroutines.x1 unused = kotlinx.coroutines.e.b(r10, r11, r12, r13, r14, r15)
                kotlin.x r0 = kotlin.x.a
                return r0
            L_0x00e4:
                r0 = move-exception
                goto L_0x00eb
            L_0x00e6:
                r0 = move-exception
                goto L_0x00ea
            L_0x00e8:
                r0 = move-exception
                r9 = r1
            L_0x00ea:
                r5 = r2
            L_0x00eb:
                kotlinx.coroutines.q1 r10 = kotlinx.coroutines.q1.f11053g
                kotlinx.coroutines.h2 r2 = kotlinx.coroutines.a1.c()
                kotlinx.coroutines.h2 r11 = r2.r0()
                r12 = 0
                androidx.lifecycle.k$a$b r13 = new androidx.lifecycle.k$a$b
                r13.<init>(r9, r5, r6)
                r14 = 2
                r15 = 0
                kotlinx.coroutines.x1 unused = kotlinx.coroutines.e.b(r10, r11, r12, r13, r14, r15)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.k.a.i(java.lang.Object):java.lang.Object");
        }

        public final Object l(Object obj, Object obj2) {
            return ((a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    @f(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {139}, m = "invokeSuspend")
    /* compiled from: FlowLiveData.kt */
    static final class b extends kotlin.c0.j.a.k implements p<a0<T>, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private a0 f1007k;

        /* renamed from: l  reason: collision with root package name */
        Object f1008l;

        /* renamed from: m  reason: collision with root package name */
        Object f1009m;

        /* renamed from: n  reason: collision with root package name */
        int f1010n;
        final /* synthetic */ c o;

        /* compiled from: Collect.kt */
        public static final class a implements d<T> {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ a0 f1011g;

            public a(a0 a0Var) {
                this.f1011g = a0Var;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object a(java.lang.Object r5, kotlin.c0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.lifecycle.l
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    androidx.lifecycle.l r0 = (androidx.lifecycle.l) r0
                    int r1 = r0.f1017k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f1017k = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.lifecycle.l r0 = new androidx.lifecycle.l
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f1016j
                    java.lang.Object r1 = kotlin.c0.i.d.c()
                    int r2 = r0.f1017k
                    r3 = 1
                    if (r2 == 0) goto L_0x003d
                    if (r2 != r3) goto L_0x0035
                    java.lang.Object r5 = r0.p
                    java.lang.Object r5 = r0.o
                    kotlin.c0.d r5 = (kotlin.c0.d) r5
                    java.lang.Object r5 = r0.f1020n
                    java.lang.Object r5 = r0.f1019m
                    androidx.lifecycle.k$b$a r5 = (androidx.lifecycle.k.b.a) r5
                    kotlin.l.b(r6)
                    goto L_0x0053
                L_0x0035:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x003d:
                    kotlin.l.b(r6)
                    androidx.lifecycle.a0 r6 = r4.f1011g
                    r0.f1019m = r4
                    r0.f1020n = r5
                    r0.o = r0
                    r0.p = r5
                    r0.f1017k = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L_0x0053
                    return r1
                L_0x0053:
                    kotlin.x r5 = kotlin.x.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.k.b.a.a(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, kotlin.c0.d dVar) {
            super(2, dVar);
            this.o = cVar;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            kotlin.jvm.internal.k.f(dVar, "completion");
            b bVar = new b(this.o, dVar);
            bVar.f1007k = (a0) obj;
            return bVar;
        }

        public final Object i(Object obj) {
            Object c = d.c();
            int i2 = this.f1010n;
            if (i2 == 0) {
                l.b(obj);
                a0 a0Var = this.f1007k;
                c cVar = this.o;
                a aVar = new a(a0Var);
                this.f1008l = a0Var;
                this.f1009m = cVar;
                this.f1010n = 1;
                if (cVar.a(aVar, this) == c) {
                    return c;
                }
            } else if (i2 == 1) {
                c cVar2 = (c) this.f1009m;
                a0 a0Var2 = (a0) this.f1008l;
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.a;
        }

        public final Object l(Object obj, Object obj2) {
            return ((b) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    public static final <T> c<T> a(LiveData<T> liveData) {
        kotlin.jvm.internal.k.f(liveData, "$this$asFlow");
        return kotlinx.coroutines.e3.e.i(new a(liveData, (kotlin.c0.d) null));
    }

    public static final <T> LiveData<T> b(c<? extends T> cVar, g gVar, long j2) {
        kotlin.jvm.internal.k.f(cVar, "$this$asLiveData");
        kotlin.jvm.internal.k.f(gVar, "context");
        return g.a(gVar, j2, new b(cVar, (kotlin.c0.d) null));
    }

    public static /* synthetic */ LiveData c(c cVar, g gVar, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gVar = h.f10600g;
        }
        if ((i2 & 2) != 0) {
            j2 = 5000;
        }
        return b(cVar, gVar, j2);
    }
}

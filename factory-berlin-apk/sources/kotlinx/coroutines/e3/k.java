package kotlinx.coroutines.e3;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.c0.j.a.d;
import kotlin.c0.j.a.f;
import kotlin.e0.c.p;
import kotlin.e0.c.q;
import kotlin.x;

/* compiled from: Emitters.kt */
final /* synthetic */ class k {

    @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {206}, m = "invokeSafely$FlowKt__EmittersKt")
    /* compiled from: Emitters.kt */
    static final class a extends d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f10797j;

        /* renamed from: k  reason: collision with root package name */
        int f10798k;

        /* renamed from: l  reason: collision with root package name */
        Object f10799l;

        /* renamed from: m  reason: collision with root package name */
        Object f10800m;

        /* renamed from: n  reason: collision with root package name */
        Object f10801n;

        a(kotlin.c0.d dVar) {
            super(dVar);
        }

        public final Object i(Object obj) {
            this.f10797j = obj;
            this.f10798k |= RecyclerView.UNDEFINED_DURATION;
            return k.a((d) null, (q) null, (Throwable) null, this);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    public static final class b implements c<T> {
        final /* synthetic */ c a;
        final /* synthetic */ q b;

        @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {114, 121, 125}, m = "collect")
        public static final class a extends d {

            /* renamed from: j  reason: collision with root package name */
            /* synthetic */ Object f10802j;

            /* renamed from: k  reason: collision with root package name */
            int f10803k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ b f10804l;

            /* renamed from: m  reason: collision with root package name */
            Object f10805m;

            /* renamed from: n  reason: collision with root package name */
            Object f10806n;
            Object o;
            Object p;
            Object q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, kotlin.c0.d dVar) {
                super(dVar);
                this.f10804l = bVar;
            }

            public final Object i(Object obj) {
                this.f10802j = obj;
                this.f10803k |= RecyclerView.UNDEFINED_DURATION;
                return this.f10804l.a((d) null, this);
            }
        }

        public b(c cVar, q qVar) {
            this.a = cVar;
            this.b = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00af A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(kotlinx.coroutines.e3.d r10, kotlin.c0.d r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof kotlinx.coroutines.e3.k.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r11
                kotlinx.coroutines.e3.k$b$a r0 = (kotlinx.coroutines.e3.k.b.a) r0
                int r1 = r0.f10803k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f10803k = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.e3.k$b$a r0 = new kotlinx.coroutines.e3.k$b$a
                r0.<init>(r9, r11)
            L_0x0018:
                java.lang.Object r11 = r0.f10802j
                java.lang.Object r1 = kotlin.c0.i.d.c()
                int r2 = r0.f10803k
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x007a
                if (r2 == r5) goto L_0x0061
                if (r2 == r4) goto L_0x0048
                if (r2 != r3) goto L_0x0040
                java.lang.Object r10 = r0.p
                kotlinx.coroutines.e3.d r10 = (kotlinx.coroutines.e3.d) r10
                java.lang.Object r10 = r0.o
                kotlin.c0.d r10 = (kotlin.c0.d) r10
                java.lang.Object r10 = r0.f10806n
                kotlinx.coroutines.e3.d r10 = (kotlinx.coroutines.e3.d) r10
                java.lang.Object r10 = r0.f10805m
                kotlinx.coroutines.e3.k$b r10 = (kotlinx.coroutines.e3.k.b) r10
                kotlin.l.b(r11)
                goto L_0x00b0
            L_0x0040:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L_0x0048:
                java.lang.Object r10 = r0.q
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                java.lang.Object r1 = r0.p
                kotlinx.coroutines.e3.d r1 = (kotlinx.coroutines.e3.d) r1
                java.lang.Object r1 = r0.o
                kotlin.c0.d r1 = (kotlin.c0.d) r1
                java.lang.Object r1 = r0.f10806n
                kotlinx.coroutines.e3.d r1 = (kotlinx.coroutines.e3.d) r1
                java.lang.Object r0 = r0.f10805m
                kotlinx.coroutines.e3.k$b r0 = (kotlinx.coroutines.e3.k.b) r0
                kotlin.l.b(r11)
                goto L_0x00d3
            L_0x0061:
                java.lang.Object r10 = r0.p
                kotlinx.coroutines.e3.d r10 = (kotlinx.coroutines.e3.d) r10
                java.lang.Object r2 = r0.o
                kotlin.c0.d r2 = (kotlin.c0.d) r2
                java.lang.Object r5 = r0.f10806n
                kotlinx.coroutines.e3.d r5 = (kotlinx.coroutines.e3.d) r5
                java.lang.Object r6 = r0.f10805m
                kotlinx.coroutines.e3.k$b r6 = (kotlinx.coroutines.e3.k.b) r6
                kotlin.l.b(r11)     // Catch:{ all -> 0x0075 }
                goto L_0x0093
            L_0x0075:
                r11 = move-exception
                r8 = r11
                r11 = r10
                r10 = r8
                goto L_0x00b9
            L_0x007a:
                kotlin.l.b(r11)
                kotlinx.coroutines.e3.c r11 = r9.a     // Catch:{ all -> 0x00b3 }
                r0.f10805m = r9     // Catch:{ all -> 0x00b3 }
                r0.f10806n = r10     // Catch:{ all -> 0x00b3 }
                r0.o = r0     // Catch:{ all -> 0x00b3 }
                r0.p = r10     // Catch:{ all -> 0x00b3 }
                r0.f10803k = r5     // Catch:{ all -> 0x00b3 }
                java.lang.Object r11 = r11.a(r10, r0)     // Catch:{ all -> 0x00b3 }
                if (r11 != r1) goto L_0x0090
                return r1
            L_0x0090:
                r6 = r9
                r5 = r10
                r2 = r0
            L_0x0093:
                kotlin.c0.g r11 = r0.c()
                kotlinx.coroutines.flow.internal.n r4 = new kotlinx.coroutines.flow.internal.n
                r4.<init>(r10, r11)
                kotlin.e0.c.q r11 = r6.b
                r7 = 0
                r0.f10805m = r6
                r0.f10806n = r5
                r0.o = r2
                r0.p = r10
                r0.f10803k = r3
                java.lang.Object r10 = kotlinx.coroutines.e3.k.a(r4, r11, r7, r0)
                if (r10 != r1) goto L_0x00b0
                return r1
            L_0x00b0:
                kotlin.x r10 = kotlin.x.a
                return r10
            L_0x00b3:
                r11 = move-exception
                r6 = r9
                r5 = r10
                r2 = r0
                r10 = r11
                r11 = r5
            L_0x00b9:
                kotlinx.coroutines.e3.w r3 = new kotlinx.coroutines.e3.w
                r3.<init>(r10)
                kotlin.e0.c.q r7 = r6.b
                r0.f10805m = r6
                r0.f10806n = r5
                r0.o = r2
                r0.p = r11
                r0.q = r10
                r0.f10803k = r4
                java.lang.Object r11 = kotlinx.coroutines.e3.k.a(r3, r7, r10, r0)
                if (r11 != r1) goto L_0x00d3
                return r1
            L_0x00d3:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e3.k.b.a(kotlinx.coroutines.e3.d, kotlin.c0.d):java.lang.Object");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    public static final class c implements c<T> {
        final /* synthetic */ c a;
        final /* synthetic */ p b;

        @f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {116, 120}, m = "collect")
        public static final class a extends d {

            /* renamed from: j  reason: collision with root package name */
            /* synthetic */ Object f10807j;

            /* renamed from: k  reason: collision with root package name */
            int f10808k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ c f10809l;

            /* renamed from: m  reason: collision with root package name */
            Object f10810m;

            /* renamed from: n  reason: collision with root package name */
            Object f10811n;
            Object o;
            Object p;
            Object q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(c cVar, kotlin.c0.d dVar) {
                super(dVar);
                this.f10809l = cVar;
            }

            public final Object i(Object obj) {
                this.f10807j = obj;
                this.f10808k |= RecyclerView.UNDEFINED_DURATION;
                return this.f10809l.a((d) null, this);
            }
        }

        public c(c cVar, p pVar) {
            this.a = cVar;
            this.b = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x009f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(kotlinx.coroutines.e3.d r8, kotlin.c0.d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.e3.k.c.a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                kotlinx.coroutines.e3.k$c$a r0 = (kotlinx.coroutines.e3.k.c.a) r0
                int r1 = r0.f10808k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f10808k = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.e3.k$c$a r0 = new kotlinx.coroutines.e3.k$c$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f10807j
                java.lang.Object r1 = kotlin.c0.i.d.c()
                int r2 = r0.f10808k
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0062
                if (r2 == r4) goto L_0x0048
                if (r2 != r3) goto L_0x0040
                java.lang.Object r8 = r0.q
                kotlinx.coroutines.flow.internal.n r8 = (kotlinx.coroutines.flow.internal.n) r8
                java.lang.Object r8 = r0.p
                kotlinx.coroutines.e3.d r8 = (kotlinx.coroutines.e3.d) r8
                java.lang.Object r8 = r0.o
                kotlin.c0.d r8 = (kotlin.c0.d) r8
                java.lang.Object r8 = r0.f10811n
                kotlinx.coroutines.e3.d r8 = (kotlinx.coroutines.e3.d) r8
                java.lang.Object r8 = r0.f10810m
                kotlinx.coroutines.e3.k$c r8 = (kotlinx.coroutines.e3.k.c) r8
                kotlin.l.b(r9)
                goto L_0x00a0
            L_0x0040:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0048:
                java.lang.Object r8 = r0.q
                kotlinx.coroutines.flow.internal.n r8 = (kotlinx.coroutines.flow.internal.n) r8
                java.lang.Object r2 = r0.p
                kotlinx.coroutines.e3.d r2 = (kotlinx.coroutines.e3.d) r2
                java.lang.Object r4 = r0.o
                kotlin.c0.d r4 = (kotlin.c0.d) r4
                java.lang.Object r5 = r0.f10811n
                kotlinx.coroutines.e3.d r5 = (kotlinx.coroutines.e3.d) r5
                java.lang.Object r6 = r0.f10810m
                kotlinx.coroutines.e3.k$c r6 = (kotlinx.coroutines.e3.k.c) r6
                kotlin.l.b(r9)     // Catch:{ all -> 0x0060 }
                goto L_0x0088
            L_0x0060:
                r9 = move-exception
                goto L_0x00a5
            L_0x0062:
                kotlin.l.b(r9)
                kotlin.c0.g r9 = r0.c()
                kotlinx.coroutines.flow.internal.n r2 = new kotlinx.coroutines.flow.internal.n
                r2.<init>(r8, r9)
                kotlin.e0.c.p r9 = r7.b     // Catch:{ all -> 0x00a3 }
                r0.f10810m = r7     // Catch:{ all -> 0x00a3 }
                r0.f10811n = r8     // Catch:{ all -> 0x00a3 }
                r0.o = r0     // Catch:{ all -> 0x00a3 }
                r0.p = r8     // Catch:{ all -> 0x00a3 }
                r0.q = r2     // Catch:{ all -> 0x00a3 }
                r0.f10808k = r4     // Catch:{ all -> 0x00a3 }
                java.lang.Object r9 = r9.l(r2, r0)     // Catch:{ all -> 0x00a3 }
                if (r9 != r1) goto L_0x0083
                return r1
            L_0x0083:
                r6 = r7
                r5 = r8
                r4 = r0
                r8 = r2
                r2 = r5
            L_0x0088:
                r8.p()
                kotlinx.coroutines.e3.c r9 = r6.a
                r0.f10810m = r6
                r0.f10811n = r5
                r0.o = r4
                r0.p = r2
                r0.q = r8
                r0.f10808k = r3
                java.lang.Object r8 = r9.a(r2, r0)
                if (r8 != r1) goto L_0x00a0
                return r1
            L_0x00a0:
                kotlin.x r8 = kotlin.x.a
                return r8
            L_0x00a3:
                r9 = move-exception
                r8 = r2
            L_0x00a5:
                r8.p()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e3.k.c.a(kotlinx.coroutines.e3.d, kotlin.c0.d):java.lang.Object");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ <T> java.lang.Object a(kotlinx.coroutines.e3.d<? super T> r4, kotlin.e0.c.q<? super kotlinx.coroutines.e3.d<? super T>, ? super java.lang.Throwable, ? super kotlin.c0.d<? super kotlin.x>, ? extends java.lang.Object> r5, java.lang.Throwable r6, kotlin.c0.d<? super kotlin.x> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.e3.k.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.e3.k$a r0 = (kotlinx.coroutines.e3.k.a) r0
            int r1 = r0.f10798k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10798k = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.e3.k$a r0 = new kotlinx.coroutines.e3.k$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f10797j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f10798k
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r4 = r0.f10801n
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Object r4 = r0.f10800m
            kotlin.e0.c.q r4 = (kotlin.e0.c.q) r4
            java.lang.Object r4 = r0.f10799l
            kotlinx.coroutines.e3.d r4 = (kotlinx.coroutines.e3.d) r4
            kotlin.l.b(r7)     // Catch:{ all -> 0x0053 }
            goto L_0x0050
        L_0x0036:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003e:
            kotlin.l.b(r7)
            r0.f10799l = r4     // Catch:{ all -> 0x0053 }
            r0.f10800m = r5     // Catch:{ all -> 0x0053 }
            r0.f10801n = r6     // Catch:{ all -> 0x0053 }
            r0.f10798k = r3     // Catch:{ all -> 0x0053 }
            java.lang.Object r4 = r5.k(r4, r6, r0)     // Catch:{ all -> 0x0053 }
            if (r4 != r1) goto L_0x0050
            return r1
        L_0x0050:
            kotlin.x r4 = kotlin.x.a
            return r4
        L_0x0053:
            r4 = move-exception
            if (r6 == 0) goto L_0x005b
            if (r6 == r4) goto L_0x005b
            kotlin.b.a(r4, r6)
        L_0x005b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e3.k.a(kotlinx.coroutines.e3.d, kotlin.e0.c.q, java.lang.Throwable, kotlin.c0.d):java.lang.Object");
    }

    public static final <T> c<T> b(c<? extends T> cVar, q<? super d<? super T>, ? super Throwable, ? super kotlin.c0.d<? super x>, ? extends Object> qVar) {
        return new b(cVar, qVar);
    }

    public static final <T> c<T> c(c<? extends T> cVar, p<? super d<? super T>, ? super kotlin.c0.d<? super x>, ? extends Object> pVar) {
        return new c(cVar, pVar);
    }
}

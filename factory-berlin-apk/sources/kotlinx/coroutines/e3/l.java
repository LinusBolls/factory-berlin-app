package kotlinx.coroutines.e3;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.c0.g;
import kotlin.c0.j.a.d;
import kotlin.c0.j.a.f;
import kotlin.e0.c.q;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import kotlin.x;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.x1;

/* compiled from: Errors.kt */
final /* synthetic */ class l {

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements c<T> {
        final /* synthetic */ c a;
        final /* synthetic */ q b;

        @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 114}, m = "collect")
        /* renamed from: kotlinx.coroutines.e3.l$a$a  reason: collision with other inner class name */
        public static final class C0767a extends d {

            /* renamed from: j  reason: collision with root package name */
            /* synthetic */ Object f10812j;

            /* renamed from: k  reason: collision with root package name */
            int f10813k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ a f10814l;

            /* renamed from: m  reason: collision with root package name */
            Object f10815m;

            /* renamed from: n  reason: collision with root package name */
            Object f10816n;
            Object o;
            Object p;
            Object q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0767a(a aVar, kotlin.c0.d dVar) {
                super(dVar);
                this.f10814l = aVar;
            }

            public final Object i(Object obj) {
                this.f10812j = obj;
                this.f10813k |= RecyclerView.UNDEFINED_DURATION;
                return this.f10814l.a((d) null, this);
            }
        }

        public a(c cVar, q qVar) {
            this.a = cVar;
            this.b = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(kotlinx.coroutines.e3.d r8, kotlin.c0.d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.e3.l.a.C0767a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                kotlinx.coroutines.e3.l$a$a r0 = (kotlinx.coroutines.e3.l.a.C0767a) r0
                int r1 = r0.f10813k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f10813k = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.e3.l$a$a r0 = new kotlinx.coroutines.e3.l$a$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f10812j
                java.lang.Object r1 = kotlin.c0.i.d.c()
                int r2 = r0.f10813k
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x005c
                if (r2 == r4) goto L_0x0048
                if (r2 != r3) goto L_0x0040
                java.lang.Object r8 = r0.q
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                java.lang.Object r8 = r0.p
                kotlinx.coroutines.e3.d r8 = (kotlinx.coroutines.e3.d) r8
                java.lang.Object r8 = r0.o
                kotlin.c0.d r8 = (kotlin.c0.d) r8
                java.lang.Object r8 = r0.f10816n
                kotlinx.coroutines.e3.d r8 = (kotlinx.coroutines.e3.d) r8
                java.lang.Object r8 = r0.f10815m
                kotlinx.coroutines.e3.l$a r8 = (kotlinx.coroutines.e3.l.a) r8
                kotlin.l.b(r9)
                goto L_0x008e
            L_0x0040:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0048:
                java.lang.Object r8 = r0.p
                kotlinx.coroutines.e3.d r8 = (kotlinx.coroutines.e3.d) r8
                java.lang.Object r2 = r0.o
                kotlin.c0.d r2 = (kotlin.c0.d) r2
                java.lang.Object r4 = r0.f10816n
                kotlinx.coroutines.e3.d r4 = (kotlinx.coroutines.e3.d) r4
                java.lang.Object r5 = r0.f10815m
                kotlinx.coroutines.e3.l$a r5 = (kotlinx.coroutines.e3.l.a) r5
                kotlin.l.b(r9)
                goto L_0x0075
            L_0x005c:
                kotlin.l.b(r9)
                kotlinx.coroutines.e3.c r9 = r7.a
                r0.f10815m = r7
                r0.f10816n = r8
                r0.o = r0
                r0.p = r8
                r0.f10813k = r4
                java.lang.Object r9 = kotlinx.coroutines.e3.e.b(r9, r8, r0)
                if (r9 != r1) goto L_0x0072
                return r1
            L_0x0072:
                r5 = r7
                r4 = r8
                r2 = r0
            L_0x0075:
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                if (r9 == 0) goto L_0x008e
                kotlin.e0.c.q r6 = r5.b
                r0.f10815m = r5
                r0.f10816n = r4
                r0.o = r2
                r0.p = r8
                r0.q = r9
                r0.f10813k = r3
                java.lang.Object r8 = r6.k(r8, r9, r0)
                if (r8 != r1) goto L_0x008e
                return r1
            L_0x008e:
                kotlin.x r8 = kotlin.x.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e3.l.a.a(kotlinx.coroutines.e3.d, kotlin.c0.d):java.lang.Object");
        }
    }

    /* compiled from: Collect.kt */
    public static final class b implements d<T> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f10817g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ u f10818h;

        @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$$inlined$collect$1", f = "Errors.kt", l = {134}, m = "emit")
        public static final class a extends d {

            /* renamed from: j  reason: collision with root package name */
            /* synthetic */ Object f10819j;

            /* renamed from: k  reason: collision with root package name */
            int f10820k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ b f10821l;

            /* renamed from: m  reason: collision with root package name */
            Object f10822m;

            /* renamed from: n  reason: collision with root package name */
            Object f10823n;
            Object o;
            Object p;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, kotlin.c0.d dVar) {
                super(dVar);
                this.f10821l = bVar;
            }

            public final Object i(Object obj) {
                this.f10819j = obj;
                this.f10820k |= RecyclerView.UNDEFINED_DURATION;
                return this.f10821l.a((Object) null, this);
            }
        }

        public b(d dVar, u uVar) {
            this.f10817g = dVar;
            this.f10818h = uVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(java.lang.Object r5, kotlin.c0.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.e3.l.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                kotlinx.coroutines.e3.l$b$a r0 = (kotlinx.coroutines.e3.l.b.a) r0
                int r1 = r0.f10820k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f10820k = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.e3.l$b$a r0 = new kotlinx.coroutines.e3.l$b$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f10819j
                java.lang.Object r1 = kotlin.c0.i.d.c()
                int r2 = r0.f10820k
                r3 = 1
                if (r2 == 0) goto L_0x003f
                if (r2 != r3) goto L_0x0037
                java.lang.Object r5 = r0.p
                java.lang.Object r5 = r0.o
                kotlin.c0.d r5 = (kotlin.c0.d) r5
                java.lang.Object r5 = r0.f10823n
                java.lang.Object r5 = r0.f10822m
                kotlinx.coroutines.e3.l$b r5 = (kotlinx.coroutines.e3.l.b) r5
                kotlin.l.b(r6)     // Catch:{ all -> 0x0035 }
                goto L_0x0055
            L_0x0035:
                r6 = move-exception
                goto L_0x005a
            L_0x0037:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x003f:
                kotlin.l.b(r6)
                kotlinx.coroutines.e3.d r6 = r4.f10817g     // Catch:{ all -> 0x0058 }
                r0.f10822m = r4     // Catch:{ all -> 0x0058 }
                r0.f10823n = r5     // Catch:{ all -> 0x0058 }
                r0.o = r0     // Catch:{ all -> 0x0058 }
                r0.p = r5     // Catch:{ all -> 0x0058 }
                r0.f10820k = r3     // Catch:{ all -> 0x0058 }
                java.lang.Object r5 = r6.a(r5, r0)     // Catch:{ all -> 0x0058 }
                if (r5 != r1) goto L_0x0055
                return r1
            L_0x0055:
                kotlin.x r5 = kotlin.x.a
                return r5
            L_0x0058:
                r6 = move-exception
                r5 = r4
            L_0x005a:
                kotlin.jvm.internal.u r5 = r5.f10818h
                r5.f10686g = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e3.l.b.a(java.lang.Object, kotlin.c0.d):java.lang.Object");
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {229}, m = "catchImpl")
    /* compiled from: Errors.kt */
    static final class c extends d {

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f10824j;

        /* renamed from: k  reason: collision with root package name */
        int f10825k;

        /* renamed from: l  reason: collision with root package name */
        Object f10826l;

        /* renamed from: m  reason: collision with root package name */
        Object f10827m;

        /* renamed from: n  reason: collision with root package name */
        Object f10828n;
        Object o;

        c(kotlin.c0.d dVar) {
            super(dVar);
        }

        public final Object i(Object obj) {
            this.f10824j = obj;
            this.f10825k |= RecyclerView.UNDEFINED_DURATION;
            return e.b((c) null, (d) null, this);
        }
    }

    public static final <T> c<T> a(c<? extends T> cVar, q<? super d<? super T>, ? super Throwable, ? super kotlin.c0.d<? super x>, ? extends Object> qVar) {
        return new a(cVar, qVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object b(kotlinx.coroutines.e3.c<? extends T> r5, kotlinx.coroutines.e3.d<? super T> r6, kotlin.c0.d<? super java.lang.Throwable> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.e3.l.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.e3.l$c r0 = (kotlinx.coroutines.e3.l.c) r0
            int r1 = r0.f10825k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10825k = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.e3.l$c r0 = new kotlinx.coroutines.e3.l$c
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f10824j
            java.lang.Object r1 = kotlin.c0.i.d.c()
            int r2 = r0.f10825k
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 != r4) goto L_0x003c
            java.lang.Object r5 = r0.o
            kotlinx.coroutines.e3.c r5 = (kotlinx.coroutines.e3.c) r5
            java.lang.Object r5 = r0.f10828n
            kotlin.jvm.internal.u r5 = (kotlin.jvm.internal.u) r5
            java.lang.Object r6 = r0.f10827m
            kotlinx.coroutines.e3.d r6 = (kotlinx.coroutines.e3.d) r6
            java.lang.Object r6 = r0.f10826l
            kotlinx.coroutines.e3.c r6 = (kotlinx.coroutines.e3.c) r6
            kotlin.l.b(r7)     // Catch:{ all -> 0x003a }
            goto L_0x0064
        L_0x003a:
            r6 = move-exception
            goto L_0x0067
        L_0x003c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0044:
            kotlin.l.b(r7)
            kotlin.jvm.internal.u r7 = new kotlin.jvm.internal.u
            r7.<init>()
            r7.f10686g = r3
            kotlinx.coroutines.e3.l$b r2 = new kotlinx.coroutines.e3.l$b     // Catch:{ all -> 0x0065 }
            r2.<init>(r6, r7)     // Catch:{ all -> 0x0065 }
            r0.f10826l = r5     // Catch:{ all -> 0x0065 }
            r0.f10827m = r6     // Catch:{ all -> 0x0065 }
            r0.f10828n = r7     // Catch:{ all -> 0x0065 }
            r0.o = r5     // Catch:{ all -> 0x0065 }
            r0.f10825k = r4     // Catch:{ all -> 0x0065 }
            java.lang.Object r5 = r5.a(r2, r0)     // Catch:{ all -> 0x0065 }
            if (r5 != r1) goto L_0x0064
            return r1
        L_0x0064:
            return r3
        L_0x0065:
            r6 = move-exception
            r5 = r7
        L_0x0067:
            T r5 = r5.f10686g
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            boolean r5 = d(r6, r5)
            if (r5 != 0) goto L_0x007c
            kotlin.c0.g r5 = r0.c()
            boolean r5 = c(r6, r5)
            if (r5 != 0) goto L_0x007c
            return r6
        L_0x007c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e3.l.b(kotlinx.coroutines.e3.c, kotlinx.coroutines.e3.d, kotlin.c0.d):java.lang.Object");
    }

    private static final boolean c(Throwable th, g gVar) {
        x1 x1Var = (x1) gVar.get(x1.f11076e);
        if (x1Var == null || !x1Var.isCancelled()) {
            return false;
        }
        return d(th, x1Var.K());
    }

    private static final boolean d(Throwable th, Throwable th2) {
        if (th2 != null) {
            if (n0.d()) {
                th2 = w.m(th2);
            }
            if (n0.d()) {
                th = w.m(th);
            }
            if (k.a(th2, th)) {
                return true;
            }
        }
        return false;
    }
}

package g.e.k;

import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.e0.c.l;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlin.x;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.channels.v;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.i0;

/* compiled from: ObservableData.kt */
public abstract class e<T> {

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ kotlin.h0.f[] f9835l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Executor f9836m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static volatile Thread f9837n;
    /* access modifiers changed from: private */
    public static final Object o = new Object();
    public static final b p = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public long f9838g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Map<l<T, x>, c<T>> f9839h = Collections.synchronizedMap(new LinkedHashMap());
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReference<Object> f9840i = new AtomicReference<>(o);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final AtomicReference<Object> f9841j = new AtomicReference<>(o);

    /* renamed from: k  reason: collision with root package name */
    private final kotlin.e f9842k = g.a(new C0678e(this));

    /* compiled from: ObservableData.kt */
    static final class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        public static final a f9843g = new a();

        a() {
        }

        public final void run() {
            e.f9837n = Thread.currentThread();
        }
    }

    /* compiled from: ObservableData.kt */
    public static final class b {
        private b() {
        }

        public final void a(kotlin.e0.c.a<x> aVar) {
            k.f(aVar, "runnable");
            if (b()) {
                aVar.d();
            } else {
                e.f9836m.execute(new f(aVar));
            }
        }

        public final boolean b() {
            return k.a(Thread.currentThread(), e.f9837n);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ObservableData.kt */
    private static final class c<T> {
        private long a;
        private final l<T, x> b;

        public c(l<? super T, x> lVar) {
            k.f(lVar, "observer");
            this.b = lVar;
        }

        public final void a(T t, long j2) {
            if (j2 > this.a) {
                this.a = j2;
                this.b.o(t);
            }
        }
    }

    @kotlin.c0.j.a.f(c = "com.sensorberg.observable.ObservableData$asFlow$1", f = "ObservableData.kt", l = {118, 123, 124}, m = "invokeSuspend")
    /* compiled from: ObservableData.kt */
    static final class d extends kotlin.c0.j.a.k implements p<kotlinx.coroutines.e3.d<? super T>, kotlin.c0.d<? super x>, Object> {

        /* renamed from: k  reason: collision with root package name */
        private kotlinx.coroutines.e3.d f9844k;

        /* renamed from: l  reason: collision with root package name */
        Object f9845l;

        /* renamed from: m  reason: collision with root package name */
        Object f9846m;

        /* renamed from: n  reason: collision with root package name */
        Object f9847n;
        Object o;
        Object p;
        int q;
        final /* synthetic */ e r;
        final /* synthetic */ a s;
        final /* synthetic */ d0 t;

        @kotlin.c0.j.a.f(c = "com.sensorberg.observable.ObservableData$asFlow$1$1", f = "ObservableData.kt", l = {}, m = "invokeSuspend")
        /* compiled from: ObservableData.kt */
        static final class a extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private i0 f9848k;

            /* renamed from: l  reason: collision with root package name */
            int f9849l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ d f9850m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ l f9851n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, l lVar, kotlin.c0.d dVar2) {
                super(2, dVar2);
                this.f9850m = dVar;
                this.f9851n = lVar;
            }

            public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
                k.f(dVar, "completion");
                a aVar = new a(this.f9850m, this.f9851n, dVar);
                aVar.f9848k = (i0) obj;
                return aVar;
            }

            public final Object i(Object obj) {
                Object unused = d.c();
                if (this.f9849l == 0) {
                    kotlin.l.b(obj);
                    this.f9850m.r.r(this.f9851n);
                    return x.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object l(Object obj, Object obj2) {
                return ((a) b(obj, (kotlin.c0.d) obj2)).i(x.a);
            }
        }

        @kotlin.c0.j.a.f(c = "com.sensorberg.observable.ObservableData$asFlow$1$2", f = "ObservableData.kt", l = {}, m = "invokeSuspend")
        /* compiled from: ObservableData.kt */
        static final class b extends kotlin.c0.j.a.k implements p<i0, kotlin.c0.d<? super x>, Object> {

            /* renamed from: k  reason: collision with root package name */
            private i0 f9852k;

            /* renamed from: l  reason: collision with root package name */
            int f9853l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ d f9854m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ l f9855n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(d dVar, l lVar, kotlin.c0.d dVar2) {
                super(2, dVar2);
                this.f9854m = dVar;
                this.f9855n = lVar;
            }

            public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
                k.f(dVar, "completion");
                b bVar = new b(this.f9854m, this.f9855n, dVar);
                bVar.f9852k = (i0) obj;
                return bVar;
            }

            public final Object i(Object obj) {
                Object unused = d.c();
                if (this.f9853l == 0) {
                    kotlin.l.b(obj);
                    this.f9854m.r.v(this.f9855n);
                    return x.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object l(Object obj, Object obj2) {
                return ((b) b(obj, (kotlin.c0.d) obj2)).i(x.a);
            }
        }

        /* compiled from: ObservableData.kt */
        static final class c extends kotlin.jvm.internal.l implements l<T, x> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ d f9856h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.e f9857i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(d dVar, kotlinx.coroutines.channels.e eVar) {
                super(1);
                this.f9856h = dVar;
                this.f9857i = eVar;
            }

            public final void a(T t) {
                if (this.f9856h.s.c()) {
                    v.a.a(this.f9857i, (Throwable) null, 1, (Object) null);
                }
                if (t != null) {
                    this.f9857i.offer(t);
                }
            }

            public /* bridge */ /* synthetic */ Object o(Object obj) {
                a(obj);
                return x.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar, a aVar, d0 d0Var, kotlin.c0.d dVar) {
            super(2, dVar);
            this.r = eVar;
            this.s = aVar;
            this.t = d0Var;
        }

        public final kotlin.c0.d<x> b(Object obj, kotlin.c0.d<?> dVar) {
            k.f(dVar, "completion");
            d dVar2 = new d(this.r, this.s, this.t, dVar);
            dVar2.f9844k = (kotlinx.coroutines.e3.d) obj;
            return dVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x009f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00af A[Catch:{ all -> 0x00de }] */
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
                java.lang.Object r5 = r1.f9847n
                kotlin.e0.c.l r5 = (kotlin.e0.c.l) r5
                java.lang.Object r7 = r1.f9846m
                kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.e) r7
                java.lang.Object r8 = r1.f9845l
                kotlinx.coroutines.e3.d r8 = (kotlinx.coroutines.e3.d) r8
                kotlin.l.b(r18)     // Catch:{ all -> 0x004f }
                r9 = r1
            L_0x0028:
                r16 = r8
                r8 = r2
                r2 = r5
                r5 = r7
                r7 = r16
                goto L_0x008f
            L_0x0030:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0038:
                java.lang.Object r2 = r1.o
                kotlinx.coroutines.channels.g r2 = (kotlinx.coroutines.channels.g) r2
                java.lang.Object r5 = r1.f9847n
                kotlin.e0.c.l r5 = (kotlin.e0.c.l) r5
                java.lang.Object r7 = r1.f9846m
                kotlinx.coroutines.channels.e r7 = (kotlinx.coroutines.channels.e) r7
                java.lang.Object r8 = r1.f9845l
                kotlinx.coroutines.e3.d r8 = (kotlinx.coroutines.e3.d) r8
                kotlin.l.b(r18)     // Catch:{ all -> 0x004f }
                r10 = r18
                r9 = r1
                goto L_0x00a7
            L_0x004f:
                r0 = move-exception
                r9 = r1
                goto L_0x00e5
            L_0x0053:
                java.lang.Object r2 = r1.f9847n
                kotlin.e0.c.l r2 = (kotlin.e0.c.l) r2
                java.lang.Object r5 = r1.f9846m
                kotlinx.coroutines.channels.e r5 = (kotlinx.coroutines.channels.e) r5
                java.lang.Object r7 = r1.f9845l
                kotlinx.coroutines.e3.d r7 = (kotlinx.coroutines.e3.d) r7
                kotlin.l.b(r18)
                goto L_0x008a
            L_0x0063:
                kotlin.l.b(r18)
                kotlinx.coroutines.e3.d r7 = r1.f9844k
                r2 = -1
                kotlinx.coroutines.channels.e r2 = kotlinx.coroutines.channels.h.a(r2)
                g.e.k.e$d$c r8 = new g.e.k.e$d$c
                r8.<init>(r1, r2)
                kotlinx.coroutines.d0 r9 = r1.t
                g.e.k.e$d$a r10 = new g.e.k.e$d$a
                r10.<init>(r1, r8, r6)
                r1.f9845l = r7
                r1.f9846m = r2
                r1.f9847n = r8
                r1.q = r5
                java.lang.Object r5 = kotlinx.coroutines.d.c(r9, r10, r1)
                if (r5 != r0) goto L_0x0088
                return r0
            L_0x0088:
                r5 = r2
                r2 = r8
            L_0x008a:
                kotlinx.coroutines.channels.g r8 = r5.iterator()     // Catch:{ all -> 0x00e2 }
                r9 = r1
            L_0x008f:
                r9.f9845l = r7     // Catch:{ all -> 0x00e0 }
                r9.f9846m = r5     // Catch:{ all -> 0x00e0 }
                r9.f9847n = r2     // Catch:{ all -> 0x00e0 }
                r9.o = r8     // Catch:{ all -> 0x00e0 }
                r9.q = r4     // Catch:{ all -> 0x00e0 }
                java.lang.Object r10 = r8.a(r9)     // Catch:{ all -> 0x00e0 }
                if (r10 != r0) goto L_0x00a0
                return r0
            L_0x00a0:
                r16 = r5
                r5 = r2
                r2 = r8
                r8 = r7
                r7 = r16
            L_0x00a7:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00de }
                boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00de }
                if (r10 == 0) goto L_0x00c6
                java.lang.Object r10 = r2.next()     // Catch:{ all -> 0x00de }
                r9.f9845l = r8     // Catch:{ all -> 0x00de }
                r9.f9846m = r7     // Catch:{ all -> 0x00de }
                r9.f9847n = r5     // Catch:{ all -> 0x00de }
                r9.o = r10     // Catch:{ all -> 0x00de }
                r9.p = r2     // Catch:{ all -> 0x00de }
                r9.q = r3     // Catch:{ all -> 0x00de }
                java.lang.Object r10 = r8.a(r10, r9)     // Catch:{ all -> 0x00de }
                if (r10 != r0) goto L_0x0028
                return r0
            L_0x00c6:
                kotlinx.coroutines.q1 r10 = kotlinx.coroutines.q1.f11053g
                kotlinx.coroutines.h2 r0 = kotlinx.coroutines.a1.c()
                kotlinx.coroutines.h2 r11 = r0.r0()
                r12 = 0
                g.e.k.e$d$b r13 = new g.e.k.e$d$b
                r13.<init>(r9, r5, r6)
                r14 = 2
                r15 = 0
                kotlinx.coroutines.x1 unused = kotlinx.coroutines.e.b(r10, r11, r12, r13, r14, r15)
                kotlin.x r0 = kotlin.x.a
                return r0
            L_0x00de:
                r0 = move-exception
                goto L_0x00e5
            L_0x00e0:
                r0 = move-exception
                goto L_0x00e4
            L_0x00e2:
                r0 = move-exception
                r9 = r1
            L_0x00e4:
                r5 = r2
            L_0x00e5:
                kotlinx.coroutines.q1 r10 = kotlinx.coroutines.q1.f11053g
                kotlinx.coroutines.h2 r2 = kotlinx.coroutines.a1.c()
                kotlinx.coroutines.h2 r11 = r2.r0()
                r12 = 0
                g.e.k.e$d$b r13 = new g.e.k.e$d$b
                r13.<init>(r9, r5, r6)
                r14 = 2
                r15 = 0
                kotlinx.coroutines.x1 unused = kotlinx.coroutines.e.b(r10, r11, r12, r13, r14, r15)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g.e.k.e.d.i(java.lang.Object):java.lang.Object");
        }

        public final Object l(Object obj, Object obj2) {
            return ((d) b(obj, (kotlin.c0.d) obj2)).i(x.a);
        }
    }

    /* renamed from: g.e.k.e$e  reason: collision with other inner class name */
    /* compiled from: ObservableData.kt */
    static final class C0678e extends kotlin.jvm.internal.l implements kotlin.e0.c.a<b<T>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f9858h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0678e(e eVar) {
            super(0);
            this.f9858h = eVar;
        }

        /* renamed from: a */
        public final b<T> d() {
            return new b<>(this.f9858h);
        }
    }

    /* compiled from: ObservableData.kt */
    static final class f extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f9859h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Object f9860i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar, Object obj) {
            super(0);
            this.f9859h = eVar;
            this.f9860i = obj;
        }

        public final void a() {
            Object andSet = this.f9859h.f9841j.getAndSet(e.o);
            if (!k.a(andSet, e.o)) {
                e eVar = this.f9859h;
                eVar.f9838g = eVar.f9838g + 1;
                this.f9859h.f9840i.set(andSet);
                this.f9859h.u(this.f9860i);
                Map e2 = this.f9859h.f9839h;
                k.b(e2, "observers");
                ArrayList<c> arrayList = new ArrayList<>(e2.size());
                for (Map.Entry value : e2.entrySet()) {
                    arrayList.add((c) value.getValue());
                }
                for (c a : arrayList) {
                    a.a(andSet, this.f9859h.f9838g);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: ObservableData.kt */
    static final class g extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f9861h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ l f9862i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(e eVar, l lVar) {
            super(0);
            this.f9861h = eVar;
            this.f9862i = lVar;
        }

        public final void a() {
            c cVar = new c(this.f9862i);
            Map e2 = this.f9861h.f9839h;
            k.b(e2, "observers");
            e2.put(this.f9862i, cVar);
            if (this.f9861h.f9839h.size() == 1) {
                this.f9861h.s();
            }
            Object obj = this.f9861h.f9840i.get();
            if (true ^ k.a(obj, e.o)) {
                cVar.a(obj, this.f9861h.f9838g);
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    /* compiled from: ObservableData.kt */
    static final class h extends kotlin.jvm.internal.l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f9863h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ l f9864i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar, l lVar) {
            super(0);
            this.f9863h = eVar;
            this.f9864i = lVar;
        }

        public final void a() {
            Map e2 = this.f9863h.f9839h;
            k.b(e2, "observers");
            boolean z = !e2.isEmpty();
            this.f9863h.f9839h.remove(this.f9864i);
            if (z && this.f9863h.f9839h.isEmpty()) {
                this.f9863h.t();
            }
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    static {
        o oVar = new o(kotlin.jvm.internal.v.b(e.class), "exportLiveData", "getExportLiveData()Landroidx/lifecycle/LiveData;");
        kotlin.jvm.internal.v.d(oVar);
        f9835l = new kotlin.h0.f[]{oVar};
        Executor d2 = g.e.e.a.f9778f.d();
        f9836m = d2;
        d2.execute(a.f9843g);
    }

    public static /* synthetic */ kotlinx.coroutines.e3.c l(e eVar, a aVar, d0 d0Var, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                d0Var = a1.a();
            }
            return eVar.k(aVar, d0Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asFlow");
    }

    private final LiveData<T> m() {
        kotlin.e eVar = this.f9842k;
        kotlin.h0.f fVar = f9835l[0];
        return (LiveData) eVar.getValue();
    }

    private final T p() {
        T t = this.f9840i.get();
        if (k.a(t, o)) {
            return null;
        }
        return t;
    }

    private final void q(T t) {
        this.f9841j.set(t);
        p.a(new f(this, t));
    }

    public final kotlinx.coroutines.e3.c<T> k(a aVar, d0 d0Var) {
        k.f(aVar, "cancellation");
        k.f(d0Var, "dispatcher");
        return kotlinx.coroutines.e3.e.i(new d(this, aVar, d0Var, (kotlin.c0.d) null));
    }

    public T n() {
        return p();
    }

    public final boolean o() {
        Map<l<T, x>, c<T>> map = this.f9839h;
        k.b(map, "observers");
        return !map.isEmpty();
    }

    public final void r(l<? super T, x> lVar) {
        k.f(lVar, "observer");
        p.a(new g(this, lVar));
    }

    /* access modifiers changed from: protected */
    public void s() {
    }

    /* access modifiers changed from: protected */
    public void t() {
    }

    /* access modifiers changed from: protected */
    public void u(T t) {
    }

    public final void v(l<? super T, x> lVar) {
        k.f(lVar, "observer");
        p.a(new h(this, lVar));
    }

    /* access modifiers changed from: protected */
    public void w(T t) {
        q(t);
    }

    public final LiveData<T> x() {
        return m();
    }
}

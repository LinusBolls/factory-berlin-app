package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.TypeCastException;
import kotlin.c0.g;
import kotlin.jvm.internal.k;
import kotlin.x;
import kotlinx.coroutines.internal.c0;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.p;
import kotlinx.coroutines.s0;

/* compiled from: EventLoop.common.kt */
public abstract class h1 extends i1 implements s0 {

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f10989k;

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f10990l;
    private volatile Object _delayed = null;
    private volatile int _isCompleted = 0;
    private volatile Object _queue = null;

    /* compiled from: EventLoop.common.kt */
    private final class a extends c {

        /* renamed from: j  reason: collision with root package name */
        private final i<x> f10991j;

        public a(long j2, i<? super x> iVar) {
            super(j2);
            this.f10991j = iVar;
        }

        public void run() {
            this.f10991j.f(h1.this, x.a);
        }

        public String toString() {
            return super.toString() + this.f10991j.toString();
        }
    }

    /* compiled from: EventLoop.common.kt */
    private static final class b extends c {

        /* renamed from: j  reason: collision with root package name */
        private final Runnable f10993j;

        public b(long j2, Runnable runnable) {
            super(j2);
            this.f10993j = runnable;
        }

        public void run() {
            this.f10993j.run();
        }

        public String toString() {
            return super.toString() + this.f10993j.toString();
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static abstract class c implements Runnable, Comparable<c>, c1, d0 {

        /* renamed from: g  reason: collision with root package name */
        private Object f10994g;

        /* renamed from: h  reason: collision with root package name */
        private int f10995h = -1;

        /* renamed from: i  reason: collision with root package name */
        public long f10996i;

        public c(long j2) {
            this.f10996i = j2;
        }

        public final synchronized void a() {
            Object obj = this.f10994g;
            if (obj != k1.a) {
                if (!(obj instanceof d)) {
                    obj = null;
                }
                d dVar = (d) obj;
                if (dVar != null) {
                    dVar.g(this);
                }
                this.f10994g = k1.a;
            }
        }

        public void f(int i2) {
            this.f10995h = i2;
        }

        public void h(c0<?> c0Var) {
            if (this.f10994g != k1.a) {
                this.f10994g = c0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public int i() {
            return this.f10995h;
        }

        public c0<?> j() {
            Object obj = this.f10994g;
            if (!(obj instanceof c0)) {
                obj = null;
            }
            return (c0) obj;
        }

        /* renamed from: k */
        public int compareTo(c cVar) {
            int i2 = ((this.f10996i - cVar.f10996i) > 0 ? 1 : ((this.f10996i - cVar.f10996i) == 0 ? 0 : -1));
            if (i2 > 0) {
                return 1;
            }
            return i2 < 0 ? -1 : 0;
        }

        public final synchronized int l(long j2, d dVar, h1 h1Var) {
            if (this.f10994g == k1.a) {
                return 2;
            }
            synchronized (dVar) {
                c cVar = (c) dVar.b();
                if (h1Var.U0()) {
                    return 1;
                }
                if (cVar == null) {
                    dVar.b = j2;
                } else {
                    long j3 = cVar.f10996i;
                    if (j3 - j2 < 0) {
                        j2 = j3;
                    }
                    if (j2 - dVar.b > 0) {
                        dVar.b = j2;
                    }
                }
                if (this.f10996i - dVar.b < 0) {
                    this.f10996i = dVar.b;
                }
                dVar.a(this);
                return 0;
            }
        }

        public final boolean n(long j2) {
            return j2 - this.f10996i >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f10996i + ']';
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static final class d extends c0<c> {
        public long b;

        public d(long j2) {
            this.b = j2;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<h1> cls2 = h1.class;
        f10989k = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f10990l = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    private final void Q0() {
        if (!n0.a() || U0()) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (f10989k.compareAndSet(this, (Object) null, k1.b)) {
                        return;
                    }
                } else if (obj instanceof p) {
                    ((p) obj).d();
                    return;
                } else if (obj != k1.b) {
                    p pVar = new p(8, true);
                    if (obj != null) {
                        pVar.a((Runnable) obj);
                        if (f10989k.compareAndSet(this, obj, pVar)) {
                            return;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    private final Runnable R0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof p) {
                if (obj != null) {
                    p pVar = (p) obj;
                    Object j2 = pVar.j();
                    if (j2 != p.f11024g) {
                        return (Runnable) j2;
                    }
                    f10989k.compareAndSet(this, obj, pVar.i());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == k1.b) {
                return null;
            } else {
                if (f10989k.compareAndSet(this, obj, (Object) null)) {
                    if (obj != null) {
                        return (Runnable) obj;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    private final boolean T0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (U0()) {
                return false;
            }
            if (obj == null) {
                if (f10989k.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof p) {
                if (obj != null) {
                    p pVar = (p) obj;
                    int a2 = pVar.a(runnable);
                    if (a2 == 0) {
                        return true;
                    }
                    if (a2 == 1) {
                        f10989k.compareAndSet(this, obj, pVar.i());
                    } else if (a2 == 2) {
                        return false;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == k1.b) {
                return false;
            } else {
                p pVar2 = new p(8, true);
                if (obj != null) {
                    pVar2.a((Runnable) obj);
                    pVar2.a(runnable);
                    if (f10989k.compareAndSet(this, obj, pVar2)) {
                        return true;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* access modifiers changed from: private */
    public final boolean U0() {
        return this._isCompleted;
    }

    private final void X0() {
        c cVar;
        w2 a2 = x2.a();
        long a3 = a2 != null ? a2.a() : System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            if (dVar != null && (cVar = (c) dVar.i()) != null) {
                N0(a3, cVar);
            } else {
                return;
            }
        }
    }

    private final int a1(long j2, c cVar) {
        if (U0()) {
            return 1;
        }
        d dVar = (d) this._delayed;
        if (dVar == null) {
            f10990l.compareAndSet(this, (Object) null, new d(j2));
            Object obj = this._delayed;
            if (obj != null) {
                dVar = (d) obj;
            } else {
                k.m();
                throw null;
            }
        }
        return cVar.l(j2, dVar, this);
    }

    private final void c1(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    private final boolean d1(c cVar) {
        d dVar = (d) this._delayed;
        return (dVar != null ? (c) dVar.e() : null) == cVar;
    }

    /* access modifiers changed from: protected */
    public long F0() {
        c cVar;
        if (super.F0() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof p) {
                if (!((p) obj).g()) {
                    return 0;
                }
            } else if (obj == k1.b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        d dVar = (d) this._delayed;
        if (dVar == null || (cVar = (c) dVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j2 = cVar.f10996i;
        w2 a2 = x2.a();
        return f.c(j2 - (a2 != null ? a2.a() : System.nanoTime()), 0);
    }

    /* access modifiers changed from: protected */
    public void L0() {
        v2.b.b();
        c1(true);
        Q0();
        do {
        } while (W0() <= 0);
        X0();
    }

    public final void S0(Runnable runnable) {
        if (T0(runnable)) {
            O0();
        } else {
            p0.f11050n.S0(runnable);
        }
    }

    public c1 U(long j2, Runnable runnable) {
        return s0.a.a(this, j2, runnable);
    }

    /* access modifiers changed from: protected */
    public boolean V0() {
        if (!J0()) {
            return false;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof p) {
                return ((p) obj).g();
            }
            if (obj == k1.b) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long W0() {
        /*
            r9 = this;
            boolean r0 = r9.K0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r9._delayed
            kotlinx.coroutines.h1$d r0 = (kotlinx.coroutines.h1.d) r0
            if (r0 == 0) goto L_0x004d
            boolean r3 = r0.d()
            if (r3 != 0) goto L_0x004d
            kotlinx.coroutines.w2 r3 = kotlinx.coroutines.x2.a()
            if (r3 == 0) goto L_0x0020
            long r3 = r3.a()
            goto L_0x0024
        L_0x0020:
            long r3 = java.lang.System.nanoTime()
        L_0x0024:
            monitor-enter(r0)
            kotlinx.coroutines.internal.d0 r5 = r0.b()     // Catch:{ all -> 0x004a }
            r6 = 0
            if (r5 == 0) goto L_0x0044
            kotlinx.coroutines.h1$c r5 = (kotlinx.coroutines.h1.c) r5     // Catch:{ all -> 0x004a }
            boolean r7 = r5.n(r3)     // Catch:{ all -> 0x004a }
            r8 = 0
            if (r7 == 0) goto L_0x003a
            boolean r5 = r9.T0(r5)     // Catch:{ all -> 0x004a }
            goto L_0x003b
        L_0x003a:
            r5 = 0
        L_0x003b:
            if (r5 == 0) goto L_0x0042
            kotlinx.coroutines.internal.d0 r5 = r0.h(r8)     // Catch:{ all -> 0x004a }
            r6 = r5
        L_0x0042:
            monitor-exit(r0)
            goto L_0x0045
        L_0x0044:
            monitor-exit(r0)
        L_0x0045:
            kotlinx.coroutines.h1$c r6 = (kotlinx.coroutines.h1.c) r6
            if (r6 == 0) goto L_0x004d
            goto L_0x0024
        L_0x004a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004d:
            java.lang.Runnable r0 = r9.R0()
            if (r0 == 0) goto L_0x0057
            r0.run()
            return r1
        L_0x0057:
            long r0 = r9.F0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.h1.W0():long");
    }

    /* access modifiers changed from: protected */
    public final void Y0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void Z0(long j2, c cVar) {
        int a1 = a1(j2, cVar);
        if (a1 != 0) {
            if (a1 == 1) {
                N0(j2, cVar);
            } else if (a1 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (d1(cVar)) {
            O0();
        }
    }

    /* access modifiers changed from: protected */
    public final c1 b1(long j2, Runnable runnable) {
        long c2 = k1.c(j2);
        if (c2 >= 4611686018427387903L) {
            return j2.f11034g;
        }
        w2 a2 = x2.a();
        long a3 = a2 != null ? a2.a() : System.nanoTime();
        b bVar = new b(c2 + a3, runnable);
        Z0(a3, bVar);
        return bVar;
    }

    public final void i0(g gVar, Runnable runnable) {
        S0(runnable);
    }

    public void j(long j2, i<? super x> iVar) {
        long c2 = k1.c(j2);
        if (c2 < 4611686018427387903L) {
            w2 a2 = x2.a();
            long a3 = a2 != null ? a2.a() : System.nanoTime();
            a aVar = new a(c2 + a3, iVar);
            l.a(iVar, aVar);
            Z0(a3, aVar);
        }
    }
}

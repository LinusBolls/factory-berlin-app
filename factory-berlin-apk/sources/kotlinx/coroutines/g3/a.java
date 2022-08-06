package kotlinx.coroutines.g3;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.internal.x;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.w2;
import kotlinx.coroutines.x2;

/* compiled from: CoroutineScheduler.kt */
public final class a implements Executor, Closeable {

    /* renamed from: n  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f10944n = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
    static final AtomicLongFieldUpdater o = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
    private static final AtomicIntegerFieldUpdater p = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");
    public static final x q = new x("NOT_IN_STACK");
    private volatile int _isTerminated;
    volatile long controlState;

    /* renamed from: g  reason: collision with root package name */
    public final e f10945g;

    /* renamed from: h  reason: collision with root package name */
    public final e f10946h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReferenceArray<b> f10947i;

    /* renamed from: j  reason: collision with root package name */
    public final int f10948j;

    /* renamed from: k  reason: collision with root package name */
    public final int f10949k;

    /* renamed from: l  reason: collision with root package name */
    public final long f10950l;

    /* renamed from: m  reason: collision with root package name */
    public final String f10951m;
    private volatile long parkedWorkersStack;

    /* renamed from: kotlinx.coroutines.g3.a$a  reason: collision with other inner class name */
    /* compiled from: CoroutineScheduler.kt */
    public static final class C0776a {
        private C0776a() {
        }

        public /* synthetic */ C0776a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    public enum c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    static {
        new C0776a((DefaultConstructorMarker) null);
    }

    public a(int i2, int i3, long j2, String str) {
        this.f10948j = i2;
        this.f10949k = i3;
        this.f10950l = j2;
        this.f10951m = str;
        if (i2 >= 1) {
            if (this.f10949k >= this.f10948j) {
                if (this.f10949k <= 2097150) {
                    if (this.f10950l > 0) {
                        this.f10945g = new e();
                        this.f10946h = new e();
                        this.parkedWorkersStack = 0;
                        this.f10947i = new AtomicReferenceArray<>(this.f10949k + 1);
                        this.controlState = ((long) this.f10948j) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + this.f10950l + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + this.f10949k + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + this.f10949k + " should be greater than or equals to core pool size " + this.f10948j).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + this.f10948j + " should be at least 1").toString());
    }

    private final void L(boolean z) {
        long addAndGet = o.addAndGet(this, 2097152);
        if (!z && !i0() && !Z(addAndGet)) {
            i0();
        }
    }

    private final i U(b bVar, i iVar, boolean z) {
        if (bVar == null || bVar.f10954h == c.TERMINATED) {
            return iVar;
        }
        if (iVar.f10981h.l() == 0 && bVar.f10954h == c.BLOCKING) {
            return iVar;
        }
        bVar.f10958l = true;
        return bVar.f10953g.a(iVar, z);
    }

    private final boolean Z(long j2) {
        if (f.b(((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21)), 0) < this.f10948j) {
            int h2 = h();
            if (h2 == 1 && this.f10948j > 1) {
                h();
            }
            if (h2 > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean b(i iVar) {
        boolean z = true;
        if (iVar.f10981h.l() != 1) {
            z = false;
        }
        if (z) {
            return this.f10946h.a(iVar);
        }
        return this.f10945g.a(iVar);
    }

    static /* synthetic */ boolean b0(a aVar, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = aVar.controlState;
        }
        return aVar.Z(j2);
    }

    private final int h() {
        synchronized (this.f10947i) {
            if (o()) {
                return -1;
            }
            long j2 = this.controlState;
            int i2 = (int) (j2 & 2097151);
            boolean z = false;
            int b2 = f.b(i2 - ((int) ((j2 & 4398044413952L) >> 21)), 0);
            if (b2 >= this.f10948j) {
                return 0;
            }
            if (i2 >= this.f10949k) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 > 0 && this.f10947i.get(i3) == null) {
                b bVar = new b(this, i3);
                this.f10947i.set(i3, bVar);
                if (i3 == ((int) (2097151 & o.incrementAndGet(this)))) {
                    z = true;
                }
                if (z) {
                    bVar.start();
                    int i4 = b2 + 1;
                    return i4;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private final boolean i0() {
        b y;
        do {
            y = y();
            if (y == null) {
                return false;
            }
        } while (!b.f10952n.compareAndSet(y, -1, 0));
        LockSupport.unpark(y);
        return true;
    }

    private final b j() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof b)) {
            currentThread = null;
        }
        b bVar = (b) currentThread;
        if (bVar == null || !k.a(a.this, this)) {
            return null;
        }
        return bVar;
    }

    public static /* synthetic */ void l(a aVar, Runnable runnable, j jVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            jVar = h.f10979h;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        aVar.k(runnable, jVar, z);
    }

    /* access modifiers changed from: private */
    public final int n() {
        return (int) (this.controlState & 2097151);
    }

    private final int q(b bVar) {
        Object g2 = bVar.g();
        while (g2 != q) {
            if (g2 == null) {
                return 0;
            }
            b bVar2 = (b) g2;
            int f2 = bVar2.f();
            if (f2 != 0) {
                return f2;
            }
            g2 = bVar2.g();
        }
        return -1;
    }

    private final b y() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            b bVar = this.f10947i.get((int) (2097151 & j2));
            if (bVar == null) {
                return null;
            }
            long j3 = (2097152 + j2) & -2097152;
            int q2 = q(bVar);
            if (q2 >= 0) {
                if (f10944n.compareAndSet(this, j2, ((long) q2) | j3)) {
                    bVar.o(q);
                    return bVar;
                }
            }
        }
    }

    public final void D(b bVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & -2097152;
            if (i4 == i2) {
                i4 = i3 == 0 ? q(bVar) : i3;
            }
            if (i4 >= 0) {
                if (f10944n.compareAndSet(this, j2, j3 | ((long) i4))) {
                    return;
                }
            }
        }
    }

    public final void F(i iVar) {
        w2 a;
        try {
            iVar.run();
            a = x2.a();
            if (a == null) {
                return;
            }
        } catch (Throwable th) {
            w2 a2 = x2.a();
            if (a2 != null) {
                a2.e();
            }
            throw th;
        }
        a.e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006f, code lost:
        if (r9 != null) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K(long r9) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            kotlinx.coroutines.g3.a$b r0 = r8.j()
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.g3.a$b> r3 = r8.f10947i
            monitor-enter(r3)
            long r4 = r8.controlState     // Catch:{ all -> 0x00b9 }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            if (r2 > r5) goto L_0x005f
            r3 = 1
        L_0x001d:
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.g3.a$b> r4 = r8.f10947i
            java.lang.Object r4 = r4.get(r3)
            if (r4 == 0) goto L_0x005a
            kotlinx.coroutines.g3.a$b r4 = (kotlinx.coroutines.g3.a.b) r4
            if (r4 == r0) goto L_0x0055
        L_0x0029:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L_0x0036
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r9)
            goto L_0x0029
        L_0x0036:
            kotlinx.coroutines.g3.a$c r6 = r4.f10954h
            boolean r7 = kotlinx.coroutines.n0.a()
            if (r7 == 0) goto L_0x004e
            kotlinx.coroutines.g3.a$c r7 = kotlinx.coroutines.g3.a.c.TERMINATED
            if (r6 != r7) goto L_0x0044
            r6 = 1
            goto L_0x0045
        L_0x0044:
            r6 = 0
        L_0x0045:
            if (r6 == 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x004e:
            kotlinx.coroutines.g3.n r4 = r4.f10953g
            kotlinx.coroutines.g3.e r6 = r8.f10946h
            r4.g(r6)
        L_0x0055:
            if (r3 == r5) goto L_0x005f
            int r3 = r3 + 1
            goto L_0x001d
        L_0x005a:
            kotlin.jvm.internal.k.m()
            r9 = 0
            throw r9
        L_0x005f:
            kotlinx.coroutines.g3.e r9 = r8.f10946h
            r9.b()
            kotlinx.coroutines.g3.e r9 = r8.f10945g
            r9.b()
        L_0x0069:
            if (r0 == 0) goto L_0x0072
            kotlinx.coroutines.g3.i r9 = r0.e(r2)
            if (r9 == 0) goto L_0x0072
            goto L_0x007a
        L_0x0072:
            kotlinx.coroutines.g3.e r9 = r8.f10945g
            java.lang.Object r9 = r9.d()
            kotlinx.coroutines.g3.i r9 = (kotlinx.coroutines.g3.i) r9
        L_0x007a:
            if (r9 == 0) goto L_0x007d
            goto L_0x0085
        L_0x007d:
            kotlinx.coroutines.g3.e r9 = r8.f10946h
            java.lang.Object r9 = r9.d()
            kotlinx.coroutines.g3.i r9 = (kotlinx.coroutines.g3.i) r9
        L_0x0085:
            if (r9 == 0) goto L_0x008b
            r8.F(r9)
            goto L_0x0069
        L_0x008b:
            if (r0 == 0) goto L_0x0092
            kotlinx.coroutines.g3.a$c r9 = kotlinx.coroutines.g3.a.c.TERMINATED
            r0.r(r9)
        L_0x0092:
            boolean r9 = kotlinx.coroutines.n0.a()
            if (r9 == 0) goto L_0x00b2
            long r9 = r8.controlState
            r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r9 = r9 & r3
            r0 = 42
            long r9 = r9 >> r0
            int r10 = (int) r9
            int r9 = r8.f10948j
            if (r10 != r9) goto L_0x00a9
            r1 = 1
        L_0x00a9:
            if (r1 == 0) goto L_0x00ac
            goto L_0x00b2
        L_0x00ac:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x00b2:
            r9 = 0
            r8.parkedWorkersStack = r9
            r8.controlState = r9
            return
        L_0x00b9:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.g3.a.K(long):void");
    }

    public final void M() {
        if (!i0() && !b0(this, 0, 1, (Object) null)) {
            i0();
        }
    }

    public void close() {
        K(10000);
    }

    public void execute(Runnable runnable) {
        l(this, runnable, (j) null, false, 6, (Object) null);
    }

    public final i i(Runnable runnable, j jVar) {
        long a = l.f10984e.a();
        if (!(runnable instanceof i)) {
            return new k(runnable, a, jVar);
        }
        i iVar = (i) runnable;
        iVar.f10980g = a;
        iVar.f10981h = jVar;
        return iVar;
    }

    public final void k(Runnable runnable, j jVar, boolean z) {
        w2 a = x2.a();
        if (a != null) {
            a.h();
        }
        i i2 = i(runnable, jVar);
        b j2 = j();
        i U = U(j2, i2, z);
        if (U == null || b(U)) {
            boolean z2 = z && j2 != null;
            if (i2.f10981h.l() != 0) {
                L(z2);
            } else if (!z2) {
                M();
            }
        } else {
            throw new RejectedExecutionException(this.f10951m + " was terminated");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean o() {
        return this._isTerminated;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int length = this.f10947i.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < length; i7++) {
            b bVar = this.f10947i.get(i7);
            if (bVar != null) {
                int f2 = bVar.f10953g.f();
                int i8 = b.a[bVar.f10954h.ordinal()];
                if (i8 == 1) {
                    i4++;
                } else if (i8 == 2) {
                    i3++;
                    arrayList.add(String.valueOf(f2) + "b");
                } else if (i8 == 3) {
                    i2++;
                    arrayList.add(String.valueOf(f2) + "c");
                } else if (i8 == 4) {
                    i5++;
                    if (f2 > 0) {
                        arrayList.add(String.valueOf(f2) + "d");
                    }
                } else if (i8 == 5) {
                    i6++;
                }
            }
        }
        long j2 = this.controlState;
        return this.f10951m + '@' + o0.b(this) + '[' + "Pool Size {" + "core = " + this.f10948j + ", " + "max = " + this.f10949k + "}, " + "Worker States {" + "CPU = " + i2 + ", " + "blocking = " + i3 + ", " + "parked = " + i4 + ", " + "dormant = " + i5 + ", " + "terminated = " + i6 + "}, " + "running workers queues = " + arrayList + ", " + "global CPU queue size = " + this.f10945g.c() + ", " + "global blocking queue size = " + this.f10946h.c() + ", " + "Control State {" + "created workers= " + ((int) (2097151 & j2)) + ", " + "blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", " + "CPUs acquired = " + (this.f10948j - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }

    public final boolean z(b bVar) {
        long j2;
        long j3;
        int f2;
        if (bVar.g() != q) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            int i2 = (int) (2097151 & j2);
            j3 = (2097152 + j2) & -2097152;
            f2 = bVar.f();
            if (n0.a()) {
                if (!(f2 != 0)) {
                    throw new AssertionError();
                }
            }
            bVar.o(this.f10947i.get(i2));
        } while (!f10944n.compareAndSet(this, j2, ((long) f2) | j3));
        return true;
    }

    /* compiled from: CoroutineScheduler.kt */
    public final class b extends Thread {

        /* renamed from: n  reason: collision with root package name */
        static final AtomicIntegerFieldUpdater f10952n = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl");

        /* renamed from: g  reason: collision with root package name */
        public final n f10953g;

        /* renamed from: h  reason: collision with root package name */
        public c f10954h;

        /* renamed from: i  reason: collision with root package name */
        private long f10955i;
        private volatile int indexInArray;

        /* renamed from: j  reason: collision with root package name */
        private long f10956j;

        /* renamed from: k  reason: collision with root package name */
        private int f10957k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f10958l;
        private volatile Object nextParkedWorker;
        volatile int workerCtl;

        private b() {
            setDaemon(true);
            this.f10953g = new n();
            this.f10954h = c.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.q;
            this.f10957k = kotlin.f0.c.b.b();
        }

        private final void a(int i2) {
            if (i2 != 0) {
                a.o.addAndGet(a.this, -2097152);
                c cVar = this.f10954h;
                if (cVar != c.TERMINATED) {
                    if (n0.a()) {
                        if (!(cVar == c.BLOCKING)) {
                            throw new AssertionError();
                        }
                    }
                    this.f10954h = c.DORMANT;
                }
            }
        }

        private final void b(int i2) {
            if (i2 != 0 && r(c.BLOCKING)) {
                a.this.M();
            }
        }

        private final void c(i iVar) {
            int l2 = iVar.f10981h.l();
            h(l2);
            b(l2);
            a.this.F(iVar);
            a(l2);
        }

        private final i d(boolean z) {
            i l2;
            i l3;
            if (z) {
                boolean z2 = j(a.this.f10948j * 2) == 0;
                if (z2 && (l3 = l()) != null) {
                    return l3;
                }
                i h2 = this.f10953g.h();
                if (h2 != null) {
                    return h2;
                }
                if (!z2 && (l2 = l()) != null) {
                    return l2;
                }
            } else {
                i l4 = l();
                if (l4 != null) {
                    return l4;
                }
            }
            return s(false);
        }

        private final void h(int i2) {
            this.f10955i = 0;
            if (this.f10954h == c.PARKING) {
                if (n0.a()) {
                    boolean z = true;
                    if (i2 != 1) {
                        z = false;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                this.f10954h = c.BLOCKING;
            }
        }

        private final boolean i() {
            return this.nextParkedWorker != a.q;
        }

        private final void k() {
            if (this.f10955i == 0) {
                this.f10955i = System.nanoTime() + a.this.f10950l;
            }
            LockSupport.parkNanos(a.this.f10950l);
            if (System.nanoTime() - this.f10955i >= 0) {
                this.f10955i = 0;
                t();
            }
        }

        private final i l() {
            if (j(2) == 0) {
                i iVar = (i) a.this.f10945g.d();
                if (iVar != null) {
                    return iVar;
                }
                return (i) a.this.f10946h.d();
            }
            i iVar2 = (i) a.this.f10946h.d();
            if (iVar2 != null) {
                return iVar2;
            }
            return (i) a.this.f10945g.d();
        }

        private final void m() {
            loop0:
            while (true) {
                boolean z = false;
                while (!a.this.o() && this.f10954h != c.TERMINATED) {
                    i e2 = e(this.f10958l);
                    if (e2 != null) {
                        this.f10956j = 0;
                        c(e2);
                    } else {
                        this.f10958l = false;
                        if (this.f10956j == 0) {
                            q();
                        } else if (!z) {
                            z = true;
                        } else {
                            r(c.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f10956j);
                            this.f10956j = 0;
                        }
                    }
                }
            }
            r(c.TERMINATED);
        }

        private final boolean p() {
            boolean z;
            if (this.f10954h != c.CPU_ACQUIRED) {
                a aVar = a.this;
                while (true) {
                    long j2 = aVar.controlState;
                    if (((int) ((9223367638808264704L & j2) >> 42)) != 0) {
                        if (a.o.compareAndSet(aVar, j2, j2 - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f10954h = c.CPU_ACQUIRED;
            }
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.z(this);
                return;
            }
            if (n0.a()) {
                if (!(this.f10953g.f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (i() && !a.this.o() && this.f10954h != c.TERMINATED) {
                r(c.PARKING);
                Thread.interrupted();
                k();
            }
        }

        private final i s(boolean z) {
            long j2;
            if (n0.a()) {
                if (!(this.f10953g.f() == 0)) {
                    throw new AssertionError();
                }
            }
            int a = a.this.n();
            if (a < 2) {
                return null;
            }
            int j3 = j(a);
            long j4 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < a; i2++) {
                j3++;
                if (j3 > a) {
                    j3 = 1;
                }
                b bVar = a.this.f10947i.get(j3);
                if (!(bVar == null || bVar == this)) {
                    if (n0.a()) {
                        if (!(this.f10953g.f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    if (z) {
                        j2 = this.f10953g.k(bVar.f10953g);
                    } else {
                        j2 = this.f10953g.l(bVar.f10953g);
                    }
                    if (j2 == -1) {
                        return this.f10953g.h();
                    }
                    if (j2 > 0) {
                        j4 = Math.min(j4, j2);
                    }
                }
            }
            if (j4 == Long.MAX_VALUE) {
                j4 = 0;
            }
            this.f10956j = j4;
            return null;
        }

        private final void t() {
            synchronized (a.this.f10947i) {
                if (!a.this.o()) {
                    if (a.this.n() > a.this.f10948j) {
                        if (f10952n.compareAndSet(this, -1, 1)) {
                            int i2 = this.indexInArray;
                            n(0);
                            a.this.D(this, i2, 0);
                            int andDecrement = (int) (a.o.getAndDecrement(a.this) & 2097151);
                            if (andDecrement != i2) {
                                b bVar = a.this.f10947i.get(andDecrement);
                                if (bVar != null) {
                                    b bVar2 = bVar;
                                    a.this.f10947i.set(i2, bVar2);
                                    bVar2.n(i2);
                                    a.this.D(bVar2, andDecrement, i2);
                                } else {
                                    k.m();
                                    throw null;
                                }
                            }
                            a.this.f10947i.set(andDecrement, (Object) null);
                            kotlin.x xVar = kotlin.x.a;
                            this.f10954h = c.TERMINATED;
                        }
                    }
                }
            }
        }

        public final i e(boolean z) {
            i iVar;
            if (p()) {
                return d(z);
            }
            if (z) {
                iVar = this.f10953g.h();
                if (iVar == null) {
                    iVar = (i) a.this.f10946h.d();
                }
            } else {
                iVar = (i) a.this.f10946h.d();
            }
            return iVar != null ? iVar : s(true);
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i2) {
            int i3 = this.f10957k;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f10957k = i6;
            int i7 = i2 - 1;
            if ((i7 & i2) == 0) {
                return i6 & i7;
            }
            return (i6 & Integer.MAX_VALUE) % i2;
        }

        public final void n(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f10951m);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(c cVar) {
            c cVar2 = this.f10954h;
            boolean z = cVar2 == c.CPU_ACQUIRED;
            if (z) {
                a.o.addAndGet(a.this, 4398046511104L);
            }
            if (cVar2 != cVar) {
                this.f10954h = cVar;
            }
            return z;
        }

        public void run() {
            m();
        }

        public b(a aVar, int i2) {
            this();
            n(i2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, int i3, long j2, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, (i4 & 4) != 0 ? l.f10983d : j2, (i4 & 8) != 0 ? "DefaultDispatcher" : str);
    }
}

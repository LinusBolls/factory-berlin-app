package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.n0;

/* compiled from: LockFreeTaskQueue.kt */
public final class p<E> {

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f11022e;

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f11023f;

    /* renamed from: g  reason: collision with root package name */
    public static final x f11024g = new x("REMOVE_FROZEN");

    /* renamed from: h  reason: collision with root package name */
    public static final a f11025h = new a((DefaultConstructorMarker) null);
    private volatile Object _next = null;
    private volatile long _state = 0;
    private final int a;
    private AtomicReferenceArray b = new AtomicReferenceArray(this.c);
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11026d;

    /* compiled from: LockFreeTaskQueue.kt */
    public static final class a {
        private a() {
        }

        public final int a(long j2) {
            return (j2 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j2, int i2) {
            return d(j2, 1073741823) | (((long) i2) << 0);
        }

        public final long c(long j2, int i2) {
            return d(j2, 1152921503533105152L) | (((long) i2) << 30);
        }

        public final long d(long j2, long j3) {
            return j2 & (~j3);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    public static final class b {
        public final int a;

        public b(int i2) {
            this.a = i2;
        }
    }

    static {
        Class<p> cls = p.class;
        f11022e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f11023f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public p(int i2, boolean z) {
        this.c = i2;
        this.f11026d = z;
        boolean z2 = true;
        this.a = i2 - 1;
        if (this.a <= 1073741823) {
            if (!((this.c & this.a) != 0 ? false : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final p<E> b(long j2) {
        p<E> pVar = new p<>(this.c * 2, this.f11026d);
        int i2 = (int) ((1073741823 & j2) >> 0);
        int i3 = (int) ((1152921503533105152L & j2) >> 30);
        while (true) {
            int i4 = this.a;
            if ((i2 & i4) != (i3 & i4)) {
                Object obj = this.b.get(i4 & i2);
                if (obj == null) {
                    obj = new b(i2);
                }
                pVar.b.set(pVar.a & i2, obj);
                i2++;
            } else {
                pVar._state = f11025h.d(j2, 1152921504606846976L);
                return pVar;
            }
        }
    }

    private final p<E> c(long j2) {
        while (true) {
            p<E> pVar = (p) this._next;
            if (pVar != null) {
                return pVar;
            }
            f11022e.compareAndSet(this, (Object) null, b(j2));
        }
    }

    private final p<E> e(int i2, E e2) {
        Object obj = this.b.get(this.a & i2);
        if (!(obj instanceof b) || ((b) obj).a != i2) {
            return null;
        }
        this.b.set(i2 & this.a, e2);
        return this;
    }

    private final long h() {
        long j2;
        long j3;
        do {
            j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                return j2;
            }
            j3 = j2 | 1152921504606846976L;
        } while (!f11023f.compareAndSet(this, j2, j3));
        return j3;
    }

    private final p<E> k(int i2, int i3) {
        long j2;
        int i4;
        do {
            j2 = this._state;
            boolean z = false;
            i4 = (int) ((1073741823 & j2) >> 0);
            if (n0.a()) {
                if (i4 == i2) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j2) != 0) {
                return i();
            }
        } while (!f11023f.compareAndSet(this, j2, f11025h.b(j2, i3)));
        this.b.set(this.a & i4, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068 A[LOOP:1: B:19:0x0068->B:22:0x007a, LOOP_START, PHI: r0 
      PHI: (r0v15 kotlinx.coroutines.internal.p) = (r0v14 kotlinx.coroutines.internal.p), (r0v17 kotlinx.coroutines.internal.p) binds: [B:18:0x0060, B:22:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(E r13) {
        /*
            r12 = this;
        L_0x0000:
            long r2 = r12._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0012
            kotlinx.coroutines.internal.p$a r13 = f11025h
            int r13 = r13.a(r2)
            return r13
        L_0x0012:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r8 = 0
            long r0 = r0 >> r8
            int r1 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r0 = 30
            long r4 = r4 >> r0
            int r9 = (int) r4
            int r10 = r12.a
            int r0 = r9 + 2
            r0 = r0 & r10
            r4 = r1 & r10
            r5 = 1
            if (r0 != r4) goto L_0x002e
            return r5
        L_0x002e:
            boolean r0 = r12.f11026d
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 != 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.b
            r11 = r9 & r10
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto L_0x004d
            int r0 = r12.c
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L_0x004c
            int r9 = r9 - r1
            r1 = r9 & r4
            int r0 = r0 >> 1
            if (r1 <= r0) goto L_0x0000
        L_0x004c:
            return r5
        L_0x004d:
            int r0 = r9 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f11023f
            kotlinx.coroutines.internal.p$a r4 = f11025h
            long r4 = r4.c(r2, r0)
            r0 = r1
            r1 = r12
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.b
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L_0x0068:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0072
            goto L_0x007d
        L_0x0072:
            kotlinx.coroutines.internal.p r0 = r0.i()
            kotlinx.coroutines.internal.p r0 = r0.e(r9, r13)
            if (r0 == 0) goto L_0x007d
            goto L_0x0068
        L_0x007d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.p.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!f11023f.compareAndSet(this, j2, j2 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j2 = this._state;
        return 1073741823 & (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j2) >> 0)));
    }

    public final boolean g() {
        long j2 = this._state;
        return ((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30));
    }

    public final p<E> i() {
        return c(h());
    }

    public final Object j() {
        while (true) {
            long j2 = this._state;
            if ((1152921504606846976L & j2) != 0) {
                return f11024g;
            }
            int i2 = (int) ((1073741823 & j2) >> 0);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i4 = this.a;
            if ((i3 & i4) == (i2 & i4)) {
                return null;
            }
            Object obj = this.b.get(i4 & i2);
            if (obj == null) {
                if (this.f11026d) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i5 = (i2 + 1) & 1073741823;
                if (f11023f.compareAndSet(this, j2, f11025h.b(j2, i5))) {
                    this.b.set(this.a & i2, (Object) null);
                    return obj;
                } else if (this.f11026d) {
                    p pVar = this;
                    do {
                        pVar = pVar.k(i2, i5);
                    } while (pVar != null);
                    return obj;
                }
            }
        }
    }
}

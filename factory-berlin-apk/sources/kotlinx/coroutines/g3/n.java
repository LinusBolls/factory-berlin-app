package kotlinx.coroutines.g3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.n0;

/* compiled from: WorkQueue.kt */
public final class n {
    private static final AtomicReferenceFieldUpdater b;
    private static final AtomicIntegerFieldUpdater c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f10985d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f10986e;
    private final AtomicReferenceArray<i> a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer = 0;
    private volatile int consumerIndex = 0;
    private volatile Object lastScheduledTask = null;
    private volatile int producerIndex = 0;

    static {
        Class<n> cls = n.class;
        b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f10985d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f10986e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public static /* synthetic */ i b(n nVar, i iVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return nVar.a(iVar, z);
    }

    private final i c(i iVar) {
        boolean z = true;
        if (iVar.f10981h.l() != 1) {
            z = false;
        }
        if (z) {
            f10986e.incrementAndGet(this);
        }
        if (e() == 127) {
            return iVar;
        }
        int i2 = this.producerIndex & 127;
        while (this.a.get(i2) != null) {
            Thread.yield();
        }
        this.a.lazySet(i2, iVar);
        c.incrementAndGet(this);
        return null;
    }

    private final void d(i iVar) {
        if (iVar != null) {
            boolean z = false;
            if (iVar.f10981h.l() == 1) {
                int decrementAndGet = f10986e.decrementAndGet(this);
                if (n0.a()) {
                    if (decrementAndGet >= 0) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    private final i i() {
        i andSet;
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (f10985d.compareAndSet(this, i2, i2 + 1) && (andSet = this.a.getAndSet(i3, (Object) null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(e eVar) {
        i i2 = i();
        if (i2 == null) {
            return false;
        }
        eVar.a(i2);
        return true;
    }

    private final long m(n nVar, boolean z) {
        i iVar;
        do {
            iVar = (i) nVar.lastScheduledTask;
            if (iVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (iVar.f10981h.l() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a2 = l.f10984e.a() - iVar.f10980g;
            long j2 = l.a;
            if (a2 < j2) {
                return j2 - a2;
            }
        } while (!b.compareAndSet(nVar, iVar, (Object) null));
        b(this, iVar, false, 2, (Object) null);
        return -1;
    }

    public final i a(i iVar, boolean z) {
        if (z) {
            return c(iVar);
        }
        i iVar2 = (i) b.getAndSet(this, iVar);
        if (iVar2 != null) {
            return c(iVar2);
        }
        return null;
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(e eVar) {
        i iVar = (i) b.getAndSet(this, (Object) null);
        if (iVar != null) {
            eVar.a(iVar);
        }
        do {
        } while (j(eVar));
    }

    public final i h() {
        i iVar = (i) b.getAndSet(this, (Object) null);
        return iVar != null ? iVar : i();
    }

    public final long k(n nVar) {
        if (n0.a()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        int i2 = nVar.producerIndex;
        AtomicReferenceArray<i> atomicReferenceArray = nVar.a;
        for (int i3 = nVar.consumerIndex; i3 != i2; i3++) {
            int i4 = i3 & 127;
            if (nVar.blockingTasksInBuffer == 0) {
                break;
            }
            i iVar = atomicReferenceArray.get(i4);
            if (iVar != null) {
                if ((iVar.f10981h.l() == 1) && atomicReferenceArray.compareAndSet(i4, iVar, (Object) null)) {
                    f10986e.decrementAndGet(nVar);
                    b(this, iVar, false, 2, (Object) null);
                    return -1;
                }
            }
        }
        return m(nVar, true);
    }

    public final long l(n nVar) {
        boolean z = true;
        if (n0.a()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        i i2 = nVar.i();
        if (i2 == null) {
            return m(nVar, false);
        }
        i b2 = b(this, i2, false, 2, (Object) null);
        if (!n0.a()) {
            return -1;
        }
        if (b2 != null) {
            z = false;
        }
        if (z) {
            return -1;
        }
        throw new AssertionError();
    }
}

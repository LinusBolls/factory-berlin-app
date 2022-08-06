package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
public class o<E> {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_cur");
    private volatile Object _cur;

    public o(boolean z) {
        this._cur = new p(8, z);
    }

    public final boolean a(E e2) {
        while (true) {
            p pVar = (p) this._cur;
            int a2 = pVar.a(e2);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                a.compareAndSet(this, pVar, pVar.i());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            p pVar = (p) this._cur;
            if (!pVar.d()) {
                a.compareAndSet(this, pVar, pVar.i());
            } else {
                return;
            }
        }
    }

    public final int c() {
        return ((p) this._cur).f();
    }

    public final E d() {
        while (true) {
            p pVar = (p) this._cur;
            E j2 = pVar.j();
            if (j2 != p.f11024g) {
                return j2;
            }
            a.compareAndSet(this, pVar, pVar.i());
        }
    }
}

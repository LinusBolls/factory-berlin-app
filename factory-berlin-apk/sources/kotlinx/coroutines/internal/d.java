package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.n0;

/* compiled from: Atomic.kt */
public abstract class d<T> extends t {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_consensus");
    private volatile Object _consensus = c.a;

    public d<?> a() {
        return this;
    }

    public final Object c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == c.a) {
            obj2 = e(h(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(T t, Object obj);

    public final Object e(Object obj) {
        if (n0.a()) {
            if (!(obj != c.a)) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        if (obj2 != c.a) {
            return obj2;
        }
        if (a.compareAndSet(this, c.a, obj)) {
            return obj;
        }
        return this._consensus;
    }

    public long f() {
        return 0;
    }

    public final boolean g() {
        return this._consensus != c.a;
    }

    public abstract Object h(T t);
}

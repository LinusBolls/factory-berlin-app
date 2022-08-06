package kotlin.a0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.z.a;

/* compiled from: AbstractIterator.kt */
public abstract class c<T> implements Iterator<T>, a {

    /* renamed from: g  reason: collision with root package name */
    private k0 f10573g = k0.NotReady;

    /* renamed from: h  reason: collision with root package name */
    private T f10574h;

    private final boolean e() {
        this.f10573g = k0.Failed;
        a();
        return this.f10573g == k0.Ready;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public final void c() {
        this.f10573g = k0.Done;
    }

    /* access modifiers changed from: protected */
    public final void d(T t) {
        this.f10574h = t;
        this.f10573g = k0.Ready;
    }

    public boolean hasNext() {
        if (this.f10573g != k0.Failed) {
            int i2 = b.a[this.f10573g.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 != 2) {
                return e();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public T next() {
        if (hasNext()) {
            this.f10573g = k0.NotReady;
            return this.f10574h;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

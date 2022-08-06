package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayIterator.kt */
final class a<T> implements Iterator<T>, kotlin.jvm.internal.z.a {

    /* renamed from: g  reason: collision with root package name */
    private int f10667g;

    /* renamed from: h  reason: collision with root package name */
    private final T[] f10668h;

    public a(T[] tArr) {
        k.e(tArr, "array");
        this.f10668h = tArr;
    }

    public boolean hasNext() {
        return this.f10667g < this.f10668h.length;
    }

    public T next() {
        try {
            T[] tArr = this.f10668h;
            int i2 = this.f10667g;
            this.f10667g = i2 + 1;
            return tArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f10667g--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

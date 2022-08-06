package kotlin.a0;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.z.a;

/* compiled from: Collections.kt */
final class e<T> implements Collection<T>, a {

    /* renamed from: g  reason: collision with root package name */
    private final T[] f10582g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f10583h;

    public e(T[] tArr, boolean z) {
        k.e(tArr, "values");
        this.f10582g = tArr;
        this.f10583h = z;
    }

    public int a() {
        return this.f10582g.length;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return j.o(this.f10582g, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        k.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f10582g.length == 0;
    }

    public Iterator<T> iterator() {
        return b.a(this.f10582g);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return a();
    }

    public final Object[] toArray() {
        return m.a(this.f10582g, this.f10583h);
    }

    public <T> T[] toArray(T[] tArr) {
        return f.b(this, tArr);
    }
}

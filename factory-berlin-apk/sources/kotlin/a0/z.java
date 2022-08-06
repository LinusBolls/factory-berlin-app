package kotlin.a0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.z.a;

/* compiled from: Sets.kt */
public final class z implements Set, Serializable, a {

    /* renamed from: g  reason: collision with root package name */
    public static final z f10592g = new z();

    private z() {
    }

    public boolean a(Void voidR) {
        k.e(voidR, "element");
        return false;
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return a((Void) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        k.e(collection, "elements");
        return collection.isEmpty();
    }

    public int d() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return w.f10589g;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return d();
    }

    public Object[] toArray() {
        return f.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return f.b(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}

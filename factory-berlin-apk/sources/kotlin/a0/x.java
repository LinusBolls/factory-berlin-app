package kotlin.a0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.z.a;

/* compiled from: Collections.kt */
public final class x implements List, Serializable, RandomAccess, a {

    /* renamed from: g  reason: collision with root package name */
    public static final x f10590g = new x();

    private x() {
    }

    public boolean a(Void voidR) {
        k.e(voidR, "element");
        return false;
    }

    public /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i2, Collection collection) {
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

    public Void d(int i2) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i2 + '.');
    }

    public int e() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public int g(Void voidR) {
        k.e(voidR, "element");
        return -1;
    }

    public /* bridge */ /* synthetic */ Object get(int i2) {
        d(i2);
        throw null;
    }

    public int hashCode() {
        return 1;
    }

    public int i(Void voidR) {
        k.e(voidR, "element");
        return -1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return g((Void) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return w.f10589g;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return i((Void) obj);
        }
        return -1;
    }

    public ListIterator listIterator() {
        return w.f10589g;
    }

    public /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return e();
    }

    public List subList(int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3);
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

    public ListIterator listIterator(int i2) {
        if (i2 == 0) {
            return w.f10589g;
        }
        throw new IndexOutOfBoundsException("Index: " + i2);
    }
}

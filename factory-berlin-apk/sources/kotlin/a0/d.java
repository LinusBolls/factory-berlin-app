package kotlin.a0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.k;

/* compiled from: AbstractList.kt */
public abstract class d<E> extends a<E> implements List<E>, kotlin.jvm.internal.z.a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f10575g = new a((DefaultConstructorMarker) null);

    /* compiled from: AbstractList.kt */
    public static final class a {
        private a() {
        }

        public final void a(int i2, int i3, int i4) {
            if (i2 < 0 || i3 > i4) {
                throw new IndexOutOfBoundsException("startIndex: " + i2 + ", endIndex: " + i3 + ", size: " + i4);
            } else if (i2 > i3) {
                throw new IllegalArgumentException("startIndex: " + i2 + " > endIndex: " + i3);
            }
        }

        public final void b(int i2, int i3) {
            if (i2 < 0 || i2 >= i3) {
                throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
            }
        }

        public final void c(int i2, int i3) {
            if (i2 < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
            }
        }

        public final void d(int i2, int i3, int i4) {
            if (i2 < 0 || i3 > i4) {
                throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
            } else if (i2 > i3) {
                throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
            }
        }

        public final boolean e(Collection<?> collection, Collection<?> collection2) {
            k.e(collection, "c");
            k.e(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            for (Object a : collection) {
                if (!k.a(a, it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int f(Collection<?> collection) {
            k.e(collection, "c");
            Iterator<?> it = collection.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i2 = (i2 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i2;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AbstractList.kt */
    private class b implements Iterator<E>, kotlin.jvm.internal.z.a {

        /* renamed from: g  reason: collision with root package name */
        private int f10576g;

        public b() {
        }

        /* access modifiers changed from: protected */
        public final int a() {
            return this.f10576g;
        }

        /* access modifiers changed from: protected */
        public final void c(int i2) {
            this.f10576g = i2;
        }

        public boolean hasNext() {
            return this.f10576g < d.this.size();
        }

        public E next() {
            if (hasNext()) {
                d dVar = d.this;
                int i2 = this.f10576g;
                this.f10576g = i2 + 1;
                return dVar.get(i2);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    private class c extends d<E>.defpackage.b implements ListIterator<E>, kotlin.jvm.internal.z.a {
        public c(int i2) {
            super();
            d.f10575g.c(i2, d.this.size());
            c(i2);
        }

        public void add(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return a() > 0;
        }

        public int nextIndex() {
            return a();
        }

        public E previous() {
            if (hasPrevious()) {
                d dVar = d.this;
                c(a() - 1);
                return dVar.get(a());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return a() - 1;
        }

        public void set(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.a0.d$d  reason: collision with other inner class name */
    /* compiled from: AbstractList.kt */
    private static final class C0755d<E> extends d<E> implements RandomAccess {

        /* renamed from: h  reason: collision with root package name */
        private int f10579h;

        /* renamed from: i  reason: collision with root package name */
        private final d<E> f10580i;

        /* renamed from: j  reason: collision with root package name */
        private final int f10581j;

        public C0755d(d<? extends E> dVar, int i2, int i3) {
            k.e(dVar, "list");
            this.f10580i = dVar;
            this.f10581j = i2;
            d.f10575g.d(i2, i3, dVar.size());
            this.f10579h = i3 - this.f10581j;
        }

        public int a() {
            return this.f10579h;
        }

        public E get(int i2) {
            d.f10575g.b(i2, this.f10579h);
            return this.f10580i.get(this.f10581j + i2);
        }
    }

    protected d() {
    }

    public void add(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f10575g.e(this, (Collection) obj);
    }

    public abstract E get(int i2);

    public int hashCode() {
        return f10575g.f(this);
    }

    public int indexOf(Object obj) {
        int i2 = 0;
        for (Object a2 : this) {
            if (k.a(a2, obj)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (k.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new c(0);
    }

    public E remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i2, int i3) {
        return new C0755d(this, i2, i3);
    }

    public ListIterator<E> listIterator(int i2) {
        return new c(i2);
    }
}

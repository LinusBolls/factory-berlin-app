package com.google.android.gms.internal.measurement;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public abstract class b4<E> extends c4<E> implements List<E>, RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    private static final b5<Object> f2241h = new e4(r4.f2508k, 0);

    b4() {
    }

    public static <E> b4<E> l(E e2) {
        Object[] objArr = {e2};
        for (int i2 = 0; i2 <= 0; i2++) {
            o4.a(objArr[0], 0);
        }
        return n(objArr, 1);
    }

    static <E> b4<E> m(Object[] objArr) {
        return n(objArr, objArr.length);
    }

    static <E> b4<E> n(Object[] objArr, int i2) {
        if (i2 == 0) {
            return r4.f2508k;
        }
        return new r4(objArr, i2);
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    @Deprecated
    public final void add(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: d */
    public final y4<E> iterator() {
        return (b5) listIterator();
    }

    public boolean equals(@NullableDecl Object obj) {
        b3.b(this);
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i2 = 0;
                    while (i2 < size) {
                        if (z2.a(get(i2), list.get(i2))) {
                            i2++;
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (i3 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object obj2 = get(i3);
                        i3++;
                        if (!z2.a(obj2, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = ~(~((i2 * 31) + get(i3).hashCode()));
        }
        return i2;
    }

    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        int i2 = 0;
        if (obj == null) {
            while (i2 < size) {
                if (get(i2) == null) {
                    return i2;
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                if (obj.equals(get(i2))) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public b4<E> subList(int i2, int i3) {
        b3.e(i2, i3, size());
        int i4 = i3 - i2;
        if (i4 == size()) {
            return this;
        }
        if (i4 == 0) {
            return r4.f2508k;
        }
        return new d4(this, i2, i4);
    }

    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        if (obj == null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = size() - 1; size2 >= 0; size2--) {
                if (obj.equals(get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    public /* synthetic */ ListIterator listIterator(int i2) {
        b3.g(i2, size());
        if (isEmpty()) {
            return f2241h;
        }
        return new e4(this, i2);
    }

    @Deprecated
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ ListIterator listIterator() {
        return (b5) listIterator(0);
    }
}

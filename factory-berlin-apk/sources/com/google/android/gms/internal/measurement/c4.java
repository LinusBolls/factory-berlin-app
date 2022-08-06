package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public abstract class c4<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private static final Object[] f2250g = new Object[0];

    c4() {
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i2) {
        y4 y4Var = (y4) iterator();
        while (y4Var.hasNext()) {
            objArr[i2] = y4Var.next();
            i2++;
        }
        return i2;
    }

    @Deprecated
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@NullableDecl Object obj);

    /* renamed from: d */
    public abstract y4<E> iterator();

    /* access modifiers changed from: package-private */
    @NullableDecl
    public Object[] e() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean j();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f2250g);
    }

    public final <T> T[] toArray(T[] tArr) {
        b3.b(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] e2 = e();
            if (e2 != null) {
                return Arrays.copyOfRange(e2, g(), i(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }
}

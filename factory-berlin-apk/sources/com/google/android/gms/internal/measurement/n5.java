package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
abstract class n5<E> extends AbstractList<E> implements h7<E> {

    /* renamed from: g  reason: collision with root package name */
    private boolean f2437g = true;

    n5() {
    }

    public final void B() {
        this.f2437g = false;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (!this.f2437g) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(E e2) {
        a();
        return super.add(e2);
    }

    public boolean addAll(Collection<? extends E> collection) {
        a();
        return super.addAll(collection);
    }

    public boolean b() {
        return this.f2437g;
    }

    public void clear() {
        a();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!get(i2).equals(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + get(i3).hashCode();
        }
        return i2;
    }

    public boolean remove(Object obj) {
        a();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        a();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        a();
        return super.retainAll(collection);
    }

    public boolean addAll(int i2, Collection<? extends E> collection) {
        a();
        return super.addAll(i2, collection);
    }
}

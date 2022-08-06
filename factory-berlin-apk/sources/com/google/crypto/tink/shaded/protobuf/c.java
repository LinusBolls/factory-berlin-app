package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: AbstractProtobufList */
abstract class c<E> extends AbstractList<E> implements a0.i<E> {

    /* renamed from: g  reason: collision with root package name */
    private boolean f3712g = true;

    c() {
    }

    public boolean O() {
        return this.f3712g;
    }

    /* access modifiers changed from: protected */
    public void a() {
        if (!this.f3712g) {
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

    public final void t() {
        this.f3712g = false;
    }

    public boolean addAll(int i2, Collection<? extends E> collection) {
        a();
        return super.addAll(i2, collection);
    }
}

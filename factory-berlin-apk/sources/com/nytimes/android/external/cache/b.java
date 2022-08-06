package com.nytimes.android.external.cache;

import java.util.NoSuchElementException;

/* compiled from: AbstractSequentialIterator */
public abstract class b<T> extends w<T> {

    /* renamed from: g  reason: collision with root package name */
    private T f4635g;

    protected b(T t) {
        this.f4635g = t;
    }

    /* access modifiers changed from: protected */
    public abstract T a(T t);

    public final boolean hasNext() {
        return this.f4635g != null;
    }

    public final T next() {
        if (hasNext()) {
            try {
                return this.f4635g;
            } finally {
                this.f4635g = a(this.f4635g);
            }
        } else {
            throw new NoSuchElementException();
        }
    }
}

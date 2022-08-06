package com.nytimes.android.external.cache;

import java.util.Iterator;

/* compiled from: UnmodifiableIterator */
public abstract class w<E> implements Iterator<E> {
    protected w() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

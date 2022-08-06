package com.squareup.moshi.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.g;
import com.squareup.moshi.l;

public final class NullSafeJsonAdapter<T> extends JsonAdapter<T> {
    private final JsonAdapter<T> delegate;

    public NullSafeJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.delegate = jsonAdapter;
    }

    public T b(g gVar) {
        if (gVar.y() == g.c.NULL) {
            return gVar.B0();
        }
        return this.delegate.b(gVar);
    }

    public void h(l lVar, T t) {
        if (t == null) {
            lVar.o();
        } else {
            this.delegate.h(lVar, t);
        }
    }

    public String toString() {
        return this.delegate + ".nullSafe()";
    }
}

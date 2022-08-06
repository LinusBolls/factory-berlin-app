package com.squareup.moshi.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.g;
import com.squareup.moshi.l;

public final class NonNullJsonAdapter<T> extends JsonAdapter<T> {
    private final JsonAdapter<T> delegate;

    public NonNullJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.delegate = jsonAdapter;
    }

    public T b(g gVar) {
        if (gVar.y() != g.c.NULL) {
            return this.delegate.b(gVar);
        }
        throw new JsonDataException("Unexpected null at " + gVar.getPath());
    }

    public void h(l lVar, T t) {
        if (t != null) {
            this.delegate.h(lVar, t);
            return;
        }
        throw new JsonDataException("Unexpected null at " + lVar.getPath());
    }

    public String toString() {
        return this.delegate + ".nonNull()";
    }
}

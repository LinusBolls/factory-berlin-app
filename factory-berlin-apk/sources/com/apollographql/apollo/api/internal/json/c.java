package com.apollographql.apollo.api.internal.json;

import java.io.Closeable;

/* compiled from: JsonReader.kt */
public interface c extends Closeable {

    /* compiled from: JsonReader.kt */
    public enum a {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    <T> T B0();

    c X();

    boolean hasNext();

    c k0();

    boolean nextBoolean();

    String nextName();

    String nextString();

    c o0();

    a peek();

    void skipValue();

    c z0();
}

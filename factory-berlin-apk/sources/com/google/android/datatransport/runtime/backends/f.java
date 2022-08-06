package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.a;
import com.google.auto.value.AutoValue;
import g.b.a.a.i.h;

@AutoValue
/* compiled from: BackendRequest */
public abstract class f {

    @AutoValue.Builder
    /* compiled from: BackendRequest */
    public static abstract class a {
        public abstract f a();

        public abstract a b(Iterable<h> iterable);

        public abstract a c(byte[] bArr);
    }

    public static a a() {
        return new a.b();
    }

    public abstract Iterable<h> b();

    public abstract byte[] c();
}

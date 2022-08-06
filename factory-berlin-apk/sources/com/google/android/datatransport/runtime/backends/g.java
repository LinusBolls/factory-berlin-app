package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

@AutoValue
/* compiled from: BackendResponse */
public abstract class g {

    /* compiled from: BackendResponse */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    public static g a() {
        return new b(a.FATAL_ERROR, -1);
    }

    public static g d(long j2) {
        return new b(a.OK, j2);
    }

    public static g e() {
        return new b(a.TRANSIENT_ERROR, -1);
    }

    public abstract long b();

    public abstract a c();
}

package com.nytimes.android.external.cache;

/* compiled from: Preconditions */
public final class o {
    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void c(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void d(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}

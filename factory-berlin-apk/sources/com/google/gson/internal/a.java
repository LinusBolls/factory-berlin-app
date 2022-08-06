package com.google.gson.internal;

/* compiled from: $Gson$Preconditions */
public final class a {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }
}

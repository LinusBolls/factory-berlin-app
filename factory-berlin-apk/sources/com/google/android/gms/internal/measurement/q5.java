package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class q5 {
    private static final Class<?> a = a("libcore.io.Memory");
    private static final boolean b = (a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean b() {
        return a != null && !b;
    }

    static Class<?> c() {
        return a;
    }
}

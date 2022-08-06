package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public final class a8<K, V> {
    static <K, V> int a(z7<K, V> z7Var, K k2, V v) {
        return s6.b(z7Var.a, 1, k2) + s6.b(z7Var.c, 2, v);
    }

    static <K, V> void b(zzhf zzhf, z7<K, V> z7Var, K k2, V v) {
        s6.f(zzhf, z7Var.a, 1, k2);
        s6.f(zzhf, z7Var.c, 2, v);
    }
}

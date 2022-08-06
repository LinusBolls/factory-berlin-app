package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class za implements wa {
    private static final h2<Boolean> a;
    private static final h2<Long> b;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        a = q2Var.d("measurement.sdk.attribution.cache", true);
        b = q2Var.b("measurement.sdk.attribution.cache.ttl", 604800000);
    }

    public final boolean b() {
        return a.o().booleanValue();
    }

    public final long c() {
        return b.o().longValue();
    }
}

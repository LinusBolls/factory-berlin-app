package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class qd implements nd {
    private static final h2<Long> a;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        q2Var.b("measurement.id.max_bundles_per_iteration", 0);
        a = q2Var.b("measurement.max_bundles_per_iteration", 2);
    }

    public final long b() {
        return a.o().longValue();
    }
}

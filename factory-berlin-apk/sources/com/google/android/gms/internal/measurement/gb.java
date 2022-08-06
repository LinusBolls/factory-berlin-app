package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class gb implements cb {
    private static final h2<Boolean> a;
    private static final h2<Boolean> b;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        a = q2Var.d("measurement.service.configurable_service_limits", true);
        b = q2Var.d("measurement.client.configurable_service_limits", true);
        q2Var.b("measurement.id.service.configurable_service_limits", 0);
    }

    public final boolean b() {
        return true;
    }

    public final boolean c() {
        return a.o().booleanValue();
    }

    public final boolean d() {
        return b.o().booleanValue();
    }
}

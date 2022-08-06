package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class hb implements ib {
    private static final h2<Boolean> a;
    private static final h2<Boolean> b;
    private static final h2<Long> c;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        a = q2Var.d("measurement.client.consent_state_v1", false);
        b = q2Var.d("measurement.service.consent_state_v1_W33", false);
        c = q2Var.b("measurement.service.storage_consent_support_version", 203290);
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

    public final long e() {
        return c.o().longValue();
    }
}

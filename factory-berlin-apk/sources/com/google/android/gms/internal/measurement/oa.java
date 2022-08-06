package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class oa implements pa {
    private static final h2<Boolean> a;
    private static final h2<Boolean> b;
    private static final h2<Boolean> c;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        a = q2Var.d("measurement.client.ad_impression.dev", false);
        b = q2Var.d("measurement.service.separate_public_internal_event_blacklisting", false);
        c = q2Var.d("measurement.service.ad_impression", false);
        q2Var.b("measurement.id.service.ad_impression", 0);
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

    public final boolean e() {
        return c.o().booleanValue();
    }
}

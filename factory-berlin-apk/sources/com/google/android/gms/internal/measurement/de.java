package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class de implements ee {
    private static final h2<Boolean> a;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        a = q2Var.d("measurement.service.ssaid_removal", true);
        q2Var.b("measurement.id.ssaid_removal", 0);
    }

    public final boolean b() {
        return true;
    }

    public final boolean c() {
        return a.o().booleanValue();
    }
}

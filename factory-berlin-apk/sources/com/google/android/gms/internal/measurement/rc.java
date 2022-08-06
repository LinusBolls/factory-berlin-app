package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class rc implements oc {
    private static final h2<Boolean> a;
    private static final h2<Boolean> b;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        a = q2Var.d("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        b = q2Var.d("measurement.collection.redundant_engagement_removal_enabled", false);
        q2Var.b("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }

    public final boolean b() {
        return a.o().booleanValue();
    }

    public final boolean c() {
        return b.o().booleanValue();
    }
}

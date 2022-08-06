package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class ua implements va {
    private static final h2<Boolean> a;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        a = q2Var.d("measurement.androidId.delete_feature", true);
        q2Var.d("measurement.log_androidId_enabled", false);
    }

    public final boolean b() {
        return a.o().booleanValue();
    }
}

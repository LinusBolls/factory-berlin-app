package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class kd implements hd {
    private static final h2<Boolean> a;
    private static final h2<Boolean> b;
    private static final h2<Boolean> c;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        q2Var.b("measurement.id.lifecycle.app_in_background_parameter", 0);
        a = q2Var.d("measurement.lifecycle.app_backgrounded_engagement", false);
        b = q2Var.d("measurement.lifecycle.app_backgrounded_tracking", true);
        c = q2Var.d("measurement.lifecycle.app_in_background_parameter", false);
        q2Var.b("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean b() {
        return a.o().booleanValue();
    }

    public final boolean c() {
        return b.o().booleanValue();
    }

    public final boolean d() {
        return c.o().booleanValue();
    }
}

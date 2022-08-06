package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class ld implements md {
    private static final h2<Boolean> a;
    private static final h2<Boolean> b;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        a = q2Var.d("measurement.sdk.screen.manual_screen_view_logging", true);
        b = q2Var.d("measurement.sdk.screen.disabling_automatic_reporting", true);
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

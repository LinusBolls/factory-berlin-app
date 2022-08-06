package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class lc implements ic {
    private static final h2<Boolean> a;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        a = q2Var.d("measurement.client.sessions.check_on_reset_and_enable2", true);
        q2Var.d("measurement.client.sessions.check_on_startup", true);
        q2Var.d("measurement.client.sessions.start_session_before_view_screen", true);
    }

    public final boolean b() {
        return true;
    }

    public final boolean c() {
        return a.o().booleanValue();
    }
}

package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class mb implements jb {
    private static final h2<Boolean> a;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        a = q2Var.d("measurement.sdk.dynamite.allow_remote_dynamite2", false);
        q2Var.d("measurement.collection.init_params_control_enabled", true);
        q2Var.d("measurement.sdk.dynamite.use_dynamite3", true);
        q2Var.b("measurement.id.sdk.dynamite.use_dynamite", 0);
    }

    public final boolean b() {
        return a.o().booleanValue();
    }
}

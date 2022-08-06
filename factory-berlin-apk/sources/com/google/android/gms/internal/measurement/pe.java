package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class pe implements me {
    private static final h2<Boolean> a = new q2(i2.a("com.google.android.gms.measurement")).d("measurement.integration.disable_firebase_instance_id", false);

    public final boolean b() {
        return true;
    }

    public final boolean c() {
        return a.o().booleanValue();
    }
}

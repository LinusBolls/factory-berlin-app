package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class ed implements gd {
    private static final h2<Boolean> a;
    private static final h2<Boolean> b;
    private static final h2<Boolean> c;

    /* renamed from: d  reason: collision with root package name */
    private static final h2<Boolean> f2283d;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        a = q2Var.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        b = q2Var.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        c = q2Var.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f2283d = q2Var.d("measurement.sdk.collection.last_gclid_from_referrer2", false);
        q2Var.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
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

    public final boolean e() {
        return f2283d.o().booleanValue();
    }
}

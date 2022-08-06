package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class nb implements ob {
    private static final h2<Boolean> a;
    private static final h2<Boolean> b;
    private static final h2<Boolean> c;

    /* renamed from: d  reason: collision with root package name */
    private static final h2<Boolean> f2449d;

    /* renamed from: e  reason: collision with root package name */
    private static final h2<Boolean> f2450e;

    /* renamed from: f  reason: collision with root package name */
    private static final h2<Boolean> f2451f;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        a = q2Var.d("measurement.gold.enhanced_ecommerce.format_logs", true);
        b = q2Var.d("measurement.gold.enhanced_ecommerce.log_nested_complex_events", true);
        c = q2Var.d("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", true);
        f2449d = q2Var.d("measurement.gold.enhanced_ecommerce.updated_schema.client", true);
        f2450e = q2Var.d("measurement.gold.enhanced_ecommerce.updated_schema.service", true);
        f2451f = q2Var.d("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", true);
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

    public final boolean g() {
        return f2449d.o().booleanValue();
    }

    public final boolean k() {
        return f2450e.o().booleanValue();
    }

    public final boolean m() {
        return f2451f.o().booleanValue();
    }
}

package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class yb implements vb {
    private static final h2<Boolean> a;
    private static final h2<Boolean> b;
    private static final h2<Boolean> c;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        q2Var.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = q2Var.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = q2Var.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = q2Var.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
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
}

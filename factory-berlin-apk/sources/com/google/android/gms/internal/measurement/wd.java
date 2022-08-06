package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class wd implements td {
    private static final h2<Boolean> a;
    private static final h2<Double> b;
    private static final h2<Long> c;

    /* renamed from: d  reason: collision with root package name */
    private static final h2<Long> f2612d;

    /* renamed from: e  reason: collision with root package name */
    private static final h2<String> f2613e;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        a = q2Var.d("measurement.test.boolean_flag", false);
        b = q2Var.a("measurement.test.double_flag", -3.0d);
        c = q2Var.b("measurement.test.int_flag", -2);
        f2612d = q2Var.b("measurement.test.long_flag", -1);
        f2613e = q2Var.c("measurement.test.string_flag", "---");
    }

    public final boolean b() {
        return a.o().booleanValue();
    }

    public final double c() {
        return b.o().doubleValue();
    }

    public final long d() {
        return c.o().longValue();
    }

    public final long e() {
        return f2612d.o().longValue();
    }

    public final String g() {
        return f2613e.o();
    }
}

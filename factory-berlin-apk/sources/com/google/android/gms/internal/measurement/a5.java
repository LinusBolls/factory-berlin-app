package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class a5 extends d5 {
    public static int a(int i2, int i3, int i4) {
        if (i3 <= 1073741823) {
            return Math.min(Math.max(i2, i3), 1073741823);
        }
        throw new IllegalArgumentException(d3.b("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i3), 1073741823));
    }
}

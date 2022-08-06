package com.sensorberg.smartspaces.backend.q;

import kotlin.jvm.internal.k;
import org.threeten.bp.d;
import org.threeten.bp.format.c;
import org.threeten.bp.temporal.a;

/* compiled from: Transport.kt */
public final class n {
    public static final long a(String str) {
        long y;
        k.e(str, "$this$fromIso8601");
        Long k2 = o.k(str);
        if (k2 != null) {
            y = k2.longValue();
        } else {
            y = m.c.g().l(str).y(a.INSTANT_SECONDS);
        }
        return y * ((long) 1000);
    }

    public static final String b(long j2) {
        String b = c.f11508l.b(d.S(j2));
        k.d(b, "DateTimeFormatter.ISO_IN…stant.ofEpochMilli(this))");
        return b;
    }
}

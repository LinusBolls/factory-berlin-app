package com.sensorberg.booking.mybookings;

import android.content.res.Resources;
import g.e.b.h;
import g.e.d.d;
import g.e.d.m;
import kotlin.jvm.internal.k;
import org.threeten.bp.e;

/* compiled from: DisplayTime.kt */
public final class f {
    private final String a;
    private final String b;
    private final String c;

    public f(Resources resources) {
        k.e(resources, "resources");
        String string = resources.getString(h.label_now);
        k.d(string, "resources.getString(R.string.label_now)");
        this.a = string;
        String string2 = resources.getString(h.label_schedule_today);
        k.d(string2, "resources.getString(R.string.label_schedule_today)");
        this.b = string2;
        String string3 = resources.getString(h.label_schedule_tomorrow);
        k.d(string3, "resources.getString(R.st….label_schedule_tomorrow)");
        this.c = string3;
    }

    public final String a(long j2, Long l2) {
        if (System.currentTimeMillis() >= j2) {
            return this.a;
        }
        StringBuilder sb = new StringBuilder();
        e f2 = g.e.d.f.f(j2);
        int i2 = e.a[m.f9758l.a(j2).ordinal()];
        if (i2 == 1) {
            sb.append(this.b);
            sb.append(" ");
        } else if (i2 != 2) {
            sb.append(d.f9748d.a().b(f2));
            sb.append(" ");
        } else {
            sb.append(this.c);
            sb.append(" ");
        }
        sb.append(d.f9748d.b().b(f2));
        if (l2 != null) {
            long longValue = l2.longValue();
            sb.append(" - ");
            sb.append(d.f9748d.b().b(g.e.d.f.f(longValue)));
        }
        String sb2 = sb.toString();
        k.d(sb2, "sb.toString()");
        return sb2;
    }
}

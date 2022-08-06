package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.r;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class a extends d2 {
    private final Map<String, Long> b = new e.e.a();
    private final Map<String, Integer> c = new e.e.a();

    /* renamed from: d  reason: collision with root package name */
    private long f2704d;

    public a(h5 h5Var) {
        super(h5Var);
    }

    private final void A(String str, long j2, u7 u7Var) {
        if (u7Var == null) {
            i().M().a("Not logging ad unit exposure. No active activity");
        } else if (j2 < 1000) {
            i().M().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j2);
            t7.O(u7Var, bundle, true);
            p().X("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    public final void B(long j2) {
        for (String put : this.b.keySet()) {
            this.b.put(put, Long.valueOf(j2));
        }
        if (!this.b.isEmpty()) {
            this.f2704d = j2;
        }
    }

    /* access modifiers changed from: private */
    public final void E(String str, long j2) {
        c();
        r.g(str);
        if (this.c.isEmpty()) {
            this.f2704d = j2;
        }
        Integer num = this.c.get(str);
        if (num != null) {
            this.c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.c.size() >= 100) {
            i().H().a("Too many ads visible");
        } else {
            this.c.put(str, 1);
            this.b.put(str, Long.valueOf(j2));
        }
    }

    /* access modifiers changed from: private */
    public final void F(String str, long j2) {
        c();
        r.g(str);
        Integer num = this.c.get(str);
        if (num != null) {
            u7 D = s().D(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.c.remove(str);
                Long l2 = this.b.get(str);
                if (l2 == null) {
                    i().E().a("First ad unit exposure time was never set");
                } else {
                    this.b.remove(str);
                    A(str, j2 - l2.longValue(), D);
                }
                if (this.c.isEmpty()) {
                    long j3 = this.f2704d;
                    if (j3 == 0) {
                        i().E().a("First ad exposure time was never set");
                        return;
                    }
                    w(j2 - j3, D);
                    this.f2704d = 0;
                    return;
                }
                return;
            }
            this.c.put(str, Integer.valueOf(intValue));
            return;
        }
        i().E().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void w(long j2, u7 u7Var) {
        if (u7Var == null) {
            i().M().a("Not logging ad exposure. No active activity");
        } else if (j2 < 1000) {
            i().M().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j2);
            t7.O(u7Var, bundle, true);
            p().X("am", "_xa", bundle);
        }
    }

    public final void D(String str, long j2) {
        if (str == null || str.length() == 0) {
            i().E().a("Ad unit id must be a non-empty string");
        } else {
            a().y(new b0(this, str, j2));
        }
    }

    public final void v(long j2) {
        u7 D = s().D(false);
        for (String next : this.b.keySet()) {
            A(next, j2 - this.b.get(next).longValue(), D);
        }
        if (!this.b.isEmpty()) {
            w(j2 - this.f2704d, D);
        }
        B(j2);
    }

    public final void z(String str, long j2) {
        if (str == null || str.length() == 0) {
            i().E().a("Ad unit id must be a non-empty string");
        } else {
            a().y(new c1(this, str, j2));
        }
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class q9 {
    private final e a;
    private long b;

    public q9(e eVar) {
        r.k(eVar);
        this.a = eVar;
    }

    public final void a() {
        this.b = this.a.c();
    }

    public final boolean b(long j2) {
        if (this.b != 0 && this.a.c() - this.b < 3600000) {
            return false;
        }
        return true;
    }

    public final void c() {
        this.b = 0;
    }
}

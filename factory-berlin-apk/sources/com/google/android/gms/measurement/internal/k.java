package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.ye;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
abstract class k {

    /* renamed from: d  reason: collision with root package name */
    private static volatile Handler f2917d;
    private final c6 a;
    private final Runnable b;
    /* access modifiers changed from: private */
    public volatile long c;

    k(c6 c6Var) {
        r.k(c6Var);
        this.a = c6Var;
        this.b = new j(this, c6Var);
    }

    private final Handler f() {
        Handler handler;
        if (f2917d != null) {
            return f2917d;
        }
        synchronized (k.class) {
            if (f2917d == null) {
                f2917d = new ye(this.a.j().getMainLooper());
            }
            handler = f2917d;
        }
        return handler;
    }

    public abstract void b();

    public final void c(long j2) {
        e();
        if (j2 >= 0) {
            this.c = this.a.f().b();
            if (!f().postDelayed(this.b, j2)) {
                this.a.i().E().b("Failed to schedule delayed post. time", Long.valueOf(j2));
            }
        }
    }

    public final boolean d() {
        return this.c != 0;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        this.c = 0;
        f().removeCallbacks(this.b);
    }
}

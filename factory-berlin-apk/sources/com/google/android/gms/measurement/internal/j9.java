package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.ye;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class j9 extends f5 {
    /* access modifiers changed from: private */
    public Handler c;

    /* renamed from: d  reason: collision with root package name */
    protected final r9 f2914d = new r9(this);

    /* renamed from: e  reason: collision with root package name */
    protected final p9 f2915e = new p9(this);

    /* renamed from: f  reason: collision with root package name */
    private final k9 f2916f = new k9(this);

    j9(h5 h5Var) {
        super(h5Var);
    }

    /* access modifiers changed from: private */
    public final void F() {
        c();
        if (this.c == null) {
            this.c = new ye(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: private */
    public final void H(long j2) {
        c();
        F();
        i().M().b("Activity resumed, time", Long.valueOf(j2));
        if (l().s(u.x0)) {
            if (l().H().booleanValue() || k().w.b()) {
                this.f2915e.b(j2);
            }
            this.f2916f.a();
        } else {
            this.f2916f.a();
            if (l().H().booleanValue()) {
                this.f2915e.b(j2);
            }
        }
        r9 r9Var = this.f2914d;
        r9Var.a.c();
        if (r9Var.a.a.p()) {
            if (!r9Var.a.l().s(u.x0)) {
                r9Var.a.k().w.a(false);
            }
            r9Var.b(r9Var.a.f().b(), false);
        }
    }

    /* access modifiers changed from: private */
    public final void J(long j2) {
        c();
        F();
        i().M().b("Activity paused, time", Long.valueOf(j2));
        this.f2916f.b(j2);
        if (l().H().booleanValue()) {
            this.f2915e.f(j2);
        }
        r9 r9Var = this.f2914d;
        if (!r9Var.a.l().s(u.x0)) {
            r9Var.a.k().w.a(true);
        }
    }

    /* access modifiers changed from: package-private */
    public final long B(long j2) {
        return this.f2915e.g(j2);
    }

    public final boolean E(boolean z, boolean z2, long j2) {
        return this.f2915e.d(z, z2, j2);
    }

    /* access modifiers changed from: protected */
    public final boolean z() {
        return false;
    }
}

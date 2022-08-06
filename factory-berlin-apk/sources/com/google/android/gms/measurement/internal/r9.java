package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.rb;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class r9 {
    final /* synthetic */ j9 a;

    r9(j9 j9Var) {
        this.a = j9Var;
    }

    private final void c(long j2, boolean z) {
        this.a.c();
        if (this.a.a.p()) {
            this.a.k().u.b(j2);
            this.a.i().M().b("Session started, time", Long.valueOf(this.a.f().c()));
            Long valueOf = Long.valueOf(j2 / 1000);
            this.a.p().Z("auto", "_sid", valueOf, j2);
            this.a.k().r.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.a.l().s(u.m0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.a.p().U("auto", "_s", j2, bundle);
            if (rb.a() && this.a.l().s(u.r0)) {
                String a2 = this.a.k().z.a();
                if (!TextUtils.isEmpty(a2)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a2);
                    this.a.p().U("auto", "_ssr", j2, bundle2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.a.c();
        if (this.a.k().x(this.a.f().b())) {
            this.a.k().r.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.a.i().M().a("Detected application was in foreground");
                c(this.a.f().b(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(long j2, boolean z) {
        this.a.c();
        this.a.F();
        if (this.a.k().x(j2)) {
            this.a.k().r.a(true);
        }
        this.a.k().u.b(j2);
        if (this.a.k().r.b()) {
            c(j2, z);
        }
    }
}

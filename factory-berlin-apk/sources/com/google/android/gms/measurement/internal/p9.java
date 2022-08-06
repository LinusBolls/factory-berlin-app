package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.jc;
import com.google.android.gms.internal.measurement.kc;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class p9 {
    private long a;
    private long b;
    private final k c = new o9(this, this.f3048d.a);

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ j9 f3048d;

    public p9(j9 j9Var) {
        this.f3048d = j9Var;
        long c2 = j9Var.f().c();
        this.a = c2;
        this.b = c2;
    }

    /* access modifiers changed from: private */
    public final void h() {
        this.f3048d.c();
        d(false, false, this.f3048d.f().c());
        this.f3048d.o().v(this.f3048d.f().c());
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.c.e();
        this.a = 0;
        this.b = 0;
    }

    /* access modifiers changed from: package-private */
    public final void b(long j2) {
        this.f3048d.c();
        this.c.e();
        this.a = j2;
        this.b = j2;
    }

    public final boolean d(boolean z, boolean z2, long j2) {
        this.f3048d.c();
        this.f3048d.w();
        if (!jc.a() || !this.f3048d.l().s(u.s0) || this.f3048d.a.p()) {
            this.f3048d.k().u.b(this.f3048d.f().b());
        }
        long j3 = j2 - this.a;
        if (z || j3 >= 1000) {
            if (this.f3048d.l().s(u.U) && !z2) {
                j3 = (!kc.a() || !this.f3048d.l().s(u.W)) ? e() : g(j2);
            }
            this.f3048d.i().M().b("Recording user engagement, ms", Long.valueOf(j3));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j3);
            t7.O(this.f3048d.s().D(!this.f3048d.l().H().booleanValue()), bundle, true);
            if (this.f3048d.l().s(u.U) && !this.f3048d.l().s(u.V) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.f3048d.l().s(u.V) || !z2) {
                this.f3048d.p().X("auto", "_e", bundle);
            }
            this.a = j2;
            this.c.e();
            this.c.c(3600000);
            return true;
        }
        this.f3048d.i().M().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j3));
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long e() {
        long c2 = this.f3048d.f().c();
        long j2 = c2 - this.b;
        this.b = c2;
        return j2;
    }

    /* access modifiers changed from: package-private */
    public final void f(long j2) {
        this.c.e();
    }

    /* access modifiers changed from: package-private */
    public final long g(long j2) {
        long j3 = j2 - this.b;
        this.b = j2;
        return j3;
    }
}

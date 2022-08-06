package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class k9 {
    private n9 a;
    final /* synthetic */ j9 b;

    k9(j9 j9Var) {
        this.b = j9Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.b.c();
        if (this.b.l().s(u.l0) && this.a != null) {
            this.b.c.removeCallbacks(this.a);
        }
        if (this.b.l().s(u.x0)) {
            this.b.k().w.a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(long j2) {
        if (this.b.l().s(u.l0)) {
            this.a = new n9(this, this.b.f().b(), j2);
            this.b.c.postDelayed(this.a, 2000);
        }
    }
}

package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class n9 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    long f3000g;

    /* renamed from: h  reason: collision with root package name */
    long f3001h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ k9 f3002i;

    n9(k9 k9Var, long j2, long j3) {
        this.f3002i = k9Var;
        this.f3000g = j2;
        this.f3001h = j3;
    }

    public final void run() {
        this.f3002i.b.a().y(new m9(this));
    }
}

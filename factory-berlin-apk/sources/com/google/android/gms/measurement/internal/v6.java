package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class v6 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ long f3185g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ l6 f3186h;

    v6(l6 l6Var, long j2) {
        this.f3186h = l6Var;
        this.f3185g = j2;
    }

    public final void run() {
        this.f3186h.F(this.f3185g, true);
        this.f3186h.r().R(new AtomicReference());
    }
}

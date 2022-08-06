package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class s9 extends k {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ x9 f3097e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ t9 f3098f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    s9(t9 t9Var, c6 c6Var, x9 x9Var) {
        super(c6Var);
        this.f3098f = t9Var;
        this.f3097e = x9Var;
    }

    public final void b() {
        this.f3098f.v();
        this.f3098f.i().M().a("Starting upload from DelayedRunnable");
        this.f3097e.h0();
    }
}

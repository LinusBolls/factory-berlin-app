package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class u5 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ s f3144g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f3145h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ i5 f3146i;

    u5(i5 i5Var, s sVar, String str) {
        this.f3146i = i5Var;
        this.f3144g = sVar;
        this.f3145h = str;
    }

    public final void run() {
        this.f3146i.a.i0();
        this.f3146i.a.q(this.f3144g, this.f3145h);
    }
}

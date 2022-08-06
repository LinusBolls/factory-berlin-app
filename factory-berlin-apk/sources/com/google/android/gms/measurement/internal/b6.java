package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class b6 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f2743g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f2744h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ String f2745i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ long f2746j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ i5 f2747k;

    b6(i5 i5Var, String str, String str2, String str3, long j2) {
        this.f2747k = i5Var;
        this.f2743g = str;
        this.f2744h = str2;
        this.f2745i = str3;
        this.f2746j = j2;
    }

    public final void run() {
        String str = this.f2743g;
        if (str == null) {
            this.f2747k.a.k0().O().R(this.f2744h, (u7) null);
            return;
        }
        this.f2747k.a.k0().O().R(this.f2744h, new u7(this.f2745i, str, this.f2746j));
    }
}

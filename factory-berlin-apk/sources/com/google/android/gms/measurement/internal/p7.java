package com.google.android.gms.measurement.internal;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final /* synthetic */ class p7 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final q7 f3037g;

    /* renamed from: h  reason: collision with root package name */
    private final int f3038h;

    /* renamed from: i  reason: collision with root package name */
    private final Exception f3039i;

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f3040j;

    /* renamed from: k  reason: collision with root package name */
    private final Map f3041k;

    p7(q7 q7Var, int i2, Exception exc, byte[] bArr, Map map) {
        this.f3037g = q7Var;
        this.f3038h = i2;
        this.f3039i = exc;
        this.f3040j = bArr;
        this.f3041k = map;
    }

    public final void run() {
        this.f3037g.a(this.f3038h, this.f3039i, this.f3040j, this.f3041k);
    }
}

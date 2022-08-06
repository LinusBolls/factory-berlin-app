package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class l4 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final i4 f2933g;

    /* renamed from: h  reason: collision with root package name */
    private final int f2934h;

    /* renamed from: i  reason: collision with root package name */
    private final Throwable f2935i;

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f2936j;

    /* renamed from: k  reason: collision with root package name */
    private final String f2937k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, List<String>> f2938l;

    private l4(String str, i4 i4Var, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        r.k(i4Var);
        this.f2933g = i4Var;
        this.f2934h = i2;
        this.f2935i = th;
        this.f2936j = bArr;
        this.f2937k = str;
        this.f2938l = map;
    }

    public final void run() {
        this.f2933g.a(this.f2937k, this.f2934h, this.f2935i, this.f2936j, this.f2938l);
    }
}

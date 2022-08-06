package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class o {
    final String a;
    final String b;
    final long c;

    /* renamed from: d  reason: collision with root package name */
    final long f3003d;

    /* renamed from: e  reason: collision with root package name */
    final long f3004e;

    /* renamed from: f  reason: collision with root package name */
    final long f3005f;

    /* renamed from: g  reason: collision with root package name */
    final long f3006g;

    /* renamed from: h  reason: collision with root package name */
    final Long f3007h;

    /* renamed from: i  reason: collision with root package name */
    final Long f3008i;

    /* renamed from: j  reason: collision with root package name */
    final Long f3009j;

    /* renamed from: k  reason: collision with root package name */
    final Boolean f3010k;

    o(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l2, Long l3, Long l4, Boolean bool) {
        long j7 = j2;
        long j8 = j3;
        long j9 = j4;
        long j10 = j6;
        r.g(str);
        r.g(str2);
        boolean z = true;
        r.a(j7 >= 0);
        r.a(j8 >= 0);
        r.a(j9 >= 0);
        r.a(j10 < 0 ? false : z);
        this.a = str;
        this.b = str2;
        this.c = j7;
        this.f3003d = j8;
        this.f3004e = j9;
        this.f3005f = j5;
        this.f3006g = j10;
        this.f3007h = l2;
        this.f3008i = l3;
        this.f3009j = l4;
        this.f3010k = bool;
    }

    /* access modifiers changed from: package-private */
    public final o a(long j2) {
        return new o(this.a, this.b, this.c, this.f3003d, this.f3004e, j2, this.f3006g, this.f3007h, this.f3008i, this.f3009j, this.f3010k);
    }

    /* access modifiers changed from: package-private */
    public final o b(long j2, long j3) {
        return new o(this.a, this.b, this.c, this.f3003d, this.f3004e, this.f3005f, j2, Long.valueOf(j3), this.f3008i, this.f3009j, this.f3010k);
    }

    /* access modifiers changed from: package-private */
    public final o c(Long l2, Long l3, Boolean bool) {
        return new o(this.a, this.b, this.c, this.f3003d, this.f3004e, this.f3005f, this.f3006g, this.f3007h, l2, l3, (bool == null || bool.booleanValue()) ? bool : null);
    }

    o(String str, String str2, long j2, long j3, long j4, long j5, Long l2, Long l3, Long l4, Boolean bool) {
        this(str, str2, 0, 0, 0, j4, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
    }
}

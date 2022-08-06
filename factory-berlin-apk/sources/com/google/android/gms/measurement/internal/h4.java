package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class h4 {
    public String a;
    private String b;
    private long c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f2867d;

    private h4(String str, String str2, Bundle bundle, long j2) {
        this.a = str;
        this.b = str2;
        this.f2867d = bundle == null ? new Bundle() : bundle;
        this.c = j2;
    }

    public static h4 b(s sVar) {
        return new h4(sVar.f3081g, sVar.f3083i, sVar.f3082h.o(), sVar.f3084j);
    }

    public final s a() {
        return new s(this.a, new n(new Bundle(this.f2867d)), this.b, this.c);
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.a;
        String valueOf = String.valueOf(this.f2867d);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }
}

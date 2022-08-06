package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.r;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class t4 {
    private final String a;
    private final long b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private long f3101d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ p4 f3102e;

    public t4(p4 p4Var, String str, long j2) {
        this.f3102e = p4Var;
        r.g(str);
        this.a = str;
        this.b = j2;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.f3101d = this.f3102e.D().getLong(this.a, this.b);
        }
        return this.f3101d;
    }

    public final void b(long j2) {
        SharedPreferences.Editor edit = this.f3102e.D().edit();
        edit.putLong(this.a, j2);
        edit.apply();
        this.f3101d = j2;
    }
}

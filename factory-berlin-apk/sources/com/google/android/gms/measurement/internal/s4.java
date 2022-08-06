package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.r;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class s4 {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final long f3085d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ p4 f3086e;

    private s4(p4 p4Var, String str, long j2) {
        this.f3086e = p4Var;
        r.g(str);
        r.a(j2 > 0);
        this.a = String.valueOf(str).concat(":start");
        this.b = String.valueOf(str).concat(":count");
        this.c = String.valueOf(str).concat(":value");
        this.f3085d = j2;
    }

    private final void c() {
        this.f3086e.c();
        long b2 = this.f3086e.f().b();
        SharedPreferences.Editor edit = this.f3086e.D().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, b2);
        edit.apply();
    }

    private final long d() {
        return this.f3086e.D().getLong(this.a, 0);
    }

    public final Pair<String, Long> a() {
        long j2;
        this.f3086e.c();
        this.f3086e.c();
        long d2 = d();
        if (d2 == 0) {
            c();
            j2 = 0;
        } else {
            j2 = Math.abs(d2 - this.f3086e.f().b());
        }
        long j3 = this.f3085d;
        if (j2 < j3) {
            return null;
        }
        if (j2 > (j3 << 1)) {
            c();
            return null;
        }
        String string = this.f3086e.D().getString(this.c, (String) null);
        long j4 = this.f3086e.D().getLong(this.b, 0);
        c();
        if (string == null || j4 <= 0) {
            return p4.D;
        }
        return new Pair<>(string, Long.valueOf(j4));
    }

    public final void b(String str, long j2) {
        this.f3086e.c();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = "";
        }
        long j3 = this.f3086e.D().getLong(this.b, 0);
        if (j3 <= 0) {
            SharedPreferences.Editor edit = this.f3086e.D().edit();
            edit.putString(this.c, str);
            edit.putLong(this.b, 1);
            edit.apply();
            return;
        }
        long j4 = j3 + 1;
        boolean z = (this.f3086e.g().H0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j4;
        SharedPreferences.Editor edit2 = this.f3086e.D().edit();
        if (z) {
            edit2.putString(this.c, str);
        }
        edit2.putLong(this.b, j4);
        edit2.apply();
    }
}

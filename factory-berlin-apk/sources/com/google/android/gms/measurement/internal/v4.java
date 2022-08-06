package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.r;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class v4 {
    private final String a;
    private boolean b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ p4 f3181d;

    public v4(p4 p4Var, String str, String str2) {
        this.f3181d = p4Var;
        r.g(str);
        this.a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.f3181d.D().getString(this.a, (String) null);
        }
        return this.c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f3181d.D().edit();
        edit.putString(this.a, str);
        edit.apply();
        this.c = str;
    }
}

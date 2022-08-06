package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.r;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class r4 {
    private final String a;
    private final boolean b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3069d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ p4 f3070e;

    public r4(p4 p4Var, String str, boolean z) {
        this.f3070e = p4Var;
        r.g(str);
        this.a = str;
        this.b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.f3070e.D().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.f3069d = z;
    }

    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.f3069d = this.f3070e.D().getBoolean(this.a, this.b);
        }
        return this.f3069d;
    }
}

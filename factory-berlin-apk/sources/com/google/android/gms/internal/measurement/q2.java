package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class q2 {
    final Uri a;
    final String b;
    final String c;

    public q2(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (a3<Context, Boolean>) null);
    }

    public final h2<Double> a(String str, double d2) {
        return h2.i(this, str, -3.0d, true);
    }

    public final h2<Long> b(String str, long j2) {
        return h2.j(this, str, j2, true);
    }

    public final h2<String> c(String str, String str2) {
        return h2.k(this, str, str2, true);
    }

    public final h2<Boolean> d(String str, boolean z) {
        return h2.l(this, str, z, true);
    }

    private q2(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, a3<Context, Boolean> a3Var) {
        this.a = uri;
        this.b = str2;
        this.c = str3;
    }
}

package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.j;
import java.util.concurrent.Callable;

class a0 {

    /* renamed from: d  reason: collision with root package name */
    private static final a0 f2020d = new a0(true, (String) null, (Throwable) null);
    final boolean a;
    private final String b;
    private final Throwable c;

    a0(boolean z, String str, Throwable th) {
        this.a = z;
        this.b = str;
        this.c = th;
    }

    static a0 b(String str, Throwable th) {
        return new a0(false, str, th);
    }

    static a0 c(Callable<String> callable) {
        return new c0(callable);
    }

    static a0 d(String str) {
        return new a0(false, str, (Throwable) null);
    }

    static String e(String str, s sVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{z2 ? "debug cert rejected" : "not whitelisted", str, j.a(a.b("SHA-1").digest(sVar.o())), Boolean.valueOf(z), "12451009.false"});
    }

    static a0 f() {
        return f2020d;
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        if (!this.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.c != null) {
                Log.d("GoogleCertificatesRslt", a(), this.c);
            } else {
                Log.d("GoogleCertificatesRslt", a());
            }
        }
    }
}

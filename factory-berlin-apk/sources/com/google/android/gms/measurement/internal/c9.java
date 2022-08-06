package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.google.android.gms.internal.measurement.fb;
import g.b.a.b.a.a.a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class c9 extends u9 {

    /* renamed from: d  reason: collision with root package name */
    private String f2776d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2777e;

    /* renamed from: f  reason: collision with root package name */
    private long f2778f;

    c9(x9 x9Var) {
        super(x9Var);
    }

    @Deprecated
    private final Pair<String, Boolean> w(String str) {
        c();
        long c = f().c();
        if (this.f2776d != null && c < this.f2778f) {
            return new Pair<>(this.f2776d, Boolean.valueOf(this.f2777e));
        }
        this.f2778f = c + l().A(str);
        a.d(true);
        try {
            a.C0631a b = a.b(j());
            if (b != null) {
                this.f2776d = b.a();
                this.f2777e = b.b();
            }
            if (this.f2776d == null) {
                this.f2776d = "";
            }
        } catch (Exception e2) {
            i().L().b("Unable to get advertising id", e2);
            this.f2776d = "";
        }
        a.d(false);
        return new Pair<>(this.f2776d, Boolean.valueOf(this.f2777e));
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Pair<String, Boolean> u(String str, e eVar) {
        if (!fb.a() || !l().s(u.Q0) || eVar.o()) {
            return w(str);
        }
        return new Pair<>("", Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final String v(String str) {
        c();
        String str2 = (String) w(str).first;
        MessageDigest J0 = fa.J0();
        if (J0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, J0.digest(str2.getBytes()))});
    }
}

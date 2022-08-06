package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class na {
    private final h5 a;

    public na(h5 h5Var) {
        this.a = h5Var;
    }

    private final boolean d() {
        if (e() && this.a.f().b() - this.a.x().B.a() > this.a.c().p((String) null, u.M0)) {
            return true;
        }
        return false;
    }

    private final boolean e() {
        return this.a.x().B.a() > 0;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.a.a().c();
        if (e()) {
            if (d()) {
                this.a.x().A.b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.a.F().X("auto", "_cmpx", bundle);
            } else {
                String a2 = this.a.x().A.a();
                if (TextUtils.isEmpty(a2)) {
                    this.a.i().F().a("Cache still valid but referrer not found");
                } else {
                    long a3 = ((this.a.x().B.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a2);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a3);
                    this.a.F().X((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                this.a.x().A.b((String) null);
            }
            this.a.x().B.b(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, Bundle bundle) {
        String str2;
        this.a.a().c();
        if (!this.a.p()) {
            if (bundle == null || bundle.isEmpty()) {
                str2 = null;
            } else {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.a.x().A.b(str2);
                this.a.x().B.b(this.a.f().b());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (e() && d()) {
            this.a.x().A.b((String) null);
        }
    }
}

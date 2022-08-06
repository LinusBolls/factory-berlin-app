package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class l {
    final String a;
    final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    final long f2930d;

    /* renamed from: e  reason: collision with root package name */
    final long f2931e;

    /* renamed from: f  reason: collision with root package name */
    final n f2932f;

    private l(h5 h5Var, String str, String str2, String str3, long j2, long j3, n nVar) {
        r.g(str2);
        r.g(str3);
        r.k(nVar);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.f2930d = j2;
        this.f2931e = j3;
        if (j3 != 0 && j3 > j2) {
            h5Var.i().H().c("Event created with reverse previous/current timestamps. appId, name", c4.w(str2), c4.w(str3));
        }
        this.f2932f = nVar;
    }

    /* access modifiers changed from: package-private */
    public final l a(h5 h5Var, long j2) {
        return new l(h5Var, this.c, this.a, this.b, this.f2930d, j2, this.f2932f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.f2932f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    l(h5 h5Var, String str, String str2, String str3, long j2, long j3, Bundle bundle) {
        n nVar;
        r.g(str2);
        r.g(str3);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.f2930d = j2;
        this.f2931e = j3;
        if (j3 != 0 && j3 > j2) {
            h5Var.i().H().b("Event created with reverse previous/current timestamps. appId", c4.w(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            nVar = new n(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    h5Var.i().E().a("Param name can't be null");
                    it.remove();
                } else {
                    Object G = h5Var.G().G(str4, bundle2.get(str4));
                    if (G == null) {
                        h5Var.i().H().b("Param value can't be null", h5Var.H().y(str4));
                        it.remove();
                    } else {
                        h5Var.G().N(bundle2, str4, G);
                    }
                }
            }
            nVar = new n(bundle2);
        }
        this.f2932f = nVar;
    }
}

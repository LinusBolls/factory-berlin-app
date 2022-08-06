package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.measurement.internal.l7;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.5.0 */
final class b implements l7 {
    private final /* synthetic */ h a;

    b(h hVar) {
        this.a = hVar;
    }

    public final void a(String str) {
        this.a.y(str);
    }

    public final String b() {
        return this.a.M();
    }

    public final String c() {
        return this.a.O();
    }

    public final String d() {
        return this.a.H();
    }

    public final String e() {
        return this.a.C();
    }

    public final void f(Bundle bundle) {
        this.a.j(bundle);
    }

    public final long g() {
        return this.a.J();
    }

    public final List<Bundle> h(String str, String str2) {
        return this.a.w(str, str2);
    }

    public final int i(String str) {
        return this.a.G(str);
    }

    public final void j(String str) {
        this.a.D(str);
    }

    public final Map<String, Object> k(String str, String str2, boolean z) {
        return this.a.g(str, str2, z);
    }

    public final void l(String str, String str2, Bundle bundle) {
        this.a.z(str, str2, bundle);
    }

    public final void m(String str, String str2, Bundle bundle) {
        this.a.p(str, str2, bundle);
    }
}

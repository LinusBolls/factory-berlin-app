package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.a.a;
import com.google.firebase.crashlytics.d.f.b;

/* compiled from: CrashlyticsAnalyticsListener */
class a implements a.b {
    private b a;
    private b b;

    a() {
    }

    private static void b(b bVar, String str, Bundle bundle) {
        if (bVar != null) {
            bVar.n(str, bundle);
        }
    }

    private void c(String str, Bundle bundle) {
        b bVar;
        if ("clx".equals(bundle.getString("_o"))) {
            bVar = this.a;
        } else {
            bVar = this.b;
        }
        b(bVar, str, bundle);
    }

    public void a(int i2, Bundle bundle) {
        String string;
        com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
        f2.b("Received Analytics message: " + i2 + " " + bundle);
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            c(string, bundle2);
        }
    }

    public void d(b bVar) {
        this.b = bVar;
    }

    public void e(b bVar) {
        this.a = bVar;
    }
}

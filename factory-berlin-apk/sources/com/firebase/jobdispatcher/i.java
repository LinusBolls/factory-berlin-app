package com.firebase.jobdispatcher;

import android.net.Uri;
import android.os.Bundle;
import com.firebase.jobdispatcher.t;

/* compiled from: GooglePlayJobWriter */
final class i {
    private final p a = new p("com.firebase.jobdispatcher.");

    i() {
    }

    private static int a(int i2) {
        int i3 = 2;
        if ((i2 & 2) == 2) {
            i3 = 0;
        }
        if ((i2 & 1) == 1) {
            return 1;
        }
        return i3;
    }

    private static int b(int i2) {
        return i2 != 2 ? 0 : 1;
    }

    private static void c(r rVar, Bundle bundle) {
        int a2 = a.a(rVar.e());
        boolean z = true;
        bundle.putBoolean("requiresCharging", (a2 & 4) == 4);
        if ((a2 & 8) != 8) {
            z = false;
        }
        bundle.putBoolean("requiresIdle", z);
        bundle.putInt("requiredNetwork", a(a2));
    }

    private static void d(Bundle bundle, t.a aVar) {
        bundle.putInt("trigger_type", 3);
        int size = aVar.a().size();
        int[] iArr = new int[size];
        Uri[] uriArr = new Uri[size];
        for (int i2 = 0; i2 < size; i2++) {
            v vVar = aVar.a().get(i2);
            iArr[i2] = vVar.a();
            uriArr[i2] = vVar.b();
        }
        bundle.putIntArray("content_uri_flags_array", iArr);
        bundle.putParcelableArray("content_uri_array", uriArr);
    }

    private static void e(r rVar, Bundle bundle, t.b bVar) {
        bundle.putInt("trigger_type", 1);
        if (rVar.h()) {
            bundle.putLong("period", (long) bVar.a());
            bundle.putLong("period_flex", (long) (bVar.a() - bVar.b()));
            return;
        }
        bundle.putLong("window_start", (long) bVar.b());
        bundle.putLong("window_end", (long) bVar.a());
    }

    private static void f(Bundle bundle) {
        bundle.putInt("trigger_type", 2);
        bundle.putLong("window_start", 0);
        bundle.putLong("window_end", 1);
    }

    private static void g(r rVar, Bundle bundle) {
        w g2 = rVar.g();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("retry_policy", b(g2.c()));
        bundle2.putInt("initial_backoff_seconds", g2.a());
        bundle2.putInt("maximum_backoff_seconds", g2.b());
        bundle.putBundle("retryStrategy", bundle2);
    }

    private static void i(r rVar, Bundle bundle) {
        t d2 = rVar.d();
        if (d2 == x.a) {
            f(bundle);
        } else if (d2 instanceof t.b) {
            e(rVar, bundle, (t.b) d2);
        } else if (d2 instanceof t.a) {
            d(bundle, (t.a) d2);
        } else {
            throw new IllegalArgumentException("Unknown trigger: " + d2.getClass());
        }
    }

    public Bundle h(r rVar, Bundle bundle) {
        bundle.putString("tag", rVar.a());
        bundle.putBoolean("update_current", rVar.i());
        bundle.putBoolean("persisted", rVar.f() == 2);
        bundle.putString("service", GooglePlayReceiver.class.getName());
        i(rVar, bundle);
        c(rVar, bundle);
        g(rVar, bundle);
        Bundle b = rVar.b();
        if (b == null) {
            b = new Bundle();
        }
        this.a.g(rVar, b);
        bundle.putBundle("extras", b);
        return bundle;
    }
}

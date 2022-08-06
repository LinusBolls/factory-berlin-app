package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.5.0 */
final class f implements a.C0069a {
    private final /* synthetic */ d a;

    public f(d dVar) {
        this.a = dVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j2) {
        if (str != null && !str.equals("crash") && c.e(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j2);
            bundle2.putBundle("params", bundle);
            this.a.a.a(3, bundle2);
        }
    }
}

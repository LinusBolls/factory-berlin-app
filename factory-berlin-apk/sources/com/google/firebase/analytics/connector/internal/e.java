package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.5.0 */
final class e implements a.C0069a {
    private final /* synthetic */ b a;

    public e(b bVar) {
        this.a = bVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j2) {
        if (this.a.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", c.f(str2));
            this.a.b.a(2, bundle2);
        }
    }
}

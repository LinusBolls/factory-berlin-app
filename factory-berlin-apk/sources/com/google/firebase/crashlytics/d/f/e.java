package com.google.firebase.crashlytics.d.f;

import android.os.Bundle;
import com.google.firebase.analytics.a.a;

/* compiled from: CrashlyticsOriginAnalyticsEventLogger */
public class e implements a {
    private final a a;

    public e(a aVar) {
        this.a = aVar;
    }

    public void a(String str, Bundle bundle) {
        this.a.b("clx", str, bundle);
    }
}

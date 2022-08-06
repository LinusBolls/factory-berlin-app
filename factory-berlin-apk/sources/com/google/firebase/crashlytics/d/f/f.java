package com.google.firebase.crashlytics.d.f;

import android.os.Bundle;
import com.google.firebase.crashlytics.d.b;

/* compiled from: UnavailableAnalyticsEventLogger */
public class f implements a {
    public void a(String str, Bundle bundle) {
        b.f().b("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}

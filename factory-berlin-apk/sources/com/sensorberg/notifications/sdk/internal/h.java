package com.sensorberg.notifications.sdk.internal;

import android.app.Application;
import kotlin.jvm.internal.k;

/* compiled from: NotificationSdkComponent.kt */
public final class h {
    public static final void a(Application application, String str, String str2, boolean z) {
        k.f(application, "app");
        k.f(str, "apiKey");
        k.f(str2, "baseUrl");
        f.b.b(new InjectionModule(application, str, str2, z).e());
    }
}

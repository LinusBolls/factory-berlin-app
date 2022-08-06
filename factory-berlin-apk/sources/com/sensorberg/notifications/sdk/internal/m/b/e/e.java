package com.sensorberg.notifications.sdk.internal.m.b.e;

import k.b0;
import kotlin.jvm.internal.k;

/* compiled from: InstallationId.kt */
public final class e implements a {
    private final String a;

    public e(String str) {
        k.f(str, "installId");
        this.a = str;
    }

    public void a(b0.a aVar) {
        k.f(aVar, "builder");
        aVar.e("X-iid", this.a);
    }
}

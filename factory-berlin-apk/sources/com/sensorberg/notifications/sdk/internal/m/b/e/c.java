package com.sensorberg.notifications.sdk.internal.m.b.e;

import k.b0;
import kotlin.jvm.internal.k;

/* compiled from: ApiKey.kt */
public final class c implements a {
    private final String a;

    public c(String str) {
        k.f(str, "apiKey");
        this.a = str;
    }

    public void a(b0.a aVar) {
        k.f(aVar, "builder");
        aVar.e("X-Api-Key", this.a);
    }
}

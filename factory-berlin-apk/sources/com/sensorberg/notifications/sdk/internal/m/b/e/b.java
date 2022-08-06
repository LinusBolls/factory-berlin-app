package com.sensorberg.notifications.sdk.internal.m.b.e;

import k.b0;
import kotlin.jvm.internal.k;

/* compiled from: AdvertisementId.kt */
public final class b implements a {
    private String a;

    public void a(b0.a aVar) {
        k.f(aVar, "builder");
        String str = this.a;
        if (str != null) {
            aVar.e("X-aid", str);
        }
    }

    public final void b(String str) {
        this.a = str;
    }
}

package com.sensorberg.aliolihttp;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import k.w;
import kotlin.jvm.internal.k;

/* compiled from: AlioliHttpInterceptorFactory.kt */
public final class c {
    public static final c a = new c();

    private c() {
    }

    public final w a(Context context) {
        k.f(context, "context");
        return new b(context, 0, (TimeUnit) null, 6, (DefaultConstructorMarker) null);
    }
}

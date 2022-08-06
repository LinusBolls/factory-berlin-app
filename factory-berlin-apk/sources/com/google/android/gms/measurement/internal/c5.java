package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;
import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class c5 implements Thread.UncaughtExceptionHandler {
    private final String a;
    private final /* synthetic */ a5 b;

    public c5(a5 a5Var, String str) {
        this.b = a5Var;
        r.k(str);
        this.a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.i().E().b(this.a, th);
    }
}

package com.google.firebase.analytics.a;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.5.0 */
final /* synthetic */ class d implements Executor {

    /* renamed from: g  reason: collision with root package name */
    static final Executor f3861g = new d();

    private d() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}

package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class i {
    public static final Executor a = new a();
    static final Executor b = new a0();

    private static final class a implements Executor {

        /* renamed from: g  reason: collision with root package name */
        private final Handler f3322g = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f3322g.post(runnable);
        }
    }
}

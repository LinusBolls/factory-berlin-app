package com.microsoft.appcenter.utils;

import android.os.Handler;
import android.os.Looper;

/* compiled from: HandlerUtils */
public class e {
    static final Handler a = new Handler(Looper.getMainLooper());

    public static Handler a() {
        return a;
    }

    public static void b(Runnable runnable) {
        if (Thread.currentThread() == a.getLooper().getThread()) {
            runnable.run();
        } else {
            a.post(runnable);
        }
    }
}

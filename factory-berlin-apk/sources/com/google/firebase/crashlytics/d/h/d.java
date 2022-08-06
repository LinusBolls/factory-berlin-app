package com.google.firebase.crashlytics.d.h;

import android.os.Process;

/* compiled from: BackgroundPriorityRunnable */
public abstract class d implements Runnable {
    /* access modifiers changed from: protected */
    public abstract void a();

    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}

package com.microsoft.appcenter.utils;

import android.os.Process;

/* compiled from: ShutdownHelper */
public class j {
    public static void a(int i2) {
        Process.killProcess(Process.myPid());
        System.exit(i2);
    }
}

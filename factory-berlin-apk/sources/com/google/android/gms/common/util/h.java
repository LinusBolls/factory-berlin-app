package com.google.android.gms.common.util;

import android.os.SystemClock;

public class h implements e {
    private static final h a = new h();

    private h() {
    }

    public static e d() {
        return a;
    }

    public long a() {
        return System.nanoTime();
    }

    public long b() {
        return System.currentTimeMillis();
    }

    public long c() {
        return SystemClock.elapsedRealtime();
    }
}

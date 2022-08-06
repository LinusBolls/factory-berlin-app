package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.r;

public class j {
    public static <L> i<L> a(L l2, Looper looper, String str) {
        r.l(l2, "Listener must not be null");
        r.l(looper, "Looper must not be null");
        r.l(str, "Listener type must not be null");
        return new i<>(looper, l2, str);
    }
}

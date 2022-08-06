package com.microsoft.appcenter;

import com.microsoft.appcenter.utils.a;

/* compiled from: Flags */
public final class g {
    public static int a(int i2, boolean z) {
        int i3 = i2 & 255;
        if (i3 == 1 || i3 == 2) {
            return i3;
        }
        if (i3 != 0 && z) {
            a.i("AppCenter", "Invalid value=" + i3 + " for persistence flag, using NORMAL as a default.");
        }
        return 1;
    }
}

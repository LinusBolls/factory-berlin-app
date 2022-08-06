package com.microsoft.appcenter.distribute;

import android.content.Context;

/* compiled from: PermissionUtils */
public class f {
    public static boolean a(int[] iArr) {
        for (int i2 : iArr) {
            if (i2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] b(Context context, String... strArr) {
        if (strArr == null) {
            return null;
        }
        int[] iArr = new int[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            iArr[i2] = context.checkCallingOrSelfPermission(strArr[i2]);
        }
        return iArr;
    }
}

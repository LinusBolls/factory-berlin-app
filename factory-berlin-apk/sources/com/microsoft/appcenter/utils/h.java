package com.microsoft.appcenter.utils;

import android.os.Bundle;

/* compiled from: InstrumentationRegistryHelper */
public class h {
    private static final String[] a = {"androidx.test.platform.app.InstrumentationRegistry", "androidx.test.InstrumentationRegistry", "androidx.test.InstrumentationRegistry"};

    public static Bundle a() {
        String[] strArr = a;
        Exception e2 = null;
        int i2 = 0;
        while (i2 < strArr.length) {
            try {
                return (Bundle) b(strArr[i2]).getMethod("getArguments", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (Exception e3) {
                e2 = e3;
                i2++;
            }
        }
        throw new IllegalStateException(e2);
    }

    private static Class<?> b(String str) {
        return Class.forName(str);
    }
}

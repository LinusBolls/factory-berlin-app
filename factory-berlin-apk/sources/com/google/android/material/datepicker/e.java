package com.google.android.material.datepicker;

import android.os.Build;
import java.util.Date;
import java.util.Locale;

/* compiled from: DateStrings */
class e {
    static String a(long j2) {
        return b(j2, Locale.getDefault());
    }

    static String b(long j2, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return r.b(locale).format(new Date(j2));
        }
        return r.f(locale).format(new Date(j2));
    }

    static String c(long j2) {
        return d(j2, Locale.getDefault());
    }

    static String d(long j2, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return r.m(locale).format(new Date(j2));
        }
        return r.f(locale).format(new Date(j2));
    }
}

package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: UtcDates */
class r {
    static long a(long j2) {
        Calendar k2 = k();
        k2.setTimeInMillis(j2);
        return d(k2).getTimeInMillis();
    }

    @TargetApi(24)
    static DateFormat b(Locale locale) {
        return c("MMMEd", locale);
    }

    @TargetApi(24)
    private static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(j());
        return instanceForSkeleton;
    }

    static Calendar d(Calendar calendar) {
        Calendar l2 = l(calendar);
        Calendar k2 = k();
        k2.set(l2.get(1), l2.get(2), l2.get(5));
        return k2;
    }

    private static java.text.DateFormat e(int i2, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i2, locale);
        dateInstance.setTimeZone(h());
        return dateInstance;
    }

    static java.text.DateFormat f(Locale locale) {
        return e(0, locale);
    }

    private static SimpleDateFormat g(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(h());
        return simpleDateFormat;
    }

    private static TimeZone h() {
        return TimeZone.getTimeZone("UTC");
    }

    static Calendar i() {
        return d(Calendar.getInstance());
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static Calendar k() {
        return l((Calendar) null);
    }

    static Calendar l(Calendar calendar) {
        Calendar instance = Calendar.getInstance(h());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    @TargetApi(24)
    static DateFormat m(Locale locale) {
        return c("yMMMEd", locale);
    }

    static SimpleDateFormat n() {
        return o(Locale.getDefault());
    }

    private static SimpleDateFormat o(Locale locale) {
        return g("MMMM, yyyy", locale);
    }
}

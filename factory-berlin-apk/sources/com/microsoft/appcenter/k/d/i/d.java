package com.microsoft.appcenter.k.d.i;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;

/* compiled from: JSONDateUtils */
public final class d {
    private static final ThreadLocal<DateFormat> a = new a();

    /* compiled from: JSONDateUtils */
    static class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    }

    private static void a(Object obj) {
        if (obj == null) {
            throw new JSONException("date cannot be null");
        }
    }

    public static Date b(String str) {
        a(str);
        try {
            return a.get().parse(str);
        } catch (ParseException e2) {
            throw new JSONException(e2.getMessage());
        }
    }

    public static String c(Date date) {
        a(date);
        return a.get().format(date);
    }
}

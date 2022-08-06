package com.google.gson;

import com.google.gson.internal.d;
import com.google.gson.internal.i;
import com.google.gson.stream.b;
import com.google.gson.stream.c;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: DefaultDateTypeAdapter */
final class a extends s<Date> {
    private final Class<? extends Date> a;
    private final List<DateFormat> b = new ArrayList();

    a(Class<? extends Date> cls, String str) {
        g(cls);
        this.a = cls;
        this.b.add(new SimpleDateFormat(str, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.b.add(new SimpleDateFormat(str));
        }
    }

    private Date e(String str) {
        synchronized (this.b) {
            for (DateFormat parse : this.b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                Date c = com.google.gson.internal.bind.d.a.c(str, new ParsePosition(0));
                return c;
            } catch (ParseException e2) {
                throw new JsonSyntaxException(str, e2);
            }
        }
    }

    private static Class<? extends Date> g(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* renamed from: f */
    public Date b(com.google.gson.stream.a aVar) {
        if (aVar.Z() == b.NULL) {
            aVar.L();
            return null;
        }
        Date e2 = e(aVar.nextString());
        Class<? extends Date> cls = this.a;
        if (cls == Date.class) {
            return e2;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(e2.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(e2.getTime());
        }
        throw new AssertionError();
    }

    /* renamed from: h */
    public void d(c cVar, Date date) {
        if (date == null) {
            cVar.D();
            return;
        }
        synchronized (this.b) {
            cVar.w0(this.b.get(0).format(date));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public a(Class<? extends Date> cls, int i2, int i3) {
        g(cls);
        this.a = cls;
        this.b.add(DateFormat.getDateTimeInstance(i2, i3, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.b.add(DateFormat.getDateTimeInstance(i2, i3));
        }
        if (d.e()) {
            this.b.add(i.c(i2, i3));
        }
    }
}

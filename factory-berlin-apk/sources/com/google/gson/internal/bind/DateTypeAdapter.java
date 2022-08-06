package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.f;
import com.google.gson.internal.d;
import com.google.gson.internal.i;
import com.google.gson.s;
import com.google.gson.stream.b;
import com.google.gson.stream.c;
import com.google.gson.t;
import com.google.gson.u.a;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class DateTypeAdapter extends s<Date> {
    public static final t b = new t() {
        public <T> s<T> c(f fVar, a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };
    private final List<DateFormat> a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.a.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (d.e()) {
            this.a.add(i.c(2, 2));
        }
    }

    private synchronized Date e(String str) {
        for (DateFormat parse : this.a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return com.google.gson.internal.bind.d.a.c(str, new ParsePosition(0));
        } catch (ParseException e2) {
            throw new JsonSyntaxException(str, e2);
        }
    }

    /* renamed from: f */
    public Date b(com.google.gson.stream.a aVar) {
        if (aVar.Z() != b.NULL) {
            return e(aVar.nextString());
        }
        aVar.L();
        return null;
    }

    /* renamed from: g */
    public synchronized void d(c cVar, Date date) {
        if (date == null) {
            cVar.D();
        } else {
            cVar.w0(this.a.get(0).format(date));
        }
    }
}

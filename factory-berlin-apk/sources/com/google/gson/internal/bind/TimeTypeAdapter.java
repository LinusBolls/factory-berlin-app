package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.f;
import com.google.gson.s;
import com.google.gson.stream.b;
import com.google.gson.stream.c;
import com.google.gson.t;
import com.google.gson.u.a;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class TimeTypeAdapter extends s<Time> {
    public static final t b = new t() {
        public <T> s<T> c(f fVar, a<T> aVar) {
            if (aVar.c() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: e */
    public synchronized Time b(com.google.gson.stream.a aVar) {
        if (aVar.Z() == b.NULL) {
            aVar.L();
            return null;
        }
        try {
            return new Time(this.a.parse(aVar.nextString()).getTime());
        } catch (ParseException e2) {
            throw new JsonSyntaxException((Throwable) e2);
        }
    }

    /* renamed from: f */
    public synchronized void d(c cVar, Time time) {
        cVar.w0(time == null ? null : this.a.format(time));
    }
}

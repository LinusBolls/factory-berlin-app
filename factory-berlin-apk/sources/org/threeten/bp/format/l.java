package org.threeten.bp.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.s.h;

/* compiled from: SimpleDateTimeFormatStyleProvider */
final class l extends b {
    private static final ConcurrentMap<String, Object> a = new ConcurrentHashMap(16, 0.75f, 2);

    l() {
    }

    private int c(i iVar) {
        return iVar.ordinal();
    }

    public c a(i iVar, i iVar2, h hVar, Locale locale) {
        DateFormat dateFormat;
        if (iVar == null && iVar2 == null) {
            throw new IllegalArgumentException("Date and Time style must not both be null");
        }
        String str = hVar.p() + '|' + locale.toString() + '|' + iVar + iVar2;
        Object obj = a.get(str);
        if (obj == null) {
            if (iVar == null) {
                dateFormat = DateFormat.getTimeInstance(c(iVar2), locale);
            } else if (iVar2 != null) {
                dateFormat = DateFormat.getDateTimeInstance(c(iVar), c(iVar2), locale);
            } else {
                dateFormat = DateFormat.getDateInstance(c(iVar), locale);
            }
            if (dateFormat instanceof SimpleDateFormat) {
                String pattern = ((SimpleDateFormat) dateFormat).toPattern();
                d dVar = new d();
                dVar.k(pattern);
                c F = dVar.F(locale);
                a.putIfAbsent(str, F);
                return F;
            }
            a.putIfAbsent(str, "");
            throw new IllegalArgumentException("Unable to convert DateFormat to DateTimeFormatter");
        } else if (!obj.equals("")) {
            return (c) obj;
        } else {
            throw new IllegalArgumentException("Unable to convert DateFormat to DateTimeFormatter");
        }
    }
}

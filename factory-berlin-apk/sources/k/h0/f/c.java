package k.h0.f;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import k.h0.b;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: dates.kt */
public final class c {
    private static final a a = new a();
    private static final String[] b;
    private static final DateFormat[] c;

    /* compiled from: dates.kt */
    public static final class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(b.f10363e);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        b = strArr;
        c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        k.f(str, "$this$toHttpDateOrNull");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (b) {
            int length = b.length;
            for (int i2 = 0; i2 < length; i2++) {
                DateFormat dateFormat = c[i2];
                SimpleDateFormat simpleDateFormat = dateFormat;
                if (dateFormat == null) {
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(b[i2], Locale.US);
                    simpleDateFormat2.setTimeZone(b.f10363e);
                    c[i2] = simpleDateFormat2;
                    simpleDateFormat = simpleDateFormat2;
                }
                parsePosition.setIndex(0);
                Date parse2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            x xVar = x.a;
            return null;
        }
    }

    public static final String b(Date date) {
        k.f(date, "$this$toHttpDateString");
        String format = ((DateFormat) a.get()).format(date);
        k.b(format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}

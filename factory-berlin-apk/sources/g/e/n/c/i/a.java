package g.e.n.c.i;

import kotlin.jvm.internal.k;
import org.threeten.bp.d;
import org.threeten.bp.format.DateTimeParseException;
import org.threeten.bp.format.c;

/* compiled from: DateTimeConverter.kt */
public final class a {
    private static final c a = c.f11508l;
    public static final a b = new a();

    private a() {
    }

    public final Long a(String str) {
        k.e(str, "iso8601");
        try {
            return Long.valueOf(d.V(str).e0());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    public final String b(long j2) {
        String b2 = a.b(d.S(j2));
        k.d(b2, "parser.format(Instant.ofEpochMilli(epochMillis))");
        return b2;
    }
}

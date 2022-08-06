package g.e.n.c.i;

import kotlin.jvm.internal.k;
import org.threeten.bp.LocalDate;
import org.threeten.bp.d;
import org.threeten.bp.e;
import org.threeten.bp.o;

/* compiled from: DateTimeConverter.kt */
public final class b {
    public static final d a(LocalDate localDate) {
        k.e(localDate, "$this$toInstant");
        e W = localDate.W();
        k.d(W, "atStartOfDay()");
        return b(W);
    }

    public static final d b(e eVar) {
        k.e(eVar, "$this$toInstant");
        d Q = eVar.D(o.C()).Q();
        k.d(Q, "atZone(ZoneId.systemDefault()).toInstant()");
        return Q;
    }

    public static final String c(e eVar) {
        k.e(eVar, "$this$toIso8601");
        return a.b.b(e(eVar));
    }

    public static final long d(LocalDate localDate) {
        k.e(localDate, "$this$toMillis");
        return a(localDate).e0();
    }

    public static final long e(e eVar) {
        k.e(eVar, "$this$toMillis");
        return b(eVar).e0();
    }
}

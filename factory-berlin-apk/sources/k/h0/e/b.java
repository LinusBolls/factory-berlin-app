package k.h0.e;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;

/* compiled from: TaskLogger.kt */
public final class b {
    public static final String b(long j2) {
        String str;
        if (j2 <= ((long) -999500000)) {
            str = ((j2 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j2 <= ((long) -999500)) {
            str = ((j2 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j2 < ((long) 999500)) {
            str = ((j2 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j2 < ((long) 999500000)) {
            str = ((j2 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j2 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        x xVar = x.a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        k.b(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* access modifiers changed from: private */
    public static final void c(a aVar, d dVar, String str) {
        Logger a = e.f10414j.a();
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.f());
        sb.append(' ');
        x xVar = x.a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        k.b(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.b());
        a.fine(sb.toString());
    }
}

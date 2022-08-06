package k.h0.i.i;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.k;

/* compiled from: AndroidLog.kt */
public final class d extends Handler {
    public static final d a = new d();

    private d() {
    }

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        k.f(logRecord, "record");
        c cVar = c.c;
        String loggerName = logRecord.getLoggerName();
        k.b(loggerName, "record.loggerName");
        int a2 = e.b(logRecord);
        String message = logRecord.getMessage();
        k.b(message, "record.message");
        cVar.a(loggerName, a2, message, logRecord.getThrown());
    }
}

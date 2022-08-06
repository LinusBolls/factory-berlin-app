package k.h0.i.i;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: AndroidLog.kt */
public final class e {
    /* access modifiers changed from: private */
    public static final int b(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
    }
}

package kotlinx.coroutines.internal;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: Concurrent.kt */
public final class e {
    private static final Method a;

    static {
        Method method;
        Class<ScheduledThreadPoolExecutor> cls = ScheduledThreadPoolExecutor.class;
        try {
            method = cls.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
            method = null;
        }
        a = method;
    }

    public static final boolean a(Executor executor) {
        Method method;
        try {
            if (!(executor instanceof ScheduledThreadPoolExecutor)) {
                executor = null;
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            if (!(scheduledThreadPoolExecutor == null || (method = a) == null)) {
                method.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}

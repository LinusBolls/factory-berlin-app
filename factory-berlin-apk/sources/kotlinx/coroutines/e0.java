package kotlinx.coroutines;

import java.util.List;
import kotlin.c0.g;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
public final class e0 {
    private static final List<CoroutineExceptionHandler> a = j.j(h.a(a.a()));

    public static final void a(g gVar, Throwable th) {
        for (CoroutineExceptionHandler handleException : a) {
            try {
                handleException.handleException(gVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, f0.b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}

package kotlinx.coroutines;

import kotlin.c0.g;

/* compiled from: CoroutineExceptionHandler.kt */
public final class f0 {
    public static final void a(g gVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) gVar.get(CoroutineExceptionHandler.f10709d);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(gVar, th);
            } else {
                e0.a(gVar, th);
            }
        } catch (Throwable th2) {
            e0.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        b.a(runtimeException, th);
        return runtimeException;
    }
}

package m.a.c.d;

import kotlin.jvm.internal.k;
import m.a.c.b;
import org.koin.core.error.KoinAppAlreadyStartedException;

/* compiled from: GlobalContext.kt */
public final class a {
    private static b a;

    public static final b a() {
        b bVar = a;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("KoinApplication has not been started".toString());
    }

    public static final void b(b bVar) {
        k.f(bVar, "koinApplication");
        if (a == null) {
            a = bVar;
            return;
        }
        throw new KoinAppAlreadyStartedException("A Koin Application has already been started");
    }
}

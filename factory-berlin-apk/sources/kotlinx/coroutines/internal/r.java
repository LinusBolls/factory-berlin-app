package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.h2;

/* compiled from: MainDispatchers.kt */
public final class r {
    private static final boolean a = true;

    private static final s a(Throwable th, String str) {
        if (a) {
            return new s(th, str);
        }
        if (th != null) {
            throw th;
        }
        c();
        throw null;
    }

    static /* synthetic */ s b(Throwable th, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            th = null;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final Void c() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final h2 d(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.b(list);
        } catch (Throwable th) {
            return a(th, mainDispatcherFactory.a());
        }
    }
}

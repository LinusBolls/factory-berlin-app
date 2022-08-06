package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.h2;

/* compiled from: MainDispatchers.kt */
public final class q {
    private static final boolean a = y.e("kotlinx.coroutines.fast.service.loader", true);
    public static final h2 b;

    static {
        q qVar = new q();
        b = qVar.a();
    }

    private q() {
    }

    private final h2 a() {
        List<MainDispatcherFactory> list;
        T t;
        h2 d2;
        try {
            if (a) {
                list = h.a.c();
            } else {
                list = j.j(h.a(a.b()));
            }
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                t = null;
            } else {
                t = it.next();
                if (it.hasNext()) {
                    int c = ((MainDispatcherFactory) t).c();
                    do {
                        T next = it.next();
                        int c2 = ((MainDispatcherFactory) next).c();
                        if (c < c2) {
                            t = next;
                            c = c2;
                        }
                    } while (it.hasNext());
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) t;
            if (mainDispatcherFactory == null || (d2 = r.d(mainDispatcherFactory, list)) == null) {
                return r.b((Throwable) null, (String) null, 3, (Object) null);
            }
            return d2;
        } catch (Throwable th) {
            return r.b(th, (String) null, 2, (Object) null);
        }
    }
}

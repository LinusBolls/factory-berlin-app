package g.e.h.a;

import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: Event.kt */
public final class a<T> {
    private boolean a;
    private final T b;

    public a(T t) {
        this.b = t;
    }

    public final void a(l<? super T, x> lVar) {
        k.f(lVar, "block");
        Object b2 = b();
        if (b2 != null) {
            x o = lVar.o(b2);
        }
    }

    public final T b() {
        T t;
        synchronized (this) {
            if (this.a) {
                t = null;
            } else {
                this.a = true;
                t = this.b;
            }
        }
        return t;
    }
}

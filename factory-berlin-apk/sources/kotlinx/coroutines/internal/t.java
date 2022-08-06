package kotlinx.coroutines.internal;

import kotlinx.coroutines.o0;

/* compiled from: Atomic.kt */
public abstract class t {
    public abstract d<?> a();

    public final boolean b(t tVar) {
        d<?> a;
        d<?> a2 = a();
        if (a2 == null || (a = tVar.a()) == null || a2.f() >= a.f()) {
            return false;
        }
        return true;
    }

    public abstract Object c(Object obj);

    public String toString() {
        return o0.a(this) + '@' + o0.b(this);
    }
}

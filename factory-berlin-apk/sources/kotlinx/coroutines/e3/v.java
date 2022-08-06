package kotlinx.coroutines.e3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.c0.d;
import kotlin.c0.j.a.b;
import kotlin.c0.j.a.h;
import kotlin.k;
import kotlin.x;
import kotlinx.coroutines.j;
import kotlinx.coroutines.n0;

/* compiled from: StateFlow.kt */
final class v {
    static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "_state");
    volatile Object _state = null;

    public final boolean a() {
        if (this._state != null) {
            return false;
        }
        this._state = u.a;
        return true;
    }

    public final Object b(d<? super x> dVar) {
        boolean z = true;
        j jVar = new j(c.b(dVar), 1);
        jVar.w();
        if (!n0.a() || b.a(!(this._state instanceof j)).booleanValue()) {
            if (!a.compareAndSet(this, u.a, jVar)) {
                if (n0.a()) {
                    if (this._state != u.b) {
                        z = false;
                    }
                    if (!b.a(z).booleanValue()) {
                        throw new AssertionError();
                    }
                }
                x xVar = x.a;
                k.a aVar = k.f10687h;
                k.a(xVar);
                jVar.m(xVar);
            }
            Object u = jVar.u();
            if (u == d.c()) {
                h.c(dVar);
            }
            return u;
        }
        throw new AssertionError();
    }

    public final void c() {
        this._state = null;
    }

    public final void d() {
        while (true) {
            Object obj = this._state;
            if (obj != null && obj != u.b) {
                if (obj == u.a) {
                    if (a.compareAndSet(this, obj, u.b)) {
                        return;
                    }
                } else if (a.compareAndSet(this, obj, u.a)) {
                    x xVar = x.a;
                    k.a aVar = k.f10687h;
                    k.a(xVar);
                    ((j) obj).m(xVar);
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean e() {
        Object andSet = a.getAndSet(this, u.a);
        if (andSet == null) {
            kotlin.jvm.internal.k.m();
            throw null;
        } else if (n0.a() && !(!(andSet instanceof j))) {
            throw new AssertionError();
        } else if (andSet == u.b) {
            return true;
        } else {
            return false;
        }
    }
}

package kotlinx.coroutines;

import kotlin.TypeCastException;
import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.e;
import kotlin.k;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.w;

/* compiled from: DispatchedTask.kt */
public final class y0 {
    public static final <T> void a(x0<? super T> x0Var, int i2) {
        d<? super T> b = x0Var.b();
        if (!c(i2) || !(b instanceof u0) || b(i2) != b(x0Var.f11075i)) {
            d(x0Var, b, i2);
            return;
        }
        d0 d0Var = ((u0) b).f11068m;
        g c = b.c();
        if (d0Var.n0(c)) {
            d0Var.i0(c, x0Var);
        } else {
            e(x0Var);
        }
    }

    public static final boolean b(int i2) {
        return i2 == 1;
    }

    public static final boolean c(int i2) {
        return i2 == 0 || i2 == 1;
    }

    public static final <T> void d(x0<? super T> x0Var, d<? super T> dVar, int i2) {
        Object obj;
        Object i3 = x0Var.i();
        Throwable d2 = x0Var.d(i3);
        if (d2 == null) {
            d2 = null;
        } else if (n0.d() && (dVar instanceof e)) {
            d2 = w.j(d2, (e) dVar);
        }
        if (d2 != null) {
            k.a aVar = k.f10687h;
            obj = l.a(d2);
        } else {
            k.a aVar2 = k.f10687h;
            obj = x0Var.g(i3);
        }
        k.a(obj);
        if (i2 == 0) {
            dVar.m(obj);
        } else if (i2 == 1) {
            v0.b(dVar, obj);
        } else if (i2 != 2) {
            throw new IllegalStateException(("Invalid mode " + i2).toString());
        } else if (dVar != null) {
            u0 u0Var = (u0) dVar;
            g c = u0Var.c();
            Object c2 = b0.c(c, u0Var.f11067l);
            try {
                u0Var.f11069n.m(obj);
                x xVar = x.a;
            } finally {
                b0.a(c, c2);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        }
    }

    private static final void e(x0<?> x0Var) {
        g1 a = v2.b.a();
        if (a.I0()) {
            a.w0(x0Var);
            return;
        }
        a.G0(true);
        try {
            d(x0Var, x0Var.b(), 2);
            do {
            } while (a.K0());
        } catch (Throwable th) {
            a.r0(true);
            throw th;
        }
        a.r0(true);
    }
}

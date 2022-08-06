package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.k;
import kotlin.l;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.x;

/* compiled from: DispatchedContinuation.kt */
public final class v0 {
    /* access modifiers changed from: private */
    public static final x a = new x("UNDEFINED");
    public static final x b = new x("REUSABLE_CLAIMED");

    public static final <T> void b(d<? super T> dVar, Object obj) {
        boolean z;
        g c;
        Object c2;
        if (dVar instanceof u0) {
            u0 u0Var = (u0) dVar;
            Object b2 = x.b(obj);
            if (u0Var.f11068m.n0(u0Var.c())) {
                u0Var.f11065j = b2;
                u0Var.f11075i = 1;
                u0Var.f11068m.i0(u0Var.c(), u0Var);
                return;
            }
            g1 a2 = v2.b.a();
            if (a2.I0()) {
                u0Var.f11065j = b2;
                u0Var.f11075i = 1;
                a2.w0(u0Var);
                return;
            }
            a2.G0(true);
            try {
                x1 x1Var = (x1) u0Var.c().get(x1.f11076e);
                if (x1Var == null || x1Var.b()) {
                    z = false;
                } else {
                    CancellationException K = x1Var.K();
                    k.a aVar = k.f10687h;
                    Object a3 = l.a(K);
                    k.a(a3);
                    u0Var.m(a3);
                    z = true;
                }
                if (!z) {
                    c = u0Var.c();
                    c2 = b0.c(c, u0Var.f11067l);
                    u0Var.f11069n.m(obj);
                    kotlin.x xVar = kotlin.x.a;
                    b0.a(c, c2);
                }
                do {
                } while (a2.K0());
            } catch (Throwable th) {
                try {
                    u0Var.h(th, (Throwable) null);
                } catch (Throwable th2) {
                    a2.r0(true);
                    throw th2;
                }
            }
            a2.r0(true);
            return;
        }
        dVar.m(obj);
    }

    public static final boolean c(u0<? super kotlin.x> u0Var) {
        kotlin.x xVar = kotlin.x.a;
        g1 a2 = v2.b.a();
        if (a2.J0()) {
            return false;
        }
        if (a2.I0()) {
            u0Var.f11065j = xVar;
            u0Var.f11075i = 1;
            a2.w0(u0Var);
            return true;
        }
        a2.G0(true);
        try {
            u0Var.run();
            do {
            } while (a2.K0());
        } catch (Throwable th) {
            a2.r0(true);
            throw th;
        }
        a2.r0(true);
        return false;
    }
}

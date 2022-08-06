package kotlinx.coroutines;

import kotlin.TypeCastException;
import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.e;
import kotlin.jvm.internal.k;
import kotlin.k;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.g3.i;
import kotlinx.coroutines.g3.j;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.w;

/* compiled from: DispatchedTask.kt */
public abstract class x0<T> extends i {

    /* renamed from: i  reason: collision with root package name */
    public int f11075i;

    public x0(int i2) {
        this.f11075i = i2;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract d<T> b();

    public final Throwable d(Object obj) {
        if (!(obj instanceof w)) {
            obj = null;
        }
        w wVar = (w) obj;
        if (wVar != null) {
            return wVar.a;
        }
        return null;
    }

    public <T> T g(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                b.a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            String str = "Fatal exception in coroutines machinery for " + this + ". " + "Please read KDoc to 'handleFatalException' method and report this incident to maintainers";
            if (th != null) {
                f0.a(b().c(), new m0(str, th));
                return;
            }
            k.m();
            throw null;
        }
    }

    public abstract Object i();

    public final void run() {
        Object obj;
        g c;
        Object c2;
        Object obj2;
        j jVar = this.f10981h;
        try {
            d b = b();
            if (b != null) {
                u0 u0Var = (u0) b;
                d<T> dVar = u0Var.f11069n;
                c = dVar.c();
                Object i2 = i();
                c2 = b0.c(c, u0Var.f11067l);
                Throwable d2 = d(i2);
                x1 x1Var = y0.b(this.f11075i) ? (x1) c.get(x1.f11076e) : null;
                if (d2 == null && x1Var != null && !x1Var.b()) {
                    Throwable K = x1Var.K();
                    a(i2, K);
                    k.a aVar = kotlin.k.f10687h;
                    if (n0.d()) {
                        if (dVar instanceof e) {
                            K = w.j(K, (e) dVar);
                        }
                    }
                    Object a = l.a(K);
                    kotlin.k.a(a);
                    dVar.m(a);
                } else if (d2 != null) {
                    k.a aVar2 = kotlin.k.f10687h;
                    Object a2 = l.a(d2);
                    kotlin.k.a(a2);
                    dVar.m(a2);
                } else {
                    Object g2 = g(i2);
                    k.a aVar3 = kotlin.k.f10687h;
                    kotlin.k.a(g2);
                    dVar.m(g2);
                }
                x xVar = x.a;
                b0.a(c, c2);
                try {
                    k.a aVar4 = kotlin.k.f10687h;
                    jVar.k();
                    obj2 = x.a;
                    kotlin.k.a(obj2);
                } catch (Throwable th) {
                    k.a aVar5 = kotlin.k.f10687h;
                    obj2 = l.a(th);
                    kotlin.k.a(obj2);
                }
                h((Throwable) null, kotlin.k.c(obj2));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        } catch (Throwable th2) {
            try {
                k.a aVar6 = kotlin.k.f10687h;
                jVar.k();
                obj = x.a;
                kotlin.k.a(obj);
            } catch (Throwable th3) {
                k.a aVar7 = kotlin.k.f10687h;
                obj = l.a(th3);
                kotlin.k.a(obj);
            }
            h(th2, kotlin.k.c(obj));
        }
    }
}

package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.e;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.x;

/* compiled from: DispatchedContinuation.kt */
public final class u0<T> extends x0<T> implements e, d<T> {
    private static final AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: j  reason: collision with root package name */
    public Object f11065j = v0.a;

    /* renamed from: k  reason: collision with root package name */
    private final e f11066k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f11067l;

    /* renamed from: m  reason: collision with root package name */
    public final d0 f11068m;

    /* renamed from: n  reason: collision with root package name */
    public final d<T> f11069n;

    public u0(d0 d0Var, d<? super T> dVar) {
        super(0);
        this.f11068m = d0Var;
        this.f11069n = dVar;
        d<T> dVar2 = this.f11069n;
        this.f11066k = (e) (!(dVar2 instanceof e) ? null : dVar2);
        this.f11067l = b0.b(c());
        this._reusableCancellableContinuation = null;
    }

    public StackTraceElement C() {
        return null;
    }

    public d<T> b() {
        return this;
    }

    public g c() {
        return this.f11069n.c();
    }

    public Object i() {
        Object obj = this.f11065j;
        if (n0.a()) {
            if (!(obj != v0.a)) {
                throw new AssertionError();
            }
        }
        this.f11065j = v0.a;
        return obj;
    }

    public e j() {
        return this.f11066k;
    }

    public final Throwable k(i<?> iVar) {
        x xVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            xVar = v0.b;
            if (obj != xVar) {
                if (obj == null) {
                    return null;
                }
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (o.compareAndSet(this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!o.compareAndSet(this, xVar, iVar));
        return null;
    }

    public final j<T> l() {
        Object obj;
        do {
            obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = v0.b;
                return null;
            } else if (!(obj instanceof j)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!o.compareAndSet(this, obj, v0.b));
        return (j) obj;
    }

    public void m(Object obj) {
        g c;
        Object c2;
        g c3 = this.f11069n.c();
        Object b = x.b(obj);
        if (this.f11068m.n0(c3)) {
            this.f11065j = b;
            this.f11075i = 0;
            this.f11068m.i0(c3, this);
            return;
        }
        g1 a = v2.b.a();
        if (a.I0()) {
            this.f11065j = b;
            this.f11075i = 0;
            a.w0(this);
            return;
        }
        a.G0(true);
        try {
            c = c();
            c2 = b0.c(c, this.f11067l);
            this.f11069n.m(obj);
            kotlin.x xVar = kotlin.x.a;
            b0.a(c, c2);
            do {
            } while (a.K0());
        } catch (Throwable th) {
            try {
                h(th, (Throwable) null);
            } catch (Throwable th2) {
                a.r0(true);
                throw th2;
            }
        }
        a.r0(true);
    }

    public final void n(g gVar, T t) {
        this.f11065j = t;
        this.f11075i = 1;
        this.f11068m.l0(gVar, this);
    }

    public final j<?> o() {
        Object obj = this._reusableCancellableContinuation;
        if (!(obj instanceof j)) {
            obj = null;
        }
        return (j) obj;
    }

    public final boolean p(j<?> jVar) {
        Object obj = this._reusableCancellableContinuation;
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof j) || obj == jVar) {
            return true;
        }
        return false;
    }

    public final boolean q(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (k.a(obj, v0.b)) {
                if (o.compareAndSet(this, v0.b, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (o.compareAndSet(this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f11068m + ", " + o0.c(this.f11069n) + ']';
    }
}

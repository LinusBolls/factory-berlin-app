package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.e;
import kotlin.e0.c.l;
import kotlin.x;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.x1;

/* compiled from: CancellableContinuationImpl.kt */
public class j<T> extends x0<T> implements i<T>, e {

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f11030l = AtomicIntegerFieldUpdater.newUpdater(j.class, "_decision");

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f11031m = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_state");
    private volatile int _decision = 0;
    private volatile Object _parentHandle = null;
    private volatile Object _state = b.f10725g;

    /* renamed from: j  reason: collision with root package name */
    private final g f11032j;

    /* renamed from: k  reason: collision with root package name */
    private final d<T> f11033k;

    public j(d<? super T> dVar, int i2) {
        super(i2);
        this.f11033k = dVar;
        this.f11032j = dVar.c();
    }

    private final void A(l<? super Throwable, x> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    private final m I(Object obj, int i2) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof k2)) {
                if (obj2 instanceof m) {
                    m mVar = (m) obj2;
                    if (mVar.c()) {
                        return mVar;
                    }
                }
                k(obj);
                throw null;
            }
        } while (!f11031m.compareAndSet(this, obj2, obj));
        p();
        q(i2);
        return null;
    }

    private final void J(c1 c1Var) {
        this._parentHandle = c1Var;
    }

    private final void K() {
        x1 x1Var;
        if (!n() && t() == null && (x1Var = (x1) this.f11033k.c().get(x1.f11076e)) != null) {
            x1Var.start();
            c1 e2 = x1.a.e(x1Var, true, false, new n(x1Var, this), 2, (Object) null);
            J(e2);
            if (x() && !y()) {
                e2.a();
                J(j2.f11034g);
            }
        }
    }

    private final boolean L() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f11030l.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean M() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f11030l.compareAndSet(this, 0, 1));
        return true;
    }

    private final void k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final boolean l(Throwable th) {
        if (this.f11075i != 0) {
            return false;
        }
        d<T> dVar = this.f11033k;
        if (!(dVar instanceof u0)) {
            dVar = null;
        }
        u0 u0Var = (u0) dVar;
        if (u0Var != null) {
            return u0Var.q(th);
        }
        return false;
    }

    private final boolean n() {
        Throwable k2;
        boolean x = x();
        if (this.f11075i != 0) {
            return x;
        }
        d<T> dVar = this.f11033k;
        if (!(dVar instanceof u0)) {
            dVar = null;
        }
        u0 u0Var = (u0) dVar;
        if (u0Var == null || (k2 = u0Var.k(this)) == null) {
            return x;
        }
        if (!x) {
            r(k2);
        }
        return true;
    }

    private final void p() {
        if (!y()) {
            o();
        }
    }

    private final void q(int i2) {
        if (!L()) {
            y0.a(this, i2);
        }
    }

    private final c1 t() {
        return (c1) this._parentHandle;
    }

    private final boolean y() {
        d<T> dVar = this.f11033k;
        return (dVar instanceof u0) && ((u0) dVar).p(this);
    }

    private final g z(l<? super Throwable, x> lVar) {
        return lVar instanceof g ? (g) lVar : new u1(lVar);
    }

    public void B(l<? super Throwable, x> lVar) {
        Object obj;
        Throwable th = null;
        g gVar = null;
        do {
            obj = this._state;
            if (obj instanceof b) {
                if (gVar == null) {
                    gVar = z(lVar);
                }
            } else if (obj instanceof g) {
                A(lVar, obj);
                throw null;
            } else if (!(obj instanceof m)) {
                return;
            } else {
                if (((m) obj).b()) {
                    try {
                        if (!(obj instanceof w)) {
                            obj = null;
                        }
                        w wVar = (w) obj;
                        if (wVar != null) {
                            th = wVar.a;
                        }
                        lVar.o(th);
                        return;
                    } catch (Throwable th2) {
                        f0.a(c(), new CompletionHandlerException("Exception in cancellation handler for " + this, th2));
                        return;
                    }
                } else {
                    A(lVar, obj);
                    throw null;
                }
            }
        } while (!f11031m.compareAndSet(this, obj, gVar));
    }

    public StackTraceElement C() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String D() {
        return "CancellableContinuation";
    }

    public Object E(Throwable th) {
        Object obj;
        do {
            obj = this._state;
            if (!(obj instanceof k2)) {
                return null;
            }
        } while (!f11031m.compareAndSet(this, obj, new w(th, false, 2, (DefaultConstructorMarker) null)));
        p();
        return k.a;
    }

    public final void F(Throwable th) {
        if (!l(th)) {
            r(th);
            p();
        }
    }

    public void G(Object obj) {
        if (n0.a()) {
            if (!(obj == k.a)) {
                throw new AssertionError();
            }
        }
        q(this.f11075i);
    }

    public final boolean H() {
        if (n0.a()) {
            if (!(t() != j2.f11034g)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (n0.a() && !(!(obj instanceof k2))) {
            throw new AssertionError();
        } else if (obj instanceof y) {
            o();
            return false;
        } else {
            this._decision = 0;
            this._state = b.f10725g;
            return true;
        }
    }

    public void a(Object obj, Throwable th) {
        if (obj instanceof z) {
            try {
                ((z) obj).b.o(th);
            } catch (Throwable th2) {
                g c = c();
                f0.a(c, new CompletionHandlerException("Exception in cancellation handler for " + this, th2));
            }
        }
    }

    public final d<T> b() {
        return this.f11033k;
    }

    public g c() {
        return this.f11032j;
    }

    public Object e(T t, Object obj) {
        Object obj2;
        T t2;
        do {
            obj2 = this._state;
            if (obj2 instanceof k2) {
                if (obj == null) {
                    t2 = t;
                } else {
                    t2 = new y(obj, t);
                }
            } else if (!(obj2 instanceof y)) {
                return null;
            } else {
                y yVar = (y) obj2;
                if (yVar.a != obj) {
                    return null;
                }
                if (n0.a()) {
                    if (!(yVar.b == t)) {
                        throw new AssertionError();
                    }
                }
                return k.a;
            }
        } while (!f11031m.compareAndSet(this, obj2, t2));
        p();
        return k.a;
    }

    public void f(d0 d0Var, T t) {
        d<T> dVar = this.f11033k;
        d0 d0Var2 = null;
        if (!(dVar instanceof u0)) {
            dVar = null;
        }
        u0 u0Var = (u0) dVar;
        if (u0Var != null) {
            d0Var2 = u0Var.f11068m;
        }
        I(t, d0Var2 == d0Var ? 2 : this.f11075i);
    }

    public <T> T g(Object obj) {
        if (obj instanceof y) {
            return ((y) obj).b;
        }
        return obj instanceof z ? ((z) obj).a : obj;
    }

    public Object i() {
        return v();
    }

    public e j() {
        d<T> dVar = this.f11033k;
        if (!(dVar instanceof e)) {
            dVar = null;
        }
        return (e) dVar;
    }

    public void m(Object obj) {
        I(x.c(obj, this), this.f11075i);
    }

    public final void o() {
        c1 t = t();
        if (t != null) {
            t.a();
        }
        J(j2.f11034g);
    }

    public boolean r(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof k2)) {
                return false;
            }
            z = obj instanceof g;
        } while (!f11031m.compareAndSet(this, obj, new m(this, th, z)));
        if (z) {
            try {
                ((g) obj).a(th);
            } catch (Throwable th2) {
                g c = c();
                f0.a(c, new CompletionHandlerException("Exception in cancellation handler for " + this, th2));
            }
        }
        p();
        q(0);
        return true;
    }

    public Throwable s(x1 x1Var) {
        return x1Var.K();
    }

    public String toString() {
        return D() + '(' + o0.c(this.f11033k) + "){" + v() + "}@" + o0.b(this);
    }

    public final Object u() {
        x1 x1Var;
        K();
        if (M()) {
            return d.c();
        }
        Object v = v();
        if (v instanceof w) {
            Throwable th = ((w) v).a;
            if (n0.d()) {
                th = w.j(th, this);
            }
            throw th;
        } else if (this.f11075i != 1 || (x1Var = (x1) c().get(x1.f11076e)) == null || x1Var.b()) {
            return g(v);
        } else {
            Throwable K = x1Var.K();
            a(v, K);
            if (n0.d()) {
                K = w.j(K, this);
            }
            throw K;
        }
    }

    public final Object v() {
        return this._state;
    }

    public void w() {
        K();
    }

    public boolean x() {
        return !(v() instanceof k2);
    }
}

package kotlinx.coroutines.h3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.TypeCastException;
import kotlin.c0.g;
import kotlin.c0.j.a.e;
import kotlin.e0.c.p;
import kotlin.k;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.f0;
import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.w;
import kotlinx.coroutines.x1;
import kotlinx.coroutines.y1;

/* compiled from: Select.kt */
public final class b<R> extends k implements a<R>, d<R>, kotlin.c0.d<R>, e {

    /* renamed from: k  reason: collision with root package name */
    static final AtomicReferenceFieldUpdater f10997k;

    /* renamed from: l  reason: collision with root package name */
    static final AtomicReferenceFieldUpdater f10998l;
    private volatile Object _parentHandle = null;
    volatile Object _result = e.c;
    volatile Object _state = e.e();

    /* renamed from: j  reason: collision with root package name */
    private final kotlin.c0.d<R> f10999j;

    /* compiled from: Select.kt */
    private static final class a extends kotlinx.coroutines.internal.d<Object> {
        private final long b = e.f11004e.a();
        public final b<?> c;

        /* renamed from: d  reason: collision with root package name */
        public final kotlinx.coroutines.internal.b f11000d;

        public a(b<?> bVar, kotlinx.coroutines.internal.b bVar2) {
            this.c = bVar;
            this.f11000d = bVar2;
            this.f11000d.d(this);
        }

        private final void i(Object obj) {
            boolean z = obj == null;
            if (b.f10997k.compareAndSet(this.c, this, z ? null : e.e()) && z) {
                this.c.a0();
            }
        }

        private final Object j() {
            b<?> bVar = this.c;
            while (true) {
                Object obj = bVar._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof t) {
                    ((t) obj).c(this.c);
                } else if (obj != e.e()) {
                    return e.d();
                } else {
                    if (b.f10997k.compareAndSet(this.c, e.e(), this)) {
                        return null;
                    }
                }
            }
        }

        private final void k() {
            b.f10997k.compareAndSet(this.c, this, e.e());
        }

        public void d(Object obj, Object obj2) {
            i(obj2);
            this.f11000d.a(this, obj2);
        }

        public long f() {
            return this.b;
        }

        public Object h(Object obj) {
            Object j2;
            if (obj == null && (j2 = j()) != null) {
                return j2;
            }
            try {
                return this.f11000d.c(this);
            } catch (Throwable th) {
                if (obj == null) {
                    k();
                }
                throw th;
            }
        }

        public String toString() {
            return "AtomicSelectOp(sequence=" + f() + ')';
        }
    }

    /* renamed from: kotlinx.coroutines.h3.b$b  reason: collision with other inner class name */
    /* compiled from: Select.kt */
    private static final class C0777b extends m {

        /* renamed from: j  reason: collision with root package name */
        public final c1 f11001j;

        public C0777b(c1 c1Var) {
            this.f11001j = c1Var;
        }
    }

    /* compiled from: Select.kt */
    private static final class c extends t {
        public final m.c a;

        public c(m.c cVar) {
            this.a = cVar;
        }

        public kotlinx.coroutines.internal.d<?> a() {
            return this.a.a();
        }

        public Object c(Object obj) {
            if (obj != null) {
                b bVar = (b) obj;
                this.a.d();
                Object e2 = this.a.a().e((Object) null);
                b.f10997k.compareAndSet(bVar, this, e2 == null ? this.a.c : e.e());
                return e2;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
        }
    }

    /* compiled from: Select.kt */
    private final class d extends y1<x1> {
        public d(x1 x1Var) {
            super(x1Var);
        }

        public void Z(Throwable th) {
            if (b.this.u()) {
                b.this.p(this.f10763j.K());
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            Z((Throwable) obj);
            return x.a;
        }

        public String toString() {
            return "SelectOnCancelling[" + b.this + ']';
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<b> cls2 = b.class;
        f10997k = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_state");
        f10998l = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_result");
    }

    public b(kotlin.c0.d<? super R> dVar) {
        this.f10999j = dVar;
    }

    /* access modifiers changed from: private */
    public final void a0() {
        c1 b0 = b0();
        if (b0 != null) {
            b0.a();
        }
        Object P = P();
        if (P != null) {
            for (m mVar = (m) P; !kotlin.jvm.internal.k.a(mVar, this); mVar = mVar.Q()) {
                if (mVar instanceof C0777b) {
                    ((C0777b) mVar).f11001j.a();
                }
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    private final c1 b0() {
        return (c1) this._parentHandle;
    }

    private final void e0() {
        x1 x1Var = (x1) c().get(x1.f11076e);
        if (x1Var != null) {
            c1 e2 = x1.a.e(x1Var, true, false, new d(x1Var), 2, (Object) null);
            f0(e2);
            if (D()) {
                e2.a();
            }
        }
    }

    private final void f0(c1 c1Var) {
        this._parentHandle = c1Var;
    }

    public <Q> void A(c<? extends Q> cVar, p<? super Q, ? super kotlin.c0.d<? super R>, ? extends Object> pVar) {
        cVar.l(this, pVar);
    }

    public StackTraceElement C() {
        return null;
    }

    public boolean D() {
        while (true) {
            Object obj = this._state;
            if (obj == e.e()) {
                return false;
            }
            if (!(obj instanceof t)) {
                return true;
            }
            ((t) obj).c(this);
        }
    }

    public g c() {
        return this.f10999j.c();
    }

    public final Object c0() {
        if (!D()) {
            e0();
        }
        Object obj = this._result;
        if (obj == e.c) {
            if (f10998l.compareAndSet(this, e.c, d.c())) {
                return d.c();
            }
            obj = this._result;
        }
        if (obj == e.f11003d) {
            throw new IllegalStateException("Already resumed");
        } else if (!(obj instanceof w)) {
            return obj;
        } else {
            throw ((w) obj).a;
        }
    }

    public final void d0(Throwable th) {
        if (u()) {
            k.a aVar = kotlin.k.f10687h;
            Object a2 = l.a(th);
            kotlin.k.a(a2);
            m(a2);
        } else if (!(th instanceof CancellationException)) {
            Object c0 = c0();
            if (c0 instanceof w) {
                Throwable th2 = ((w) c0).a;
                if (n0.d()) {
                    th2 = kotlinx.coroutines.internal.w.m(th2);
                }
                if (th2 == (!n0.d() ? th : kotlinx.coroutines.internal.w.m(th))) {
                    return;
                }
            }
            f0.a(c(), th);
        }
    }

    public kotlin.c0.d<R> g() {
        return this;
    }

    public e j() {
        kotlin.c0.d<R> dVar = this.f10999j;
        if (!(dVar instanceof e)) {
            dVar = null;
        }
        return (e) dVar;
    }

    public void m(Object obj) {
        if (!n0.a() || D()) {
            while (true) {
                Object obj2 = this._result;
                if (obj2 == e.c) {
                    if (f10998l.compareAndSet(this, e.c, kotlinx.coroutines.x.b(obj))) {
                        return;
                    }
                } else if (obj2 != d.c()) {
                    throw new IllegalStateException("Already resumed");
                } else if (f10998l.compareAndSet(this, d.c(), e.f11003d)) {
                    if (kotlin.k.e(obj)) {
                        kotlin.c0.d<R> dVar = this.f10999j;
                        Throwable c2 = kotlin.k.c(obj);
                        if (c2 != null) {
                            k.a aVar = kotlin.k.f10687h;
                            if (n0.d() && (dVar instanceof e)) {
                                c2 = kotlinx.coroutines.internal.w.j(c2, (e) dVar);
                            }
                            Object a2 = l.a(c2);
                            kotlin.k.a(a2);
                            dVar.m(a2);
                            return;
                        }
                        kotlin.jvm.internal.k.m();
                        throw null;
                    }
                    this.f10999j.m(obj);
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    public void p(Throwable th) {
        if (!n0.a() || D()) {
            while (true) {
                Object obj = this._result;
                if (obj == e.c) {
                    kotlin.c0.d<R> dVar = this.f10999j;
                    if (f10998l.compareAndSet(this, e.c, new w((!n0.d() || !(dVar instanceof e)) ? th : kotlinx.coroutines.internal.w.j(th, (e) dVar), false, 2, (DefaultConstructorMarker) null))) {
                        return;
                    }
                } else if (obj != d.c()) {
                    throw new IllegalStateException("Already resumed");
                } else if (f10998l.compareAndSet(this, d.c(), e.f11003d)) {
                    kotlin.c0.d<R> b = c.b(this.f10999j);
                    k.a aVar = kotlin.k.f10687h;
                    Object a2 = l.a(th);
                    kotlin.k.a(a2);
                    b.m(a2);
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    public Object q(kotlinx.coroutines.internal.b bVar) {
        return new a(this, bVar).c((Object) null);
    }

    public Object s(m.c cVar) {
        while (true) {
            Object obj = this._state;
            if (obj == e.e()) {
                if (cVar == null) {
                    if (f10997k.compareAndSet(this, e.e(), (Object) null)) {
                        break;
                    }
                } else {
                    c cVar2 = new c(cVar);
                    if (f10997k.compareAndSet(this, e.e(), cVar2)) {
                        Object c2 = cVar2.c(this);
                        if (c2 != null) {
                            return c2;
                        }
                    }
                }
            } else if (obj instanceof t) {
                if (cVar != null) {
                    kotlinx.coroutines.internal.d<?> a2 = cVar.a();
                    if ((a2 instanceof a) && ((a) a2).c == this) {
                        throw new IllegalStateException("Cannot use matching select clauses on the same object".toString());
                    } else if (a2.b((t) obj)) {
                        return kotlinx.coroutines.internal.c.b;
                    }
                }
                ((t) obj).c(this);
            } else if (cVar != null && obj == cVar.c) {
                return kotlinx.coroutines.k.a;
            } else {
                return null;
            }
        }
        a0();
        return kotlinx.coroutines.k.a;
    }

    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }

    public boolean u() {
        Object s = s((m.c) null);
        if (s == kotlinx.coroutines.k.a) {
            return true;
        }
        if (s == null) {
            return false;
        }
        throw new IllegalStateException(("Unexpected trySelectIdempotent result " + s).toString());
    }

    public void x(c1 c1Var) {
        C0777b bVar = new C0777b(c1Var);
        if (!D()) {
            J(bVar);
            if (!D()) {
                return;
            }
        }
        c1Var.a();
    }
}

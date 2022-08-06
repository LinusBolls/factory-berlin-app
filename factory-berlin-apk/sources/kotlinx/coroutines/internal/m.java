package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.n0;

/* compiled from: LockFreeLinkedList.kt */
public class m {

    /* renamed from: g  reason: collision with root package name */
    static final AtomicReferenceFieldUpdater f11018g;

    /* renamed from: h  reason: collision with root package name */
    static final AtomicReferenceFieldUpdater f11019h;

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f11020i;
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class a extends b {
        public final void a(d<?> dVar, Object obj) {
            boolean z = obj == null;
            m h2 = h();
            if (h2 != null) {
                m i2 = i();
                if (i2 != null) {
                    if (m.f11018g.compareAndSet(h2, dVar, z ? m(h2, i2) : i2) && z) {
                        f(h2, i2);
                    }
                } else if (n0.a() && !(!z)) {
                    throw new AssertionError();
                }
            } else if (n0.a() && !(!z)) {
                throw new AssertionError();
            }
        }

        public final Object c(d<?> dVar) {
            while (true) {
                m l2 = l(dVar);
                if (l2 == null) {
                    return c.b;
                }
                Object obj = l2._next;
                if (obj == dVar || dVar.g()) {
                    return null;
                }
                if (obj instanceof t) {
                    t tVar = (t) obj;
                    if (dVar.b(tVar)) {
                        return c.b;
                    }
                    tVar.c(l2);
                } else {
                    Object e2 = e(l2);
                    if (e2 != null) {
                        return e2;
                    }
                    if (k(l2, obj)) {
                        continue;
                    } else if (obj != null) {
                        c cVar = new c(l2, (m) obj, this);
                        if (m.f11018g.compareAndSet(l2, obj, cVar)) {
                            try {
                                Object c = cVar.c(l2);
                                if (c != n.a) {
                                    if (n0.a()) {
                                        if (!(c == null)) {
                                            throw new AssertionError();
                                        }
                                    }
                                    return null;
                                }
                            } catch (Throwable th) {
                                m.f11018g.compareAndSet(l2, cVar, obj);
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public abstract Object e(m mVar);

        /* access modifiers changed from: protected */
        public abstract void f(m mVar, m mVar2);

        public abstract void g(c cVar);

        /* access modifiers changed from: protected */
        public abstract m h();

        /* access modifiers changed from: protected */
        public abstract m i();

        public Object j(c cVar) {
            g(cVar);
            return null;
        }

        /* access modifiers changed from: protected */
        public abstract boolean k(m mVar, Object obj);

        /* access modifiers changed from: protected */
        public abstract m l(t tVar);

        /* access modifiers changed from: protected */
        public abstract Object m(m mVar, m mVar2);
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class b extends d<m> {
        public m b;
        public final m c;

        public b(m mVar) {
            this.c = mVar;
        }

        /* renamed from: i */
        public void d(m mVar, Object obj) {
            boolean z = obj == null;
            m mVar2 = z ? this.c : this.b;
            if (mVar2 != null && m.f11018g.compareAndSet(mVar, this, mVar2) && z) {
                m mVar3 = this.c;
                m mVar4 = this.b;
                if (mVar4 != null) {
                    mVar3.O(mVar4);
                } else {
                    k.m();
                    throw null;
                }
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static final class c extends t {
        public final m a;
        public final m b;
        public final a c;

        public c(m mVar, m mVar2, a aVar) {
            this.a = mVar;
            this.b = mVar2;
            this.c = aVar;
        }

        public d<?> a() {
            return this.c.b();
        }

        public Object c(Object obj) {
            boolean z = true;
            if (n0.a()) {
                if (!(obj == this.a)) {
                    throw new AssertionError();
                }
            }
            if (obj != null) {
                m mVar = (m) obj;
                Object j2 = this.c.j(this);
                if (j2 == n.a) {
                    m mVar2 = this.b;
                    if (m.f11018g.compareAndSet(mVar, this, mVar2.X())) {
                        m unused = mVar2.M((t) null);
                    }
                    return n.a;
                }
                if (j2 != null) {
                    a().e(j2);
                } else {
                    z = a().g();
                }
                m.f11018g.compareAndSet(mVar, this, z ? this.b : a());
                return null;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        }

        public final void d() {
            this.c.g(this);
        }

        public String toString() {
            return "PrepareOp(op=" + a() + ')';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static class d<T> extends a {
        private static final AtomicReferenceFieldUpdater c;

        /* renamed from: d  reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f11021d;
        private volatile Object _affectedNode = null;
        private volatile Object _originalNext = null;
        public final m b;

        static {
            Class<Object> cls = Object.class;
            Class<d> cls2 = d.class;
            c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_affectedNode");
            f11021d = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_originalNext");
        }

        public d(m mVar) {
            this.b = mVar;
        }

        /* access modifiers changed from: protected */
        public Object e(m mVar) {
            if (mVar == this.b) {
                return l.b();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public final void f(m mVar, m mVar2) {
            m unused = mVar2.M((t) null);
        }

        public void g(c cVar) {
            c.compareAndSet(this, (Object) null, cVar.a);
            f11021d.compareAndSet(this, (Object) null, cVar.b);
        }

        /* access modifiers changed from: protected */
        public final m h() {
            return (m) this._affectedNode;
        }

        /* access modifiers changed from: protected */
        public final m i() {
            return (m) this._originalNext;
        }

        /* access modifiers changed from: protected */
        public final boolean k(m mVar, Object obj) {
            if (!(obj instanceof u)) {
                return false;
            }
            ((u) obj).a.T();
            return true;
        }

        /* access modifiers changed from: protected */
        public final m l(t tVar) {
            m mVar = this.b;
            while (true) {
                Object obj = mVar._next;
                if (obj instanceof t) {
                    t tVar2 = (t) obj;
                    if (tVar.b(tVar2)) {
                        return null;
                    }
                    tVar2.c(this.b);
                } else if (obj != null) {
                    return (m) obj;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                }
            }
        }

        /* access modifiers changed from: protected */
        public final Object m(m mVar, m mVar2) {
            return mVar2.X();
        }

        public final T n() {
            T h2 = h();
            if (h2 != null) {
                return h2;
            }
            k.m();
            throw null;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<m> cls2 = m.class;
        f11018g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f11019h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f11020i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (f11018g.compareAndSet(r3, r2, ((kotlinx.coroutines.internal.u) r4).a) != false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.internal.m M(kotlinx.coroutines.internal.t r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6._prev
            kotlinx.coroutines.internal.m r0 = (kotlinx.coroutines.internal.m) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r6) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f11019h
            boolean r0 = r1.compareAndSet(r6, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r6.U()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r7) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.t
            if (r5 == 0) goto L_0x0038
            if (r7 == 0) goto L_0x0032
            r0 = r4
            kotlinx.coroutines.internal.t r0 = (kotlinx.coroutines.internal.t) r0
            boolean r0 = r7.b(r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            kotlinx.coroutines.internal.t r4 = (kotlinx.coroutines.internal.t) r4
            r4.c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.u
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f11018g
            kotlinx.coroutines.internal.u r4 = (kotlinx.coroutines.internal.u) r4
            kotlinx.coroutines.internal.m r4 = r4.a
            boolean r2 = r5.compareAndSet(r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.m r2 = (kotlinx.coroutines.internal.m) r2
            goto L_0x0007
        L_0x0052:
            if (r4 == 0) goto L_0x0059
            kotlinx.coroutines.internal.m r4 = (kotlinx.coroutines.internal.m) r4
            r3 = r2
            r2 = r4
            goto L_0x0007
        L_0x0059:
            kotlin.TypeCastException r7 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.m.M(kotlinx.coroutines.internal.t):kotlinx.coroutines.internal.m");
    }

    private final m N(m mVar) {
        while (mVar.U()) {
            mVar = (m) mVar._prev;
        }
        return mVar;
    }

    /* access modifiers changed from: private */
    public final void O(m mVar) {
        m mVar2;
        do {
            mVar2 = (m) mVar._prev;
            if (P() != mVar) {
                return;
            }
        } while (!f11019h.compareAndSet(mVar, mVar2, this));
        if (U()) {
            mVar.M((t) null);
        }
    }

    /* access modifiers changed from: private */
    public final u X() {
        u uVar = (u) this._removedRef;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this);
        f11020i.lazySet(this, uVar2);
        return uVar2;
    }

    public final void J(m mVar) {
        do {
        } while (!R().K(mVar, this));
    }

    public final boolean K(m mVar, m mVar2) {
        f11019h.lazySet(mVar, this);
        f11018g.lazySet(mVar, mVar2);
        if (!f11018g.compareAndSet(this, mVar2, mVar)) {
            return false;
        }
        mVar.O(mVar2);
        return true;
    }

    public final boolean L(m mVar) {
        f11019h.lazySet(mVar, this);
        f11018g.lazySet(mVar, this);
        while (P() == this) {
            if (f11018g.compareAndSet(this, this, mVar)) {
                mVar.O(this);
                return true;
            }
        }
        return false;
    }

    public final Object P() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof t)) {
                return obj;
            }
            ((t) obj).c(this);
        }
    }

    public final m Q() {
        return l.c(P());
    }

    public final m R() {
        m M = M((t) null);
        return M != null ? M : N((m) this._prev);
    }

    public final void S() {
        Object P = P();
        if (P != null) {
            ((u) P).a.M((t) null);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
    }

    public final void T() {
        m mVar = this;
        while (true) {
            Object P = mVar.P();
            if (!(P instanceof u)) {
                mVar.M((t) null);
                return;
            }
            mVar = ((u) P).a;
        }
    }

    public boolean U() {
        return P() instanceof u;
    }

    public boolean V() {
        return W() == null;
    }

    public final m W() {
        Object P;
        m mVar;
        do {
            P = P();
            if (P instanceof u) {
                return ((u) P).a;
            }
            if (P == this) {
                return (m) P;
            }
            if (P != null) {
                mVar = (m) P;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f11018g.compareAndSet(this, P, mVar.X()));
        mVar.M((t) null);
        return null;
    }

    public final int Y(m mVar, m mVar2, b bVar) {
        f11019h.lazySet(mVar, this);
        f11018g.lazySet(mVar, mVar2);
        bVar.b = mVar2;
        if (!f11018g.compareAndSet(this, mVar2, bVar)) {
            return 0;
        }
        return bVar.c(this) == null ? 1 : 2;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }
}

package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.TypeCastException;
import kotlin.c0.g;
import kotlin.c0.j.a.e;
import kotlin.c0.j.a.h;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.x;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.x1;

/* compiled from: JobSupport.kt */
public class e2 implements x1, q, l2 {

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f10765g = AtomicReferenceFieldUpdater.newUpdater(e2.class, Object.class, "_state");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* compiled from: JobSupport.kt */
    private static final class a<T> extends j<T> {

        /* renamed from: n  reason: collision with root package name */
        private final e2 f10766n;

        public a(kotlin.c0.d<? super T> dVar, e2 e2Var) {
            super(dVar, 1);
            this.f10766n = e2Var;
        }

        /* access modifiers changed from: protected */
        public String D() {
            return "AwaitContinuation";
        }

        public Throwable s(x1 x1Var) {
            Throwable e2;
            Object g0 = this.f10766n.g0();
            if ((g0 instanceof c) && (e2 = ((c) g0).e()) != null) {
                return e2;
            }
            if (g0 instanceof w) {
                return ((w) g0).a;
            }
            return x1Var.K();
        }
    }

    /* compiled from: JobSupport.kt */
    private static final class b extends d2<x1> {

        /* renamed from: k  reason: collision with root package name */
        private final e2 f10767k;

        /* renamed from: l  reason: collision with root package name */
        private final c f10768l;

        /* renamed from: m  reason: collision with root package name */
        private final p f10769m;

        /* renamed from: n  reason: collision with root package name */
        private final Object f10770n;

        public b(e2 e2Var, c cVar, p pVar, Object obj) {
            super(pVar.f11048k);
            this.f10767k = e2Var;
            this.f10768l = cVar;
            this.f10769m = pVar;
            this.f10770n = obj;
        }

        public void Z(Throwable th) {
            this.f10767k.T(this.f10768l, this.f10769m, this.f10770n);
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            Z((Throwable) obj);
            return x.a;
        }

        public String toString() {
            return "ChildCompletion[" + this.f10769m + ", " + this.f10770n + ']';
        }
    }

    /* compiled from: JobSupport.kt */
    private static final class c implements s1 {
        private volatile Object _exceptionsHolder = null;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: g  reason: collision with root package name */
        private final i2 f10771g;

        public c(i2 i2Var, boolean z, Throwable th) {
            this.f10771g = i2Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return this._exceptionsHolder;
        }

        private final void k(Object obj) {
            this._exceptionsHolder = obj;
        }

        public final void a(Throwable th) {
            Throwable e2 = e();
            if (e2 == null) {
                l(th);
            } else if (th != e2) {
                Object d2 = d();
                if (d2 == null) {
                    k(th);
                } else if (d2 instanceof Throwable) {
                    if (th != d2) {
                        ArrayList<Throwable> c = c();
                        c.add(d2);
                        c.add(th);
                        k(c);
                    }
                } else if (d2 instanceof ArrayList) {
                    ((ArrayList) d2).add(th);
                } else {
                    throw new IllegalStateException(("State is " + d2).toString());
                }
            }
        }

        public boolean b() {
            return e() == null;
        }

        public final Throwable e() {
            return (Throwable) this._rootCause;
        }

        public final boolean f() {
            return e() != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        public final boolean g() {
            return this._isCompleting;
        }

        public final boolean h() {
            return d() == f2.f10856e;
        }

        public final List<Throwable> i(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object d2 = d();
            if (d2 == null) {
                arrayList = c();
            } else if (d2 instanceof Throwable) {
                ArrayList<Throwable> c = c();
                c.add(d2);
                arrayList = c;
            } else if (d2 instanceof ArrayList) {
                arrayList = (ArrayList) d2;
            } else {
                throw new IllegalStateException(("State is " + d2).toString());
            }
            Throwable e2 = e();
            if (e2 != null) {
                arrayList.add(0, e2);
            }
            if (th != null && (!k.a(th, e2))) {
                arrayList.add(th);
            }
            k(f2.f10856e);
            return arrayList;
        }

        public final void j(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        public final void l(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + y() + ']';
        }

        public i2 y() {
            return this.f10771g;
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static final class d extends m.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e2 f10772d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f10773e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(m mVar, m mVar2, e2 e2Var, Object obj) {
            super(mVar2);
            this.f10772d = e2Var;
            this.f10773e = obj;
        }

        /* renamed from: j */
        public Object h(m mVar) {
            if (this.f10772d.g0() == this.f10773e) {
                return null;
            }
            return l.a();
        }
    }

    public e2(boolean z) {
        this._state = z ? f2.f10858g : f2.f10857f;
        this._parentHandle = null;
    }

    private final void A0(d2<?> d2Var) {
        d2Var.L(new i2());
        f10765g.compareAndSet(this, d2Var, d2Var.Q());
    }

    private final int F0(Object obj) {
        if (obj instanceof f1) {
            if (((f1) obj).b()) {
                return 0;
            }
            if (!f10765g.compareAndSet(this, obj, f2.f10858g)) {
                return -1;
            }
            y0();
            return 1;
        } else if (!(obj instanceof r1)) {
            return 0;
        } else {
            if (!f10765g.compareAndSet(this, obj, ((r1) obj).y())) {
                return -1;
            }
            y0();
            return 1;
        }
    }

    private final String G0(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f()) {
                return "Cancelling";
            }
            if (cVar.g()) {
                return "Completing";
            }
            return "Active";
        } else if (!(obj instanceof s1)) {
            return obj instanceof w ? "Cancelled" : "Completed";
        } else {
            if (((s1) obj).b()) {
                return "Active";
            }
            return "New";
        }
    }

    public static /* synthetic */ CancellationException I0(e2 e2Var, Throwable th, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                str = null;
            }
            return e2Var.H0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final boolean K0(s1 s1Var, Object obj) {
        if (n0.a()) {
            if (!((s1Var instanceof f1) || (s1Var instanceof d2))) {
                throw new AssertionError();
            }
        }
        if (n0.a() && !(!(obj instanceof w))) {
            throw new AssertionError();
        } else if (!f10765g.compareAndSet(this, s1Var, f2.g(obj))) {
            return false;
        } else {
            w0((Throwable) null);
            x0(obj);
            S(s1Var, obj);
            return true;
        }
    }

    private final boolean L0(s1 s1Var, Throwable th) {
        if (n0.a() && !(!(s1Var instanceof c))) {
            throw new AssertionError();
        } else if (!n0.a() || s1Var.b()) {
            i2 e0 = e0(s1Var);
            if (e0 == null) {
                return false;
            }
            if (!f10765g.compareAndSet(this, s1Var, new c(e0, false, th))) {
                return false;
            }
            u0(e0, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    private final Object M0(Object obj, Object obj2) {
        if (!(obj instanceof s1)) {
            return f2.a;
        }
        if ((!(obj instanceof f1) && !(obj instanceof d2)) || (obj instanceof p) || (obj2 instanceof w)) {
            return N0((s1) obj, obj2);
        }
        if (K0((s1) obj, obj2)) {
            return obj2;
        }
        return f2.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006d, code lost:
        if (r2 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006f, code lost:
        u0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0072, code lost:
        r7 = X(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0076, code lost:
        if (r7 == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007c, code lost:
        if (O0(r1, r7, r8) == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0080, code lost:
        return kotlinx.coroutines.f2.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0085, code lost:
        return W(r1, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object N0(kotlinx.coroutines.s1 r7, java.lang.Object r8) {
        /*
            r6 = this;
            kotlinx.coroutines.i2 r0 = r6.e0(r7)
            if (r0 == 0) goto L_0x0089
            boolean r1 = r7 instanceof kotlinx.coroutines.e2.c
            r2 = 0
            if (r1 != 0) goto L_0x000d
            r1 = r2
            goto L_0x000e
        L_0x000d:
            r1 = r7
        L_0x000e:
            kotlinx.coroutines.e2$c r1 = (kotlinx.coroutines.e2.c) r1
            if (r1 == 0) goto L_0x0013
            goto L_0x0019
        L_0x0013:
            kotlinx.coroutines.e2$c r1 = new kotlinx.coroutines.e2$c
            r3 = 0
            r1.<init>(r0, r3, r2)
        L_0x0019:
            monitor-enter(r1)
            boolean r3 = r1.g()     // Catch:{ all -> 0x0086 }
            if (r3 == 0) goto L_0x0026
            kotlinx.coroutines.internal.x r7 = kotlinx.coroutines.f2.a     // Catch:{ all -> 0x0086 }
            monitor-exit(r1)
            return r7
        L_0x0026:
            r3 = 1
            r1.j(r3)     // Catch:{ all -> 0x0086 }
            if (r1 == r7) goto L_0x003a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f10765g     // Catch:{ all -> 0x0086 }
            boolean r4 = r4.compareAndSet(r6, r7, r1)     // Catch:{ all -> 0x0086 }
            if (r4 != 0) goto L_0x003a
            kotlinx.coroutines.internal.x r7 = kotlinx.coroutines.f2.c     // Catch:{ all -> 0x0086 }
            monitor-exit(r1)
            return r7
        L_0x003a:
            boolean r4 = kotlinx.coroutines.n0.a()     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x004e
            boolean r4 = r1.h()     // Catch:{ all -> 0x0086 }
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ all -> 0x0086 }
            r7.<init>()     // Catch:{ all -> 0x0086 }
            throw r7     // Catch:{ all -> 0x0086 }
        L_0x004e:
            boolean r4 = r1.f()     // Catch:{ all -> 0x0086 }
            boolean r5 = r8 instanceof kotlinx.coroutines.w     // Catch:{ all -> 0x0086 }
            if (r5 != 0) goto L_0x0058
            r5 = r2
            goto L_0x0059
        L_0x0058:
            r5 = r8
        L_0x0059:
            kotlinx.coroutines.w r5 = (kotlinx.coroutines.w) r5     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x0062
            java.lang.Throwable r5 = r5.a     // Catch:{ all -> 0x0086 }
            r1.a(r5)     // Catch:{ all -> 0x0086 }
        L_0x0062:
            java.lang.Throwable r5 = r1.e()     // Catch:{ all -> 0x0086 }
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x006a
            r2 = r5
        L_0x006a:
            kotlin.x r3 = kotlin.x.a     // Catch:{ all -> 0x0086 }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0072
            r6.u0(r0, r2)
        L_0x0072:
            kotlinx.coroutines.p r7 = r6.X(r7)
            if (r7 == 0) goto L_0x0081
            boolean r7 = r6.O0(r1, r7, r8)
            if (r7 == 0) goto L_0x0081
            kotlinx.coroutines.internal.x r7 = kotlinx.coroutines.f2.b
            return r7
        L_0x0081:
            java.lang.Object r7 = r6.W(r1, r8)
            return r7
        L_0x0086:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        L_0x0089:
            kotlinx.coroutines.internal.x r7 = kotlinx.coroutines.f2.c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e2.N0(kotlinx.coroutines.s1, java.lang.Object):java.lang.Object");
    }

    private final Object O(Object obj) {
        Object M0;
        do {
            Object g0 = g0();
            if (!(g0 instanceof s1) || ((g0 instanceof c) && ((c) g0).g())) {
                return f2.a;
            }
            M0 = M0(g0, new w(V(obj), false, 2, (DefaultConstructorMarker) null));
        } while (M0 == f2.c);
        return M0;
    }

    private final boolean O0(c cVar, p pVar, Object obj) {
        while (x1.a.e(pVar.f11048k, false, false, new b(this, cVar, pVar, obj), 1, (Object) null) == j2.f11034g) {
            pVar = t0(pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    private final boolean P(Throwable th) {
        if (l0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        o f0 = f0();
        if (f0 == null || f0 == j2.f11034g) {
            return z;
        }
        if (f0.v(th) || z) {
            return true;
        }
        return false;
    }

    private final void S(s1 s1Var, Object obj) {
        o f0 = f0();
        if (f0 != null) {
            f0.a();
            E0(j2.f11034g);
        }
        Throwable th = null;
        if (!(obj instanceof w)) {
            obj = null;
        }
        w wVar = (w) obj;
        if (wVar != null) {
            th = wVar.a;
        }
        if (s1Var instanceof d2) {
            try {
                ((d2) s1Var).Z(th);
            } catch (Throwable th2) {
                i0(new CompletionHandlerException("Exception in completion handler " + s1Var + " for " + this, th2));
            }
        } else {
            i2 y = s1Var.y();
            if (y != null) {
                v0(y, th);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void T(c cVar, p pVar, Object obj) {
        if (n0.a()) {
            if (!(g0() == cVar)) {
                throw new AssertionError();
            }
        }
        p t0 = t0(pVar);
        if (t0 == null || !O0(cVar, t0, obj)) {
            x(W(cVar, obj));
        }
    }

    private final Throwable V(Object obj) {
        if (obj != null ? obj instanceof Throwable : true) {
            if (obj != null) {
                return (Throwable) obj;
            }
            return new JobCancellationException(Q(), (Throwable) null, this);
        } else if (obj != null) {
            return ((l2) obj).D();
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    private final Object W(c cVar, Object obj) {
        boolean f2;
        Throwable a0;
        boolean z = true;
        if (n0.a()) {
            if (!(g0() == cVar)) {
                throw new AssertionError();
            }
        }
        if (n0.a() && !(!cVar.h())) {
            throw new AssertionError();
        } else if (!n0.a() || cVar.g()) {
            w wVar = (w) (!(obj instanceof w) ? null : obj);
            Throwable th = wVar != null ? wVar.a : null;
            synchronized (cVar) {
                f2 = cVar.f();
                List<Throwable> i2 = cVar.i(th);
                a0 = a0(cVar, i2);
                if (a0 != null) {
                    w(a0, i2);
                }
            }
            if (!(a0 == null || a0 == th)) {
                obj = new w(a0, false, 2, (DefaultConstructorMarker) null);
            }
            if (a0 != null) {
                if (!P(a0) && !h0(a0)) {
                    z = false;
                }
                if (z) {
                    if (obj != null) {
                        ((w) obj).b();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    }
                }
            }
            if (!f2) {
                w0(a0);
            }
            x0(obj);
            boolean compareAndSet = f10765g.compareAndSet(this, cVar, f2.g(obj));
            if (!n0.a() || compareAndSet) {
                S(cVar, obj);
                return obj;
            }
            throw new AssertionError();
        } else {
            throw new AssertionError();
        }
    }

    private final p X(s1 s1Var) {
        p pVar = (p) (!(s1Var instanceof p) ? null : s1Var);
        if (pVar != null) {
            return pVar;
        }
        i2 y = s1Var.y();
        if (y != null) {
            return t0(y);
        }
        return null;
    }

    private final Throwable Y(Object obj) {
        if (!(obj instanceof w)) {
            obj = null;
        }
        w wVar = (w) obj;
        if (wVar != null) {
            return wVar.a;
        }
        return null;
    }

    private final Throwable a0(c cVar, List<? extends Throwable> list) {
        T t;
        boolean z;
        T t2 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (!(((Throwable) t) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) t;
            if (th != null) {
                return th;
            }
            Throwable th2 = (Throwable) list.get(0);
            if (th2 instanceof TimeoutCancellationException) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    Throwable th3 = (Throwable) next;
                    if (th3 == th2 || !(th3 instanceof TimeoutCancellationException)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        t2 = next;
                        break;
                    }
                }
                Throwable th4 = (Throwable) t2;
                if (th4 != null) {
                    return th4;
                }
            }
            return th2;
        } else if (cVar.f()) {
            return new JobCancellationException(Q(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    private final i2 e0(s1 s1Var) {
        i2 y = s1Var.y();
        if (y != null) {
            return y;
        }
        if (s1Var instanceof f1) {
            return new i2();
        }
        if (s1Var instanceof d2) {
            A0((d2) s1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + s1Var).toString());
    }

    private final boolean m0() {
        Object g0;
        do {
            g0 = g0();
            if (!(g0 instanceof s1)) {
                return false;
            }
        } while (F0(g0) < 0);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        if (r0 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        u0(((kotlinx.coroutines.e2.c) r2).y(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        return kotlinx.coroutines.f2.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object o0(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.g0()
            boolean r3 = r2 instanceof kotlinx.coroutines.e2.c
            if (r3 == 0) goto L_0x0052
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.e2$c r3 = (kotlinx.coroutines.e2.c) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.h()     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x001a
            kotlinx.coroutines.internal.x r7 = kotlinx.coroutines.f2.f10855d     // Catch:{ all -> 0x004f }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            kotlinx.coroutines.e2$c r3 = (kotlinx.coroutines.e2.c) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.f()     // Catch:{ all -> 0x004f }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0032
        L_0x0025:
            if (r1 == 0) goto L_0x0028
            goto L_0x002c
        L_0x0028:
            java.lang.Throwable r1 = r6.V(r7)     // Catch:{ all -> 0x004f }
        L_0x002c:
            r7 = r2
            kotlinx.coroutines.e2$c r7 = (kotlinx.coroutines.e2.c) r7     // Catch:{ all -> 0x004f }
            r7.a(r1)     // Catch:{ all -> 0x004f }
        L_0x0032:
            r7 = r2
            kotlinx.coroutines.e2$c r7 = (kotlinx.coroutines.e2.c) r7     // Catch:{ all -> 0x004f }
            java.lang.Throwable r7 = r7.e()     // Catch:{ all -> 0x004f }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003e
            r0 = r7
        L_0x003e:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x004a
            kotlinx.coroutines.e2$c r2 = (kotlinx.coroutines.e2.c) r2
            kotlinx.coroutines.i2 r7 = r2.y()
            r6.u0(r7, r0)
        L_0x004a:
            kotlinx.coroutines.internal.x r7 = kotlinx.coroutines.f2.a
            return r7
        L_0x004f:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0052:
            boolean r3 = r2 instanceof kotlinx.coroutines.s1
            if (r3 == 0) goto L_0x00a6
            if (r1 == 0) goto L_0x0059
            goto L_0x005d
        L_0x0059:
            java.lang.Throwable r1 = r6.V(r7)
        L_0x005d:
            r3 = r2
            kotlinx.coroutines.s1 r3 = (kotlinx.coroutines.s1) r3
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x0071
            boolean r2 = r6.L0(r3, r1)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.internal.x r7 = kotlinx.coroutines.f2.a
            return r7
        L_0x0071:
            kotlinx.coroutines.w r3 = new kotlinx.coroutines.w
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.M0(r2, r3)
            kotlinx.coroutines.internal.x r4 = kotlinx.coroutines.f2.a
            if (r3 == r4) goto L_0x008b
            kotlinx.coroutines.internal.x r2 = kotlinx.coroutines.f2.c
            if (r3 != r2) goto L_0x008a
            goto L_0x0002
        L_0x008a:
            return r3
        L_0x008b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Cannot happen in "
            r7.append(r0)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L_0x00a6:
            kotlinx.coroutines.internal.x r7 = kotlinx.coroutines.f2.f10855d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e2.o0(java.lang.Object):java.lang.Object");
    }

    private final d2<?> r0(kotlin.e0.c.l<? super Throwable, x> lVar, boolean z) {
        boolean z2 = true;
        y1 y1Var = null;
        if (z) {
            if (lVar instanceof y1) {
                y1Var = lVar;
            }
            y1 y1Var2 = y1Var;
            if (y1Var2 != null) {
                if (n0.a()) {
                    if (y1Var2.f10763j != this) {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                if (y1Var2 != null) {
                    return y1Var2;
                }
            }
            return new v1(this, lVar);
        }
        if (lVar instanceof d2) {
            y1Var = lVar;
        }
        d2<?> d2Var = y1Var;
        if (d2Var != null) {
            if (n0.a()) {
                if (d2Var.f10763j != this || (d2Var instanceof y1)) {
                    z2 = false;
                }
                if (!z2) {
                    throw new AssertionError();
                }
            }
            if (d2Var != null) {
                return d2Var;
            }
        }
        return new w1(this, lVar);
    }

    private final p t0(m mVar) {
        while (mVar.U()) {
            mVar = mVar.R();
        }
        while (true) {
            mVar = mVar.Q();
            if (!mVar.U()) {
                if (mVar instanceof p) {
                    return (p) mVar;
                }
                if (mVar instanceof i2) {
                    return null;
                }
            }
        }
    }

    private final void u0(i2 i2Var, Throwable th) {
        w0(th);
        Object P = i2Var.P();
        if (P != null) {
            CompletionHandlerException completionHandlerException = null;
            for (m mVar = (m) P; !k.a(mVar, i2Var); mVar = mVar.Q()) {
                if (mVar instanceof y1) {
                    d2 d2Var = (d2) mVar;
                    try {
                        d2Var.Z(th);
                    } catch (Throwable th2) {
                        if (completionHandlerException != null) {
                            b.a(completionHandlerException, th2);
                            if (completionHandlerException != null) {
                            }
                        }
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + d2Var + " for " + this, th2);
                        x xVar = x.a;
                    }
                }
            }
            if (completionHandlerException != null) {
                i0(completionHandlerException);
            }
            P(th);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    private final boolean v(Object obj, i2 i2Var, d2<?> d2Var) {
        int Y;
        d dVar = new d(d2Var, d2Var, this, obj);
        do {
            Y = i2Var.R().Y(d2Var, i2Var, dVar);
            if (Y == 1) {
                return true;
            }
        } while (Y != 2);
        return false;
    }

    private final void v0(i2 i2Var, Throwable th) {
        Object P = i2Var.P();
        if (P != null) {
            CompletionHandlerException completionHandlerException = null;
            for (m mVar = (m) P; !k.a(mVar, i2Var); mVar = mVar.Q()) {
                if (mVar instanceof d2) {
                    d2 d2Var = (d2) mVar;
                    try {
                        d2Var.Z(th);
                    } catch (Throwable th2) {
                        if (completionHandlerException != null) {
                            b.a(completionHandlerException, th2);
                            if (completionHandlerException != null) {
                            }
                        }
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + d2Var + " for " + this, th2);
                        x xVar = x.a;
                    }
                }
            }
            if (completionHandlerException != null) {
                i0(completionHandlerException);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    private final void w(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Throwable m2 = !n0.d() ? th : w.m(th);
            for (Throwable th2 : list) {
                if (n0.d()) {
                    th2 = w.m(th2);
                }
                if (th2 != th && th2 != m2 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    b.a(th, th2);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlinx.coroutines.r1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void z0(kotlinx.coroutines.f1 r3) {
        /*
            r2 = this;
            kotlinx.coroutines.i2 r0 = new kotlinx.coroutines.i2
            r0.<init>()
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            kotlinx.coroutines.r1 r1 = new kotlinx.coroutines.r1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f10765g
            r1.compareAndSet(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e2.z0(kotlinx.coroutines.f1):void");
    }

    public final Object A(kotlin.c0.d<Object> dVar) {
        Object g0;
        do {
            g0 = g0();
            if (!(g0 instanceof s1)) {
                if (!(g0 instanceof w)) {
                    return f2.h(g0);
                }
                Throwable th = ((w) g0).a;
                if (!n0.d()) {
                    throw th;
                } else if (!(dVar instanceof e)) {
                    throw th;
                } else {
                    throw w.j(th, (e) dVar);
                }
            }
        } while (F0(g0) < 0);
        return H(dVar);
    }

    public final <T, R> void B0(kotlinx.coroutines.h3.d<? super R> dVar, p<? super T, ? super kotlin.c0.d<? super R>, ? extends Object> pVar) {
        Object g0;
        do {
            g0 = g0();
            if (!dVar.D()) {
                if (!(g0 instanceof s1)) {
                    if (!dVar.u()) {
                        return;
                    }
                    if (g0 instanceof w) {
                        dVar.p(((w) g0).a);
                        return;
                    } else {
                        kotlinx.coroutines.f3.b.b(pVar, f2.h(g0), dVar.g());
                        return;
                    }
                }
            } else {
                return;
            }
        } while (F0(g0) != 0);
        dVar.x(n(new q2(this, dVar, pVar)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C0(kotlinx.coroutines.d2<?> r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.g0()
            boolean r1 = r0 instanceof kotlinx.coroutines.d2
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f10765g
            kotlinx.coroutines.f1 r2 = kotlinx.coroutines.f2.f10858g
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof kotlinx.coroutines.s1
            if (r1 == 0) goto L_0x0027
            kotlinx.coroutines.s1 r0 = (kotlinx.coroutines.s1) r0
            kotlinx.coroutines.i2 r0 = r0.y()
            if (r0 == 0) goto L_0x0027
            r4.V()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e2.C0(kotlinx.coroutines.d2):void");
    }

    public CancellationException D() {
        Throwable th;
        Object g0 = g0();
        CancellationException cancellationException = null;
        if (g0 instanceof c) {
            th = ((c) g0).e();
        } else if (g0 instanceof w) {
            th = ((w) g0).a;
        } else if (!(g0 instanceof s1)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + g0).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new JobCancellationException("Parent job is " + G0(g0), th, this);
    }

    public final <T, R> void D0(kotlinx.coroutines.h3.d<? super R> dVar, p<? super T, ? super kotlin.c0.d<? super R>, ? extends Object> pVar) {
        Object g0 = g0();
        if (g0 instanceof w) {
            dVar.p(((w) g0).a);
        } else {
            kotlinx.coroutines.f3.a.b(pVar, f2.h(g0), dVar.g());
        }
    }

    public final void E0(o oVar) {
        this._parentHandle = oVar;
    }

    public final c1 F(boolean z, boolean z2, kotlin.e0.c.l<? super Throwable, x> lVar) {
        Throwable th;
        Throwable th2 = null;
        d2<?> d2Var = null;
        while (true) {
            Object g0 = g0();
            if (g0 instanceof f1) {
                f1 f1Var = (f1) g0;
                if (f1Var.b()) {
                    if (d2Var == null) {
                        d2Var = r0(lVar, z);
                    }
                    if (f10765g.compareAndSet(this, g0, d2Var)) {
                        return d2Var;
                    }
                } else {
                    z0(f1Var);
                }
            } else if (g0 instanceof s1) {
                i2 y = ((s1) g0).y();
                if (y != null) {
                    c1 c1Var = j2.f11034g;
                    if (!z || !(g0 instanceof c)) {
                        th = null;
                    } else {
                        synchronized (g0) {
                            th = ((c) g0).e();
                            if (th == null || ((lVar instanceof p) && !((c) g0).g())) {
                                if (d2Var == null) {
                                    d2Var = r0(lVar, z);
                                }
                                if (v(g0, y, d2Var)) {
                                    if (th == null) {
                                        return d2Var;
                                    }
                                    c1Var = d2Var;
                                }
                            }
                            x xVar = x.a;
                        }
                    }
                    if (th != null) {
                        if (z2) {
                            lVar.o(th);
                        }
                        return c1Var;
                    }
                    if (d2Var == null) {
                        d2Var = r0(lVar, z);
                    }
                    if (v(g0, y, d2Var)) {
                        return d2Var;
                    }
                } else if (g0 != null) {
                    A0((d2) g0);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>");
                }
            } else {
                if (z2) {
                    if (!(g0 instanceof w)) {
                        g0 = null;
                    }
                    w wVar = (w) g0;
                    if (wVar != null) {
                        th2 = wVar.a;
                    }
                    lVar.o(th2);
                }
                return j2.f11034g;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object H(kotlin.c0.d<Object> dVar) {
        a aVar = new a(c.b(dVar), this);
        l.a(aVar, n(new n2(this, aVar)));
        Object u = aVar.u();
        if (u == d.c()) {
            h.c(dVar);
        }
        return u;
    }

    /* access modifiers changed from: protected */
    public final CancellationException H0(Throwable th, String str) {
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException == null) {
            if (str == null) {
                str = Q();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    public final boolean I(Throwable th) {
        return J(th);
    }

    public final boolean J(Object obj) {
        Object a2 = f2.a;
        if (d0() && (a2 = O(obj)) == f2.b) {
            return true;
        }
        if (a2 == f2.a) {
            a2 = o0(obj);
        }
        if (a2 == f2.a || a2 == f2.b) {
            return true;
        }
        if (a2 == f2.f10855d) {
            return false;
        }
        x(a2);
        return true;
    }

    public final String J0() {
        return s0() + '{' + G0(g0()) + '}';
    }

    public final CancellationException K() {
        Object g0 = g0();
        if (g0 instanceof c) {
            Throwable e2 = ((c) g0).e();
            if (e2 != null) {
                CancellationException H0 = H0(e2, o0.a(this) + " is cancelling");
                if (H0 != null) {
                    return H0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (g0 instanceof s1) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (g0 instanceof w) {
            return I0(this, ((w) g0).a, (String) null, 1, (Object) null);
        } else {
            return new JobCancellationException(o0.a(this) + " has completed normally", (Throwable) null, this);
        }
    }

    public final void M(l2 l2Var) {
        J(l2Var);
    }

    public void N(Throwable th) {
        J(th);
    }

    /* access modifiers changed from: protected */
    public String Q() {
        return "Job was cancelled";
    }

    public boolean R(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!J(th) || !c0()) {
            return false;
        }
        return true;
    }

    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(Q(), (Throwable) null, this);
        }
        N(cancellationException);
    }

    public boolean b() {
        Object g0 = g0();
        return (g0 instanceof s1) && ((s1) g0).b();
    }

    public final o b0(q qVar) {
        c1 e2 = x1.a.e(this, true, false, new p(this, qVar), 2, (Object) null);
        if (e2 != null) {
            return (o) e2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    public boolean c0() {
        return true;
    }

    public /* synthetic */ void cancel() {
        a((CancellationException) null);
    }

    public boolean d0() {
        return false;
    }

    public final o f0() {
        return (o) this._parentHandle;
    }

    public <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        return x1.a.c(this, r, pVar);
    }

    public final Object g0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof t)) {
                return obj;
            }
            ((t) obj).c(this);
        }
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return x1.a.d(this, cVar);
    }

    public final g.c<?> getKey() {
        return x1.f11076e;
    }

    /* access modifiers changed from: protected */
    public boolean h0(Throwable th) {
        return false;
    }

    public void i0(Throwable th) {
        throw th;
    }

    public final boolean isCancelled() {
        Object g0 = g0();
        return (g0 instanceof w) || ((g0 instanceof c) && ((c) g0).f());
    }

    public final void j0(x1 x1Var) {
        if (n0.a()) {
            if (!(f0() == null)) {
                throw new AssertionError();
            }
        }
        if (x1Var == null) {
            E0(j2.f11034g);
            return;
        }
        x1Var.start();
        o b0 = x1Var.b0(this);
        E0(b0);
        if (k0()) {
            b0.a();
            E0(j2.f11034g);
        }
    }

    public final boolean k0() {
        return !(g0() instanceof s1);
    }

    /* access modifiers changed from: protected */
    public boolean l0() {
        return false;
    }

    public g minusKey(g.c<?> cVar) {
        return x1.a.f(this, cVar);
    }

    public final c1 n(kotlin.e0.c.l<? super Throwable, x> lVar) {
        return F(false, true, lVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object n0(kotlin.c0.d<? super x> dVar) {
        j jVar = new j(c.b(dVar), 1);
        jVar.w();
        l.a(jVar, n(new o2(this, jVar)));
        Object u = jVar.u();
        if (u == d.c()) {
            h.c(dVar);
        }
        return u;
    }

    public final boolean p0(Object obj) {
        Object M0;
        do {
            M0 = M0(g0(), obj);
            if (M0 == f2.a) {
                return false;
            }
            if (M0 == f2.b) {
                return true;
            }
        } while (M0 == f2.c);
        x(M0);
        return true;
    }

    public g plus(g gVar) {
        return x1.a.g(this, gVar);
    }

    public final Object q(kotlin.c0.d<? super x> dVar) {
        if (!m0()) {
            d3.a(dVar.c());
            return x.a;
        }
        Object n0 = n0(dVar);
        return n0 == d.c() ? n0 : x.a;
    }

    public final Object q0(Object obj) {
        Object M0;
        do {
            M0 = M0(g0(), obj);
            if (M0 == f2.a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, " + "but is being completed with " + obj, Y(obj));
            }
        } while (M0 == f2.c);
        return M0;
    }

    public String s0() {
        return o0.a(this);
    }

    public final boolean start() {
        int F0;
        do {
            F0 = F0(g0());
            if (F0 == 0) {
                return false;
            }
        } while (F0 != 1);
        return true;
    }

    public String toString() {
        return J0() + '@' + o0.b(this);
    }

    /* access modifiers changed from: protected */
    public void w0(Throwable th) {
    }

    /* access modifiers changed from: protected */
    public void x(Object obj) {
    }

    /* access modifiers changed from: protected */
    public void x0(Object obj) {
    }

    public void y0() {
    }
}

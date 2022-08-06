package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.TypeCastException;
import kotlin.c0.d;
import kotlin.c0.j.a.h;
import kotlin.jvm.internal.y;
import kotlin.k;
import kotlinx.coroutines.d3;
import kotlinx.coroutines.internal.j;
import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.internal.x;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.o0;

/* compiled from: AbstractChannel.kt */
public abstract class c<E> implements v<E> {

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f10744h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");

    /* renamed from: g  reason: collision with root package name */
    private final k f10745g = new k();
    private volatile Object onCloseHandler = null;

    /* compiled from: AbstractChannel.kt */
    public static final class a<E> extends u {

        /* renamed from: j  reason: collision with root package name */
        public final E f10746j;

        public a(E e2) {
            this.f10746j = e2;
        }

        public void Z() {
        }

        public Object a0() {
            return this.f10746j;
        }

        public void b0(k<?> kVar) {
        }

        public x c0(m.c cVar) {
            x xVar = kotlinx.coroutines.k.a;
            if (cVar != null) {
                cVar.d();
            }
            return xVar;
        }

        public String toString() {
            return "SendBuffered@" + o0.b(this) + '(' + this.f10746j + ')';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static final class b extends m.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f10747d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m mVar, m mVar2, c cVar) {
            super(mVar2);
            this.f10747d = cVar;
        }

        /* renamed from: j */
        public Object h(m mVar) {
            if (this.f10747d.q()) {
                return null;
            }
            return l.a();
        }
    }

    private final int c() {
        k kVar = this.f10745g;
        Object P = kVar.P();
        if (P != null) {
            int i2 = 0;
            for (m mVar = (m) P; !kotlin.jvm.internal.k.a(mVar, kVar); mVar = mVar.Q()) {
                if (mVar instanceof m) {
                    i2++;
                }
            }
            return i2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    private final String j() {
        String str;
        m Q = this.f10745g.Q();
        if (Q == this.f10745g) {
            return "EmptyQueue";
        }
        if (Q instanceof k) {
            str = Q.toString();
        } else if (Q instanceof q) {
            str = "ReceiveQueued";
        } else if (Q instanceof u) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + Q;
        }
        m R = this.f10745g.R();
        if (R == Q) {
            return str;
        }
        String str2 = str + ",queueSize=" + c();
        if (!(R instanceof k)) {
            return str2;
        }
        return str2 + ",closedForSend=" + R;
    }

    private final void k(k<?> kVar) {
        Object b2 = j.b((Object) null, 1, (DefaultConstructorMarker) null);
        while (true) {
            m R = kVar.R();
            if (!(R instanceof q)) {
                R = null;
            }
            q qVar = (q) R;
            if (qVar == null) {
                break;
            } else if (!qVar.V()) {
                qVar.S();
            } else {
                b2 = j.e(b2, qVar);
            }
        }
        if (b2 != null) {
            if (!(b2 instanceof ArrayList)) {
                ((q) b2).Z(kVar);
            } else if (b2 != null) {
                ArrayList arrayList = (ArrayList) b2;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((q) arrayList.get(size)).Z(kVar);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<E> /* = java.util.ArrayList<E> */");
            }
        }
        u(kVar);
    }

    private final Throwable l(k<?> kVar) {
        k(kVar);
        return kVar.g0();
    }

    /* access modifiers changed from: private */
    public final void m(d<?> dVar, k<?> kVar) {
        k(kVar);
        Throwable g0 = kVar.g0();
        k.a aVar = kotlin.k.f10687h;
        Object a2 = kotlin.l.a(g0);
        kotlin.k.a(a2);
        dVar.m(a2);
    }

    private final void n(Throwable th) {
        Object obj;
        Object obj2 = this.onCloseHandler;
        if (obj2 != null && obj2 != (obj = b.f10743e) && f10744h.compareAndSet(this, obj2, obj)) {
            y.d(obj2, 1);
            ((kotlin.e0.c.l) obj2).o(th);
        }
    }

    /* access modifiers changed from: protected */
    public Object e(u uVar) {
        boolean z;
        m R;
        if (o()) {
            kotlinx.coroutines.internal.k kVar = this.f10745g;
            do {
                R = kVar.R();
                if (R instanceof s) {
                    return R;
                }
            } while (!R.K(uVar, kVar));
            return null;
        }
        kotlinx.coroutines.internal.k kVar2 = this.f10745g;
        b bVar = new b(uVar, uVar, this);
        while (true) {
            m R2 = kVar2.R();
            if (!(R2 instanceof s)) {
                int Y = R2.Y(uVar, kVar2, bVar);
                z = true;
                if (Y != 1) {
                    if (Y == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return R2;
            }
        }
        if (!z) {
            return b.f10742d;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public String f() {
        return "";
    }

    public boolean g(Throwable th) {
        boolean z;
        k kVar = new k(th);
        kotlinx.coroutines.internal.k kVar2 = this.f10745g;
        while (true) {
            m R = kVar2.R();
            z = true;
            if (!(R instanceof k)) {
                if (R.K(kVar, kVar2)) {
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            m R2 = this.f10745g.R();
            if (R2 != null) {
                kVar = (k) R2;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.Closed<*>");
            }
        }
        k(kVar);
        if (z) {
            n(th);
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public final k<?> h() {
        m R = this.f10745g.R();
        if (!(R instanceof k)) {
            R = null;
        }
        k<?> kVar = (k) R;
        if (kVar == null) {
            return null;
        }
        k(kVar);
        return kVar;
    }

    /* access modifiers changed from: protected */
    public final kotlinx.coroutines.internal.k i() {
        return this.f10745g;
    }

    /* access modifiers changed from: protected */
    public abstract boolean o();

    public final boolean offer(E e2) {
        Object t = t(e2);
        if (t == b.a) {
            return true;
        }
        if (t == b.b) {
            k<?> h2 = h();
            if (h2 == null) {
                return false;
            }
            throw w.k(l(h2));
        } else if (t instanceof k) {
            throw w.k(l((k) t));
        } else {
            throw new IllegalStateException(("offerInternal returned " + t).toString());
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean q();

    /* access modifiers changed from: protected */
    public final boolean r() {
        return !(this.f10745g.Q() instanceof s) && q();
    }

    public final Object s(E e2, d<? super kotlin.x> dVar) {
        if (t(e2) == b.a) {
            return kotlin.x.a;
        }
        Object x = x(e2, dVar);
        return x == d.c() ? x : kotlin.x.a;
    }

    /* access modifiers changed from: protected */
    public Object t(E e2) {
        s y;
        x w;
        do {
            y = y();
            if (y == null) {
                return b.b;
            }
            w = y.w(e2, (m.c) null);
        } while (w == null);
        if (n0.a()) {
            if (!(w == kotlinx.coroutines.k.a)) {
                throw new AssertionError();
            }
        }
        y.i(e2);
        return y.t();
    }

    public String toString() {
        return o0.a(this) + '@' + o0.b(this) + '{' + j() + '}' + f();
    }

    /* access modifiers changed from: protected */
    public void u(m mVar) {
    }

    /* access modifiers changed from: protected */
    public final s<?> v(E e2) {
        m R;
        kotlinx.coroutines.internal.k kVar = this.f10745g;
        a aVar = new a(e2);
        do {
            R = kVar.R();
            if (R instanceof s) {
                return (s) R;
            }
        } while (!R.K(aVar, kVar));
        return null;
    }

    public final Object w(E e2, d<? super kotlin.x> dVar) {
        if (t(e2) == b.a) {
            Object b2 = d3.b(dVar);
            if (b2 == d.c()) {
                return b2;
            }
            return kotlin.x.a;
        }
        Object x = x(e2, dVar);
        return x == d.c() ? x : kotlin.x.a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object x(E e2, d<? super kotlin.x> dVar) {
        kotlinx.coroutines.j<? super kotlin.x> b2 = kotlinx.coroutines.l.b(c.b(dVar));
        while (true) {
            if (r()) {
                w wVar = new w(e2, b2);
                Object e3 = e(wVar);
                if (e3 == null) {
                    kotlinx.coroutines.l.c(b2, wVar);
                    break;
                } else if (e3 instanceof k) {
                    m(b2, (k) e3);
                    break;
                } else if (e3 != b.f10742d && !(e3 instanceof q)) {
                    throw new IllegalStateException(("enqueueSend returned " + e3).toString());
                }
            }
            Object t = t(e2);
            if (t == b.a) {
                kotlin.x xVar = kotlin.x.a;
                k.a aVar = kotlin.k.f10687h;
                kotlin.k.a(xVar);
                b2.m(xVar);
                break;
            } else if (t != b.b) {
                if (t instanceof k) {
                    m(b2, (k) t);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + t).toString());
                }
            }
        }
        Object u = b2.u();
        if (u == d.c()) {
            h.c(dVar);
        }
        return u;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r1 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlinx.coroutines.channels.s<E> y() {
        /*
            r4 = this;
            kotlinx.coroutines.internal.k r0 = r4.f10745g
        L_0x0002:
            java.lang.Object r1 = r0.P()
            if (r1 == 0) goto L_0x002f
            kotlinx.coroutines.internal.m r1 = (kotlinx.coroutines.internal.m) r1
            r2 = 0
            if (r1 != r0) goto L_0x000f
        L_0x000d:
            r1 = r2
            goto L_0x0028
        L_0x000f:
            boolean r3 = r1 instanceof kotlinx.coroutines.channels.s
            if (r3 != 0) goto L_0x0014
            goto L_0x000d
        L_0x0014:
            r2 = r1
            kotlinx.coroutines.channels.s r2 = (kotlinx.coroutines.channels.s) r2
            boolean r2 = r2 instanceof kotlinx.coroutines.channels.k
            if (r2 == 0) goto L_0x0022
            boolean r2 = r1.U()
            if (r2 != 0) goto L_0x0022
            goto L_0x0028
        L_0x0022:
            kotlinx.coroutines.internal.m r2 = r1.W()
            if (r2 != 0) goto L_0x002b
        L_0x0028:
            kotlinx.coroutines.channels.s r1 = (kotlinx.coroutines.channels.s) r1
            return r1
        L_0x002b:
            r2.T()
            goto L_0x0002
        L_0x002f:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.c.y():kotlinx.coroutines.channels.s");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r1 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.channels.u z() {
        /*
            r4 = this;
            kotlinx.coroutines.internal.k r0 = r4.f10745g
        L_0x0002:
            java.lang.Object r1 = r0.P()
            if (r1 == 0) goto L_0x002f
            kotlinx.coroutines.internal.m r1 = (kotlinx.coroutines.internal.m) r1
            r2 = 0
            if (r1 != r0) goto L_0x000f
        L_0x000d:
            r1 = r2
            goto L_0x0028
        L_0x000f:
            boolean r3 = r1 instanceof kotlinx.coroutines.channels.u
            if (r3 != 0) goto L_0x0014
            goto L_0x000d
        L_0x0014:
            r2 = r1
            kotlinx.coroutines.channels.u r2 = (kotlinx.coroutines.channels.u) r2
            boolean r2 = r2 instanceof kotlinx.coroutines.channels.k
            if (r2 == 0) goto L_0x0022
            boolean r2 = r1.U()
            if (r2 != 0) goto L_0x0022
            goto L_0x0028
        L_0x0022:
            kotlinx.coroutines.internal.m r2 = r1.W()
            if (r2 != 0) goto L_0x002b
        L_0x0028:
            kotlinx.coroutines.channels.u r1 = (kotlinx.coroutines.channels.u) r1
            return r1
        L_0x002b:
            r2.T()
            goto L_0x0002
        L_0x002f:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.c.z():kotlinx.coroutines.channels.u");
    }
}

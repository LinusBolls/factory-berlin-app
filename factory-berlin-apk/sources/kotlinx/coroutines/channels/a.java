package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.TypeCastException;
import kotlin.e0.c.p;
import kotlin.k;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.channels.x;
import kotlinx.coroutines.i;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.n;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.j;
import kotlinx.coroutines.l;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.o0;

/* compiled from: AbstractChannel.kt */
public abstract class a<E> extends c<E> implements e<E> {

    /* renamed from: kotlinx.coroutines.channels.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractChannel.kt */
    private static final class C0763a<E> implements g<E> {
        private Object a = b.c;
        private final a<E> b;

        public C0763a(a<E> aVar) {
            this.b = aVar;
        }

        private final boolean c(Object obj) {
            if (!(obj instanceof k)) {
                return true;
            }
            k kVar = (k) obj;
            if (kVar.f10754j == null) {
                return false;
            }
            throw w.k(kVar.f0());
        }

        public Object a(kotlin.c0.d<? super Boolean> dVar) {
            Object obj = this.a;
            if (obj != b.c) {
                return kotlin.c0.j.a.b.a(c(obj));
            }
            Object O = this.b.O();
            this.a = O;
            if (O != b.c) {
                return kotlin.c0.j.a.b.a(c(O));
            }
            return d(dVar);
        }

        public final a<E> b() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ Object d(kotlin.c0.d<? super Boolean> dVar) {
            j<? super Boolean> b2 = l.b(c.b(dVar));
            c cVar = new c(this, b2);
            while (true) {
                if (!b().F(cVar)) {
                    Object O = b().O();
                    e(O);
                    if (!(O instanceof k)) {
                        if (O != b.c) {
                            Boolean a2 = kotlin.c0.j.a.b.a(true);
                            k.a aVar = k.f10687h;
                            k.a(a2);
                            b2.m(a2);
                            break;
                        }
                    } else {
                        k kVar = (k) O;
                        if (kVar.f10754j == null) {
                            Boolean a3 = kotlin.c0.j.a.b.a(false);
                            k.a aVar2 = k.f10687h;
                            k.a(a3);
                            b2.m(a3);
                        } else {
                            Throwable f0 = kVar.f0();
                            k.a aVar3 = k.f10687h;
                            Object a4 = kotlin.l.a(f0);
                            k.a(a4);
                            b2.m(a4);
                        }
                    }
                } else {
                    b().S(b2, cVar);
                    break;
                }
            }
            Object u = b2.u();
            if (u == d.c()) {
                kotlin.c0.j.a.h.c(dVar);
            }
            return u;
        }

        public final void e(Object obj) {
            this.a = obj;
        }

        public E next() {
            E e2 = this.a;
            if (!(e2 instanceof k)) {
                E e3 = b.c;
                if (e2 != e3) {
                    this.a = e3;
                    return e2;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw w.k(((k) e2).f0());
        }
    }

    /* compiled from: AbstractChannel.kt */
    private static final class b<E> extends q<E> {

        /* renamed from: j  reason: collision with root package name */
        public final i<Object> f10730j;

        /* renamed from: k  reason: collision with root package name */
        public final int f10731k;

        public b(i<Object> iVar, int i2) {
            this.f10730j = iVar;
            this.f10731k = i2;
        }

        public void Z(k<?> kVar) {
            if (this.f10731k == 1 && kVar.f10754j == null) {
                i<Object> iVar = this.f10730j;
                k.a aVar = k.f10687h;
                k.a((Object) null);
                iVar.m((Object) null);
            } else if (this.f10731k == 2) {
                i<Object> iVar2 = this.f10730j;
                x.b bVar = x.b;
                x.a aVar2 = new x.a(kVar.f10754j);
                x.b(aVar2);
                x a = x.a(aVar2);
                k.a aVar3 = k.f10687h;
                k.a(a);
                iVar2.m(a);
            } else {
                i<Object> iVar3 = this.f10730j;
                Throwable f0 = kVar.f0();
                k.a aVar4 = k.f10687h;
                Object a2 = kotlin.l.a(f0);
                k.a(a2);
                iVar3.m(a2);
            }
        }

        public final Object a0(E e2) {
            if (this.f10731k != 2) {
                return e2;
            }
            x.b bVar = x.b;
            x.b(e2);
            return x.a(e2);
        }

        public void i(E e2) {
            this.f10730j.G(kotlinx.coroutines.k.a);
        }

        public String toString() {
            return "ReceiveElement@" + o0.b(this) + "[receiveMode=" + this.f10731k + ']';
        }

        public kotlinx.coroutines.internal.x w(E e2, m.c cVar) {
            Object e3 = this.f10730j.e(a0(e2), cVar != null ? cVar.c : null);
            if (e3 == null) {
                return null;
            }
            if (n0.a()) {
                if (!(e3 == kotlinx.coroutines.k.a)) {
                    throw new AssertionError();
                }
            }
            if (cVar != null) {
                cVar.d();
            }
            return kotlinx.coroutines.k.a;
        }
    }

    /* compiled from: AbstractChannel.kt */
    private static final class c<E> extends q<E> {

        /* renamed from: j  reason: collision with root package name */
        public final C0763a<E> f10732j;

        /* renamed from: k  reason: collision with root package name */
        public final i<Boolean> f10733k;

        public c(C0763a<E> aVar, i<? super Boolean> iVar) {
            this.f10732j = aVar;
            this.f10733k = iVar;
        }

        public void Z(k<?> kVar) {
            Object obj;
            if (kVar.f10754j == null) {
                obj = i.a.b(this.f10733k, Boolean.FALSE, (Object) null, 2, (Object) null);
            } else {
                i<Boolean> iVar = this.f10733k;
                Throwable f0 = kVar.f0();
                i<Boolean> iVar2 = this.f10733k;
                if (n0.d() && (iVar2 instanceof kotlin.c0.j.a.e)) {
                    f0 = w.j(f0, (kotlin.c0.j.a.e) iVar2);
                }
                obj = iVar.E(f0);
            }
            if (obj != null) {
                this.f10732j.e(kVar);
                this.f10733k.G(obj);
            }
        }

        public void i(E e2) {
            this.f10732j.e(e2);
            this.f10733k.G(kotlinx.coroutines.k.a);
        }

        public String toString() {
            return "ReceiveHasNext@" + o0.b(this);
        }

        public kotlinx.coroutines.internal.x w(E e2, m.c cVar) {
            Object e3 = this.f10733k.e(Boolean.TRUE, cVar != null ? cVar.c : null);
            if (e3 == null) {
                return null;
            }
            if (n0.a()) {
                if (!(e3 == kotlinx.coroutines.k.a)) {
                    throw new AssertionError();
                }
            }
            if (cVar != null) {
                cVar.d();
            }
            return kotlinx.coroutines.k.a;
        }
    }

    /* compiled from: AbstractChannel.kt */
    private static final class d<R, E> extends q<E> implements c1 {

        /* renamed from: j  reason: collision with root package name */
        public final a<E> f10734j;

        /* renamed from: k  reason: collision with root package name */
        public final kotlinx.coroutines.h3.d<R> f10735k;

        /* renamed from: l  reason: collision with root package name */
        public final p<Object, kotlin.c0.d<? super R>, Object> f10736l;

        /* renamed from: m  reason: collision with root package name */
        public final int f10737m;

        public d(a<E> aVar, kotlinx.coroutines.h3.d<? super R> dVar, p<Object, ? super kotlin.c0.d<? super R>, ? extends Object> pVar, int i2) {
            this.f10734j = aVar;
            this.f10735k = dVar;
            this.f10736l = pVar;
            this.f10737m = i2;
        }

        public void Z(k<?> kVar) {
            if (this.f10735k.u()) {
                int i2 = this.f10737m;
                if (i2 == 0) {
                    this.f10735k.p(kVar.f0());
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        p<Object, kotlin.c0.d<? super R>, Object> pVar = this.f10736l;
                        x.b bVar = x.b;
                        x.a aVar = new x.a(kVar.f10754j);
                        x.b(aVar);
                        kotlin.c0.f.a(pVar, x.a(aVar), this.f10735k.g());
                    }
                } else if (kVar.f10754j == null) {
                    kotlin.c0.f.a(this.f10736l, null, this.f10735k.g());
                } else {
                    this.f10735k.p(kVar.f0());
                }
            }
        }

        public void a() {
            if (V()) {
                this.f10734j.M();
            }
        }

        public void i(E e2) {
            p<Object, kotlin.c0.d<? super R>, Object> pVar = this.f10736l;
            if (this.f10737m == 2) {
                x.b bVar = x.b;
                x.b(e2);
                e2 = x.a(e2);
            }
            kotlin.c0.f.a(pVar, e2, this.f10735k.g());
        }

        public String toString() {
            return "ReceiveSelect@" + o0.b(this) + '[' + this.f10735k + ",receiveMode=" + this.f10737m + ']';
        }

        public kotlinx.coroutines.internal.x w(E e2, m.c cVar) {
            return (kotlinx.coroutines.internal.x) this.f10735k.s(cVar);
        }
    }

    /* compiled from: AbstractChannel.kt */
    private final class e extends kotlinx.coroutines.g {

        /* renamed from: g  reason: collision with root package name */
        private final q<?> f10738g;

        public e(q<?> qVar) {
            this.f10738g = qVar;
        }

        public void a(Throwable th) {
            if (this.f10738g.V()) {
                a.this.M();
            }
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            a((Throwable) obj);
            return kotlin.x.a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f10738g + ']';
        }
    }

    /* compiled from: AbstractChannel.kt */
    protected static final class f<E> extends m.d<u> {
        public f(kotlinx.coroutines.internal.k kVar) {
            super(kVar);
        }

        /* access modifiers changed from: protected */
        public Object e(m mVar) {
            if (mVar instanceof k) {
                return mVar;
            }
            if (!(mVar instanceof u)) {
                return b.c;
            }
            return null;
        }

        public Object j(m.c cVar) {
            m mVar = cVar.a;
            if (mVar != null) {
                kotlinx.coroutines.internal.x c0 = ((u) mVar).c0(cVar);
                if (c0 == null) {
                    return n.a;
                }
                Object obj = kotlinx.coroutines.internal.c.b;
                if (c0 == obj) {
                    return obj;
                }
                if (!n0.a()) {
                    return null;
                }
                if (c0 == kotlinx.coroutines.k.a) {
                    return null;
                }
                throw new AssertionError();
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.Send");
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static final class g extends m.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f10740d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(m mVar, m mVar2, a aVar) {
            super(mVar2);
            this.f10740d = aVar;
        }

        /* renamed from: j */
        public Object h(m mVar) {
            if (this.f10740d.J()) {
                return null;
            }
            return kotlinx.coroutines.internal.l.a();
        }
    }

    /* compiled from: AbstractChannel.kt */
    public static final class h implements kotlinx.coroutines.h3.c<E> {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f10741g;

        h(a aVar) {
            this.f10741g = aVar;
        }

        public <R> void l(kotlinx.coroutines.h3.d<? super R> dVar, p<? super E, ? super kotlin.c0.d<? super R>, ? extends Object> pVar) {
            a aVar = this.f10741g;
            if (pVar != null) {
                aVar.R(dVar, 1, pVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type suspend (kotlin.Any?) -> R");
        }
    }

    /* access modifiers changed from: private */
    public final boolean F(q<? super E> qVar) {
        boolean G = G(qVar);
        if (G) {
            N();
        }
        return G;
    }

    private final <R> boolean H(kotlinx.coroutines.h3.d<? super R> dVar, p<Object, ? super kotlin.c0.d<? super R>, ? extends Object> pVar, int i2) {
        d dVar2 = new d(this, dVar, pVar, i2);
        boolean F = F(dVar2);
        if (F) {
            dVar.x(dVar2);
        }
        return F;
    }

    /* access modifiers changed from: private */
    public final <R> void R(kotlinx.coroutines.h3.d<? super R> dVar, int i2, p<Object, ? super kotlin.c0.d<? super R>, ? extends Object> pVar) {
        while (!dVar.D()) {
            if (!K()) {
                Object P = P(dVar);
                if (P != kotlinx.coroutines.h3.e.d()) {
                    if (!(P == b.c || P == kotlinx.coroutines.internal.c.b)) {
                        T(pVar, dVar, i2, P);
                    }
                } else {
                    return;
                }
            } else if (H(dVar, pVar, i2)) {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void S(i<?> iVar, q<?> qVar) {
        iVar.B(new e(qVar));
    }

    private final <R> void T(p<Object, ? super kotlin.c0.d<? super R>, ? extends Object> pVar, kotlinx.coroutines.h3.d<? super R> dVar, int i2, Object obj) {
        boolean z = obj instanceof k;
        if (z) {
            if (i2 == 0) {
                throw w.k(((k) obj).f0());
            } else if (i2 == 1) {
                k kVar = (k) obj;
                if (kVar.f10754j != null) {
                    throw w.k(kVar.f0());
                } else if (dVar.u()) {
                    kotlinx.coroutines.f3.b.b(pVar, null, dVar.g());
                }
            } else if (i2 == 2 && dVar.u()) {
                x.b bVar = x.b;
                x.a aVar = new x.a(((k) obj).f10754j);
                x.b(aVar);
                kotlinx.coroutines.f3.b.b(pVar, x.a(aVar), dVar.g());
            }
        } else if (i2 == 2) {
            x.b bVar2 = x.b;
            if (z) {
                obj = new x.a(((k) obj).f10754j);
                x.b(obj);
            } else {
                x.b(obj);
            }
            kotlinx.coroutines.f3.b.b(pVar, x.a(obj), dVar.g());
        } else {
            kotlinx.coroutines.f3.b.b(pVar, obj, dVar.g());
        }
    }

    public final boolean D(Throwable th) {
        boolean g2 = g(th);
        L(g2);
        return g2;
    }

    /* access modifiers changed from: protected */
    public final f<E> E() {
        return new f<>(i());
    }

    /* access modifiers changed from: protected */
    public boolean G(q<? super E> qVar) {
        int Y;
        m R;
        if (I()) {
            kotlinx.coroutines.internal.k i2 = i();
            do {
                R = i2.R();
                if (!(!(R instanceof u))) {
                    return false;
                }
            } while (!R.K(qVar, i2));
        } else {
            kotlinx.coroutines.internal.k i3 = i();
            g gVar = new g(qVar, qVar, this);
            do {
                m R2 = i3.R();
                if (!(!(R2 instanceof u))) {
                    return false;
                }
                Y = R2.Y(qVar, i3, gVar);
                if (Y != 1) {
                }
            } while (Y != 2);
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract boolean I();

    /* access modifiers changed from: protected */
    public abstract boolean J();

    /* access modifiers changed from: protected */
    public final boolean K() {
        return !(i().Q() instanceof u) && J();
    }

    /* access modifiers changed from: protected */
    public void L(boolean z) {
        k<?> h2 = h();
        if (h2 != null) {
            Object b2 = kotlinx.coroutines.internal.j.b((Object) null, 1, (DefaultConstructorMarker) null);
            while (true) {
                m R = h2.R();
                if (R instanceof kotlinx.coroutines.internal.k) {
                    if (b2 != null) {
                        if (!(b2 instanceof ArrayList)) {
                            ((u) b2).b0(h2);
                            return;
                        } else if (b2 != null) {
                            ArrayList arrayList = (ArrayList) b2;
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                ((u) arrayList.get(size)).b0(h2);
                            }
                            return;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<E> /* = java.util.ArrayList<E> */");
                        }
                    } else {
                        return;
                    }
                } else if (n0.a() && !(R instanceof u)) {
                    throw new AssertionError();
                } else if (!R.V()) {
                    R.S();
                } else if (R != null) {
                    b2 = kotlinx.coroutines.internal.j.e(b2, (u) R);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.Send");
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    /* access modifiers changed from: protected */
    public void M() {
    }

    /* access modifiers changed from: protected */
    public void N() {
    }

    /* access modifiers changed from: protected */
    public Object O() {
        u z;
        kotlinx.coroutines.internal.x c0;
        do {
            z = z();
            if (z == null) {
                return b.c;
            }
            c0 = z.c0((m.c) null);
        } while (c0 == null);
        if (n0.a()) {
            if (!(c0 == kotlinx.coroutines.k.a)) {
                throw new AssertionError();
            }
        }
        z.Z();
        return z.a0();
    }

    /* access modifiers changed from: protected */
    public Object P(kotlinx.coroutines.h3.d<?> dVar) {
        f E = E();
        Object q = dVar.q(E);
        if (q != null) {
            return q;
        }
        ((u) E.n()).Z();
        return ((u) E.n()).a0();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ <R> Object Q(int i2, kotlin.c0.d<? super R> dVar) {
        j<? super R> b2 = l.b(c.b(dVar));
        if (b2 != null) {
            b bVar = new b(b2, i2);
            while (true) {
                if (!F(bVar)) {
                    Object O = O();
                    if (!(O instanceof k)) {
                        if (O != b.c) {
                            Object a0 = bVar.a0(O);
                            k.a aVar = k.f10687h;
                            k.a(a0);
                            b2.m(a0);
                            break;
                        }
                    } else {
                        bVar.Z((k) O);
                        break;
                    }
                } else {
                    S(b2, bVar);
                    break;
                }
            }
            Object u = b2.u();
            if (u == d.c()) {
                kotlin.c0.j.a.h.c(dVar);
            }
            return u;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Any?>");
    }

    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException(o0.a(this) + " was cancelled");
        }
        D(cancellationException);
    }

    public final Object d(kotlin.c0.d<? super x<? extends E>> dVar) {
        Object O = O();
        if (O == b.c) {
            return Q(2, dVar);
        }
        if (O instanceof k) {
            x.b bVar = x.b;
            O = new x.a(((k) O).f10754j);
            x.b(O);
        } else {
            x.b bVar2 = x.b;
            x.b(O);
        }
        return x.a(O);
    }

    public final g<E> iterator() {
        return new C0763a(this);
    }

    public final kotlinx.coroutines.h3.c<E> p() {
        return new h(this);
    }

    /* access modifiers changed from: protected */
    public s<E> y() {
        s<E> y = super.y();
        if (y != null && !(y instanceof k)) {
            M();
        }
        return y;
    }
}

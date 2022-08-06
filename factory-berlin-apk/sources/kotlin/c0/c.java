package kotlin.c0;

import java.io.Serializable;
import kotlin.c0.g;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: CoroutineContextImpl.kt */
public final class c implements g, Serializable {

    /* renamed from: g  reason: collision with root package name */
    private final g f10596g;

    /* renamed from: h  reason: collision with root package name */
    private final g.b f10597h;

    /* compiled from: CoroutineContextImpl.kt */
    static final class a extends l implements p<String, g.b, String> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f10598h = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final String l(String str, g.b bVar) {
            k.e(str, "acc");
            k.e(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(g gVar, g.b bVar) {
        k.e(gVar, "left");
        k.e(bVar, "element");
        this.f10596g = gVar;
        this.f10597h = bVar;
    }

    private final boolean c(g.b bVar) {
        return k.a(get(bVar.getKey()), bVar);
    }

    private final boolean d(c cVar) {
        while (c(cVar.f10597h)) {
            g gVar = cVar.f10596g;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else if (gVar != null) {
                return c((g.b) gVar);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
            }
        }
        return false;
    }

    private final int e() {
        int i2 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f10596g;
            if (!(gVar instanceof c)) {
                gVar = null;
            }
            cVar = (c) gVar;
            if (cVar == null) {
                return i2;
            }
            i2++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.e() != e() || !cVar.d(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        k.e(pVar, "operation");
        return pVar.l(this.f10596g.fold(r, pVar), this.f10597h);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        k.e(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e2 = cVar2.f10597h.get(cVar);
            if (e2 != null) {
                return e2;
            }
            g gVar = cVar2.f10596g;
            if (!(gVar instanceof c)) {
                return gVar.get(cVar);
            }
            cVar2 = (c) gVar;
        }
    }

    public int hashCode() {
        return this.f10596g.hashCode() + this.f10597h.hashCode();
    }

    public g minusKey(g.c<?> cVar) {
        k.e(cVar, "key");
        if (this.f10597h.get(cVar) != null) {
            return this.f10596g;
        }
        g minusKey = this.f10596g.minusKey(cVar);
        if (minusKey == this.f10596g) {
            return this;
        }
        if (minusKey == h.f10600g) {
            return this.f10597h;
        }
        return new c(minusKey, this.f10597h);
    }

    public g plus(g gVar) {
        k.e(gVar, "context");
        return g.a.a(this, gVar);
    }

    public String toString() {
        return "[" + ((String) fold("", a.f10598h)) + "]";
    }
}

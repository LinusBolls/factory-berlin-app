package g.a.a.n.j;

import g.a.a.h.c;
import g.a.a.h.k;
import g.a.a.h.o;
import g.a.a.h.q;
import g.a.a.h.s.d;
import g.a.a.h.s.l;
import g.a.a.h.s.o;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: RealResponseReader.kt */
public final class a<R> implements o {
    private final Map<String, Object> a;
    private final k.c b;
    private final R c;

    /* renamed from: d  reason: collision with root package name */
    private final d<R> f9246d;

    /* renamed from: e  reason: collision with root package name */
    private final q f9247e;

    /* renamed from: f  reason: collision with root package name */
    private final l<R> f9248f;

    /* renamed from: g.a.a.n.j.a$a  reason: collision with other inner class name */
    /* compiled from: RealResponseReader.kt */
    private final class C0623a implements o.b {
        private final g.a.a.h.o a;
        private final Object b;
        final /* synthetic */ a c;

        public C0623a(a aVar, g.a.a.h.o oVar, Object obj) {
            kotlin.jvm.internal.k.f(oVar, "field");
            kotlin.jvm.internal.k.f(obj, "value");
            this.c = aVar;
            this.a = oVar;
            this.b = obj;
        }

        public <T> T a(o.d<T> dVar) {
            kotlin.jvm.internal.k.f(dVar, "objectReader");
            Object obj = this.b;
            this.c.p().c(this.a, obj);
            T a2 = dVar.a(new a(this.c.o(), obj, this.c.n(), this.c.q(), this.c.p()));
            this.c.p().i(this.a, obj);
            return a2;
        }

        public <T> T b(kotlin.e0.c.l<? super o, ? extends T> lVar) {
            kotlin.jvm.internal.k.f(lVar, "block");
            return o.b.a.a(this, lVar);
        }
    }

    public a(k.c cVar, R r, d<R> dVar, q qVar, l<R> lVar) {
        kotlin.jvm.internal.k.f(cVar, "operationVariables");
        kotlin.jvm.internal.k.f(dVar, "fieldValueResolver");
        kotlin.jvm.internal.k.f(qVar, "scalarTypeAdapters");
        kotlin.jvm.internal.k.f(lVar, "resolveDelegate");
        this.b = cVar;
        this.c = r;
        this.f9246d = dVar;
        this.f9247e = qVar;
        this.f9248f = lVar;
        this.a = cVar.c();
    }

    private final void l(g.a.a.h.o oVar, Object obj) {
        if (!(oVar.d() || obj != null)) {
            throw new IllegalStateException(("corrupted response reader, expected non null value for " + oVar.c()).toString());
        }
    }

    private final void m(g.a.a.h.o oVar) {
        this.f9248f.d(oVar, this.b);
    }

    private final boolean r(g.a.a.h.o oVar) {
        for (o.c next : oVar.b()) {
            if (next instanceof o.a) {
                o.a aVar = (o.a) next;
                Boolean bool = (Boolean) this.a.get(aVar.b());
                if (aVar.a()) {
                    if (kotlin.jvm.internal.k.a(bool, Boolean.TRUE)) {
                        return true;
                    }
                } else if (kotlin.jvm.internal.k.a(bool, Boolean.FALSE)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void s(g.a.a.h.o oVar, Object obj) {
        this.f9248f.g(oVar, this.b, obj);
    }

    public <T> List<T> a(g.a.a.h.o oVar, o.c<T> cVar) {
        ArrayList arrayList;
        T t;
        kotlin.jvm.internal.k.f(oVar, "field");
        kotlin.jvm.internal.k.f(cVar, "listReader");
        if (r(oVar)) {
            return null;
        }
        List list = (List) this.f9246d.a(this.c, oVar);
        l(oVar, list);
        s(oVar, list);
        if (list == null) {
            this.f9248f.b();
            arrayList = null;
        } else {
            arrayList = new ArrayList(o.p(list, 10));
            int i2 = 0;
            for (Object next : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    this.f9248f.a(i2);
                    if (next == null) {
                        this.f9248f.b();
                        t = null;
                    } else {
                        t = cVar.a(new C0623a(this, oVar, next));
                    }
                    this.f9248f.h(i2);
                    arrayList.add(t);
                    i2 = i3;
                } else {
                    kotlin.a0.l.o();
                    throw null;
                }
            }
            this.f9248f.e(list);
        }
        m(oVar);
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return null;
    }

    public <T> T b(g.a.a.h.o oVar, kotlin.e0.c.l<? super g.a.a.h.s.o, ? extends T> lVar) {
        kotlin.jvm.internal.k.f(oVar, "field");
        kotlin.jvm.internal.k.f(lVar, "block");
        return o.a.a(this, oVar, lVar);
    }

    public <T> T c(o.d dVar) {
        kotlin.jvm.internal.k.f(dVar, "field");
        T t = null;
        if (r(dVar)) {
            return null;
        }
        Object a2 = this.f9246d.a(this.c, dVar);
        l(dVar, a2);
        s(dVar, a2);
        if (a2 == null) {
            this.f9248f.b();
        } else {
            t = this.f9247e.a(dVar.g()).b(c.b.a(a2));
            l(dVar, t);
            this.f9248f.f(a2);
        }
        m(dVar);
        return t;
    }

    public <T> T d(g.a.a.h.o oVar, kotlin.e0.c.l<? super g.a.a.h.s.o, ? extends T> lVar) {
        kotlin.jvm.internal.k.f(oVar, "field");
        kotlin.jvm.internal.k.f(lVar, "block");
        return o.a.c(this, oVar, lVar);
    }

    public Integer e(g.a.a.h.o oVar) {
        kotlin.jvm.internal.k.f(oVar, "field");
        if (r(oVar)) {
            return null;
        }
        BigDecimal bigDecimal = (BigDecimal) this.f9246d.a(this.c, oVar);
        l(oVar, bigDecimal);
        s(oVar, bigDecimal);
        if (bigDecimal == null) {
            this.f9248f.b();
        } else {
            this.f9248f.f(bigDecimal);
        }
        m(oVar);
        if (bigDecimal != null) {
            return Integer.valueOf(bigDecimal.intValue());
        }
        return null;
    }

    public String f(g.a.a.h.o oVar) {
        kotlin.jvm.internal.k.f(oVar, "field");
        if (r(oVar)) {
            return null;
        }
        String str = (String) this.f9246d.a(this.c, oVar);
        l(oVar, str);
        s(oVar, str);
        if (str == null) {
            this.f9248f.b();
        } else {
            this.f9248f.f(str);
        }
        m(oVar);
        return str;
    }

    public <T> List<T> g(g.a.a.h.o oVar, kotlin.e0.c.l<? super o.b, ? extends T> lVar) {
        kotlin.jvm.internal.k.f(oVar, "field");
        kotlin.jvm.internal.k.f(lVar, "block");
        return o.a.b(this, oVar, lVar);
    }

    public <T> T h(g.a.a.h.o oVar, o.d<T> dVar) {
        kotlin.jvm.internal.k.f(oVar, "field");
        kotlin.jvm.internal.k.f(dVar, "objectReader");
        if (r(oVar)) {
            return null;
        }
        String str = (String) this.f9246d.a(this.c, oVar);
        l(oVar, str);
        s(oVar, str);
        if (str == null) {
            this.f9248f.b();
            m(oVar);
            return null;
        }
        this.f9248f.f(str);
        m(oVar);
        if (oVar.f() != o.e.FRAGMENT) {
            return null;
        }
        for (o.c next : oVar.b()) {
            if ((next instanceof o.f) && !((o.f) next).a().contains(str)) {
                return null;
            }
        }
        return dVar.a(this);
    }

    public <T> T i(g.a.a.h.o oVar, o.d<T> dVar) {
        kotlin.jvm.internal.k.f(oVar, "field");
        kotlin.jvm.internal.k.f(dVar, "objectReader");
        T t = null;
        if (r(oVar)) {
            return null;
        }
        Object a2 = this.f9246d.a(this.c, oVar);
        l(oVar, a2);
        s(oVar, a2);
        this.f9248f.c(oVar, a2);
        if (a2 == null) {
            this.f9248f.b();
        } else {
            t = dVar.a(new a(this.b, a2, this.f9246d, this.f9247e, this.f9248f));
        }
        this.f9248f.i(oVar, a2);
        m(oVar);
        return t;
    }

    public Boolean j(g.a.a.h.o oVar) {
        kotlin.jvm.internal.k.f(oVar, "field");
        if (r(oVar)) {
            return null;
        }
        Boolean bool = (Boolean) this.f9246d.a(this.c, oVar);
        l(oVar, bool);
        s(oVar, bool);
        if (bool == null) {
            this.f9248f.b();
        } else {
            this.f9248f.f(bool);
        }
        m(oVar);
        return bool;
    }

    public Double k(g.a.a.h.o oVar) {
        kotlin.jvm.internal.k.f(oVar, "field");
        if (r(oVar)) {
            return null;
        }
        BigDecimal bigDecimal = (BigDecimal) this.f9246d.a(this.c, oVar);
        l(oVar, bigDecimal);
        s(oVar, bigDecimal);
        if (bigDecimal == null) {
            this.f9248f.b();
        } else {
            this.f9248f.f(bigDecimal);
        }
        m(oVar);
        if (bigDecimal != null) {
            return Double.valueOf(bigDecimal.doubleValue());
        }
        return null;
    }

    public final d<R> n() {
        return this.f9246d;
    }

    public final k.c o() {
        return this.b;
    }

    public final l<R> p() {
        return this.f9248f;
    }

    public final q q() {
        return this.f9247e;
    }
}

package com.apollographql.apollo.cache.normalized.k;

import com.apollographql.apollo.cache.normalized.c;
import com.apollographql.apollo.cache.normalized.d;
import com.apollographql.apollo.cache.normalized.e;
import com.apollographql.apollo.cache.normalized.i;
import com.apollographql.apollo.cache.normalized.j;
import g.a.a.h.k;
import g.a.a.h.o;
import g.a.a.h.s.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ResponseNormalizer */
public abstract class h<R> implements l<R> {

    /* renamed from: h  reason: collision with root package name */
    public static final h f1832h = new a();
    private i<List<String>> a;
    private i<i> b;
    private i<Object> c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f1833d;

    /* renamed from: e  reason: collision with root package name */
    private i.a f1834e;

    /* renamed from: f  reason: collision with root package name */
    private j f1835f = new j();

    /* renamed from: g  reason: collision with root package name */
    private Set<String> f1836g = Collections.emptySet();

    /* compiled from: ResponseNormalizer */
    class a extends h {

        /* renamed from: com.apollographql.apollo.cache.normalized.k.h$a$a  reason: collision with other inner class name */
        /* compiled from: ResponseNormalizer */
        class C0053a implements c {
            C0053a(a aVar) {
            }

            public String a(o oVar, k.c cVar) {
                return c.b.b();
            }
        }

        a() {
        }

        public void a(int i2) {
        }

        public void b() {
        }

        public void c(o oVar, Object obj) {
        }

        public void d(o oVar, k.c cVar) {
        }

        public void e(List list) {
        }

        public void f(Object obj) {
        }

        public void g(o oVar, k.c cVar, Object obj) {
        }

        public void h(int i2) {
        }

        public void i(o oVar, Object obj) {
        }

        public c j() {
            return new C0053a(this);
        }

        public Set<String> k() {
            return Collections.emptySet();
        }

        public Collection<i> m() {
            return Collections.emptyList();
        }

        public c n(o oVar, Object obj) {
            return c.b;
        }

        public void p(k kVar) {
        }
    }

    private String l() {
        StringBuilder sb = new StringBuilder();
        int size = this.f1833d.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(this.f1833d.get(i2));
            if (i2 < size - 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    public void a(int i2) {
        this.f1833d.add(Integer.toString(i2));
    }

    public void b() {
        this.c.c(null);
    }

    public void c(o oVar, R r) {
        this.a.c(this.f1833d);
        c n2 = r != null ? n(oVar, r) : c.b;
        String b2 = n2.b();
        if (n2.equals(c.b)) {
            b2 = l();
        } else {
            ArrayList arrayList = new ArrayList();
            this.f1833d = arrayList;
            arrayList.add(b2);
        }
        this.b.c(this.f1834e.b());
        this.f1834e = i.b(b2);
    }

    public void d(o oVar, k.c cVar) {
        List<String> list = this.f1833d;
        list.remove(list.size() - 1);
        Object b2 = this.c.b();
        String a2 = j().a(oVar, cVar);
        this.f1836g.add(this.f1834e.c() + "." + a2);
        this.f1834e.a(a2, b2);
        if (this.b.a()) {
            this.f1835f.b(this.f1834e.b());
        }
    }

    public void e(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(0, this.c.b());
        }
        this.c.c(arrayList);
    }

    public void f(Object obj) {
        this.c.c(obj);
    }

    public void g(o oVar, k.c cVar, Object obj) {
        this.f1833d.add(j().a(oVar, cVar));
    }

    public void h(int i2) {
        List<String> list = this.f1833d;
        list.remove(list.size() - 1);
    }

    public void i(o oVar, R r) {
        this.f1833d = this.a.b();
        if (r != null) {
            i b2 = this.f1834e.b();
            this.c.c(new e(b2.h()));
            this.f1836g.add(b2.h());
            this.f1835f.b(b2);
        }
        this.f1834e = this.b.b().j();
    }

    public abstract c j();

    public Set<String> k() {
        return this.f1836g;
    }

    public Collection<i> m() {
        return this.f1835f.a();
    }

    public abstract c n(o oVar, R r);

    public void o(c cVar) {
        this.a = new i<>();
        this.b = new i<>();
        this.c = new i<>();
        this.f1836g = new HashSet();
        this.f1833d = new ArrayList();
        this.f1834e = i.b(cVar.b());
        this.f1835f = new j();
    }

    public void p(k kVar) {
        o(d.d(kVar));
    }
}

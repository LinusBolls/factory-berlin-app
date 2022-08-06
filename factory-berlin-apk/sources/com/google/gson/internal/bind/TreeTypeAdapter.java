package com.google.gson.internal.bind;

import com.google.gson.f;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.s;
import com.google.gson.stream.c;
import com.google.gson.t;

public final class TreeTypeAdapter<T> extends s<T> {
    private final q<T> a;
    private final k<T> b;
    final f c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.gson.u.a<T> f4271d;

    /* renamed from: e  reason: collision with root package name */
    private final t f4272e;

    /* renamed from: f  reason: collision with root package name */
    private final TreeTypeAdapter<T>.defpackage.b f4273f = new b();

    /* renamed from: g  reason: collision with root package name */
    private s<T> f4274g;

    private static final class SingleTypeFactory implements t {

        /* renamed from: g  reason: collision with root package name */
        private final com.google.gson.u.a<?> f4275g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f4276h;

        /* renamed from: i  reason: collision with root package name */
        private final Class<?> f4277i;

        /* renamed from: j  reason: collision with root package name */
        private final q<?> f4278j;

        /* renamed from: k  reason: collision with root package name */
        private final k<?> f4279k;

        public <T> s<T> c(f fVar, com.google.gson.u.a<T> aVar) {
            boolean z;
            com.google.gson.u.a<?> aVar2 = this.f4275g;
            if (aVar2 != null) {
                z = aVar2.equals(aVar) || (this.f4276h && this.f4275g.e() == aVar.c());
            } else {
                z = this.f4277i.isAssignableFrom(aVar.c());
            }
            if (z) {
                return new TreeTypeAdapter(this.f4278j, this.f4279k, fVar, aVar, this);
            }
            return null;
        }
    }

    private final class b implements p, j {
        private b(TreeTypeAdapter treeTypeAdapter) {
        }
    }

    public TreeTypeAdapter(q<T> qVar, k<T> kVar, f fVar, com.google.gson.u.a<T> aVar, t tVar) {
        this.a = qVar;
        this.b = kVar;
        this.c = fVar;
        this.f4271d = aVar;
        this.f4272e = tVar;
    }

    private s<T> e() {
        s<T> sVar = this.f4274g;
        if (sVar != null) {
            return sVar;
        }
        s<T> m2 = this.c.m(this.f4272e, this.f4271d);
        this.f4274g = m2;
        return m2;
    }

    public T b(com.google.gson.stream.a aVar) {
        if (this.b == null) {
            return e().b(aVar);
        }
        l a2 = com.google.gson.internal.k.a(aVar);
        if (a2.i()) {
            return null;
        }
        return this.b.a(a2, this.f4271d.e(), this.f4273f);
    }

    public void d(c cVar, T t) {
        q<T> qVar = this.a;
        if (qVar == null) {
            e().d(cVar, t);
        } else if (t == null) {
            cVar.D();
        } else {
            com.google.gson.internal.k.b(qVar.a(t, this.f4271d.e(), this.f4273f), cVar);
        }
    }
}

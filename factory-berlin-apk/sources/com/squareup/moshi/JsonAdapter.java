package com.squareup.moshi;

import com.squareup.moshi.g;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import l.f;

public abstract class JsonAdapter<T> {

    class a extends JsonAdapter<T> {
        final /* synthetic */ JsonAdapter a;

        a(JsonAdapter jsonAdapter, JsonAdapter jsonAdapter2) {
            this.a = jsonAdapter2;
        }

        public T b(g gVar) {
            return this.a.b(gVar);
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            return this.a.d();
        }

        public void h(l lVar, T t) {
            boolean k2 = lVar.k();
            lVar.L(true);
            try {
                this.a.h(lVar, t);
            } finally {
                lVar.L(k2);
            }
        }

        public String toString() {
            return this.a + ".serializeNulls()";
        }
    }

    class b extends JsonAdapter<T> {
        final /* synthetic */ JsonAdapter a;

        b(JsonAdapter jsonAdapter, JsonAdapter jsonAdapter2) {
            this.a = jsonAdapter2;
        }

        public T b(g gVar) {
            boolean k2 = gVar.k();
            gVar.U(true);
            try {
                return this.a.b(gVar);
            } finally {
                gVar.U(k2);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            return true;
        }

        public void h(l lVar, T t) {
            boolean l2 = lVar.l();
            lVar.K(true);
            try {
                this.a.h(lVar, t);
            } finally {
                lVar.K(l2);
            }
        }

        public String toString() {
            return this.a + ".lenient()";
        }
    }

    class c extends JsonAdapter<T> {
        final /* synthetic */ JsonAdapter a;

        c(JsonAdapter jsonAdapter, JsonAdapter jsonAdapter2) {
            this.a = jsonAdapter2;
        }

        public T b(g gVar) {
            boolean j2 = gVar.j();
            gVar.M(true);
            try {
                return this.a.b(gVar);
            } finally {
                gVar.M(j2);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            return this.a.d();
        }

        public void h(l lVar, T t) {
            this.a.h(lVar, t);
        }

        public String toString() {
            return this.a + ".failOnUnknown()";
        }
    }

    public interface d {
        JsonAdapter<?> a(Type type, Set<? extends Annotation> set, n nVar);
    }

    public final JsonAdapter<T> a() {
        return new c(this, this);
    }

    public abstract T b(g gVar);

    public final T c(String str) {
        f fVar = new f();
        fVar.h1(str);
        g q = g.q(fVar);
        T b2 = b(q);
        if (d() || q.y() == g.c.END_DOCUMENT) {
            return b2;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return false;
    }

    public final JsonAdapter<T> e() {
        return new b(this, this);
    }

    public final JsonAdapter<T> f() {
        if (this instanceof NullSafeJsonAdapter) {
            return this;
        }
        return new NullSafeJsonAdapter(this);
    }

    public final JsonAdapter<T> g() {
        return new a(this, this);
    }

    public abstract void h(l lVar, T t);
}

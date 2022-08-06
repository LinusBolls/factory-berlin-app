package com.google.gson.internal.bind;

import com.google.gson.f;
import com.google.gson.internal.c;
import com.google.gson.internal.h;
import com.google.gson.s;
import com.google.gson.stream.b;
import com.google.gson.t;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements t {

    /* renamed from: g  reason: collision with root package name */
    private final c f4255g;

    private static final class a<E> extends s<Collection<E>> {
        private final s<E> a;
        private final h<? extends Collection<E>> b;

        public a(f fVar, Type type, s<E> sVar, h<? extends Collection<E>> hVar) {
            this.a = new c(fVar, sVar, type);
            this.b = hVar;
        }

        /* renamed from: e */
        public Collection<E> b(com.google.gson.stream.a aVar) {
            if (aVar.Z() == b.NULL) {
                aVar.L();
                return null;
            }
            Collection<E> collection = (Collection) this.b.a();
            aVar.a();
            while (aVar.hasNext()) {
                collection.add(this.a.b(aVar));
            }
            aVar.k();
            return collection;
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, Collection<E> collection) {
            if (collection == null) {
                cVar.D();
                return;
            }
            cVar.h();
            for (E d2 : collection) {
                this.a.d(cVar, d2);
            }
            cVar.k();
        }
    }

    public CollectionTypeAdapterFactory(c cVar) {
        this.f4255g = cVar;
    }

    public <T> s<T> c(f fVar, com.google.gson.u.a<T> aVar) {
        Type e2 = aVar.e();
        Class<? super T> c = aVar.c();
        if (!Collection.class.isAssignableFrom(c)) {
            return null;
        }
        Type h2 = com.google.gson.internal.b.h(e2, c);
        return new a(fVar, h2, fVar.k(com.google.gson.u.a.b(h2)), this.f4255g.a(aVar));
    }
}

package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

abstract class CollectionJsonAdapter<C extends Collection<T>, T> extends JsonAdapter<C> {
    public static final JsonAdapter.d FACTORY = new a();
    private final JsonAdapter<T> elementAdapter;

    class a implements JsonAdapter.d {
        a() {
        }

        public JsonAdapter<?> a(Type type, Set<? extends Annotation> set, n nVar) {
            Class<?> g2 = p.g(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (g2 == List.class || g2 == Collection.class) {
                return CollectionJsonAdapter.j(type, nVar).f();
            }
            if (g2 == Set.class) {
                return CollectionJsonAdapter.l(type, nVar).f();
            }
            return null;
        }
    }

    class b extends CollectionJsonAdapter<Collection<T>, T> {
        b(JsonAdapter jsonAdapter) {
            super(jsonAdapter, (a) null);
        }

        public /* bridge */ /* synthetic */ Object b(g gVar) {
            return CollectionJsonAdapter.super.b(gVar);
        }

        public /* bridge */ /* synthetic */ void h(l lVar, Object obj) {
            CollectionJsonAdapter.super.h(lVar, (Collection) obj);
        }

        /* access modifiers changed from: package-private */
        public Collection<T> k() {
            return new ArrayList();
        }
    }

    class c extends CollectionJsonAdapter<Set<T>, T> {
        c(JsonAdapter jsonAdapter) {
            super(jsonAdapter, (a) null);
        }

        public /* bridge */ /* synthetic */ Object b(g gVar) {
            return CollectionJsonAdapter.super.b(gVar);
        }

        public /* bridge */ /* synthetic */ void h(l lVar, Object obj) {
            CollectionJsonAdapter.super.h(lVar, (Set) obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public Set<T> k() {
            return new LinkedHashSet();
        }
    }

    /* synthetic */ CollectionJsonAdapter(JsonAdapter jsonAdapter, a aVar) {
        this(jsonAdapter);
    }

    static <T> JsonAdapter<Collection<T>> j(Type type, n nVar) {
        return new b(nVar.d(p.c(type, Collection.class)));
    }

    static <T> JsonAdapter<Set<T>> l(Type type, n nVar) {
        return new c(nVar.d(p.c(type, Collection.class)));
    }

    /* renamed from: i */
    public C b(g gVar) {
        C k2 = k();
        gVar.a();
        while (gVar.hasNext()) {
            k2.add(this.elementAdapter.b(gVar));
        }
        gVar.h();
        return k2;
    }

    /* access modifiers changed from: package-private */
    public abstract C k();

    /* renamed from: m */
    public void h(l lVar, C c2) {
        lVar.a();
        for (Object h2 : c2) {
            this.elementAdapter.h(lVar, h2);
        }
        lVar.i();
    }

    public String toString() {
        return this.elementAdapter + ".collection()";
    }

    private CollectionJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.elementAdapter = jsonAdapter;
    }
}

package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

final class ClassJsonAdapter<T> extends JsonAdapter<T> {
    public static final JsonAdapter.d FACTORY = new a();
    private final b<T> classFactory;
    private final b<?>[] fieldsArray;
    private final g.b options;

    class a implements JsonAdapter.d {
        a() {
        }

        private void b(n nVar, Type type, Map<String, b<?>> map) {
            Class<?> g2 = p.g(type);
            boolean j2 = com.squareup.moshi.internal.a.j(g2);
            for (Field field : g2.getDeclaredFields()) {
                if (c(j2, field.getModifiers())) {
                    Type o = com.squareup.moshi.internal.a.o(type, g2, field.getGenericType());
                    Set<? extends Annotation> k2 = com.squareup.moshi.internal.a.k(field);
                    String name = field.getName();
                    JsonAdapter<T> f2 = nVar.f(o, k2, name);
                    field.setAccessible(true);
                    d dVar = (d) field.getAnnotation(d.class);
                    if (dVar != null) {
                        name = dVar.name();
                    }
                    b bVar = new b(name, field, f2);
                    b put = map.put(name, bVar);
                    if (put != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + put.b + "\n    " + bVar.b);
                    }
                }
            }
        }

        private boolean c(boolean z, int i2) {
            if (Modifier.isStatic(i2) || Modifier.isTransient(i2)) {
                return false;
            }
            if (Modifier.isPublic(i2) || Modifier.isProtected(i2) || !z) {
                return true;
            }
            return false;
        }

        public JsonAdapter<?> a(Type type, Set<? extends Annotation> set, n nVar) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> g2 = p.g(type);
            if (g2.isInterface() || g2.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (com.squareup.moshi.internal.a.j(g2)) {
                String str = "Platform " + g2;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            } else if (g2.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + g2.getName());
            } else if (g2.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + g2.getName());
            } else if (g2.getEnclosingClass() != null && !Modifier.isStatic(g2.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + g2.getName());
            } else if (Modifier.isAbstract(g2.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + g2.getName());
            } else if (!com.squareup.moshi.internal.a.i(g2)) {
                b<?> a = b.a(g2);
                TreeMap treeMap = new TreeMap();
                while (type != Object.class) {
                    b(nVar, type, treeMap);
                    type = p.f(type);
                }
                return new ClassJsonAdapter(a, treeMap).f();
            } else {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + g2.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapter from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
        }
    }

    static class b<T> {
        final String a;
        final Field b;
        final JsonAdapter<T> c;

        b(String str, Field field, JsonAdapter<T> jsonAdapter) {
            this.a = str;
            this.b = field;
            this.c = jsonAdapter;
        }

        /* access modifiers changed from: package-private */
        public void a(g gVar, Object obj) {
            this.b.set(obj, this.c.b(gVar));
        }

        /* access modifiers changed from: package-private */
        public void b(l lVar, Object obj) {
            this.c.h(lVar, this.b.get(obj));
        }
    }

    ClassJsonAdapter(b<T> bVar, Map<String, b<?>> map) {
        this.classFactory = bVar;
        this.fieldsArray = (b[]) map.values().toArray(new b[map.size()]);
        this.options = g.b.a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    public T b(g gVar) {
        try {
            T b2 = this.classFactory.b();
            try {
                gVar.b();
                while (gVar.hasNext()) {
                    int K = gVar.K(this.options);
                    if (K == -1) {
                        gVar.Z();
                        gVar.skipValue();
                    } else {
                        this.fieldsArray[K].a(gVar, b2);
                    }
                }
                gVar.i();
                return b2;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            com.squareup.moshi.internal.a.r(e3);
            throw null;
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    public void h(l lVar, T t) {
        try {
            lVar.b();
            for (b<?> bVar : this.fieldsArray) {
                lVar.n(bVar.a);
                bVar.b(lVar, t);
            }
            lVar.j();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.classFactory + ")";
    }
}

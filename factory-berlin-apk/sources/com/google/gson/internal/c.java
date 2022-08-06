package com.google.gson.internal;

import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: ConstructorConstructor */
public final class c {
    private final Map<Type, com.google.gson.h<?>> a;
    private final com.google.gson.internal.m.b b = com.google.gson.internal.m.b.a();

    /* compiled from: ConstructorConstructor */
    class a implements h<T> {
        a(c cVar) {
        }

        public T a() {
            return new ConcurrentHashMap();
        }
    }

    /* compiled from: ConstructorConstructor */
    class b implements h<T> {
        b(c cVar) {
        }

        public T a() {
            return new TreeMap();
        }
    }

    /* renamed from: com.google.gson.internal.c$c  reason: collision with other inner class name */
    /* compiled from: ConstructorConstructor */
    class C0118c implements h<T> {
        C0118c(c cVar) {
        }

        public T a() {
            return new LinkedHashMap();
        }
    }

    /* compiled from: ConstructorConstructor */
    class d implements h<T> {
        d(c cVar) {
        }

        public T a() {
            return new g();
        }
    }

    /* compiled from: ConstructorConstructor */
    class e implements h<T> {
        private final l a = l.b();
        final /* synthetic */ Class b;
        final /* synthetic */ Type c;

        e(c cVar, Class cls, Type type) {
            this.b = cls;
            this.c = type;
        }

        public T a() {
            try {
                return this.a.c(this.b);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e2);
            }
        }
    }

    /* compiled from: ConstructorConstructor */
    class f implements h<T> {
        final /* synthetic */ com.google.gson.h a;
        final /* synthetic */ Type b;

        f(c cVar, com.google.gson.h hVar, Type type) {
            this.a = hVar;
            this.b = type;
        }

        public T a() {
            return this.a.a(this.b);
        }
    }

    /* compiled from: ConstructorConstructor */
    class g implements h<T> {
        final /* synthetic */ com.google.gson.h a;
        final /* synthetic */ Type b;

        g(c cVar, com.google.gson.h hVar, Type type) {
            this.a = hVar;
            this.b = type;
        }

        public T a() {
            return this.a.a(this.b);
        }
    }

    /* compiled from: ConstructorConstructor */
    class h implements h<T> {
        final /* synthetic */ Constructor a;

        h(c cVar, Constructor constructor) {
            this.a = constructor;
        }

        public T a() {
            try {
                return this.a.newInstance((Object[]) null);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e3.getTargetException());
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    /* compiled from: ConstructorConstructor */
    class i implements h<T> {
        i(c cVar) {
        }

        public T a() {
            return new TreeSet();
        }
    }

    /* compiled from: ConstructorConstructor */
    class j implements h<T> {
        final /* synthetic */ Type a;

        j(c cVar, Type type) {
            this.a = type;
        }

        public T a() {
            Type type = this.a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.a.toString());
        }
    }

    /* compiled from: ConstructorConstructor */
    class k implements h<T> {
        k(c cVar) {
        }

        public T a() {
            return new LinkedHashSet();
        }
    }

    /* compiled from: ConstructorConstructor */
    class l implements h<T> {
        l(c cVar) {
        }

        public T a() {
            return new ArrayDeque();
        }
    }

    /* compiled from: ConstructorConstructor */
    class m implements h<T> {
        m(c cVar) {
        }

        public T a() {
            return new ArrayList();
        }
    }

    /* compiled from: ConstructorConstructor */
    class n implements h<T> {
        n(c cVar) {
        }

        public T a() {
            return new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, com.google.gson.h<?>> map) {
        this.a = map;
    }

    private <T> h<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.b.b(declaredConstructor);
            }
            return new h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> h<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new i(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new j(this, type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new k(this);
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new l(this);
            }
            return new m(this);
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new n(this);
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new a(this);
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new b(this);
            }
            if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(com.google.gson.u.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) {
                return new d(this);
            }
            return new C0118c(this);
        }
    }

    private <T> h<T> d(Type type, Class<? super T> cls) {
        return new e(this, cls, type);
    }

    public <T> h<T> a(com.google.gson.u.a<T> aVar) {
        Type e2 = aVar.e();
        Class<? super T> c = aVar.c();
        com.google.gson.h hVar = this.a.get(e2);
        if (hVar != null) {
            return new f(this, hVar, e2);
        }
        com.google.gson.h hVar2 = this.a.get(c);
        if (hVar2 != null) {
            return new g(this, hVar2, e2);
        }
        h<T> b2 = b(c);
        if (b2 != null) {
            return b2;
        }
        h<T> c2 = c(e2, c);
        if (c2 != null) {
            return c2;
        }
        return d(e2, c);
    }

    public String toString() {
        return this.a.toString();
    }
}

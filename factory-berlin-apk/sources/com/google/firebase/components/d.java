package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public final class d<T> {
    private final Set<Class<? super T>> a;
    private final Set<n> b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3873d;

    /* renamed from: e  reason: collision with root package name */
    private final g<T> f3874e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f3875f;

    /* compiled from: com.google.firebase:firebase-components@@16.0.0 */
    public static class b<T> {
        private final Set<Class<? super T>> a;
        private final Set<n> b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f3876d;

        /* renamed from: e  reason: collision with root package name */
        private g<T> f3877e;

        /* renamed from: f  reason: collision with root package name */
        private Set<Class<?>> f3878f;

        /* access modifiers changed from: private */
        public b<T> f() {
            this.f3876d = 1;
            return this;
        }

        private b<T> g(int i2) {
            r.d(this.c == 0, "Instantiation type has already been set.");
            this.c = i2;
            return this;
        }

        private void h(Class<?> cls) {
            r.a(!this.a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(n nVar) {
            r.c(nVar, "Null dependency");
            h(nVar.a());
            this.b.add(nVar);
            return this;
        }

        public d<T> c() {
            r.d(this.f3877e != null, "Missing required property: factory.");
            return new d(new HashSet(this.a), new HashSet(this.b), this.c, this.f3876d, this.f3877e, this.f3878f);
        }

        public b<T> d() {
            g(2);
            return this;
        }

        public b<T> e(g<T> gVar) {
            r.c(gVar, "Null factory");
            this.f3877e = gVar;
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.a = new HashSet();
            this.b = new HashSet();
            this.c = 0;
            this.f3876d = 0;
            this.f3878f = new HashSet();
            r.c(cls, "Null interface");
            this.a.add(cls);
            for (Class<? super T> c2 : clsArr) {
                r.c(c2, "Null interface");
            }
            Collections.addAll(this.a, clsArr);
        }
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> b(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> d<T> g(T t, Class<T> cls) {
        b<T> h2 = h(cls);
        h2.e(c.b(t));
        return h2.c();
    }

    public static <T> b<T> h(Class<T> cls) {
        b<T> a2 = a(cls);
        b unused = a2.f();
        return a2;
    }

    static /* synthetic */ Object l(Object obj, e eVar) {
        return obj;
    }

    static /* synthetic */ Object m(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> d<T> n(T t, Class<T> cls, Class<? super T>... clsArr) {
        b<T> b2 = b(cls, clsArr);
        b2.e(b.b(t));
        return b2.c();
    }

    public Set<n> c() {
        return this.b;
    }

    public g<T> d() {
        return this.f3874e;
    }

    public Set<Class<? super T>> e() {
        return this.a;
    }

    public Set<Class<?>> f() {
        return this.f3875f;
    }

    public boolean i() {
        return this.c == 1;
    }

    public boolean j() {
        return this.c == 2;
    }

    public boolean k() {
        return this.f3873d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.f3873d + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }

    private d(Set<Class<? super T>> set, Set<n> set2, int i2, int i3, g<T> gVar, Set<Class<?>> set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = i2;
        this.f3873d = i3;
        this.f3874e = gVar;
        this.f3875f = Collections.unmodifiableSet(set3);
    }
}

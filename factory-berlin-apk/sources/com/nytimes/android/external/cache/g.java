package com.nytimes.android.external.cache;

import java.io.Serializable;

/* compiled from: Equivalence */
public abstract class g<T> {

    /* compiled from: Equivalence */
    static final class a extends g<Object> implements Serializable {

        /* renamed from: g  reason: collision with root package name */
        static final a f4653g = new a();

        a() {
        }

        /* access modifiers changed from: protected */
        public boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        /* access modifiers changed from: protected */
        public int b(Object obj) {
            return obj.hashCode();
        }
    }

    /* compiled from: Equivalence */
    static final class b extends g<Object> implements Serializable {

        /* renamed from: g  reason: collision with root package name */
        static final b f4654g = new b();

        b() {
        }

        /* access modifiers changed from: protected */
        public boolean a(Object obj, Object obj2) {
            return false;
        }

        /* access modifiers changed from: protected */
        public int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected g() {
    }

    public static g<Object> c() {
        return a.f4653g;
    }

    public static g<Object> f() {
        return b.f4654g;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(T t, T t2);

    /* access modifiers changed from: protected */
    public abstract int b(T t);

    public final boolean d(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return a(t, t2);
    }

    public final int e(T t) {
        if (t == null) {
            return 0;
        }
        return b(t);
    }
}

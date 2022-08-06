package com.google.firebase.components;

import com.google.firebase.e.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
final class s extends a {
    private final Set<Class<?>> a;
    private final Set<Class<?>> b;
    private final Set<Class<?>> c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Class<?>> f3883d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<Class<?>> f3884e;

    /* renamed from: f  reason: collision with root package name */
    private final e f3885f;

    /* compiled from: com.google.firebase:firebase-components@@16.0.0 */
    private static class a implements c {
        public a(Set<Class<?>> set, c cVar) {
        }
    }

    s(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (n next : dVar.c()) {
            if (next.b()) {
                if (next.d()) {
                    hashSet3.add(next.a());
                } else {
                    hashSet.add(next.a());
                }
            } else if (next.d()) {
                hashSet4.add(next.a());
            } else {
                hashSet2.add(next.a());
            }
        }
        if (!dVar.f().isEmpty()) {
            hashSet.add(c.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.f3883d = Collections.unmodifiableSet(hashSet4);
        this.f3884e = dVar.f();
        this.f3885f = eVar;
    }

    public <T> Set<T> a(Class<T> cls) {
        if (this.c.contains(cls)) {
            return this.f3885f.a(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    public <T> com.google.firebase.g.a<T> b(Class<T> cls) {
        if (this.b.contains(cls)) {
            return this.f3885f.b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public <T> com.google.firebase.g.a<Set<T>> c(Class<T> cls) {
        if (this.f3883d.contains(cls)) {
            return this.f3885f.c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    public <T> T get(Class<T> cls) {
        if (this.a.contains(cls)) {
            T t = this.f3885f.get(cls);
            if (!cls.equals(c.class)) {
                return t;
            }
            return new a(this.f3884e, (c) t);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }
}

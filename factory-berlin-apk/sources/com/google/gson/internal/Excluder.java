package com.google.gson.internal;

import com.google.gson.annotations.d;
import com.google.gson.b;
import com.google.gson.f;
import com.google.gson.s;
import com.google.gson.stream.c;
import com.google.gson.t;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public final class Excluder implements t, Cloneable {

    /* renamed from: m  reason: collision with root package name */
    public static final Excluder f4239m = new Excluder();

    /* renamed from: g  reason: collision with root package name */
    private double f4240g = -1.0d;

    /* renamed from: h  reason: collision with root package name */
    private int f4241h = 136;

    /* renamed from: i  reason: collision with root package name */
    private boolean f4242i = true;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4243j;

    /* renamed from: k  reason: collision with root package name */
    private List<b> f4244k = Collections.emptyList();

    /* renamed from: l  reason: collision with root package name */
    private List<b> f4245l = Collections.emptyList();

    class a extends s<T> {
        private s<T> a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f4246d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.google.gson.u.a f4247e;

        a(boolean z, boolean z2, f fVar, com.google.gson.u.a aVar) {
            this.b = z;
            this.c = z2;
            this.f4246d = fVar;
            this.f4247e = aVar;
        }

        private s<T> e() {
            s<T> sVar = this.a;
            if (sVar != null) {
                return sVar;
            }
            s<T> m2 = this.f4246d.m(Excluder.this, this.f4247e);
            this.a = m2;
            return m2;
        }

        public T b(com.google.gson.stream.a aVar) {
            if (!this.b) {
                return e().b(aVar);
            }
            aVar.skipValue();
            return null;
        }

        public void d(c cVar, T t) {
            if (this.c) {
                cVar.D();
            } else {
                e().d(cVar, t);
            }
        }
    }

    private boolean f(Class<?> cls) {
        if (this.f4240g != -1.0d && !u((com.google.gson.annotations.c) cls.getAnnotation(com.google.gson.annotations.c.class), (d) cls.getAnnotation(d.class))) {
            return true;
        }
        if ((this.f4242i || !p(cls)) && !m(cls)) {
            return false;
        }
        return true;
    }

    private boolean g(Class<?> cls, boolean z) {
        for (b a2 : z ? this.f4244k : this.f4245l) {
            if (a2.a(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean m(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean p(Class<?> cls) {
        return cls.isMemberClass() && !r(cls);
    }

    private boolean r(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean s(com.google.gson.annotations.c cVar) {
        return cVar == null || cVar.value() <= this.f4240g;
    }

    private boolean t(d dVar) {
        return dVar == null || dVar.value() > this.f4240g;
    }

    private boolean u(com.google.gson.annotations.c cVar, d dVar) {
        return s(cVar) && t(dVar);
    }

    public <T> s<T> c(f fVar, com.google.gson.u.a<T> aVar) {
        Class<? super T> c = aVar.c();
        boolean f2 = f(c);
        boolean z = f2 || g(c, true);
        boolean z2 = f2 || g(c, false);
        if (z || z2) {
            return new a(z2, z, fVar, aVar);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean e(Class<?> cls, boolean z) {
        return f(cls) || g(cls, z);
    }

    public boolean h(Field field, boolean z) {
        com.google.gson.annotations.a aVar;
        if ((this.f4241h & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f4240g != -1.0d && !u((com.google.gson.annotations.c) field.getAnnotation(com.google.gson.annotations.c.class), (d) field.getAnnotation(d.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f4243j && ((aVar = (com.google.gson.annotations.a) field.getAnnotation(com.google.gson.annotations.a.class)) == null || (!z ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f4242i && p(field.getType())) || m(field.getType())) {
            return true;
        }
        List<b> list = z ? this.f4244k : this.f4245l;
        if (list.isEmpty()) {
            return false;
        }
        com.google.gson.c cVar = new com.google.gson.c(field);
        for (b b : list) {
            if (b.b(cVar)) {
                return true;
            }
        }
        return false;
    }
}

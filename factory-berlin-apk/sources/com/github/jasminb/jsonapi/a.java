package com.github.jasminb.jsonapi;

import com.github.jasminb.jsonapi.p.b;
import com.github.jasminb.jsonapi.p.c;
import com.github.jasminb.jsonapi.p.d;
import com.github.jasminb.jsonapi.p.e;
import com.github.jasminb.jsonapi.p.f;
import com.github.jasminb.jsonapi.p.g;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ConverterConfiguration */
public class a {
    private final Map<String, Class<?>> a = new HashMap();
    private final Map<Class<?>, g> b = new HashMap();
    private final Map<Class<?>, Field> c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, l> f1882d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, List<Field>> f1883e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Map<Class<?>, Map<String, Class<?>>> f1884f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final Map<Class<?>, Map<String, Field>> f1885g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private final Map<Field, d> f1886h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private final Map<Field, f> f1887i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private final Map<Class<?>, Map<String, Class<?>>> f1888j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private final Map<Class<?>, Map<String, Field>> f1889k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    private final Map<Class<?>, Class<?>> f1890l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    private final Map<Class<?>, Field> f1891m = new HashMap();

    /* renamed from: n  reason: collision with root package name */
    private final Map<Class<?>, Field> f1892n = new HashMap();
    private final Map<Class<?>, Map<String, Field>> o = new HashMap();

    public a(Class<?>... clsArr) {
        for (Class<?> r : clsArr) {
            r(r);
        }
    }

    private void q(Class<?> cls) {
        if (cls.isAnnotationPresent(g.class)) {
            g gVar = (g) cls.getAnnotation(g.class);
            this.a.put(gVar.value(), cls);
            this.b.put(cls, gVar);
            this.f1884f.put(cls, new HashMap());
            this.f1885g.put(cls, new HashMap());
            this.f1889k.put(cls, new HashMap());
            this.f1888j.put(cls, new HashMap());
            this.o.put(cls, new HashMap());
            List<Field> a2 = g.a(cls, d.class, true);
            for (Field next : a2) {
                next.setAccessible(true);
                d dVar = (d) next.getAnnotation(d.class);
                Class<?> b2 = g.b(next);
                this.f1884f.get(cls).put(dVar.value(), b2);
                this.f1885g.get(cls).put(dVar.value(), next);
                this.f1886h.put(next, dVar);
                if (!dVar.resolve() || dVar.relType() != null) {
                    r(b2);
                } else {
                    throw new IllegalArgumentException("@Relationship on " + cls.getName() + "#" + next.getName() + " with 'resolve = true' must have a relType attribute set.");
                }
            }
            this.f1883e.put(cls, a2);
            for (Field next2 : g.a(cls, f.class, true)) {
                next2.setAccessible(true);
                f fVar = (f) next2.getAnnotation(f.class);
                this.f1888j.get(cls).put(fVar.value(), g.b(next2));
                this.f1887i.put(next2, fVar);
                this.f1889k.get(cls).put(fVar.value(), next2);
            }
            for (Field next3 : g.a(cls, e.class, true)) {
                next3.setAccessible(true);
                this.o.get(cls).put(((e) next3.getAnnotation(e.class)).value(), next3);
            }
            List<Field> a3 = g.a(cls, com.github.jasminb.jsonapi.p.a.class, true);
            if (!a3.isEmpty() && a3.size() == 1) {
                Field field = a3.get(0);
                field.setAccessible(true);
                this.c.put(cls, field);
                try {
                    this.f1882d.put(cls, ((com.github.jasminb.jsonapi.p.a) field.getAnnotation(com.github.jasminb.jsonapi.p.a.class)).value().newInstance());
                    List<Field> a4 = g.a(cls, c.class, true);
                    if (a4.size() == 1) {
                        Field field2 = a4.get(0);
                        field2.setAccessible(true);
                        this.f1890l.put(cls, g.b(field2));
                        this.f1891m.put(cls, field2);
                    } else if (a4.size() > 1) {
                        throw new IllegalArgumentException(String.format("Only one meta field is allowed for type '%s'", new Object[]{cls.getCanonicalName()}));
                    }
                    List<Field> a5 = g.a(cls, b.class, true);
                    if (a5.size() == 1) {
                        Field field3 = a5.get(0);
                        field3.setAccessible(true);
                        Class<?> b3 = g.b(field3);
                        if (f.class.isAssignableFrom(b3)) {
                            this.f1892n.put(cls, field3);
                        } else {
                            throw new IllegalArgumentException(String.format("%s is not allowed to be used as @Links attribute. Only com.github.jasminb.jsonapi.Links or its derivatives can be annotated as @Links", new Object[]{b3.getCanonicalName()}));
                        }
                    } else if (a5.size() > 1) {
                        throw new IllegalArgumentException(String.format("Only one links field is allowed for type '%s'", new Object[]{cls.getCanonicalName()}));
                    }
                } catch (IllegalAccessException | InstantiationException e2) {
                    throw new IllegalArgumentException("Unable to construct handler instance by using no-arg constructor", e2);
                }
            } else if (a3.isEmpty()) {
                throw new IllegalArgumentException("All resource classes must have a field annotated with the @Id annotation");
            } else {
                throw new IllegalArgumentException("Only single @Id annotation is allowed per defined type!");
            }
        } else if (!cls.isInterface()) {
            throw new IllegalArgumentException(String.format("Class %s doesn't have a Type annotation. All resource classes must be annotated with a Type annotation!", new Object[]{cls.getName()}));
        }
    }

    public d a(Field field) {
        return this.f1886h.get(field);
    }

    public Field b(Class<?> cls) {
        return this.c.get(cls);
    }

    public l c(Class<?> cls) {
        return this.f1882d.get(cls);
    }

    public Field d(Class<?> cls) {
        return this.f1892n.get(cls);
    }

    public Field e(Class<?> cls) {
        return this.f1891m.get(cls);
    }

    public Class<?> f(Class<?> cls) {
        return this.f1890l.get(cls);
    }

    public Field g(Class<?> cls, String str) {
        return (Field) this.f1885g.get(cls).get(str);
    }

    public List<Field> h(Class<?> cls) {
        return this.f1883e.get(cls);
    }

    public Field i(Class<?> cls, String str) {
        return (Field) this.o.get(cls).get(str);
    }

    public Field j(Class<?> cls, String str) {
        return (Field) this.f1889k.get(cls).get(str);
    }

    public Class<?> k(Class<?> cls, String str) {
        return (Class) this.f1888j.get(cls).get(str);
    }

    public Class<?> l(Class<?> cls, String str) {
        return (Class) this.f1884f.get(cls).get(str);
    }

    public g m(Class<?> cls) {
        return this.b.get(cls);
    }

    public Class<?> n(String str) {
        return this.a.get(str);
    }

    public String o(Class<?> cls) {
        g gVar = this.b.get(cls);
        if (gVar != null) {
            return gVar.value();
        }
        return null;
    }

    public boolean p(Class<?> cls) {
        return this.b.containsKey(cls);
    }

    public synchronized boolean r(Class<?> cls) {
        if (p(cls)) {
            return false;
        }
        q(cls);
        return true;
    }
}

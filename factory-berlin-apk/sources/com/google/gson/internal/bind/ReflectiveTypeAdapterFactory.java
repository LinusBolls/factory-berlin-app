package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.e;
import com.google.gson.f;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.h;
import com.google.gson.internal.j;
import com.google.gson.s;
import com.google.gson.t;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements t {

    /* renamed from: g  reason: collision with root package name */
    private final com.google.gson.internal.c f4260g;

    /* renamed from: h  reason: collision with root package name */
    private final e f4261h;

    /* renamed from: i  reason: collision with root package name */
    private final Excluder f4262i;

    /* renamed from: j  reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f4263j;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.gson.internal.m.b f4264k = com.google.gson.internal.m.b.a();

    class a extends c {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Field f4265d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f4266e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ s f4267f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f4268g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ com.google.gson.u.a f4269h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f4270i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory, String str, boolean z, boolean z2, Field field, boolean z3, s sVar, f fVar, com.google.gson.u.a aVar, boolean z4) {
            super(str, z, z2);
            this.f4265d = field;
            this.f4266e = z3;
            this.f4267f = sVar;
            this.f4268g = fVar;
            this.f4269h = aVar;
            this.f4270i = z4;
        }

        /* access modifiers changed from: package-private */
        public void a(com.google.gson.stream.a aVar, Object obj) {
            Object b = this.f4267f.b(aVar);
            if (b != null || !this.f4270i) {
                this.f4265d.set(obj, b);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(com.google.gson.stream.c cVar, Object obj) {
            s sVar;
            Object obj2 = this.f4265d.get(obj);
            if (this.f4266e) {
                sVar = this.f4267f;
            } else {
                sVar = new c(this.f4268g, this.f4267f, this.f4269h.e());
            }
            sVar.d(cVar, obj2);
        }

        public boolean c(Object obj) {
            if (this.b && this.f4265d.get(obj) != obj) {
                return true;
            }
            return false;
        }
    }

    public static final class b<T> extends s<T> {
        private final h<T> a;
        private final Map<String, c> b;

        b(h<T> hVar, Map<String, c> map) {
            this.a = hVar;
            this.b = map;
        }

        public T b(com.google.gson.stream.a aVar) {
            if (aVar.Z() == com.google.gson.stream.b.NULL) {
                aVar.L();
                return null;
            }
            T a2 = this.a.a();
            try {
                aVar.b();
                while (aVar.hasNext()) {
                    c cVar = this.b.get(aVar.nextName());
                    if (cVar != null) {
                        if (cVar.c) {
                            cVar.a(aVar, a2);
                        }
                    }
                    aVar.skipValue();
                }
                aVar.l();
                return a2;
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }

        public void d(com.google.gson.stream.c cVar, T t) {
            if (t == null) {
                cVar.D();
                return;
            }
            cVar.i();
            try {
                for (c next : this.b.values()) {
                    if (next.c(t)) {
                        cVar.y(next.a);
                        next.b(cVar, t);
                    }
                }
                cVar.l();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    static abstract class c {
        final String a;
        final boolean b;
        final boolean c;

        protected c(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        /* access modifiers changed from: package-private */
        public abstract void a(com.google.gson.stream.a aVar, Object obj);

        /* access modifiers changed from: package-private */
        public abstract void b(com.google.gson.stream.c cVar, Object obj);

        /* access modifiers changed from: package-private */
        public abstract boolean c(Object obj);
    }

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.c cVar, e eVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f4260g = cVar;
        this.f4261h = eVar;
        this.f4262i = excluder;
        this.f4263j = jsonAdapterAnnotationTypeAdapterFactory;
    }

    private c a(f fVar, Field field, String str, com.google.gson.u.a<?> aVar, boolean z, boolean z2) {
        f fVar2 = fVar;
        com.google.gson.u.a<?> aVar2 = aVar;
        boolean a2 = j.a(aVar.c());
        Field field2 = field;
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        s<?> a3 = jsonAdapter != null ? this.f4263j.a(this.f4260g, fVar, aVar2, jsonAdapter) : null;
        boolean z3 = a3 != null;
        if (a3 == null) {
            a3 = fVar.k(aVar2);
        }
        return new a(this, str, z, z2, field, z3, a3, fVar, aVar, a2);
    }

    static boolean d(Field field, boolean z, Excluder excluder) {
        return !excluder.e(field.getType(), z) && !excluder.h(field, z);
    }

    private Map<String, c> e(f fVar, com.google.gson.u.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type e2 = aVar.e();
        com.google.gson.u.a<?> aVar2 = aVar;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                boolean b2 = b(field, true);
                boolean b3 = b(field, z);
                if (b2 || b3) {
                    this.f4264k.b(field);
                    Type p = com.google.gson.internal.b.p(aVar2.e(), cls2, field.getGenericType());
                    List<String> f2 = f(field);
                    int size = f2.size();
                    c cVar = null;
                    int i3 = 0;
                    while (i3 < size) {
                        String str = f2.get(i3);
                        boolean z2 = i3 != 0 ? false : b2;
                        String str2 = str;
                        int i4 = i3;
                        c cVar2 = cVar;
                        int i5 = size;
                        List<String> list = f2;
                        Field field2 = field;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str2, a(fVar, field, str2, com.google.gson.u.a.b(p), z2, b3)) : cVar2;
                        i3 = i4 + 1;
                        b2 = z2;
                        f2 = list;
                        size = i5;
                        field = field2;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(e2 + " declares multiple JSON fields named " + cVar3.a);
                    }
                }
                i2++;
                z = false;
            }
            aVar2 = com.google.gson.u.a.b(com.google.gson.internal.b.p(aVar2.e(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.c();
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        com.google.gson.annotations.b bVar = (com.google.gson.annotations.b) field.getAnnotation(com.google.gson.annotations.b.class);
        if (bVar == null) {
            return Collections.singletonList(this.f4261h.a(field));
        }
        String value = bVar.value();
        String[] alternate = bVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public boolean b(Field field, boolean z) {
        return d(field, z, this.f4262i);
    }

    public <T> s<T> c(f fVar, com.google.gson.u.a<T> aVar) {
        Class<? super T> c2 = aVar.c();
        if (!Object.class.isAssignableFrom(c2)) {
            return null;
        }
        return new b(this.f4260g.a(aVar), e(fVar, aVar, c2));
    }
}

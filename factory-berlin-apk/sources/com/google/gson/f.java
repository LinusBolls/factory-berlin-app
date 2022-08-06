package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.j;
import com.google.gson.internal.k;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: Gson */
public final class f {

    /* renamed from: k  reason: collision with root package name */
    private static final com.google.gson.u.a<?> f4219k = com.google.gson.u.a.a(Object.class);
    private final ThreadLocal<Map<com.google.gson.u.a<?>, C0115f<?>>> a;
    private final Map<com.google.gson.u.a<?>, s<?>> b;
    private final com.google.gson.internal.c c;

    /* renamed from: d  reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f4220d;

    /* renamed from: e  reason: collision with root package name */
    final List<t> f4221e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f4222f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f4223g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f4224h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f4225i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f4226j;

    /* compiled from: Gson */
    class a extends s<Number> {
        a(f fVar) {
        }

        /* renamed from: e */
        public Double b(com.google.gson.stream.a aVar) {
            if (aVar.Z() != com.google.gson.stream.b.NULL) {
                return Double.valueOf(aVar.z());
            }
            aVar.L();
            return null;
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, Number number) {
            if (number == null) {
                cVar.D();
                return;
            }
            f.d(number.doubleValue());
            cVar.t0(number);
        }
    }

    /* compiled from: Gson */
    class b extends s<Number> {
        b(f fVar) {
        }

        /* renamed from: e */
        public Float b(com.google.gson.stream.a aVar) {
            if (aVar.Z() != com.google.gson.stream.b.NULL) {
                return Float.valueOf((float) aVar.z());
            }
            aVar.L();
            return null;
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, Number number) {
            if (number == null) {
                cVar.D();
                return;
            }
            f.d((double) number.floatValue());
            cVar.t0(number);
        }
    }

    /* compiled from: Gson */
    class c extends s<Number> {
        c() {
        }

        /* renamed from: e */
        public Number b(com.google.gson.stream.a aVar) {
            if (aVar.Z() != com.google.gson.stream.b.NULL) {
                return Long.valueOf(aVar.F());
            }
            aVar.L();
            return null;
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, Number number) {
            if (number == null) {
                cVar.D();
            } else {
                cVar.w0(number.toString());
            }
        }
    }

    /* compiled from: Gson */
    class d extends s<AtomicLong> {
        final /* synthetic */ s a;

        d(s sVar) {
            this.a = sVar;
        }

        /* renamed from: e */
        public AtomicLong b(com.google.gson.stream.a aVar) {
            return new AtomicLong(((Number) this.a.b(aVar)).longValue());
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, AtomicLong atomicLong) {
            this.a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* compiled from: Gson */
    class e extends s<AtomicLongArray> {
        final /* synthetic */ s a;

        e(s sVar) {
            this.a = sVar;
        }

        /* renamed from: e */
        public AtomicLongArray b(com.google.gson.stream.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.a.b(aVar)).longValue()));
            }
            aVar.k();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: f */
        public void d(com.google.gson.stream.c cVar, AtomicLongArray atomicLongArray) {
            cVar.h();
            int length = atomicLongArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                this.a.d(cVar, Long.valueOf(atomicLongArray.get(i2)));
            }
            cVar.k();
        }
    }

    /* renamed from: com.google.gson.f$f  reason: collision with other inner class name */
    /* compiled from: Gson */
    static class C0115f<T> extends s<T> {
        private s<T> a;

        C0115f() {
        }

        public T b(com.google.gson.stream.a aVar) {
            s<T> sVar = this.a;
            if (sVar != null) {
                return sVar.b(aVar);
            }
            throw new IllegalStateException();
        }

        public void d(com.google.gson.stream.c cVar, T t) {
            s<T> sVar = this.a;
            if (sVar != null) {
                sVar.d(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }

        public void e(s<T> sVar) {
            if (this.a == null) {
                this.a = sVar;
                return;
            }
            throw new AssertionError();
        }
    }

    public f() {
        this(Excluder.f4239m, d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, r.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    private static void a(Object obj, com.google.gson.stream.a aVar) {
        if (obj != null) {
            try {
                if (aVar.Z() != com.google.gson.stream.b.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            } catch (IOException e3) {
                throw new JsonIOException((Throwable) e3);
            }
        }
    }

    private static s<AtomicLong> b(s<Number> sVar) {
        return new d(sVar).a();
    }

    private static s<AtomicLongArray> c(s<Number> sVar) {
        return new e(sVar).a();
    }

    static void d(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private s<Number> e(boolean z) {
        if (z) {
            return TypeAdapters.v;
        }
        return new a(this);
    }

    private s<Number> f(boolean z) {
        if (z) {
            return TypeAdapters.u;
        }
        return new b(this);
    }

    private static s<Number> n(r rVar) {
        if (rVar == r.DEFAULT) {
            return TypeAdapters.t;
        }
        return new c();
    }

    public <T> T g(com.google.gson.stream.a aVar, Type type) {
        boolean o = aVar.o();
        aVar.r0(true);
        try {
            aVar.Z();
            T b2 = k(com.google.gson.u.a.b(type)).b(aVar);
            aVar.r0(o);
            return b2;
        } catch (EOFException e2) {
            if (1 != 0) {
                aVar.r0(o);
                return null;
            }
            throw new JsonSyntaxException((Throwable) e2);
        } catch (IllegalStateException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        } catch (IOException e4) {
            throw new JsonSyntaxException((Throwable) e4);
        } catch (AssertionError e5) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e5.getMessage());
            assertionError.initCause(e5);
            throw assertionError;
        } catch (Throwable th) {
            aVar.r0(o);
            throw th;
        }
    }

    public <T> T h(Reader reader, Type type) {
        com.google.gson.stream.a o = o(reader);
        T g2 = g(o, type);
        a(g2, o);
        return g2;
    }

    public <T> T i(String str, Class<T> cls) {
        return j.b(cls).cast(j(str, cls));
    }

    public <T> T j(String str, Type type) {
        if (str == null) {
            return null;
        }
        return h(new StringReader(str), type);
    }

    public <T> s<T> k(com.google.gson.u.a<T> aVar) {
        s<T> sVar = this.b.get(aVar == null ? f4219k : aVar);
        if (sVar != null) {
            return sVar;
        }
        Map map = this.a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.a.set(map);
            z = true;
        }
        C0115f fVar = (C0115f) map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            C0115f fVar2 = new C0115f();
            map.put(aVar, fVar2);
            for (t c2 : this.f4221e) {
                s<T> c3 = c2.c(this, aVar);
                if (c3 != null) {
                    fVar2.e(c3);
                    this.b.put(aVar, c3);
                    return c3;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.a.remove();
            }
        }
    }

    public <T> s<T> l(Class<T> cls) {
        return k(com.google.gson.u.a.a(cls));
    }

    public <T> s<T> m(t tVar, com.google.gson.u.a<T> aVar) {
        if (!this.f4221e.contains(tVar)) {
            tVar = this.f4220d;
        }
        boolean z = false;
        for (t next : this.f4221e) {
            if (z) {
                s<T> c2 = next.c(this, aVar);
                if (c2 != null) {
                    return c2;
                }
            } else if (next == tVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public com.google.gson.stream.a o(Reader reader) {
        com.google.gson.stream.a aVar = new com.google.gson.stream.a(reader);
        aVar.r0(this.f4226j);
        return aVar;
    }

    public com.google.gson.stream.c p(Writer writer) {
        if (this.f4223g) {
            writer.write(")]}'\n");
        }
        com.google.gson.stream.c cVar = new com.google.gson.stream.c(writer);
        if (this.f4225i) {
            cVar.Z("  ");
        }
        cVar.i0(this.f4222f);
        return cVar;
    }

    public String q(l lVar) {
        StringWriter stringWriter = new StringWriter();
        u(lVar, stringWriter);
        return stringWriter.toString();
    }

    public String r(Object obj) {
        if (obj == null) {
            return q(m.a);
        }
        return s(obj, obj.getClass());
    }

    public String s(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        w(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void t(l lVar, com.google.gson.stream.c cVar) {
        boolean q = cVar.q();
        cVar.b0(true);
        boolean o = cVar.o();
        cVar.U(this.f4224h);
        boolean n2 = cVar.n();
        cVar.i0(this.f4222f);
        try {
            k.b(lVar, cVar);
            cVar.b0(q);
            cVar.U(o);
            cVar.i0(n2);
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            cVar.b0(q);
            cVar.U(o);
            cVar.i0(n2);
            throw th;
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f4222f + ",factories:" + this.f4221e + ",instanceCreators:" + this.c + "}";
    }

    public void u(l lVar, Appendable appendable) {
        try {
            t(lVar, p(k.c(appendable)));
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        }
    }

    public void v(Object obj, Type type, com.google.gson.stream.c cVar) {
        s<?> k2 = k(com.google.gson.u.a.b(type));
        boolean q = cVar.q();
        cVar.b0(true);
        boolean o = cVar.o();
        cVar.U(this.f4224h);
        boolean n2 = cVar.n();
        cVar.i0(this.f4222f);
        try {
            k2.d(cVar, obj);
            cVar.b0(q);
            cVar.U(o);
            cVar.i0(n2);
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            cVar.b0(q);
            cVar.U(o);
            cVar.i0(n2);
            throw th;
        }
    }

    public void w(Object obj, Type type, Appendable appendable) {
        try {
            v(obj, type, p(k.c(appendable)));
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        }
    }

    f(Excluder excluder, e eVar, Map<Type, h<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, r rVar, String str, int i2, int i3, List<t> list, List<t> list2, List<t> list3) {
        Excluder excluder2 = excluder;
        boolean z8 = z7;
        this.a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        Map<Type, h<?>> map2 = map;
        this.c = new com.google.gson.internal.c(map);
        this.f4222f = z;
        this.f4223g = z3;
        this.f4224h = z4;
        this.f4225i = z5;
        this.f4226j = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.Y);
        arrayList.add(ObjectTypeAdapter.b);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.D);
        arrayList.add(TypeAdapters.f4289m);
        arrayList.add(TypeAdapters.f4283g);
        arrayList.add(TypeAdapters.f4285i);
        arrayList.add(TypeAdapters.f4287k);
        s<Number> n2 = n(rVar);
        arrayList.add(TypeAdapters.b(Long.TYPE, Long.class, n2));
        arrayList.add(TypeAdapters.b(Double.TYPE, Double.class, e(z8)));
        arrayList.add(TypeAdapters.b(Float.TYPE, Float.class, f(z8)));
        arrayList.add(TypeAdapters.x);
        arrayList.add(TypeAdapters.o);
        arrayList.add(TypeAdapters.q);
        arrayList.add(TypeAdapters.a(AtomicLong.class, b(n2)));
        arrayList.add(TypeAdapters.a(AtomicLongArray.class, c(n2)));
        arrayList.add(TypeAdapters.s);
        arrayList.add(TypeAdapters.z);
        arrayList.add(TypeAdapters.F);
        arrayList.add(TypeAdapters.H);
        arrayList.add(TypeAdapters.a(BigDecimal.class, TypeAdapters.B));
        arrayList.add(TypeAdapters.a(BigInteger.class, TypeAdapters.C));
        arrayList.add(TypeAdapters.J);
        arrayList.add(TypeAdapters.L);
        arrayList.add(TypeAdapters.P);
        arrayList.add(TypeAdapters.R);
        arrayList.add(TypeAdapters.W);
        arrayList.add(TypeAdapters.N);
        arrayList.add(TypeAdapters.f4280d);
        arrayList.add(DateTypeAdapter.b);
        arrayList.add(TypeAdapters.U);
        arrayList.add(TimeTypeAdapter.b);
        arrayList.add(SqlDateTypeAdapter.b);
        arrayList.add(TypeAdapters.S);
        arrayList.add(ArrayTypeAdapter.c);
        arrayList.add(TypeAdapters.b);
        arrayList.add(new CollectionTypeAdapterFactory(this.c));
        boolean z9 = z2;
        arrayList.add(new MapTypeAdapterFactory(this.c, z2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(this.c);
        this.f4220d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.Z);
        e eVar2 = eVar;
        arrayList.add(new ReflectiveTypeAdapterFactory(this.c, eVar, excluder, this.f4220d));
        this.f4221e = Collections.unmodifiableList(arrayList);
    }
}

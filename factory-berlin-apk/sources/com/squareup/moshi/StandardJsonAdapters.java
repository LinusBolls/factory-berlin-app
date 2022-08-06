package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class StandardJsonAdapters {
    public static final JsonAdapter.d a = new c();
    static final JsonAdapter<Boolean> b = new d();
    static final JsonAdapter<Byte> c = new e();

    /* renamed from: d  reason: collision with root package name */
    static final JsonAdapter<Character> f8083d = new f();

    /* renamed from: e  reason: collision with root package name */
    static final JsonAdapter<Double> f8084e = new g();

    /* renamed from: f  reason: collision with root package name */
    static final JsonAdapter<Float> f8085f = new h();

    /* renamed from: g  reason: collision with root package name */
    static final JsonAdapter<Integer> f8086g = new i();

    /* renamed from: h  reason: collision with root package name */
    static final JsonAdapter<Long> f8087h = new j();

    /* renamed from: i  reason: collision with root package name */
    static final JsonAdapter<Short> f8088i = new k();

    /* renamed from: j  reason: collision with root package name */
    static final JsonAdapter<String> f8089j = new a();

    static final class EnumJsonAdapter<T extends Enum<T>> extends JsonAdapter<T> {
        private final T[] constants;
        private final Class<T> enumType;
        private final String[] nameStrings;
        private final g.b options;

        EnumJsonAdapter(Class<T> cls) {
            this.enumType = cls;
            try {
                T[] tArr = (Enum[]) cls.getEnumConstants();
                this.constants = tArr;
                this.nameStrings = new String[tArr.length];
                for (int i2 = 0; i2 < this.constants.length; i2++) {
                    T t = this.constants[i2];
                    d dVar = (d) cls.getField(t.name()).getAnnotation(d.class);
                    this.nameStrings[i2] = dVar != null ? dVar.name() : t.name();
                }
                this.options = g.b.a(this.nameStrings);
            } catch (NoSuchFieldException e2) {
                throw new AssertionError("Missing field in " + cls.getName(), e2);
            }
        }

        /* renamed from: i */
        public T b(g gVar) {
            int L = gVar.L(this.options);
            if (L != -1) {
                return this.constants[L];
            }
            String path = gVar.getPath();
            String nextString = gVar.nextString();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.nameStrings) + " but was " + nextString + " at path " + path);
        }

        /* renamed from: j */
        public void h(l lVar, T t) {
            lVar.b0(this.nameStrings[t.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.enumType.getName() + ")";
        }
    }

    static final class ObjectJsonAdapter extends JsonAdapter<Object> {
        private final JsonAdapter<Boolean> booleanAdapter;
        private final JsonAdapter<Double> doubleAdapter;
        private final JsonAdapter<List> listJsonAdapter;
        private final JsonAdapter<Map> mapAdapter;
        private final n moshi;
        private final JsonAdapter<String> stringAdapter;

        ObjectJsonAdapter(n nVar) {
            this.moshi = nVar;
            this.listJsonAdapter = nVar.c(List.class);
            this.mapAdapter = nVar.c(Map.class);
            this.stringAdapter = nVar.c(String.class);
            this.doubleAdapter = nVar.c(Double.class);
            this.booleanAdapter = nVar.c(Boolean.class);
        }

        private Class<?> i(Class<?> cls) {
            if (Map.class.isAssignableFrom(cls)) {
                return Map.class;
            }
            return Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        public Object b(g gVar) {
            switch (b.a[gVar.y().ordinal()]) {
                case 1:
                    return this.listJsonAdapter.b(gVar);
                case 2:
                    return this.mapAdapter.b(gVar);
                case 3:
                    return this.stringAdapter.b(gVar);
                case 4:
                    return this.doubleAdapter.b(gVar);
                case 5:
                    return this.booleanAdapter.b(gVar);
                case 6:
                    return gVar.B0();
                default:
                    throw new IllegalStateException("Expected a value but was " + gVar.y() + " at path " + gVar.getPath());
            }
        }

        public void h(l lVar, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                lVar.b();
                lVar.j();
                return;
            }
            this.moshi.e(i(cls), com.squareup.moshi.internal.a.a).h(lVar, obj);
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    class a extends JsonAdapter<String> {
        a() {
        }

        /* renamed from: i */
        public String b(g gVar) {
            return gVar.nextString();
        }

        /* renamed from: j */
        public void h(l lVar, String str) {
            lVar.b0(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.squareup.moshi.g$c[] r0 = com.squareup.moshi.g.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                com.squareup.moshi.g$c r1 = com.squareup.moshi.g.c.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.moshi.g$c r1 = com.squareup.moshi.g.c.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.squareup.moshi.g$c r1 = com.squareup.moshi.g.c.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.squareup.moshi.g$c r1 = com.squareup.moshi.g.c.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.squareup.moshi.g$c r1 = com.squareup.moshi.g.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.squareup.moshi.g$c r1 = com.squareup.moshi.g.c.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.StandardJsonAdapters.b.<clinit>():void");
        }
    }

    class c implements JsonAdapter.d {
        c() {
        }

        public JsonAdapter<?> a(Type type, Set<? extends Annotation> set, n nVar) {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return StandardJsonAdapters.b;
            }
            if (type == Byte.TYPE) {
                return StandardJsonAdapters.c;
            }
            if (type == Character.TYPE) {
                return StandardJsonAdapters.f8083d;
            }
            if (type == Double.TYPE) {
                return StandardJsonAdapters.f8084e;
            }
            if (type == Float.TYPE) {
                return StandardJsonAdapters.f8085f;
            }
            if (type == Integer.TYPE) {
                return StandardJsonAdapters.f8086g;
            }
            if (type == Long.TYPE) {
                return StandardJsonAdapters.f8087h;
            }
            if (type == Short.TYPE) {
                return StandardJsonAdapters.f8088i;
            }
            if (type == Boolean.class) {
                return StandardJsonAdapters.b.f();
            }
            if (type == Byte.class) {
                return StandardJsonAdapters.c.f();
            }
            if (type == Character.class) {
                return StandardJsonAdapters.f8083d.f();
            }
            if (type == Double.class) {
                return StandardJsonAdapters.f8084e.f();
            }
            if (type == Float.class) {
                return StandardJsonAdapters.f8085f.f();
            }
            if (type == Integer.class) {
                return StandardJsonAdapters.f8086g.f();
            }
            if (type == Long.class) {
                return StandardJsonAdapters.f8087h.f();
            }
            if (type == Short.class) {
                return StandardJsonAdapters.f8088i.f();
            }
            if (type == String.class) {
                return StandardJsonAdapters.f8089j.f();
            }
            if (type == Object.class) {
                return new ObjectJsonAdapter(nVar).f();
            }
            Class<?> g2 = p.g(type);
            JsonAdapter<?> d2 = com.squareup.moshi.internal.a.d(nVar, type, g2);
            if (d2 != null) {
                return d2;
            }
            if (g2.isEnum()) {
                return new EnumJsonAdapter(g2).f();
            }
            return null;
        }
    }

    class d extends JsonAdapter<Boolean> {
        d() {
        }

        /* renamed from: i */
        public Boolean b(g gVar) {
            return Boolean.valueOf(gVar.nextBoolean());
        }

        /* renamed from: j */
        public void h(l lVar, Boolean bool) {
            lVar.i0(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    class e extends JsonAdapter<Byte> {
        e() {
        }

        /* renamed from: i */
        public Byte b(g gVar) {
            return Byte.valueOf((byte) StandardJsonAdapters.a(gVar, "a byte", -128, 255));
        }

        /* renamed from: j */
        public void h(l lVar, Byte b) {
            lVar.U((long) (b.intValue() & 255));
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    class f extends JsonAdapter<Character> {
        f() {
        }

        /* renamed from: i */
        public Character b(g gVar) {
            String nextString = gVar.nextString();
            if (nextString.length() <= 1) {
                return Character.valueOf(nextString.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", new Object[]{"a char", '\"' + nextString + '\"', gVar.getPath()}));
        }

        /* renamed from: j */
        public void h(l lVar, Character ch) {
            lVar.b0(ch.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    class g extends JsonAdapter<Double> {
        g() {
        }

        /* renamed from: i */
        public Double b(g gVar) {
            return Double.valueOf(gVar.l());
        }

        /* renamed from: j */
        public void h(l lVar, Double d2) {
            lVar.M(d2.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    class h extends JsonAdapter<Float> {
        h() {
        }

        /* renamed from: i */
        public Float b(g gVar) {
            float l2 = (float) gVar.l();
            if (gVar.k() || !Float.isInfinite(l2)) {
                return Float.valueOf(l2);
            }
            throw new JsonDataException("JSON forbids NaN and infinities: " + l2 + " at path " + gVar.getPath());
        }

        /* renamed from: j */
        public void h(l lVar, Float f2) {
            if (f2 != null) {
                lVar.Z(f2);
                return;
            }
            throw null;
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    class i extends JsonAdapter<Integer> {
        i() {
        }

        /* renamed from: i */
        public Integer b(g gVar) {
            return Integer.valueOf(gVar.n());
        }

        /* renamed from: j */
        public void h(l lVar, Integer num) {
            lVar.U((long) num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    class j extends JsonAdapter<Long> {
        j() {
        }

        /* renamed from: i */
        public Long b(g gVar) {
            return Long.valueOf(gVar.o());
        }

        /* renamed from: j */
        public void h(l lVar, Long l2) {
            lVar.U(l2.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    class k extends JsonAdapter<Short> {
        k() {
        }

        /* renamed from: i */
        public Short b(g gVar) {
            return Short.valueOf((short) StandardJsonAdapters.a(gVar, "a short", -32768, 32767));
        }

        /* renamed from: j */
        public void h(l lVar, Short sh) {
            lVar.U((long) sh.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    static int a(g gVar, String str, int i2, int i3) {
        int n2 = gVar.n();
        if (n2 >= i2 && n2 <= i3) {
            return n2;
        }
        throw new JsonDataException(String.format("Expected %s but was %s at path %s", new Object[]{str, Integer.valueOf(n2), gVar.getPath()}));
    }
}

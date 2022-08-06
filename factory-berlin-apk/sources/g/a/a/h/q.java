package g.a.a.h;

import g.a.a.h.c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;
import kotlin.n;

/* compiled from: ScalarTypeAdapters.kt */
public final class q {
    private static final Map<String, b<? extends Object>> c = e0.h(e0.h(e0.h(e0.h(e0.h(e0.h(e0.h(e0.h(e0.h(e0.h(e0.e(), f9068d.b(new String[]{"java.lang.String", "kotlin.String"}, b.f9070h)), f9068d.b(new String[]{"java.lang.Boolean", "kotlin.Boolean", "boolean"}, c.f9071h)), f9068d.b(new String[]{"java.lang.Integer", "kotlin.Int", "int"}, d.f9072h)), f9068d.b(new String[]{"java.lang.Long", "kotlin.Long", "long"}, e.f9073h)), f9068d.b(new String[]{"java.lang.Float", "kotlin.Float", "float"}, f.f9074h)), f9068d.b(new String[]{"java.lang.Double", "kotlin.Double", "double"}, g.f9075h)), d0.b(n.a("com.apollographql.apollo.api.FileUpload", new h()))), f9068d.b(new String[]{"java.util.Map", "kotlin.collections.Map"}, i.f9076h)), f9068d.b(new String[]{"java.util.List", "kotlin.collections.List"}, j.f9077h)), f9068d.b(new String[]{"java.lang.Object", "kotlin.Any"}, a.f9069h));

    /* renamed from: d  reason: collision with root package name */
    public static final k f9068d = new k((DefaultConstructorMarker) null);
    private final Map<String, b<?>> a;
    private final Map<p, b<?>> b;

    /* compiled from: ScalarTypeAdapters.kt */
    static final class a extends l implements kotlin.e0.c.l<c<?>, Object> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f9069h = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Object o(c<?> cVar) {
            kotlin.jvm.internal.k.f(cVar, "value");
            T t = cVar.a;
            if (t != null) {
                return t;
            }
            kotlin.jvm.internal.k.m();
            throw null;
        }
    }

    /* compiled from: ScalarTypeAdapters.kt */
    static final class b extends l implements kotlin.e0.c.l<c<?>, String> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f9070h = new b();

        b() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
            if (r1 != null) goto L_0x0037;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
            throw r3;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String o(g.a.a.h.c<?> r3) {
            /*
                r2 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.k.f(r3, r0)
                boolean r0 = r3 instanceof g.a.a.h.c.C0596c
                if (r0 != 0) goto L_0x0015
                boolean r0 = r3 instanceof g.a.a.h.c.d
                if (r0 == 0) goto L_0x000e
                goto L_0x0015
            L_0x000e:
                T r3 = r3.a
                java.lang.String r3 = java.lang.String.valueOf(r3)
                goto L_0x0031
            L_0x0015:
                l.f r0 = new l.f
                r0.<init>()
                com.apollographql.apollo.api.internal.json.f$a r1 = com.apollographql.apollo.api.internal.json.f.f1818n
                com.apollographql.apollo.api.internal.json.f r1 = r1.a(r0)
                T r3 = r3.a     // Catch:{ all -> 0x0032 }
                com.apollographql.apollo.api.internal.json.h.a(r3, r1)     // Catch:{ all -> 0x0032 }
                kotlin.x r3 = kotlin.x.a     // Catch:{ all -> 0x0032 }
                if (r1 != 0) goto L_0x002a
                goto L_0x002d
            L_0x002a:
                r1.close()
            L_0x002d:
                java.lang.String r3 = r0.P0()
            L_0x0031:
                return r3
            L_0x0032:
                r3 = move-exception
                throw r3     // Catch:{ all -> 0x0034 }
            L_0x0034:
                r3 = move-exception
                if (r1 == 0) goto L_0x003a
                r1.close()     // Catch:{ all -> 0x003a }
            L_0x003a:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.a.h.q.b.o(g.a.a.h.c):java.lang.String");
        }
    }

    /* compiled from: ScalarTypeAdapters.kt */
    static final class c extends l implements kotlin.e0.c.l<c<?>, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public static final c f9071h = new c();

        c() {
            super(1);
        }

        public final boolean a(c<?> cVar) {
            kotlin.jvm.internal.k.f(cVar, "value");
            if (cVar instanceof c.b) {
                return ((Boolean) ((c.b) cVar).a).booleanValue();
            }
            if (cVar instanceof c.f) {
                return Boolean.parseBoolean((String) ((c.f) cVar).a);
            }
            throw new IllegalArgumentException("Can't decode: " + cVar + " into Boolean");
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Boolean.valueOf(a((c) obj));
        }
    }

    /* compiled from: ScalarTypeAdapters.kt */
    static final class d extends l implements kotlin.e0.c.l<c<?>, Integer> {

        /* renamed from: h  reason: collision with root package name */
        public static final d f9072h = new d();

        d() {
            super(1);
        }

        public final int a(c<?> cVar) {
            kotlin.jvm.internal.k.f(cVar, "value");
            if (cVar instanceof c.e) {
                return ((Number) ((c.e) cVar).a).intValue();
            }
            if (cVar instanceof c.f) {
                return Integer.parseInt((String) ((c.f) cVar).a);
            }
            throw new IllegalArgumentException("Can't decode: " + cVar + " into Integer");
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Integer.valueOf(a((c) obj));
        }
    }

    /* compiled from: ScalarTypeAdapters.kt */
    static final class e extends l implements kotlin.e0.c.l<c<?>, Long> {

        /* renamed from: h  reason: collision with root package name */
        public static final e f9073h = new e();

        e() {
            super(1);
        }

        public final long a(c<?> cVar) {
            kotlin.jvm.internal.k.f(cVar, "value");
            if (cVar instanceof c.e) {
                return ((Number) ((c.e) cVar).a).longValue();
            }
            if (cVar instanceof c.f) {
                return Long.parseLong((String) ((c.f) cVar).a);
            }
            throw new IllegalArgumentException("Can't decode: " + cVar + " into Long");
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Long.valueOf(a((c) obj));
        }
    }

    /* compiled from: ScalarTypeAdapters.kt */
    static final class f extends l implements kotlin.e0.c.l<c<?>, Float> {

        /* renamed from: h  reason: collision with root package name */
        public static final f f9074h = new f();

        f() {
            super(1);
        }

        public final float a(c<?> cVar) {
            kotlin.jvm.internal.k.f(cVar, "value");
            if (cVar instanceof c.e) {
                return ((Number) ((c.e) cVar).a).floatValue();
            }
            if (cVar instanceof c.f) {
                return Float.parseFloat((String) ((c.f) cVar).a);
            }
            throw new IllegalArgumentException("Can't decode: " + cVar + " into Float");
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Float.valueOf(a((c) obj));
        }
    }

    /* compiled from: ScalarTypeAdapters.kt */
    static final class g extends l implements kotlin.e0.c.l<c<?>, Double> {

        /* renamed from: h  reason: collision with root package name */
        public static final g f9075h = new g();

        g() {
            super(1);
        }

        public final double a(c<?> cVar) {
            kotlin.jvm.internal.k.f(cVar, "value");
            if (cVar instanceof c.e) {
                return ((Number) ((c.e) cVar).a).doubleValue();
            }
            if (cVar instanceof c.f) {
                return Double.parseDouble((String) ((c.f) cVar).a);
            }
            throw new IllegalArgumentException("Can't decode: " + cVar + " into Double");
        }

        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return Double.valueOf(a((c) obj));
        }
    }

    /* compiled from: ScalarTypeAdapters.kt */
    public static final class h implements b<g> {
        h() {
        }

        /* renamed from: c */
        public g b(c<?> cVar) {
            String str;
            kotlin.jvm.internal.k.f(cVar, "value");
            T t = cVar.a;
            if (t == null || (str = t.toString()) == null) {
                str = "";
            }
            return new g("", str);
        }

        /* renamed from: d */
        public c<?> a(g gVar) {
            kotlin.jvm.internal.k.f(gVar, "value");
            return new c.f(gVar.b());
        }
    }

    /* compiled from: ScalarTypeAdapters.kt */
    static final class i extends l implements kotlin.e0.c.l<c<?>, Map<String, ? extends Object>> {

        /* renamed from: h  reason: collision with root package name */
        public static final i f9076h = new i();

        i() {
            super(1);
        }

        /* renamed from: a */
        public final Map<String, Object> o(c<?> cVar) {
            kotlin.jvm.internal.k.f(cVar, "value");
            if (cVar instanceof c.d) {
                return (Map) ((c.d) cVar).a;
            }
            throw new IllegalArgumentException("Can't decode: " + cVar + " into Map");
        }
    }

    /* compiled from: ScalarTypeAdapters.kt */
    static final class j extends l implements kotlin.e0.c.l<c<?>, List<? extends Object>> {

        /* renamed from: h  reason: collision with root package name */
        public static final j f9077h = new j();

        j() {
            super(1);
        }

        /* renamed from: a */
        public final List<Object> o(c<?> cVar) {
            kotlin.jvm.internal.k.f(cVar, "value");
            if (cVar instanceof c.C0596c) {
                return (List) ((c.C0596c) cVar).a;
            }
            throw new IllegalArgumentException("Can't decode: " + cVar + " into List");
        }
    }

    /* compiled from: ScalarTypeAdapters.kt */
    public static final class k {

        /* compiled from: ScalarTypeAdapters.kt */
        public static final class a implements b<Object> {
            final /* synthetic */ kotlin.e0.c.l a;

            a(kotlin.e0.c.l lVar) {
                this.a = lVar;
            }

            public c<?> a(Object obj) {
                kotlin.jvm.internal.k.f(obj, "value");
                return c.b.a(obj);
            }

            public Object b(c<?> cVar) {
                kotlin.jvm.internal.k.f(cVar, "value");
                return this.a.o(cVar);
            }
        }

        private k() {
        }

        /* access modifiers changed from: private */
        public final Map<String, b<?>> b(String[] strArr, kotlin.e0.c.l<? super c<?>, ? extends Object> lVar) {
            a aVar = new a(lVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap(f.b(d0.a(strArr.length), 16));
            for (String a2 : strArr) {
                kotlin.j a3 = n.a(a2, aVar);
                linkedHashMap.put(a3.c(), a3.d());
            }
            return linkedHashMap;
        }

        public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new q(e0.e());
    }

    public q(Map<p, ? extends b<?>> map) {
        kotlin.jvm.internal.k.f(map, "customAdapters");
        this.b = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap(d0.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(((p) entry.getKey()).a(), entry.getValue());
        }
        this.a = linkedHashMap;
    }

    public final <T> b<T> a(p pVar) {
        kotlin.jvm.internal.k.f(pVar, "scalarType");
        b<T> bVar = this.a.get(pVar.a());
        if (bVar == null) {
            bVar = c.get(pVar.f());
        }
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException(("Can't map GraphQL type: `" + pVar.a() + "` to: `" + pVar.f() + "`. Did you forget to add a custom type adapter?").toString());
    }
}

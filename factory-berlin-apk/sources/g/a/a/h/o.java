package g.a.a.h;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;

/* compiled from: ResponseField.kt */
public class o {

    /* renamed from: g  reason: collision with root package name */
    public static final b f9055g = new b((DefaultConstructorMarker) null);
    private final e a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Object> f9056d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f9057e;

    /* renamed from: f  reason: collision with root package name */
    private final List<c> f9058f;

    /* compiled from: ResponseField.kt */
    public static final class a extends c {
        private final String b;
        private final boolean c;

        public final boolean a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return !(k.a(this.b, aVar.b) ^ true) && this.c == aVar.c;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + defpackage.b.a(this.c);
        }
    }

    /* compiled from: ResponseField.kt */
    public static final class b {
        private b() {
        }

        public final o a(String str, String str2, Map<String, ? extends Object> map, boolean z, List<? extends c> list) {
            k.f(str, "responseName");
            k.f(str2, "fieldName");
            e eVar = e.BOOLEAN;
            if (map == null) {
                map = e0.e();
            }
            Map<String, ? extends Object> map2 = map;
            if (list == null) {
                list = n.g();
            }
            return new o(eVar, str, str2, map2, z, list);
        }

        public final d b(String str, String str2, Map<String, ? extends Object> map, boolean z, p pVar, List<? extends c> list) {
            k.f(str, "responseName");
            k.f(str2, "fieldName");
            k.f(pVar, "scalarType");
            if (map == null) {
                map = e0.e();
            }
            Map<String, ? extends Object> map2 = map;
            if (list == null) {
                list = n.g();
            }
            return new d(str, str2, map2, z, list, pVar);
        }

        public final o c(String str, String str2, Map<String, ? extends Object> map, boolean z, List<? extends c> list) {
            k.f(str, "responseName");
            k.f(str2, "fieldName");
            e eVar = e.DOUBLE;
            if (map == null) {
                map = e0.e();
            }
            Map<String, ? extends Object> map2 = map;
            if (list == null) {
                list = n.g();
            }
            return new o(eVar, str, str2, map2, z, list);
        }

        public final o d(String str, String str2, List<? extends c> list) {
            k.f(str, "responseName");
            k.f(str2, "fieldName");
            e eVar = e.FRAGMENT;
            Map e2 = e0.e();
            if (list == null) {
                list = n.g();
            }
            return new o(eVar, str, str2, e2, false, list);
        }

        public final o e(String str, String str2, Map<String, ? extends Object> map, boolean z, List<? extends c> list) {
            k.f(str, "responseName");
            k.f(str2, "fieldName");
            e eVar = e.INT;
            if (map == null) {
                map = e0.e();
            }
            Map<String, ? extends Object> map2 = map;
            if (list == null) {
                list = n.g();
            }
            return new o(eVar, str, str2, map2, z, list);
        }

        public final o f(String str, String str2, Map<String, ? extends Object> map, boolean z, List<? extends c> list) {
            k.f(str, "responseName");
            k.f(str2, "fieldName");
            e eVar = e.LIST;
            if (map == null) {
                map = e0.e();
            }
            Map<String, ? extends Object> map2 = map;
            if (list == null) {
                list = n.g();
            }
            return new o(eVar, str, str2, map2, z, list);
        }

        public final o g(String str, String str2, Map<String, ? extends Object> map, boolean z, List<? extends c> list) {
            k.f(str, "responseName");
            k.f(str2, "fieldName");
            e eVar = e.OBJECT;
            if (map == null) {
                map = e0.e();
            }
            Map<String, ? extends Object> map2 = map;
            if (list == null) {
                list = n.g();
            }
            return new o(eVar, str, str2, map2, z, list);
        }

        public final o h(String str, String str2, Map<String, ? extends Object> map, boolean z, List<? extends c> list) {
            k.f(str, "responseName");
            k.f(str2, "fieldName");
            e eVar = e.STRING;
            if (map == null) {
                map = e0.e();
            }
            Map<String, ? extends Object> map2 = map;
            if (list == null) {
                list = n.g();
            }
            return new o(eVar, str, str2, map2, z, list);
        }

        public final boolean i(Map<String, ? extends Object> map) {
            k.f(map, "objectMap");
            return map.containsKey("kind") && k.a(map.get("kind"), "Variable") && map.containsKey("variableName");
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ResponseField.kt */
    public static class c {
        public static final a a = new a((DefaultConstructorMarker) null);

        /* compiled from: ResponseField.kt */
        public static final class a {
            private a() {
            }

            public final f a(String[] strArr) {
                k.f(strArr, "types");
                return new f(n.i((String[]) Arrays.copyOf(strArr, strArr.length)));
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* compiled from: ResponseField.kt */
    public static final class d extends o {

        /* renamed from: h  reason: collision with root package name */
        private final p f9059h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, Map<String, ? extends Object> map, boolean z, List<? extends c> list, p pVar) {
            super(e.CUSTOM, str, str2, map == null ? e0.e() : map, z, list == null ? n.g() : list);
            k.f(str, "responseName");
            k.f(str2, "fieldName");
            k.f(pVar, "scalarType");
            this.f9059h = pVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && o.super.equals(obj) && !(k.a(this.f9059h, ((d) obj).f9059h) ^ true);
        }

        public final p g() {
            return this.f9059h;
        }

        public int hashCode() {
            return (o.super.hashCode() * 31) + this.f9059h.hashCode();
        }
    }

    /* compiled from: ResponseField.kt */
    public enum e {
        STRING,
        INT,
        DOUBLE,
        BOOLEAN,
        OBJECT,
        LIST,
        CUSTOM,
        FRAGMENT
    }

    /* compiled from: ResponseField.kt */
    public static final class f extends c {
        private final List<String> b;

        public f(List<String> list) {
            k.f(list, "typeNames");
            this.b = list;
        }

        public final List<String> a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && !(k.a(this.b, ((f) obj).b) ^ true);
        }

        public int hashCode() {
            return this.b.hashCode();
        }
    }

    public o(e eVar, String str, String str2, Map<String, ? extends Object> map, boolean z, List<? extends c> list) {
        k.f(eVar, "type");
        k.f(str, "responseName");
        k.f(str2, "fieldName");
        k.f(map, "arguments");
        k.f(list, "conditions");
        this.a = eVar;
        this.b = str;
        this.c = str2;
        this.f9056d = map;
        this.f9057e = z;
        this.f9058f = list;
    }

    public final Map<String, Object> a() {
        return this.f9056d;
    }

    public final List<c> b() {
        return this.f9058f;
    }

    public final String c() {
        return this.c;
    }

    public final boolean d() {
        return this.f9057e;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && !(k.a(this.b, oVar.b) ^ true) && !(k.a(this.c, oVar.c) ^ true) && !(k.a(this.f9056d, oVar.f9056d) ^ true) && this.f9057e == oVar.f9057e && !(k.a(this.f9058f, oVar.f9058f) ^ true);
    }

    public final e f() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.f9056d.hashCode()) * 31) + defpackage.b.a(this.f9057e)) * 31) + this.f9058f.hashCode();
    }
}

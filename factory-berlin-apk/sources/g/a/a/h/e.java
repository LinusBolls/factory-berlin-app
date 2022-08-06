package g.a.a.h;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;

/* compiled from: Error.kt */
public final class e {
    private final String a;
    private final List<a> b;
    private final Map<String, Object> c;

    /* compiled from: Error.kt */
    public static final class a {
        private final long a;
        private final long b;

        public a(long j2, long j3) {
            this.a = j2;
            this.b = j3;
        }

        public final long a() {
            return this.b;
        }

        public final long b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (c.a(this.a) * 31) + c.a(this.b);
        }
    }

    public e(String str, List<a> list, Map<String, ? extends Object> map) {
        k.f(str, "message");
        k.f(list, "locations");
        k.f(map, "customAttributes");
        this.a = str;
        this.b = list;
        this.c = map;
    }

    public final Map<String, Object> a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final List<a> c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return !(k.a(this.a, eVar.a) ^ true) && !(k.a(this.b, eVar.b) ^ true) && !(k.a(this.c, eVar.c) ^ true);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, List list, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? n.g() : list, (i2 & 4) != 0 ? e0.e() : map);
    }
}

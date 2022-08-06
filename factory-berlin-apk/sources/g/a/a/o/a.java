package g.a.a.o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: RequestHeaders */
public final class a {
    public static final a b = new a(Collections.emptyMap());
    private final Map<String, String> a;

    /* renamed from: g.a.a.o.a$a  reason: collision with other inner class name */
    /* compiled from: RequestHeaders */
    public static final class C0625a {
        private final Map<String, String> a = new LinkedHashMap();

        public C0625a a(String str, String str2) {
            this.a.put(str, str2);
            return this;
        }

        public a b() {
            return new a(this.a);
        }
    }

    a(Map<String, String> map) {
        this.a = map;
    }

    public static C0625a a() {
        return new C0625a();
    }

    public String b(String str) {
        return this.a.get(str);
    }

    public Set<String> c() {
        return this.a.keySet();
    }
}

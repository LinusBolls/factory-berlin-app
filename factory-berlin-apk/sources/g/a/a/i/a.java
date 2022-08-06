package g.a.a.i;

import java.util.Map;
import kotlin.jvm.internal.k;

/* compiled from: CacheHeaders.kt */
public final class a {
    public static final a b = new a(e0.e());
    private final Map<String, String> a;

    /* renamed from: g.a.a.i.a$a  reason: collision with other inner class name */
    /* compiled from: CacheHeaders.kt */
    public static final class C0603a {
        private C0603a() {
        }

        public /* synthetic */ C0603a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0603a((DefaultConstructorMarker) null);
    }

    public a(Map<String, String> map) {
        k.f(map, "headerMap");
        this.a = map;
    }

    public final boolean a(String str) {
        k.f(str, "headerName");
        return this.a.containsKey(str);
    }

    public final String b(String str) {
        k.f(str, "header");
        return this.a.get(str);
    }
}

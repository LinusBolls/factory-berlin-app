package m.a.c.e;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;

/* compiled from: Properties.kt */
public final class f {
    private final Map<String, Object> a;

    public f() {
        this((Map) null, 1, (DefaultConstructorMarker) null);
    }

    public f(Map<String, Object> map) {
        k.f(map, "data");
        this.a = map;
    }

    public final <T> void a(String str, T t) {
        k.f(str, "key");
        Map<String, Object> map = this.a;
        if (t != null) {
            map.put(str, t);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f) && k.a(this.a, ((f) obj).a);
        }
        return true;
    }

    public int hashCode() {
        Map<String, Object> map = this.a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Properties(data=" + this.a + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ConcurrentHashMap() : map);
    }
}

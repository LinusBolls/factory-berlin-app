package m.a.e;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.h0.b;
import kotlin.jvm.internal.k;

/* compiled from: KClassExt.kt */
public final class a {
    private static final Map<b<?>, String> a = new ConcurrentHashMap();

    public static final String a(b<?> bVar) {
        k.f(bVar, "$this$getFullName");
        String str = a.get(bVar);
        return str != null ? str : b(bVar);
    }

    private static final String b(b<?> bVar) {
        String name = kotlin.e0.a.a(bVar).getName();
        Map<b<?>, String> map = a;
        k.b(name, "name");
        map.put(bVar, name);
        return name;
    }
}

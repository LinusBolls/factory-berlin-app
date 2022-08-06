package m.a.c.k;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PropertyRegistry.kt */
public final class b {
    private final Map<String, Object> a = new ConcurrentHashMap();

    public final void a() {
        this.a.clear();
    }
}

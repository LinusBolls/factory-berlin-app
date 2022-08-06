package g.b.a.b.c.f;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public final class n1<K, V> {
    private final Map<K, WeakReference<V>> a = new WeakHashMap();

    public final void a() {
        this.a.clear();
    }
}

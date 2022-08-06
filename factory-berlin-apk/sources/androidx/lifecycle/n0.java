package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ViewModel */
public abstract class n0 {

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Object> f1032g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f1033h = false;

    private static void j(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        this.f1033h = true;
        Map<String, Object> map = this.f1032g;
        if (map != null) {
            synchronized (map) {
                for (Object j2 : this.f1032g.values()) {
                    j(j2);
                }
            }
        }
        l();
    }

    /* access modifiers changed from: package-private */
    public <T> T k(String str) {
        T t;
        Map<String, Object> map = this.f1032g;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.f1032g.get(str);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    public void l() {
    }

    /* access modifiers changed from: package-private */
    public <T> T o(String str, T t) {
        T t2;
        synchronized (this.f1032g) {
            t2 = this.f1032g.get(str);
            if (t2 == null) {
                this.f1032g.put(str, t);
            }
        }
        if (t2 != null) {
            t = t2;
        }
        if (this.f1033h) {
            j(t);
        }
        return t;
    }
}

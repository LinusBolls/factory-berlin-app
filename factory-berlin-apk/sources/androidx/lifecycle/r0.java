package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ViewModelStore */
public class r0 {
    private final HashMap<String, n0> a = new HashMap<>();

    public final void a() {
        for (n0 i2 : this.a.values()) {
            i2.i();
        }
        this.a.clear();
    }

    /* access modifiers changed from: package-private */
    public final n0 b(String str) {
        return this.a.get(str);
    }

    /* access modifiers changed from: package-private */
    public Set<String> c() {
        return new HashSet(this.a.keySet());
    }

    /* access modifiers changed from: package-private */
    public final void d(String str, n0 n0Var) {
        n0 put = this.a.put(str, n0Var);
        if (put != null) {
            put.l();
        }
    }
}

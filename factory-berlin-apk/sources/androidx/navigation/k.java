package androidx.navigation;

import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.r0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: NavControllerViewModel */
class k extends n0 {

    /* renamed from: j  reason: collision with root package name */
    private static final p0.b f1077j = new a();

    /* renamed from: i  reason: collision with root package name */
    private final HashMap<UUID, r0> f1078i = new HashMap<>();

    /* compiled from: NavControllerViewModel */
    class a implements p0.b {
        a() {
        }

        public <T extends n0> T a(Class<T> cls) {
            return new k();
        }
    }

    k() {
    }

    static k s(r0 r0Var) {
        return (k) new p0(r0Var, f1077j).a(k.class);
    }

    /* access modifiers changed from: protected */
    public void l() {
        for (r0 a2 : this.f1078i.values()) {
            a2.a();
        }
        this.f1078i.clear();
    }

    /* access modifiers changed from: package-private */
    public void r(UUID uuid) {
        r0 remove = this.f1078i.remove(uuid);
        if (remove != null) {
            remove.a();
        }
    }

    /* access modifiers changed from: package-private */
    public r0 t(UUID uuid) {
        r0 r0Var = this.f1078i.get(uuid);
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0();
        this.f1078i.put(uuid, r0Var2);
        return r0Var2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<UUID> it = this.f1078i.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}

package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.r0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel */
final class p extends n0 {
    private static final p0.b o = new a();

    /* renamed from: i  reason: collision with root package name */
    private final HashMap<String, Fragment> f844i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    private final HashMap<String, p> f845j = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    private final HashMap<String, r0> f846k = new HashMap<>();

    /* renamed from: l  reason: collision with root package name */
    private final boolean f847l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f848m = false;

    /* renamed from: n  reason: collision with root package name */
    private boolean f849n = false;

    /* compiled from: FragmentManagerViewModel */
    static class a implements p0.b {
        a() {
        }

        public <T extends n0> T a(Class<T> cls) {
            return new p(true);
        }
    }

    p(boolean z) {
        this.f847l = z;
    }

    static p v(r0 r0Var) {
        return (p) new p0(r0Var, o).a(p.class);
    }

    /* access modifiers changed from: package-private */
    public boolean A(Fragment fragment) {
        if (!this.f844i.containsKey(fragment.f779k)) {
            return true;
        }
        if (this.f847l) {
            return this.f848m;
        }
        return !this.f849n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f844i.equals(pVar.f844i) || !this.f845j.equals(pVar.f845j) || !this.f846k.equals(pVar.f846k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f844i.hashCode() * 31) + this.f845j.hashCode()) * 31) + this.f846k.hashCode();
    }

    /* access modifiers changed from: protected */
    public void l() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f848m = true;
    }

    /* access modifiers changed from: package-private */
    public boolean r(Fragment fragment) {
        if (this.f844i.containsKey(fragment.f779k)) {
            return false;
        }
        this.f844i.put(fragment.f779k, fragment);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void s(Fragment fragment) {
        if (m.p0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        p pVar = this.f845j.get(fragment.f779k);
        if (pVar != null) {
            pVar.l();
            this.f845j.remove(fragment.f779k);
        }
        r0 r0Var = this.f846k.get(fragment.f779k);
        if (r0Var != null) {
            r0Var.a();
            this.f846k.remove(fragment.f779k);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment t(String str) {
        return this.f844i.get(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f844i.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f845j.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f846k.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public p u(Fragment fragment) {
        p pVar = this.f845j.get(fragment.f779k);
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(this.f847l);
        this.f845j.put(fragment.f779k, pVar2);
        return pVar2;
    }

    /* access modifiers changed from: package-private */
    public Collection<Fragment> w() {
        return this.f844i.values();
    }

    /* access modifiers changed from: package-private */
    public r0 x(Fragment fragment) {
        r0 r0Var = this.f846k.get(fragment.f779k);
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0();
        this.f846k.put(fragment.f779k, r0Var2);
        return r0Var2;
    }

    /* access modifiers changed from: package-private */
    public boolean y() {
        return this.f848m;
    }

    /* access modifiers changed from: package-private */
    public boolean z(Fragment fragment) {
        return this.f844i.remove(fragment.f779k) != null;
    }
}

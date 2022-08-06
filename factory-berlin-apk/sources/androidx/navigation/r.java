package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.x;

@x.b("navigation")
/* compiled from: NavGraphNavigator */
public class r extends x<q> {
    private final y a;

    public r(y yVar) {
        this.a = yVar;
    }

    public boolean e() {
        return true;
    }

    /* renamed from: f */
    public q a() {
        return new q(this);
    }

    /* renamed from: g */
    public o b(q qVar, Bundle bundle, u uVar, x.a aVar) {
        int K = qVar.K();
        if (K != 0) {
            o H = qVar.H(K, false);
            if (H != null) {
                return this.a.d(H.n()).b(H, H.e(bundle), uVar, aVar);
            }
            String J = qVar.J();
            throw new IllegalArgumentException("navigation destination " + J + " is not a direct child of this NavGraph");
        }
        throw new IllegalStateException("no start destination defined via app:startDestination for " + qVar.k());
    }
}

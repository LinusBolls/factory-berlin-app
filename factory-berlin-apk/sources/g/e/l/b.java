package g.e.l;

import androidx.fragment.app.d;
import androidx.fragment.app.u;
import androidx.lifecycle.LiveData;

/* compiled from: PermissionBitte */
public class b {
    public static void a(d dVar) {
        b(dVar).Q1();
    }

    private static c b(d dVar) {
        c cVar = (c) dVar.s().X("PERMISSION_BITTE");
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        u i2 = dVar.s().i();
        i2.e(cVar2, "PERMISSION_BITTE");
        i2.k();
        return cVar2;
    }

    public static LiveData<e> c(d dVar) {
        return b(dVar).e0;
    }
}

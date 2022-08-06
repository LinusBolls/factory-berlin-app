package g.b.a.b.c.f;

import android.util.Log;
import g.b.a.b.d.b.g;
import java.io.File;
import java.io.FileNotFoundException;

public final class z0 {
    static g a(x0 x0Var) {
        long n2 = x0Var.n();
        int o = x0Var.o();
        if (o == 1) {
            return g.c(x0Var.l(), n2);
        }
        if (o == 2) {
            String K = x0Var.K();
            if (K != null) {
                try {
                    return g.a(g.a.b(new File(K), x0Var.L()), n2);
                } catch (FileNotFoundException e2) {
                    String valueOf = String.valueOf(K);
                    Log.w("NearbyConnections", valueOf.length() != 0 ? "Failed to create Payload from ParcelablePayload: Java file not found at ".concat(valueOf) : new String("Failed to create Payload from ParcelablePayload: Java file not found at "), e2);
                }
            }
            return g.a(g.a.a(x0Var.q()), n2);
        } else if (o == 3) {
            return g.b(g.b.a(x0Var.q()), n2);
        } else {
            Log.w("NearbyConnections", String.format("Incoming ParcelablePayload %d has unknown type %d", new Object[]{Long.valueOf(x0Var.n()), Integer.valueOf(x0Var.o())}));
            return null;
        }
    }
}

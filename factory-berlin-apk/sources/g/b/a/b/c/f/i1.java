package g.b.a.b.c.f;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.e;
import com.google.android.gms.nearby.messages.internal.Update;
import com.google.android.gms.nearby.messages.internal.i0;
import java.util.Collections;

public final class i1 extends i0 {
    public static void l(Intent intent, e eVar) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.nearby.messages.UPDATES");
        o(bundleExtra == null ? Collections.emptyList() : bundleExtra.getParcelableArrayList("com.google.android.gms.nearby.messages.UPDATES"), eVar);
    }

    public static void o(Iterable<Update> iterable, e eVar) {
        for (Update next : iterable) {
            if (next.n(1)) {
                eVar.c(next.f3282i);
            }
            if (next.n(2)) {
                eVar.d(next.f3282i);
            }
            if (next.n(4)) {
                eVar.b(next.f3282i, next.f3283j);
            }
            if (next.n(8)) {
                eVar.a(next.f3282i, next.f3284k);
            }
            if (next.n(16)) {
                Message message = next.f3282i;
                e1 e1Var = next.f3285l;
            }
        }
    }
}

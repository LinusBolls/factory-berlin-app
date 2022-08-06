package g.b.a.b.c.e;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.location.d;
import com.google.android.gms.location.g;
import com.google.android.gms.location.r;
import java.util.List;

public final class b implements d {
    private final e<Status> d(com.google.android.gms.common.api.d dVar, r rVar) {
        return dVar.a(new d(this, dVar, rVar));
    }

    public final e<Status> a(com.google.android.gms.common.api.d dVar, g gVar, PendingIntent pendingIntent) {
        return dVar.a(new c(this, dVar, gVar, pendingIntent));
    }

    public final e<Status> b(com.google.android.gms.common.api.d dVar, PendingIntent pendingIntent) {
        return d(dVar, r.l(pendingIntent));
    }

    public final e<Status> c(com.google.android.gms.common.api.d dVar, List<String> list) {
        return d(dVar, r.n(list));
    }
}

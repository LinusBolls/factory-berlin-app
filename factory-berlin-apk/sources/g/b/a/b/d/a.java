package g.b.a.b.d;

import android.content.Context;
import androidx.core.content.b;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.nearby.messages.f;
import com.google.android.gms.nearby.messages.g;
import com.google.android.gms.nearby.messages.internal.j;
import g.b.a.b.c.f.a1;
import g.b.a.b.c.f.o1;
import g.b.a.b.c.f.t;

public final class a {
    static {
        new com.google.android.gms.common.api.a("Nearby.CONNECTIONS_API", t.b, t.a);
        new com.google.android.gms.common.api.a("Nearby.MESSAGES_API", com.google.android.gms.nearby.messages.internal.t.c, com.google.android.gms.nearby.messages.internal.t.b);
        com.google.android.gms.nearby.messages.internal.t tVar = com.google.android.gms.nearby.messages.internal.t.a;
        new com.google.android.gms.common.api.a("Nearby.BOOTSTRAP_API", a1.b, a1.a);
    }

    public static final f a(Context context) {
        r.l(context, "Context must not be null");
        return new j(context, (g) null);
    }

    public static final f b(Context context, g gVar) {
        r.l(context, "Context must not be null");
        r.l(gVar, "Options must not be null");
        return new j(context, gVar);
    }

    public static boolean c(Context context) {
        if (b.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
            return o1.f(context.getContentResolver(), "gms:nearby:requires_gms_check", true);
        }
        return true;
    }
}

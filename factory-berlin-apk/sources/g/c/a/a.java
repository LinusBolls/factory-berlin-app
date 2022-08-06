package g.c.a;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import org.threeten.bp.zone.g;

/* compiled from: AndroidThreeTen */
public final class a {
    private static final AtomicBoolean a = new AtomicBoolean();

    public static void a(Application application) {
        b(application);
    }

    public static void b(Context context) {
        c(context, "org/threeten/bp/TZDB.dat");
    }

    public static void c(Context context, String str) {
        if (!a.getAndSet(true)) {
            g.c(new b(context, str));
        }
    }
}

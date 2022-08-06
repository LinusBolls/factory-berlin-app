package g.e.h.b;

import android.os.SystemClock;
import g.e.h.b.c;

/* compiled from: AndroidTimeProvider.kt */
public final class a implements c.a {
    public static final a a = new a();

    private a() {
    }

    public long a() {
        return System.currentTimeMillis();
    }

    public long b() {
        return SystemClock.elapsedRealtime();
    }
}

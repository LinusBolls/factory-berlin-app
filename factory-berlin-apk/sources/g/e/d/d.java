package g.e.d;

import kotlin.jvm.internal.k;
import org.threeten.bp.format.c;
import org.threeten.bp.format.i;

/* compiled from: DateFormatter.kt */
public final class d {
    private static final c a;
    private static final c b;
    private static final c c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f9748d = new d();

    static {
        c h2 = c.h(i.SHORT);
        k.c(h2);
        a = h2;
        c i2 = c.i("dd MMM");
        k.c(i2);
        b = i2;
        c i3 = c.i("HH:mm");
        k.c(i3);
        c = i3;
    }

    private d() {
    }

    public final c a() {
        return b;
    }

    public final c b() {
        return c;
    }

    public final c c() {
        return a;
    }
}

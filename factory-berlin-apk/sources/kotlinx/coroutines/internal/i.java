package kotlinx.coroutines.internal;

import kotlin.k;
import kotlin.l;

/* compiled from: FastServiceLoader.kt */
public final class i {
    private static final boolean a;

    static {
        Object obj;
        try {
            k.a aVar = k.f10687h;
            obj = Class.forName("android.os.Build");
            k.a(obj);
        } catch (Throwable th) {
            k.a aVar2 = k.f10687h;
            obj = l.a(th);
            k.a(obj);
        }
        a = k.f(obj);
    }

    public static final boolean a() {
        return a;
    }
}

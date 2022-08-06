package kotlin.jvm.internal;

import kotlin.h0.b;
import kotlin.h0.c;
import kotlin.h0.d;
import kotlin.h0.e;

/* compiled from: Reflection */
public class v {
    private static final w a;

    static {
        w wVar = null;
        try {
            wVar = (w) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (wVar == null) {
            wVar = new w();
        }
        a = wVar;
    }

    public static d a(h hVar) {
        a.a(hVar);
        return hVar;
    }

    public static b b(Class cls) {
        return a.b(cls);
    }

    public static c c(Class cls) {
        return a.c(cls, "");
    }

    public static e d(n nVar) {
        a.d(nVar);
        return nVar;
    }

    public static String e(g gVar) {
        return a.e(gVar);
    }

    public static String f(l lVar) {
        return a.f(lVar);
    }
}

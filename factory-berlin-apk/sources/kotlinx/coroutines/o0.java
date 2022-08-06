package kotlinx.coroutines;

import kotlin.c0.d;
import kotlin.k;
import kotlin.l;

/* compiled from: DebugStrings.kt */
public final class o0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(d<?> dVar) {
        String str;
        if (dVar instanceof u0) {
            return dVar.toString();
        }
        try {
            k.a aVar = k.f10687h;
            String str2 = dVar + '@' + b(dVar);
            k.a(str2);
            str = str2;
        } catch (Throwable th) {
            k.a aVar2 = k.f10687h;
            Object a = l.a(th);
            k.a(a);
            str = a;
        }
        Throwable c = k.c(str);
        String str3 = str;
        if (c != null) {
            str3 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) str3;
    }
}

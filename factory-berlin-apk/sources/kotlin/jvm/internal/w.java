package kotlin.jvm.internal;

import kotlin.h0.b;
import kotlin.h0.c;
import kotlin.h0.d;
import kotlin.h0.e;

/* compiled from: ReflectionFactory */
public class w {
    public d a(h hVar) {
        return hVar;
    }

    public b b(Class cls) {
        return new e(cls);
    }

    public c c(Class cls, String str) {
        return new m(cls, str);
    }

    public e d(n nVar) {
        return nVar;
    }

    public String e(g gVar) {
        String obj = gVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String f(l lVar) {
        return e(lVar);
    }
}

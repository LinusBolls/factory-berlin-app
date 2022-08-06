package m.a.d;

import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;
import m.a.c.h.a;

/* compiled from: Module.kt */
public final class b {
    public static final a a(boolean z, boolean z2, l<? super a, x> lVar) {
        k.f(lVar, "moduleDeclaration");
        a aVar = new a(z, z2);
        lVar.o(aVar);
        return aVar;
    }

    public static /* synthetic */ a b(boolean z, boolean z2, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return a(z, z2, lVar);
    }
}

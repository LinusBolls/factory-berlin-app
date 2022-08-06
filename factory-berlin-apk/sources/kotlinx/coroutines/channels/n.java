package kotlinx.coroutines.channels;

import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.h;
import kotlin.e0.c.l;
import kotlin.e0.c.p;
import kotlin.x;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l0;

/* compiled from: Produce.kt */
public final class n {
    public static final <E> r<E> a(i0 i0Var, g gVar, int i2, p<? super p<? super E>, ? super d<? super x>, ? extends Object> pVar) {
        o oVar = new o(c0.c(i0Var, gVar), h.a(i2));
        oVar.U0(l0.DEFAULT, oVar, pVar);
        return oVar;
    }

    public static final <E> r<E> b(i0 i0Var, g gVar, int i2, l0 l0Var, l<? super Throwable, x> lVar, p<? super p<? super E>, ? super d<? super x>, ? extends Object> pVar) {
        o oVar = new o(c0.c(i0Var, gVar), h.a(i2));
        if (lVar != null) {
            oVar.n(lVar);
        }
        oVar.U0(l0Var, oVar, pVar);
        return oVar;
    }

    public static /* synthetic */ r c(i0 i0Var, g gVar, int i2, p pVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            gVar = h.f10600g;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return a(i0Var, gVar, i2, pVar);
    }

    public static /* synthetic */ r d(i0 i0Var, g gVar, int i2, l0 l0Var, l lVar, p pVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            gVar = h.f10600g;
        }
        g gVar2 = gVar;
        int i4 = (i3 & 2) != 0 ? 0 : i2;
        if ((i3 & 4) != 0) {
            l0Var = l0.DEFAULT;
        }
        l0 l0Var2 = l0Var;
        if ((i3 & 8) != 0) {
            lVar = null;
        }
        return b(i0Var, gVar2, i4, l0Var2, lVar, pVar);
    }
}

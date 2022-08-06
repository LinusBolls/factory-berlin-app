package kotlinx.coroutines.f3;

import kotlin.c0.d;
import kotlin.e0.c.p;
import kotlin.k;
import kotlin.l;
import kotlin.x;
import kotlinx.coroutines.v0;

/* compiled from: Cancellable.kt */
public final class a {
    public static final void a(d<? super x> dVar, d<?> dVar2) {
        try {
            d<? super x> b = c.b(dVar);
            k.a aVar = k.f10687h;
            x xVar = x.a;
            k.a(xVar);
            v0.b(b, xVar);
        } catch (Throwable th) {
            k.a aVar2 = k.f10687h;
            Object a = l.a(th);
            k.a(a);
            dVar2.m(a);
        }
    }

    public static final <R, T> void b(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r, d<? super T> dVar) {
        try {
            d<x> b = c.b(c.a(pVar, r, dVar));
            k.a aVar = k.f10687h;
            x xVar = x.a;
            k.a(xVar);
            v0.b(b, xVar);
        } catch (Throwable th) {
            k.a aVar2 = k.f10687h;
            Object a = l.a(th);
            k.a(a);
            dVar.m(a);
        }
    }
}

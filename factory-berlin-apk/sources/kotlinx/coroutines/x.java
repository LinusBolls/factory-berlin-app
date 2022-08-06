package kotlinx.coroutines;

import kotlin.c0.d;
import kotlin.c0.j.a.e;
import kotlin.k;
import kotlin.l;
import kotlinx.coroutines.internal.w;

/* compiled from: CompletedExceptionally.kt */
public final class x {
    public static final <T> Object a(Object obj, d<? super T> dVar) {
        if (obj instanceof w) {
            k.a aVar = k.f10687h;
            Throwable th = ((w) obj).a;
            if (n0.d() && (dVar instanceof e)) {
                th = w.j(th, (e) dVar);
            }
            Object a = l.a(th);
            k.a(a);
            return a;
        }
        k.a aVar2 = k.f10687h;
        k.a(obj);
        return obj;
    }

    public static final <T> Object b(Object obj) {
        Throwable c = k.c(obj);
        return c == null ? obj : new w(c, false, 2, (DefaultConstructorMarker) null);
    }

    public static final <T> Object c(Object obj, i<?> iVar) {
        Throwable c = k.c(obj);
        if (c == null) {
            return obj;
        }
        if (n0.d() && (iVar instanceof e)) {
            c = w.j(c, (e) iVar);
        }
        return new w(c, false, 2, (DefaultConstructorMarker) null);
    }
}

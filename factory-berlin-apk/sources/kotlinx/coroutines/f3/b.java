package kotlinx.coroutines.f3;

import kotlin.TypeCastException;
import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.e;
import kotlin.c0.j.a.h;
import kotlin.e0.c.p;
import kotlin.jvm.internal.y;
import kotlin.k;
import kotlin.l;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.w;

/* compiled from: Undispatched.kt */
public final class b {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r, d<? super T> dVar) {
        g c;
        Object c2;
        h.a(dVar);
        try {
            c = dVar.c();
            c2 = b0.c(c, (Object) null);
            if (pVar != null) {
                y.d(pVar, 2);
                Object l2 = pVar.l(r, dVar);
                b0.a(c, c2);
                if (l2 != d.c()) {
                    k.a aVar = k.f10687h;
                    k.a(l2);
                    dVar.m(l2);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } catch (Throwable th) {
            k.a aVar2 = k.f10687h;
            Object a = l.a(th);
            k.a(a);
            dVar.m(a);
        }
    }

    public static final <R, T> void b(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r, d<? super T> dVar) {
        h.a(dVar);
        if (pVar != null) {
            try {
                y.d(pVar, 2);
                Object l2 = pVar.l(r, dVar);
                if (l2 != d.c()) {
                    k.a aVar = k.f10687h;
                    k.a(l2);
                    dVar.m(l2);
                }
            } catch (Throwable th) {
                k.a aVar2 = k.f10687h;
                Object a = l.a(th);
                k.a(a);
                dVar.m(a);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        }
    }

    public static final <T, R> Object c(v<? super T> vVar, R r, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object obj;
        vVar.Q0();
        if (pVar != null) {
            try {
                y.d(pVar, 2);
                obj = pVar.l(r, vVar);
            } catch (Throwable th) {
                obj = new w(th, false, 2, (DefaultConstructorMarker) null);
            }
            if (obj == d.c()) {
                return d.c();
            }
            Object q0 = vVar.q0(obj);
            if (q0 == f2.b) {
                return d.c();
            }
            if (!(q0 instanceof w)) {
                return f2.h(q0);
            }
            Throwable th2 = ((w) q0).a;
            d<T> dVar = vVar.f11029j;
            if (n0.d() && (dVar instanceof e)) {
                th2 = kotlinx.coroutines.internal.w.j(th2, (e) dVar);
            }
            throw th2;
        }
        throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }

    public static final <T, R> Object d(v<? super T> vVar, R r, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object obj;
        vVar.Q0();
        boolean z = false;
        if (pVar != null) {
            try {
                y.d(pVar, 2);
                obj = pVar.l(r, vVar);
            } catch (Throwable th) {
                obj = new w(th, false, 2, (DefaultConstructorMarker) null);
            }
            if (obj == d.c()) {
                return d.c();
            }
            Object q0 = vVar.q0(obj);
            if (q0 == f2.b) {
                return d.c();
            }
            if (!(q0 instanceof w)) {
                return f2.h(q0);
            }
            w wVar = (w) q0;
            Throwable th2 = wVar.a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).f10711g != vVar) {
                z = true;
            }
            if (z) {
                Throwable th3 = wVar.a;
                d<T> dVar = vVar.f11029j;
                if (n0.d() && (dVar instanceof e)) {
                    th3 = kotlinx.coroutines.internal.w.j(th3, (e) dVar);
                }
                throw th3;
            } else if (!(obj instanceof w)) {
                return obj;
            } else {
                Throwable th4 = ((w) obj).a;
                d<T> dVar2 = vVar.f11029j;
                if (n0.d() && (dVar2 instanceof e)) {
                    th4 = kotlinx.coroutines.internal.w.j(th4, (e) dVar2);
                }
                throw th4;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        }
    }
}

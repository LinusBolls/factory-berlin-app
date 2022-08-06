package kotlinx.coroutines;

import kotlin.c0.d;
import kotlin.e0.c.l;
import kotlin.x;

/* compiled from: CancellableContinuation.kt */
public interface i<T> extends d<T> {

    /* compiled from: CancellableContinuation.kt */
    public static final class a {
        public static /* synthetic */ boolean a(i iVar, Throwable th, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    th = null;
                }
                return iVar.r(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ Object b(i iVar, Object obj, Object obj2, int i2, Object obj3) {
            if (obj3 == null) {
                if ((i2 & 2) != 0) {
                    obj2 = null;
                }
                return iVar.e(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    void B(l<? super Throwable, x> lVar);

    Object E(Throwable th);

    void G(Object obj);

    Object e(T t, Object obj);

    void f(d0 d0Var, T t);

    boolean r(Throwable th);
}

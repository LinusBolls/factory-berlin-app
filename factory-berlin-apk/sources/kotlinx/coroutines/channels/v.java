package kotlinx.coroutines.channels;

import kotlin.c0.d;
import kotlin.x;

/* compiled from: Channel.kt */
public interface v<E> {

    /* compiled from: Channel.kt */
    public static final class a {
        public static /* synthetic */ boolean a(v vVar, Throwable th, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    th = null;
                }
                return vVar.g(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    boolean g(Throwable th);

    boolean offer(E e2);

    Object s(E e2, d<? super x> dVar);
}

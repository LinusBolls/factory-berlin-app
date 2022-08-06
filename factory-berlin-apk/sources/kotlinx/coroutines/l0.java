package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;
import kotlin.c0.d;
import kotlin.c0.f;
import kotlin.e0.c.p;
import kotlinx.coroutines.f3.a;
import kotlinx.coroutines.f3.b;

/* compiled from: CoroutineStart.kt */
public enum l0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r, d<? super T> dVar) {
        int i2 = k0.b[ordinal()];
        if (i2 == 1) {
            a.b(pVar, r, dVar);
        } else if (i2 == 2) {
            f.a(pVar, r, dVar);
        } else if (i2 == 3) {
            b.a(pVar, r, dVar);
        } else if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean f() {
        return this == LAZY;
    }
}

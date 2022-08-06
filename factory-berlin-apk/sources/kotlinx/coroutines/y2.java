package kotlinx.coroutines;

import kotlin.c0.d;
import kotlinx.coroutines.internal.v;

/* compiled from: Timeout.kt */
final class y2<U, T extends U> extends v<T> implements Runnable {

    /* renamed from: k  reason: collision with root package name */
    public final long f11077k;

    public y2(long j2, d<? super U> dVar) {
        super(dVar.c(), dVar);
        this.f11077k = j2;
    }

    public void run() {
        I(z2.a(this.f11077k, this));
    }

    public String s0() {
        return super.s0() + "(timeMillis=" + this.f11077k + ')';
    }
}

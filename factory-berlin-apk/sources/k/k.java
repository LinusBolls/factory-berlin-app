package k;

import java.util.concurrent.TimeUnit;
import k.h0.e.e;
import okhttp3.internal.connection.h;

/* compiled from: ConnectionPool.kt */
public final class k {
    private final h a;

    public k(h hVar) {
        kotlin.jvm.internal.k.f(hVar, "delegate");
        this.a = hVar;
    }

    public final h a() {
        return this.a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public k(int i2, long j2, TimeUnit timeUnit) {
        this(new h(e.f10412h, i2, j2, timeUnit));
        kotlin.jvm.internal.k.f(timeUnit, "timeUnit");
    }

    public k() {
        this(5, 5, TimeUnit.MINUTES);
    }
}

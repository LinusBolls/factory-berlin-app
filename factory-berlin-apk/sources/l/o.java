package l;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.k;

/* compiled from: JvmOkio.kt */
final class o implements b0 {

    /* renamed from: g  reason: collision with root package name */
    private final InputStream f11120g;

    /* renamed from: h  reason: collision with root package name */
    private final c0 f11121h;

    public o(InputStream inputStream, c0 c0Var) {
        k.f(inputStream, "input");
        k.f(c0Var, "timeout");
        this.f11120g = inputStream;
        this.f11121h = c0Var;
    }

    public void close() {
        this.f11120g.close();
    }

    public c0 e() {
        return this.f11121h;
    }

    public long g0(f fVar, long j2) {
        k.f(fVar, "sink");
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 == 0) {
            return 0;
        }
        if (i2 >= 0) {
            try {
                this.f11121h.f();
                w W0 = fVar.W0(1);
                int read = this.f11120g.read(W0.a, W0.c, (int) Math.min(j2, (long) (8192 - W0.c)));
                if (read != -1) {
                    W0.c += read;
                    long j3 = (long) read;
                    fVar.S0(fVar.T0() + j3);
                    return j3;
                } else if (W0.b != W0.c) {
                    return -1;
                } else {
                    fVar.f11099g = W0.b();
                    x.b(W0);
                    return -1;
                }
            } catch (AssertionError e2) {
                if (p.e(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
    }

    public String toString() {
        return "source(" + this.f11120g + ')';
    }
}

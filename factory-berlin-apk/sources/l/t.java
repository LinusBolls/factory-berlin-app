package l;

import java.io.OutputStream;
import kotlin.jvm.internal.k;

/* compiled from: JvmOkio.kt */
final class t implements z {

    /* renamed from: g  reason: collision with root package name */
    private final OutputStream f11125g;

    /* renamed from: h  reason: collision with root package name */
    private final c0 f11126h;

    public t(OutputStream outputStream, c0 c0Var) {
        k.f(outputStream, "out");
        k.f(c0Var, "timeout");
        this.f11125g = outputStream;
        this.f11126h = c0Var;
    }

    public void close() {
        this.f11125g.close();
    }

    public c0 e() {
        return this.f11126h;
    }

    public void flush() {
        this.f11125g.flush();
    }

    public void p(f fVar, long j2) {
        k.f(fVar, "source");
        c.b(fVar.T0(), 0, j2);
        while (j2 > 0) {
            this.f11126h.f();
            w wVar = fVar.f11099g;
            if (wVar != null) {
                int min = (int) Math.min(j2, (long) (wVar.c - wVar.b));
                this.f11125g.write(wVar.a, wVar.b, min);
                wVar.b += min;
                long j3 = (long) min;
                j2 -= j3;
                fVar.S0(fVar.T0() - j3);
                if (wVar.b == wVar.c) {
                    fVar.f11099g = wVar.b();
                    x.b(wVar);
                }
            } else {
                k.m();
                throw null;
            }
        }
    }

    public String toString() {
        return "sink(" + this.f11125g + ')';
    }
}

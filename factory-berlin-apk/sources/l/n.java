package l;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.k;

/* compiled from: InflaterSource.kt */
public final class n implements b0 {

    /* renamed from: g  reason: collision with root package name */
    private int f11116g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11117h;

    /* renamed from: i  reason: collision with root package name */
    private final h f11118i;

    /* renamed from: j  reason: collision with root package name */
    private final Inflater f11119j;

    public n(h hVar, Inflater inflater) {
        k.f(hVar, "source");
        k.f(inflater, "inflater");
        this.f11118i = hVar;
        this.f11119j = inflater;
    }

    private final void h() {
        int i2 = this.f11116g;
        if (i2 != 0) {
            int remaining = i2 - this.f11119j.getRemaining();
            this.f11116g -= remaining;
            this.f11118i.x((long) remaining);
        }
    }

    public final long a(f fVar, long j2) {
        k.f(fVar, "sink");
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        } else if (!(!this.f11117h)) {
            throw new IllegalStateException("closed".toString());
        } else if (i2 == 0) {
            return 0;
        } else {
            try {
                w W0 = fVar.W0(1);
                int min = (int) Math.min(j2, (long) (8192 - W0.c));
                b();
                int inflate = this.f11119j.inflate(W0.a, W0.c, min);
                h();
                if (inflate > 0) {
                    W0.c += inflate;
                    long j3 = (long) inflate;
                    fVar.S0(fVar.T0() + j3);
                    return j3;
                }
                if (W0.b == W0.c) {
                    fVar.f11099g = W0.b();
                    x.b(W0);
                }
                return 0;
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        }
    }

    public final boolean b() {
        if (!this.f11119j.needsInput()) {
            return false;
        }
        if (this.f11118i.Q()) {
            return true;
        }
        w wVar = this.f11118i.d().f11099g;
        if (wVar != null) {
            int i2 = wVar.c;
            int i3 = wVar.b;
            int i4 = i2 - i3;
            this.f11116g = i4;
            this.f11119j.setInput(wVar.a, i3, i4);
            return false;
        }
        k.m();
        throw null;
    }

    public void close() {
        if (!this.f11117h) {
            this.f11119j.end();
            this.f11117h = true;
            this.f11118i.close();
        }
    }

    public c0 e() {
        return this.f11118i.e();
    }

    public long g0(f fVar, long j2) {
        k.f(fVar, "sink");
        do {
            long a = a(fVar, j2);
            if (a > 0) {
                return a;
            }
            if (this.f11119j.finished() || this.f11119j.needsDictionary()) {
                return -1;
            }
        } while (!this.f11118i.Q());
        throw new EOFException("source exhausted prematurely");
    }
}

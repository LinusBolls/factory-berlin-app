package l;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.k;

/* compiled from: GzipSource.kt */
public final class m implements b0 {

    /* renamed from: g  reason: collision with root package name */
    private byte f11111g;

    /* renamed from: h  reason: collision with root package name */
    private final v f11112h;

    /* renamed from: i  reason: collision with root package name */
    private final Inflater f11113i;

    /* renamed from: j  reason: collision with root package name */
    private final n f11114j;

    /* renamed from: k  reason: collision with root package name */
    private final CRC32 f11115k = new CRC32();

    public m(b0 b0Var) {
        k.f(b0Var, "source");
        this.f11112h = new v(b0Var);
        Inflater inflater = new Inflater(true);
        this.f11113i = inflater;
        this.f11114j = new n(this.f11112h, inflater);
    }

    private final void a(String str, int i2, int i3) {
        if (i3 != i2) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}, 3));
            k.b(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    private final void b() {
        this.f11112h.s0(10);
        byte b0 = this.f11112h.f11130g.b0(3);
        boolean z = true;
        boolean z2 = ((b0 >> 1) & 1) == 1;
        if (z2) {
            i(this.f11112h.f11130g, 0, 10);
        }
        a("ID1ID2", 8075, this.f11112h.readShort());
        this.f11112h.x(8);
        if (((b0 >> 2) & 1) == 1) {
            this.f11112h.s0(2);
            if (z2) {
                i(this.f11112h.f11130g, 0, 2);
            }
            long N0 = (long) this.f11112h.f11130g.N0();
            this.f11112h.s0(N0);
            if (z2) {
                i(this.f11112h.f11130g, 0, N0);
            }
            this.f11112h.x(N0);
        }
        if (((b0 >> 3) & 1) == 1) {
            long a = this.f11112h.a((byte) 0);
            if (a != -1) {
                if (z2) {
                    i(this.f11112h.f11130g, 0, a + 1);
                }
                this.f11112h.x(a + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((b0 >> 4) & 1) != 1) {
            z = false;
        }
        if (z) {
            long a2 = this.f11112h.a((byte) 0);
            if (a2 != -1) {
                if (z2) {
                    i(this.f11112h.f11130g, 0, a2 + 1);
                }
                this.f11112h.x(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z2) {
            a("FHCRC", this.f11112h.l(), (short) ((int) this.f11115k.getValue()));
            this.f11115k.reset();
        }
    }

    private final void h() {
        a("CRC", this.f11112h.k(), (int) this.f11115k.getValue());
        a("ISIZE", this.f11112h.k(), (int) this.f11113i.getBytesWritten());
    }

    private final void i(f fVar, long j2, long j3) {
        w wVar = fVar.f11099g;
        if (wVar != null) {
            do {
                int i2 = wVar.c;
                int i3 = wVar.b;
                if (j2 >= ((long) (i2 - i3))) {
                    j2 -= (long) (i2 - i3);
                    wVar = wVar.f11136f;
                } else {
                    while (j3 > 0) {
                        int i4 = (int) (((long) wVar.b) + j2);
                        int min = (int) Math.min((long) (wVar.c - i4), j3);
                        this.f11115k.update(wVar.a, i4, min);
                        j3 -= (long) min;
                        wVar = wVar.f11136f;
                        if (wVar != null) {
                            j2 = 0;
                        } else {
                            k.m();
                            throw null;
                        }
                    }
                    return;
                }
            } while (wVar != null);
            k.m();
            throw null;
        }
        k.m();
        throw null;
    }

    public void close() {
        this.f11114j.close();
    }

    public c0 e() {
        return this.f11112h.e();
    }

    public long g0(f fVar, long j2) {
        k.f(fVar, "sink");
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        } else if (i2 == 0) {
            return 0;
        } else {
            if (this.f11111g == 0) {
                b();
                this.f11111g = 1;
            }
            if (this.f11111g == 1) {
                long T0 = fVar.T0();
                long g0 = this.f11114j.g0(fVar, j2);
                if (g0 != -1) {
                    i(fVar, T0, g0);
                    return g0;
                }
                this.f11111g = 2;
            }
            if (this.f11111g == 2) {
                h();
                this.f11111g = 3;
                if (!this.f11112h.Q()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }
}

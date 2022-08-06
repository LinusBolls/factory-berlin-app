package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.h0.b;
import kotlin.jvm.internal.k;
import l.f;
import l.g;
import okhttp3.internal.http2.c;

/* compiled from: Http2Writer.kt */
public final class i implements Closeable {

    /* renamed from: m  reason: collision with root package name */
    private static final Logger f11447m = Logger.getLogger(d.class.getName());

    /* renamed from: g  reason: collision with root package name */
    private final f f11448g;

    /* renamed from: h  reason: collision with root package name */
    private int f11449h = 16384;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11450i;

    /* renamed from: j  reason: collision with root package name */
    private final c.b f11451j;

    /* renamed from: k  reason: collision with root package name */
    private final g f11452k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f11453l;

    /* compiled from: Http2Writer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public i(g gVar, boolean z) {
        k.f(gVar, "sink");
        this.f11452k = gVar;
        this.f11453l = z;
        f fVar = new f();
        this.f11448g = fVar;
        this.f11451j = new c.b(0, false, fVar, 3, (DefaultConstructorMarker) null);
    }

    private final void F(int i2, long j2) {
        while (j2 > 0) {
            long min = Math.min((long) this.f11449h, j2);
            j2 -= min;
            j(i2, (int) min, 9, j2 == 0 ? 4 : 0);
            this.f11452k.p(this.f11448g, min);
        }
    }

    public final synchronized void D(int i2, long j2) {
        if (!this.f11450i) {
            if (j2 != 0 && j2 <= 2147483647L) {
                j(i2, 4, 8, 0);
                this.f11452k.H((int) j2);
                this.f11452k.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(l lVar) {
        k.f(lVar, "peerSettings");
        if (!this.f11450i) {
            this.f11449h = lVar.e(this.f11449h);
            if (lVar.b() != -1) {
                this.f11451j.e(lVar.b());
            }
            j(0, 0, 4, 1);
            this.f11452k.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void b() {
        if (this.f11450i) {
            throw new IOException("closed");
        } else if (this.f11453l) {
            if (f11447m.isLoggable(Level.FINE)) {
                Logger logger = f11447m;
                logger.fine(b.q(">> CONNECTION " + d.a.t(), new Object[0]));
            }
            this.f11452k.a0(d.a);
            this.f11452k.flush();
        }
    }

    public synchronized void close() {
        this.f11450i = true;
        this.f11452k.close();
    }

    public final synchronized void flush() {
        if (!this.f11450i) {
            this.f11452k.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void h(boolean z, int i2, f fVar, int i3) {
        if (!this.f11450i) {
            int i4 = 0;
            if (z) {
                i4 = 1;
            }
            i(i2, i4, fVar, i3);
        } else {
            throw new IOException("closed");
        }
    }

    public final void i(int i2, int i3, f fVar, int i4) {
        j(i2, i4, 0, i3);
        if (i4 > 0) {
            g gVar = this.f11452k;
            if (fVar != null) {
                gVar.p(fVar, (long) i4);
            } else {
                k.m();
                throw null;
            }
        }
    }

    public final void j(int i2, int i3, int i4, int i5) {
        if (f11447m.isLoggable(Level.FINE)) {
            f11447m.fine(d.f11355e.c(false, i2, i3, i4, i5));
        }
        boolean z = true;
        if (i3 <= this.f11449h) {
            if ((((int) 2147483648L) & i2) != 0) {
                z = false;
            }
            if (z) {
                b.V(this.f11452k, i3);
                this.f11452k.R(i4 & 255);
                this.f11452k.R(i5 & 255);
                this.f11452k.H(i2 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(("reserved bit set: " + i2).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f11449h + ": " + i3).toString());
    }

    public final synchronized void k(int i2, a aVar, byte[] bArr) {
        k.f(aVar, "errorCode");
        k.f(bArr, "debugData");
        if (!this.f11450i) {
            boolean z = false;
            if (aVar.a() != -1) {
                j(0, bArr.length + 8, 7, 0);
                this.f11452k.H(i2);
                this.f11452k.H(aVar.a());
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.f11452k.Y(bArr);
                }
                this.f11452k.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void l(boolean z, int i2, List<b> list) {
        k.f(list, "headerBlock");
        if (!this.f11450i) {
            this.f11451j.g(list);
            long T0 = this.f11448g.T0();
            long min = Math.min((long) this.f11449h, T0);
            int i3 = (T0 > min ? 1 : (T0 == min ? 0 : -1));
            int i4 = i3 == 0 ? 4 : 0;
            if (z) {
                i4 |= 1;
            }
            j(i2, (int) min, 1, i4);
            this.f11452k.p(this.f11448g, min);
            if (i3 > 0) {
                F(i2, T0 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int n() {
        return this.f11449h;
    }

    public final synchronized void o(boolean z, int i2, int i3) {
        if (!this.f11450i) {
            j(0, 8, 6, z ? 1 : 0);
            this.f11452k.H(i2);
            this.f11452k.H(i3);
            this.f11452k.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void q(int i2, int i3, List<b> list) {
        k.f(list, "requestHeaders");
        if (!this.f11450i) {
            this.f11451j.g(list);
            long T0 = this.f11448g.T0();
            int min = (int) Math.min(((long) this.f11449h) - 4, T0);
            int i4 = min + 4;
            long j2 = (long) min;
            int i5 = (T0 > j2 ? 1 : (T0 == j2 ? 0 : -1));
            j(i2, i4, 5, i5 == 0 ? 4 : 0);
            this.f11452k.H(i3 & Integer.MAX_VALUE);
            this.f11452k.p(this.f11448g, j2);
            if (i5 > 0) {
                F(i2, T0 - j2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void y(int i2, a aVar) {
        k.f(aVar, "errorCode");
        if (!this.f11450i) {
            if (aVar.a() != -1) {
                j(i2, 4, 3, 0);
                this.f11452k.H(aVar.a());
                this.f11452k.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void z(l lVar) {
        k.f(lVar, "settings");
        if (!this.f11450i) {
            int i2 = 0;
            j(0, lVar.i() * 6, 4, 0);
            while (i2 < 10) {
                if (lVar.f(i2)) {
                    this.f11452k.B(i2 != 4 ? i2 != 7 ? i2 : 4 : 3);
                    this.f11452k.H(lVar.a(i2));
                }
                i2++;
            }
            this.f11452k.flush();
        } else {
            throw new IOException("closed");
        }
    }
}

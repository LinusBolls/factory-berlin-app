package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.k;
import l.b0;
import l.c0;
import l.f;
import l.h;
import l.i;
import okhttp3.internal.http2.c;

/* compiled from: Http2Reader.kt */
public final class g implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Logger f11412k;

    /* renamed from: l  reason: collision with root package name */
    public static final a f11413l = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private final b f11414g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a f11415h;

    /* renamed from: i  reason: collision with root package name */
    private final h f11416i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f11417j;

    /* compiled from: Http2Reader.kt */
    public static final class a {
        private a() {
        }

        public final Logger a() {
            return g.f11412k;
        }

        public final int b(int i2, int i3, int i4) {
            if ((i3 & 8) != 0) {
                i2--;
            }
            if (i4 <= i2) {
                return i2 - i4;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i4 + " > remaining length " + i2);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Http2Reader.kt */
    public static final class b implements b0 {

        /* renamed from: g  reason: collision with root package name */
        private int f11418g;

        /* renamed from: h  reason: collision with root package name */
        private int f11419h;

        /* renamed from: i  reason: collision with root package name */
        private int f11420i;

        /* renamed from: j  reason: collision with root package name */
        private int f11421j;

        /* renamed from: k  reason: collision with root package name */
        private int f11422k;

        /* renamed from: l  reason: collision with root package name */
        private final h f11423l;

        public b(h hVar) {
            k.f(hVar, "source");
            this.f11423l = hVar;
        }

        private final void b() {
            int i2 = this.f11420i;
            int G = k.h0.b.G(this.f11423l);
            this.f11421j = G;
            this.f11418g = G;
            int b = k.h0.b.b(this.f11423l.readByte(), 255);
            this.f11419h = k.h0.b.b(this.f11423l.readByte(), 255);
            if (g.f11413l.a().isLoggable(Level.FINE)) {
                g.f11413l.a().fine(d.f11355e.c(true, this.f11420i, this.f11418g, b, this.f11419h));
            }
            int readInt = this.f11423l.readInt() & Integer.MAX_VALUE;
            this.f11420i = readInt;
            if (b != 9) {
                throw new IOException(b + " != TYPE_CONTINUATION");
            } else if (readInt != i2) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }

        public final int a() {
            return this.f11421j;
        }

        public void close() {
        }

        public c0 e() {
            return this.f11423l.e();
        }

        public long g0(f fVar, long j2) {
            k.f(fVar, "sink");
            while (true) {
                int i2 = this.f11421j;
                if (i2 == 0) {
                    this.f11423l.x((long) this.f11422k);
                    this.f11422k = 0;
                    if ((this.f11419h & 4) != 0) {
                        return -1;
                    }
                    b();
                } else {
                    long g0 = this.f11423l.g0(fVar, Math.min(j2, (long) i2));
                    if (g0 == -1) {
                        return -1;
                    }
                    this.f11421j -= (int) g0;
                    return g0;
                }
            }
        }

        public final void h(int i2) {
            this.f11419h = i2;
        }

        public final void i(int i2) {
            this.f11421j = i2;
        }

        public final void j(int i2) {
            this.f11418g = i2;
        }

        public final void k(int i2) {
            this.f11422k = i2;
        }

        public final void l(int i2) {
            this.f11420i = i2;
        }
    }

    /* compiled from: Http2Reader.kt */
    public interface c {
        void a();

        void b(boolean z, l lVar);

        void c(boolean z, int i2, h hVar, int i3);

        void e(boolean z, int i2, int i3);

        void f(int i2, int i3, int i4, boolean z);

        void g(int i2, a aVar);

        void i(boolean z, int i2, int i3, List<b> list);

        void j(int i2, long j2);

        void m(int i2, int i3, List<b> list);

        void p(int i2, a aVar, i iVar);
    }

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        k.b(logger, "Logger.getLogger(Http2::class.java.name)");
        f11412k = logger;
    }

    public g(h hVar, boolean z) {
        k.f(hVar, "source");
        this.f11416i = hVar;
        this.f11417j = z;
        b bVar = new b(hVar);
        this.f11414g = bVar;
        this.f11415h = new c.a(bVar, 4096, 0, 4, (DefaultConstructorMarker) null);
    }

    private final void D(c cVar, int i2, int i3, int i4) {
        int readInt;
        if (i4 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        } else if ((i3 & 1) != 0) {
            if (i2 == 0) {
                cVar.a();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        } else if (i2 % 6 == 0) {
            l lVar = new l();
            kotlin.g0.a h2 = f.h(f.i(0, i2), 6);
            int a2 = h2.a();
            int d2 = h2.d();
            int e2 = h2.e();
            if (e2 < 0 ? a2 >= d2 : a2 <= d2) {
                while (true) {
                    int c2 = k.h0.b.c(this.f11416i.readShort(), 65535);
                    readInt = this.f11416i.readInt();
                    if (c2 != 2) {
                        if (c2 == 3) {
                            c2 = 4;
                        } else if (c2 == 4) {
                            c2 = 7;
                            if (readInt < 0) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                            }
                        } else if (c2 == 5 && (readInt < 16384 || readInt > 16777215)) {
                        }
                    } else if (!(readInt == 0 || readInt == 1)) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    lVar.h(c2, readInt);
                    if (a2 == d2) {
                        break;
                    }
                    a2 += e2;
                }
                throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
            }
            cVar.b(false, lVar);
        } else {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i2);
        }
    }

    private final void F(c cVar, int i2, int i3, int i4) {
        if (i2 == 4) {
            long d2 = k.h0.b.d(this.f11416i.readInt(), 2147483647L);
            if (d2 != 0) {
                cVar.j(i4, d2);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i2);
    }

    private final void i(c cVar, int i2, int i3, int i4) {
        if (i4 != 0) {
            int i5 = 0;
            boolean z = true;
            boolean z2 = (i3 & 1) != 0;
            if ((i3 & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((i3 & 8) != 0) {
                    i5 = k.h0.b.b(this.f11416i.readByte(), 255);
                }
                cVar.c(z2, i4, this.f11416i, f11413l.b(i2, i3, i5));
                this.f11416i.x((long) i5);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    private final void j(c cVar, int i2, int i3, int i4) {
        if (i2 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i2);
        } else if (i4 == 0) {
            int readInt = this.f11416i.readInt();
            int readInt2 = this.f11416i.readInt();
            int i5 = i2 - 8;
            a a2 = a.o.a(readInt2);
            if (a2 != null) {
                i iVar = i.f11103j;
                if (i5 > 0) {
                    iVar = this.f11416i.w((long) i5);
                }
                cVar.p(readInt, a2, iVar);
                return;
            }
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    private final List<b> k(int i2, int i3, int i4, int i5) {
        this.f11414g.i(i2);
        b bVar = this.f11414g;
        bVar.j(bVar.a());
        this.f11414g.k(i3);
        this.f11414g.h(i4);
        this.f11414g.l(i5);
        this.f11415h.k();
        return this.f11415h.e();
    }

    private final void l(c cVar, int i2, int i3, int i4) {
        if (i4 != 0) {
            int i5 = 0;
            boolean z = (i3 & 1) != 0;
            if ((i3 & 8) != 0) {
                i5 = k.h0.b.b(this.f11416i.readByte(), 255);
            }
            if ((i3 & 32) != 0) {
                o(cVar, i4);
                i2 -= 5;
            }
            cVar.i(z, i4, -1, k(f11413l.b(i2, i3, i5), i5, i3, i4));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final void n(c cVar, int i2, int i3, int i4) {
        if (i2 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i2);
        } else if (i4 == 0) {
            int readInt = this.f11416i.readInt();
            int readInt2 = this.f11416i.readInt();
            boolean z = true;
            if ((i3 & 1) == 0) {
                z = false;
            }
            cVar.e(z, readInt, readInt2);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    private final void o(c cVar, int i2) {
        int readInt = this.f11416i.readInt();
        cVar.f(i2, readInt & Integer.MAX_VALUE, k.h0.b.b(this.f11416i.readByte(), 255) + 1, (readInt & ((int) 2147483648L)) != 0);
    }

    private final void q(c cVar, int i2, int i3, int i4) {
        if (i2 != 5) {
            throw new IOException("TYPE_PRIORITY length: " + i2 + " != 5");
        } else if (i4 != 0) {
            o(cVar, i4);
        } else {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
    }

    private final void y(c cVar, int i2, int i3, int i4) {
        if (i4 != 0) {
            int b2 = (i3 & 8) != 0 ? k.h0.b.b(this.f11416i.readByte(), 255) : 0;
            cVar.m(i4, this.f11416i.readInt() & Integer.MAX_VALUE, k(f11413l.b(i2 - 4, i3, b2), b2, i3, i4));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void z(c cVar, int i2, int i3, int i4) {
        if (i2 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i2 + " != 4");
        } else if (i4 != 0) {
            int readInt = this.f11416i.readInt();
            a a2 = a.o.a(readInt);
            if (a2 != null) {
                cVar.g(i4, a2);
                return;
            }
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    public final boolean b(boolean z, c cVar) {
        k.f(cVar, "handler");
        try {
            this.f11416i.s0(9);
            int G = k.h0.b.G(this.f11416i);
            if (G <= 16384) {
                int b2 = k.h0.b.b(this.f11416i.readByte(), 255);
                int b3 = k.h0.b.b(this.f11416i.readByte(), 255);
                int readInt = this.f11416i.readInt() & Integer.MAX_VALUE;
                if (f11412k.isLoggable(Level.FINE)) {
                    f11412k.fine(d.f11355e.c(true, readInt, G, b2, b3));
                }
                if (!z || b2 == 4) {
                    switch (b2) {
                        case 0:
                            i(cVar, G, b3, readInt);
                            return true;
                        case 1:
                            l(cVar, G, b3, readInt);
                            return true;
                        case 2:
                            q(cVar, G, b3, readInt);
                            return true;
                        case 3:
                            z(cVar, G, b3, readInt);
                            return true;
                        case 4:
                            D(cVar, G, b3, readInt);
                            return true;
                        case 5:
                            y(cVar, G, b3, readInt);
                            return true;
                        case 6:
                            n(cVar, G, b3, readInt);
                            return true;
                        case 7:
                            j(cVar, G, b3, readInt);
                            return true;
                        case 8:
                            F(cVar, G, b3, readInt);
                            return true;
                        default:
                            this.f11416i.x((long) G);
                            return true;
                    }
                } else {
                    throw new IOException("Expected a SETTINGS frame but was " + d.f11355e.b(b2));
                }
            } else {
                throw new IOException("FRAME_SIZE_ERROR: " + G);
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public void close() {
        this.f11416i.close();
    }

    public final void h(c cVar) {
        k.f(cVar, "handler");
        if (!this.f11417j) {
            i w = this.f11416i.w((long) d.a.G());
            if (f11412k.isLoggable(Level.FINE)) {
                Logger logger = f11412k;
                logger.fine(k.h0.b.q("<< CONNECTION " + w.t(), new Object[0]));
            }
            if (!k.a(d.a, w)) {
                throw new IOException("Expected a connection header but was " + w.L());
            }
        } else if (!b(true, cVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }
}

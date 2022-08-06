package k;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import k.x;
import kotlin.j0.d;
import kotlin.jvm.internal.k;
import l.f;
import l.h;

/* compiled from: ResponseBody.kt */
public abstract class e0 implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    public static final b f10341h = new b((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private Reader f10342g;

    /* compiled from: ResponseBody.kt */
    public static final class a extends Reader {

        /* renamed from: g  reason: collision with root package name */
        private boolean f10343g;

        /* renamed from: h  reason: collision with root package name */
        private Reader f10344h;

        /* renamed from: i  reason: collision with root package name */
        private final h f10345i;

        /* renamed from: j  reason: collision with root package name */
        private final Charset f10346j;

        public a(h hVar, Charset charset) {
            k.f(hVar, "source");
            k.f(charset, "charset");
            this.f10345i = hVar;
            this.f10346j = charset;
        }

        public void close() {
            this.f10343g = true;
            Reader reader = this.f10344h;
            if (reader != null) {
                reader.close();
            } else {
                this.f10345i.close();
            }
        }

        public int read(char[] cArr, int i2, int i3) {
            k.f(cArr, "cbuf");
            if (!this.f10343g) {
                Reader reader = this.f10344h;
                if (reader == null) {
                    reader = new InputStreamReader(this.f10345i.D0(), k.h0.b.F(this.f10345i, this.f10346j));
                    this.f10344h = reader;
                }
                return reader.read(cArr, i2, i3);
            }
            throw new IOException("Stream closed");
        }
    }

    /* compiled from: ResponseBody.kt */
    public static final class b {

        /* compiled from: ResponseBody.kt */
        public static final class a extends e0 {

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ h f10347i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ x f10348j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ long f10349k;

            a(h hVar, x xVar, long j2) {
                this.f10347i = hVar;
                this.f10348j = xVar;
                this.f10349k = j2;
            }

            public long i() {
                return this.f10349k;
            }

            public x j() {
                return this.f10348j;
            }

            public h n() {
                return this.f10347i;
            }
        }

        private b() {
        }

        public static /* synthetic */ e0 g(b bVar, byte[] bArr, x xVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                xVar = null;
            }
            return bVar.f(bArr, xVar);
        }

        public final e0 a(String str, x xVar) {
            k.f(str, "$this$toResponseBody");
            Charset charset = d.a;
            if (xVar != null && (charset = x.d(xVar, (Charset) null, 1, (Object) null)) == null) {
                charset = d.a;
                x.a aVar = x.f10543f;
                xVar = aVar.b(xVar + "; charset=utf-8");
            }
            f fVar = new f();
            fVar.g1(str, charset);
            return e(fVar, xVar, fVar.T0());
        }

        public final e0 b(x xVar, long j2, h hVar) {
            k.f(hVar, "content");
            return e(hVar, xVar, j2);
        }

        public final e0 c(x xVar, String str) {
            k.f(str, "content");
            return a(str, xVar);
        }

        public final e0 d(x xVar, byte[] bArr) {
            k.f(bArr, "content");
            return f(bArr, xVar);
        }

        public final e0 e(h hVar, x xVar, long j2) {
            k.f(hVar, "$this$asResponseBody");
            return new a(hVar, xVar, j2);
        }

        public final e0 f(byte[] bArr, x xVar) {
            k.f(bArr, "$this$toResponseBody");
            f fVar = new f();
            fVar.Y0(bArr);
            return e(fVar, xVar, (long) bArr.length);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.c(kotlin.j0.d.a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.nio.charset.Charset h() {
        /*
            r2 = this;
            k.x r0 = r2.j()
            if (r0 == 0) goto L_0x000f
            java.nio.charset.Charset r1 = kotlin.j0.d.a
            java.nio.charset.Charset r0 = r0.c(r1)
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            java.nio.charset.Charset r0 = kotlin.j0.d.a
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e0.h():java.nio.charset.Charset");
    }

    public static final e0 k(x xVar, long j2, h hVar) {
        return f10341h.b(xVar, j2, hVar);
    }

    public static final e0 l(x xVar, byte[] bArr) {
        return f10341h.d(xVar, bArr);
    }

    public final InputStream a() {
        return n().D0();
    }

    public final Reader b() {
        Reader reader = this.f10342g;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(n(), h());
        this.f10342g = aVar;
        return aVar;
    }

    public void close() {
        k.h0.b.j(n());
    }

    public abstract long i();

    public abstract x j();

    public abstract h n();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        kotlin.io.a.a(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String o() {
        /*
            r3 = this;
            l.h r0 = r3.n()
            java.nio.charset.Charset r1 = r3.h()     // Catch:{ all -> 0x0015 }
            java.nio.charset.Charset r1 = k.h0.b.F(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r0.C0(r1)     // Catch:{ all -> 0x0015 }
            r2 = 0
            kotlin.io.a.a(r0, r2)
            return r1
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            kotlin.io.a.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e0.o():java.lang.String");
    }
}

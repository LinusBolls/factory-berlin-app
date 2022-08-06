package k;

import java.io.File;
import java.nio.charset.Charset;
import k.x;
import kotlin.j0.d;
import kotlin.jvm.internal.k;
import l.g;
import l.i;

/* compiled from: RequestBody.kt */
public abstract class c0 {
    public static final a a = new a((DefaultConstructorMarker) null);

    /* compiled from: RequestBody.kt */
    public static final class a {

        /* renamed from: k.c0$a$a  reason: collision with other inner class name */
        /* compiled from: RequestBody.kt */
        public static final class C0737a extends c0 {
            final /* synthetic */ File b;
            final /* synthetic */ x c;

            C0737a(File file, x xVar) {
                this.b = file;
                this.c = xVar;
            }

            public long a() {
                return this.b.length();
            }

            public x b() {
                return this.c;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
                throw r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
                kotlin.io.a.a(r0, r3);
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void i(l.g r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "sink"
                    kotlin.jvm.internal.k.f(r3, r0)
                    java.io.File r0 = r2.b
                    l.b0 r0 = l.p.k(r0)
                    r3.t(r0)     // Catch:{ all -> 0x0013 }
                    r3 = 0
                    kotlin.io.a.a(r0, r3)
                    return
                L_0x0013:
                    r3 = move-exception
                    throw r3     // Catch:{ all -> 0x0015 }
                L_0x0015:
                    r1 = move-exception
                    kotlin.io.a.a(r0, r3)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: k.c0.a.C0737a.i(l.g):void");
            }
        }

        /* compiled from: RequestBody.kt */
        public static final class b extends c0 {
            final /* synthetic */ i b;
            final /* synthetic */ x c;

            b(i iVar, x xVar) {
                this.b = iVar;
                this.c = xVar;
            }

            public long a() {
                return (long) this.b.G();
            }

            public x b() {
                return this.c;
            }

            public void i(g gVar) {
                k.f(gVar, "sink");
                gVar.a0(this.b);
            }
        }

        /* compiled from: RequestBody.kt */
        public static final class c extends c0 {
            final /* synthetic */ byte[] b;
            final /* synthetic */ x c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f10305d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f10306e;

            c(byte[] bArr, x xVar, int i2, int i3) {
                this.b = bArr;
                this.c = xVar;
                this.f10305d = i2;
                this.f10306e = i3;
            }

            public long a() {
                return (long) this.f10305d;
            }

            public x b() {
                return this.c;
            }

            public void i(g gVar) {
                k.f(gVar, "sink");
                gVar.g(this.b, this.f10306e, this.f10305d);
            }
        }

        private a() {
        }

        public static /* synthetic */ c0 i(a aVar, String str, x xVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                xVar = null;
            }
            return aVar.b(str, xVar);
        }

        public static /* synthetic */ c0 j(a aVar, x xVar, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                i2 = 0;
            }
            if ((i4 & 8) != 0) {
                i3 = bArr.length;
            }
            return aVar.f(xVar, bArr, i2, i3);
        }

        public static /* synthetic */ c0 k(a aVar, byte[] bArr, x xVar, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                xVar = null;
            }
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = bArr.length;
            }
            return aVar.h(bArr, xVar, i2, i3);
        }

        public final c0 a(File file, x xVar) {
            k.f(file, "$this$asRequestBody");
            return new C0737a(file, xVar);
        }

        public final c0 b(String str, x xVar) {
            k.f(str, "$this$toRequestBody");
            Charset charset = d.a;
            if (xVar != null && (charset = x.d(xVar, (Charset) null, 1, (Object) null)) == null) {
                charset = d.a;
                x.a aVar = x.f10543f;
                xVar = aVar.b(xVar + "; charset=utf-8");
            }
            byte[] bytes = str.getBytes(charset);
            k.b(bytes, "(this as java.lang.String).getBytes(charset)");
            return h(bytes, xVar, 0, bytes.length);
        }

        public final c0 c(x xVar, File file) {
            k.f(file, "file");
            return a(file, xVar);
        }

        public final c0 d(x xVar, String str) {
            k.f(str, "content");
            return b(str, xVar);
        }

        public final c0 e(x xVar, i iVar) {
            k.f(iVar, "content");
            return g(iVar, xVar);
        }

        public final c0 f(x xVar, byte[] bArr, int i2, int i3) {
            k.f(bArr, "content");
            return h(bArr, xVar, i2, i3);
        }

        public final c0 g(i iVar, x xVar) {
            k.f(iVar, "$this$toRequestBody");
            return new b(iVar, xVar);
        }

        public final c0 h(byte[] bArr, x xVar, int i2, int i3) {
            k.f(bArr, "$this$toRequestBody");
            k.h0.b.i((long) bArr.length, (long) i2, (long) i3);
            return new c(bArr, xVar, i3, i2);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final c0 c(x xVar, File file) {
        return a.c(xVar, file);
    }

    public static final c0 d(x xVar, String str) {
        return a.d(xVar, str);
    }

    public static final c0 e(x xVar, i iVar) {
        return a.e(xVar, iVar);
    }

    public static final c0 f(x xVar, byte[] bArr) {
        return a.j(a, xVar, bArr, 0, 0, 12, (Object) null);
    }

    public long a() {
        return -1;
    }

    public abstract x b();

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public abstract void i(g gVar);
}

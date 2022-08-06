package k;

import java.util.ArrayList;
import java.util.List;
import k.c0;
import k.u;
import k.x;
import kotlin.jvm.internal.k;
import l.g;
import l.i;

/* compiled from: MultipartBody.kt */
public final class y extends c0 {

    /* renamed from: g  reason: collision with root package name */
    public static final x f10544g = x.f10543f.a("multipart/mixed");

    /* renamed from: h  reason: collision with root package name */
    public static final x f10545h = x.f10543f.a("multipart/form-data");

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f10546i = {(byte) 58, (byte) 32};

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f10547j = {(byte) 13, (byte) 10};

    /* renamed from: k  reason: collision with root package name */
    private static final byte[] f10548k;

    /* renamed from: l  reason: collision with root package name */
    public static final b f10549l = new b((DefaultConstructorMarker) null);
    private final x b;
    private long c = -1;

    /* renamed from: d  reason: collision with root package name */
    private final i f10550d;

    /* renamed from: e  reason: collision with root package name */
    private final x f10551e;

    /* renamed from: f  reason: collision with root package name */
    private final List<c> f10552f;

    /* compiled from: MultipartBody.kt */
    public static final class b {
        private b() {
        }

        public final void a(StringBuilder sb, String str) {
            k.f(sb, "$this$appendQuotedString");
            k.f(str, "key");
            sb.append('\"');
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt == 10) {
                    sb.append("%0A");
                } else if (charAt == 13) {
                    sb.append("%0D");
                } else if (charAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(charAt);
                }
            }
            sb.append('\"');
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: MultipartBody.kt */
    public static final class c {
        public static final a c = new a((DefaultConstructorMarker) null);
        private final u a;
        private final c0 b;

        /* compiled from: MultipartBody.kt */
        public static final class a {
            private a() {
            }

            public final c a(u uVar, c0 c0Var) {
                k.f(c0Var, "body");
                boolean z = true;
                if ((uVar != null ? uVar.a("Content-Type") : null) == null) {
                    if ((uVar != null ? uVar.a("Content-Length") : null) != null) {
                        z = false;
                    }
                    if (z) {
                        return new c(uVar, c0Var, (DefaultConstructorMarker) null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            public final c b(String str, String str2) {
                k.f(str, "name");
                k.f(str2, "value");
                return c(str, (String) null, c0.a.i(c0.a, str2, (x) null, 1, (Object) null));
            }

            public final c c(String str, String str2, c0 c0Var) {
                k.f(str, "name");
                k.f(c0Var, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                y.f10549l.a(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    y.f10549l.a(sb, str2);
                }
                String sb2 = sb.toString();
                k.b(sb2, "StringBuilder().apply(builderAction).toString()");
                u.a aVar = new u.a();
                aVar.d("Content-Disposition", sb2);
                return a(aVar.e(), c0Var);
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private c(u uVar, c0 c0Var) {
            this.a = uVar;
            this.b = c0Var;
        }

        public final c0 a() {
            return this.b;
        }

        public final u b() {
            return this.a;
        }

        public /* synthetic */ c(u uVar, c0 c0Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(uVar, c0Var);
        }
    }

    static {
        x.f10543f.a("multipart/alternative");
        x.f10543f.a("multipart/digest");
        x.f10543f.a("multipart/parallel");
        byte b2 = (byte) 45;
        f10548k = new byte[]{b2, b2};
    }

    public y(i iVar, x xVar, List<c> list) {
        k.f(iVar, "boundaryByteString");
        k.f(xVar, "type");
        k.f(list, "parts");
        this.f10550d = iVar;
        this.f10551e = xVar;
        this.f10552f = list;
        x.a aVar = x.f10543f;
        this.b = aVar.a(this.f10551e + "; boundary=" + j());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: l.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: l.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: l.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: l.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: l.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long k(l.g r14, boolean r15) {
        /*
            r13 = this;
            r0 = 0
            if (r15 == 0) goto L_0x000a
            l.f r14 = new l.f
            r14.<init>()
            r1 = r14
            goto L_0x000b
        L_0x000a:
            r1 = r0
        L_0x000b:
            java.util.List<k.y$c> r2 = r13.f10552f
            int r2 = r2.size()
            r3 = 0
            r4 = 0
            r6 = 0
        L_0x0015:
            if (r6 >= r2) goto L_0x00b7
            java.util.List<k.y$c> r7 = r13.f10552f
            java.lang.Object r7 = r7.get(r6)
            k.y$c r7 = (k.y.c) r7
            k.u r8 = r7.b()
            k.c0 r7 = r7.a()
            if (r14 == 0) goto L_0x00b3
            byte[] r9 = f10548k
            r14.Y(r9)
            l.i r9 = r13.f10550d
            r14.a0(r9)
            byte[] r9 = f10547j
            r14.Y(r9)
            if (r8 == 0) goto L_0x005f
            int r9 = r8.size()
            r10 = 0
        L_0x003f:
            if (r10 >= r9) goto L_0x005f
            java.lang.String r11 = r8.d(r10)
            l.g r11 = r14.u0(r11)
            byte[] r12 = f10546i
            l.g r11 = r11.Y(r12)
            java.lang.String r12 = r8.j(r10)
            l.g r11 = r11.u0(r12)
            byte[] r12 = f10547j
            r11.Y(r12)
            int r10 = r10 + 1
            goto L_0x003f
        L_0x005f:
            k.x r8 = r7.b()
            if (r8 == 0) goto L_0x0078
            java.lang.String r9 = "Content-Type: "
            l.g r9 = r14.u0(r9)
            java.lang.String r8 = r8.toString()
            l.g r8 = r9.u0(r8)
            byte[] r9 = f10547j
            r8.Y(r9)
        L_0x0078:
            long r8 = r7.a()
            r10 = -1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0092
            java.lang.String r10 = "Content-Length: "
            l.g r10 = r14.u0(r10)
            l.g r10 = r10.v0(r8)
            byte[] r11 = f10547j
            r10.Y(r11)
            goto L_0x009e
        L_0x0092:
            if (r15 == 0) goto L_0x009e
            if (r1 == 0) goto L_0x009a
            r1.h()
            return r10
        L_0x009a:
            kotlin.jvm.internal.k.m()
            throw r0
        L_0x009e:
            byte[] r10 = f10547j
            r14.Y(r10)
            if (r15 == 0) goto L_0x00a7
            long r4 = r4 + r8
            goto L_0x00aa
        L_0x00a7:
            r7.i(r14)
        L_0x00aa:
            byte[] r7 = f10547j
            r14.Y(r7)
            int r6 = r6 + 1
            goto L_0x0015
        L_0x00b3:
            kotlin.jvm.internal.k.m()
            throw r0
        L_0x00b7:
            if (r14 == 0) goto L_0x00df
            byte[] r2 = f10548k
            r14.Y(r2)
            l.i r2 = r13.f10550d
            r14.a0(r2)
            byte[] r2 = f10548k
            r14.Y(r2)
            byte[] r2 = f10547j
            r14.Y(r2)
            if (r15 == 0) goto L_0x00de
            if (r1 == 0) goto L_0x00da
            long r14 = r1.T0()
            long r4 = r4 + r14
            r1.h()
            goto L_0x00de
        L_0x00da:
            kotlin.jvm.internal.k.m()
            throw r0
        L_0x00de:
            return r4
        L_0x00df:
            kotlin.jvm.internal.k.m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.y.k(l.g, boolean):long");
    }

    public long a() {
        long j2 = this.c;
        if (j2 != -1) {
            return j2;
        }
        long k2 = k((g) null, true);
        this.c = k2;
        return k2;
    }

    public x b() {
        return this.b;
    }

    public void i(g gVar) {
        k.f(gVar, "sink");
        k(gVar, false);
    }

    public final String j() {
        return this.f10550d.L();
    }

    /* compiled from: MultipartBody.kt */
    public static final class a {
        private final i a;
        private x b;
        private final List<c> c;

        public a() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        public a(String str) {
            k.f(str, "boundary");
            this.a = i.f11104k.d(str);
            this.b = y.f10544g;
            this.c = new ArrayList();
        }

        public final a a(String str, String str2) {
            k.f(str, "name");
            k.f(str2, "value");
            d(c.c.b(str, str2));
            return this;
        }

        public final a b(String str, String str2, c0 c0Var) {
            k.f(str, "name");
            k.f(c0Var, "body");
            d(c.c.c(str, str2, c0Var));
            return this;
        }

        public final a c(u uVar, c0 c0Var) {
            k.f(c0Var, "body");
            d(c.c.a(uVar, c0Var));
            return this;
        }

        public final a d(c cVar) {
            k.f(cVar, "part");
            this.c.add(cVar);
            return this;
        }

        public final y e() {
            if (!this.c.isEmpty()) {
                return new y(this.a, this.b, k.h0.b.O(this.c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final a f(x xVar) {
            k.f(xVar, "type");
            if (k.a(xVar.h(), "multipart")) {
                this.b = xVar;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + xVar).toString());
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(java.lang.String r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0011
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "UUID.randomUUID().toString()"
                kotlin.jvm.internal.k.b(r1, r2)
            L_0x0011:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k.y.a.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}

package k.i0;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import k.b0;
import k.c0;
import k.d0;
import k.e0;
import k.h0.f.e;
import k.j;
import k.u;
import k.w;
import k.x;
import kotlin.jvm.internal.k;
import l.f;
import l.h;
import l.m;

/* compiled from: HttpLoggingInterceptor.kt */
public final class a implements w {
    private volatile Set<String> b;
    private volatile C0748a c;

    /* renamed from: d  reason: collision with root package name */
    private final b f10492d;

    /* renamed from: k.i0.a$a  reason: collision with other inner class name */
    /* compiled from: HttpLoggingInterceptor.kt */
    public enum C0748a {
        NONE,
        HEADERS,
        BODY
    }

    /* compiled from: HttpLoggingInterceptor.kt */
    public interface b {
        public static final b a = new b$a();

        /* renamed from: k.i0.a$b$a  reason: collision with other inner class name */
        /* compiled from: HttpLoggingInterceptor.kt */
        public static final class C0749a {
            private C0749a() {
            }

            public /* synthetic */ C0749a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C0749a((DefaultConstructorMarker) null);
        }

        void a(String str);
    }

    public a() {
        this((b) null, 1, (DefaultConstructorMarker) null);
    }

    public a(b bVar) {
        k.f(bVar, "logger");
        this.f10492d = bVar;
        this.b = i0.b();
        this.c = C0748a.NONE;
    }

    private final boolean b(u uVar) {
        String a = uVar.a("Content-Encoding");
        if (a == null || p.q(a, "identity", true) || p.q(a, "gzip", true)) {
            return false;
        }
        return true;
    }

    private final void d(u uVar, int i2) {
        String j2 = this.b.contains(uVar.d(i2)) ? "██" : uVar.j(i2);
        b bVar = this.f10492d;
        bVar.a(uVar.d(i2) + ": " + j2);
    }

    public d0 a(w.a aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l2;
        Charset charset;
        Throwable th;
        Charset charset2;
        w.a aVar2 = aVar;
        k.f(aVar2, "chain");
        C0748a aVar3 = this.c;
        b0 j2 = aVar.j();
        if (aVar3 == C0748a.NONE) {
            return aVar2.a(j2);
        }
        boolean z = aVar3 == C0748a.BODY;
        boolean z2 = z || aVar3 == C0748a.HEADERS;
        c0 a = j2.a();
        j b2 = aVar.b();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(j2.h());
        sb.append(' ');
        sb.append(j2.k());
        if (b2 != null) {
            str = " " + b2.a();
        } else {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (!z2 && a != null) {
            sb2 = sb2 + " (" + a.a() + "-byte body)";
        }
        this.f10492d.a(sb2);
        if (z2) {
            u f2 = j2.f();
            if (a != null) {
                x b3 = a.b();
                if (b3 != null && f2.a("Content-Type") == null) {
                    this.f10492d.a("Content-Type: " + b3);
                }
                if (a.a() != -1 && f2.a("Content-Length") == null) {
                    this.f10492d.a("Content-Length: " + a.a());
                }
            }
            int size = f2.size();
            for (int i2 = 0; i2 < size; i2++) {
                d(f2, i2);
            }
            if (!z || a == null) {
                this.f10492d.a("--> END " + j2.h());
            } else if (b(j2.f())) {
                this.f10492d.a("--> END " + j2.h() + " (encoded body omitted)");
            } else if (a.g()) {
                this.f10492d.a("--> END " + j2.h() + " (duplex request body omitted)");
            } else if (a.h()) {
                this.f10492d.a("--> END " + j2.h() + " (one-shot body omitted)");
            } else {
                f fVar = new f();
                a.i(fVar);
                x b4 = a.b();
                if (b4 == null || (charset2 = b4.c(StandardCharsets.UTF_8)) == null) {
                    charset2 = StandardCharsets.UTF_8;
                    k.b(charset2, "UTF_8");
                }
                this.f10492d.a("");
                if (c.a(fVar)) {
                    this.f10492d.a(fVar.C0(charset2));
                    this.f10492d.a("--> END " + j2.h() + " (" + a.a() + "-byte body)");
                } else {
                    this.f10492d.a("--> END " + j2.h() + " (binary " + a.a() + "-byte body omitted)");
                }
            }
        }
        long nanoTime = System.nanoTime();
        try {
            d0 a2 = aVar2.a(j2);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            e0 a3 = a2.a();
            if (a3 != null) {
                long i3 = a3.i();
                if (i3 != -1) {
                    str2 = i3 + "-byte";
                } else {
                    str2 = "unknown-length";
                }
                b bVar = this.f10492d;
                String str6 = "-byte body)";
                StringBuilder sb3 = new StringBuilder();
                long j3 = i3;
                sb3.append("<-- ");
                sb3.append(a2.j());
                if (a2.D().length() == 0) {
                    str3 = "-byte body omitted)";
                    str4 = "";
                } else {
                    String D = a2.D();
                    StringBuilder sb4 = new StringBuilder();
                    str3 = "-byte body omitted)";
                    sb4.append(String.valueOf(' '));
                    sb4.append(D);
                    str4 = sb4.toString();
                }
                sb3.append(str4);
                sb3.append(' ');
                sb3.append(a2.Z().k());
                sb3.append(" (");
                sb3.append(millis);
                sb3.append("ms");
                if (!z2) {
                    str5 = ", " + str2 + " body";
                } else {
                    str5 = "";
                }
                sb3.append(str5);
                sb3.append(')');
                bVar.a(sb3.toString());
                if (z2) {
                    u y = a2.y();
                    int size2 = y.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        d(y, i4);
                    }
                    if (!z || !e.b(a2)) {
                        this.f10492d.a("<-- END HTTP");
                    } else if (b(a2.y())) {
                        this.f10492d.a("<-- END HTTP (encoded body omitted)");
                    } else {
                        h n2 = a3.n();
                        n2.C(Long.MAX_VALUE);
                        f d2 = n2.d();
                        if (p.q("gzip", y.a("Content-Encoding"), true)) {
                            Long valueOf = Long.valueOf(d2.T0());
                            m mVar = new m(d2.clone());
                            try {
                                d2 = new f();
                                d2.t(mVar);
                                kotlin.io.a.a(mVar, (Throwable) null);
                                l2 = valueOf;
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                kotlin.io.a.a(mVar, th);
                                throw th3;
                            }
                        } else {
                            l2 = null;
                        }
                        x j4 = a3.j();
                        if (j4 == null || (charset = j4.c(StandardCharsets.UTF_8)) == null) {
                            charset = StandardCharsets.UTF_8;
                            k.b(charset, "UTF_8");
                        }
                        if (!c.a(d2)) {
                            this.f10492d.a("");
                            this.f10492d.a("<-- END HTTP (binary " + d2.T0() + str3);
                            return a2;
                        }
                        if (j3 != 0) {
                            this.f10492d.a("");
                            this.f10492d.a(d2.clone().C0(charset));
                        }
                        if (l2 != null) {
                            this.f10492d.a("<-- END HTTP (" + d2.T0() + "-byte, " + l2 + "-gzipped-byte body)");
                        } else {
                            this.f10492d.a("<-- END HTTP (" + d2.T0() + str6);
                        }
                    }
                }
                return a2;
            }
            k.m();
            throw null;
        } catch (Exception e2) {
            Exception exc = e2;
            this.f10492d.a("<-- HTTP FAILED: " + exc);
            throw exc;
        }
    }

    public final void c(C0748a aVar) {
        k.f(aVar, "<set-?>");
        this.c = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? b.a : bVar);
    }
}

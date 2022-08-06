package k.h0.d;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import k.b0;
import k.d;
import k.d0;
import k.u;
import kotlin.jvm.internal.k;

/* compiled from: CacheStrategy.kt */
public final class c {
    public static final a c = new a((DefaultConstructorMarker) null);
    private final b0 a;
    private final d0 b;

    /* compiled from: CacheStrategy.kt */
    public static final class a {
        private a() {
        }

        public final boolean a(d0 d0Var, b0 b0Var) {
            k.f(d0Var, "response");
            k.f(b0Var, "request");
            int j2 = d0Var.j();
            if (!(j2 == 200 || j2 == 410 || j2 == 414 || j2 == 501 || j2 == 203 || j2 == 204)) {
                if (j2 != 307) {
                    if (!(j2 == 308 || j2 == 404 || j2 == 405)) {
                        switch (j2) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (d0.q(d0Var, "Expires", (String) null, 2, (Object) null) == null && d0Var.b().c() == -1 && !d0Var.b().b() && !d0Var.b().a()) {
                    return false;
                }
            }
            if (d0Var.b().h() || b0Var.b().h()) {
                return false;
            }
            return true;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CacheStrategy.kt */
    public static final class b {
        private Date a;
        private String b;
        private Date c;

        /* renamed from: d  reason: collision with root package name */
        private String f10371d;

        /* renamed from: e  reason: collision with root package name */
        private Date f10372e;

        /* renamed from: f  reason: collision with root package name */
        private long f10373f;

        /* renamed from: g  reason: collision with root package name */
        private long f10374g;

        /* renamed from: h  reason: collision with root package name */
        private String f10375h;

        /* renamed from: i  reason: collision with root package name */
        private int f10376i = -1;

        /* renamed from: j  reason: collision with root package name */
        private final long f10377j;

        /* renamed from: k  reason: collision with root package name */
        private final b0 f10378k;

        /* renamed from: l  reason: collision with root package name */
        private final d0 f10379l;

        public b(long j2, b0 b0Var, d0 d0Var) {
            k.f(b0Var, "request");
            this.f10377j = j2;
            this.f10378k = b0Var;
            this.f10379l = d0Var;
            if (d0Var != null) {
                this.f10373f = d0Var.b0();
                this.f10374g = this.f10379l.U();
                u y = this.f10379l.y();
                int size = y.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String d2 = y.d(i2);
                    String j3 = y.j(i2);
                    if (p.q(d2, "Date", true)) {
                        this.a = k.h0.f.c.a(j3);
                        this.b = j3;
                    } else if (p.q(d2, "Expires", true)) {
                        this.f10372e = k.h0.f.c.a(j3);
                    } else if (p.q(d2, "Last-Modified", true)) {
                        this.c = k.h0.f.c.a(j3);
                        this.f10371d = j3;
                    } else if (p.q(d2, "ETag", true)) {
                        this.f10375h = j3;
                    } else if (p.q(d2, "Age", true)) {
                        this.f10376i = k.h0.b.R(j3, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.a;
            long j2 = 0;
            if (date != null) {
                j2 = Math.max(0, this.f10374g - date.getTime());
            }
            int i2 = this.f10376i;
            if (i2 != -1) {
                j2 = Math.max(j2, TimeUnit.SECONDS.toMillis((long) i2));
            }
            long j3 = this.f10374g;
            return j2 + (j3 - this.f10373f) + (this.f10377j - j3);
        }

        private final c c() {
            if (this.f10379l == null) {
                return new c(this.f10378k, (d0) null);
            }
            if (this.f10378k.g() && this.f10379l.l() == null) {
                return new c(this.f10378k, (d0) null);
            }
            if (!c.c.a(this.f10379l, this.f10378k)) {
                return new c(this.f10378k, (d0) null);
            }
            d b2 = this.f10378k.b();
            if (b2.g() || e(this.f10378k)) {
                return new c(this.f10378k, (d0) null);
            }
            d b3 = this.f10379l.b();
            long a2 = a();
            long d2 = d();
            if (b2.c() != -1) {
                d2 = Math.min(d2, TimeUnit.SECONDS.toMillis((long) b2.c()));
            }
            long j2 = 0;
            long millis = b2.e() != -1 ? TimeUnit.SECONDS.toMillis((long) b2.e()) : 0;
            if (!b3.f() && b2.d() != -1) {
                j2 = TimeUnit.SECONDS.toMillis((long) b2.d());
            }
            if (!b3.g()) {
                long j3 = millis + a2;
                if (j3 < j2 + d2) {
                    d0.a K = this.f10379l.K();
                    if (j3 >= d2) {
                        K.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a2 > 86400000 && f()) {
                        K.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new c((b0) null, K.c());
                }
            }
            String str = this.f10375h;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = "If-None-Match";
            } else if (this.c != null) {
                str = this.f10371d;
            } else if (this.a == null) {
                return new c(this.f10378k, (d0) null);
            } else {
                str = this.b;
            }
            u.a g2 = this.f10378k.f().g();
            if (str != null) {
                g2.c(str2, str);
                b0.a i2 = this.f10378k.i();
                i2.f(g2.e());
                return new c(i2.b(), this.f10379l);
            }
            k.m();
            throw null;
        }

        private final long d() {
            d0 d0Var = this.f10379l;
            if (d0Var != null) {
                d b2 = d0Var.b();
                if (b2.c() != -1) {
                    return TimeUnit.SECONDS.toMillis((long) b2.c());
                }
                Date date = this.f10372e;
                if (date != null) {
                    Date date2 = this.a;
                    long time = date.getTime() - (date2 != null ? date2.getTime() : this.f10374g);
                    if (time > 0) {
                        return time;
                    }
                    return 0;
                } else if (this.c == null || this.f10379l.Z().k().p() != null) {
                    return 0;
                } else {
                    Date date3 = this.a;
                    long time2 = date3 != null ? date3.getTime() : this.f10373f;
                    Date date4 = this.c;
                    if (date4 != null) {
                        long time3 = time2 - date4.getTime();
                        if (time3 > 0) {
                            return time3 / ((long) 10);
                        }
                        return 0;
                    }
                    k.m();
                    throw null;
                }
            } else {
                k.m();
                throw null;
            }
        }

        private final boolean e(b0 b0Var) {
            return (b0Var.d("If-Modified-Since") == null && b0Var.d("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            d0 d0Var = this.f10379l;
            if (d0Var != null) {
                return d0Var.b().c() == -1 && this.f10372e == null;
            }
            k.m();
            throw null;
        }

        public final c b() {
            c c2 = c();
            return (c2.b() == null || !this.f10378k.b().i()) ? c2 : new c((b0) null, (d0) null);
        }
    }

    public c(b0 b0Var, d0 d0Var) {
        this.a = b0Var;
        this.b = d0Var;
    }

    public final d0 a() {
        return this.b;
    }

    public final b0 b() {
        return this.a;
    }
}

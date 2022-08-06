package k;

import java.io.Closeable;
import java.util.List;
import k.h0.f.e;
import k.u;
import kotlin.jvm.internal.k;
import okhttp3.internal.connection.c;

/* compiled from: Response.kt */
public final class d0 implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    private d f10323g;

    /* renamed from: h  reason: collision with root package name */
    private final b0 f10324h;

    /* renamed from: i  reason: collision with root package name */
    private final a0 f10325i;

    /* renamed from: j  reason: collision with root package name */
    private final String f10326j;

    /* renamed from: k  reason: collision with root package name */
    private final int f10327k;

    /* renamed from: l  reason: collision with root package name */
    private final t f10328l;

    /* renamed from: m  reason: collision with root package name */
    private final u f10329m;

    /* renamed from: n  reason: collision with root package name */
    private final e0 f10330n;
    private final d0 o;
    private final d0 p;
    private final d0 q;
    private final long r;
    private final long s;
    private final c t;

    public d0(b0 b0Var, a0 a0Var, String str, int i2, t tVar, u uVar, e0 e0Var, d0 d0Var, d0 d0Var2, d0 d0Var3, long j2, long j3, c cVar) {
        k.f(b0Var, "request");
        k.f(a0Var, "protocol");
        k.f(str, "message");
        k.f(uVar, "headers");
        this.f10324h = b0Var;
        this.f10325i = a0Var;
        this.f10326j = str;
        this.f10327k = i2;
        this.f10328l = tVar;
        this.f10329m = uVar;
        this.f10330n = e0Var;
        this.o = d0Var;
        this.p = d0Var2;
        this.q = d0Var3;
        this.r = j2;
        this.s = j3;
        this.t = cVar;
    }

    public static /* synthetic */ String q(d0 d0Var, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return d0Var.o(str, str2);
    }

    public final String D() {
        return this.f10326j;
    }

    public final d0 F() {
        return this.o;
    }

    public final a K() {
        return new a(this);
    }

    public final d0 L() {
        return this.q;
    }

    public final a0 M() {
        return this.f10325i;
    }

    public final long U() {
        return this.s;
    }

    public final b0 Z() {
        return this.f10324h;
    }

    public final e0 a() {
        return this.f10330n;
    }

    public final d b() {
        d dVar = this.f10323g;
        if (dVar != null) {
            return dVar;
        }
        d b = d.o.b(this.f10329m);
        this.f10323g = b;
        return b;
    }

    public final long b0() {
        return this.r;
    }

    public void close() {
        e0 e0Var = this.f10330n;
        if (e0Var != null) {
            e0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final d0 h() {
        return this.p;
    }

    public final List<h> i() {
        String str;
        u uVar = this.f10329m;
        int i2 = this.f10327k;
        if (i2 == 401) {
            str = "WWW-Authenticate";
        } else if (i2 != 407) {
            return n.g();
        } else {
            str = "Proxy-Authenticate";
        }
        return e.a(uVar, str);
    }

    public final int j() {
        return this.f10327k;
    }

    public final c k() {
        return this.t;
    }

    public final t l() {
        return this.f10328l;
    }

    public final String n(String str) {
        return q(this, str, (String) null, 2, (Object) null);
    }

    public final String o(String str, String str2) {
        k.f(str, "name");
        String a2 = this.f10329m.a(str);
        return a2 != null ? a2 : str2;
    }

    public String toString() {
        return "Response{protocol=" + this.f10325i + ", code=" + this.f10327k + ", message=" + this.f10326j + ", url=" + this.f10324h.k() + '}';
    }

    public final u y() {
        return this.f10329m;
    }

    public final boolean z() {
        int i2 = this.f10327k;
        return 200 <= i2 && 299 >= i2;
    }

    /* compiled from: Response.kt */
    public static class a {
        private b0 a;
        private a0 b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private String f10331d;

        /* renamed from: e  reason: collision with root package name */
        private t f10332e;

        /* renamed from: f  reason: collision with root package name */
        private u.a f10333f;

        /* renamed from: g  reason: collision with root package name */
        private e0 f10334g;

        /* renamed from: h  reason: collision with root package name */
        private d0 f10335h;

        /* renamed from: i  reason: collision with root package name */
        private d0 f10336i;

        /* renamed from: j  reason: collision with root package name */
        private d0 f10337j;

        /* renamed from: k  reason: collision with root package name */
        private long f10338k;

        /* renamed from: l  reason: collision with root package name */
        private long f10339l;

        /* renamed from: m  reason: collision with root package name */
        private c f10340m;

        public a() {
            this.c = -1;
            this.f10333f = new u.a();
        }

        private final void e(d0 d0Var) {
            if (d0Var != null) {
                if (!(d0Var.a() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        private final void f(String str, d0 d0Var) {
            if (d0Var != null) {
                boolean z = true;
                if (d0Var.a() == null) {
                    if (d0Var.F() == null) {
                        if (d0Var.h() == null) {
                            if (d0Var.L() != null) {
                                z = false;
                            }
                            if (!z) {
                                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException((str + ".body != null").toString());
            }
        }

        public a a(String str, String str2) {
            k.f(str, "name");
            k.f(str2, "value");
            this.f10333f.a(str, str2);
            return this;
        }

        public a b(e0 e0Var) {
            this.f10334g = e0Var;
            return this;
        }

        public d0 c() {
            if (this.c >= 0) {
                b0 b0Var = this.a;
                if (b0Var != null) {
                    a0 a0Var = this.b;
                    if (a0Var != null) {
                        String str = this.f10331d;
                        if (str != null) {
                            return new d0(b0Var, a0Var, str, this.c, this.f10332e, this.f10333f.e(), this.f10334g, this.f10335h, this.f10336i, this.f10337j, this.f10338k, this.f10339l, this.f10340m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + this.c).toString());
        }

        public a d(d0 d0Var) {
            f("cacheResponse", d0Var);
            this.f10336i = d0Var;
            return this;
        }

        public a g(int i2) {
            this.c = i2;
            return this;
        }

        public final int h() {
            return this.c;
        }

        public a i(t tVar) {
            this.f10332e = tVar;
            return this;
        }

        public a j(String str, String str2) {
            k.f(str, "name");
            k.f(str2, "value");
            this.f10333f.i(str, str2);
            return this;
        }

        public a k(u uVar) {
            k.f(uVar, "headers");
            this.f10333f = uVar.g();
            return this;
        }

        public final void l(c cVar) {
            k.f(cVar, "deferredTrailers");
            this.f10340m = cVar;
        }

        public a m(String str) {
            k.f(str, "message");
            this.f10331d = str;
            return this;
        }

        public a n(d0 d0Var) {
            f("networkResponse", d0Var);
            this.f10335h = d0Var;
            return this;
        }

        public a o(d0 d0Var) {
            e(d0Var);
            this.f10337j = d0Var;
            return this;
        }

        public a p(a0 a0Var) {
            k.f(a0Var, "protocol");
            this.b = a0Var;
            return this;
        }

        public a q(long j2) {
            this.f10339l = j2;
            return this;
        }

        public a r(b0 b0Var) {
            k.f(b0Var, "request");
            this.a = b0Var;
            return this;
        }

        public a s(long j2) {
            this.f10338k = j2;
            return this;
        }

        public a(d0 d0Var) {
            k.f(d0Var, "response");
            this.c = -1;
            this.a = d0Var.Z();
            this.b = d0Var.M();
            this.c = d0Var.j();
            this.f10331d = d0Var.D();
            this.f10332e = d0Var.l();
            this.f10333f = d0Var.y().g();
            this.f10334g = d0Var.a();
            this.f10335h = d0Var.F();
            this.f10336i = d0Var.h();
            this.f10337j = d0Var.L();
            this.f10338k = d0Var.b0();
            this.f10339l = d0Var.U();
            this.f10340m = d0Var.k();
        }
    }
}

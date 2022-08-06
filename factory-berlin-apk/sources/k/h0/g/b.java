package k.h0.g;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import k.d0;
import k.h0.f.i;
import k.n;
import k.u;
import k.v;
import k.z;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import l.b0;
import l.c0;
import l.h;
import l.l;

/* compiled from: Http1ExchangeCodec.kt */
public final class b implements k.h0.f.d {
    /* access modifiers changed from: private */
    public int a;
    /* access modifiers changed from: private */
    public final a b = new a(this.f10432f);
    /* access modifiers changed from: private */
    public u c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final z f10430d;

    /* renamed from: e  reason: collision with root package name */
    private final okhttp3.internal.connection.f f10431e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final h f10432f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final l.g f10433g;

    /* compiled from: Http1ExchangeCodec.kt */
    private abstract class a implements b0 {

        /* renamed from: g  reason: collision with root package name */
        private final l f10434g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f10435h;

        public a() {
            this.f10434g = new l(b.this.f10432f.e());
        }

        /* access modifiers changed from: protected */
        public final boolean a() {
            return this.f10435h;
        }

        public final void b() {
            if (b.this.a != 6) {
                if (b.this.a == 5) {
                    b.this.r(this.f10434g);
                    b.this.a = 6;
                    return;
                }
                throw new IllegalStateException("state: " + b.this.a);
            }
        }

        public c0 e() {
            return this.f10434g;
        }

        public long g0(l.f fVar, long j2) {
            k.f(fVar, "sink");
            try {
                return b.this.f10432f.g0(fVar, j2);
            } catch (IOException e2) {
                b.this.h().z();
                b();
                throw e2;
            }
        }

        /* access modifiers changed from: protected */
        public final void h(boolean z) {
            this.f10435h = z;
        }
    }

    /* renamed from: k.h0.g.b$b  reason: collision with other inner class name */
    /* compiled from: Http1ExchangeCodec.kt */
    private final class C0742b implements l.z {

        /* renamed from: g  reason: collision with root package name */
        private final l f10437g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f10438h;

        public C0742b() {
            this.f10437g = new l(b.this.f10433g.e());
        }

        public synchronized void close() {
            if (!this.f10438h) {
                this.f10438h = true;
                b.this.f10433g.u0("0\r\n\r\n");
                b.this.r(this.f10437g);
                b.this.a = 3;
            }
        }

        public c0 e() {
            return this.f10437g;
        }

        public synchronized void flush() {
            if (!this.f10438h) {
                b.this.f10433g.flush();
            }
        }

        public void p(l.f fVar, long j2) {
            k.f(fVar, "source");
            if (!(!this.f10438h)) {
                throw new IllegalStateException("closed".toString());
            } else if (j2 != 0) {
                b.this.f10433g.u(j2);
                b.this.f10433g.u0("\r\n");
                b.this.f10433g.p(fVar, j2);
                b.this.f10433g.u0("\r\n");
            }
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    private final class c extends a {

        /* renamed from: j  reason: collision with root package name */
        private long f10440j = -1;

        /* renamed from: k  reason: collision with root package name */
        private boolean f10441k = true;

        /* renamed from: l  reason: collision with root package name */
        private final v f10442l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b f10443m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, v vVar) {
            super();
            k.f(vVar, "url");
            this.f10443m = bVar;
            this.f10442l = vVar;
        }

        private final void i() {
            if (this.f10440j != -1) {
                this.f10443m.f10432f.N();
            }
            try {
                this.f10440j = this.f10443m.f10432f.A0();
                String N = this.f10443m.f10432f.N();
                if (N != null) {
                    String obj = q.F0(N).toString();
                    if (this.f10440j >= 0) {
                        if (!(obj.length() > 0) || p.D(obj, ";", false, 2, (Object) null)) {
                            if (this.f10440j == 0) {
                                this.f10441k = false;
                                b bVar = this.f10443m;
                                bVar.c = bVar.b.a();
                                z j2 = this.f10443m.f10430d;
                                if (j2 != null) {
                                    n v = j2.v();
                                    v vVar = this.f10442l;
                                    u o = this.f10443m.c;
                                    if (o != null) {
                                        k.h0.f.e.f(v, vVar, o);
                                        b();
                                        return;
                                    }
                                    k.m();
                                    throw null;
                                }
                                k.m();
                                throw null;
                            }
                            return;
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions" + " but was \"" + this.f10440j + obj + '\"');
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        public void close() {
            if (!a()) {
                if (this.f10441k && !k.h0.b.p(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f10443m.h().z();
                    b();
                }
                h(true);
            }
        }

        public long g0(l.f fVar, long j2) {
            k.f(fVar, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            } else if (!(true ^ a())) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f10441k) {
                return -1;
            } else {
                long j3 = this.f10440j;
                if (j3 == 0 || j3 == -1) {
                    i();
                    if (!this.f10441k) {
                        return -1;
                    }
                }
                long g0 = super.g0(fVar, Math.min(j2, this.f10440j));
                if (g0 != -1) {
                    this.f10440j -= g0;
                    return g0;
                }
                this.f10443m.h().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    private final class e extends a {

        /* renamed from: j  reason: collision with root package name */
        private long f10444j;

        public e(long j2) {
            super();
            this.f10444j = j2;
            if (j2 == 0) {
                b();
            }
        }

        public void close() {
            if (!a()) {
                if (this.f10444j != 0 && !k.h0.b.p(this, 100, TimeUnit.MILLISECONDS)) {
                    b.this.h().z();
                    b();
                }
                h(true);
            }
        }

        public long g0(l.f fVar, long j2) {
            k.f(fVar, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            } else if (true ^ a()) {
                long j3 = this.f10444j;
                if (j3 == 0) {
                    return -1;
                }
                long g0 = super.g0(fVar, Math.min(j3, j2));
                if (g0 != -1) {
                    long j4 = this.f10444j - g0;
                    this.f10444j = j4;
                    if (j4 == 0) {
                        b();
                    }
                    return g0;
                }
                b.this.h().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    private final class f implements l.z {

        /* renamed from: g  reason: collision with root package name */
        private final l f10446g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f10447h;

        public f() {
            this.f10446g = new l(b.this.f10433g.e());
        }

        public void close() {
            if (!this.f10447h) {
                this.f10447h = true;
                b.this.r(this.f10446g);
                b.this.a = 3;
            }
        }

        public c0 e() {
            return this.f10446g;
        }

        public void flush() {
            if (!this.f10447h) {
                b.this.f10433g.flush();
            }
        }

        public void p(l.f fVar, long j2) {
            k.f(fVar, "source");
            if (!this.f10447h) {
                k.h0.b.i(fVar.T0(), 0, j2);
                b.this.f10433g.p(fVar, j2);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    private final class g extends a {

        /* renamed from: j  reason: collision with root package name */
        private boolean f10449j;

        public g(b bVar) {
            super();
        }

        public void close() {
            if (!a()) {
                if (!this.f10449j) {
                    b();
                }
                h(true);
            }
        }

        public long g0(l.f fVar, long j2) {
            k.f(fVar, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            } else if (!(!a())) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f10449j) {
                return -1;
            } else {
                long g0 = super.g0(fVar, j2);
                if (g0 != -1) {
                    return g0;
                }
                this.f10449j = true;
                b();
                return -1;
            }
        }
    }

    static {
        new d((DefaultConstructorMarker) null);
    }

    public b(z zVar, okhttp3.internal.connection.f fVar, h hVar, l.g gVar) {
        k.f(fVar, "connection");
        k.f(hVar, "source");
        k.f(gVar, "sink");
        this.f10430d = zVar;
        this.f10431e = fVar;
        this.f10432f = hVar;
        this.f10433g = gVar;
    }

    /* access modifiers changed from: private */
    public final void r(l lVar) {
        c0 i2 = lVar.i();
        lVar.j(c0.f11087d);
        i2.a();
        i2.b();
    }

    private final boolean s(k.b0 b0Var) {
        return p.q("chunked", b0Var.d("Transfer-Encoding"), true);
    }

    private final boolean t(d0 d0Var) {
        return p.q("chunked", d0.q(d0Var, "Transfer-Encoding", (String) null, 2, (Object) null), true);
    }

    private final l.z u() {
        boolean z = true;
        if (this.a != 1) {
            z = false;
        }
        if (z) {
            this.a = 2;
            return new C0742b();
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    private final b0 v(v vVar) {
        if (this.a == 4) {
            this.a = 5;
            return new c(this, vVar);
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    private final b0 w(long j2) {
        if (this.a == 4) {
            this.a = 5;
            return new e(j2);
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    private final l.z x() {
        boolean z = true;
        if (this.a != 1) {
            z = false;
        }
        if (z) {
            this.a = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    private final b0 y() {
        if (this.a == 4) {
            this.a = 5;
            h().z();
            return new g(this);
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    public final void A(u uVar, String str) {
        k.f(uVar, "headers");
        k.f(str, "requestLine");
        if (this.a == 0) {
            this.f10433g.u0(str).u0("\r\n");
            int size = uVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f10433g.u0(uVar.d(i2)).u0(": ").u0(uVar.j(i2)).u0("\r\n");
            }
            this.f10433g.u0("\r\n");
            this.a = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    public void a() {
        this.f10433g.flush();
    }

    public void b(k.b0 b0Var) {
        k.f(b0Var, "request");
        i iVar = i.a;
        Proxy.Type type = h().A().b().type();
        k.b(type, "connection.route().proxy.type()");
        A(b0Var.f(), iVar.a(b0Var, type));
    }

    public void c() {
        this.f10433g.flush();
    }

    public void cancel() {
        h().e();
    }

    public long d(d0 d0Var) {
        k.f(d0Var, "response");
        if (!k.h0.f.e.b(d0Var)) {
            return 0;
        }
        if (t(d0Var)) {
            return -1;
        }
        return k.h0.b.s(d0Var);
    }

    public b0 e(d0 d0Var) {
        k.f(d0Var, "response");
        if (!k.h0.f.e.b(d0Var)) {
            return w(0);
        }
        if (t(d0Var)) {
            return v(d0Var.Z().k());
        }
        long s = k.h0.b.s(d0Var);
        if (s != -1) {
            return w(s);
        }
        return y();
    }

    public l.z f(k.b0 b0Var, long j2) {
        k.f(b0Var, "request");
        if (b0Var.a() != null && b0Var.a().g()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (s(b0Var)) {
            return u();
        } else {
            if (j2 != -1) {
                return x();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public d0.a g(boolean z) {
        int i2 = this.a;
        boolean z2 = true;
        if (!(i2 == 1 || i2 == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                k.h0.f.k a2 = k.h0.f.k.f10429d.a(this.b.b());
                d0.a aVar = new d0.a();
                aVar.p(a2.a);
                aVar.g(a2.b);
                aVar.m(a2.c);
                aVar.k(this.b.a());
                if (z && a2.b == 100) {
                    return null;
                }
                if (a2.b == 100) {
                    this.a = 3;
                    return aVar;
                }
                this.a = 4;
                return aVar;
            } catch (EOFException e2) {
                String q = h().A().a().l().q();
                throw new IOException("unexpected end of stream on " + q, e2);
            }
        } else {
            throw new IllegalStateException(("state: " + this.a).toString());
        }
    }

    public okhttp3.internal.connection.f h() {
        return this.f10431e;
    }

    public final void z(d0 d0Var) {
        k.f(d0Var, "response");
        long s = k.h0.b.s(d0Var);
        if (s != -1) {
            b0 w = w(s);
            k.h0.b.I(w, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            w.close();
        }
    }
}

package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k.a0;
import k.b0;
import k.d0;
import k.h0.b;
import k.h0.f.d;
import k.h0.f.e;
import k.h0.f.g;
import k.h0.f.i;
import k.h0.f.k;
import k.u;
import k.z;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;

/* compiled from: Http2ExchangeCodec.kt */
public final class f implements d {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f11406g = b.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final List<String> f11407h = b.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: i  reason: collision with root package name */
    public static final a f11408i = new a((DefaultConstructorMarker) null);
    private volatile h a;
    private final a0 b;
    private volatile boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final okhttp3.internal.connection.f f11409d;

    /* renamed from: e  reason: collision with root package name */
    private final g f11410e;

    /* renamed from: f  reason: collision with root package name */
    private final e f11411f;

    /* compiled from: Http2ExchangeCodec.kt */
    public static final class a {
        private a() {
        }

        public final List<b> a(b0 b0Var) {
            k.f(b0Var, "request");
            u f2 = b0Var.f();
            ArrayList arrayList = new ArrayList(f2.size() + 4);
            arrayList.add(new b(b.f11338f, b0Var.h()));
            arrayList.add(new b(b.f11339g, i.a.c(b0Var.k())));
            String d2 = b0Var.d("Host");
            if (d2 != null) {
                arrayList.add(new b(b.f11341i, d2));
            }
            arrayList.add(new b(b.f11340h, b0Var.k().s()));
            int i2 = 0;
            int size = f2.size();
            while (i2 < size) {
                String d3 = f2.d(i2);
                Locale locale = Locale.US;
                k.b(locale, "Locale.US");
                if (d3 != null) {
                    String lowerCase = d3.toLowerCase(locale);
                    k.b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (!f.f11406g.contains(lowerCase) || (k.a(lowerCase, "te") && k.a(f2.j(i2), "trailers"))) {
                        arrayList.add(new b(lowerCase, f2.j(i2)));
                    }
                    i2++;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return arrayList;
        }

        public final d0.a b(u uVar, a0 a0Var) {
            k.f(uVar, "headerBlock");
            k.f(a0Var, "protocol");
            u.a aVar = new u.a();
            int size = uVar.size();
            k.h0.f.k kVar = null;
            for (int i2 = 0; i2 < size; i2++) {
                String d2 = uVar.d(i2);
                String j2 = uVar.j(i2);
                if (k.a(d2, ":status")) {
                    k.a aVar2 = k.h0.f.k.f10429d;
                    kVar = aVar2.a("HTTP/1.1 " + j2);
                } else if (!f.f11407h.contains(d2)) {
                    aVar.c(d2, j2);
                }
            }
            if (kVar != null) {
                d0.a aVar3 = new d0.a();
                aVar3.p(a0Var);
                aVar3.g(kVar.b);
                aVar3.m(kVar.c);
                aVar3.k(aVar.e());
                return aVar3;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public f(z zVar, okhttp3.internal.connection.f fVar, g gVar, e eVar) {
        a0 a0Var;
        kotlin.jvm.internal.k.f(zVar, "client");
        kotlin.jvm.internal.k.f(fVar, "connection");
        kotlin.jvm.internal.k.f(gVar, "chain");
        kotlin.jvm.internal.k.f(eVar, "http2Connection");
        this.f11409d = fVar;
        this.f11410e = gVar;
        this.f11411f = eVar;
        if (zVar.I().contains(a0.H2_PRIOR_KNOWLEDGE)) {
            a0Var = a0.H2_PRIOR_KNOWLEDGE;
        } else {
            a0Var = a0.HTTP_2;
        }
        this.b = a0Var;
    }

    public void a() {
        h hVar = this.a;
        if (hVar != null) {
            hVar.n().close();
        } else {
            kotlin.jvm.internal.k.m();
            throw null;
        }
    }

    public void b(b0 b0Var) {
        kotlin.jvm.internal.k.f(b0Var, "request");
        if (this.a == null) {
            this.a = this.f11411f.M0(f11408i.a(b0Var), b0Var.a() != null);
            if (this.c) {
                h hVar = this.a;
                if (hVar == null) {
                    kotlin.jvm.internal.k.m();
                    throw null;
                } else {
                    hVar.f(a.CANCEL);
                    throw new IOException("Canceled");
                }
            } else {
                h hVar2 = this.a;
                if (hVar2 != null) {
                    hVar2.v().g((long) this.f11410e.h(), TimeUnit.MILLISECONDS);
                    h hVar3 = this.a;
                    if (hVar3 != null) {
                        hVar3.E().g((long) this.f11410e.k(), TimeUnit.MILLISECONDS);
                    } else {
                        kotlin.jvm.internal.k.m();
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.k.m();
                    throw null;
                }
            }
        }
    }

    public void c() {
        this.f11411f.flush();
    }

    public void cancel() {
        this.c = true;
        h hVar = this.a;
        if (hVar != null) {
            hVar.f(a.CANCEL);
        }
    }

    public long d(d0 d0Var) {
        kotlin.jvm.internal.k.f(d0Var, "response");
        if (!e.b(d0Var)) {
            return 0;
        }
        return b.s(d0Var);
    }

    public l.b0 e(d0 d0Var) {
        kotlin.jvm.internal.k.f(d0Var, "response");
        h hVar = this.a;
        if (hVar != null) {
            return hVar.p();
        }
        kotlin.jvm.internal.k.m();
        throw null;
    }

    public l.z f(b0 b0Var, long j2) {
        kotlin.jvm.internal.k.f(b0Var, "request");
        h hVar = this.a;
        if (hVar != null) {
            return hVar.n();
        }
        kotlin.jvm.internal.k.m();
        throw null;
    }

    public d0.a g(boolean z) {
        h hVar = this.a;
        if (hVar != null) {
            d0.a b2 = f11408i.b(hVar.C(), this.b);
            if (!z || b2.h() != 100) {
                return b2;
            }
            return null;
        }
        kotlin.jvm.internal.k.m();
        throw null;
    }

    public okhttp3.internal.connection.f h() {
        return this.f11409d;
    }
}

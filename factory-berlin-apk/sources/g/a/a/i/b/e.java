package g.a.a.i.b;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k.a0;
import k.b0;
import k.c0;
import k.d0;
import k.g0;
import k.i;
import k.t;
import k.u;
import k.x;
import l.b0;
import l.f;
import l.g;
import l.h;
import l.p;
import l.z;

/* compiled from: ResponseHeaderRecord */
final class e {
    private final String a;
    private final u b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f9102d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9103e;

    /* renamed from: f  reason: collision with root package name */
    private final String f9104f;

    /* renamed from: g  reason: collision with root package name */
    private final u f9105g;

    /* renamed from: h  reason: collision with root package name */
    private final t f9106h;

    /* renamed from: i  reason: collision with root package name */
    private final long f9107i;

    /* renamed from: j  reason: collision with root package name */
    private final long f9108j;

    e(b0 b0Var) {
        try {
            h d2 = p.d(b0Var);
            this.a = d2.N();
            this.c = d2.N();
            u.a aVar = new u.a();
            int d3 = d(d2);
            for (int i2 = 0; i2 < d3; i2++) {
                a(aVar, d2.N());
            }
            this.b = aVar.e();
            g.a.a.i.b.j.e a2 = g.a.a.i.b.j.e.a(d2.N());
            this.f9102d = a2.a;
            this.f9103e = a2.b;
            this.f9104f = a2.c;
            u.a aVar2 = new u.a();
            int d4 = d(d2);
            for (int i3 = 0; i3 < d4; i3++) {
                a(aVar2, d2.N());
            }
            String f2 = aVar2.f("OkHttp-Sent-Millis");
            String f3 = aVar2.f("OkHttp-Received-Millis");
            aVar2.h("OkHttp-Sent-Millis");
            aVar2.h("OkHttp-Received-Millis");
            long j2 = 0;
            this.f9107i = f2 != null ? Long.parseLong(f2) : 0;
            this.f9108j = f3 != null ? Long.parseLong(f3) : j2;
            this.f9105g = aVar2.e();
            g0 g0Var = null;
            if (b()) {
                String N = d2.N();
                if (N.length() <= 0) {
                    this.f9106h = t.b(!d2.Q() ? g0.a(d2.N()) : g0Var, i.c(d2.N()), c(d2), c(d2));
                } else {
                    throw new IOException("expected \"\" but was \"" + N + "\"");
                }
            } else {
                this.f9106h = null;
            }
        } finally {
            b0Var.close();
        }
    }

    private void a(u.a aVar, String str) {
        int indexOf = str.indexOf(":", 1);
        if (indexOf != -1) {
            aVar.a(str.substring(0, indexOf), str.substring(indexOf + 1));
        } else if (str.startsWith(":")) {
            aVar.a("", str.substring(1));
        } else {
            aVar.a("", str);
        }
    }

    private boolean b() {
        return this.a.startsWith("https://");
    }

    private List<Certificate> c(h hVar) {
        int d2 = d(hVar);
        if (d2 == -1) {
            return Collections.emptyList();
        }
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(d2);
            for (int i2 = 0; i2 < d2; i2++) {
                String N = hVar.N();
                f fVar = new f();
                fVar.X0(l.i.h(N));
                arrayList.add(instance.generateCertificate(fVar.D0()));
            }
            return arrayList;
        } catch (CertificateException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    private static int d(h hVar) {
        try {
            long e0 = hVar.e0();
            String N = hVar.N();
            if (e0 >= 0 && e0 <= 2147483647L && N.isEmpty()) {
                return (int) e0;
            }
            throw new IOException("expected an int but was \"" + e0 + N + "\"");
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    private void f(g gVar, List<Certificate> list) {
        try {
            gVar.v0((long) list.size()).R(10);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                gVar.u0(l.i.y(list.get(i2).getEncoded()).a()).R(10);
            }
        } catch (CertificateEncodingException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public d0 e() {
        c0 d2 = k.h0.f.f.b(this.c) ? c0.d(x.g("application/json; charset=utf-8"), "") : null;
        b0.a aVar = new b0.a();
        aVar.l(this.a);
        aVar.g(this.c, d2);
        aVar.f(this.b);
        k.b0 b2 = aVar.b();
        d0.a aVar2 = new d0.a();
        aVar2.r(b2);
        aVar2.p(this.f9102d);
        aVar2.g(this.f9103e);
        aVar2.m(this.f9104f);
        aVar2.k(this.f9105g);
        aVar2.i(this.f9106h);
        aVar2.s(this.f9107i);
        aVar2.q(this.f9108j);
        return aVar2.c();
    }

    /* access modifiers changed from: package-private */
    public void g(z zVar) {
        g c2 = p.c(zVar);
        c2.u0(this.a).R(10);
        c2.u0(this.c).R(10);
        c2.v0((long) this.b.size()).R(10);
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            c2.u0(this.b.d(i2)).u0(": ").u0(this.b.j(i2)).R(10);
        }
        c2.u0(new g.a.a.i.b.j.e(this.f9102d, this.f9103e, this.f9104f).toString()).R(10);
        c2.v0((long) (this.f9105g.size() + 2)).R(10);
        int size2 = this.f9105g.size();
        for (int i3 = 0; i3 < size2; i3++) {
            c2.u0(this.f9105g.d(i3)).u0(": ").u0(this.f9105g.j(i3)).R(10);
        }
        c2.u0("OkHttp-Sent-Millis").u0(": ").v0(this.f9107i).R(10);
        c2.u0("OkHttp-Received-Millis").u0(": ").v0(this.f9108j).R(10);
        if (b()) {
            c2.R(10);
            c2.u0(this.f9106h.a().d()).R(10);
            f(c2, this.f9106h.e());
            f(c2, this.f9106h.d());
            if (this.f9106h.f() != null) {
                c2.u0(this.f9106h.f().f()).R(10);
            }
        }
        c2.close();
    }

    e(d0 d0Var) {
        this.a = d0Var.Z().k().toString();
        this.b = i.q(d0Var);
        this.c = d0Var.Z().h();
        this.f9102d = d0Var.M();
        this.f9103e = d0Var.j();
        this.f9104f = d0Var.D();
        this.f9105g = d0Var.y();
        this.f9106h = d0Var.l();
        this.f9107i = d0Var.b0();
        this.f9108j = d0Var.U();
    }
}

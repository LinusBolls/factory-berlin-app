package g.a.a.i.b;

import g.a.a.h.s.c;
import g.a.a.h.s.q;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import k.d0;
import k.e0;
import k.x;
import l.b0;
import l.c0;
import l.f;
import l.g;
import l.h;
import l.p;

/* compiled from: ResponseBodyProxy */
final class d extends e0 {

    /* renamed from: i  reason: collision with root package name */
    private final String f9092i;

    /* renamed from: j  reason: collision with root package name */
    private final String f9093j;

    /* renamed from: k  reason: collision with root package name */
    private final h f9094k;

    /* compiled from: ResponseBodyProxy */
    private static class a implements b0 {

        /* renamed from: g  reason: collision with root package name */
        private final g.a.a.h.r.a.d f9095g;

        /* renamed from: h  reason: collision with root package name */
        private final c f9096h;

        /* renamed from: i  reason: collision with root package name */
        private final h f9097i;

        /* renamed from: j  reason: collision with root package name */
        private final c f9098j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f9099k;

        /* renamed from: g.a.a.i.b.d$a$a  reason: collision with other inner class name */
        /* compiled from: ResponseBodyProxy */
        class C0605a extends c {

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ c f9100i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0605a(g gVar, c cVar) {
                super(gVar);
                this.f9100i = cVar;
            }

            /* access modifiers changed from: package-private */
            public void h(Exception exc) {
                a.this.a();
                this.f9100i.g(exc, "Operation failed", new Object[0]);
            }
        }

        a(g.a.a.h.r.a.d dVar, h hVar, c cVar) {
            this.f9095g = dVar;
            this.f9097i = hVar;
            this.f9098j = cVar;
            this.f9096h = new C0605a(p.c(dVar.c()), cVar);
        }

        private void b() {
            i.a(this.f9097i);
            try {
                this.f9096h.close();
                this.f9095g.commit();
            } catch (Exception e2) {
                i.a(this.f9096h);
                a();
                this.f9098j.d(e2, "Failed to commit cache changes", new Object[0]);
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            i.a(this.f9097i);
            i.a(this.f9096h);
            try {
                this.f9095g.a();
            } catch (Exception e2) {
                this.f9098j.g(e2, "Failed to abort cache edit", new Object[0]);
            }
        }

        public void close() {
            if (!this.f9099k) {
                this.f9099k = true;
                if (i.c(this, 100, TimeUnit.MILLISECONDS)) {
                    b();
                } else {
                    a();
                }
            }
        }

        public c0 e() {
            return this.f9097i.e();
        }

        public long g0(f fVar, long j2) {
            try {
                long g0 = this.f9097i.g0(fVar, j2);
                if (g0 == -1) {
                    if (!this.f9099k) {
                        this.f9099k = true;
                        b();
                    }
                    return -1;
                }
                this.f9096h.b(fVar, fVar.T0() - g0, g0);
                return g0;
            } catch (IOException e2) {
                if (!this.f9099k) {
                    this.f9099k = true;
                    a();
                }
                throw e2;
            }
        }
    }

    d(g.a.a.h.r.a.d dVar, d0 d0Var, c cVar) {
        q.b(dVar, "cacheRecordEditor == null");
        q.b(d0Var, "sourceResponse == null");
        q.b(cVar, "logger == null");
        this.f9092i = d0Var.n("Content-Type");
        this.f9093j = d0Var.n("Content-Length");
        this.f9094k = p.d(new a(dVar, d0Var.a().n(), cVar));
    }

    public long i() {
        try {
            if (this.f9093j != null) {
                return Long.parseLong(this.f9093j);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public x j() {
        String str = this.f9092i;
        if (str != null) {
            return x.g(str);
        }
        return null;
    }

    public h n() {
        return this.f9094k;
    }
}

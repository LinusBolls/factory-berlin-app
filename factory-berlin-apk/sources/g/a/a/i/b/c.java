package g.a.a.i.b;

import l.f;
import l.g;
import l.j;

/* compiled from: ResponseBodyCacheSink */
abstract class c extends j {

    /* renamed from: h  reason: collision with root package name */
    private boolean f9091h;

    c(g gVar) {
        super(gVar);
    }

    /* access modifiers changed from: package-private */
    public void b(f fVar, long j2, long j3) {
        if (!this.f9091h) {
            try {
                g gVar = (g) a();
                fVar.F(gVar.v(), j2, j3);
                gVar.d0();
            } catch (Exception e2) {
                this.f9091h = true;
                h(e2);
            }
        }
    }

    public void close() {
        if (!this.f9091h) {
            try {
                super.close();
            } catch (Exception e2) {
                this.f9091h = true;
                h(e2);
            }
        }
    }

    public void flush() {
        if (!this.f9091h) {
            try {
                super.flush();
            } catch (Exception e2) {
                this.f9091h = true;
                h(e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void h(Exception exc);

    public void p(f fVar, long j2) {
        if (!this.f9091h) {
            try {
                super.p(fVar, j2);
            } catch (Exception e2) {
                this.f9091h = true;
                h(e2);
            }
        }
    }
}

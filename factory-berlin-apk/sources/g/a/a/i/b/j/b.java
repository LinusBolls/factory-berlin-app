package g.a.a.i.b.j;

import java.io.IOException;
import l.f;
import l.j;
import l.z;

/* compiled from: FaultHidingSink */
class b extends j {

    /* renamed from: h  reason: collision with root package name */
    private boolean f9132h;

    b(z zVar) {
        super(zVar);
    }

    /* access modifiers changed from: protected */
    public abstract void b(IOException iOException);

    public void close() {
        if (!this.f9132h) {
            try {
                super.close();
            } catch (IOException e2) {
                this.f9132h = true;
                b(e2);
            }
        }
    }

    public void flush() {
        if (!this.f9132h) {
            try {
                super.flush();
            } catch (IOException e2) {
                this.f9132h = true;
                b(e2);
            }
        }
    }

    public void p(f fVar, long j2) {
        if (this.f9132h) {
            fVar.x(j2);
            return;
        }
        try {
            super.p(fVar, j2);
        } catch (IOException e2) {
            this.f9132h = true;
            b(e2);
        }
    }
}

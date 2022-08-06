package k.h0.d;

import java.io.IOException;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;
import l.f;
import l.j;
import l.z;

/* compiled from: FaultHidingSink.kt */
public class e extends j {

    /* renamed from: h  reason: collision with root package name */
    private boolean f10405h;

    /* renamed from: i  reason: collision with root package name */
    private final l<IOException, x> f10406i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(z zVar, l<? super IOException, x> lVar) {
        super(zVar);
        k.f(zVar, "delegate");
        k.f(lVar, "onException");
        this.f10406i = lVar;
    }

    public void close() {
        if (!this.f10405h) {
            try {
                super.close();
            } catch (IOException e2) {
                this.f10405h = true;
                this.f10406i.o(e2);
            }
        }
    }

    public void flush() {
        if (!this.f10405h) {
            try {
                super.flush();
            } catch (IOException e2) {
                this.f10405h = true;
                this.f10406i.o(e2);
            }
        }
    }

    public void p(f fVar, long j2) {
        k.f(fVar, "source");
        if (this.f10405h) {
            fVar.x(j2);
            return;
        }
        try {
            super.p(fVar, j2);
        } catch (IOException e2) {
            this.f10405h = true;
            this.f10406i.o(e2);
        }
    }
}

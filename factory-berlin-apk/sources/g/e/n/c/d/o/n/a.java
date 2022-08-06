package g.e.n.c.d.o.n;

import g.e.i.b;
import kotlin.jvm.internal.k;
import no.nordicsemi.android.support.v18.scanner.m;

/* compiled from: AbstractMotionlessAverageMapper.kt */
public abstract class a implements b {
    /* access modifiers changed from: protected */
    public final float b(b bVar, m mVar) {
        k.e(bVar, "motionlessAverage");
        k.e(mVar, "scanResult");
        return bVar.a((float) mVar.b());
    }

    /* access modifiers changed from: protected */
    public final b c(float f2, float f3, long j2, long j3) {
        b a = b.a.a(f2, f3, j2, j3);
        k.d(a, "MotionlessAverage\n\t\t\t\t.B…er, minTimeMs, maxTimeMs)");
        return a;
    }
}

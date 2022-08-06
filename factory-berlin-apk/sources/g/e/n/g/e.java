package g.e.n.g;

import com.sensorberg.smartspaces.sdk.exception.CanceledException;
import java.util.ArrayList;
import java.util.List;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;
import kotlin.x;
import n.a.a;

/* compiled from: CancellationSignal.kt */
public final class e {
    private final List<l<Exception, x>> a = new ArrayList();

    public static /* synthetic */ void c(e eVar, Exception exc, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            exc = new CanceledException();
        }
        eVar.b(exc);
    }

    public final void a(l<? super Exception, x> lVar) {
        k.e(lVar, "listener");
        synchronized (this.a) {
            if (!this.a.contains(lVar)) {
                this.a.add(lVar);
                x xVar = x.a;
            }
        }
    }

    public final void b(Exception exc) {
        List<T> R;
        k.e(exc, "exception");
        a.m(exc, "CancellationSignal.cancel() invoked", new Object[0]);
        synchronized (this.a) {
            R = v.R(this.a);
            x xVar = x.a;
        }
        for (T o : R) {
            o.o(exc);
        }
    }

    public final void d(l<? super Exception, x> lVar) {
        k.e(lVar, "listener");
        synchronized (this.a) {
            this.a.remove(lVar);
        }
    }
}

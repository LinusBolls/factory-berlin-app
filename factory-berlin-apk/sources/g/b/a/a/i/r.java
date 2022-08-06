package g.b.a.a.i;

import android.content.Context;
import g.b.a.a.i.v.j.c;
import java.io.Closeable;

/* compiled from: TransportRuntimeComponent */
abstract class r implements Closeable {

    /* compiled from: TransportRuntimeComponent */
    interface a {
        r k();

        a l(Context context);
    }

    r() {
    }

    /* access modifiers changed from: package-private */
    public abstract c a();

    /* access modifiers changed from: package-private */
    public abstract q b();

    public void close() {
        a().close();
    }
}

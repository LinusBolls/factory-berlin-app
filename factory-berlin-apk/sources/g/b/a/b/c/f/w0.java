package g.b.a.b.c.f;

import com.google.android.gms.common.util.k;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class w0 {
    private final ExecutorService a = Executors.newSingleThreadExecutor();
    private volatile InputStream b = null;

    /* access modifiers changed from: package-private */
    public final void a() {
        this.a.shutdownNow();
        k.a(this.b);
    }
}

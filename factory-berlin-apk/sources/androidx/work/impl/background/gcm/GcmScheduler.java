package androidx.work.impl.background.gcm;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.i;
import androidx.work.impl.d;
import androidx.work.impl.l.j;
import com.google.android.gms.common.e;
import com.google.android.gms.gcm.OneoffTask;
import com.google.android.gms.gcm.a;

@Keep
public class GcmScheduler implements d {
    private static final String TAG = i.f("GcmScheduler");
    private final a mNetworkManager;
    private final a mTaskConverter;

    public GcmScheduler(Context context) {
        if (e.n().g(context) == 0) {
            this.mNetworkManager = a.b(context);
            this.mTaskConverter = new a();
            return;
        }
        throw new IllegalStateException("Google Play Services not available");
    }

    public void cancel(String str) {
        i.c().a(TAG, String.format("Cancelling %s", new Object[]{str}), new Throwable[0]);
        this.mNetworkManager.a(str, WorkManagerGcmService.class);
    }

    public void schedule(j... jVarArr) {
        for (j jVar : jVarArr) {
            OneoffTask b = this.mTaskConverter.b(jVar);
            i.c().a(TAG, String.format("Scheduling %s with %s", new Object[]{jVar, b}), new Throwable[0]);
            this.mNetworkManager.c(b);
        }
    }
}

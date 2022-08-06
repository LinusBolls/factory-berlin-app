package androidx.work;

import android.content.Context;
import androidx.work.impl.h;
import java.util.Collections;
import java.util.List;

/* compiled from: WorkManager */
public abstract class q {
    protected q() {
    }

    @Deprecated
    public static q j() {
        h p = h.p();
        if (p != null) {
            return p;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    public static void k(Context context, b bVar) {
        h.k(context, bVar);
    }

    public final o a(String str, g gVar, k kVar) {
        return b(str, gVar, Collections.singletonList(kVar));
    }

    public abstract o b(String str, g gVar, List<k> list);

    public abstract l c(String str);

    public abstract l d(String str);

    public final l e(r rVar) {
        return f(Collections.singletonList(rVar));
    }

    public abstract l f(List<? extends r> list);

    public abstract l g(String str, f fVar, m mVar);

    public l h(String str, g gVar, k kVar) {
        return i(str, gVar, Collections.singletonList(kVar));
    }

    public abstract l i(String str, g gVar, List<k> list);
}

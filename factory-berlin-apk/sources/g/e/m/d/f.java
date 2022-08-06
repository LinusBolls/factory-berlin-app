package g.e.m.d;

import androidx.lifecycle.LiveData;
import g.e.m.a;
import kotlin.jvm.internal.k;

/* compiled from: RxObserver.kt */
public final class f {
    public static final <T, P> e<T, P> a(LiveData<a<T, P>> liveData, LiveData<Boolean> liveData2) {
        k.e(liveData, "$this$observeResult");
        e<T, P> eVar = new e<>(liveData2, liveData);
        liveData.p(eVar);
        return eVar;
    }

    public static /* synthetic */ e b(LiveData liveData, LiveData liveData2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            liveData2 = null;
        }
        return a(liveData, liveData2);
    }
}

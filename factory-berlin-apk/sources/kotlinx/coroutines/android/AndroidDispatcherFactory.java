package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlin.i;
import kotlinx.coroutines.internal.MainDispatcherFactory;

@i(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\n8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "", "allFactories", "Lkotlinx/coroutines/android/HandlerContext;", "createDispatcher", "(Ljava/util/List;)Lkotlinx/coroutines/android/HandlerContext;", "", "hintOnError", "()Ljava/lang/String;", "", "getLoadPriority", "()I", "loadPriority", "<init>", "()V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: HandlerDispatcher.kt */
public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public int c() {
        return 1073741823;
    }

    /* renamed from: d */
    public a b(List<? extends MainDispatcherFactory> list) {
        return new a(c.a(Looper.getMainLooper(), true), "Main");
    }
}

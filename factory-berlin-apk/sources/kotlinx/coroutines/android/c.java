package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import kotlin.TypeCastException;
import kotlin.k;
import kotlin.l;

/* compiled from: HandlerDispatcher.kt */
public final class c {
    static {
        Object obj;
        try {
            k.a aVar = k.f10687h;
            obj = new a(a(Looper.getMainLooper(), true), "Main");
            k.a(obj);
        } catch (Throwable th) {
            k.a aVar2 = k.f10687h;
            obj = l.a(th);
            k.a(obj);
        }
        if (k.e(obj)) {
            obj = null;
        }
        b bVar = (b) obj;
    }

    public static final Handler a(Looper looper, boolean z) {
        int i2;
        if (!z || (i2 = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i2 >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.os.Handler");
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}

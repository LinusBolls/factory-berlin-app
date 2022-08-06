package kotlinx.coroutines.g3;

import kotlinx.coroutines.d0;
import kotlinx.coroutines.internal.y;

/* compiled from: Dispatcher.kt */
public final class c extends d {

    /* renamed from: m  reason: collision with root package name */
    private static final d0 f10966m;

    /* renamed from: n  reason: collision with root package name */
    public static final c f10967n;

    static {
        c cVar = new c();
        f10967n = cVar;
        f10966m = cVar.t0(a0.d("kotlinx.coroutines.io.parallelism", f.b(64, y.a()), 0, 0, 12, (Object) null));
    }

    private c() {
        super(0, 0, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public final d0 G0() {
        return f10966m;
    }

    public void close() {
        throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }

    public String toString() {
        return "DefaultDispatcher";
    }
}

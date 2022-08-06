package kotlinx.coroutines.g3;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.y;

/* compiled from: Tasks.kt */
public final class l {
    public static final long a = a0.e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);
    public static final int b = a0.d("kotlinx.coroutines.scheduler.core.pool.size", f.b(y.a(), 2), 1, 0, 8, (Object) null);
    public static final int c = a0.d("kotlinx.coroutines.scheduler.max.pool.size", f.f(y.a() * 128, b, 2097150), 0, 2097150, 4, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public static final long f10983d = TimeUnit.SECONDS.toNanos(a0.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e  reason: collision with root package name */
    public static m f10984e = g.a;

    static {
        int unused = a0.d("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);
    }
}

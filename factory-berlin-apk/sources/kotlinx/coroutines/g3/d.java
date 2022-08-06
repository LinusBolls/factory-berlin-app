package kotlinx.coroutines.g3;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.c0.g;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.p0;

/* compiled from: Dispatcher.kt */
public class d extends m1 {

    /* renamed from: h  reason: collision with root package name */
    private a f10968h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10969i;

    /* renamed from: j  reason: collision with root package name */
    private final int f10970j;

    /* renamed from: k  reason: collision with root package name */
    private final long f10971k;

    /* renamed from: l  reason: collision with root package name */
    private final String f10972l;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, int i3, long j2, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, j2, (i4 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    private final a w0() {
        return new a(this.f10969i, this.f10970j, this.f10971k, this.f10972l);
    }

    public final void F0(Runnable runnable, j jVar, boolean z) {
        try {
            this.f10968h.k(runnable, jVar, z);
        } catch (RejectedExecutionException unused) {
            p0.f11050n.S0(this.f10968h.i(runnable, jVar));
        }
    }

    public void close() {
        this.f10968h.close();
    }

    public void i0(g gVar, Runnable runnable) {
        try {
            a.l(this.f10968h, runnable, (j) null, false, 6, (Object) null);
        } catch (RejectedExecutionException unused) {
            p0.f11050n.i0(gVar, runnable);
        }
    }

    public void l0(g gVar, Runnable runnable) {
        try {
            a.l(this.f10968h, runnable, (j) null, true, 2, (Object) null);
        } catch (RejectedExecutionException unused) {
            p0.f11050n.l0(gVar, runnable);
        }
    }

    public Executor r0() {
        return this.f10968h;
    }

    public final d0 t0(int i2) {
        if (i2 > 0) {
            return new f(this, i2, 1);
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i2).toString());
    }

    public String toString() {
        return super.toString() + "[scheduler = " + this.f10968h + ']';
    }

    public d(int i2, int i3, long j2, String str) {
        this.f10969i = i2;
        this.f10970j = i3;
        this.f10971k = j2;
        this.f10972l = str;
        this.f10968h = w0();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, int i3, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? l.b : i2, (i4 & 2) != 0 ? l.c : i3, (i4 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    public d(int i2, int i3, String str) {
        this(i2, i3, l.f10983d, str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? l.b : i2, (i4 & 2) != 0 ? l.c : i3);
    }

    public /* synthetic */ d(int i2, int i3) {
        this(i2, i3, l.f10983d, (String) null, 8, (DefaultConstructorMarker) null);
    }
}

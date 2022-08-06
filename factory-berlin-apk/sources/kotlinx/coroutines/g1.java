package kotlinx.coroutines;

import kotlinx.coroutines.internal.a;

/* compiled from: EventLoop.common.kt */
public abstract class g1 extends d0 {

    /* renamed from: h  reason: collision with root package name */
    private long f10940h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10941i;

    /* renamed from: j  reason: collision with root package name */
    private a<x0<?>> f10942j;

    public static /* synthetic */ void H0(g1 g1Var, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z = false;
            }
            g1Var.G0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    private final long t0(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* access modifiers changed from: protected */
    public long F0() {
        a<x0<?>> aVar = this.f10942j;
        if (aVar == null || aVar.c()) {
            return Long.MAX_VALUE;
        }
        return 0;
    }

    public final void G0(boolean z) {
        this.f10940h += t0(z);
        if (!z) {
            this.f10941i = true;
        }
    }

    public final boolean I0() {
        return this.f10940h >= t0(true);
    }

    public final boolean J0() {
        a<x0<?>> aVar = this.f10942j;
        if (aVar != null) {
            return aVar.c();
        }
        return true;
    }

    public final boolean K0() {
        x0 d2;
        a<x0<?>> aVar = this.f10942j;
        if (aVar == null || (d2 = aVar.d()) == null) {
            return false;
        }
        d2.run();
        return true;
    }

    /* access modifiers changed from: protected */
    public void L0() {
    }

    public final void r0(boolean z) {
        long t0 = this.f10940h - t0(z);
        this.f10940h = t0;
        if (t0 <= 0) {
            if (n0.a()) {
                if (!(this.f10940h == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.f10941i) {
                L0();
            }
        }
    }

    public final void w0(x0<?> x0Var) {
        a<x0<?>> aVar = this.f10942j;
        if (aVar == null) {
            aVar = new a<>();
            this.f10942j = aVar;
        }
        aVar.a(x0Var);
    }
}

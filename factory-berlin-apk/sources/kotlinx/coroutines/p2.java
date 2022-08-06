package kotlinx.coroutines;

import kotlin.x;

/* compiled from: Executors.kt */
final class p2 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final d0 f11051g;

    /* renamed from: h  reason: collision with root package name */
    private final i<x> f11052h;

    public p2(d0 d0Var, i<? super x> iVar) {
        this.f11051g = d0Var;
        this.f11052h = iVar;
    }

    public void run() {
        this.f11052h.f(this.f11051g, x.a);
    }
}

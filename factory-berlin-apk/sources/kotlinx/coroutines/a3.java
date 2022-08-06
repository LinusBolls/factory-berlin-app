package kotlinx.coroutines;

import kotlin.c0.g;

/* compiled from: Unconfined.kt */
public final class a3 extends d0 {

    /* renamed from: h  reason: collision with root package name */
    public static final a3 f10714h = new a3();

    private a3() {
    }

    public void i0(g gVar, Runnable runnable) {
        c3 c3Var = (c3) gVar.get(c3.f10728h);
        if (c3Var != null) {
            c3Var.f10729g = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public boolean n0(g gVar) {
        return false;
    }

    public String toString() {
        return "Unconfined";
    }
}

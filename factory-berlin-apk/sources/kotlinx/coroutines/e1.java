package kotlinx.coroutines;

import kotlin.x;

/* compiled from: JobSupport.kt */
public final class e1 extends d2<x1> {

    /* renamed from: k  reason: collision with root package name */
    private final c1 f10764k;

    public e1(x1 x1Var, c1 c1Var) {
        super(x1Var);
        this.f10764k = c1Var;
    }

    public void Z(Throwable th) {
        this.f10764k.a();
    }

    public /* bridge */ /* synthetic */ Object o(Object obj) {
        Z((Throwable) obj);
        return x.a;
    }

    public String toString() {
        return "DisposeOnCompletion[" + this.f10764k + ']';
    }
}

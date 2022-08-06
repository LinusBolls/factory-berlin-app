package kotlinx.coroutines;

import kotlin.e0.c.l;
import kotlin.x;

/* compiled from: JobSupport.kt */
final class w1 extends d2<x1> {

    /* renamed from: k  reason: collision with root package name */
    private final l<Throwable, x> f11074k;

    public w1(x1 x1Var, l<? super Throwable, x> lVar) {
        super(x1Var);
        this.f11074k = lVar;
    }

    public void Z(Throwable th) {
        this.f11074k.o(th);
    }

    public /* bridge */ /* synthetic */ Object o(Object obj) {
        Z((Throwable) obj);
        return x.a;
    }

    public String toString() {
        return "InvokeOnCompletion[" + o0.a(this) + '@' + o0.b(this) + ']';
    }
}

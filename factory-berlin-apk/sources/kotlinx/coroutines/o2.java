package kotlinx.coroutines;

import kotlin.c0.d;
import kotlin.k;
import kotlin.x;

/* compiled from: JobSupport.kt */
final class o2 extends d2<x1> {

    /* renamed from: k  reason: collision with root package name */
    private final d<x> f11047k;

    public o2(x1 x1Var, d<? super x> dVar) {
        super(x1Var);
        this.f11047k = dVar;
    }

    public void Z(Throwable th) {
        d<x> dVar = this.f11047k;
        x xVar = x.a;
        k.a aVar = k.f10687h;
        k.a(xVar);
        dVar.m(xVar);
    }

    public /* bridge */ /* synthetic */ Object o(Object obj) {
        Z((Throwable) obj);
        return x.a;
    }

    public String toString() {
        return "ResumeOnCompletion[" + this.f11047k + ']';
    }
}

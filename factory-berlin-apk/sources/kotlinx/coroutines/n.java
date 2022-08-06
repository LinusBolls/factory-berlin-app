package kotlinx.coroutines;

import kotlin.x;

/* compiled from: JobSupport.kt */
public final class n extends y1<x1> {

    /* renamed from: k  reason: collision with root package name */
    public final j<?> f11042k;

    public n(x1 x1Var, j<?> jVar) {
        super(x1Var);
        this.f11042k = jVar;
    }

    public void Z(Throwable th) {
        j<?> jVar = this.f11042k;
        jVar.F(jVar.s(this.f10763j));
    }

    public /* bridge */ /* synthetic */ Object o(Object obj) {
        Z((Throwable) obj);
        return x.a;
    }

    public String toString() {
        return "ChildContinuation[" + this.f11042k + ']';
    }
}

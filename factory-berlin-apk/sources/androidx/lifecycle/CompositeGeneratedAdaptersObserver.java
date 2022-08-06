package androidx.lifecycle;

import androidx.lifecycle.p;

class CompositeGeneratedAdaptersObserver implements t {

    /* renamed from: g  reason: collision with root package name */
    private final n[] f923g;

    CompositeGeneratedAdaptersObserver(n[] nVarArr) {
        this.f923g = nVarArr;
    }

    public void d(v vVar, p.a aVar) {
        d0 d0Var = new d0();
        for (n a : this.f923g) {
            a.a(vVar, aVar, false, d0Var);
        }
        for (n a2 : this.f923g) {
            a2.a(vVar, aVar, true, d0Var);
        }
    }
}

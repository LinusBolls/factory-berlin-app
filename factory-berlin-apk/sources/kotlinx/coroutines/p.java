package kotlinx.coroutines;

import kotlin.x;

/* compiled from: JobSupport.kt */
public final class p extends y1<e2> implements o {

    /* renamed from: k  reason: collision with root package name */
    public final q f11048k;

    public p(e2 e2Var, q qVar) {
        super(e2Var);
        this.f11048k = qVar;
    }

    public void Z(Throwable th) {
        this.f11048k.M((l2) this.f10763j);
    }

    public /* bridge */ /* synthetic */ Object o(Object obj) {
        Z((Throwable) obj);
        return x.a;
    }

    public String toString() {
        return "ChildHandle[" + this.f11048k + ']';
    }

    public boolean v(Throwable th) {
        return ((e2) this.f10763j).R(th);
    }
}

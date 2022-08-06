package kotlin.c0.j.a;

import kotlin.c0.d;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.v;

/* compiled from: ContinuationImpl.kt */
public abstract class k extends d implements g<Object> {

    /* renamed from: j  reason: collision with root package name */
    private final int f10613j;

    public k(int i2, d<Object> dVar) {
        super(dVar);
        this.f10613j = i2;
    }

    public int h() {
        return this.f10613j;
    }

    public String toString() {
        if (g() != null) {
            return super.toString();
        }
        String e2 = v.e(this);
        kotlin.jvm.internal.k.d(e2, "Reflection.renderLambdaToString(this)");
        return e2;
    }
}

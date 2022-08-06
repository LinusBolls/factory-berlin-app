package kotlinx.coroutines;

import kotlin.TypeCastException;
import kotlinx.coroutines.x1;

/* compiled from: JobSupport.kt */
public abstract class d2<J extends x1> extends a0 implements c1, s1 {

    /* renamed from: j  reason: collision with root package name */
    public final J f10763j;

    public d2(J j2) {
        this.f10763j = j2;
    }

    public void a() {
        J j2 = this.f10763j;
        if (j2 != null) {
            ((e2) j2).C0(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
    }

    public boolean b() {
        return true;
    }

    public i2 y() {
        return null;
    }
}

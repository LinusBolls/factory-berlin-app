package kotlinx.coroutines;

import kotlin.TypeCastException;
import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.m;

/* compiled from: JobSupport.kt */
public final class i2 extends k implements s1 {
    public final String Z(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object P = P();
        if (P != null) {
            boolean z = true;
            for (m mVar = (m) P; !kotlin.jvm.internal.k.a(mVar, this); mVar = mVar.Q()) {
                if (mVar instanceof d2) {
                    d2 d2Var = (d2) mVar;
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(d2Var);
                }
            }
            sb.append("]");
            String sb2 = sb.toString();
            kotlin.jvm.internal.k.b(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    public boolean b() {
        return true;
    }

    public String toString() {
        return n0.c() ? Z("Active") : super.toString();
    }

    public i2 y() {
        return this;
    }
}

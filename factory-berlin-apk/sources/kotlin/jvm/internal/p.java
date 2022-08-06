package kotlin.jvm.internal;

import kotlin.h0.a;
import kotlin.h0.f;

/* compiled from: PropertyReference */
public abstract class p extends c implements f {
    public p() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (!g().equals(pVar.g()) || !f().equals(pVar.f()) || !j().equals(pVar.j()) || !k.a(e(), pVar.e())) {
                return false;
            }
            return true;
        } else if (obj instanceof f) {
            return obj.equals(b());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((g().hashCode() * 31) + f().hashCode()) * 31) + j().hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public f i() {
        return (f) super.i();
    }

    public String toString() {
        a b = b();
        if (b != this) {
            return b.toString();
        }
        return "property " + f() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
    }
}

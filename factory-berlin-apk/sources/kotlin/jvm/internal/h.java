package kotlin.jvm.internal;

import kotlin.h0.a;
import kotlin.h0.d;

/* compiled from: FunctionReference */
public class h extends c implements g, d {

    /* renamed from: n  reason: collision with root package name */
    private final int f10680n;
    private final int o;

    public h(int i2) {
        this(i2, c.f10669m, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public a c() {
        v.a(this);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (!k.a(g(), hVar.g()) || !f().equals(hVar.f()) || !j().equals(hVar.j()) || this.o != hVar.o || this.f10680n != hVar.f10680n || !k.a(e(), hVar.e())) {
                return false;
            }
            return true;
        } else if (obj instanceof d) {
            return obj.equals(b());
        } else {
            return false;
        }
    }

    public int h() {
        return this.f10680n;
    }

    public int hashCode() {
        return (((g() == null ? 0 : g().hashCode() * 31) + f().hashCode()) * 31) + j().hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public d i() {
        return (d) super.i();
    }

    public String toString() {
        a b = b();
        if (b != this) {
            return b.toString();
        }
        if ("<init>".equals(f())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + f() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f10680n = i2;
        this.o = i3 >> 1;
    }
}

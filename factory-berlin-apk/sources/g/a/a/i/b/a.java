package g.a.a.i.b;

import k.e0;
import k.x;
import l.b0;
import l.h;
import l.p;

/* compiled from: CacheResponseBody */
final class a extends e0 {

    /* renamed from: i  reason: collision with root package name */
    private h f9086i;

    /* renamed from: j  reason: collision with root package name */
    private final String f9087j;

    /* renamed from: k  reason: collision with root package name */
    private final String f9088k;

    a(b0 b0Var, String str, String str2) {
        this.f9086i = p.d(b0Var);
        this.f9087j = str;
        this.f9088k = str2;
    }

    public long i() {
        try {
            if (this.f9088k != null) {
                return Long.parseLong(this.f9088k);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public x j() {
        String str = this.f9087j;
        if (str != null) {
            return x.g(str);
        }
        return null;
    }

    public h n() {
        return this.f9086i;
    }
}

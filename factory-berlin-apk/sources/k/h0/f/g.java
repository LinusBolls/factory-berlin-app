package k.h0.f;

import java.util.List;
import k.b0;
import k.d0;
import k.j;
import k.w;
import kotlin.jvm.internal.k;
import okhttp3.internal.connection.c;
import okhttp3.internal.connection.e;

/* compiled from: RealInterceptorChain.kt */
public final class g implements w.a {
    private int a;
    private final e b;
    private final List<w> c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10420d;

    /* renamed from: e  reason: collision with root package name */
    private final c f10421e;

    /* renamed from: f  reason: collision with root package name */
    private final b0 f10422f;

    /* renamed from: g  reason: collision with root package name */
    private final int f10423g;

    /* renamed from: h  reason: collision with root package name */
    private final int f10424h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10425i;

    public g(e eVar, List<? extends w> list, int i2, c cVar, b0 b0Var, int i3, int i4, int i5) {
        k.f(eVar, "call");
        k.f(list, "interceptors");
        k.f(b0Var, "request");
        this.b = eVar;
        this.c = list;
        this.f10420d = i2;
        this.f10421e = cVar;
        this.f10422f = b0Var;
        this.f10423g = i3;
        this.f10424h = i4;
        this.f10425i = i5;
    }

    public static /* synthetic */ g d(g gVar, int i2, c cVar, b0 b0Var, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = gVar.f10420d;
        }
        if ((i6 & 2) != 0) {
            cVar = gVar.f10421e;
        }
        c cVar2 = cVar;
        if ((i6 & 4) != 0) {
            b0Var = gVar.f10422f;
        }
        b0 b0Var2 = b0Var;
        if ((i6 & 8) != 0) {
            i3 = gVar.f10423g;
        }
        int i7 = i3;
        if ((i6 & 16) != 0) {
            i4 = gVar.f10424h;
        }
        int i8 = i4;
        if ((i6 & 32) != 0) {
            i5 = gVar.f10425i;
        }
        return gVar.c(i2, cVar2, b0Var2, i7, i8, i5);
    }

    public d0 a(b0 b0Var) {
        k.f(b0Var, "request");
        boolean z = false;
        if (this.f10420d < this.c.size()) {
            this.a++;
            c cVar = this.f10421e;
            if (cVar != null) {
                if (cVar.j().g(b0Var.k())) {
                    if (!(this.a == 1)) {
                        throw new IllegalStateException(("network interceptor " + this.c.get(this.f10420d - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.c.get(this.f10420d - 1) + " must retain the same host and port").toString());
                }
            }
            g d2 = d(this, this.f10420d + 1, (c) null, b0Var, 0, 0, 0, 58, (Object) null);
            w wVar = this.c.get(this.f10420d);
            d0 a2 = wVar.a(d2);
            if (a2 != null) {
                if (this.f10421e != null) {
                    if (!(this.f10420d + 1 >= this.c.size() || d2.a == 1)) {
                        throw new IllegalStateException(("network interceptor " + wVar + " must call proceed() exactly once").toString());
                    }
                }
                if (a2.a() != null) {
                    z = true;
                }
                if (z) {
                    return a2;
                }
                throw new IllegalStateException(("interceptor " + wVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + wVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public j b() {
        c cVar = this.f10421e;
        if (cVar != null) {
            return cVar.h();
        }
        return null;
    }

    public final g c(int i2, c cVar, b0 b0Var, int i3, int i4, int i5) {
        k.f(b0Var, "request");
        return new g(this.b, this.c, i2, cVar, b0Var, i3, i4, i5);
    }

    public k.e call() {
        return this.b;
    }

    public final e e() {
        return this.b;
    }

    public final int f() {
        return this.f10423g;
    }

    public final c g() {
        return this.f10421e;
    }

    public final int h() {
        return this.f10424h;
    }

    public final b0 i() {
        return this.f10422f;
    }

    public b0 j() {
        return this.f10422f;
    }

    public final int k() {
        return this.f10425i;
    }

    public int l() {
        return this.f10424h;
    }
}

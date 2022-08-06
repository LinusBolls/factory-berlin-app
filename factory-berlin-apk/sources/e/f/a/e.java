package e.f.a;

import e.f.a.i;
import e.f.a.j.e;
import e.f.a.j.f;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: LinearSystem */
public class e {
    private static int p = 1000;
    public static f q;
    int a;
    private HashMap<String, i> b;
    private a c;

    /* renamed from: d  reason: collision with root package name */
    private int f8512d;

    /* renamed from: e  reason: collision with root package name */
    private int f8513e;

    /* renamed from: f  reason: collision with root package name */
    b[] f8514f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8515g;

    /* renamed from: h  reason: collision with root package name */
    private boolean[] f8516h;

    /* renamed from: i  reason: collision with root package name */
    int f8517i;

    /* renamed from: j  reason: collision with root package name */
    int f8518j;

    /* renamed from: k  reason: collision with root package name */
    private int f8519k;

    /* renamed from: l  reason: collision with root package name */
    final c f8520l;

    /* renamed from: m  reason: collision with root package name */
    private i[] f8521m;

    /* renamed from: n  reason: collision with root package name */
    private int f8522n;
    private final a o;

    /* compiled from: LinearSystem */
    interface a {
        void a(a aVar);

        void b(i iVar);

        i c(e eVar, boolean[] zArr);

        void clear();

        i getKey();
    }

    public e() {
        this.a = 0;
        this.b = null;
        this.f8512d = 32;
        this.f8513e = 32;
        this.f8514f = null;
        this.f8515g = false;
        this.f8516h = new boolean[32];
        this.f8517i = 1;
        this.f8518j = 0;
        this.f8519k = 32;
        this.f8521m = new i[p];
        this.f8522n = 0;
        this.f8514f = new b[32];
        D();
        c cVar = new c();
        this.f8520l = cVar;
        this.c = new d(cVar);
        this.o = new b(this.f8520l);
    }

    private final int C(a aVar, boolean z) {
        f fVar = q;
        if (fVar != null) {
            fVar.f8527h++;
        }
        for (int i2 = 0; i2 < this.f8517i; i2++) {
            this.f8516h[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            f fVar2 = q;
            if (fVar2 != null) {
                fVar2.f8528i++;
            }
            i3++;
            if (i3 >= this.f8517i * 2) {
                return i3;
            }
            if (aVar.getKey() != null) {
                this.f8516h[aVar.getKey().b] = true;
            }
            i c2 = aVar.c(this, this.f8516h);
            if (c2 != null) {
                boolean[] zArr = this.f8516h;
                int i4 = c2.b;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (c2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f8518j; i6++) {
                    b bVar = this.f8514f[i6];
                    if (bVar.a.f8538g != i.a.UNRESTRICTED && !bVar.f8511e && bVar.s(c2)) {
                        float f3 = bVar.f8510d.f(c2);
                        if (f3 < 0.0f) {
                            float f4 = (-bVar.b) / f3;
                            if (f4 < f2) {
                                i5 = i6;
                                f2 = f4;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    b bVar2 = this.f8514f[i5];
                    bVar2.a.c = -1;
                    f fVar3 = q;
                    if (fVar3 != null) {
                        fVar3.f8529j++;
                    }
                    bVar2.v(c2);
                    i iVar = bVar2.a;
                    iVar.c = i5;
                    iVar.f(bVar2);
                }
            }
            z2 = true;
        }
        return i3;
    }

    private void D() {
        int i2 = 0;
        while (true) {
            b[] bVarArr = this.f8514f;
            if (i2 < bVarArr.length) {
                b bVar = bVarArr[i2];
                if (bVar != null) {
                    this.f8520l.a.a(bVar);
                }
                this.f8514f[i2] = null;
                i2++;
            } else {
                return;
            }
        }
    }

    private final void F(b bVar) {
        if (this.f8518j > 0) {
            bVar.f8510d.o(bVar, this.f8514f);
            if (bVar.f8510d.a == 0) {
                bVar.f8511e = true;
            }
        }
    }

    private i a(i.a aVar, String str) {
        i b2 = this.f8520l.b.b();
        if (b2 == null) {
            b2 = new i(aVar, str);
            b2.e(aVar, str);
        } else {
            b2.d();
            b2.e(aVar, str);
        }
        int i2 = this.f8522n;
        int i3 = p;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            p = i4;
            this.f8521m = (i[]) Arrays.copyOf(this.f8521m, i4);
        }
        i[] iVarArr = this.f8521m;
        int i5 = this.f8522n;
        this.f8522n = i5 + 1;
        iVarArr[i5] = b2;
        return b2;
    }

    private void g(b bVar) {
        bVar.d(this, 0);
    }

    private final void m(b bVar) {
        b[] bVarArr = this.f8514f;
        int i2 = this.f8518j;
        if (bVarArr[i2] != null) {
            this.f8520l.a.a(bVarArr[i2]);
        }
        b[] bVarArr2 = this.f8514f;
        int i3 = this.f8518j;
        bVarArr2[i3] = bVar;
        i iVar = bVar.a;
        iVar.c = i3;
        this.f8518j = i3 + 1;
        iVar.f(bVar);
    }

    private void o() {
        for (int i2 = 0; i2 < this.f8518j; i2++) {
            b bVar = this.f8514f[i2];
            bVar.a.f8536e = bVar.b;
        }
    }

    public static b t(e eVar, i iVar, i iVar2, i iVar3, float f2, boolean z) {
        b s = eVar.s();
        if (z) {
            eVar.g(s);
        }
        s.i(iVar, iVar2, iVar3, f2);
        return s;
    }

    private int v(a aVar) {
        float f2;
        boolean z;
        int i2 = 0;
        while (true) {
            f2 = 0.0f;
            if (i2 >= this.f8518j) {
                z = false;
                break;
            }
            b[] bVarArr = this.f8514f;
            if (bVarArr[i2].a.f8538g != i.a.UNRESTRICTED && bVarArr[i2].b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            f fVar = q;
            if (fVar != null) {
                fVar.f8530k++;
            }
            i3++;
            float f3 = Float.MAX_VALUE;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            int i7 = 0;
            while (i4 < this.f8518j) {
                b bVar = this.f8514f[i4];
                if (bVar.a.f8538g != i.a.UNRESTRICTED && !bVar.f8511e && bVar.b < f2) {
                    int i8 = 1;
                    while (i8 < this.f8517i) {
                        i iVar = this.f8520l.c[i8];
                        float f4 = bVar.f8510d.f(iVar);
                        if (f4 > f2) {
                            for (int i9 = 0; i9 < 7; i9++) {
                                float f5 = iVar.f8537f[i9] / f4;
                                if ((f5 < f3 && i9 == i7) || i9 > i7) {
                                    i6 = i8;
                                    i7 = i9;
                                    f3 = f5;
                                    i5 = i4;
                                }
                            }
                        }
                        i8++;
                        f2 = 0.0f;
                    }
                }
                i4++;
                f2 = 0.0f;
            }
            if (i5 != -1) {
                b bVar2 = this.f8514f[i5];
                bVar2.a.c = -1;
                f fVar2 = q;
                if (fVar2 != null) {
                    fVar2.f8529j++;
                }
                bVar2.v(this.f8520l.c[i6]);
                i iVar2 = bVar2.a;
                iVar2.c = i5;
                iVar2.f(bVar2);
            } else {
                z2 = true;
            }
            if (i3 > this.f8517i / 2) {
                z2 = true;
            }
            f2 = 0.0f;
        }
        return i3;
    }

    public static f x() {
        return q;
    }

    private void z() {
        int i2 = this.f8512d * 2;
        this.f8512d = i2;
        this.f8514f = (b[]) Arrays.copyOf(this.f8514f, i2);
        c cVar = this.f8520l;
        cVar.c = (i[]) Arrays.copyOf(cVar.c, this.f8512d);
        int i3 = this.f8512d;
        this.f8516h = new boolean[i3];
        this.f8513e = i3;
        this.f8519k = i3;
        f fVar = q;
        if (fVar != null) {
            fVar.f8523d++;
            fVar.o = Math.max(fVar.o, (long) i3);
            f fVar2 = q;
            fVar2.A = fVar2.o;
        }
    }

    public void A() {
        f fVar = q;
        if (fVar != null) {
            fVar.f8524e++;
        }
        if (this.f8515g) {
            f fVar2 = q;
            if (fVar2 != null) {
                fVar2.q++;
            }
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f8518j) {
                    z = true;
                    break;
                } else if (!this.f8514f[i2].f8511e) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                B(this.c);
                return;
            }
            f fVar3 = q;
            if (fVar3 != null) {
                fVar3.p++;
            }
            o();
            return;
        }
        B(this.c);
    }

    /* access modifiers changed from: package-private */
    public void B(a aVar) {
        f fVar = q;
        if (fVar != null) {
            fVar.s++;
            fVar.t = Math.max(fVar.t, (long) this.f8517i);
            f fVar2 = q;
            fVar2.u = Math.max(fVar2.u, (long) this.f8518j);
        }
        F((b) aVar);
        v(aVar);
        C(aVar, false);
        o();
    }

    public void E() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.f8520l;
            i[] iVarArr = cVar.c;
            if (i2 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i2];
            if (iVar != null) {
                iVar.d();
            }
            i2++;
        }
        cVar.b.c(this.f8521m, this.f8522n);
        this.f8522n = 0;
        Arrays.fill(this.f8520l.c, (Object) null);
        HashMap<String, i> hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.a = 0;
        this.c.clear();
        this.f8517i = 1;
        for (int i3 = 0; i3 < this.f8518j; i3++) {
            this.f8514f[i3].c = false;
        }
        D();
        this.f8518j = 0;
    }

    public void b(f fVar, f fVar2, float f2, int i2) {
        f fVar3 = fVar;
        f fVar4 = fVar2;
        i r = r(fVar3.h(e.d.LEFT));
        i r2 = r(fVar3.h(e.d.TOP));
        i r3 = r(fVar3.h(e.d.RIGHT));
        i r4 = r(fVar3.h(e.d.BOTTOM));
        i r5 = r(fVar4.h(e.d.LEFT));
        i r6 = r(fVar4.h(e.d.TOP));
        i r7 = r(fVar4.h(e.d.RIGHT));
        i r8 = r(fVar4.h(e.d.BOTTOM));
        b s = s();
        double d2 = (double) f2;
        i iVar = r3;
        double d3 = (double) i2;
        s.p(r2, r4, r6, r8, (float) (Math.sin(d2) * d3));
        d(s);
        b s2 = s();
        s2.p(r, iVar, r5, r7, (float) (Math.cos(d2) * d3));
        d(s2);
    }

    public void c(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3, int i4) {
        int i5 = i4;
        b s = s();
        s.g(iVar, iVar2, i2, f2, iVar3, iVar4, i3);
        if (i5 != 6) {
            s.d(this, i5);
        }
        d(s);
    }

    public void d(b bVar) {
        i u;
        if (bVar != null) {
            f fVar = q;
            if (fVar != null) {
                fVar.f8525f++;
                if (bVar.f8511e) {
                    fVar.f8526g++;
                }
            }
            boolean z = true;
            if (this.f8518j + 1 >= this.f8519k || this.f8517i + 1 >= this.f8513e) {
                z();
            }
            boolean z2 = false;
            if (!bVar.f8511e) {
                F(bVar);
                if (!bVar.t()) {
                    bVar.q();
                    if (bVar.f(this)) {
                        i q2 = q();
                        bVar.a = q2;
                        m(bVar);
                        this.o.a(bVar);
                        C(this.o, true);
                        if (q2.c == -1) {
                            if (bVar.a == q2 && (u = bVar.u(q2)) != null) {
                                f fVar2 = q;
                                if (fVar2 != null) {
                                    fVar2.f8529j++;
                                }
                                bVar.v(u);
                            }
                            if (!bVar.f8511e) {
                                bVar.a.f(bVar);
                            }
                            this.f8518j--;
                        }
                    } else {
                        z = false;
                    }
                    if (bVar.r()) {
                        z2 = z;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z2) {
                m(bVar);
            }
        }
    }

    public b e(i iVar, i iVar2, int i2, int i3) {
        b s = s();
        s.m(iVar, iVar2, i2);
        if (i3 != 6) {
            s.d(this, i3);
        }
        d(s);
        return s;
    }

    public void f(i iVar, int i2) {
        int i3 = iVar.c;
        if (i3 != -1) {
            b bVar = this.f8514f[i3];
            if (bVar.f8511e) {
                bVar.b = (float) i2;
            } else if (bVar.f8510d.a == 0) {
                bVar.f8511e = true;
                bVar.b = (float) i2;
            } else {
                b s = s();
                s.l(iVar, i2);
                d(s);
            }
        } else {
            b s2 = s();
            s2.h(iVar, i2);
            d(s2);
        }
    }

    public void h(i iVar, i iVar2, boolean z) {
        b s = s();
        i u = u();
        u.f8535d = 0;
        s.n(iVar, iVar2, u, 0);
        if (z) {
            n(s, (int) (s.f8510d.f(u) * -1.0f), 1);
        }
        d(s);
    }

    public void i(i iVar, i iVar2, int i2, int i3) {
        b s = s();
        i u = u();
        u.f8535d = 0;
        s.n(iVar, iVar2, u, i2);
        if (i3 != 6) {
            n(s, (int) (s.f8510d.f(u) * -1.0f), i3);
        }
        d(s);
    }

    public void j(i iVar, i iVar2, boolean z) {
        b s = s();
        i u = u();
        u.f8535d = 0;
        s.o(iVar, iVar2, u, 0);
        if (z) {
            n(s, (int) (s.f8510d.f(u) * -1.0f), 1);
        }
        d(s);
    }

    public void k(i iVar, i iVar2, int i2, int i3) {
        b s = s();
        i u = u();
        u.f8535d = 0;
        s.o(iVar, iVar2, u, i2);
        if (i3 != 6) {
            n(s, (int) (s.f8510d.f(u) * -1.0f), i3);
        }
        d(s);
    }

    public void l(i iVar, i iVar2, i iVar3, i iVar4, float f2, int i2) {
        b s = s();
        s.j(iVar, iVar2, iVar3, iVar4, f2);
        if (i2 != 6) {
            s.d(this, i2);
        }
        d(s);
    }

    /* access modifiers changed from: package-private */
    public void n(b bVar, int i2, int i3) {
        bVar.e(p(i3, (String) null), i2);
    }

    public i p(int i2, String str) {
        f fVar = q;
        if (fVar != null) {
            fVar.f8531l++;
        }
        if (this.f8517i + 1 >= this.f8513e) {
            z();
        }
        i a2 = a(i.a.ERROR, str);
        int i3 = this.a + 1;
        this.a = i3;
        this.f8517i++;
        a2.b = i3;
        a2.f8535d = i2;
        this.f8520l.c[i3] = a2;
        this.c.b(a2);
        return a2;
    }

    public i q() {
        f fVar = q;
        if (fVar != null) {
            fVar.f8533n++;
        }
        if (this.f8517i + 1 >= this.f8513e) {
            z();
        }
        i a2 = a(i.a.SLACK, (String) null);
        int i2 = this.a + 1;
        this.a = i2;
        this.f8517i++;
        a2.b = i2;
        this.f8520l.c[i2] = a2;
        return a2;
    }

    public i r(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f8517i + 1 >= this.f8513e) {
            z();
        }
        if (obj instanceof e.f.a.j.e) {
            e.f.a.j.e eVar = (e.f.a.j.e) obj;
            iVar = eVar.g();
            if (iVar == null) {
                eVar.n(this.f8520l);
                iVar = eVar.g();
            }
            int i2 = iVar.b;
            if (i2 == -1 || i2 > this.a || this.f8520l.c[i2] == null) {
                if (iVar.b != -1) {
                    iVar.d();
                }
                int i3 = this.a + 1;
                this.a = i3;
                this.f8517i++;
                iVar.b = i3;
                iVar.f8538g = i.a.UNRESTRICTED;
                this.f8520l.c[i3] = iVar;
            }
        }
        return iVar;
    }

    public b s() {
        b b2 = this.f8520l.a.b();
        if (b2 == null) {
            b2 = new b(this.f8520l);
        } else {
            b2.w();
        }
        i.b();
        return b2;
    }

    public i u() {
        f fVar = q;
        if (fVar != null) {
            fVar.f8532m++;
        }
        if (this.f8517i + 1 >= this.f8513e) {
            z();
        }
        i a2 = a(i.a.SLACK, (String) null);
        int i2 = this.a + 1;
        this.a = i2;
        this.f8517i++;
        a2.b = i2;
        this.f8520l.c[i2] = a2;
        return a2;
    }

    public c w() {
        return this.f8520l;
    }

    public int y(Object obj) {
        i g2 = ((e.f.a.j.e) obj).g();
        if (g2 != null) {
            return (int) (g2.f8536e + 0.5f);
        }
        return 0;
    }
}

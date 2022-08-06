package e.f.a;

import e.f.a.e;
import e.f.a.i;

/* compiled from: ArrayRow */
public class b implements e.a {
    i a = null;
    float b = 0.0f;
    boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final a f8510d;

    /* renamed from: e  reason: collision with root package name */
    boolean f8511e = false;

    public b(c cVar) {
        this.f8510d = new a(this, cVar);
    }

    public void a(e.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.a = null;
            this.f8510d.c();
            int i2 = 0;
            while (true) {
                a aVar2 = bVar.f8510d;
                if (i2 < aVar2.a) {
                    this.f8510d.a(aVar2.h(i2), bVar.f8510d.i(i2), true);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void b(i iVar) {
        int i2 = iVar.f8535d;
        float f2 = 1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f8510d.l(iVar, f2);
    }

    public i c(e eVar, boolean[] zArr) {
        return this.f8510d.g(zArr, (i) null);
    }

    public void clear() {
        this.f8510d.c();
        this.a = null;
        this.b = 0.0f;
    }

    public b d(e eVar, int i2) {
        this.f8510d.l(eVar.p(i2, "ep"), 1.0f);
        this.f8510d.l(eVar.p(i2, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public b e(i iVar, int i2) {
        this.f8510d.l(iVar, (float) i2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean f(e eVar) {
        boolean z;
        i b2 = this.f8510d.b(eVar);
        if (b2 == null) {
            z = true;
        } else {
            v(b2);
            z = false;
        }
        if (this.f8510d.a == 0) {
            this.f8511e = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public b g(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3) {
        if (iVar2 == iVar3) {
            this.f8510d.l(iVar, 1.0f);
            this.f8510d.l(iVar4, 1.0f);
            this.f8510d.l(iVar2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.f8510d.l(iVar, 1.0f);
            this.f8510d.l(iVar2, -1.0f);
            this.f8510d.l(iVar3, -1.0f);
            this.f8510d.l(iVar4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                this.b = (float) ((-i2) + i3);
            }
        } else if (f2 <= 0.0f) {
            this.f8510d.l(iVar, -1.0f);
            this.f8510d.l(iVar2, 1.0f);
            this.b = (float) i2;
        } else if (f2 >= 1.0f) {
            this.f8510d.l(iVar3, -1.0f);
            this.f8510d.l(iVar4, 1.0f);
            this.b = (float) i3;
        } else {
            float f3 = 1.0f - f2;
            this.f8510d.l(iVar, f3 * 1.0f);
            this.f8510d.l(iVar2, f3 * -1.0f);
            this.f8510d.l(iVar3, -1.0f * f2);
            this.f8510d.l(iVar4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                this.b = (((float) (-i2)) * f3) + (((float) i3) * f2);
            }
        }
        return this;
    }

    public i getKey() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public b h(i iVar, int i2) {
        this.a = iVar;
        float f2 = (float) i2;
        iVar.f8536e = f2;
        this.b = f2;
        this.f8511e = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    public b i(i iVar, i iVar2, i iVar3, float f2) {
        this.f8510d.l(iVar, -1.0f);
        this.f8510d.l(iVar2, 1.0f - f2);
        this.f8510d.l(iVar3, f2);
        return this;
    }

    public b j(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f8510d.l(iVar, -1.0f);
        this.f8510d.l(iVar2, 1.0f);
        this.f8510d.l(iVar3, f2);
        this.f8510d.l(iVar4, -f2);
        return this;
    }

    public b k(float f2, float f3, float f4, i iVar, i iVar2, i iVar3, i iVar4) {
        this.b = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.f8510d.l(iVar, 1.0f);
            this.f8510d.l(iVar2, -1.0f);
            this.f8510d.l(iVar4, 1.0f);
            this.f8510d.l(iVar3, -1.0f);
        } else if (f2 == 0.0f) {
            this.f8510d.l(iVar, 1.0f);
            this.f8510d.l(iVar2, -1.0f);
        } else if (f4 == 0.0f) {
            this.f8510d.l(iVar3, 1.0f);
            this.f8510d.l(iVar4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f8510d.l(iVar, 1.0f);
            this.f8510d.l(iVar2, -1.0f);
            this.f8510d.l(iVar4, f5);
            this.f8510d.l(iVar3, -f5);
        }
        return this;
    }

    public b l(i iVar, int i2) {
        if (i2 < 0) {
            this.b = (float) (i2 * -1);
            this.f8510d.l(iVar, 1.0f);
        } else {
            this.b = (float) i2;
            this.f8510d.l(iVar, -1.0f);
        }
        return this;
    }

    public b m(i iVar, i iVar2, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.b = (float) i2;
        }
        if (!z) {
            this.f8510d.l(iVar, -1.0f);
            this.f8510d.l(iVar2, 1.0f);
        } else {
            this.f8510d.l(iVar, 1.0f);
            this.f8510d.l(iVar2, -1.0f);
        }
        return this;
    }

    public b n(i iVar, i iVar2, i iVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.b = (float) i2;
        }
        if (!z) {
            this.f8510d.l(iVar, -1.0f);
            this.f8510d.l(iVar2, 1.0f);
            this.f8510d.l(iVar3, 1.0f);
        } else {
            this.f8510d.l(iVar, 1.0f);
            this.f8510d.l(iVar2, -1.0f);
            this.f8510d.l(iVar3, -1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.b = (float) i2;
        }
        if (!z) {
            this.f8510d.l(iVar, -1.0f);
            this.f8510d.l(iVar2, 1.0f);
            this.f8510d.l(iVar3, -1.0f);
        } else {
            this.f8510d.l(iVar, 1.0f);
            this.f8510d.l(iVar2, -1.0f);
            this.f8510d.l(iVar3, 1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f8510d.l(iVar3, 0.5f);
        this.f8510d.l(iVar4, 0.5f);
        this.f8510d.l(iVar, -0.5f);
        this.f8510d.l(iVar2, -0.5f);
        this.b = -f2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        float f2 = this.b;
        if (f2 < 0.0f) {
            this.b = f2 * -1.0f;
            this.f8510d.j();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        i iVar = this.a;
        return iVar != null && (iVar.f8538g == i.a.UNRESTRICTED || this.b >= 0.0f);
    }

    /* access modifiers changed from: package-private */
    public boolean s(i iVar) {
        return this.f8510d.d(iVar);
    }

    public boolean t() {
        return this.a == null && this.b == 0.0f && this.f8510d.a == 0;
    }

    public String toString() {
        return x();
    }

    /* access modifiers changed from: package-private */
    public i u(i iVar) {
        return this.f8510d.g((boolean[]) null, iVar);
    }

    /* access modifiers changed from: package-private */
    public void v(i iVar) {
        i iVar2 = this.a;
        if (iVar2 != null) {
            this.f8510d.l(iVar2, -1.0f);
            this.a = null;
        }
        float m2 = this.f8510d.m(iVar, true) * -1.0f;
        this.a = iVar;
        if (m2 != 1.0f) {
            this.b /= m2;
            this.f8510d.e(m2);
        }
    }

    public void w() {
        this.a = null;
        this.f8510d.c();
        this.b = 0.0f;
        this.f8511e = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String x() {
        /*
            r10 = this;
            e.f.a.i r0 = r10.a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            e.f.a.i r1 = r10.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            e.f.a.a r5 = r10.f8510d
            int r5 = r5.a
        L_0x005b:
            if (r2 >= r5) goto L_0x00ea
            e.f.a.a r6 = r10.f8510d
            e.f.a.i r6 = r6.h(r2)
            if (r6 != 0) goto L_0x0067
            goto L_0x00e6
        L_0x0067:
            e.f.a.a r7 = r10.f8510d
            float r7 = r7.i(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0073
            goto L_0x00e6
        L_0x0073:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0091
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b6
        L_0x0091:
            if (r8 <= 0) goto L_0x00a5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b8
        L_0x00a5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00b6:
            float r7 = r7 * r9
        L_0x00b8:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00ce
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e5
        L_0x00ce:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e5:
            r1 = 1
        L_0x00e6:
            int r2 = r2 + 1
            goto L_0x005b
        L_0x00ea:
            if (r1 != 0) goto L_0x00fd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00fd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.b.x():java.lang.String");
    }
}

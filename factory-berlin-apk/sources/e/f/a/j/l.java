package e.f.a.j;

import e.f.a.e;
import e.f.a.i;
import e.f.a.j.e;

/* compiled from: ResolutionAnchor */
public class l extends n {
    e c;

    /* renamed from: d  reason: collision with root package name */
    l f8604d;

    /* renamed from: e  reason: collision with root package name */
    float f8605e;

    /* renamed from: f  reason: collision with root package name */
    l f8606f;

    /* renamed from: g  reason: collision with root package name */
    float f8607g;

    /* renamed from: h  reason: collision with root package name */
    int f8608h = 0;

    /* renamed from: i  reason: collision with root package name */
    private l f8609i;

    /* renamed from: j  reason: collision with root package name */
    private m f8610j = null;

    /* renamed from: k  reason: collision with root package name */
    private int f8611k = 1;

    /* renamed from: l  reason: collision with root package name */
    private m f8612l = null;

    /* renamed from: m  reason: collision with root package name */
    private int f8613m = 1;

    public l(e eVar) {
        this.c = eVar;
    }

    public void e() {
        super.e();
        this.f8604d = null;
        this.f8605e = 0.0f;
        this.f8610j = null;
        this.f8611k = 1;
        this.f8612l = null;
        this.f8613m = 1;
        this.f8606f = null;
        this.f8607g = 0.0f;
        this.f8609i = null;
        this.f8608h = 0;
    }

    public void f() {
        l lVar;
        l lVar2;
        l lVar3;
        l lVar4;
        l lVar5;
        l lVar6;
        float f2;
        float f3;
        float f4;
        float f5;
        l lVar7;
        boolean z = true;
        if (this.b != 1 && this.f8608h != 4) {
            m mVar = this.f8610j;
            if (mVar != null) {
                if (mVar.b == 1) {
                    this.f8605e = ((float) this.f8611k) * mVar.c;
                } else {
                    return;
                }
            }
            m mVar2 = this.f8612l;
            if (mVar2 != null) {
                if (mVar2.b == 1) {
                    float f6 = mVar2.c;
                } else {
                    return;
                }
            }
            if (this.f8608h == 1 && ((lVar7 = this.f8604d) == null || lVar7.b == 1)) {
                l lVar8 = this.f8604d;
                if (lVar8 == null) {
                    this.f8606f = this;
                    this.f8607g = this.f8605e;
                } else {
                    this.f8606f = lVar8.f8606f;
                    this.f8607g = lVar8.f8607g + this.f8605e;
                }
                b();
            } else if (this.f8608h == 2 && (lVar4 = this.f8604d) != null && lVar4.b == 1 && (lVar5 = this.f8609i) != null && (lVar6 = lVar5.f8604d) != null && lVar6.b == 1) {
                if (e.x() != null) {
                    e.x().v++;
                }
                this.f8606f = this.f8604d.f8606f;
                l lVar9 = this.f8609i;
                lVar9.f8606f = lVar9.f8604d.f8606f;
                e.d dVar = this.c.c;
                int i2 = 0;
                if (!(dVar == e.d.RIGHT || dVar == e.d.BOTTOM)) {
                    z = false;
                }
                if (z) {
                    f3 = this.f8604d.f8607g;
                    f2 = this.f8609i.f8604d.f8607g;
                } else {
                    f3 = this.f8609i.f8604d.f8607g;
                    f2 = this.f8604d.f8607g;
                }
                float f7 = f3 - f2;
                e eVar = this.c;
                e.d dVar2 = eVar.c;
                if (dVar2 == e.d.LEFT || dVar2 == e.d.RIGHT) {
                    f5 = f7 - ((float) this.c.b.D());
                    f4 = this.c.b.V;
                } else {
                    f5 = f7 - ((float) eVar.b.r());
                    f4 = this.c.b.W;
                }
                int d2 = this.c.d();
                int d3 = this.f8609i.c.d();
                if (this.c.i() == this.f8609i.c.i()) {
                    f4 = 0.5f;
                    d3 = 0;
                } else {
                    i2 = d2;
                }
                float f8 = (float) i2;
                float f9 = (float) d3;
                float f10 = (f5 - f8) - f9;
                if (z) {
                    l lVar10 = this.f8609i;
                    lVar10.f8607g = lVar10.f8604d.f8607g + f9 + (f10 * f4);
                    this.f8607g = (this.f8604d.f8607g - f8) - (f10 * (1.0f - f4));
                } else {
                    this.f8607g = this.f8604d.f8607g + f8 + (f10 * f4);
                    l lVar11 = this.f8609i;
                    lVar11.f8607g = (lVar11.f8604d.f8607g - f9) - (f10 * (1.0f - f4));
                }
                b();
                this.f8609i.b();
            } else if (this.f8608h == 3 && (lVar = this.f8604d) != null && lVar.b == 1 && (lVar2 = this.f8609i) != null && (lVar3 = lVar2.f8604d) != null && lVar3.b == 1) {
                if (e.f.a.e.x() != null) {
                    e.f.a.e.x().w++;
                }
                l lVar12 = this.f8604d;
                this.f8606f = lVar12.f8606f;
                l lVar13 = this.f8609i;
                l lVar14 = lVar13.f8604d;
                lVar13.f8606f = lVar14.f8606f;
                this.f8607g = lVar12.f8607g + this.f8605e;
                lVar13.f8607g = lVar14.f8607g + lVar13.f8605e;
                b();
                this.f8609i.b();
            } else if (this.f8608h == 5) {
                this.c.b.U();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(e.f.a.e eVar) {
        i g2 = this.c.g();
        l lVar = this.f8606f;
        if (lVar == null) {
            eVar.f(g2, (int) (this.f8607g + 0.5f));
        } else {
            eVar.e(g2, eVar.r(lVar.c), (int) (this.f8607g + 0.5f), 6);
        }
    }

    public void h(int i2, l lVar, int i3) {
        this.f8608h = i2;
        this.f8604d = lVar;
        this.f8605e = (float) i3;
        lVar.a(this);
    }

    public void i(l lVar, int i2) {
        this.f8604d = lVar;
        this.f8605e = (float) i2;
        lVar.a(this);
    }

    public void j(l lVar, int i2, m mVar) {
        this.f8604d = lVar;
        lVar.a(this);
        this.f8610j = mVar;
        this.f8611k = i2;
        mVar.a(this);
    }

    public float k() {
        return this.f8607g;
    }

    public void l(l lVar, float f2) {
        if (this.b == 0 || !(this.f8606f == lVar || this.f8607g == f2)) {
            this.f8606f = lVar;
            this.f8607g = f2;
            if (this.b == 1) {
                c();
            }
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public String m(int i2) {
        return i2 == 1 ? "DIRECT" : i2 == 2 ? "CENTER" : i2 == 3 ? "MATCH" : i2 == 4 ? "CHAIN" : i2 == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public void n(l lVar, float f2) {
        this.f8609i = lVar;
    }

    public void o(l lVar, int i2, m mVar) {
        this.f8609i = lVar;
        this.f8612l = mVar;
        this.f8613m = i2;
    }

    public void p(int i2) {
        this.f8608h = i2;
    }

    public void q() {
        e i2 = this.c.i();
        if (i2 != null) {
            if (i2.i() == this.c) {
                this.f8608h = 4;
                i2.f().f8608h = 4;
            }
            int d2 = this.c.d();
            e.d dVar = this.c.c;
            if (dVar == e.d.RIGHT || dVar == e.d.BOTTOM) {
                d2 = -d2;
            }
            i(i2.f(), d2);
        }
    }

    public String toString() {
        if (this.b != 1) {
            return "{ " + this.c + " UNRESOLVED} type: " + m(this.f8608h);
        } else if (this.f8606f == this) {
            return "[" + this.c + ", RESOLVED: " + this.f8607g + "]  type: " + m(this.f8608h);
        } else {
            return "[" + this.c + ", RESOLVED: " + this.f8606f + ":" + this.f8607g + "] type: " + m(this.f8608h);
        }
    }
}

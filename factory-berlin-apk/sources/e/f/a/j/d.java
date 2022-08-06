package e.f.a.j;

import e.f.a.j.f;
import java.util.ArrayList;

/* compiled from: ChainHead */
public class d {
    protected f a;
    protected f b;
    protected f c;

    /* renamed from: d  reason: collision with root package name */
    protected f f8548d;

    /* renamed from: e  reason: collision with root package name */
    protected f f8549e;

    /* renamed from: f  reason: collision with root package name */
    protected f f8550f;

    /* renamed from: g  reason: collision with root package name */
    protected f f8551g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList<f> f8552h;

    /* renamed from: i  reason: collision with root package name */
    protected int f8553i;

    /* renamed from: j  reason: collision with root package name */
    protected int f8554j;

    /* renamed from: k  reason: collision with root package name */
    protected float f8555k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    private int f8556l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f8557m = false;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f8558n;
    protected boolean o;
    protected boolean p;
    private boolean q;

    public d(f fVar, int i2, boolean z) {
        this.a = fVar;
        this.f8556l = i2;
        this.f8557m = z;
    }

    private void b() {
        int i2 = this.f8556l * 2;
        f fVar = this.a;
        boolean z = false;
        f fVar2 = fVar;
        boolean z2 = false;
        while (!z2) {
            this.f8553i++;
            f[] fVarArr = fVar.i0;
            int i3 = this.f8556l;
            f fVar3 = null;
            fVarArr[i3] = null;
            fVar.h0[i3] = null;
            if (fVar.C() != 8) {
                if (this.b == null) {
                    this.b = fVar;
                }
                this.f8548d = fVar;
                f.b[] bVarArr = fVar.C;
                int i4 = this.f8556l;
                if (bVarArr[i4] == f.b.MATCH_CONSTRAINT) {
                    int[] iArr = fVar.f8583g;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f8554j++;
                        float[] fArr = fVar.g0;
                        int i5 = this.f8556l;
                        float f2 = fArr[i5];
                        if (f2 > 0.0f) {
                            this.f8555k += fArr[i5];
                        }
                        if (c(fVar, this.f8556l)) {
                            if (f2 < 0.0f) {
                                this.f8558n = true;
                            } else {
                                this.o = true;
                            }
                            if (this.f8552h == null) {
                                this.f8552h = new ArrayList<>();
                            }
                            this.f8552h.add(fVar);
                        }
                        if (this.f8550f == null) {
                            this.f8550f = fVar;
                        }
                        f fVar4 = this.f8551g;
                        if (fVar4 != null) {
                            fVar4.h0[this.f8556l] = fVar;
                        }
                        this.f8551g = fVar;
                    }
                }
            }
            if (fVar2 != fVar) {
                fVar2.i0[this.f8556l] = fVar;
            }
            e eVar = fVar.A[i2 + 1].f8559d;
            if (eVar != null) {
                f fVar5 = eVar.b;
                e[] eVarArr = fVar5.A;
                if (eVarArr[i2].f8559d != null && eVarArr[i2].f8559d.b == fVar) {
                    fVar3 = fVar5;
                }
            }
            if (fVar3 == null) {
                fVar3 = fVar;
                z2 = true;
            }
            fVar2 = fVar;
            fVar = fVar3;
        }
        this.c = fVar;
        if (this.f8556l != 0 || !this.f8557m) {
            this.f8549e = this.a;
        } else {
            this.f8549e = fVar;
        }
        if (this.o && this.f8558n) {
            z = true;
        }
        this.p = z;
    }

    private static boolean c(f fVar, int i2) {
        if (fVar.C() != 8 && fVar.C[i2] == f.b.MATCH_CONSTRAINT) {
            int[] iArr = fVar.f8583g;
            if (iArr[i2] == 0 || iArr[i2] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.q) {
            b();
        }
        this.q = true;
    }
}

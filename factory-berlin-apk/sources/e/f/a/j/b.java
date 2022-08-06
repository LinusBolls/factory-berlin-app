package e.f.a.j;

import e.f.a.e;
import e.f.a.i;
import e.f.a.j.f;
import java.util.ArrayList;

/* compiled from: Barrier */
public class b extends j {
    private int m0 = 0;
    private ArrayList<l> n0 = new ArrayList<>(4);
    private boolean o0 = true;

    public void K0(boolean z) {
        this.o0 = z;
    }

    public void L0(int i2) {
        this.m0 = i2;
    }

    public void S() {
        super.S();
        this.n0.clear();
    }

    public void U() {
        l lVar;
        float f2;
        l lVar2;
        int i2 = this.m0;
        float f3 = Float.MAX_VALUE;
        if (i2 != 0) {
            if (i2 == 1) {
                lVar = this.u.f();
            } else if (i2 == 2) {
                lVar = this.t.f();
            } else if (i2 == 3) {
                lVar = this.v.f();
            } else {
                return;
            }
            f3 = 0.0f;
        } else {
            lVar = this.s.f();
        }
        int size = this.n0.size();
        l lVar3 = null;
        int i3 = 0;
        while (i3 < size) {
            l lVar4 = this.n0.get(i3);
            if (lVar4.b == 1) {
                int i4 = this.m0;
                if (i4 == 0 || i4 == 2) {
                    f2 = lVar4.f8607g;
                    if (f2 < f3) {
                        lVar2 = lVar4.f8606f;
                    } else {
                        i3++;
                    }
                } else {
                    f2 = lVar4.f8607g;
                    if (f2 > f3) {
                        lVar2 = lVar4.f8606f;
                    } else {
                        i3++;
                    }
                }
                lVar3 = lVar2;
                f3 = f2;
                i3++;
            } else {
                return;
            }
        }
        if (e.x() != null) {
            e.x().y++;
        }
        lVar.f8606f = lVar3;
        lVar.f8607g = f3;
        lVar.b();
        int i5 = this.m0;
        if (i5 == 0) {
            this.u.f().l(lVar3, f3);
        } else if (i5 == 1) {
            this.s.f().l(lVar3, f3);
        } else if (i5 == 2) {
            this.v.f().l(lVar3, f3);
        } else if (i5 == 3) {
            this.t.f().l(lVar3, f3);
        }
    }

    public void b(e eVar) {
        e[] eVarArr;
        boolean z;
        int i2;
        int i3;
        e[] eVarArr2 = this.A;
        eVarArr2[0] = this.s;
        eVarArr2[2] = this.t;
        eVarArr2[1] = this.u;
        eVarArr2[3] = this.v;
        int i4 = 0;
        while (true) {
            eVarArr = this.A;
            if (i4 >= eVarArr.length) {
                break;
            }
            eVarArr[i4].f8564i = eVar.r(eVarArr[i4]);
            i4++;
        }
        int i5 = this.m0;
        if (i5 >= 0 && i5 < 4) {
            e eVar2 = eVarArr[i5];
            int i6 = 0;
            while (true) {
                if (i6 >= this.l0) {
                    z = false;
                    break;
                }
                f fVar = this.k0[i6];
                if ((this.o0 || fVar.c()) && ((((i2 = this.m0) == 0 || i2 == 1) && fVar.s() == f.b.MATCH_CONSTRAINT) || (((i3 = this.m0) == 2 || i3 == 3) && fVar.B() == f.b.MATCH_CONSTRAINT))) {
                    z = true;
                } else {
                    i6++;
                }
            }
            int i7 = this.m0;
            if (i7 == 0 || i7 == 1 ? u().s() == f.b.WRAP_CONTENT : u().B() == f.b.WRAP_CONTENT) {
                z = false;
            }
            for (int i8 = 0; i8 < this.l0; i8++) {
                f fVar2 = this.k0[i8];
                if (this.o0 || fVar2.c()) {
                    i r = eVar.r(fVar2.A[this.m0]);
                    e[] eVarArr3 = fVar2.A;
                    int i9 = this.m0;
                    eVarArr3[i9].f8564i = r;
                    if (i9 == 0 || i9 == 2) {
                        eVar.j(eVar2.f8564i, r, z);
                    } else {
                        eVar.h(eVar2.f8564i, r, z);
                    }
                }
            }
            int i10 = this.m0;
            if (i10 == 0) {
                eVar.e(this.u.f8564i, this.s.f8564i, 0, 6);
                if (!z) {
                    eVar.e(this.s.f8564i, this.D.u.f8564i, 0, 5);
                }
            } else if (i10 == 1) {
                eVar.e(this.s.f8564i, this.u.f8564i, 0, 6);
                if (!z) {
                    eVar.e(this.s.f8564i, this.D.s.f8564i, 0, 5);
                }
            } else if (i10 == 2) {
                eVar.e(this.v.f8564i, this.t.f8564i, 0, 6);
                if (!z) {
                    eVar.e(this.t.f8564i, this.D.v.f8564i, 0, 5);
                }
            } else if (i10 == 3) {
                eVar.e(this.t.f8564i, this.v.f8564i, 0, 6);
                if (!z) {
                    eVar.e(this.t.f8564i, this.D.t.f8564i, 0, 5);
                }
            }
        }
    }

    public boolean c() {
        return true;
    }

    public void d(int i2) {
        l lVar;
        l lVar2;
        f fVar = this.D;
        if (fVar != null && ((g) fVar).X0(2)) {
            int i3 = this.m0;
            if (i3 == 0) {
                lVar = this.s.f();
            } else if (i3 == 1) {
                lVar = this.u.f();
            } else if (i3 == 2) {
                lVar = this.t.f();
            } else if (i3 == 3) {
                lVar = this.v.f();
            } else {
                return;
            }
            lVar.p(5);
            int i4 = this.m0;
            if (i4 == 0 || i4 == 1) {
                this.t.f().l((l) null, 0.0f);
                this.v.f().l((l) null, 0.0f);
            } else {
                this.s.f().l((l) null, 0.0f);
                this.u.f().l((l) null, 0.0f);
            }
            this.n0.clear();
            for (int i5 = 0; i5 < this.l0; i5++) {
                f fVar2 = this.k0[i5];
                if (this.o0 || fVar2.c()) {
                    int i6 = this.m0;
                    if (i6 == 0) {
                        lVar2 = fVar2.s.f();
                    } else if (i6 == 1) {
                        lVar2 = fVar2.u.f();
                    } else if (i6 == 2) {
                        lVar2 = fVar2.t.f();
                    } else if (i6 != 3) {
                        lVar2 = null;
                    } else {
                        lVar2 = fVar2.v.f();
                    }
                    if (lVar2 != null) {
                        this.n0.add(lVar2);
                        lVar2.a(lVar);
                    }
                }
            }
        }
    }
}

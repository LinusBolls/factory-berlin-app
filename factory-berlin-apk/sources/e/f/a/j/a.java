package e.f.a.j;

import e.f.a.j.e;
import e.f.a.j.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Analyzer */
public class a {
    public static void a(g gVar) {
        if ((gVar.R0() & 32) != 32) {
            j(gVar);
            return;
        }
        gVar.D0 = true;
        gVar.x0 = false;
        gVar.y0 = false;
        gVar.z0 = false;
        ArrayList<f> arrayList = gVar.k0;
        List<h> list = gVar.w0;
        boolean z = gVar.s() == f.b.WRAP_CONTENT;
        boolean z2 = gVar.B() == f.b.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (f next : arrayList) {
            next.p = null;
            next.d0 = false;
            next.S();
        }
        for (f next2 : arrayList) {
            if (next2.p == null && !b(next2, list, z3)) {
                j(gVar);
                gVar.D0 = false;
                return;
            }
        }
        int i2 = 0;
        int i3 = 0;
        for (h next3 : list) {
            i2 = Math.max(i2, c(next3, 0));
            i3 = Math.max(i3, c(next3, 1));
        }
        if (z) {
            gVar.g0(f.b.FIXED);
            gVar.y0(i2);
            gVar.x0 = true;
            gVar.y0 = true;
            gVar.A0 = i2;
        }
        if (z2) {
            gVar.u0(f.b.FIXED);
            gVar.b0(i3);
            gVar.x0 = true;
            gVar.z0 = true;
            gVar.B0 = i3;
        }
        i(list, 0, gVar.D());
        i(list, 1, gVar.r());
    }

    private static boolean b(f fVar, List<h> list, boolean z) {
        h hVar = new h(new ArrayList(), true);
        list.add(hVar);
        return k(fVar, hVar, list, z);
    }

    private static int c(h hVar, int i2) {
        int i3 = i2 * 2;
        List<f> b = hVar.b(i2);
        int size = b.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            f fVar = b.get(i5);
            e[] eVarArr = fVar.A;
            int i6 = i3 + 1;
            i4 = Math.max(i4, d(fVar, i2, eVarArr[i6].f8559d == null || !(eVarArr[i3].f8559d == null || eVarArr[i6].f8559d == null), 0));
        }
        hVar.f8597e[i2] = i4;
        return i4;
    }

    private static int d(f fVar, int i2, boolean z, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int D;
        int i9;
        int i10;
        int i11;
        f fVar2 = fVar;
        int i12 = i2;
        boolean z2 = z;
        int i13 = 0;
        if (!fVar2.b0) {
            return 0;
        }
        boolean z3 = fVar2.w.f8559d != null && i12 == 1;
        if (z2) {
            i7 = fVar.j();
            i6 = fVar.r() - fVar.j();
            i5 = i12 * 2;
            i4 = i5 + 1;
        } else {
            i7 = fVar.r() - fVar.j();
            i6 = fVar.j();
            i4 = i12 * 2;
            i5 = i4 + 1;
        }
        e[] eVarArr = fVar2.A;
        if (eVarArr[i4].f8559d == null || eVarArr[i5].f8559d != null) {
            i8 = 1;
        } else {
            i8 = -1;
            int i14 = i4;
            i4 = i5;
            i5 = i14;
        }
        int i15 = z3 ? i3 - i7 : i3;
        int d2 = (fVar2.A[i5].d() * i8) + e(fVar, i2);
        int i16 = i15 + d2;
        int D2 = (i12 == 0 ? fVar.D() : fVar.r()) * i8;
        Iterator<n> it = fVar2.A[i5].f().a.iterator();
        while (it.hasNext()) {
            i13 = Math.max(i13, d(((l) it.next()).c.b, i12, z2, i16));
        }
        int i17 = 0;
        for (Iterator<n> it2 = fVar2.A[i4].f().a.iterator(); it2.hasNext(); it2 = it2) {
            i17 = Math.max(i17, d(((l) it2.next()).c.b, i12, z2, D2 + i16));
        }
        if (z3) {
            i13 -= i7;
            D = i17 + i6;
        } else {
            D = i17 + ((i12 == 0 ? fVar.D() : fVar.r()) * i8);
        }
        int i18 = 1;
        if (i12 == 1) {
            Iterator<n> it3 = fVar2.w.f().a.iterator();
            int i19 = 0;
            while (it3.hasNext()) {
                Iterator<n> it4 = it3;
                l lVar = (l) it3.next();
                if (i8 == i18) {
                    i19 = Math.max(i19, d(lVar.c.b, i12, z2, i7 + i16));
                    i11 = i4;
                } else {
                    i11 = i4;
                    i19 = Math.max(i19, d(lVar.c.b, i12, z2, (i6 * i8) + i16));
                }
                it3 = it4;
                i4 = i11;
                i18 = 1;
            }
            i9 = i4;
            int i20 = i19;
            i10 = (fVar2.w.f().a.size() <= 0 || z3) ? i20 : i8 == 1 ? i20 + i7 : i20 - i6;
        } else {
            i9 = i4;
            i10 = 0;
        }
        int max = d2 + Math.max(i13, Math.max(D, i10));
        int i21 = D2 + i16;
        if (i8 == -1) {
            int i22 = i21;
            i21 = i16;
            i16 = i22;
        }
        if (z2) {
            k.e(fVar2, i12, i16);
            fVar2.Z(i16, i21, i12);
        } else {
            fVar2.p.a(fVar2, i12);
            fVar2.q0(i16, i12);
        }
        if (fVar.o(i2) == f.b.MATCH_CONSTRAINT && fVar2.G != 0.0f) {
            fVar2.p.a(fVar2, i12);
        }
        e[] eVarArr2 = fVar2.A;
        if (!(eVarArr2[i5].f8559d == null || eVarArr2[i9].f8559d == null)) {
            f u = fVar.u();
            e[] eVarArr3 = fVar2.A;
            if (eVarArr3[i5].f8559d.b == u && eVarArr3[i9].f8559d.b == u) {
                fVar2.p.a(fVar2, i12);
            }
        }
        return max;
    }

    private static int e(f fVar, int i2) {
        f fVar2;
        e eVar;
        int i3 = i2 * 2;
        e[] eVarArr = fVar.A;
        e eVar2 = eVarArr[i3];
        e eVar3 = eVarArr[i3 + 1];
        e eVar4 = eVar2.f8559d;
        if (eVar4 == null || eVar4.b != (fVar2 = fVar.D) || (eVar = eVar3.f8559d) == null || eVar.b != fVar2) {
            return 0;
        }
        return (int) (((float) (((fVar2.t(i2) - eVar2.d()) - eVar3.d()) - fVar.t(i2))) * (i2 == 0 ? fVar.V : fVar.W));
    }

    private static void f(g gVar, f fVar, h hVar) {
        hVar.f8596d = false;
        gVar.D0 = false;
        fVar.b0 = false;
    }

    private static int g(f fVar) {
        float f2;
        float f3;
        if (fVar.s() == f.b.MATCH_CONSTRAINT) {
            if (fVar.H == 0) {
                f3 = ((float) fVar.r()) * fVar.G;
            } else {
                f3 = ((float) fVar.r()) / fVar.G;
            }
            int i2 = (int) f3;
            fVar.y0(i2);
            return i2;
        } else if (fVar.B() != f.b.MATCH_CONSTRAINT) {
            return -1;
        } else {
            if (fVar.H == 1) {
                f2 = ((float) fVar.D()) * fVar.G;
            } else {
                f2 = ((float) fVar.D()) / fVar.G;
            }
            int i3 = (int) f2;
            fVar.b0(i3);
            return i3;
        }
    }

    private static void h(e eVar) {
        l f2 = eVar.f();
        e eVar2 = eVar.f8559d;
        if (eVar2 != null && eVar2.f8559d != eVar) {
            eVar2.f().a(f2);
        }
    }

    public static void i(List<h> list, int i2, int i3) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            for (f next : list.get(i4).c(i2)) {
                if (next.b0) {
                    l(next, i2, i3);
                }
            }
        }
    }

    private static void j(g gVar) {
        gVar.w0.clear();
        gVar.w0.add(0, new h(gVar.k0));
    }

    private static boolean k(f fVar, h hVar, List<h> list, boolean z) {
        e eVar;
        e eVar2;
        e eVar3;
        f fVar2;
        e eVar4;
        e eVar5;
        e eVar6;
        e eVar7;
        f fVar3;
        e eVar8;
        if (fVar == null) {
            return true;
        }
        fVar.c0 = false;
        g gVar = (g) fVar.u();
        h hVar2 = fVar.p;
        if (hVar2 == null) {
            fVar.b0 = true;
            hVar.a.add(fVar);
            fVar.p = hVar;
            if (fVar.s.f8559d == null && fVar.u.f8559d == null && fVar.t.f8559d == null && fVar.v.f8559d == null && fVar.w.f8559d == null && fVar.z.f8559d == null) {
                f(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
            }
            if (!(fVar.t.f8559d == null || fVar.v.f8559d == null)) {
                f.b B = gVar.B();
                f.b bVar = f.b.WRAP_CONTENT;
                if (z) {
                    f(gVar, fVar, hVar);
                    return false;
                } else if (!(fVar.t.f8559d.b == fVar.u() && fVar.v.f8559d.b == fVar.u())) {
                    f(gVar, fVar, hVar);
                }
            }
            if (!(fVar.s.f8559d == null || fVar.u.f8559d == null)) {
                f.b s = gVar.s();
                f.b bVar2 = f.b.WRAP_CONTENT;
                if (z) {
                    f(gVar, fVar, hVar);
                    return false;
                } else if (!(fVar.s.f8559d.b == fVar.u() && fVar.u.f8559d.b == fVar.u())) {
                    f(gVar, fVar, hVar);
                }
            }
            if (((fVar.s() == f.b.MATCH_CONSTRAINT) ^ (fVar.B() == f.b.MATCH_CONSTRAINT)) && fVar.G != 0.0f) {
                g(fVar);
            } else if (fVar.s() == f.b.MATCH_CONSTRAINT || fVar.B() == f.b.MATCH_CONSTRAINT) {
                f(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
            }
            if (((fVar.s.f8559d == null && fVar.u.f8559d == null) || (((eVar5 = fVar.s.f8559d) != null && eVar5.b == fVar.D && fVar.u.f8559d == null) || (((eVar6 = fVar.u.f8559d) != null && eVar6.b == fVar.D && fVar.s.f8559d == null) || ((eVar7 = fVar.s.f8559d) != null && eVar7.b == (fVar3 = fVar.D) && (eVar8 = fVar.u.f8559d) != null && eVar8.b == fVar3)))) && fVar.z.f8559d == null && !(fVar instanceof i) && !(fVar instanceof j)) {
                hVar.f8598f.add(fVar);
            }
            if (((fVar.t.f8559d == null && fVar.v.f8559d == null) || (((eVar = fVar.t.f8559d) != null && eVar.b == fVar.D && fVar.v.f8559d == null) || (((eVar2 = fVar.v.f8559d) != null && eVar2.b == fVar.D && fVar.t.f8559d == null) || ((eVar3 = fVar.t.f8559d) != null && eVar3.b == (fVar2 = fVar.D) && (eVar4 = fVar.v.f8559d) != null && eVar4.b == fVar2)))) && fVar.z.f8559d == null && fVar.w.f8559d == null && !(fVar instanceof i) && !(fVar instanceof j)) {
                hVar.f8599g.add(fVar);
            }
            if (fVar instanceof j) {
                f(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
                j jVar = (j) fVar;
                for (int i2 = 0; i2 < jVar.l0; i2++) {
                    if (!k(jVar.k0[i2], hVar, list, z)) {
                        return false;
                    }
                }
            }
            for (e eVar9 : fVar.A) {
                e eVar10 = eVar9.f8559d;
                if (!(eVar10 == null || eVar10.b == fVar.u())) {
                    if (eVar9.c == e.d.CENTER) {
                        f(gVar, fVar, hVar);
                        if (z) {
                            return false;
                        }
                    } else {
                        h(eVar9);
                    }
                    if (!k(eVar9.f8559d.b, hVar, list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (hVar2 != hVar) {
            hVar.a.addAll(hVar2.a);
            hVar.f8598f.addAll(fVar.p.f8598f);
            hVar.f8599g.addAll(fVar.p.f8599g);
            if (!fVar.p.f8596d) {
                hVar.f8596d = false;
            }
            list.remove(fVar.p);
            for (f fVar4 : fVar.p.a) {
                fVar4.p = hVar;
            }
        }
        return true;
    }

    private static void l(f fVar, int i2, int i3) {
        int i4 = i2 * 2;
        e[] eVarArr = fVar.A;
        e eVar = eVarArr[i4];
        e eVar2 = eVarArr[i4 + 1];
        if ((eVar.f8559d == null || eVar2.f8559d == null) ? false : true) {
            k.e(fVar, i2, e(fVar, i2) + eVar.d());
        } else if (fVar.G == 0.0f || fVar.o(i2) != f.b.MATCH_CONSTRAINT) {
            int v = i3 - fVar.v(i2);
            int t = v - fVar.t(i2);
            fVar.Z(t, v, i2);
            k.e(fVar, i2, t);
        } else {
            int g2 = g(fVar);
            int i5 = (int) fVar.A[i4].f().f8607g;
            eVar2.f().f8606f = eVar.f();
            eVar2.f().f8607g = (float) g2;
            eVar2.f().b = 1;
            fVar.Z(i5, i5 + g2, i2);
        }
    }
}

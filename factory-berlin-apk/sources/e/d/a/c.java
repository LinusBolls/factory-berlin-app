package e.d.a;

import android.content.res.ColorStateList;

/* compiled from: CardViewApi21Impl */
class c implements f {
    c() {
    }

    private g n(e eVar) {
        return (g) eVar.f();
    }

    public float a(e eVar) {
        return n(eVar).c();
    }

    public ColorStateList b(e eVar) {
        return n(eVar).b();
    }

    public void c(e eVar, float f2) {
        n(eVar).h(f2);
    }

    public float d(e eVar) {
        return eVar.b().getElevation();
    }

    public void e() {
    }

    public float f(e eVar) {
        return n(eVar).d();
    }

    public float g(e eVar) {
        return f(eVar) * 2.0f;
    }

    public float h(e eVar) {
        return f(eVar) * 2.0f;
    }

    public void i(e eVar) {
        m(eVar, a(eVar));
    }

    public void j(e eVar, float f2) {
        eVar.b().setElevation(f2);
    }

    public void k(e eVar) {
        m(eVar, a(eVar));
    }

    public void l(e eVar, ColorStateList colorStateList) {
        n(eVar).f(colorStateList);
    }

    public void m(e eVar, float f2) {
        n(eVar).g(f2, eVar.e(), eVar.d());
        o(eVar);
    }

    public void o(e eVar) {
        if (!eVar.e()) {
            eVar.a(0, 0, 0, 0);
            return;
        }
        float a = a(eVar);
        float f2 = f(eVar);
        int ceil = (int) Math.ceil((double) h.c(a, f2, eVar.d()));
        int ceil2 = (int) Math.ceil((double) h.d(a, f2, eVar.d()));
        eVar.a(ceil, ceil2, ceil, ceil2);
    }
}

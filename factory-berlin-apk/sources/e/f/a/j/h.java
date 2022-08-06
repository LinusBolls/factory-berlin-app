package e.f.a.j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ConstraintWidgetGroup */
public class h {
    public List<f> a;
    int b = -1;
    int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8596d = false;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f8597e = {-1, -1};

    /* renamed from: f  reason: collision with root package name */
    List<f> f8598f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    List<f> f8599g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    HashSet<f> f8600h = new HashSet<>();

    /* renamed from: i  reason: collision with root package name */
    HashSet<f> f8601i = new HashSet<>();

    /* renamed from: j  reason: collision with root package name */
    List<f> f8602j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    List<f> f8603k = new ArrayList();

    h(List<f> list) {
        this.a = list;
    }

    private void e(ArrayList<f> arrayList, f fVar) {
        if (!fVar.d0) {
            arrayList.add(fVar);
            fVar.d0 = true;
            if (!fVar.L()) {
                if (fVar instanceof j) {
                    j jVar = (j) fVar;
                    int i2 = jVar.l0;
                    for (int i3 = 0; i3 < i2; i3++) {
                        e(arrayList, jVar.k0[i3]);
                    }
                }
                for (e eVar : fVar.A) {
                    e eVar2 = eVar.f8559d;
                    if (eVar2 != null) {
                        f fVar2 = eVar2.b;
                        if (!(eVar2 == null || fVar2 == fVar.u())) {
                            e(arrayList, fVar2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f(e.f.a.j.f r7) {
        /*
            r6 = this;
            boolean r0 = r7.b0
            if (r0 == 0) goto L_0x00de
            boolean r0 = r7.L()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            e.f.a.j.e r0 = r7.u
            e.f.a.j.e r0 = r0.f8559d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x001d
            e.f.a.j.e r3 = r7.u
            e.f.a.j.e r3 = r3.f8559d
            goto L_0x0021
        L_0x001d:
            e.f.a.j.e r3 = r7.s
            e.f.a.j.e r3 = r3.f8559d
        L_0x0021:
            if (r3 == 0) goto L_0x0045
            e.f.a.j.f r4 = r3.b
            boolean r5 = r4.c0
            if (r5 != 0) goto L_0x002c
            r6.f(r4)
        L_0x002c:
            e.f.a.j.e$d r4 = r3.c
            e.f.a.j.e$d r5 = e.f.a.j.e.d.RIGHT
            if (r4 != r5) goto L_0x003c
            e.f.a.j.f r3 = r3.b
            int r4 = r3.I
            int r3 = r3.D()
            int r4 = r4 + r3
            goto L_0x0046
        L_0x003c:
            e.f.a.j.e$d r5 = e.f.a.j.e.d.LEFT
            if (r4 != r5) goto L_0x0045
            e.f.a.j.f r3 = r3.b
            int r4 = r3.I
            goto L_0x0046
        L_0x0045:
            r4 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x0050
            e.f.a.j.e r0 = r7.u
            int r0 = r0.d()
            int r4 = r4 - r0
            goto L_0x005c
        L_0x0050:
            e.f.a.j.e r0 = r7.s
            int r0 = r0.d()
            int r3 = r7.D()
            int r0 = r0 + r3
            int r4 = r4 + r0
        L_0x005c:
            int r0 = r7.D()
            int r0 = r4 - r0
            r7.f0(r0, r4)
            e.f.a.j.e r0 = r7.w
            e.f.a.j.e r0 = r0.f8559d
            if (r0 == 0) goto L_0x0087
            e.f.a.j.f r1 = r0.b
            boolean r3 = r1.c0
            if (r3 != 0) goto L_0x0074
            r6.f(r1)
        L_0x0074:
            e.f.a.j.f r0 = r0.b
            int r1 = r0.J
            int r0 = r0.Q
            int r1 = r1 + r0
            int r0 = r7.Q
            int r1 = r1 - r0
            int r0 = r7.F
            int r0 = r0 + r1
            r7.t0(r1, r0)
            r7.c0 = r2
            return
        L_0x0087:
            e.f.a.j.e r0 = r7.v
            e.f.a.j.e r0 = r0.f8559d
            if (r0 == 0) goto L_0x008e
            r1 = 1
        L_0x008e:
            if (r1 == 0) goto L_0x0095
            e.f.a.j.e r0 = r7.v
            e.f.a.j.e r0 = r0.f8559d
            goto L_0x0099
        L_0x0095:
            e.f.a.j.e r0 = r7.t
            e.f.a.j.e r0 = r0.f8559d
        L_0x0099:
            if (r0 == 0) goto L_0x00bd
            e.f.a.j.f r3 = r0.b
            boolean r5 = r3.c0
            if (r5 != 0) goto L_0x00a4
            r6.f(r3)
        L_0x00a4:
            e.f.a.j.e$d r3 = r0.c
            e.f.a.j.e$d r5 = e.f.a.j.e.d.BOTTOM
            if (r3 != r5) goto L_0x00b5
            e.f.a.j.f r0 = r0.b
            int r3 = r0.J
            int r0 = r0.r()
            int r4 = r3 + r0
            goto L_0x00bd
        L_0x00b5:
            e.f.a.j.e$d r5 = e.f.a.j.e.d.TOP
            if (r3 != r5) goto L_0x00bd
            e.f.a.j.f r0 = r0.b
            int r4 = r0.J
        L_0x00bd:
            if (r1 == 0) goto L_0x00c7
            e.f.a.j.e r0 = r7.v
            int r0 = r0.d()
            int r4 = r4 - r0
            goto L_0x00d3
        L_0x00c7:
            e.f.a.j.e r0 = r7.t
            int r0 = r0.d()
            int r1 = r7.r()
            int r0 = r0 + r1
            int r4 = r4 + r0
        L_0x00d3:
            int r0 = r7.r()
            int r0 = r4 - r0
            r7.t0(r0, r4)
            r7.c0 = r2
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.j.h.f(e.f.a.j.f):void");
    }

    /* access modifiers changed from: package-private */
    public void a(f fVar, int i2) {
        if (i2 == 0) {
            this.f8600h.add(fVar);
        } else if (i2 == 1) {
            this.f8601i.add(fVar);
        }
    }

    public List<f> b(int i2) {
        if (i2 == 0) {
            return this.f8598f;
        }
        if (i2 == 1) {
            return this.f8599g;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Set<f> c(int i2) {
        if (i2 == 0) {
            return this.f8600h;
        }
        if (i2 == 1) {
            return this.f8601i;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public List<f> d() {
        if (!this.f8602j.isEmpty()) {
            return this.f8602j;
        }
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = this.a.get(i2);
            if (!fVar.b0) {
                e((ArrayList) this.f8602j, fVar);
            }
        }
        this.f8603k.clear();
        this.f8603k.addAll(this.a);
        this.f8603k.removeAll(this.f8602j);
        return this.f8602j;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        int size = this.f8603k.size();
        for (int i2 = 0; i2 < size; i2++) {
            f(this.f8603k.get(i2));
        }
    }

    h(List<f> list, boolean z) {
        this.a = list;
        this.f8596d = z;
    }
}

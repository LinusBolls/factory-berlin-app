package e.p;

import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.r;

/* compiled from: PagedStorageDiffHelper */
class k {

    /* compiled from: PagedStorageDiffHelper */
    static class a extends h.b {
        final /* synthetic */ j a;
        final /* synthetic */ int b;
        final /* synthetic */ j c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.d f8851d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f8852e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f8853f;

        a(j jVar, int i2, j jVar2, h.d dVar, int i3, int i4) {
            this.a = jVar;
            this.b = i2;
            this.c = jVar2;
            this.f8851d = dVar;
            this.f8852e = i3;
            this.f8853f = i4;
        }

        public boolean a(int i2, int i3) {
            Object obj = this.a.get(i2 + this.b);
            j jVar = this.c;
            Object obj2 = jVar.get(i3 + jVar.l());
            if (obj == obj2) {
                return true;
            }
            if (obj == null || obj2 == null) {
                return false;
            }
            return this.f8851d.a(obj, obj2);
        }

        public boolean b(int i2, int i3) {
            Object obj = this.a.get(i2 + this.b);
            j jVar = this.c;
            Object obj2 = jVar.get(i3 + jVar.l());
            if (obj == obj2) {
                return true;
            }
            if (obj == null || obj2 == null) {
                return false;
            }
            return this.f8851d.b(obj, obj2);
        }

        public Object c(int i2, int i3) {
            Object obj = this.a.get(i2 + this.b);
            j jVar = this.c;
            Object obj2 = jVar.get(i3 + jVar.l());
            if (obj == null || obj2 == null) {
                return null;
            }
            return this.f8851d.c(obj, obj2);
        }

        public int d() {
            return this.f8853f;
        }

        public int e() {
            return this.f8852e;
        }
    }

    /* compiled from: PagedStorageDiffHelper */
    private static class b implements r {
        private final int a;
        private final r b;

        b(int i2, r rVar) {
            this.a = i2;
            this.b = rVar;
        }

        public void a(int i2, int i3) {
            this.b.a(i2 + this.a, i3);
        }

        public void b(int i2, int i3) {
            r rVar = this.b;
            int i4 = this.a;
            rVar.b(i2 + i4, i3 + i4);
        }

        public void c(int i2, int i3) {
            this.b.c(i2 + this.a, i3);
        }

        public void d(int i2, int i3, Object obj) {
            this.b.d(i2 + this.a, i3, obj);
        }
    }

    static <T> h.c a(j<T> jVar, j<T> jVar2, h.d<T> dVar) {
        int g2 = jVar.g();
        int g3 = jVar2.g();
        return h.b(new a(jVar, g2, jVar2, dVar, (jVar.size() - g2) - jVar.i(), (jVar2.size() - g3) - jVar2.i()), true);
    }

    static <T> void b(r rVar, j<T> jVar, j<T> jVar2, h.c cVar) {
        int i2 = jVar.i();
        int i3 = jVar2.i();
        int g2 = jVar.g();
        int g3 = jVar2.g();
        if (i2 == 0 && i3 == 0 && g2 == 0 && g3 == 0) {
            cVar.e(rVar);
            return;
        }
        if (i2 > i3) {
            int i4 = i2 - i3;
            rVar.a(jVar.size() - i4, i4);
        } else if (i2 < i3) {
            rVar.c(jVar.size(), i3 - i2);
        }
        if (g2 > g3) {
            rVar.a(0, g2 - g3);
        } else if (g2 < g3) {
            rVar.c(0, g3 - g2);
        }
        if (g3 != 0) {
            cVar.e(new b(g3, rVar));
        } else {
            cVar.e(rVar);
        }
    }

    static int c(h.c cVar, j jVar, j jVar2, int i2) {
        int g2 = jVar.g();
        int i3 = i2 - g2;
        int size = (jVar.size() - g2) - jVar.i();
        if (i3 >= 0 && i3 < size) {
            for (int i4 = 0; i4 < 30; i4++) {
                int i5 = ((i4 / 2) * (i4 % 2 == 1 ? -1 : 1)) + i3;
                if (i5 >= 0 && i5 < jVar.s()) {
                    try {
                        int b2 = cVar.b(i5);
                        if (b2 != -1) {
                            return b2 + jVar2.l();
                        }
                    } catch (IndexOutOfBoundsException unused) {
                    }
                }
            }
        }
        return Math.max(0, Math.min(i2, jVar2.size() - 1));
    }
}

package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck */
class y {
    final b a;
    a b = new a();

    /* compiled from: ViewBoundsCheck */
    static class a {
        int a = 0;
        int b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        int f1356d;

        /* renamed from: e  reason: collision with root package name */
        int f1357e;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            this.a = i2 | this.a;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            int i2 = this.a;
            if ((i2 & 7) != 0 && (i2 & (c(this.f1356d, this.b) << 0)) == 0) {
                return false;
            }
            int i3 = this.a;
            if ((i3 & 112) != 0 && (i3 & (c(this.f1356d, this.c) << 4)) == 0) {
                return false;
            }
            int i4 = this.a;
            if ((i4 & 1792) != 0 && (i4 & (c(this.f1357e, this.b) << 8)) == 0) {
                return false;
            }
            int i5 = this.a;
            if ((i5 & 28672) == 0 || (i5 & (c(this.f1357e, this.c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public int c(int i2, int i3) {
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.a = 0;
        }

        /* access modifiers changed from: package-private */
        public void e(int i2, int i3, int i4, int i5) {
            this.b = i2;
            this.c = i3;
            this.f1356d = i4;
            this.f1357e = i5;
        }
    }

    /* compiled from: ViewBoundsCheck */
    interface b {
        View a(int i2);

        int b();

        int c(View view);

        int d();

        int e(View view);
    }

    y(b bVar) {
        this.a = bVar;
    }

    /* access modifiers changed from: package-private */
    public View a(int i2, int i3, int i4, int i5) {
        int d2 = this.a.d();
        int b2 = this.a.b();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View a2 = this.a.a(i2);
            this.b.e(d2, b2, this.a.c(a2), this.a.e(a2));
            if (i4 != 0) {
                this.b.d();
                this.b.a(i4);
                if (this.b.b()) {
                    return a2;
                }
            }
            if (i5 != 0) {
                this.b.d();
                this.b.a(i5);
                if (this.b.b()) {
                    view = a2;
                }
            }
            i2 += i6;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view, int i2) {
        this.b.e(this.a.d(), this.a.b(), this.a.c(view), this.a.e(view));
        if (i2 == 0) {
            return false;
        }
        this.b.d();
        this.b.a(i2);
        return this.b.b();
    }
}

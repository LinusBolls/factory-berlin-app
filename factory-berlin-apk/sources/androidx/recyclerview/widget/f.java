package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChildHelper */
class f {
    final b a;
    final a b = new a();
    final List<View> c = new ArrayList();

    /* compiled from: ChildHelper */
    static class a {
        long a = 0;
        a b;

        a() {
        }

        private void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            if (i2 >= 64) {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.a(i2 - 64);
                    return;
                }
                return;
            }
            this.a &= ~(1 << i2);
        }

        /* access modifiers changed from: package-private */
        public int b(int i2) {
            a aVar = this.b;
            if (aVar == null) {
                if (i2 >= 64) {
                    return Long.bitCount(this.a);
                }
                return Long.bitCount(this.a & ((1 << i2) - 1));
            } else if (i2 < 64) {
                return Long.bitCount(this.a & ((1 << i2) - 1));
            } else {
                return aVar.b(i2 - 64) + Long.bitCount(this.a);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i2) {
            if (i2 < 64) {
                return (this.a & (1 << i2)) != 0;
            }
            c();
            return this.b.d(i2 - 64);
        }

        /* access modifiers changed from: package-private */
        public void e(int i2, boolean z) {
            if (i2 >= 64) {
                c();
                this.b.e(i2 - 64, z);
                return;
            }
            boolean z2 = (this.a & Long.MIN_VALUE) != 0;
            long j2 = (1 << i2) - 1;
            long j3 = this.a;
            this.a = ((j3 & (~j2)) << 1) | (j3 & j2);
            if (z) {
                h(i2);
            } else {
                a(i2);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean f(int i2) {
            if (i2 >= 64) {
                c();
                return this.b.f(i2 - 64);
            }
            long j2 = 1 << i2;
            boolean z = (this.a & j2) != 0;
            long j3 = this.a & (~j2);
            this.a = j3;
            long j4 = j2 - 1;
            this.a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            this.a = 0;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        /* access modifiers changed from: package-private */
        public void h(int i2) {
            if (i2 >= 64) {
                c();
                this.b.h(i2 - 64);
                return;
            }
            this.a |= 1 << i2;
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    /* compiled from: ChildHelper */
    interface b {
        View a(int i2);

        void b(View view);

        RecyclerView.d0 c(View view);

        void d(int i2);

        void e(View view);

        void f(View view, int i2);

        int g();

        void h(int i2);

        void i();

        void j(View view, int i2, ViewGroup.LayoutParams layoutParams);

        int k(View view);
    }

    f(b bVar) {
        this.a = bVar;
    }

    private int h(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int g2 = this.a.g();
        int i3 = i2;
        while (i3 < g2) {
            int b2 = i2 - (i3 - this.b.b(i3));
            if (b2 == 0) {
                while (this.b.d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += b2;
        }
        return -1;
    }

    private void l(View view) {
        this.c.add(view);
        this.a.b(view);
    }

    private boolean t(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.a.e(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i2, boolean z) {
        int i3;
        if (i2 < 0) {
            i3 = this.a.g();
        } else {
            i3 = h(i2);
        }
        this.b.e(i3, z);
        if (z) {
            l(view);
        }
        this.a.f(view, i3);
    }

    /* access modifiers changed from: package-private */
    public void b(View view, boolean z) {
        a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    public void c(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i3;
        if (i2 < 0) {
            i3 = this.a.g();
        } else {
            i3 = h(i2);
        }
        this.b.e(i3, z);
        if (z) {
            l(view);
        }
        this.a.j(view, i3, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void d(int i2) {
        int h2 = h(i2);
        this.b.f(h2);
        this.a.d(h2);
    }

    /* access modifiers changed from: package-private */
    public View e(int i2) {
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.c.get(i3);
            RecyclerView.d0 c2 = this.a.c(view);
            if (c2.m() == i2 && !c2.t() && !c2.v()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View f(int i2) {
        return this.a.a(h(i2));
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.a.g() - this.c.size();
    }

    /* access modifiers changed from: package-private */
    public View i(int i2) {
        return this.a.a(i2);
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.a.g();
    }

    /* access modifiers changed from: package-private */
    public void k(View view) {
        int k2 = this.a.k(view);
        if (k2 >= 0) {
            this.b.h(k2);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    public int m(View view) {
        int k2 = this.a.k(view);
        if (k2 != -1 && !this.b.d(k2)) {
            return k2 - this.b.b(k2);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean n(View view) {
        return this.c.contains(view);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.b.g();
        for (int size = this.c.size() - 1; size >= 0; size--) {
            this.a.e(this.c.get(size));
            this.c.remove(size);
        }
        this.a.i();
    }

    /* access modifiers changed from: package-private */
    public void p(View view) {
        int k2 = this.a.k(view);
        if (k2 >= 0) {
            if (this.b.f(k2)) {
                t(view);
            }
            this.a.h(k2);
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i2) {
        int h2 = h(i2);
        View a2 = this.a.a(h2);
        if (a2 != null) {
            if (this.b.f(h2)) {
                t(a2);
            }
            this.a.h(h2);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r(View view) {
        int k2 = this.a.k(view);
        if (k2 == -1) {
            t(view);
            return true;
        } else if (!this.b.d(k2)) {
            return false;
        } else {
            this.b.f(k2);
            t(view);
            this.a.h(k2);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void s(View view) {
        int k2 = this.a.k(view);
        if (k2 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.b.d(k2)) {
            this.b.a(k2);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}

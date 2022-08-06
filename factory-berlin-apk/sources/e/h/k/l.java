package e.h.k;

import android.view.View;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper */
public class l {
    private ViewParent a;
    private ViewParent b;
    private final View c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8700d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f8701e;

    public l(View view) {
        this.c = view;
    }

    private boolean h(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent i7;
        int i8;
        int i9;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!m() || (i7 = i(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.c.getLocationInWindow(iArr4);
            i9 = iArr4[0];
            i8 = iArr4[1];
        } else {
            i9 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            int[] j2 = j();
            j2[0] = 0;
            j2[1] = 0;
            iArr3 = j2;
        } else {
            iArr3 = iArr2;
        }
        x.d(i7, this.c, i2, i3, i4, i5, i6, iArr3);
        if (iArr4 != null) {
            this.c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i9;
            iArr4[1] = iArr4[1] - i8;
        }
        return true;
    }

    private ViewParent i(int i2) {
        if (i2 == 0) {
            return this.a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.b;
    }

    private int[] j() {
        if (this.f8701e == null) {
            this.f8701e = new int[2];
        }
        return this.f8701e;
    }

    private void o(int i2, ViewParent viewParent) {
        if (i2 == 0) {
            this.a = viewParent;
        } else if (i2 == 1) {
            this.b = viewParent;
        }
    }

    public boolean a(float f2, float f3, boolean z) {
        ViewParent i2;
        if (!m() || (i2 = i(0)) == null) {
            return false;
        }
        return x.a(i2, this.c, f2, f3, z);
    }

    public boolean b(float f2, float f3) {
        ViewParent i2;
        if (!m() || (i2 = i(0)) == null) {
            return false;
        }
        return x.b(i2, this.c, f2, f3);
    }

    public boolean c(int i2, int i3, int[] iArr, int[] iArr2) {
        return d(i2, i3, iArr, iArr2, 0);
    }

    public boolean d(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent i5;
        int i6;
        int i7;
        if (!m() || (i5 = i(i4)) == null) {
            return false;
        }
        if (i2 != 0 || i3 != 0) {
            if (iArr2 != null) {
                this.c.getLocationInWindow(iArr2);
                i7 = iArr2[0];
                i6 = iArr2[1];
            } else {
                i7 = 0;
                i6 = 0;
            }
            if (iArr == null) {
                iArr = j();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            x.c(i5, this.c, i2, i3, iArr, i4);
            if (iArr2 != null) {
                this.c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i7;
                iArr2[1] = iArr2[1] - i6;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public void e(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        h(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public boolean f(int i2, int i3, int i4, int i5, int[] iArr) {
        return h(i2, i3, i4, i5, iArr, 0, (int[]) null);
    }

    public boolean g(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return h(i2, i3, i4, i5, iArr, i6, (int[]) null);
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i2) {
        return i(i2) != null;
    }

    public boolean m() {
        return this.f8700d;
    }

    public void n(boolean z) {
        if (this.f8700d) {
            u.v0(this.c);
        }
        this.f8700d = z;
    }

    public boolean p(int i2) {
        return q(i2, 0);
    }

    public boolean q(int i2, int i3) {
        if (l(i3)) {
            return true;
        }
        if (!m()) {
            return false;
        }
        View view = this.c;
        for (ViewParent parent = this.c.getParent(); parent != null; parent = parent.getParent()) {
            if (x.f(parent, view, this.c, i2, i3)) {
                o(i3, parent);
                x.e(parent, view, this.c, i2, i3);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void r() {
        s(0);
    }

    public void s(int i2) {
        ViewParent i3 = i(i2);
        if (i3 != null) {
            x.g(i3, this.c, i2);
            o(i2, (ViewParent) null);
        }
    }
}

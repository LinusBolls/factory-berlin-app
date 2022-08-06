package androidx.appcompat.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RtlSpacingHelper */
class o0 {
    private int a = 0;
    private int b = 0;
    private int c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d  reason: collision with root package name */
    private int f475d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: e  reason: collision with root package name */
    private int f476e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f477f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f478g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f479h = false;

    o0() {
    }

    public int a() {
        return this.f478g ? this.a : this.b;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.f478g ? this.b : this.a;
    }

    public void e(int i2, int i3) {
        this.f479h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f476e = i2;
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f477f = i3;
            this.b = i3;
        }
    }

    public void f(boolean z) {
        if (z != this.f478g) {
            this.f478g = z;
            if (!this.f479h) {
                this.a = this.f476e;
                this.b = this.f477f;
            } else if (z) {
                int i2 = this.f475d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f476e;
                }
                this.a = i2;
                int i3 = this.c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f477f;
                }
                this.b = i3;
            } else {
                int i4 = this.c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f476e;
                }
                this.a = i4;
                int i5 = this.f475d;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = this.f477f;
                }
                this.b = i5;
            }
        }
    }

    public void g(int i2, int i3) {
        this.c = i2;
        this.f475d = i3;
        this.f479h = true;
        if (this.f478g) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.b = i3;
        }
    }
}

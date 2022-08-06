package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper */
public abstract class t {
    protected final RecyclerView.o a;
    private int b;
    final Rect c;

    /* compiled from: OrientationHelper */
    static class a extends t {
        a(RecyclerView.o oVar) {
            super(oVar, (a) null);
        }

        public int d(View view) {
            return this.a.U(view) + ((RecyclerView.p) view.getLayoutParams()).rightMargin;
        }

        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.T(view) + pVar.leftMargin + pVar.rightMargin;
        }

        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.S(view) + pVar.topMargin + pVar.bottomMargin;
        }

        public int g(View view) {
            return this.a.R(view) - ((RecyclerView.p) view.getLayoutParams()).leftMargin;
        }

        public int h() {
            return this.a.p0();
        }

        public int i() {
            return this.a.p0() - this.a.g0();
        }

        public int j() {
            return this.a.g0();
        }

        public int k() {
            return this.a.q0();
        }

        public int l() {
            return this.a.Y();
        }

        public int m() {
            return this.a.f0();
        }

        public int n() {
            return (this.a.p0() - this.a.f0()) - this.a.g0();
        }

        public int p(View view) {
            this.a.o0(view, true, this.c);
            return this.c.right;
        }

        public int q(View view) {
            this.a.o0(view, true, this.c);
            return this.c.left;
        }

        public void r(int i2) {
            this.a.D0(i2);
        }
    }

    /* compiled from: OrientationHelper */
    static class b extends t {
        b(RecyclerView.o oVar) {
            super(oVar, (a) null);
        }

        public int d(View view) {
            return this.a.P(view) + ((RecyclerView.p) view.getLayoutParams()).bottomMargin;
        }

        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.S(view) + pVar.topMargin + pVar.bottomMargin;
        }

        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.T(view) + pVar.leftMargin + pVar.rightMargin;
        }

        public int g(View view) {
            return this.a.V(view) - ((RecyclerView.p) view.getLayoutParams()).topMargin;
        }

        public int h() {
            return this.a.X();
        }

        public int i() {
            return this.a.X() - this.a.e0();
        }

        public int j() {
            return this.a.e0();
        }

        public int k() {
            return this.a.Y();
        }

        public int l() {
            return this.a.q0();
        }

        public int m() {
            return this.a.h0();
        }

        public int n() {
            return (this.a.X() - this.a.h0()) - this.a.e0();
        }

        public int p(View view) {
            this.a.o0(view, true, this.c);
            return this.c.bottom;
        }

        public int q(View view) {
            this.a.o0(view, true, this.c);
            return this.c.top;
        }

        public void r(int i2) {
            this.a.E0(i2);
        }
    }

    /* synthetic */ t(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static t a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static t b(RecyclerView.o oVar, int i2) {
        if (i2 == 0) {
            return a(oVar);
        }
        if (i2 == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static t c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return n() - this.b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i2);

    public void s() {
        this.b = n();
    }

    private t(RecyclerView.o oVar) {
        this.b = RecyclerView.UNDEFINED_DURATION;
        this.c = new Rect();
        this.a = oVar;
    }
}

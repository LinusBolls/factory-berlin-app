package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator */
public abstract class w extends RecyclerView.l {

    /* renamed from: g  reason: collision with root package name */
    boolean f1355g = true;

    public abstract boolean A(RecyclerView.d0 d0Var);

    public final void B(RecyclerView.d0 d0Var) {
        J(d0Var);
        h(d0Var);
    }

    public final void C(RecyclerView.d0 d0Var) {
        K(d0Var);
    }

    public final void D(RecyclerView.d0 d0Var, boolean z) {
        L(d0Var, z);
        h(d0Var);
    }

    public final void E(RecyclerView.d0 d0Var, boolean z) {
        M(d0Var, z);
    }

    public final void F(RecyclerView.d0 d0Var) {
        N(d0Var);
        h(d0Var);
    }

    public final void G(RecyclerView.d0 d0Var) {
        O(d0Var);
    }

    public final void H(RecyclerView.d0 d0Var) {
        P(d0Var);
        h(d0Var);
    }

    public final void I(RecyclerView.d0 d0Var) {
        Q(d0Var);
    }

    public void J(RecyclerView.d0 d0Var) {
    }

    public void K(RecyclerView.d0 d0Var) {
    }

    public void L(RecyclerView.d0 d0Var, boolean z) {
    }

    public void M(RecyclerView.d0 d0Var, boolean z) {
    }

    public void N(RecyclerView.d0 d0Var) {
    }

    public void O(RecyclerView.d0 d0Var) {
    }

    public void P(RecyclerView.d0 d0Var) {
    }

    public void Q(RecyclerView.d0 d0Var) {
    }

    public void R(boolean z) {
        this.f1355g = z;
    }

    public boolean a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        if (cVar == null || (cVar.a == cVar2.a && cVar.b == cVar2.b)) {
            return x(d0Var);
        }
        return z(d0Var, cVar.a, cVar.b, cVar2.a, cVar2.b);
    }

    public boolean b(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i2;
        int i3;
        int i4 = cVar.a;
        int i5 = cVar.b;
        if (d0Var2.J()) {
            int i6 = cVar.a;
            i2 = cVar.b;
            i3 = i6;
        } else {
            i3 = cVar2.a;
            i2 = cVar2.b;
        }
        return y(d0Var, d0Var2, i4, i5, i3, i2);
    }

    public boolean c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i2 = cVar.a;
        int i3 = cVar.b;
        View view = d0Var.a;
        int left = cVar2 == null ? view.getLeft() : cVar2.a;
        int top = cVar2 == null ? view.getTop() : cVar2.b;
        if (d0Var.v() || (i2 == left && i3 == top)) {
            return A(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return z(d0Var, i2, i3, left, top);
    }

    public boolean d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        if (cVar.a == cVar2.a && cVar.b == cVar2.b) {
            F(d0Var);
            return false;
        }
        return z(d0Var, cVar.a, cVar.b, cVar2.a, cVar2.b);
    }

    public boolean f(RecyclerView.d0 d0Var) {
        return !this.f1355g || d0Var.t();
    }

    public abstract boolean x(RecyclerView.d0 d0Var);

    public abstract boolean y(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i2, int i3, int i4, int i5);

    public abstract boolean z(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5);
}

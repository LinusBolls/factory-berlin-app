package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSnapHelper */
public class p extends x {

    /* renamed from: d  reason: collision with root package name */
    private t f1347d;

    /* renamed from: e  reason: collision with root package name */
    private t f1348e;

    private float m(RecyclerView.o oVar, t tVar) {
        int max;
        int K = oVar.K();
        if (K == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        int i3 = RecyclerView.UNDEFINED_DURATION;
        for (int i4 = 0; i4 < K; i4++) {
            View J = oVar.J(i4);
            int i0 = oVar.i0(J);
            if (i0 != -1) {
                if (i0 < i2) {
                    view = J;
                    i2 = i0;
                }
                if (i0 > i3) {
                    view2 = J;
                    i3 = i0;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(tVar.d(view), tVar.d(view2)) - Math.min(tVar.g(view), tVar.g(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i3 - i2) + 1));
    }

    private int n(RecyclerView.o oVar, View view, t tVar) {
        return (tVar.g(view) + (tVar.e(view) / 2)) - (tVar.m() + (tVar.n() / 2));
    }

    private int o(RecyclerView.o oVar, t tVar, int i2, int i3) {
        int[] d2 = d(i2, i3);
        float m2 = m(oVar, tVar);
        if (m2 <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(d2[0]) > Math.abs(d2[1]) ? d2[0] : d2[1])) / m2);
    }

    private View p(RecyclerView.o oVar, t tVar) {
        int K = oVar.K();
        View view = null;
        if (K == 0) {
            return null;
        }
        int m2 = tVar.m() + (tVar.n() / 2);
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < K; i3++) {
            View J = oVar.J(i3);
            int abs = Math.abs((tVar.g(J) + (tVar.e(J) / 2)) - m2);
            if (abs < i2) {
                view = J;
                i2 = abs;
            }
        }
        return view;
    }

    private t q(RecyclerView.o oVar) {
        t tVar = this.f1348e;
        if (tVar == null || tVar.a != oVar) {
            this.f1348e = t.a(oVar);
        }
        return this.f1348e;
    }

    private t r(RecyclerView.o oVar) {
        t tVar = this.f1347d;
        if (tVar == null || tVar.a != oVar) {
            this.f1347d = t.c(oVar);
        }
        return this.f1347d;
    }

    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.l()) {
            iArr[0] = n(oVar, view, q(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.m()) {
            iArr[1] = n(oVar, view, r(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View h(RecyclerView.o oVar) {
        if (oVar.m()) {
            return p(oVar, r(oVar));
        }
        if (oVar.l()) {
            return p(oVar, q(oVar));
        }
        return null;
    }

    public int i(RecyclerView.o oVar, int i2, int i3) {
        int Z;
        View h2;
        int i0;
        int i4;
        PointF a;
        int i5;
        int i6;
        if (!(oVar instanceof RecyclerView.z.b) || (Z = oVar.Z()) == 0 || (h2 = h(oVar)) == null || (i0 = oVar.i0(h2)) == -1 || (a = ((RecyclerView.z.b) oVar).a(i4)) == null) {
            return -1;
        }
        int i7 = 0;
        if (oVar.l()) {
            i5 = o(oVar, q(oVar), i2, 0);
            if (a.x < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (oVar.m()) {
            i6 = o(oVar, r(oVar), 0, i3);
            if (a.y < 0.0f) {
                i6 = -i6;
            }
        } else {
            i6 = 0;
        }
        if (oVar.m()) {
            i5 = i6;
        }
        if (i5 == 0) {
            return -1;
        }
        int i8 = i0 + i5;
        if (i8 >= 0) {
            i7 = i8;
        }
        return i7 >= Z ? Z - 1 : i7;
    }
}

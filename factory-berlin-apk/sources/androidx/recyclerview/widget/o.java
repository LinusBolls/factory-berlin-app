package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller */
public class o extends RecyclerView.z {

    /* renamed from: i  reason: collision with root package name */
    protected final LinearInterpolator f1341i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    protected final DecelerateInterpolator f1342j = new DecelerateInterpolator();

    /* renamed from: k  reason: collision with root package name */
    protected PointF f1343k;

    /* renamed from: l  reason: collision with root package name */
    private final DisplayMetrics f1344l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1345m = false;

    /* renamed from: n  reason: collision with root package name */
    private float f1346n;
    protected int o = 0;
    protected int p = 0;

    public o(Context context) {
        this.f1344l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f1345m) {
            this.f1346n = v(this.f1344l);
            this.f1345m = true;
        }
        return this.f1346n;
    }

    private int y(int i2, int i3) {
        int i4 = i2 - i3;
        if (i2 * i4 <= 0) {
            return 0;
        }
        return i4;
    }

    /* access modifiers changed from: protected */
    public int B() {
        PointF pointF = this.f1343k;
        if (pointF != null) {
            float f2 = pointF.y;
            if (f2 != 0.0f) {
                return f2 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void C(RecyclerView.z.a aVar) {
        PointF a = a(f());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(a);
        this.f1343k = a;
        this.o = (int) (a.x * 10000.0f);
        this.p = (int) (a.y * 10000.0f);
        aVar.d((int) (((float) this.o) * 1.2f), (int) (((float) this.p) * 1.2f), (int) (((float) x(10000)) * 1.2f), this.f1341i);
    }

    /* access modifiers changed from: protected */
    public void l(int i2, int i3, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.o = y(this.o, i2);
        int y = y(this.p, i3);
        this.p = y;
        if (this.o == 0 && y == 0) {
            C(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    /* access modifiers changed from: protected */
    public void n() {
        this.p = 0;
        this.o = 0;
        this.f1343k = null;
    }

    /* access modifiers changed from: protected */
    public void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        int t = t(view, z());
        int u = u(view, B());
        int w = w((int) Math.sqrt((double) ((t * t) + (u * u))));
        if (w > 0) {
            aVar.d(-t, -u, w, this.f1342j);
        }
    }

    public int s(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int t(View view, int i2) {
        RecyclerView.o e2 = e();
        if (e2 == null || !e2.l()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(e2.R(view) - pVar.leftMargin, e2.U(view) + pVar.rightMargin, e2.f0(), e2.p0() - e2.g0(), i2);
    }

    public int u(View view, int i2) {
        RecyclerView.o e2 = e();
        if (e2 == null || !e2.m()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(e2.V(view) - pVar.topMargin, e2.P(view) + pVar.bottomMargin, e2.h0(), e2.X() - e2.e0(), i2);
    }

    /* access modifiers changed from: protected */
    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    public int w(int i2) {
        return (int) Math.ceil(((double) x(i2)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    public int x(int i2) {
        return (int) Math.ceil((double) (((float) Math.abs(i2)) * A()));
    }

    /* access modifiers changed from: protected */
    public int z() {
        PointF pointF = this.f1343k;
        if (pointF != null) {
            float f2 = pointF.x;
            if (f2 != 0.0f) {
                return f2 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}

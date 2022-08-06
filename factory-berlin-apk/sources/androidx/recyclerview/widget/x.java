package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper */
public abstract class x extends RecyclerView.r {
    RecyclerView a;
    private Scroller b;
    private final RecyclerView.t c = new a();

    /* compiled from: SnapHelper */
    class a extends RecyclerView.t {
        boolean a = false;

        a() {
        }

        public void a(RecyclerView recyclerView, int i2) {
            super.a(recyclerView, i2);
            if (i2 == 0 && this.a) {
                this.a = false;
                x.this.l();
            }
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
            if (i2 != 0 || i3 != 0) {
                this.a = true;
            }
        }
    }

    /* compiled from: SnapHelper */
    class b extends o {
        b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            x xVar = x.this;
            RecyclerView recyclerView = xVar.a;
            if (recyclerView != null) {
                int[] c = xVar.c(recyclerView.getLayoutManager(), view);
                int i2 = c[0];
                int i3 = c[1];
                int w = w(Math.max(Math.abs(i2), Math.abs(i3)));
                if (w > 0) {
                    aVar.d(i2, i3, w, this.f1342j);
                }
            }
        }

        /* access modifiers changed from: protected */
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    private void g() {
        this.a.removeOnScrollListener(this.c);
        this.a.setOnFlingListener((RecyclerView.r) null);
    }

    private void j() {
        if (this.a.getOnFlingListener() == null) {
            this.a.addOnScrollListener(this.c);
            this.a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean k(RecyclerView.o oVar, int i2, int i3) {
        RecyclerView.z e2;
        int i4;
        if (!(oVar instanceof RecyclerView.z.b) || (e2 = e(oVar)) == null || (i4 = i(oVar, i2, i3)) == -1) {
            return false;
        }
        e2.p(i4);
        oVar.K1(e2);
        return true;
    }

    public boolean a(int i2, int i3) {
        RecyclerView.o layoutManager = this.a.getLayoutManager();
        if (layoutManager == null || this.a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.a.getMinFlingVelocity();
        if ((Math.abs(i3) > minFlingVelocity || Math.abs(i2) > minFlingVelocity) && k(layoutManager, i2, i3)) {
            return true;
        }
        return false;
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                g();
            }
            this.a = recyclerView;
            if (recyclerView != null) {
                j();
                this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
                l();
            }
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    public int[] d(int i2, int i3) {
        this.b.fling(0, 0, i2, i3, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }

    /* access modifiers changed from: protected */
    public RecyclerView.z e(RecyclerView.o oVar) {
        return f(oVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public o f(RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.z.b)) {
            return null;
        }
        return new b(this.a.getContext());
    }

    public abstract View h(RecyclerView.o oVar);

    public abstract int i(RecyclerView.o oVar, int i2, int i3);

    /* access modifiers changed from: package-private */
    public void l() {
        RecyclerView.o layoutManager;
        View h2;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (h2 = h(layoutManager)) != null) {
            int[] c2 = c(layoutManager, h2);
            if (c2[0] != 0 || c2[1] != 0) {
                this.a.smoothScrollBy(c2[0], c2[1]);
            }
        }
    }
}

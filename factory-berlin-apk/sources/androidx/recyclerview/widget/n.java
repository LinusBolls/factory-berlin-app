package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutState */
class n {
    boolean a = true;
    int b;
    int c;

    /* renamed from: d  reason: collision with root package name */
    int f1335d;

    /* renamed from: e  reason: collision with root package name */
    int f1336e;

    /* renamed from: f  reason: collision with root package name */
    int f1337f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f1338g = 0;

    /* renamed from: h  reason: collision with root package name */
    boolean f1339h;

    /* renamed from: i  reason: collision with root package name */
    boolean f1340i;

    n() {
    }

    /* access modifiers changed from: package-private */
    public boolean a(RecyclerView.a0 a0Var) {
        int i2 = this.c;
        return i2 >= 0 && i2 < a0Var.b();
    }

    /* access modifiers changed from: package-private */
    public View b(RecyclerView.v vVar) {
        View o = vVar.o(this.c);
        this.c += this.f1335d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.c + ", mItemDirection=" + this.f1335d + ", mLayoutDirection=" + this.f1336e + ", mStartLine=" + this.f1337f + ", mEndLine=" + this.f1338g + '}';
    }
}

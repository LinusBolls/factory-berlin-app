package g.b.a.c.w;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ExpandableWidgetHelper */
public final class b {
    private final View a;
    private boolean b = false;
    private int c = 0;

    public b(a aVar) {
        this.a = (View) aVar;
    }

    private void a() {
        ViewParent parent = this.a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).g(this.a);
        }
    }

    public int b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }

    public void d(Bundle bundle) {
        this.b = bundle.getBoolean("expanded", false);
        this.c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.b);
        bundle.putInt("expandedComponentIdHint", this.c);
        return bundle;
    }

    public void f(int i2) {
        this.c = i2;
    }
}

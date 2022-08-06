package g.e.b.i;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;

/* compiled from: FragRoomScheduleDayDivisionBindingImpl */
public class c extends b {
    private static final ViewDataBinding.g x = null;
    private static final SparseIntArray y = null;
    private long w;

    public c(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 1, x, y));
    }

    /* access modifiers changed from: protected */
    public void k() {
        synchronized (this) {
            this.w = 0;
        }
    }

    public boolean u() {
        synchronized (this) {
            if (this.w != 0) {
                return true;
            }
            return false;
        }
    }

    public void v() {
        synchronized (this) {
            this.w = 1;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        return false;
    }

    private c(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[0]);
        this.w = -1;
        this.v.setTag((Object) null);
        I(view);
        v();
    }
}

package g.e.b.i;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragRoomScheduleItemBindingImpl */
public class e extends d {
    private static final SparseIntArray A;
    private static final ViewDataBinding.g z = null;
    private final ConstraintLayout x;
    private long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(g.e.b.e.text, 1);
        A.put(g.e.b.e.lineHour, 2);
        A.put(g.e.b.e.lineHalf, 3);
    }

    public e(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 4, z, A));
    }

    /* access modifiers changed from: protected */
    public void k() {
        synchronized (this) {
            this.y = 0;
        }
    }

    public boolean u() {
        synchronized (this) {
            if (this.y != 0) {
                return true;
            }
            return false;
        }
    }

    public void v() {
        synchronized (this) {
            this.y = 1;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        return false;
    }

    private e(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[3], objArr[2], objArr[1]);
        this.y = -1;
        ConstraintLayout constraintLayout = objArr[0];
        this.x = constraintLayout;
        constraintLayout.setTag((Object) null);
        I(view);
        v();
    }
}

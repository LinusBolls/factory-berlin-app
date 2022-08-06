package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.sensorberg.factory.R;

/* compiled from: FragInfoItemReadBindingImpl */
public class r extends q {
    private static final ViewDataBinding.g B = null;
    private static final SparseIntArray C;
    private long A;
    private final ConstraintLayout z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.read_title, 1);
        C.put(R.id.read_time, 2);
        C.put(R.id.read_body, 3);
        C.put(R.id.read_chevron, 4);
    }

    public r(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 5, B, C));
    }

    /* access modifiers changed from: protected */
    public void k() {
        synchronized (this) {
            this.A = 0;
        }
    }

    public boolean u() {
        synchronized (this) {
            if (this.A != 0) {
                return true;
            }
            return false;
        }
    }

    public void v() {
        synchronized (this) {
            this.A = 1;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        return false;
    }

    private r(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[3], objArr[4], objArr[2], objArr[1]);
        this.A = -1;
        ConstraintLayout constraintLayout = objArr[0];
        this.z = constraintLayout;
        constraintLayout.setTag((Object) null);
        I(view);
        v();
    }
}

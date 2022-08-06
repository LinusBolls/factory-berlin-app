package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.sensorberg.factory.R;

/* compiled from: ActivityPermissionBindingImpl */
public class g extends f {
    private static final ViewDataBinding.g y = null;
    private static final SparseIntArray z;
    private final ConstraintLayout w;
    private long x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(R.id.text, 1);
        z.put(R.id.logo, 2);
        z.put(R.id.permissionButton, 3);
    }

    public g(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 4, y, z));
    }

    /* access modifiers changed from: protected */
    public void k() {
        synchronized (this) {
            this.x = 0;
        }
    }

    public boolean u() {
        synchronized (this) {
            if (this.x != 0) {
                return true;
            }
            return false;
        }
    }

    public void v() {
        synchronized (this) {
            this.x = 1;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        return false;
    }

    private g(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[2], objArr[3], objArr[1]);
        this.x = -1;
        ConstraintLayout constraintLayout = objArr[0];
        this.w = constraintLayout;
        constraintLayout.setTag((Object) null);
        I(view);
        v();
    }
}

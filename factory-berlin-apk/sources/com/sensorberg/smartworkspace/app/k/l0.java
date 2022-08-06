package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.sensorberg.factory.R;

/* compiled from: FragLockerLoadingBindingImpl */
public class l0 extends k0 {
    private static final ViewDataBinding.g x = null;
    private static final SparseIntArray y;
    private final ConstraintLayout v;
    private long w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y = sparseIntArray;
        sparseIntArray.put(R.id.locker, 1);
    }

    public l0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 2, x, y));
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

    private l0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[1]);
        this.w = -1;
        ConstraintLayout constraintLayout = objArr[0];
        this.v = constraintLayout;
        constraintLayout.setTag((Object) null);
        I(view);
        v();
    }
}

package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.sensorberg.factory.R;

/* compiled from: FragLockerOpeningBindingImpl */
public class p0 extends o0 {
    private static final ViewDataBinding.g A = null;
    private static final SparseIntArray B;
    private final ConstraintLayout y;
    private long z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.locker_image_back, 1);
        B.put(R.id.locker_image_front, 2);
        B.put(R.id.text, 3);
    }

    public p0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 4, A, B));
    }

    /* access modifiers changed from: protected */
    public void k() {
        synchronized (this) {
            this.z = 0;
        }
    }

    public boolean u() {
        synchronized (this) {
            if (this.z != 0) {
                return true;
            }
            return false;
        }
    }

    public void v() {
        synchronized (this) {
            this.z = 1;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        return false;
    }

    private p0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[1], objArr[2], objArr[3]);
        this.z = -1;
        ConstraintLayout constraintLayout = objArr[0];
        this.y = constraintLayout;
        constraintLayout.setTag((Object) null);
        I(view);
        v();
    }
}

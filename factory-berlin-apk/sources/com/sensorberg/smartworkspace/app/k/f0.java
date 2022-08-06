package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.sensorberg.factory.R;

/* compiled from: FragLockerDeleteBookingBindingImpl */
public class f0 extends e0 {
    private static final ViewDataBinding.g y = null;
    private static final SparseIntArray z;
    private final ConstraintLayout w;
    private long x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(R.id.locker_image_back, 1);
        z.put(R.id.locker_image_front, 2);
    }

    public f0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 3, y, z));
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

    private f0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[1], objArr[2]);
        this.x = -1;
        ConstraintLayout constraintLayout = objArr[0];
        this.w = constraintLayout;
        constraintLayout.setTag((Object) null);
        I(view);
        v();
    }
}

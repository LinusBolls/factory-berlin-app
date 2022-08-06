package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.sensorberg.factory.R;

/* compiled from: FragNoLockerAvailableBindingImpl */
public class z0 extends y0 {
    private static final ViewDataBinding.g y = null;
    private static final SparseIntArray z;
    private long x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(R.id.try_other_lockers_button, 1);
        z.put(R.id.locker_create_booking_image_0, 2);
        z.put(R.id.locker_create_booking_image_1, 3);
        z.put(R.id.locker_create_booking_image_2, 4);
        z.put(R.id.locker_unavailable_text, 5);
    }

    public z0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 6, y, z));
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

    private z0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[2], objArr[3], objArr[4], objArr[0], objArr[5], objArr[1]);
        this.x = -1;
        this.v.setTag((Object) null);
        I(view);
        v();
    }
}

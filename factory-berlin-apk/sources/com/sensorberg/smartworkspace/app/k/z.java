package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.sensorberg.factory.R;

/* compiled from: FragLockerBookingDeletedBindingImpl */
public class z extends y {
    private static final SparseIntArray A;
    private static final ViewDataBinding.g z = null;
    private long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.lockerBadge, 1);
        A.put(R.id.text1, 2);
        A.put(R.id.text2, 3);
        A.put(R.id.bookAgain, 4);
        A.put(R.id.guidelineHorizontal, 5);
        A.put(R.id.left_guideline, 6);
        A.put(R.id.right_guideline, 7);
    }

    public z(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 8, z, A));
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private z(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[4], objArr[5], objArr[6], objArr[1], objArr[7], objArr[0], objArr[2], objArr[3]);
        this.y = -1;
        this.x.setTag((Object) null);
        View view2 = view;
        I(view);
        v();
    }
}

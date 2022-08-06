package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.locker.create.c;
import com.sensorberg.smartworkspace.app.utils.a;

/* compiled from: FragLockerCreateBookingBindingImpl */
public class d0 extends c0 {
    private static final ViewDataBinding.g C = null;
    private static final SparseIntArray D;
    private final ConstraintLayout A;
    private long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.lockerCreateBookingImage_1, 4);
    }

    public d0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 5, C, D));
    }

    public void M(c cVar) {
        this.z = cVar;
        synchronized (this) {
            this.B |= 1;
        }
        b(4);
        super.D();
    }

    /* access modifiers changed from: protected */
    public void k() {
        long j2;
        int i2;
        synchronized (this) {
            j2 = this.B;
            this.B = 0;
        }
        c cVar = this.z;
        boolean z = false;
        int i3 = ((j2 & 3) > 0 ? 1 : ((j2 & 3) == 0 ? 0 : -1));
        if (i3 == 0 || cVar == null) {
            i2 = 0;
        } else {
            int v = cVar.v();
            z = cVar.t();
            i2 = v;
        }
        if (i3 != 0) {
            a.d(this.v, z);
            a.d(this.x, z);
            this.y.setText(i2);
        }
    }

    public boolean u() {
        synchronized (this) {
            if (this.B != 0) {
                return true;
            }
            return false;
        }
    }

    public void v() {
        synchronized (this) {
            this.B = 2;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        return false;
    }

    private d0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[1], objArr[4], objArr[2], objArr[3]);
        this.B = -1;
        this.v.setTag((Object) null);
        this.x.setTag((Object) null);
        this.y.setTag((Object) null);
        ConstraintLayout constraintLayout = objArr[0];
        this.A = constraintLayout;
        constraintLayout.setTag((Object) null);
        I(view);
        v();
    }
}

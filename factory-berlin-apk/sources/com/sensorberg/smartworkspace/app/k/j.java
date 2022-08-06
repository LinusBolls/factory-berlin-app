package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.databinding.j.b;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.alarm.m;

/* compiled from: AlarmItemViewholderBindingImpl */
public class j extends i {
    private static final ViewDataBinding.g G = null;
    private static final SparseIntArray H;
    private final ConstraintLayout E;
    private long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.alarm_item_barrier, 5);
        H.put(R.id.alarm_item_lower_group, 6);
        H.put(R.id.alarm_item_divider, 7);
        H.put(R.id.alarm_detail_header_textview, 8);
        H.put(R.id.alarm_detail_countdown_textview, 9);
        H.put(R.id.alarm_detail_postpone_button, 10);
        H.put(R.id.alarm_detail_reenable_button, 11);
        H.put(R.id.alarm_detail_lower_space, 12);
    }

    public j(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 13, G, H));
    }

    public void N(m.b bVar) {
        this.D = bVar;
        synchronized (this) {
            this.F |= 1;
        }
        b(5);
        super.D();
    }

    /* access modifiers changed from: protected */
    public void k() {
        long j2;
        boolean z;
        synchronized (this) {
            j2 = this.F;
            this.F = 0;
        }
        m.b bVar = this.D;
        String str = null;
        boolean z2 = false;
        int i2 = ((j2 & 3) > 0 ? 1 : ((j2 & 3) == 0 ? 0 : -1));
        if (i2 != 0) {
            if (bVar != null) {
                z2 = bVar.b();
                str = bVar.f();
            }
            z = !z2;
        } else {
            z = false;
        }
        if (i2 != 0) {
            this.y.setEnabled(z2);
            this.A.setEnabled(z2);
            b.c(this.B, str);
            this.C.setClickable(z);
        }
    }

    public boolean u() {
        synchronized (this) {
            if (this.F != 0) {
                return true;
            }
            return false;
        }
    }

    public void v() {
        synchronized (this) {
            this.F = 2;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        return false;
    }

    private j(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[9], objArr[8], objArr[12], objArr[10], objArr[11], objArr[5], objArr[7], objArr[2], objArr[6], objArr[3], objArr[4], objArr[1]);
        this.F = -1;
        this.y.setTag((Object) null);
        this.A.setTag((Object) null);
        this.B.setTag((Object) null);
        this.C.setTag((Object) null);
        ConstraintLayout constraintLayout = objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag((Object) null);
        I(view);
        v();
    }
}

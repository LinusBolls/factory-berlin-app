package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.lifecycle.LiveData;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.door.c;
import com.sensorberg.smartworkspace.app.utils.a;

/* compiled from: FragNearbyContainerBindingImpl */
public class v0 extends u0 {
    private static final ViewDataBinding.g B = null;
    private static final SparseIntArray C;
    private long A;
    private final LinearLayout z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.viewpagertab, 2);
        C.put(R.id.unitsPager, 3);
    }

    public v0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 4, B, C));
    }

    private boolean N(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 1;
        }
        return true;
    }

    public void M(c cVar) {
        this.y = cVar;
        synchronized (this) {
            this.A |= 2;
        }
        b(4);
        super.D();
    }

    /* access modifiers changed from: protected */
    public void k() {
        long j2;
        synchronized (this) {
            j2 = this.A;
            this.A = 0;
        }
        c cVar = this.y;
        boolean z2 = false;
        int i2 = ((j2 & 7) > 0 ? 1 : ((j2 & 7) == 0 ? 0 : -1));
        if (i2 != 0) {
            Boolean bool = null;
            LiveData<Boolean> r = cVar != null ? cVar.r() : null;
            K(0, r);
            if (r != null) {
                bool = r.l();
            }
            z2 = ViewDataBinding.F(bool);
        }
        if (i2 != 0) {
            a.e(this.v, z2);
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
            this.A = 4;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        return N((LiveData) obj, i3);
    }

    private v0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, objArr[1], objArr[3], objArr[2]);
        this.A = -1;
        this.v.setTag((Object) null);
        LinearLayout linearLayout = objArr[0];
        this.z = linearLayout;
        linearLayout.setTag((Object) null);
        I(view);
        v();
    }
}

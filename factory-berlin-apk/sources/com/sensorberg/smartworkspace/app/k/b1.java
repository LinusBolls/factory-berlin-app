package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.lifecycle.LiveData;
import com.sensorberg.factory.R;
import g.e.d.t.a.a;

/* compiled from: FragWebviewBindingImpl */
public class b1 extends a1 {
    private static final ViewDataBinding.g C = null;
    private static final SparseIntArray D;
    private final FrameLayout A;
    private long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.retryButton, 4);
    }

    public b1(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 5, C, D));
    }

    private boolean N(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 2;
        }
        return true;
    }

    private boolean O(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 1;
        }
        return true;
    }

    private boolean P(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 4;
        }
        return true;
    }

    public void M(a aVar) {
        this.z = aVar;
        synchronized (this) {
            this.B |= 8;
        }
        b(4);
        super.D();
    }

    /* access modifiers changed from: protected */
    public void k() {
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        synchronized (this) {
            j2 = this.B;
            this.B = 0;
        }
        a aVar = this.z;
        if ((31 & j2) != 0) {
            Boolean bool = null;
            if ((j2 & 25) != 0) {
                LiveData<Boolean> v = aVar != null ? aVar.v() : null;
                K(0, v);
                z4 = ViewDataBinding.F(v != null ? v.l() : null);
            } else {
                z4 = false;
            }
            if ((j2 & 26) != 0) {
                LiveData<Boolean> u = aVar != null ? aVar.u() : null;
                K(1, u);
                z2 = ViewDataBinding.F(u != null ? u.l() : null);
            } else {
                z2 = false;
            }
            if ((j2 & 28) != 0) {
                LiveData<Boolean> w = aVar != null ? aVar.w() : null;
                K(2, w);
                if (w != null) {
                    bool = w.l();
                }
                z3 = ViewDataBinding.F(bool);
                z = z4;
            } else {
                z = z4;
                z3 = false;
            }
        } else {
            z3 = false;
            z2 = false;
            z = false;
        }
        if ((25 & j2) != 0) {
            com.sensorberg.smartworkspace.app.utils.a.e(this.v, z);
        }
        if ((28 & j2) != 0) {
            com.sensorberg.smartworkspace.app.utils.a.e(this.w, z3);
        }
        if ((j2 & 26) != 0) {
            com.sensorberg.smartworkspace.app.utils.a.e(this.y, z2);
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
            this.B = 16;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        if (i2 == 0) {
            return O((LiveData) obj, i3);
        }
        if (i2 == 1) {
            return N((LiveData) obj, i3);
        }
        if (i2 != 2) {
            return false;
        }
        return P((LiveData) obj, i3);
    }

    private b1(e eVar, View view, Object[] objArr) {
        super(eVar, view, 3, objArr[2], objArr[3], objArr[4], objArr[1]);
        this.B = -1;
        this.v.setTag((Object) null);
        this.w.setTag((Object) null);
        FrameLayout frameLayout = objArr[0];
        this.A = frameLayout;
        frameLayout.setTag((Object) null);
        this.y.setTag((Object) null);
        I(view);
        v();
    }
}

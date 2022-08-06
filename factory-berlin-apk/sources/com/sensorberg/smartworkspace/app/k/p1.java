package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.lifecycle.LiveData;
import com.sensorberg.smartworkspace.app.activities.main.d;
import com.sensorberg.smartworkspace.app.utils.a;

/* compiled from: SingleActivityBindingImpl */
public class p1 extends o1 {
    private static final ViewDataBinding.g D = null;
    private static final SparseIntArray E = null;
    private final ConstraintLayout B;
    private long C;

    public p1(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 6, D, E));
    }

    private boolean N(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 2;
        }
        return true;
    }

    private boolean O(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 4;
        }
        return true;
    }

    private boolean P(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    private boolean Q(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 16;
        }
        return true;
    }

    private boolean R(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 8;
        }
        return true;
    }

    public void M(d dVar) {
        this.A = dVar;
        synchronized (this) {
            this.C |= 32;
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
        boolean z5;
        boolean z6;
        boolean z7;
        synchronized (this) {
            j2 = this.C;
            this.C = 0;
        }
        d dVar = this.A;
        if ((127 & j2) != 0) {
            if ((j2 & 97) != 0) {
                LiveData<Boolean> W = dVar != null ? dVar.W() : null;
                K(0, W);
                z6 = ViewDataBinding.F(W != null ? W.l() : null);
            } else {
                z6 = false;
            }
            if ((j2 & 98) != 0) {
                LiveData<Boolean> U = dVar != null ? dVar.U() : null;
                K(1, U);
                z3 = ViewDataBinding.F(U != null ? U.l() : null);
            } else {
                z3 = false;
            }
            if ((j2 & 100) != 0) {
                LiveData<Boolean> V = dVar != null ? dVar.V() : null;
                K(2, V);
                z7 = ViewDataBinding.F(V != null ? V.l() : null);
            } else {
                z7 = false;
            }
            if ((j2 & 104) != 0) {
                LiveData<Boolean> Y = dVar != null ? dVar.Y() : null;
                K(3, Y);
                z2 = ViewDataBinding.F(Y != null ? Y.l() : null);
            } else {
                z2 = false;
            }
            if ((j2 & 112) != 0) {
                LiveData<Boolean> X = dVar != null ? dVar.X() : null;
                K(4, X);
                boolean z8 = z6;
                z4 = ViewDataBinding.F(X != null ? X.l() : null);
                z5 = z7;
                z = z8;
            } else {
                z5 = z7;
                z = z6;
                z4 = false;
            }
        } else {
            z5 = false;
            z4 = false;
            z3 = false;
            z2 = false;
            z = false;
        }
        if ((j2 & 97) != 0) {
            a.e(this.v, z);
        }
        if ((j2 & 100) != 0) {
            a.e(this.w, z5);
        }
        if ((j2 & 98) != 0) {
            a.e(this.x, z3);
        }
        if ((112 & j2) != 0) {
            a.e(this.y, z4);
        }
        if ((j2 & 104) != 0) {
            a.e(this.z, z2);
        }
    }

    public boolean u() {
        synchronized (this) {
            if (this.C != 0) {
                return true;
            }
            return false;
        }
    }

    public void v() {
        synchronized (this) {
            this.C = 64;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        if (i2 == 0) {
            return P((LiveData) obj, i3);
        }
        if (i2 == 1) {
            return N((LiveData) obj, i3);
        }
        if (i2 == 2) {
            return O((LiveData) obj, i3);
        }
        if (i2 == 3) {
            return R((LiveData) obj, i3);
        }
        if (i2 != 4) {
            return false;
        }
        return Q((LiveData) obj, i3);
    }

    private p1(e eVar, View view, Object[] objArr) {
        super(eVar, view, 5, objArr[2], objArr[5], objArr[1], objArr[4], objArr[3]);
        this.C = -1;
        this.v.setTag((Object) null);
        this.w.setTag((Object) null);
        ConstraintLayout constraintLayout = objArr[0];
        this.B = constraintLayout;
        constraintLayout.setTag((Object) null);
        this.x.setTag((Object) null);
        this.y.setTag((Object) null);
        this.z.setTag((Object) null);
        I(view);
        v();
    }
}

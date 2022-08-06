package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.lifecycle.LiveData;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.locker.c;
import com.sensorberg.smartworkspace.app.utils.a;

/* compiled from: FragLockerContainerBindingImpl */
public class b0 extends a0 {
    private static final SparseIntArray A;
    private static final ViewDataBinding.g z = null;
    private final FrameLayout x;
    private long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.container_content, 2);
    }

    public b0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 3, z, A));
    }

    private boolean N(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.y |= 1;
        }
        return true;
    }

    public void M(c cVar) {
        this.w = cVar;
        synchronized (this) {
            this.y |= 2;
        }
        b(4);
        super.D();
    }

    /* access modifiers changed from: protected */
    public void k() {
        long j2;
        synchronized (this) {
            j2 = this.y;
            this.y = 0;
        }
        c cVar = this.w;
        boolean z2 = false;
        int i2 = ((j2 & 7) > 0 ? 1 : ((j2 & 7) == 0 ? 0 : -1));
        if (i2 != 0) {
            Boolean bool = null;
            LiveData<Boolean> w = cVar != null ? cVar.w() : null;
            K(0, w);
            if (w != null) {
                bool = w.l();
            }
            z2 = ViewDataBinding.F(bool);
        }
        if (i2 != 0) {
            a.e(this.v, z2);
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
            this.y = 4;
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

    private b0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, objArr[2], objArr[1]);
        this.y = -1;
        this.v.setTag((Object) null);
        FrameLayout frameLayout = objArr[0];
        this.x = frameLayout;
        frameLayout.setTag((Object) null);
        I(view);
        v();
    }
}

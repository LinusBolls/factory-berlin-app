package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.sensorberg.factory.R;

/* compiled from: FragIotdeviceDetailsBindingImpl */
public class v extends u {
    private static final SparseIntArray A;
    private static final ViewDataBinding.g z = null;
    private final FrameLayout x;
    private long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.recycler, 1);
        A.put(R.id.toolbar, 2);
    }

    public v(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 3, z, A));
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

    private v(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[1], objArr[2]);
        this.y = -1;
        FrameLayout frameLayout = objArr[0];
        this.x = frameLayout;
        frameLayout.setTag((Object) null);
        I(view);
        v();
    }
}

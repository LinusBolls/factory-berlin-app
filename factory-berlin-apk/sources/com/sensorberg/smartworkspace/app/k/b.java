package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.sensorberg.factory.R;

/* compiled from: ActivityLoginExternalBindingImpl */
public class b extends a {
    private static final ViewDataBinding.g y = null;
    private static final SparseIntArray z;
    private final FrameLayout w;
    private long x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(R.id.loginError, 1);
        z.put(R.id.block, 2);
    }

    public b(e eVar, View view) {
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
            this.x = 2;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        return false;
    }

    private b(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[2], objArr[1]);
        this.x = -1;
        FrameLayout frameLayout = objArr[0];
        this.w = frameLayout;
        frameLayout.setTag((Object) null);
        I(view);
        v();
    }
}

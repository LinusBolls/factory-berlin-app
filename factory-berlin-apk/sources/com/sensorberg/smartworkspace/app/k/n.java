package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.lifecycle.LiveData;
import com.sensorberg.smartworkspace.app.utils.a;

/* compiled from: FragFavoriteListBindingImpl */
public class n extends m {
    private static final ViewDataBinding.g A = null;
    private static final SparseIntArray B = null;
    private final FrameLayout x;
    private final TextView y;
    private long z;

    public n(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 3, A, B));
    }

    private boolean N(LiveData<Boolean> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.z |= 1;
        }
        return true;
    }

    public void M(com.sensorberg.smartworkspace.app.screens.door.d.e eVar) {
        this.w = eVar;
        synchronized (this) {
            this.z |= 2;
        }
        b(2);
        super.D();
    }

    /* access modifiers changed from: protected */
    public void k() {
        long j2;
        synchronized (this) {
            j2 = this.z;
            this.z = 0;
        }
        com.sensorberg.smartworkspace.app.screens.door.d.e eVar = this.w;
        boolean z2 = false;
        int i2 = ((j2 & 7) > 0 ? 1 : ((j2 & 7) == 0 ? 0 : -1));
        if (i2 != 0) {
            Boolean bool = null;
            LiveData<Boolean> w = eVar != null ? eVar.w() : null;
            K(0, w);
            if (w != null) {
                bool = w.l();
            }
            z2 = ViewDataBinding.F(bool);
        }
        if (i2 != 0) {
            a.e(this.y, z2);
            a.d(this.v, z2);
        }
    }

    public boolean u() {
        synchronized (this) {
            if (this.z != 0) {
                return true;
            }
            return false;
        }
    }

    public void v() {
        synchronized (this) {
            this.z = 4;
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

    private n(e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, objArr[2]);
        this.z = -1;
        FrameLayout frameLayout = objArr[0];
        this.x = frameLayout;
        frameLayout.setTag((Object) null);
        TextView textView = objArr[1];
        this.y = textView;
        textView.setTag((Object) null);
        this.v.setTag((Object) null);
        I(view);
        v();
    }
}

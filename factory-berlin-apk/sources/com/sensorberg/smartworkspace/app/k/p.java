package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.lifecycle.LiveData;
import com.sensorberg.smartworkspace.app.screens.info.a;
import com.sensorberg.smartworkspace.app.screens.info.h;
import java.util.List;

/* compiled from: FragInfoBindingImpl */
public class p extends o {
    private static final SparseIntArray A = null;
    private static final ViewDataBinding.g z = null;
    private final FrameLayout x;
    private long y;

    public p(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 2, z, A));
    }

    private boolean N(LiveData<List<a>> liveData, int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.y |= 1;
        }
        return true;
    }

    public void M(h hVar) {
        this.w = hVar;
        synchronized (this) {
            this.y |= 2;
        }
        b(1);
        super.D();
    }

    /* access modifiers changed from: protected */
    public void k() {
        long j2;
        synchronized (this) {
            j2 = this.y;
            this.y = 0;
        }
        h hVar = this.w;
        LiveData<List<a>> liveData = null;
        int i2 = ((j2 & 7) > 0 ? 1 : ((j2 & 7) == 0 ? 0 : -1));
        if (i2 != 0) {
            if (hVar != null) {
                liveData = hVar.u();
            }
            K(0, liveData);
            if (liveData != null) {
                List l2 = liveData.l();
            }
        }
        if (i2 != 0) {
            com.sensorberg.smartworkspace.app.utils.a.f(this.v, liveData);
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

    private p(e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, objArr[1]);
        this.y = -1;
        FrameLayout frameLayout = objArr[0];
        this.x = frameLayout;
        frameLayout.setTag((Object) null);
        this.v.setTag((Object) null);
        I(view);
        v();
    }
}

package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.locker.error.c;
import kotlin.e0.c.a;
import kotlin.x;

/* compiled from: FragLockerErrorBindingImpl */
public class h0 extends g0 {
    private static final SparseIntArray A;
    private static final ViewDataBinding.g z = null;
    private long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.locker_error_image, 2);
        A.put(R.id.locker_error_text, 3);
    }

    public h0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 4, z, A));
    }

    public void M(c cVar) {
        this.x = cVar;
        synchronized (this) {
            this.y |= 1;
        }
        b(3);
        super.D();
    }

    /* access modifiers changed from: protected */
    public void k() {
        long j2;
        synchronized (this) {
            j2 = this.y;
            this.y = 0;
        }
        c cVar = this.x;
        a<x> aVar = null;
        int i2 = ((j2 & 3) > 0 ? 1 : ((j2 & 3) == 0 ? 0 : -1));
        if (!(i2 == 0 || cVar == null)) {
            aVar = cVar.a();
        }
        if (i2 != 0) {
            com.sensorberg.smartworkspace.app.utils.a.b(this.v, aVar);
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
            this.y = 2;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        return false;
    }

    private h0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[1], objArr[2], objArr[0], objArr[3]);
        this.y = -1;
        this.v.setTag((Object) null);
        this.w.setTag((Object) null);
        I(view);
        v();
    }
}

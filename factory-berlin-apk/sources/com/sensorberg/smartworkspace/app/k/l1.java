package com.sensorberg.smartworkspace.app.k;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.sensorberg.factory.R;

/* compiled from: ItemFavoriteHeaderBindingImpl */
public class l1 extends k1 {
    private static final ViewDataBinding.g y = null;
    private static final SparseIntArray z;
    private final LinearLayout w;
    private long x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(R.id.title, 1);
    }

    public l1(e eVar, View view) {
        this(eVar, view, ViewDataBinding.y(eVar, view, 2, y, z));
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
            this.x = 1;
        }
        D();
    }

    /* access modifiers changed from: protected */
    public boolean z(int i2, Object obj, int i3) {
        return false;
    }

    private l1(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[1]);
        this.x = -1;
        LinearLayout linearLayout = objArr[0];
        this.w = linearLayout;
        linearLayout.setTag((Object) null);
        I(view);
        v();
    }
}

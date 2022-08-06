package com.sensorberg.smartworkspace.app.n.a;

import android.os.Bundle;
import androidx.appcompat.app.c;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import kotlin.jvm.internal.k;

/* compiled from: BaseActivity.kt */
public abstract class a extends c {
    public final <T extends ViewDataBinding> T L(int i2) {
        T i3 = f.i(this, i2);
        k.d(i3, "DataBindingUtil.setContentView(this, layoutId)");
        i3.H(this);
        return i3;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        n.a.a.k("Starting " + getClass().getSimpleName(), new Object[0]);
        super.onCreate(bundle);
    }
}

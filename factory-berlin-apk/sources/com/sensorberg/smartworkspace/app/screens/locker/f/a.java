package com.sensorberg.smartworkspace.app.screens.locker.f;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.widgets.f;
import java.util.HashMap;
import kotlin.jvm.internal.k;

/* compiled from: LockerLoadingFragment.kt */
public final class a extends com.sensorberg.smartworkspace.app.a {
    private f e0;
    private HashMap f0;

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.frag_locker_loading, viewGroup, false);
        this.e0 = new f(m.b(inflate), f.f8059f.a());
        return inflate;
    }

    public void D0() {
        this.e0 = null;
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void T0() {
        super.T0();
        f fVar = this.e0;
        if (fVar != null) {
            fVar.c(true);
        }
    }

    public void U0() {
        f fVar = this.e0;
        if (fVar != null) {
            fVar.c(false);
        }
        super.U0();
    }
}

package com.sensorberg.smartworkspace.app;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import kotlin.jvm.internal.k;

/* compiled from: BaseFragment.kt */
public abstract class a extends Fragment {
    private HashMap d0;

    public static /* synthetic */ ViewDataBinding S1(a aVar, int i2, ViewGroup viewGroup, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                viewGroup = null;
            }
            return aVar.R1(i2, viewGroup);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBinding");
    }

    public /* synthetic */ void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.d0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final <T extends ViewDataBinding> T R1(int i2, ViewGroup viewGroup) {
        T g2 = f.g(K(), i2, viewGroup, false);
        k.d(g2, "DataBindingUtil.inflate(…youtId, container, false)");
        g2.H(a0());
        return g2;
    }

    public void w0(Bundle bundle) {
        n.a.a.k("Starting " + getClass().getSimpleName(), new Object[0]);
        super.w0(bundle);
    }
}

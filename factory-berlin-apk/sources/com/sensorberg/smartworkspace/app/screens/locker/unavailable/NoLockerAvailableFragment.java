package com.sensorberg.smartworkspace.app.screens.locker.unavailable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.k.y0;
import java.util.HashMap;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/sensorberg/smartworkspace/app/screens/locker/unavailable/NoLockerAvailableFragment;", "Lcom/sensorberg/smartworkspace/app/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "<init>", "()V", "app_appCenterRelease"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: NoLockerAvailableFragment.kt */
public final class NoLockerAvailableFragment extends com.sensorberg.smartworkspace.app.a {
    private HashMap e0;

    /* compiled from: NoLockerAvailableFragment.kt */
    static final class a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ NoLockerAvailableFragment f7681g;

        a(NoLockerAvailableFragment noLockerAvailableFragment) {
            this.f7681g = noLockerAvailableFragment;
        }

        public final void onClick(View view) {
            androidx.navigation.fragment.a.a(this.f7681g).n(R.id.to_lockerGroupSelectionFragment);
        }
    }

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        y0 y0Var = (y0) com.sensorberg.smartworkspace.app.a.S1(this, R.layout.frag_no_locker_available, (ViewGroup) null, 2, (Object) null);
        y0Var.w.setOnClickListener(new a(this));
        return y0Var.s();
    }

    public /* synthetic */ void D0() {
        super.D0();
        Q1();
    }

    public void Q1() {
        HashMap hashMap = this.e0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}

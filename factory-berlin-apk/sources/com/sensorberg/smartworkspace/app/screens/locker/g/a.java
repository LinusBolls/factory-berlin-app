package com.sensorberg.smartworkspace.app.screens.locker.g;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sensorberg.factory.R;
import java.util.HashMap;
import kotlin.jvm.internal.k;

/* compiled from: LockerNoneNearbyFragment.kt */
public final class a extends com.sensorberg.smartworkspace.app.a {
    private HashMap e0;

    public View A0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.e(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.frag_locker_none_nearby, viewGroup, false);
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

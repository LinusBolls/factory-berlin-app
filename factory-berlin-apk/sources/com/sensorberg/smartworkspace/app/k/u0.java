package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.sensorberg.smartworkspace.app.screens.door.c;

/* compiled from: FragNearbyContainerBinding */
public abstract class u0 extends ViewDataBinding {
    public final TextView v;
    public final ViewPager w;
    public final SmartTabLayout x;
    protected c y;

    protected u0(Object obj, View view, int i2, TextView textView, ViewPager viewPager, SmartTabLayout smartTabLayout) {
        super(obj, view, i2);
        this.v = textView;
        this.w = viewPager;
        this.x = smartTabLayout;
    }

    public abstract void M(c cVar);
}

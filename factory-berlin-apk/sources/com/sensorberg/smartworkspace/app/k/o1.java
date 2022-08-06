package com.sensorberg.smartworkspace.app.k;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sensorberg.smartworkspace.app.activities.main.d;
import com.sensorberg.smartworkspace.app.widgets.BlockingProgressBar;

/* compiled from: SingleActivityBinding */
public abstract class o1 extends ViewDataBinding {
    protected d A;
    public final BottomNavigationView v;
    public final BlockingProgressBar w;
    public final FrameLayout x;
    public final ImageView y;
    public final ImageView z;

    protected o1(Object obj, View view, int i2, BottomNavigationView bottomNavigationView, BlockingProgressBar blockingProgressBar, FrameLayout frameLayout, ImageView imageView, ImageView imageView2) {
        super(obj, view, i2);
        this.v = bottomNavigationView;
        this.w = blockingProgressBar;
        this.x = frameLayout;
        this.y = imageView;
        this.z = imageView2;
    }

    public abstract void M(d dVar);
}

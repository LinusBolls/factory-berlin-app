package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: k  reason: collision with root package name */
    private final a f3616k = new a(this);

    public boolean E(View view) {
        return this.f3616k.a(view);
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f3616k.b(coordinatorLayout, view, motionEvent);
        return super.k(coordinatorLayout, view, motionEvent);
    }
}

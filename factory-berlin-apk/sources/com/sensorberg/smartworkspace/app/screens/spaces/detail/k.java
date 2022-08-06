package com.sensorberg.smartworkspace.app.screens.spaces.detail;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.screens.spaces.detail.q.h;
import kotlin.x;

/* compiled from: SpaceDetailItemDecorator.kt */
public final class k extends RecyclerView.n {
    private final Drawable a;
    private final int b;

    public k(Context context, int i2) {
        kotlin.jvm.internal.k.e(context, "context");
        this.b = i2;
        Drawable f2 = a.f(context, R.drawable.space_divider);
        kotlin.jvm.internal.k.c(f2);
        kotlin.jvm.internal.k.d(f2, "ContextCompat.getDrawabl…drawable.space_divider)!!");
        f2.setAlpha(com.sensorberg.smartworkspace.app.screens.spaces.a.a.c());
        x xVar = x.a;
        this.a = f2;
    }

    private final boolean n(RecyclerView recyclerView, View view, GridLayoutManager.b bVar, int i2) {
        if (!(recyclerView.getChildViewHolder(view) instanceof h) && bVar.e() + bVar.f() != i2) {
            return false;
        }
        return true;
    }

    public void m(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        kotlin.jvm.internal.k.e(canvas, "canvas");
        kotlin.jvm.internal.k.e(recyclerView, "recyclerView");
        kotlin.jvm.internal.k.e(a0Var, "state");
        int childCount = recyclerView.getChildCount() - 1;
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = recyclerView.getChildAt(i2);
            kotlin.jvm.internal.k.d(childAt, "recyclerView.getChildAt(index)");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                GridLayoutManager.b bVar = (GridLayoutManager.b) layoutParams;
                if (!n(recyclerView, childAt, bVar, this.b)) {
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    int right = childAt.getRight() + bVar.rightMargin;
                    this.a.setBounds(right, top, this.a.getIntrinsicWidth() + right + 5, bottom);
                    this.a.draw(canvas);
                }
                i2++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            }
        }
    }
}

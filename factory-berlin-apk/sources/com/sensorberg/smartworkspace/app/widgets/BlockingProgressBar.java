package com.sensorberg.smartworkspace.app.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import e.h.k.u;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\n\u0010\u000eB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0011B+\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/sensorberg/smartworkspace/app/widgets/BlockingProgressBar;", "Landroid/widget/FrameLayout;", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "widgets_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: BlockingProgressBar.kt */
public final class BlockingProgressBar extends FrameLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k.e(context, "context");
        u.l0(this, getResources().getDimension(h.blocking_progress_elevation));
        View view = new View(getContext());
        view.setBackgroundResource(g.colorDim);
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        int dimensionPixelSize = getResources().getDimensionPixelSize(h.blocking_progress_size);
        addView(progressBar, new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        k.e(motionEvent, "ev");
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        k.e(motionEvent, "ev");
        return true;
    }
}

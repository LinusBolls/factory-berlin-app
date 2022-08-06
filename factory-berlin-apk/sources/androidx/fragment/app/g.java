package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import e.l.c;
import java.util.ArrayList;

/* compiled from: FragmentContainerView */
public final class g extends FrameLayout {

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<View> f818g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<View> f819h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f820i = true;

    public g(Context context) {
        super(context);
    }

    private void a(View view) {
        ArrayList<View> arrayList;
        if (view.getAnimation() != null || ((arrayList = this.f819h) != null && arrayList.contains(view))) {
            if (this.f818g == null) {
                this.f818g = new ArrayList<>();
            }
            this.f818g.add(view);
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (m.k0(view) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (m.k0(view) != null) {
            return super.addViewInLayout(view, i2, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f820i && this.f818g != null) {
            for (int i2 = 0; i2 < this.f818g.size(); i2++) {
                super.drawChild(canvas, this.f818g.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList<View> arrayList;
        if (!this.f820i || (arrayList = this.f818g) == null || arrayList.size() <= 0 || !this.f818g.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f819h;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f818g;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f820i = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i2) {
        a(getChildAt(i2));
        super.removeViewAt(i2);
    }

    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    public void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z) {
        this.f820i = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f819h == null) {
                this.f819h = new ArrayList<>();
            }
            this.f819h.add(view);
        }
        super.startViewTransition(view);
    }

    g(Context context, AttributeSet attributeSet, m mVar) {
        super(context, attributeSet);
        String str;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.FragmentContainerView);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(c.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(c.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment W = mVar.W(id);
        if (classAttribute != null && W == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a = mVar.e0().a(context.getClassLoader(), classAttribute);
            a.I0(context, attributeSet, (Bundle) null);
            u i2 = mVar.i();
            i2.w(true);
            i2.d(this, a, string);
            i2.m();
        }
    }
}

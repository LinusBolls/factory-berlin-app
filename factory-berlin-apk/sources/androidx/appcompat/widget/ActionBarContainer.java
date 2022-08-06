package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import e.a.f;
import e.a.j;
import e.h.k.u;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: g  reason: collision with root package name */
    private boolean f294g;

    /* renamed from: h  reason: collision with root package name */
    private View f295h;

    /* renamed from: i  reason: collision with root package name */
    private View f296i;

    /* renamed from: j  reason: collision with root package name */
    private View f297j;

    /* renamed from: k  reason: collision with root package name */
    Drawable f298k;

    /* renamed from: l  reason: collision with root package name */
    Drawable f299l;

    /* renamed from: m  reason: collision with root package name */
    Drawable f300m;

    /* renamed from: n  reason: collision with root package name */
    boolean f301n;
    boolean o;
    private int p;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        u.h0(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionBar);
        this.f298k = obtainStyledAttributes.getDrawable(j.ActionBar_background);
        this.f299l = obtainStyledAttributes.getDrawable(j.ActionBar_backgroundStacked);
        this.p = obtainStyledAttributes.getDimensionPixelSize(j.ActionBar_height, -1);
        boolean z = true;
        if (getId() == f.split_action_bar) {
            this.f301n = true;
            this.f300m = obtainStyledAttributes.getDrawable(j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f301n ? !(this.f298k == null && this.f299l == null) : this.f300m != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f298k;
        if (drawable != null && drawable.isStateful()) {
            this.f298k.setState(getDrawableState());
        }
        Drawable drawable2 = this.f299l;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f299l.setState(getDrawableState());
        }
        Drawable drawable3 = this.f300m;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f300m.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f295h;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f298k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f299l;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f300m;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f296i = findViewById(f.action_bar);
        this.f297j = findViewById(f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f294g || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        super.onLayout(z, i2, i3, i4, i5);
        View view = this.f295h;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i6 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i2, (measuredHeight - view.getMeasuredHeight()) - i6, i4, measuredHeight - i6);
        }
        if (this.f301n) {
            Drawable drawable2 = this.f300m;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f298k != null) {
                if (this.f296i.getVisibility() == 0) {
                    this.f298k.setBounds(this.f296i.getLeft(), this.f296i.getTop(), this.f296i.getRight(), this.f296i.getBottom());
                } else {
                    View view2 = this.f297j;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f298k.setBounds(0, 0, 0, 0);
                    } else {
                        this.f298k.setBounds(this.f297j.getLeft(), this.f297j.getTop(), this.f297j.getRight(), this.f297j.getBottom());
                    }
                }
                z3 = true;
            }
            this.o = z4;
            if (!z4 || (drawable = this.f299l) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        if (this.f296i == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i5 = this.p) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i3)), RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i2, i3);
        if (this.f296i != null) {
            int mode = View.MeasureSpec.getMode(i3);
            View view = this.f295h;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!b(this.f296i)) {
                    i4 = a(this.f296i);
                } else {
                    i4 = !b(this.f297j) ? a(this.f297j) : 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i4 + a(this.f295h), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f298k;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f298k);
        }
        this.f298k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f296i;
            if (view != null) {
                this.f298k.setBounds(view.getLeft(), this.f296i.getTop(), this.f296i.getRight(), this.f296i.getBottom());
            }
        }
        boolean z = true;
        if (!this.f301n ? !(this.f298k == null && this.f299l == null) : this.f300m != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f300m;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f300m);
        }
        this.f300m = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f301n && (drawable2 = this.f300m) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f301n ? this.f298k == null && this.f299l == null : this.f300m == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f299l;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f299l);
        }
        this.f299l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.o && (drawable2 = this.f299l) != null) {
                drawable2.setBounds(this.f295h.getLeft(), this.f295h.getTop(), this.f295h.getRight(), this.f295h.getBottom());
            }
        }
        boolean z = true;
        if (!this.f301n ? !(this.f298k == null && this.f299l == null) : this.f300m != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(p0 p0Var) {
        View view = this.f295h;
        if (view != null) {
            removeView(view);
        }
        this.f295h = p0Var;
        if (p0Var != null) {
            addView(p0Var);
            ViewGroup.LayoutParams layoutParams = p0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            p0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f294g = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f298k;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f299l;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f300m;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f298k && !this.f301n) || (drawable == this.f299l && this.o) || ((drawable == this.f300m && this.f301n) || super.verifyDrawable(drawable));
    }
}

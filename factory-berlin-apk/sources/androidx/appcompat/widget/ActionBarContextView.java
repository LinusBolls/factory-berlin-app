package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import e.a.f;
import e.a.g;
import e.a.j;
import e.a.n.b;
import e.h.k.u;

public class ActionBarContextView extends a {
    private CharSequence o;
    private CharSequence p;
    private View q;
    private View r;
    private LinearLayout s;
    private TextView t;
    private TextView u;
    private int v;
    private int w;
    private boolean x;
    private int y;

    class a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f302g;

        a(ActionBarContextView actionBarContextView, b bVar) {
            this.f302g = bVar;
        }

        public void onClick(View view) {
            this.f302g.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void i() {
        if (this.s == null) {
            LayoutInflater.from(getContext()).inflate(g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.s = linearLayout;
            this.t = (TextView) linearLayout.findViewById(f.action_bar_title);
            this.u = (TextView) this.s.findViewById(f.action_bar_subtitle);
            if (this.v != 0) {
                this.t.setTextAppearance(getContext(), this.v);
            }
            if (this.w != 0) {
                this.u.setTextAppearance(getContext(), this.w);
            }
        }
        this.t.setText(this.o);
        this.u.setText(this.p);
        boolean z = !TextUtils.isEmpty(this.o);
        boolean z2 = !TextUtils.isEmpty(this.p);
        int i2 = 0;
        this.u.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.s;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.s.getParent() == null) {
            addView(this.s);
        }
    }

    public void g() {
        if (this.q == null) {
            k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.p;
    }

    public CharSequence getTitle() {
        return this.o;
    }

    public void h(b bVar) {
        View view = this.q;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.y, this, false);
            this.q = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.q);
        }
        this.q.findViewById(f.action_mode_close_button).setOnClickListener(new a(this, bVar));
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) bVar.e();
        c cVar = this.f374j;
        if (cVar != null) {
            cVar.z();
        }
        c cVar2 = new c(getContext());
        this.f374j = cVar2;
        cVar2.K(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.c(this.f374j, this.f372h);
        ActionMenuView actionMenuView = (ActionMenuView) this.f374j.q(this);
        this.f373i = actionMenuView;
        u.h0(actionMenuView, (Drawable) null);
        addView(this.f373i, layoutParams);
    }

    public boolean j() {
        return this.x;
    }

    public void k() {
        removeAllViews();
        this.r = null;
        this.f373i = null;
    }

    public boolean l() {
        c cVar = this.f374j;
        if (cVar != null) {
            return cVar.L();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f374j;
        if (cVar != null) {
            cVar.C();
            this.f374j.D();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.o);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean b = c1.b(this);
        int paddingRight = b ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.q;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q.getLayoutParams();
            int i6 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d2 = a.d(paddingRight, i6, b);
            paddingRight = a.d(d2 + e(this.q, d2, paddingTop, paddingTop2, b), i7, b);
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.s;
        if (!(linearLayout == null || this.r != null || linearLayout.getVisibility() == 8)) {
            i8 += e(this.s, i8, paddingTop, paddingTop2, b);
        }
        int i9 = i8;
        View view2 = this.r;
        if (view2 != null) {
            e(view2, i9, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f373i;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4 = 1073741824;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i3) != 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i5 = this.f375k;
            if (i5 <= 0) {
                i5 = View.MeasureSpec.getSize(i3);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i6 = i5 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, RecyclerView.UNDEFINED_DURATION);
            View view = this.q;
            if (view != null) {
                int c = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f373i;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f373i, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.s;
            if (linearLayout != null && this.r == null) {
                if (this.x) {
                    this.s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.s.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.s.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.r;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i7 = layoutParams.width != -2 ? 1073741824 : RecyclerView.UNDEFINED_DURATION;
                int i8 = layoutParams.width;
                if (i8 >= 0) {
                    paddingLeft = Math.min(i8, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i4 = RecyclerView.UNDEFINED_DURATION;
                }
                int i9 = layoutParams.height;
                if (i9 >= 0) {
                    i6 = Math.min(i9, i6);
                }
                this.r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i6, i4));
            }
            if (this.f375k <= 0) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i10) {
                        i10 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i10);
                return;
            }
            setMeasuredDimension(size, i5);
        } else {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i2) {
        this.f375k = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.r;
        if (view2 != null) {
            removeView(view2);
        }
        this.r = view;
        if (!(view == null || (linearLayout = this.s) == null)) {
            removeView(linearLayout);
            this.s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.p = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.o = charSequence;
        i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.x) {
            requestLayout();
        }
        this.x = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        w0 u2 = w0.u(context, attributeSet, j.ActionMode, i2, 0);
        u.h0(this, u2.g(j.ActionMode_background));
        this.v = u2.n(j.ActionMode_titleTextStyle, 0);
        this.w = u2.n(j.ActionMode_subtitleTextStyle, 0);
        this.f375k = u2.m(j.ActionMode_height, 0);
        this.y = u2.n(j.ActionMode_closeItemLayout, g.abc_action_mode_close_item_material);
        u2.v();
    }
}

package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.y0;
import e.h.k.s;
import e.h.k.u;
import g.b.a.c.d;
import g.b.a.c.e;
import g.b.a.c.f;
import g.b.a.c.h;
import g.b.a.c.n.b;

/* compiled from: BottomNavigationItemView */
public class a extends FrameLayout implements n.a {
    private static final int[] v = {16842912};

    /* renamed from: g  reason: collision with root package name */
    private final int f3416g;

    /* renamed from: h  reason: collision with root package name */
    private float f3417h;

    /* renamed from: i  reason: collision with root package name */
    private float f3418i;

    /* renamed from: j  reason: collision with root package name */
    private float f3419j;

    /* renamed from: k  reason: collision with root package name */
    private int f3420k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f3421l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public ImageView f3422m;

    /* renamed from: n  reason: collision with root package name */
    private final TextView f3423n;
    private final TextView o;
    private int p;
    private i q;
    private ColorStateList r;
    private Drawable s;
    private Drawable t;
    private g.b.a.c.n.a u;

    /* renamed from: com.google.android.material.bottomnavigation.a$a  reason: collision with other inner class name */
    /* compiled from: BottomNavigationItemView */
    class C0071a implements View.OnLayoutChangeListener {
        C0071a() {
        }

        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            if (a.this.f3422m.getVisibility() == 0) {
                a aVar = a.this;
                aVar.m(aVar.f3422m);
            }
        }
    }

    public a(Context context) {
        this(context, (AttributeSet) null);
    }

    private void c(float f2, float f3) {
        this.f3417h = f2 - f3;
        this.f3418i = (f3 * 1.0f) / f2;
        this.f3419j = (f2 * 1.0f) / f3;
    }

    private FrameLayout f(View view) {
        ImageView imageView = this.f3422m;
        if (view != imageView || !b.a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    private boolean g() {
        return this.u != null;
    }

    private void i(View view, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private void j(View view, float f2, float f3, int i2) {
        view.setScaleX(f2);
        view.setScaleY(f3);
        view.setVisibility(i2);
    }

    private void k(View view) {
        if (g() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            b.a(this.u, view, f(view));
        }
    }

    private void l(View view) {
        if (g()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                b.d(this.u, view, f(view));
            }
            this.u = null;
        }
    }

    /* access modifiers changed from: private */
    public void m(View view) {
        if (g()) {
            b.e(this.u, view, f(view));
        }
    }

    public boolean d() {
        return false;
    }

    public void e(i iVar, int i2) {
        CharSequence charSequence;
        this.q = iVar;
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitle());
        setId(iVar.getItemId());
        if (!TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(iVar.getContentDescription());
        }
        if (!TextUtils.isEmpty(iVar.getTooltipText())) {
            charSequence = iVar.getTooltipText();
        } else {
            charSequence = iVar.getTitle();
        }
        y0.a(this, charSequence);
        setVisibility(iVar.isVisible() ? 0 : 8);
    }

    /* access modifiers changed from: package-private */
    public g.b.a.c.n.a getBadge() {
        return this.u;
    }

    public i getItemData() {
        return this.q;
    }

    public int getItemPosition() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        l(this.f3422m);
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        i iVar = this.q;
        if (iVar != null && iVar.isCheckable() && this.q.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, v);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g.b.a.c.n.a aVar = this.u;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.q.getTitle();
            if (!TextUtils.isEmpty(this.q.getContentDescription())) {
                title = this.q.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(title + ", " + this.u.f());
        }
    }

    /* access modifiers changed from: package-private */
    public void setBadge(g.b.a.c.n.a aVar) {
        this.u = aVar;
        ImageView imageView = this.f3422m;
        if (imageView != null) {
            k(imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.o;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.o;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.f3423n;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.f3423n;
        textView4.setPivotY((float) textView4.getBaseline());
        int i2 = this.f3420k;
        if (i2 != -1) {
            if (i2 == 0) {
                if (z) {
                    i(this.f3422m, this.f3416g, 49);
                    j(this.o, 1.0f, 1.0f, 0);
                } else {
                    i(this.f3422m, this.f3416g, 17);
                    j(this.o, 0.5f, 0.5f, 4);
                }
                this.f3423n.setVisibility(4);
            } else if (i2 != 1) {
                if (i2 == 2) {
                    i(this.f3422m, this.f3416g, 17);
                    this.o.setVisibility(8);
                    this.f3423n.setVisibility(8);
                }
            } else if (z) {
                i(this.f3422m, (int) (((float) this.f3416g) + this.f3417h), 49);
                j(this.o, 1.0f, 1.0f, 0);
                TextView textView5 = this.f3423n;
                float f2 = this.f3418i;
                j(textView5, f2, f2, 4);
            } else {
                i(this.f3422m, this.f3416g, 49);
                TextView textView6 = this.o;
                float f3 = this.f3419j;
                j(textView6, f3, f3, 4);
                j(this.f3423n, 1.0f, 1.0f, 0);
            }
        } else if (this.f3421l) {
            if (z) {
                i(this.f3422m, this.f3416g, 49);
                j(this.o, 1.0f, 1.0f, 0);
            } else {
                i(this.f3422m, this.f3416g, 17);
                j(this.o, 0.5f, 0.5f, 4);
            }
            this.f3423n.setVisibility(4);
        } else if (z) {
            i(this.f3422m, (int) (((float) this.f3416g) + this.f3417h), 49);
            j(this.o, 1.0f, 1.0f, 0);
            TextView textView7 = this.f3423n;
            float f4 = this.f3418i;
            j(textView7, f4, f4, 4);
        } else {
            i(this.f3422m, this.f3416g, 49);
            TextView textView8 = this.o;
            float f5 = this.f3419j;
            j(textView8, f5, f5, 4);
            j(this.f3423n, 1.0f, 1.0f, 0);
        }
        refreshDrawableState();
        setSelected(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f3423n.setEnabled(z);
        this.o.setEnabled(z);
        this.f3422m.setEnabled(z);
        if (z) {
            u.s0(this, s.b(getContext(), 1002));
        } else {
            u.s0(this, (s) null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.s) {
            this.s = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                this.t = drawable;
                ColorStateList colorStateList = this.r;
                if (colorStateList != null) {
                    androidx.core.graphics.drawable.a.o(drawable, colorStateList);
                }
            }
            this.f3422m.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f3422m.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.f3422m.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.r = colorStateList;
        if (this.q != null && (drawable = this.t) != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            this.t.invalidateSelf();
        }
    }

    public void setItemBackground(int i2) {
        setItemBackground(i2 == 0 ? null : androidx.core.content.a.f(getContext(), i2));
    }

    public void setItemPosition(int i2) {
        this.p = i2;
    }

    public void setLabelVisibilityMode(int i2) {
        if (this.f3420k != i2) {
            this.f3420k = i2;
            if (this.q != null) {
                setChecked(this.q.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f3421l != z) {
            this.f3421l = z;
            if (this.q != null) {
                setChecked(this.q.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i2) {
        androidx.core.widget.i.n(this.o, i2);
        c(this.f3423n.getTextSize(), this.o.getTextSize());
    }

    public void setTextAppearanceInactive(int i2) {
        androidx.core.widget.i.n(this.f3423n, i2);
        c(this.f3423n.getTextSize(), this.o.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f3423n.setTextColor(colorStateList);
            this.o.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f3423n.setText(charSequence);
        this.o.setText(charSequence);
        i iVar = this.q;
        if (iVar == null || TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        i iVar2 = this.q;
        if (iVar2 != null && !TextUtils.isEmpty(iVar2.getTooltipText())) {
            charSequence = this.q.getTooltipText();
        }
        y0.a(this, charSequence);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.p = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(h.design_bottom_navigation_item, this, true);
        setBackgroundResource(e.design_bottom_navigation_item_background);
        this.f3416g = resources.getDimensionPixelSize(d.design_bottom_navigation_margin);
        this.f3422m = (ImageView) findViewById(f.icon);
        this.f3423n = (TextView) findViewById(f.smallLabel);
        this.o = (TextView) findViewById(f.largeLabel);
        u.o0(this.f3423n, 2);
        u.o0(this.o, 2);
        setFocusable(true);
        c(this.f3423n.getTextSize(), this.o.getTextSize());
        ImageView imageView = this.f3422m;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new C0071a());
        }
        u.e0(this, (e.h.k.a) null);
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        u.h0(this, drawable);
    }
}

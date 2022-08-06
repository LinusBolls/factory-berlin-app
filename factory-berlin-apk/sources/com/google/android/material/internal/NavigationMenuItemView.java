package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.y0;
import e.h.k.d0.c;
import e.h.k.u;
import g.b.a.c.d;
import g.b.a.c.e;
import g.b.a.c.f;
import g.b.a.c.h;

public class NavigationMenuItemView extends d implements n.a {
    private static final int[] L = {16842912};
    private int B;
    private boolean C;
    boolean D;
    private final CheckedTextView E;
    private FrameLayout F;
    private i G;
    private ColorStateList H;
    private boolean I;
    private Drawable J;
    private final e.h.k.a K;

    class a extends e.h.k.a {
        a() {
        }

        public void g(View view, c cVar) {
            super.g(view, cVar);
            cVar.U(NavigationMenuItemView.this.D);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (D()) {
            this.E.setVisibility(8);
            FrameLayout frameLayout = this.F;
            if (frameLayout != null) {
                i0.a aVar = (i0.a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.F.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.E.setVisibility(0);
        FrameLayout frameLayout2 = this.F;
        if (frameLayout2 != null) {
            i0.a aVar2 = (i0.a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.F.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(e.a.a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(L, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.G.getTitle() == null && this.G.getIcon() == null && this.G.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.F == null) {
                this.F = (FrameLayout) ((ViewStub) findViewById(f.design_menu_item_action_area_stub)).inflate();
            }
            this.F.removeAllViews();
            this.F.addView(view);
        }
    }

    public boolean d() {
        return false;
    }

    public void e(i iVar, int i2) {
        this.G = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            u.h0(this, C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        y0.a(this, iVar.getTooltipText());
        B();
    }

    public i getItemData() {
        return this.G;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        i iVar = this.G;
        if (iVar != null && iVar.isCheckable() && this.G.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, L);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.D != z) {
            this.D = z;
            this.K.l(this.E, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.E.setChecked(z);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, 0, i2, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.I) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.H);
            }
            int i2 = this.B;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.C) {
            if (this.J == null) {
                Drawable a2 = androidx.core.content.c.f.a(getResources(), e.navigation_empty_icon, getContext().getTheme());
                this.J = a2;
                if (a2 != null) {
                    int i3 = this.B;
                    a2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.J;
        }
        androidx.core.widget.i.i(this.E, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i2) {
        this.E.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.B = i2;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.H = colorStateList;
        this.I = colorStateList != null;
        i iVar = this.G;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.E.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.C = z;
    }

    public void setTextAppearance(int i2) {
        androidx.core.widget.i.n(this.E, i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.E.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.K = new a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(h.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(f.design_menu_item_text);
        this.E = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        u.e0(this.E, this.K);
    }
}

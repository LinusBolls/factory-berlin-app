package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.material.internal.i;
import g.b.a.c.k;
import g.b.a.c.l;

public class ChipGroup extends com.google.android.material.internal.c {

    /* renamed from: j  reason: collision with root package name */
    private int f3484j;

    /* renamed from: k  reason: collision with root package name */
    private int f3485k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public boolean f3486l;

    /* renamed from: m  reason: collision with root package name */
    private d f3487m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final b f3488n;
    private e o;
    /* access modifiers changed from: private */
    public int p;
    /* access modifiers changed from: private */
    public boolean q;

    private class b implements CompoundButton.OnCheckedChangeListener {
        private b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.q) {
                int id = compoundButton.getId();
                if (z) {
                    if (!(ChipGroup.this.p == -1 || ChipGroup.this.p == id || !ChipGroup.this.f3486l)) {
                        ChipGroup chipGroup = ChipGroup.this;
                        chipGroup.k(chipGroup.p, false);
                    }
                    ChipGroup.this.setCheckedId(id);
                } else if (ChipGroup.this.p == id) {
                    ChipGroup.this.setCheckedId(-1);
                }
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i2, int i3) {
            super(i2, i3);
        }
    }

    public interface d {
        void a(ChipGroup chipGroup, int i2);
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f3489g;

        private e() {
        }

        public void onChildViewAdded(View view, View view2) {
            int i2;
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        i2 = View.generateViewId();
                    } else {
                        i2 = view2.hashCode();
                    }
                    view2.setId(i2);
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f3488n);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f3489g;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f3489g;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.b.a.c.b.chipGroupStyle);
    }

    /* access modifiers changed from: private */
    public void k(int i2, boolean z) {
        View findViewById = findViewById(i2);
        if (findViewById instanceof Chip) {
            this.q = true;
            ((Chip) findViewById).setChecked(z);
            this.q = false;
        }
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i2) {
        this.p = i2;
        d dVar = this.f3487m;
        if (dVar != null && this.f3486l) {
            dVar.a(this, i2);
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i3 = this.p;
                if (i3 != -1 && this.f3486l) {
                    k(i3, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i2, layoutParams);
    }

    public boolean b() {
        return super.b();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f3486l) {
            return this.p;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.f3484j;
    }

    public int getChipSpacingVertical() {
        return this.f3485k;
    }

    public void j() {
        this.q = true;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.q = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.p;
        if (i2 != -1) {
            k(i2, true);
            setCheckedId(this.p);
        }
    }

    public void setChipSpacing(int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingHorizontal(int i2) {
        if (this.f3484j != i2) {
            this.f3484j = i2;
            setItemSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingResource(int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingVertical(int i2) {
        if (this.f3485k != i2) {
            this.f3485k = i2;
            setLineSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(d dVar) {
        this.f3487m = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.o.f3489g = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.f3486l != z) {
            this.f3486l = z;
            j();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3488n = new b();
        this.o = new e();
        this.p = -1;
        this.q = false;
        TypedArray k2 = i.k(context, attributeSet, l.ChipGroup, i2, k.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = k2.getDimensionPixelOffset(l.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(k2.getDimensionPixelOffset(l.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(k2.getDimensionPixelOffset(l.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(k2.getBoolean(l.ChipGroup_singleLine, false));
        setSingleSelection(k2.getBoolean(l.ChipGroup_singleSelection, false));
        int resourceId = k2.getResourceId(l.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.p = resourceId;
        }
        k2.recycle();
        super.setOnHierarchyChangeListener(this.o);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(int i2) {
        setSingleLine(getResources().getBoolean(i2));
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}

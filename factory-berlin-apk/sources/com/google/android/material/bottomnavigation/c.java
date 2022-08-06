package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.h;
import e.h.j.e;
import e.h.k.u;
import e.u.b;
import e.u.o;
import e.u.q;
import g.b.a.c.d;
import java.util.HashSet;

/* compiled from: BottomNavigationMenuView */
public class c extends ViewGroup implements n {
    private static final int[] F = {16842912};
    private static final int[] G = {-16842910};
    private int A;
    private int[] B;
    private SparseArray<g.b.a.c.n.a> C;
    /* access modifiers changed from: private */
    public d D;
    /* access modifiers changed from: private */
    public g E;

    /* renamed from: g  reason: collision with root package name */
    private final q f3424g;

    /* renamed from: h  reason: collision with root package name */
    private final int f3425h;

    /* renamed from: i  reason: collision with root package name */
    private final int f3426i;

    /* renamed from: j  reason: collision with root package name */
    private final int f3427j;

    /* renamed from: k  reason: collision with root package name */
    private final int f3428k;

    /* renamed from: l  reason: collision with root package name */
    private final int f3429l;

    /* renamed from: m  reason: collision with root package name */
    private final View.OnClickListener f3430m;

    /* renamed from: n  reason: collision with root package name */
    private final e<a> f3431n;
    private boolean o;
    private int p;
    private a[] q;
    private int r;
    private int s;
    private ColorStateList t;
    private int u;
    private ColorStateList v;
    private final ColorStateList w;
    private int x;
    private int y;
    private Drawable z;

    /* compiled from: BottomNavigationMenuView */
    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            i itemData = ((a) view).getItemData();
            if (!c.this.E.O(itemData, c.this.D, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public c(Context context) {
        this(context, (AttributeSet) null);
    }

    private boolean g(int i2, int i3) {
        if (i2 == -1) {
            if (i3 > 3) {
                return true;
            }
        } else if (i2 == 0) {
            return true;
        }
        return false;
    }

    private a getNewItem() {
        a b = this.f3431n.b();
        return b == null ? new a(getContext()) : b;
    }

    private boolean h(int i2) {
        return i2 != -1;
    }

    private void i() {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            hashSet.add(Integer.valueOf(this.E.getItem(i2).getItemId()));
        }
        for (int i3 = 0; i3 < this.C.size(); i3++) {
            int keyAt = this.C.keyAt(i3);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.C.delete(keyAt);
            }
        }
    }

    private void setBadgeIfNeeded(a aVar) {
        g.b.a.c.n.a aVar2;
        int id = aVar.getId();
        if (h(id) && (aVar2 = this.C.get(id)) != null) {
            aVar.setBadge(aVar2);
        }
    }

    public void b(g gVar) {
        this.E = gVar;
    }

    public void d() {
        removeAllViews();
        a[] aVarArr = this.q;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                if (aVar != null) {
                    this.f3431n.a(aVar);
                    aVar.h();
                }
            }
        }
        if (this.E.size() == 0) {
            this.r = 0;
            this.s = 0;
            this.q = null;
            return;
        }
        i();
        this.q = new a[this.E.size()];
        boolean g2 = g(this.p, this.E.G().size());
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            this.D.h(true);
            this.E.getItem(i2).setCheckable(true);
            this.D.h(false);
            a newItem = getNewItem();
            this.q[i2] = newItem;
            newItem.setIconTintList(this.t);
            newItem.setIconSize(this.u);
            newItem.setTextColor(this.w);
            newItem.setTextAppearanceInactive(this.x);
            newItem.setTextAppearanceActive(this.y);
            newItem.setTextColor(this.v);
            Drawable drawable = this.z;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.A);
            }
            newItem.setShifting(g2);
            newItem.setLabelVisibilityMode(this.p);
            newItem.e((i) this.E.getItem(i2), 0);
            newItem.setItemPosition(i2);
            newItem.setOnClickListener(this.f3430m);
            if (this.r != 0 && this.E.getItem(i2).getItemId() == this.r) {
                this.s = i2;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.E.size() - 1, this.s);
        this.s = min;
        this.E.getItem(min).setChecked(true);
    }

    public ColorStateList e(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList c = e.a.k.a.a.c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(e.a.a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = c.getDefaultColor();
        return new ColorStateList(new int[][]{G, F, ViewGroup.EMPTY_STATE_SET}, new int[]{c.getColorForState(G, defaultColor), i3, defaultColor});
    }

    public boolean f() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public SparseArray<g.b.a.c.n.a> getBadgeDrawables() {
        return this.C;
    }

    public ColorStateList getIconTintList() {
        return this.t;
    }

    public Drawable getItemBackground() {
        a[] aVarArr = this.q;
        if (aVarArr == null || aVarArr.length <= 0) {
            return this.z;
        }
        return aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.A;
    }

    public int getItemIconSize() {
        return this.u;
    }

    public int getItemTextAppearanceActive() {
        return this.y;
    }

    public int getItemTextAppearanceInactive() {
        return this.x;
    }

    public ColorStateList getItemTextColor() {
        return this.v;
    }

    public int getLabelVisibilityMode() {
        return this.p;
    }

    public int getSelectedItemId() {
        return this.r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void j(int i2) {
        int size = this.E.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = this.E.getItem(i3);
            if (i2 == item.getItemId()) {
                this.r = i2;
                this.s = i3;
                item.setChecked(true);
                return;
            }
        }
    }

    public void k() {
        g gVar = this.E;
        if (gVar != null && this.q != null) {
            int size = gVar.size();
            if (size != this.q.length) {
                d();
                return;
            }
            int i2 = this.r;
            for (int i3 = 0; i3 < size; i3++) {
                MenuItem item = this.E.getItem(i3);
                if (item.isChecked()) {
                    this.r = item.getItemId();
                    this.s = i3;
                }
            }
            if (i2 != this.r) {
                o.a(this, this.f3424g);
            }
            boolean g2 = g(this.p, this.E.G().size());
            for (int i4 = 0; i4 < size; i4++) {
                this.D.h(true);
                this.q[i4].setLabelVisibilityMode(this.p);
                this.q[i4].setShifting(g2);
                this.q[i4].e((i) this.E.getItem(i4), 0);
                this.D.h(false);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                if (u.x(this) == 1) {
                    int i10 = i6 - i8;
                    childAt.layout(i10 - childAt.getMeasuredWidth(), 0, i10, i7);
                } else {
                    childAt.layout(i8, 0, childAt.getMeasuredWidth() + i8, i7);
                }
                i8 += childAt.getMeasuredWidth();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.E.G().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f3429l, 1073741824);
        if (!g(this.p, size2) || !this.o) {
            int min = Math.min(size / (size2 == 0 ? 1 : size2), this.f3427j);
            int i4 = size - (size2 * min);
            for (int i5 = 0; i5 < childCount; i5++) {
                if (getChildAt(i5).getVisibility() != 8) {
                    int[] iArr = this.B;
                    iArr[i5] = min;
                    if (i4 > 0) {
                        iArr[i5] = iArr[i5] + 1;
                        i4--;
                    }
                } else {
                    this.B[i5] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.s);
            int i6 = this.f3428k;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f3427j, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
                i6 = Math.max(i6, childAt.getMeasuredWidth());
            }
            int i7 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.f3426i * i7), Math.min(i6, this.f3427j));
            int i8 = size - min2;
            int min3 = Math.min(i8 / (i7 == 0 ? 1 : i7), this.f3425h);
            int i9 = i8 - (i7 * min3);
            int i10 = 0;
            while (i10 < childCount) {
                if (getChildAt(i10).getVisibility() != 8) {
                    this.B[i10] = i10 == this.s ? min2 : min3;
                    if (i9 > 0) {
                        int[] iArr2 = this.B;
                        iArr2[i10] = iArr2[i10] + 1;
                        i9--;
                    }
                } else {
                    this.B[i10] = 0;
                }
                i10++;
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.B[i12], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i11 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i11, View.MeasureSpec.makeMeasureSpec(i11, 1073741824), 0), View.resolveSizeAndState(this.f3429l, makeMeasureSpec, 0));
    }

    /* access modifiers changed from: package-private */
    public void setBadgeDrawables(SparseArray<g.b.a.c.n.a> sparseArray) {
        this.C = sparseArray;
        a[] aVarArr = this.q;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.setBadge(sparseArray.get(aVar.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        a[] aVarArr = this.q;
        if (aVarArr != null) {
            for (a iconTintList : aVarArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.z = drawable;
        a[] aVarArr = this.q;
        if (aVarArr != null) {
            for (a itemBackground : aVarArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i2) {
        this.A = i2;
        a[] aVarArr = this.q;
        if (aVarArr != null) {
            for (a itemBackground : aVarArr) {
                itemBackground.setItemBackground(i2);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z2) {
        this.o = z2;
    }

    public void setItemIconSize(int i2) {
        this.u = i2;
        a[] aVarArr = this.q;
        if (aVarArr != null) {
            for (a iconSize : aVarArr) {
                iconSize.setIconSize(i2);
            }
        }
    }

    public void setItemTextAppearanceActive(int i2) {
        this.y = i2;
        a[] aVarArr = this.q;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i2);
                ColorStateList colorStateList = this.v;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i2) {
        this.x = i2;
        a[] aVarArr = this.q;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i2);
                ColorStateList colorStateList = this.v;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.v = colorStateList;
        a[] aVarArr = this.q;
        if (aVarArr != null) {
            for (a textColor : aVarArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i2) {
        this.p = i2;
    }

    public void setPresenter(d dVar) {
        this.D = dVar;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3431n = new e.h.j.g(5);
        this.r = 0;
        this.s = 0;
        this.C = new SparseArray<>(5);
        Resources resources = getResources();
        this.f3425h = resources.getDimensionPixelSize(d.design_bottom_navigation_item_max_width);
        this.f3426i = resources.getDimensionPixelSize(d.design_bottom_navigation_item_min_width);
        this.f3427j = resources.getDimensionPixelSize(d.design_bottom_navigation_active_item_max_width);
        this.f3428k = resources.getDimensionPixelSize(d.design_bottom_navigation_active_item_min_width);
        this.f3429l = resources.getDimensionPixelSize(d.design_bottom_navigation_height);
        this.w = e(16842808);
        b bVar = new b();
        this.f3424g = bVar;
        bVar.B0(0);
        this.f3424g.z0(115);
        this.f3424g.h0(new e.m.a.a.b());
        this.f3424g.s0(new h());
        this.f3430m = new a();
        this.B = new int[5];
    }
}

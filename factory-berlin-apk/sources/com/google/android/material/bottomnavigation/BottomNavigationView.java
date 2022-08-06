package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.w0;
import com.google.android.material.internal.i;
import com.google.android.material.internal.j;
import e.h.k.c0;
import e.h.k.u;
import g.b.a.c.c0.h;
import g.b.a.c.k;
import g.b.a.c.l;

public class BottomNavigationView extends FrameLayout {

    /* renamed from: n  reason: collision with root package name */
    private static final int f3406n = k.Widget_Design_BottomNavigationView;

    /* renamed from: g  reason: collision with root package name */
    private final g f3407g;

    /* renamed from: h  reason: collision with root package name */
    final c f3408h;

    /* renamed from: i  reason: collision with root package name */
    private final d f3409i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f3410j;

    /* renamed from: k  reason: collision with root package name */
    private MenuInflater f3411k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public d f3412l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public c f3413m;

    class a implements g.a {
        a() {
        }

        public boolean a(g gVar, MenuItem menuItem) {
            if (BottomNavigationView.this.f3413m != null && menuItem.getItemId() == BottomNavigationView.this.getSelectedItemId()) {
                BottomNavigationView.this.f3413m.a(menuItem);
                return true;
            } else if (BottomNavigationView.this.f3412l == null || BottomNavigationView.this.f3412l.a(menuItem)) {
                return false;
            } else {
                return true;
            }
        }

        public void b(g gVar) {
        }
    }

    class b implements j.c {
        b(BottomNavigationView bottomNavigationView) {
        }

        public c0 a(View view, c0 c0Var, j.d dVar) {
            dVar.f3614d += c0Var.d();
            dVar.a(view);
            return c0Var;
        }
    }

    public interface c {
        void a(MenuItem menuItem);
    }

    public interface d {
        boolean a(MenuItem menuItem);
    }

    static class e extends e.j.a.a {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        Bundle f3415i;

        static class a implements Parcelable.ClassLoaderCreator<e> {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            /* renamed from: c */
            public e[] newArray(int i2) {
                return new e[i2];
            }
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel, ClassLoader classLoader) {
            this.f3415i = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeBundle(this.f3415i);
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? e.class.getClassLoader() : classLoader);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.b.a.c.b.bottomNavigationStyle);
    }

    private void c(Context context) {
        View view = new View(context);
        view.setBackgroundColor(androidx.core.content.a.c(context, g.b.a.c.c.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(g.b.a.c.d.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private void d() {
        j.a(this, new b(this));
    }

    private g.b.a.c.c0.g e(Context context) {
        g.b.a.c.c0.g gVar = new g.b.a.c.c0.g();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            gVar.U(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        gVar.L(context);
        return gVar;
    }

    private MenuInflater getMenuInflater() {
        if (this.f3411k == null) {
            this.f3411k = new e.a.n.g(getContext());
        }
        return this.f3411k;
    }

    public void f(int i2) {
        this.f3409i.h(true);
        getMenuInflater().inflate(i2, this.f3407g);
        this.f3409i.h(false);
        this.f3409i.g(true);
    }

    public Drawable getItemBackground() {
        return this.f3408h.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f3408h.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f3408h.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f3408h.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.f3410j;
    }

    public int getItemTextAppearanceActive() {
        return this.f3408h.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f3408h.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f3408h.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f3408h.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f3407g;
    }

    public int getSelectedItemId() {
        return this.f3408h.getSelectedItemId();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.a());
        this.f3407g.S(eVar.f3415i);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        eVar.f3415i = bundle;
        this.f3407g.U(bundle);
        return eVar;
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        h.d(this, f2);
    }

    public void setItemBackground(Drawable drawable) {
        this.f3408h.setItemBackground(drawable);
        this.f3410j = null;
    }

    public void setItemBackgroundResource(int i2) {
        this.f3408h.setItemBackgroundRes(i2);
        this.f3410j = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.f3408h.f() != z) {
            this.f3408h.setItemHorizontalTranslationEnabled(z);
            this.f3409i.g(false);
        }
    }

    public void setItemIconSize(int i2) {
        this.f3408h.setItemIconSize(i2);
    }

    public void setItemIconSizeRes(int i2) {
        setItemIconSize(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f3408h.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f3410j != colorStateList) {
            this.f3410j = colorStateList;
            if (colorStateList == null) {
                this.f3408h.setItemBackground((Drawable) null);
                return;
            }
            ColorStateList a2 = g.b.a.c.a0.b.a(colorStateList);
            if (Build.VERSION.SDK_INT >= 21) {
                this.f3408h.setItemBackground(new RippleDrawable(a2, (Drawable) null, (Drawable) null));
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(1.0E-5f);
            Drawable r = androidx.core.graphics.drawable.a.r(gradientDrawable);
            androidx.core.graphics.drawable.a.o(r, a2);
            this.f3408h.setItemBackground(r);
        } else if (colorStateList == null && this.f3408h.getItemBackground() != null) {
            this.f3408h.setItemBackground((Drawable) null);
        }
    }

    public void setItemTextAppearanceActive(int i2) {
        this.f3408h.setItemTextAppearanceActive(i2);
    }

    public void setItemTextAppearanceInactive(int i2) {
        this.f3408h.setItemTextAppearanceInactive(i2);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f3408h.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i2) {
        if (this.f3408h.getLabelVisibilityMode() != i2) {
            this.f3408h.setLabelVisibilityMode(i2);
            this.f3409i.g(false);
        }
    }

    public void setOnNavigationItemReselectedListener(c cVar) {
        this.f3413m = cVar;
    }

    public void setOnNavigationItemSelectedListener(d dVar) {
        this.f3412l = dVar;
    }

    public void setSelectedItemId(int i2) {
        MenuItem findItem = this.f3407g.findItem(i2);
        if (findItem != null && !this.f3407g.O(findItem, this.f3409i, 0)) {
            findItem.setChecked(true);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i2) {
        super(i.f(context, attributeSet, i2, f3406n), attributeSet, i2);
        this.f3409i = new d();
        Context context2 = getContext();
        this.f3407g = new b(context2);
        this.f3408h = new c(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f3408h.setLayoutParams(layoutParams);
        this.f3409i.c(this.f3408h);
        this.f3409i.e(1);
        this.f3408h.setPresenter(this.f3409i);
        this.f3407g.b(this.f3409i);
        this.f3409i.b(getContext(), this.f3407g);
        w0 l2 = i.l(context2, attributeSet, l.BottomNavigationView, i2, k.Widget_Design_BottomNavigationView, l.BottomNavigationView_itemTextAppearanceInactive, l.BottomNavigationView_itemTextAppearanceActive);
        if (l2.r(l.BottomNavigationView_itemIconTint)) {
            this.f3408h.setIconTintList(l2.c(l.BottomNavigationView_itemIconTint));
        } else {
            c cVar = this.f3408h;
            cVar.setIconTintList(cVar.e(16842808));
        }
        setItemIconSize(l2.f(l.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(g.b.a.c.d.design_bottom_navigation_icon_size)));
        if (l2.r(l.BottomNavigationView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(l2.n(l.BottomNavigationView_itemTextAppearanceInactive, 0));
        }
        if (l2.r(l.BottomNavigationView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(l2.n(l.BottomNavigationView_itemTextAppearanceActive, 0));
        }
        if (l2.r(l.BottomNavigationView_itemTextColor)) {
            setItemTextColor(l2.c(l.BottomNavigationView_itemTextColor));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            u.h0(this, e(context2));
        }
        if (l2.r(l.BottomNavigationView_elevation)) {
            u.l0(this, (float) l2.f(l.BottomNavigationView_elevation, 0));
        }
        androidx.core.graphics.drawable.a.o(getBackground().mutate(), g.b.a.c.z.c.b(context2, l2, l.BottomNavigationView_backgroundTint));
        setLabelVisibilityMode(l2.l(l.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(l2.a(l.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int n2 = l2.n(l.BottomNavigationView_itemBackground, 0);
        if (n2 != 0) {
            this.f3408h.setItemBackgroundRes(n2);
        } else {
            setItemRippleColor(g.b.a.c.z.c.b(context2, l2, l.BottomNavigationView_itemRippleColor));
        }
        if (l2.r(l.BottomNavigationView_menu)) {
            f(l2.n(l.BottomNavigationView_menu, 0));
        }
        l2.v();
        addView(this.f3408h, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            c(context2);
        }
        this.f3407g.V(new a());
        d();
    }
}

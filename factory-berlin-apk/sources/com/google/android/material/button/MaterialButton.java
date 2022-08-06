package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import androidx.core.widget.i;
import com.google.android.material.internal.j;
import e.h.k.u;
import g.b.a.c.c0.h;
import g.b.a.c.c0.n;
import g.b.a.c.k;
import g.b.a.c.l;
import g.b.a.c.z.c;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends f implements Checkable, n {
    private static final int[] u = {16842911};
    private static final int[] v = {16842912};
    private static final int w = k.Widget_MaterialComponents_Button;

    /* renamed from: i  reason: collision with root package name */
    private final a f3462i;

    /* renamed from: j  reason: collision with root package name */
    private final LinkedHashSet<a> f3463j;

    /* renamed from: k  reason: collision with root package name */
    private b f3464k;

    /* renamed from: l  reason: collision with root package name */
    private PorterDuff.Mode f3465l;

    /* renamed from: m  reason: collision with root package name */
    private ColorStateList f3466m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f3467n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private int t;

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.b.a.c.b.materialButtonStyle);
    }

    private boolean b() {
        return u.x(this) == 1;
    }

    private boolean c() {
        a aVar = this.f3462i;
        return aVar != null && !aVar.m();
    }

    private void d(boolean z) {
        if (z) {
            i.i(this, this.f3467n, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            i.i(this, (Drawable) null, (Drawable) null, this.f3467n, (Drawable) null);
        }
    }

    private void e(boolean z) {
        Drawable drawable = this.f3467n;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.f3467n = mutate;
            androidx.core.graphics.drawable.a.o(mutate, this.f3466m);
            PorterDuff.Mode mode = this.f3465l;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.f3467n, mode);
            }
            int i2 = this.o;
            if (i2 == 0) {
                i2 = this.f3467n.getIntrinsicWidth();
            }
            int i3 = this.o;
            if (i3 == 0) {
                i3 = this.f3467n.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f3467n;
            int i4 = this.p;
            drawable2.setBounds(i4, 0, i2 + i4, i3);
        }
        int i5 = this.t;
        boolean z3 = i5 == 1 || i5 == 2;
        if (z) {
            d(z3);
            return;
        }
        Drawable[] a2 = i.a(this);
        Drawable drawable3 = a2[0];
        Drawable drawable4 = a2[2];
        if ((z3 && drawable3 != this.f3467n) || (!z3 && drawable4 != this.f3467n)) {
            z2 = true;
        }
        if (z2) {
            d(z3);
        }
    }

    private void f() {
        if (this.f3467n != null && getLayout() != null) {
            int i2 = this.t;
            boolean z = true;
            if (i2 == 1 || i2 == 3) {
                this.p = 0;
                e(false);
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i3 = this.o;
            if (i3 == 0) {
                i3 = this.f3467n.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - u.B(this)) - i3) - this.q) - u.C(this)) / 2;
            boolean b2 = b();
            if (this.t != 4) {
                z = false;
            }
            if (b2 != z) {
                measuredWidth = -measuredWidth;
            }
            if (this.p != measuredWidth) {
                this.p = measuredWidth;
                e(false);
            }
        }
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    public boolean a() {
        a aVar = this.f3462i;
        return aVar != null && aVar.n();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (c()) {
            return this.f3462i.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f3467n;
    }

    public int getIconGravity() {
        return this.t;
    }

    public int getIconPadding() {
        return this.q;
    }

    public int getIconSize() {
        return this.o;
    }

    public ColorStateList getIconTint() {
        return this.f3466m;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3465l;
    }

    public ColorStateList getRippleColor() {
        if (c()) {
            return this.f3462i.f();
        }
        return null;
    }

    public g.b.a.c.c0.k getShapeAppearanceModel() {
        if (c()) {
            return this.f3462i.g();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (c()) {
            return this.f3462i.h();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (c()) {
            return this.f3462i.i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (c()) {
            return this.f3462i.j();
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (c()) {
            return this.f3462i.k();
        }
        return super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.r;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.f3462i.d());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, u);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, v);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        a aVar;
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f3462i) != null) {
            aVar.B(i5 - i3, i4 - i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        f();
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        f();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (c()) {
            this.f3462i.p(i2);
        } else {
            super.setBackgroundColor(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!c()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
            this.f3462i.q();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? e.a.k.a.a.d(getContext(), i2) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (c()) {
            this.f3462i.r(z);
        }
    }

    public void setChecked(boolean z) {
        if (a() && isEnabled() && this.r != z) {
            this.r = z;
            refreshDrawableState();
            if (!this.s) {
                this.s = true;
                Iterator it = this.f3463j.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(this, this.r);
                }
                this.s = false;
            }
        }
    }

    public void setCornerRadius(int i2) {
        if (c()) {
            this.f3462i.s(i2);
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        if (c()) {
            this.f3462i.d().T(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f3467n != drawable) {
            this.f3467n = drawable;
            e(true);
        }
    }

    public void setIconGravity(int i2) {
        if (this.t != i2) {
            this.t = i2;
            f();
        }
    }

    public void setIconPadding(int i2) {
        if (this.q != i2) {
            this.q = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? e.a.k.a.a.d(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.o != i2) {
            this.o = i2;
            e(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f3466m != colorStateList) {
            this.f3466m = colorStateList;
            e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f3465l != mode) {
            this.f3465l = mode;
            e(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(e.a.k.a.a.c(getContext(), i2));
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f3464k = bVar;
    }

    public void setPressed(boolean z) {
        b bVar = this.f3464k;
        if (bVar != null) {
            bVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (c()) {
            this.f3462i.t(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        if (c()) {
            setRippleColor(e.a.k.a.a.c(getContext(), i2));
        }
    }

    public void setShapeAppearanceModel(g.b.a.c.c0.k kVar) {
        if (c()) {
            this.f3462i.u(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (c()) {
            this.f3462i.v(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (c()) {
            this.f3462i.w(colorStateList);
        }
    }

    public void setStrokeColorResource(int i2) {
        if (c()) {
            setStrokeColor(e.a.k.a.a.c(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (c()) {
            this.f3462i.x(i2);
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (c()) {
            this.f3462i.y(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (c()) {
            this.f3462i.z(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.r);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i2) {
        super(com.google.android.material.internal.i.f(context, attributeSet, i2, w), attributeSet, i2);
        this.f3463j = new LinkedHashSet<>();
        boolean z = false;
        this.r = false;
        this.s = false;
        Context context2 = getContext();
        TypedArray k2 = com.google.android.material.internal.i.k(context2, attributeSet, l.MaterialButton, i2, w, new int[0]);
        this.q = k2.getDimensionPixelSize(l.MaterialButton_iconPadding, 0);
        this.f3465l = j.d(k2.getInt(l.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f3466m = c.a(getContext(), k2, l.MaterialButton_iconTint);
        this.f3467n = c.d(getContext(), k2, l.MaterialButton_icon);
        this.t = k2.getInteger(l.MaterialButton_iconGravity, 1);
        this.o = k2.getDimensionPixelSize(l.MaterialButton_iconSize, 0);
        a aVar = new a(this, g.b.a.c.c0.k.e(context2, attributeSet, i2, w).m());
        this.f3462i = aVar;
        aVar.o(k2);
        k2.recycle();
        setCompoundDrawablePadding(this.q);
        e(this.f3467n != null ? true : z);
    }
}
